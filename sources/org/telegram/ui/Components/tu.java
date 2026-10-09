package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class tu extends EditText {
    private static final int SPOILER_TIMEOUT = 10000;
    private static Boolean allowHackingTextCanvasCache;
    private ColorFilter animatedEmojiColorFilter;
    private x5 animatedEmojiDrawables;
    private vh.l clickDetector;
    private boolean clipToPadding;
    public boolean drawAnimatedEmojiDrawables;
    private boolean editedWhileQuoteUpdating;
    private Integer emojiColor;
    private boolean isSpoilersRevealed;
    private Layout lastLayout;
    private float lastRippleX;
    private float lastRippleY;
    private int lastText2Length;
    private int lastTextColor;
    private int lastTextLength;
    protected float offsetY;
    private Path path;
    private boolean postedSpoilerTimeout;
    private ArrayList<tj0> quoteBlocks;
    private boolean quoteBlocksUpdating;
    public int quoteColor;
    private boolean[] quoteUpdateLayout;
    private int quoteUpdatesTries;
    private Rect rect;
    private int selEnd;
    private int selStart;
    private boolean shouldRevealSpoilersByTouch;
    private Runnable spoilerTimeout;
    private List<vh.g> spoilers;
    private Stack<vh.g> spoilersPool;
    public boolean suppressOnTextChanged;
    public boolean wrapCanvasToFixClipping;
    private nd0 wrappedCanvas;

    public tu(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.quoteBlocks = new ArrayList<>();
        this.shouldRevealSpoilersByTouch = true;
        this.path = new Path();
        this.drawAnimatedEmojiDrawables = true;
        this.lastLayout = null;
        this.spoilerTimeout = new su(this, 2);
        this.rect = new Rect();
        this.wrapCanvasToFixClipping = allowHackingTextCanvas();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.clickDetector = new vh.l(this, this.spoilers, new s(this, 28));
        }
    }

    public static void a(tu tuVar) {
        tuVar.postedSpoilerTimeout = false;
        tuVar.isSpoilersRevealed = false;
        tuVar.invalidateSpoilers();
        if (!tuVar.spoilers.isEmpty()) {
            tuVar.spoilers.get(0).f49692q = new su(tuVar, 3);
            float sqrt = (float) Math.sqrt(Math.pow(tuVar.getHeight(), 2.0d) + Math.pow(tuVar.getWidth(), 2.0d));
            for (vh.g gVar : tuVar.spoilers) {
                gVar.j(tuVar.lastRippleX, tuVar.lastRippleY, sqrt, true);
            }
        }
    }

    public static boolean allowHackingTextCanvas() {
        String str;
        boolean z10;
        if (allowHackingTextCanvasCache == null) {
            String str2 = Build.MANUFACTURER;
            if ((str2 != null && (str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps"))) || ((str = Build.MODEL) != null && str.toLowerCase().contains("mediapad"))) {
                z10 = false;
            } else {
                z10 = true;
            }
            allowHackingTextCanvasCache = Boolean.valueOf(z10);
        }
        return allowHackingTextCanvasCache.booleanValue();
    }

    public final void b() {
        CharSequence charSequence;
        u11[] u11VarArr;
        int i10;
        int i11;
        if (getLayout() != null) {
            charSequence = getLayout().getText();
        } else {
            charSequence = null;
        }
        boolean z10 = false;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (u11 u11Var : (u11[]) spannable.getSpans(0, spannable.length(), u11.class)) {
                int spanStart = spannable.getSpanStart(u11Var);
                int spanEnd = spannable.getSpanEnd(u11Var);
                if (u11Var.c() && ((spanStart > (i10 = this.selStart) && spanEnd < this.selEnd) || ((i10 > spanStart && i10 < spanEnd) || ((i11 = this.selEnd) > spanStart && i11 < spanEnd)))) {
                    removeCallbacks(this.spoilerTimeout);
                    this.postedSpoilerTimeout = false;
                    z10 = true;
                    break;
                }
            }
        }
        if (this.isSpoilersRevealed && !z10 && !this.postedSpoilerTimeout) {
            this.postedSpoilerTimeout = true;
            postDelayed(this.spoilerTimeout, 10000L);
        }
    }

    public final void c(vh.g gVar, float f7, float f10) {
        if (!this.isSpoilersRevealed) {
            this.lastRippleX = f7;
            this.lastRippleY = f10;
            this.postedSpoilerTimeout = false;
            removeCallbacks(this.spoilerTimeout);
            setSpoilersRevealed(true, false);
            gVar.f49692q = new su(this, 0);
            float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
            for (vh.g gVar2 : this.spoilers) {
                gVar2.j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        xj0 xj0Var;
        boolean z12;
        vh.l lVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList<tj0> arrayList = this.quoteBlocks;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i10 = 0;
            while (i10 < size) {
                tj0 tj0Var = arrayList.get(i10);
                i10++;
                tj0 tj0Var2 = tj0Var;
                pj0 pj0Var = tj0Var2.f31213e.J;
                if (tj0Var2.b() && tj0Var2.f31215g.contains(motionEvent.getX(), motionEvent.getY() - paddingTop)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (motionEvent.getAction() == 0) {
                    if (pj0Var != null) {
                        pj0Var.b(z11);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (pj0Var != null && pj0Var.h && z11) {
                        tj0Var2.f31213e.f32891e = !xj0Var.f32891e;
                        invalidateQuotes(true);
                        z10 = true;
                    }
                    if (pj0Var != null) {
                        pj0Var.b(false);
                    }
                } else if (motionEvent.getAction() == 3 && pj0Var != null) {
                    pj0Var.b(false);
                }
                if ((pj0Var != null && pj0Var.h) || z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (!z10) {
            if (this.shouldRevealSpoilersByTouch && (lVar = this.clickDetector) != null && ((GestureDetector) lVar.f49722a.f15668b).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z12 = true;
            } else {
                z12 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z12) {
                return false;
            }
        }
        return true;
    }

    public int emojiCacheType() {
        return s5.g();
    }

    public float getOffsetY() {
        return this.offsetY;
    }

    public CharSequence getTextToUse() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        vj0[] vj0VarArr = (vj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vj0.class);
        for (int length = vj0VarArr.length - 1; length >= 0; length--) {
            vj0 vj0Var = vj0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(vj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(vj0Var);
            spannableStringBuilder.removeSpan(vj0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public void invalidateEffects() {
        u11[] u11VarArr;
        Editable text = getText();
        if (text != null) {
            for (u11 u11Var : (u11[]) text.getSpans(0, text.length(), u11.class)) {
                if (u11Var.c()) {
                    boolean z10 = this.isSpoilersRevealed;
                    t11 t11Var = u11Var.f31339b;
                    if (z10) {
                        t11Var.f30974a |= 512;
                    } else {
                        t11Var.f30974a &= -513;
                    }
                }
            }
        }
        invalidateSpoilers();
    }

    public void invalidateQuotes(boolean z10) {
        int i10;
        if (this.quoteBlocksUpdating) {
            this.editedWhileQuoteUpdating = true;
            return;
        }
        int i11 = 0;
        if (getLayout() != null && getLayout().getText() != null) {
            i10 = getLayout().getText().length();
        } else {
            i10 = 0;
        }
        if (z10 || this.lastText2Length != i10) {
            this.quoteUpdatesTries = 2;
            this.lastText2Length = i10;
        }
        if (this.quoteUpdatesTries > 0) {
            if (this.quoteUpdateLayout == null) {
                this.quoteUpdateLayout = new boolean[1];
            }
            this.quoteUpdateLayout[0] = false;
            this.editedWhileQuoteUpdating = false;
            this.quoteBlocksUpdating = true;
            this.quoteBlocks = xj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            if (this.editedWhileQuoteUpdating) {
                this.quoteBlocks = xj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            }
            this.quoteBlocksUpdating = false;
            this.editedWhileQuoteUpdating = false;
            if (this.quoteUpdateLayout[0]) {
                resetFontMetricsCache();
            }
            this.quoteUpdatesTries--;
            if (getLayout() != null && getLayout().getText() != null) {
                i11 = getLayout().getText().length();
            }
            this.lastText2Length = i11;
        }
    }

    public void invalidateSpoilers() {
        x5 x5Var;
        x5 x5Var2;
        List<vh.g> list = this.spoilers;
        if (list == null) {
            return;
        }
        this.spoilersPool.addAll(list);
        this.spoilers.clear();
        if (this.isSpoilersRevealed) {
            invalidate();
            return;
        }
        Layout layout = getLayout();
        if (layout != null && (layout.getText() instanceof Spannable)) {
            if (this.drawAnimatedEmojiDrawables && (x5Var2 = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList = x5Var2.f32748a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((w5) arrayList.get(i10)).d.recordPositions = false;
                }
            }
            Stack<vh.g> stack = this.spoilersPool;
            List<vh.g> list2 = this.spoilers;
            ArrayList<tj0> arrayList2 = this.quoteBlocks;
            int i11 = vh.g.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            vh.g.a(this, layout2, 0, measuredWidth, (Spanned) getText(), stack, list2, arrayList2);
            if (this.drawAnimatedEmojiDrawables && (x5Var = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList3 = x5Var.f32748a;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((w5) arrayList3.get(i12)).d.recordPositions = true;
                }
            }
        }
        invalidate();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAnimatedEmoji(true);
        invalidateQuotes(false);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.spoilerTimeout);
        b6.release(this, this.animatedEmojiDrawables);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        int color;
        canvas.save();
        if (this.clipToPadding && getScrollY() != 0) {
            canvas.clipRect(-AndroidUtilities.dp(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.offsetY, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY);
        }
        int paddingLeft = getPaddingLeft();
        if (!this.spoilers.isEmpty()) {
            this.path.rewind();
            for (vh.g gVar : this.spoilers) {
                Rect bounds = gVar.getBounds();
                this.path.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
            }
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        }
        invalidateQuotes(false);
        for (int i10 = 0; i10 < this.quoteBlocks.size(); i10++) {
            int width = getWidth();
            int i11 = this.quoteColor;
            getPaint();
            this.quoteBlocks.get(i10).a(canvas, width, i11);
        }
        updateAnimatedEmoji(false);
        if (this.wrapCanvasToFixClipping) {
            if (this.wrappedCanvas == null) {
                this.wrappedCanvas = new Canvas();
            }
            nd0 nd0Var = this.wrappedCanvas;
            nd0Var.f29146a = canvas;
            super.onDraw(nd0Var);
        } else {
            super.onDraw(canvas);
        }
        if (this.drawAnimatedEmojiDrawables && this.animatedEmojiDrawables != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            canvas2 = canvas;
            b6.drawAnimatedEmojis(canvas2, getLayout(), this.animatedEmojiDrawables, 0.0f, this.spoilers, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
        if (!this.spoilers.isEmpty()) {
            vh.g gVar2 = this.spoilers.get(0);
            if (gVar2.f49688m > 0.0f && gVar2.f49689n > 0.0f) {
                canvas2.save();
                canvas2.clipPath(this.path);
                this.path.rewind();
                this.spoilers.get(0).e(this.path);
                canvas2.clipPath(this.path);
                canvas2.translate(0.0f, -getPaddingTop());
                if (this.wrapCanvasToFixClipping) {
                    if (this.wrappedCanvas == null) {
                        this.wrappedCanvas = new Canvas();
                    }
                    nd0 nd0Var2 = this.wrappedCanvas;
                    nd0Var2.f29146a = canvas2;
                    super.onDraw(nd0Var2);
                } else {
                    super.onDraw(canvas2);
                }
                canvas2.restore();
            }
            this.rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.offsetY), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY));
            canvas2.save();
            canvas2.clipRect(this.rect);
            canvas2.translate(paddingLeft, 0.0f);
            for (vh.g gVar3 : this.spoilers) {
                Rect bounds2 = gVar3.getBounds();
                Rect rect = this.rect;
                int i12 = rect.top;
                int i13 = bounds2.bottom;
                if ((i12 <= i13 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i13 >= i12)) {
                    if (gVar3.f49699y) {
                        color = this.quoteColor;
                    } else {
                        color = getPaint().getColor();
                    }
                    gVar3.h(color);
                    gVar3.draw(canvas2);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        invalidateQuotes(false);
    }

    @Override
    public void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (this.suppressOnTextChanged) {
            return;
        }
        this.selStart = i10;
        this.selEnd = i11;
        b();
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        invalidateEffects();
    }

    @Override
    public void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tu.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void recycleEmojis() {
        b6.release(this, this.animatedEmojiDrawables);
    }

    public void resetFontMetricsCache() {
        float textSize = getTextSize();
        setTextSize(0, 1.0f + textSize);
        setTextSize(0, textSize);
    }

    public void setClipToPadding(boolean z10) {
        this.clipToPadding = z10;
    }

    public void setEmojiColor(Integer num) {
        int intValue;
        this.emojiColor = num;
        if (num == null) {
            intValue = this.lastTextColor;
        } else {
            intValue = num.intValue();
        }
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f7) {
        this.offsetY = f7;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z10) {
        this.shouldRevealSpoilersByTouch = z10;
    }

    public void setSpoilersRevealed(boolean z10, boolean z11) {
        u11[] u11VarArr;
        this.isSpoilersRevealed = z10;
        Editable text = getText();
        if (text != null) {
            for (u11 u11Var : (u11[]) text.getSpans(0, text.length(), u11.class)) {
                if (u11Var.c()) {
                    t11 t11Var = u11Var.f31339b;
                    if (z10) {
                        t11Var.f30974a |= 512;
                    } else {
                        t11Var.f30974a &= -513;
                    }
                }
            }
        }
        this.suppressOnTextChanged = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.selStart, this.selEnd);
        this.suppressOnTextChanged = false;
        if (z11) {
            invalidateSpoilers();
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.suppressOnTextChanged) {
            this.isSpoilersRevealed = false;
            Stack<vh.g> stack = this.spoilersPool;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i10) {
        this.lastTextColor = i10;
        super.setTextColor(i10);
        Integer num = this.emojiColor;
        if (num != null) {
            i10 = num.intValue();
        }
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void updateAnimatedEmoji(boolean z10) {
        int i10;
        if (this.drawAnimatedEmojiDrawables) {
            if (getLayout() != null && getLayout().getText() != null) {
                i10 = getLayout().getText().length();
            } else {
                i10 = 0;
            }
            if (!z10 && this.lastLayout == getLayout() && this.lastTextLength == i10) {
                return;
            }
            this.animatedEmojiDrawables = b6.update(emojiCacheType(), this, this.animatedEmojiDrawables, getLayout());
            this.lastLayout = getLayout();
            this.lastTextLength = i10;
        }
    }
}
