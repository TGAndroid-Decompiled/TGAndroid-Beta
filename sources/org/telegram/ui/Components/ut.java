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
public abstract class ut extends EditText {
    private static final int SPOILER_TIMEOUT = 10000;
    private static Boolean allowHackingTextCanvasCache;
    private ColorFilter animatedEmojiColorFilter;
    private u5 animatedEmojiDrawables;
    private gh.p clickDetector;
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
    private ArrayList<mi0> quoteBlocks;
    private boolean quoteBlocksUpdating;
    public int quoteColor;
    private boolean[] quoteUpdateLayout;
    private int quoteUpdatesTries;
    private Rect rect;
    private int selEnd;
    private int selStart;
    private boolean shouldRevealSpoilersByTouch;
    private Runnable spoilerTimeout;
    private List<gh.k> spoilers;
    private Stack<gh.k> spoilersPool;
    public boolean suppressOnTextChanged;
    public boolean wrapCanvasToFixClipping;
    private jc0 wrappedCanvas;

    public ut(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.quoteBlocks = new ArrayList<>();
        this.shouldRevealSpoilersByTouch = true;
        this.path = new Path();
        this.drawAnimatedEmojiDrawables = true;
        this.lastLayout = null;
        this.spoilerTimeout = new tt(this, 2);
        this.rect = new Rect();
        this.wrapCanvasToFixClipping = allowHackingTextCanvas();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.clickDetector = new gh.p(this, this.spoilers, new u(this, 28));
        }
    }

    public static void a(ut utVar) {
        utVar.postedSpoilerTimeout = false;
        utVar.isSpoilersRevealed = false;
        utVar.invalidateSpoilers();
        if (!utVar.spoilers.isEmpty()) {
            utVar.spoilers.get(0).f7417q = new tt(utVar, 3);
            float sqrt = (float) Math.sqrt(Math.pow(utVar.getHeight(), 2.0d) + Math.pow(utVar.getWidth(), 2.0d));
            for (gh.k kVar : utVar.spoilers) {
                kVar.j(utVar.lastRippleX, utVar.lastRippleY, sqrt, true);
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
        i01[] i01VarArr;
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
            for (i01 i01Var : (i01[]) spannable.getSpans(0, spannable.length(), i01.class)) {
                int spanStart = spannable.getSpanStart(i01Var);
                int spanEnd = spannable.getSpanEnd(i01Var);
                if (i01Var.c() && ((spanStart > (i10 = this.selStart) && spanEnd < this.selEnd) || ((i10 > spanStart && i10 < spanEnd) || ((i11 = this.selEnd) > spanStart && i11 < spanEnd)))) {
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

    public final void c(gh.k kVar, float f9, float f10) {
        if (!this.isSpoilersRevealed) {
            this.lastRippleX = f9;
            this.lastRippleY = f10;
            this.postedSpoilerTimeout = false;
            removeCallbacks(this.spoilerTimeout);
            setSpoilersRevealed(true, false);
            kVar.f7417q = new tt(this, 0);
            float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
            for (gh.k kVar2 : this.spoilers) {
                kVar2.j(f9, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        gh.p pVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList<mi0> arrayList = this.quoteBlocks;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i10 = 0;
            while (i10 < size) {
                mi0 mi0Var = arrayList.get(i10);
                i10++;
                mi0 mi0Var2 = mi0Var;
                hi0 hi0Var = mi0Var2.f30710e.F;
                if (mi0Var2.b() && mi0Var2.f30712g.contains(motionEvent.getX(), motionEvent.getY() - paddingTop)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (motionEvent.getAction() == 0) {
                    if (hi0Var != null) {
                        hi0Var.b(z11);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (hi0Var != null && hi0Var.h && z11) {
                        qi0 qi0Var = mi0Var2.f30710e;
                        qi0Var.f31959e = !qi0Var.f31959e;
                        invalidateQuotes(true);
                        z10 = true;
                    }
                    if (hi0Var != null) {
                        hi0Var.b(false);
                    }
                } else if (motionEvent.getAction() == 3 && hi0Var != null) {
                    hi0Var.b(false);
                }
                if ((hi0Var != null && hi0Var.h) || z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (!z10) {
            if (this.shouldRevealSpoilersByTouch && (pVar = this.clickDetector) != null && ((GestureDetector) pVar.f7447a.f19159b).onTouchEvent(motionEvent)) {
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
        return p5.g();
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
        oi0[] oi0VarArr = (oi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oi0.class);
        for (int length = oi0VarArr.length - 1; length >= 0; length--) {
            oi0 oi0Var = oi0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(oi0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(oi0Var);
            spannableStringBuilder.removeSpan(oi0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public void invalidateEffects() {
        i01[] i01VarArr;
        Editable text = getText();
        if (text != null) {
            for (i01 i01Var : (i01[]) text.getSpans(0, text.length(), i01.class)) {
                if (i01Var.c()) {
                    boolean z10 = this.isSpoilersRevealed;
                    h01 h01Var = i01Var.f29294b;
                    if (z10) {
                        h01Var.f29024a |= 512;
                    } else {
                        h01Var.f29024a &= -513;
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
            this.quoteBlocks = qi0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            if (this.editedWhileQuoteUpdating) {
                this.quoteBlocks = qi0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
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
        int i10;
        u5 u5Var;
        u5 u5Var2;
        List<gh.k> list = this.spoilers;
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
            if (this.drawAnimatedEmojiDrawables && (u5Var2 = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList = u5Var2.f33139a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((t5) arrayList.get(i11)).d.recordPositions = false;
                }
            }
            Stack<gh.k> stack = this.spoilersPool;
            List<gh.k> list2 = this.spoilers;
            ArrayList<mi0> arrayList2 = this.quoteBlocks;
            int i12 = gh.k.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth > 0) {
                i10 = measuredWidth;
            } else {
                i10 = -2;
            }
            gh.k.a(this, layout2, 0, i10, (Spanned) getText(), stack, list2, arrayList2);
            if (this.drawAnimatedEmojiDrawables && (u5Var = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList3 = u5Var.f33139a;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((t5) arrayList3.get(i13)).d.recordPositions = true;
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
        y5.release(this, this.animatedEmojiDrawables);
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
            for (gh.k kVar : this.spoilers) {
                Rect bounds = kVar.getBounds();
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
            jc0 jc0Var = this.wrappedCanvas;
            jc0Var.f29641a = canvas;
            super.onDraw(jc0Var);
        } else {
            super.onDraw(canvas);
        }
        if (this.drawAnimatedEmojiDrawables && this.animatedEmojiDrawables != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            canvas2 = canvas;
            y5.drawAnimatedEmojis(canvas2, getLayout(), this.animatedEmojiDrawables, 0.0f, this.spoilers, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
        if (!this.spoilers.isEmpty()) {
            gh.k kVar2 = this.spoilers.get(0);
            if (kVar2.f7413m > 0.0f && kVar2.f7414n > 0.0f) {
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
                    jc0 jc0Var2 = this.wrappedCanvas;
                    jc0Var2.f29641a = canvas2;
                    super.onDraw(jc0Var2);
                } else {
                    super.onDraw(canvas2);
                }
                canvas2.restore();
            }
            this.rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.offsetY), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY));
            canvas2.save();
            canvas2.clipRect(this.rect);
            canvas2.translate(paddingLeft, 0.0f);
            for (gh.k kVar3 : this.spoilers) {
                Rect bounds2 = kVar3.getBounds();
                Rect rect = this.rect;
                int i12 = rect.top;
                int i13 = bounds2.bottom;
                if ((i12 <= i13 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i13 >= i12)) {
                    if (kVar3.f7424y) {
                        color = this.quoteColor;
                    } else {
                        color = getPaint().getColor();
                    }
                    kVar3.h(color);
                    kVar3.draw(canvas2);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ut.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void recycleEmojis() {
        y5.release(this, this.animatedEmojiDrawables);
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

    public void setOffsetY(float f9) {
        this.offsetY = f9;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z10) {
        this.shouldRevealSpoilersByTouch = z10;
    }

    public void setSpoilersRevealed(boolean z10, boolean z11) {
        i01[] i01VarArr;
        this.isSpoilersRevealed = z10;
        Editable text = getText();
        if (text != null) {
            for (i01 i01Var : (i01[]) text.getSpans(0, text.length(), i01.class)) {
                if (i01Var.c()) {
                    h01 h01Var = i01Var.f29294b;
                    if (z10) {
                        h01Var.f29024a |= 512;
                    } else {
                        h01Var.f29024a &= -513;
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
            Stack<gh.k> stack = this.spoilersPool;
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
            this.animatedEmojiDrawables = y5.update(emojiCacheType(), this, this.animatedEmojiDrawables, getLayout());
            this.lastLayout = getLayout();
            this.lastTextLength = i10;
        }
    }
}
