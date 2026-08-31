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
public abstract class zt extends EditText {
    private static final int SPOILER_TIMEOUT = 10000;
    private static Boolean allowHackingTextCanvasCache;
    private ColorFilter animatedEmojiColorFilter;
    private q5 animatedEmojiDrawables;
    private jh.p clickDetector;
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
    private ArrayList<xi0> quoteBlocks;
    private boolean quoteBlocksUpdating;
    public int quoteColor;
    private boolean[] quoteUpdateLayout;
    private int quoteUpdatesTries;
    private Rect rect;
    private int selEnd;
    private int selStart;
    private boolean shouldRevealSpoilersByTouch;
    private Runnable spoilerTimeout;
    private List<jh.k> spoilers;
    private Stack<jh.k> spoilersPool;
    public boolean suppressOnTextChanged;
    public boolean wrapCanvasToFixClipping;
    private rc0 wrappedCanvas;

    public zt(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.quoteBlocks = new ArrayList<>();
        this.shouldRevealSpoilersByTouch = true;
        this.path = new Path();
        this.drawAnimatedEmojiDrawables = true;
        this.lastLayout = null;
        this.spoilerTimeout = new yt(this, 2);
        this.rect = new Rect();
        this.wrapCanvasToFixClipping = allowHackingTextCanvas();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.clickDetector = new jh.p(this, this.spoilers, new t(this, 28));
        }
    }

    public static void a(zt ztVar) {
        ztVar.postedSpoilerTimeout = false;
        ztVar.isSpoilersRevealed = false;
        ztVar.invalidateSpoilers();
        if (!ztVar.spoilers.isEmpty()) {
            ztVar.spoilers.get(0).f10147q = new yt(ztVar, 3);
            float sqrt = (float) Math.sqrt(Math.pow(ztVar.getHeight(), 2.0d) + Math.pow(ztVar.getWidth(), 2.0d));
            for (jh.k kVar : ztVar.spoilers) {
                kVar.j(ztVar.lastRippleX, ztVar.lastRippleY, sqrt, true);
            }
        }
    }

    public static boolean allowHackingTextCanvas() {
        String str;
        boolean z4;
        if (allowHackingTextCanvasCache == null) {
            String str2 = Build.MANUFACTURER;
            if ((str2 != null && (str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps"))) || ((str = Build.MODEL) != null && str.toLowerCase().contains("mediapad"))) {
                z4 = false;
            } else {
                z4 = true;
            }
            allowHackingTextCanvasCache = Boolean.valueOf(z4);
        }
        return allowHackingTextCanvasCache.booleanValue();
    }

    public final void b() {
        CharSequence charSequence;
        u01[] u01VarArr;
        int i10;
        int i11;
        if (getLayout() != null) {
            charSequence = getLayout().getText();
        } else {
            charSequence = null;
        }
        boolean z4 = false;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (u01 u01Var : (u01[]) spannable.getSpans(0, spannable.length(), u01.class)) {
                int spanStart = spannable.getSpanStart(u01Var);
                int spanEnd = spannable.getSpanEnd(u01Var);
                if (u01Var.c() && ((spanStart > (i10 = this.selStart) && spanEnd < this.selEnd) || ((i10 > spanStart && i10 < spanEnd) || ((i11 = this.selEnd) > spanStart && i11 < spanEnd)))) {
                    removeCallbacks(this.spoilerTimeout);
                    this.postedSpoilerTimeout = false;
                    z4 = true;
                    break;
                }
            }
        }
        if (this.isSpoilersRevealed && !z4 && !this.postedSpoilerTimeout) {
            this.postedSpoilerTimeout = true;
            postDelayed(this.spoilerTimeout, 10000L);
        }
    }

    public final void c(jh.k kVar, float f10, float f11) {
        if (!this.isSpoilersRevealed) {
            this.lastRippleX = f10;
            this.lastRippleY = f11;
            this.postedSpoilerTimeout = false;
            removeCallbacks(this.spoilerTimeout);
            setSpoilersRevealed(true, false);
            kVar.f10147q = new yt(this, 0);
            float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
            for (jh.k kVar2 : this.spoilers) {
                kVar2.j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        boolean z11;
        jh.p pVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList<xi0> arrayList = this.quoteBlocks;
        if (arrayList == null) {
            z4 = false;
        } else {
            int size = arrayList.size();
            z4 = false;
            int i10 = 0;
            while (i10 < size) {
                xi0 xi0Var = arrayList.get(i10);
                i10++;
                xi0 xi0Var2 = xi0Var;
                ti0 ti0Var = xi0Var2.f33123e.G;
                if (xi0Var2.b() && xi0Var2.f33125g.contains(motionEvent.getX(), motionEvent.getY() - paddingTop)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (motionEvent.getAction() == 0) {
                    if (ti0Var != null) {
                        ti0Var.b(z10);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (ti0Var != null && ti0Var.h && z10) {
                        bj0 bj0Var = xi0Var2.f33123e;
                        bj0Var.f25609e = !bj0Var.f25609e;
                        invalidateQuotes(true);
                        z4 = true;
                    }
                    if (ti0Var != null) {
                        ti0Var.b(false);
                    }
                } else if (motionEvent.getAction() == 3 && ti0Var != null) {
                    ti0Var.b(false);
                }
                if ((ti0Var != null && ti0Var.h) || z4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
        }
        if (!z4) {
            if (this.shouldRevealSpoilersByTouch && (pVar = this.clickDetector) != null && ((GestureDetector) pVar.f10177a.f22788b).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z11) {
                return false;
            }
        }
        return true;
    }

    public int emojiCacheType() {
        return l5.g();
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
        zi0[] zi0VarArr = (zi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zi0.class);
        for (int length = zi0VarArr.length - 1; length >= 0; length--) {
            zi0 zi0Var = zi0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(zi0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(zi0Var);
            spannableStringBuilder.removeSpan(zi0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public void invalidateEffects() {
        u01[] u01VarArr;
        Editable text = getText();
        if (text != null) {
            for (u01 u01Var : (u01[]) text.getSpans(0, text.length(), u01.class)) {
                if (u01Var.c()) {
                    boolean z4 = this.isSpoilersRevealed;
                    t01 t01Var = u01Var.f31513b;
                    if (z4) {
                        t01Var.f31225a |= 512;
                    } else {
                        t01Var.f31225a &= -513;
                    }
                }
            }
        }
        invalidateSpoilers();
    }

    public void invalidateQuotes(boolean z4) {
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
        if (z4 || this.lastText2Length != i10) {
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
            this.quoteBlocks = bj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            if (this.editedWhileQuoteUpdating) {
                this.quoteBlocks = bj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
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
        q5 q5Var;
        q5 q5Var2;
        List<jh.k> list = this.spoilers;
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
            if (this.drawAnimatedEmojiDrawables && (q5Var2 = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList = q5Var2.f30280a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((p5) arrayList.get(i11)).d.recordPositions = false;
                }
            }
            Stack<jh.k> stack = this.spoilersPool;
            List<jh.k> list2 = this.spoilers;
            ArrayList<xi0> arrayList2 = this.quoteBlocks;
            int i12 = jh.k.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth > 0) {
                i10 = measuredWidth;
            } else {
                i10 = -2;
            }
            jh.k.a(this, layout2, 0, i10, (Spanned) getText(), stack, list2, arrayList2);
            if (this.drawAnimatedEmojiDrawables && (q5Var = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList3 = q5Var.f30280a;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((p5) arrayList3.get(i13)).d.recordPositions = true;
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
        u5.release(this, this.animatedEmojiDrawables);
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
            for (jh.k kVar : this.spoilers) {
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
            rc0 rc0Var = this.wrappedCanvas;
            rc0Var.f30680a = canvas;
            super.onDraw(rc0Var);
        } else {
            super.onDraw(canvas);
        }
        if (this.drawAnimatedEmojiDrawables && this.animatedEmojiDrawables != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            canvas2 = canvas;
            u5.drawAnimatedEmojis(canvas2, getLayout(), this.animatedEmojiDrawables, 0.0f, this.spoilers, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
        if (!this.spoilers.isEmpty()) {
            jh.k kVar2 = this.spoilers.get(0);
            if (kVar2.f10143m > 0.0f && kVar2.f10144n > 0.0f) {
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
                    rc0 rc0Var2 = this.wrappedCanvas;
                    rc0Var2.f30680a = canvas2;
                    super.onDraw(rc0Var2);
                } else {
                    super.onDraw(canvas2);
                }
                canvas2.restore();
            }
            this.rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.offsetY), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY));
            canvas2.save();
            canvas2.clipRect(this.rect);
            canvas2.translate(paddingLeft, 0.0f);
            for (jh.k kVar3 : this.spoilers) {
                Rect bounds2 = kVar3.getBounds();
                Rect rect = this.rect;
                int i12 = rect.top;
                int i13 = bounds2.bottom;
                if ((i12 <= i13 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i13 >= i12)) {
                    if (kVar3.f10154y) {
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void recycleEmojis() {
        u5.release(this, this.animatedEmojiDrawables);
    }

    public void resetFontMetricsCache() {
        float textSize = getTextSize();
        setTextSize(0, 1.0f + textSize);
        setTextSize(0, textSize);
    }

    public void setClipToPadding(boolean z4) {
        this.clipToPadding = z4;
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

    public void setOffsetY(float f10) {
        this.offsetY = f10;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z4) {
        this.shouldRevealSpoilersByTouch = z4;
    }

    public void setSpoilersRevealed(boolean z4, boolean z10) {
        u01[] u01VarArr;
        this.isSpoilersRevealed = z4;
        Editable text = getText();
        if (text != null) {
            for (u01 u01Var : (u01[]) text.getSpans(0, text.length(), u01.class)) {
                if (u01Var.c()) {
                    t01 t01Var = u01Var.f31513b;
                    if (z4) {
                        t01Var.f31225a |= 512;
                    } else {
                        t01Var.f31225a &= -513;
                    }
                }
            }
        }
        this.suppressOnTextChanged = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.selStart, this.selEnd);
        this.suppressOnTextChanged = false;
        if (z10) {
            invalidateSpoilers();
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.suppressOnTextChanged) {
            this.isSpoilersRevealed = false;
            Stack<jh.k> stack = this.spoilersPool;
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

    public void updateAnimatedEmoji(boolean z4) {
        int i10;
        if (this.drawAnimatedEmojiDrawables) {
            if (getLayout() != null && getLayout().getText() != null) {
                i10 = getLayout().getText().length();
            } else {
                i10 = 0;
            }
            if (!z4 && this.lastLayout == getLayout() && this.lastTextLength == i10) {
                return;
            }
            this.animatedEmojiDrawables = u5.update(emojiCacheType(), this, this.animatedEmojiDrawables, getLayout());
            this.lastLayout = getLayout();
            this.lastTextLength = i10;
        }
    }
}
