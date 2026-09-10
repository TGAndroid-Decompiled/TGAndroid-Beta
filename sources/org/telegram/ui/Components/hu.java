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
public abstract class hu extends EditText {
    private static final int SPOILER_TIMEOUT = 10000;
    private static Boolean allowHackingTextCanvasCache;
    private ColorFilter animatedEmojiColorFilter;
    private u5 animatedEmojiDrawables;
    private uh.m clickDetector;
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
    private ArrayList<yi0> quoteBlocks;
    private boolean quoteBlocksUpdating;
    public int quoteColor;
    private boolean[] quoteUpdateLayout;
    private int quoteUpdatesTries;
    private Rect rect;
    private int selEnd;
    private int selStart;
    private boolean shouldRevealSpoilersByTouch;
    private Runnable spoilerTimeout;
    private List<uh.h> spoilers;
    private Stack<uh.h> spoilersPool;
    public boolean suppressOnTextChanged;
    public boolean wrapCanvasToFixClipping;
    private wc0 wrappedCanvas;

    public hu(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.quoteBlocks = new ArrayList<>();
        this.shouldRevealSpoilersByTouch = true;
        this.path = new Path();
        this.drawAnimatedEmojiDrawables = true;
        this.lastLayout = null;
        this.spoilerTimeout = new gu(this, 2);
        this.rect = new Rect();
        this.wrapCanvasToFixClipping = allowHackingTextCanvas();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.clickDetector = new uh.m(this, this.spoilers, new t(this, 28));
        }
    }

    public static void a(hu huVar) {
        huVar.postedSpoilerTimeout = false;
        huVar.isSpoilersRevealed = false;
        huVar.invalidateSpoilers();
        if (!huVar.spoilers.isEmpty()) {
            huVar.spoilers.get(0).f42785q = new gu(huVar, 3);
            float sqrt = (float) Math.sqrt(Math.pow(huVar.getHeight(), 2.0d) + Math.pow(huVar.getWidth(), 2.0d));
            for (uh.h hVar : huVar.spoilers) {
                hVar.j(huVar.lastRippleX, huVar.lastRippleY, sqrt, true);
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
        c11[] c11VarArr;
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
            for (c11 c11Var : (c11[]) spannable.getSpans(0, spannable.length(), c11.class)) {
                int spanStart = spannable.getSpanStart(c11Var);
                int spanEnd = spannable.getSpanEnd(c11Var);
                if (c11Var.c() && ((spanStart > (i10 = this.selStart) && spanEnd < this.selEnd) || ((i10 > spanStart && i10 < spanEnd) || ((i11 = this.selEnd) > spanStart && i11 < spanEnd)))) {
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

    public final void c(uh.h hVar, float f7, float f10) {
        if (!this.isSpoilersRevealed) {
            this.lastRippleX = f7;
            this.lastRippleY = f10;
            this.postedSpoilerTimeout = false;
            removeCallbacks(this.spoilerTimeout);
            setSpoilersRevealed(true, false);
            hVar.f42785q = new gu(this, 0);
            float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
            for (uh.h hVar2 : this.spoilers) {
                hVar2.j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        uh.m mVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList<yi0> arrayList = this.quoteBlocks;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i10 = 0;
            while (i10 < size) {
                yi0 yi0Var = arrayList.get(i10);
                i10++;
                yi0 yi0Var2 = yi0Var;
                ui0 ui0Var = yi0Var2.e.J;
                if (yi0Var2.b() && yi0Var2.f29437g.contains(motionEvent.getX(), motionEvent.getY() - paddingTop)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (motionEvent.getAction() == 0) {
                    if (ui0Var != null) {
                        ui0Var.b(z11);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (ui0Var != null && ui0Var.h && z11) {
                        cj0 cj0Var = yi0Var2.e;
                        cj0Var.e = !cj0Var.e;
                        invalidateQuotes(true);
                        z10 = true;
                    }
                    if (ui0Var != null) {
                        ui0Var.b(false);
                    }
                } else if (motionEvent.getAction() == 3 && ui0Var != null) {
                    ui0Var.b(false);
                }
                if ((ui0Var != null && ui0Var.h) || z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (!z10) {
            if (this.shouldRevealSpoilersByTouch && (mVar = this.clickDetector) != null && ((GestureDetector) mVar.f42814a.f12721b).onTouchEvent(motionEvent)) {
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
        aj0[] aj0VarArr = (aj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), aj0.class);
        for (int length = aj0VarArr.length - 1; length >= 0; length--) {
            aj0 aj0Var = aj0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(aj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(aj0Var);
            spannableStringBuilder.removeSpan(aj0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public void invalidateEffects() {
        c11[] c11VarArr;
        Editable text = getText();
        if (text != null) {
            for (c11 c11Var : (c11[]) text.getSpans(0, text.length(), c11.class)) {
                if (c11Var.c()) {
                    boolean z10 = this.isSpoilersRevealed;
                    b11 b11Var = c11Var.f21969b;
                    if (z10) {
                        b11Var.f21677a |= 512;
                    } else {
                        b11Var.f21677a &= -513;
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
            this.quoteBlocks = cj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            if (this.editedWhileQuoteUpdating) {
                this.quoteBlocks = cj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
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
        List<uh.h> list = this.spoilers;
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
                ArrayList arrayList = u5Var2.f27563a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((t5) arrayList.get(i11)).d.recordPositions = false;
                }
            }
            Stack<uh.h> stack = this.spoilersPool;
            List<uh.h> list2 = this.spoilers;
            ArrayList<yi0> arrayList2 = this.quoteBlocks;
            int i12 = uh.h.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth > 0) {
                i10 = measuredWidth;
            } else {
                i10 = -2;
            }
            uh.h.a(this, layout2, 0, i10, (Spanned) getText(), stack, list2, arrayList2);
            if (this.drawAnimatedEmojiDrawables && (u5Var = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList3 = u5Var.f27563a;
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
            for (uh.h hVar : this.spoilers) {
                Rect bounds = hVar.getBounds();
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
            wc0 wc0Var = this.wrappedCanvas;
            wc0Var.f28750a = canvas;
            super.onDraw(wc0Var);
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
            uh.h hVar2 = this.spoilers.get(0);
            if (hVar2.f42781m > 0.0f && hVar2.f42782n > 0.0f) {
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
                    wc0 wc0Var2 = this.wrappedCanvas;
                    wc0Var2.f28750a = canvas2;
                    super.onDraw(wc0Var2);
                } else {
                    super.onDraw(canvas2);
                }
                canvas2.restore();
            }
            this.rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.offsetY), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY));
            canvas2.save();
            canvas2.clipRect(this.rect);
            canvas2.translate(paddingLeft, 0.0f);
            for (uh.h hVar3 : this.spoilers) {
                Rect bounds2 = hVar3.getBounds();
                Rect rect = this.rect;
                int i12 = rect.top;
                int i13 = bounds2.bottom;
                if ((i12 <= i13 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i13 >= i12)) {
                    if (hVar3.f42792y) {
                        color = this.quoteColor;
                    } else {
                        color = getPaint().getColor();
                    }
                    hVar3.h(color);
                    hVar3.draw(canvas2);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hu.onTextChanged(java.lang.CharSequence, int, int, int):void");
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

    public void setOffsetY(float f7) {
        this.offsetY = f7;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z10) {
        this.shouldRevealSpoilersByTouch = z10;
    }

    public void setSpoilersRevealed(boolean z10, boolean z11) {
        c11[] c11VarArr;
        this.isSpoilersRevealed = z10;
        Editable text = getText();
        if (text != null) {
            for (c11 c11Var : (c11[]) text.getSpans(0, text.length(), c11.class)) {
                if (c11Var.c()) {
                    b11 b11Var = c11Var.f21969b;
                    if (z10) {
                        b11Var.f21677a |= 512;
                    } else {
                        b11Var.f21677a &= -513;
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
            Stack<uh.h> stack = this.spoilersPool;
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
