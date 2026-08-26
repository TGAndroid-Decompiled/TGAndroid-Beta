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
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;

public abstract class EditTextEffects extends EditText {
    private static final int SPOILER_TIMEOUT = 10000;
    private static Boolean allowHackingTextCanvasCache;
    private ColorFilter animatedEmojiColorFilter;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiDrawables;
    private SpoilersClickDetector clickDetector;
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
    private ArrayList<QuoteSpan.Block> quoteBlocks;
    private boolean quoteBlocksUpdating;
    public int quoteColor;
    private boolean[] quoteUpdateLayout;
    private int quoteUpdatesTries;
    private Rect rect;
    private int selEnd;
    private int selStart;
    private boolean shouldRevealSpoilersByTouch;
    private Runnable spoilerTimeout;
    private List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
    public boolean suppressOnTextChanged;
    public boolean wrapCanvasToFixClipping;
    private NoClipCanvas wrappedCanvas;

    public EditTextEffects(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.quoteBlocks = new ArrayList<>();
        this.shouldRevealSpoilersByTouch = true;
        this.path = new Path();
        this.drawAnimatedEmojiDrawables = true;
        this.lastLayout = null;
        this.spoilerTimeout = new EditTextEffects$$ExternalSyntheticLambda0(this, 4);
        this.rect = new Rect();
        this.wrapCanvasToFixClipping = allowHackingTextCanvas();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.clickDetector = new SpoilersClickDetector(this, this.spoilers, new ColorPicker$$ExternalSyntheticLambda6(this, 21));
        }
    }

    public static boolean allowHackingTextCanvas() {
        String str;
        if (allowHackingTextCanvasCache == null) {
            String str2 = Build.MANUFACTURER;
            allowHackingTextCanvasCache = Boolean.valueOf((str2 == null || !(str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps"))) && ((str = Build.MODEL) == null || !str.toLowerCase().contains("mediapad")));
        }
        return allowHackingTextCanvasCache.booleanValue();
    }

    public final void checkSpoilerTimeout() {
        int i;
        int i2;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spannable.getSpans(0, spannable.length(), TextStyleSpan.class)) {
                int spanStart = spannable.getSpanStart(textStyleSpan);
                int spanEnd = spannable.getSpanEnd(textStyleSpan);
                if (textStyleSpan.isSpoiler() && ((spanStart > (i = this.selStart) && spanEnd < this.selEnd) || ((i > spanStart && i < spanEnd) || ((i2 = this.selEnd) > spanStart && i2 < spanEnd)))) {
                    removeCallbacks(this.spoilerTimeout);
                    this.postedSpoilerTimeout = false;
                    z = true;
                    break;
                }
            }
        }
        if (!this.isSpoilersRevealed || z || this.postedSpoilerTimeout) {
            return;
        }
        this.postedSpoilerTimeout = true;
        postDelayed(this.spoilerTimeout, 10000L);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        SpoilersClickDetector spoilersClickDetector;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList<QuoteSpan.Block> arrayList = this.quoteBlocks;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            loop0: while (true) {
                z = false;
                while (true) {
                    if (i >= size) {
                        break loop0;
                    }
                    QuoteSpan.Block block = arrayList.get(i);
                    i++;
                    QuoteSpan.Block block2 = block;
                    QuoteCollapseButton quoteCollapseButton = block2.span.collapseButton;
                    boolean z3 = block2.hasButton() && block2.collapseButtonBounds.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                    if (motionEvent.getAction() == 0) {
                        if (quoteCollapseButton != null) {
                            quoteCollapseButton.pressed = z3;
                            quoteCollapseButton.bounce.setPressed(z3);
                        }
                    } else if (motionEvent.getAction() == 1) {
                        if (quoteCollapseButton != null && quoteCollapseButton.pressed && z3) {
                            QuoteSpan quoteSpan = block2.span;
                            quoteSpan.isCollapsing = !quoteSpan.isCollapsing;
                            lambda$dispatchTouchEvent$5();
                            z = true;
                        }
                        if (quoteCollapseButton != null) {
                            quoteCollapseButton.pressed = false;
                            quoteCollapseButton.bounce.setPressed(false);
                        }
                    } else if (motionEvent.getAction() == 3 && quoteCollapseButton != null) {
                        quoteCollapseButton.pressed = false;
                        quoteCollapseButton.bounce.setPressed(false);
                    }
                    if (quoteCollapseButton == null || !quoteCollapseButton.pressed) {
                        if (z) {
                        }
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.shouldRevealSpoilersByTouch && (spoilersClickDetector = this.clickDetector) != null && ((GestureDetector) spoilersClickDetector.gestureDetector.zza).onTouchEvent(motionEvent)) {
            if (motionEvent.getActionMasked() == 1) {
                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return super.dispatchTouchEvent(motionEvent) || z2;
    }

    public int emojiCacheType() {
        return AnimatedEmojiDrawable.getCacheTypeForEnterView();
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
        QuoteSpan.QuoteButtonNewLineSpan[] quoteButtonNewLineSpanArr = (QuoteSpan.QuoteButtonNewLineSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteSpan.QuoteButtonNewLineSpan.class);
        for (int length = quoteButtonNewLineSpanArr.length - 1; length >= 0; length--) {
            QuoteSpan.QuoteButtonNewLineSpan quoteButtonNewLineSpan = quoteButtonNewLineSpanArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(quoteButtonNewLineSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(quoteButtonNewLineSpan);
            spannableStringBuilder.removeSpan(quoteButtonNewLineSpan);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public void invalidateEffects() {
        Editable text = getText();
        if (text != null) {
            for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) text.getSpans(0, text.length(), TextStyleSpan.class)) {
                if (textStyleSpan.isSpoiler()) {
                    boolean z = this.isSpoilersRevealed;
                    TextStyleSpan.TextStyleRun textStyleRun = textStyleSpan.style;
                    if (z) {
                        textStyleRun.flags |= 512;
                    } else {
                        textStyleRun.flags &= -513;
                    }
                }
            }
        }
        invalidateSpoilers();
    }

    public void invalidateQuotes(boolean z) {
        if (this.quoteBlocksUpdating) {
            this.editedWhileQuoteUpdating = true;
            return;
        }
        int length = 0;
        int length2 = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (z || this.lastText2Length != length2) {
            this.quoteUpdatesTries = 2;
            this.lastText2Length = length2;
        }
        if (this.quoteUpdatesTries > 0) {
            if (this.quoteUpdateLayout == null) {
                this.quoteUpdateLayout = new boolean[1];
            }
            this.quoteUpdateLayout[0] = false;
            this.editedWhileQuoteUpdating = false;
            this.quoteBlocksUpdating = true;
            this.quoteBlocks = QuoteSpan.updateQuoteBlocks(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            if (this.editedWhileQuoteUpdating) {
                this.quoteBlocks = QuoteSpan.updateQuoteBlocks(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            }
            this.quoteBlocksUpdating = false;
            this.editedWhileQuoteUpdating = false;
            if (this.quoteUpdateLayout[0]) {
                resetFontMetricsCache();
            }
            this.quoteUpdatesTries--;
            if (getLayout() != null && getLayout().getText() != null) {
                length = getLayout().getText().length();
            }
            this.lastText2Length = length;
        }
    }

    public void invalidateSpoilers() {
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2;
        List<SpoilerEffect> list = this.spoilers;
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
            int i = 0;
            if (this.drawAnimatedEmojiDrawables && (emojiGroupedSpans2 = this.animatedEmojiDrawables) != null) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = emojiGroupedSpans2.holders;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    ((AnimatedEmojiSpan.AnimatedEmojiHolder) arrayList.get(i2)).span.recordPositions = false;
                    i2++;
                }
            }
            Stack<SpoilerEffect> stack = this.spoilersPool;
            List<SpoilerEffect> list2 = this.spoilers;
            ArrayList<QuoteSpan.Block> arrayList2 = this.quoteBlocks;
            int i3 = SpoilerEffect.MAX_PARTICLES_PER_ENTITY;
            int measuredWidth = getMeasuredWidth();
            SpoilerEffect.addSpoilers(this, getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) getText(), stack, list2, arrayList2);
            if (this.drawAnimatedEmojiDrawables && (emojiGroupedSpans = this.animatedEmojiDrawables) != null) {
                while (true) {
                    ArrayList arrayList3 = emojiGroupedSpans.holders;
                    if (i >= arrayList3.size()) {
                        break;
                    }
                    ((AnimatedEmojiSpan.AnimatedEmojiHolder) arrayList3.get(i)).span.recordPositions = true;
                    i++;
                }
            }
        }
        invalidate();
    }

    public final void lambda$dispatchTouchEvent$5() {
        invalidateQuotes(true);
    }

    public final void lambda$new$0() {
        setSpoilersRevealed(false, true);
    }

    public final void lambda$new$1() {
        post(new EditTextEffects$$ExternalSyntheticLambda0(this, 0));
    }

    public final void lambda$new$2() {
        this.postedSpoilerTimeout = false;
        this.isSpoilersRevealed = false;
        invalidateSpoilers();
        if (this.spoilers.isEmpty()) {
            return;
        }
        this.spoilers.get(0).onRippleEndCallback = new EditTextEffects$$ExternalSyntheticLambda0(this, 1);
        float fSqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        Iterator<SpoilerEffect> it = this.spoilers.iterator();
        while (it.hasNext()) {
            it.next().startRipple(this.lastRippleX, this.lastRippleY, fSqrt, true);
        }
    }

    public final void lambda$onSpoilerClicked$3() {
        invalidateSpoilers();
        checkSpoilerTimeout();
    }

    public final void lambda$onSpoilerClicked$4() {
        post(new EditTextEffects$$ExternalSyntheticLambda0(this, 2));
    }

    public void lambda$onTouchEvent$0() {
        requestFocus();
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
        AnimatedEmojiSpan.release(this, this.animatedEmojiDrawables);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        if (this.clipToPadding && getScrollY() != 0) {
            canvas.clipRect(-AndroidUtilities.dp(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.offsetY, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY);
        }
        int paddingLeft = getPaddingLeft();
        if (!this.spoilers.isEmpty()) {
            this.path.rewind();
            Iterator<SpoilerEffect> it = this.spoilers.iterator();
            while (it.hasNext()) {
                Rect bounds = it.next().getBounds();
                this.path.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
            }
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        }
        invalidateQuotes(false);
        for (int i = 0; i < this.quoteBlocks.size(); i++) {
            QuoteSpan.Block block = this.quoteBlocks.get(i);
            int width = getWidth();
            int i2 = this.quoteColor;
            getPaint();
            block.draw(canvas, width, i2);
        }
        updateAnimatedEmoji(false);
        if (this.wrapCanvasToFixClipping) {
            if (this.wrappedCanvas == null) {
                this.wrappedCanvas = new NoClipCanvas();
            }
            NoClipCanvas noClipCanvas = this.wrappedCanvas;
            noClipCanvas.canvas = canvas;
            super.onDraw(noClipCanvas);
        } else {
            super.onDraw(canvas);
        }
        if (!this.drawAnimatedEmojiDrawables || this.animatedEmojiDrawables == null) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            canvas2 = canvas;
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, getLayout(), this.animatedEmojiDrawables, 0.0f, this.spoilers, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas2.restore();
        }
        canvas2.restore();
        if (this.spoilers.isEmpty()) {
            return;
        }
        SpoilerEffect spoilerEffect = this.spoilers.get(0);
        if (spoilerEffect.rippleMaxRadius > 0.0f && spoilerEffect.rippleProgress > 0.0f) {
            canvas2.save();
            canvas2.clipPath(this.path);
            this.path.rewind();
            this.spoilers.get(0).getRipplePath(this.path);
            canvas2.clipPath(this.path);
            canvas2.translate(0.0f, -getPaddingTop());
            if (this.wrapCanvasToFixClipping) {
                if (this.wrappedCanvas == null) {
                    this.wrappedCanvas = new NoClipCanvas();
                }
                NoClipCanvas noClipCanvas2 = this.wrappedCanvas;
                noClipCanvas2.canvas = canvas2;
                super.onDraw(noClipCanvas2);
            } else {
                super.onDraw(canvas2);
            }
            canvas2.restore();
        }
        this.rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.offsetY), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY));
        canvas2.save();
        canvas2.clipRect(this.rect);
        canvas2.translate(paddingLeft, 0.0f);
        for (SpoilerEffect spoilerEffect2 : this.spoilers) {
            Rect bounds2 = spoilerEffect2.getBounds();
            Rect rect = this.rect;
            int i3 = rect.top;
            int i4 = bounds2.bottom;
            if ((i3 <= i4 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i4 >= i3)) {
                spoilerEffect2.setColor(spoilerEffect2.insideQuote ? this.quoteColor : getPaint().getColor());
                spoilerEffect2.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateQuotes(false);
    }

    @Override
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.suppressOnTextChanged) {
            return;
        }
        this.selStart = i;
        this.selEnd = i2;
        checkSpoilerTimeout();
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateEffects();
    }

    public final void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        if (this.isSpoilersRevealed) {
            return;
        }
        this.lastRippleX = f;
        this.lastRippleY = f2;
        this.postedSpoilerTimeout = false;
        removeCallbacks(this.spoilerTimeout);
        setSpoilersRevealed(true, false);
        spoilerEffect.onRippleEndCallback = new EditTextEffects$$ExternalSyntheticLambda0(this, 3);
        float fSqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        Iterator<SpoilerEffect> it = this.spoilers.iterator();
        while (it.hasNext()) {
            it.next().startRipple(f, f2, fSqrt, false);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.suppressOnTextChanged) {
            invalidateEffects();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i);
                    int lineTop = (int) ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2.0f);
                    for (SpoilerEffect spoilerEffect : this.spoilers) {
                        if (spoilerEffect.getBounds().contains(primaryHorizontal, lineTop)) {
                            int i4 = i3 - i2;
                            this.selStart += i4;
                            this.selEnd += i4;
                            onSpoilerClicked(spoilerEffect, primaryHorizontal, lineTop);
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        updateAnimatedEmoji(true);
        invalidateQuotes(true);
        invalidate();
    }

    public void recycleEmojis() {
        AnimatedEmojiSpan.release(this, this.animatedEmojiDrawables);
    }

    public void resetFontMetricsCache() {
        float textSize = getTextSize();
        setTextSize(0, 1.0f + textSize);
        setTextSize(0, textSize);
    }

    public void setClipToPadding(boolean z) {
        this.clipToPadding = z;
    }

    public void setEmojiColor(Integer num) {
        this.emojiColor = num;
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(num == null ? this.lastTextColor : num.intValue(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f) {
        this.offsetY = f;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z) {
        this.shouldRevealSpoilersByTouch = z;
    }

    public void setSpoilersRevealed(boolean z, boolean z2) {
        this.isSpoilersRevealed = z;
        Editable text = getText();
        if (text != null) {
            for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) text.getSpans(0, text.length(), TextStyleSpan.class)) {
                if (textStyleSpan.isSpoiler()) {
                    TextStyleSpan.TextStyleRun textStyleRun = textStyleSpan.style;
                    if (z) {
                        textStyleRun.flags |= 512;
                    } else {
                        textStyleRun.flags &= -513;
                    }
                }
            }
        }
        this.suppressOnTextChanged = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.selStart, this.selEnd);
        this.suppressOnTextChanged = false;
        if (z2) {
            invalidateSpoilers();
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.suppressOnTextChanged) {
            this.isSpoilersRevealed = false;
            Stack<SpoilerEffect> stack = this.spoilersPool;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i) {
        this.lastTextColor = i;
        super.setTextColor(i);
        Integer num = this.emojiColor;
        if (num != null) {
            i = num.intValue();
        }
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void updateAnimatedEmoji(boolean z) {
        if (this.drawAnimatedEmojiDrawables) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z && this.lastLayout == getLayout() && this.lastTextLength == length) {
                return;
            }
            this.animatedEmojiDrawables = AnimatedEmojiSpan.update(emojiCacheType(), this, this.animatedEmojiDrawables, getLayout());
            this.lastLayout = getLayout();
            this.lastTextLength = length;
        }
    }

    public void lambda$new$0(long j) {
        invalidate();
    }
}
