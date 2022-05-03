package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;

public class EditTextEffects extends EditText {
    private boolean isSpoilersRevealed;
    private float lastRippleX;
    private float lastRippleY;
    private boolean postedSpoilerTimeout;
    private int selEnd;
    private int selStart;
    private boolean suppressOnTextChanged;
    private List<SpoilerEffect> spoilers = new ArrayList();
    private Stack<SpoilerEffect> spoilersPool = new Stack<>();
    private boolean shouldRevealSpoilersByTouch = true;
    private Path path = new Path();
    private Runnable spoilerTimeout = new Runnable() {
        @Override
        public final void run() {
            EditTextEffects.this.lambda$new$2();
        }
    };
    private Rect rect = new Rect();
    private SpoilersClickDetector clickDetector = new SpoilersClickDetector(this, this.spoilers, new SpoilersClickDetector.OnSpoilerClickedListener() {
        @Override
        public final void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
            EditTextEffects.this.onSpoilerClicked(spoilerEffect, f, f2);
        }
    });

    public void lambda$new$2() {
        this.postedSpoilerTimeout = false;
        this.isSpoilersRevealed = false;
        invalidateSpoilers();
        if (!this.spoilers.isEmpty()) {
            this.spoilers.get(0).setOnRippleEndCallback(new Runnable() {
                @Override
                public final void run() {
                    EditTextEffects.this.lambda$new$1();
                }
            });
            float sqrt = (float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d));
            for (SpoilerEffect spoilerEffect : this.spoilers) {
                spoilerEffect.startRipple(this.lastRippleX, this.lastRippleY, sqrt, true);
            }
        }
    }

    public void lambda$new$0() {
        setSpoilersRevealed(false, true);
    }

    public void lambda$new$1() {
        post(new Runnable() {
            @Override
            public final void run() {
                EditTextEffects.this.lambda$new$0();
            }
        });
    }

    public EditTextEffects(Context context) {
        super(context);
    }

    public void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        if (!this.isSpoilersRevealed) {
            this.lastRippleX = f;
            this.lastRippleY = f2;
            this.postedSpoilerTimeout = false;
            removeCallbacks(this.spoilerTimeout);
            setSpoilersRevealed(true, false);
            spoilerEffect.setOnRippleEndCallback(new Runnable() {
                @Override
                public final void run() {
                    EditTextEffects.this.lambda$onSpoilerClicked$4();
                }
            });
            float sqrt = (float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d));
            for (SpoilerEffect spoilerEffect2 : this.spoilers) {
                spoilerEffect2.startRipple(f, f2, sqrt);
            }
        }
    }

    public void lambda$onSpoilerClicked$4() {
        post(new Runnable() {
            @Override
            public final void run() {
                EditTextEffects.this.lambda$onSpoilerClicked$3();
            }
        });
    }

    public void lambda$onSpoilerClicked$3() {
        invalidateSpoilers();
        checkSpoilerTimeout();
    }

    @Override
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (!this.suppressOnTextChanged) {
            this.selStart = i;
            this.selEnd = i2;
            checkSpoilerTimeout();
        }
    }

    private void checkSpoilerTimeout() {
        TextStyleSpan[] textStyleSpanArr;
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
        if (!(!this.isSpoilersRevealed || z || this.postedSpoilerTimeout)) {
            this.postedSpoilerTimeout = true;
            postDelayed(this.spoilerTimeout, 10000L);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.spoilerTimeout);
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateEffects();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.suppressOnTextChanged) {
            invalidateEffects();
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
                        return;
                    }
                }
            }
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

    public void setShouldRevealSpoilersByTouch(boolean z) {
        this.shouldRevealSpoilersByTouch = z;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.shouldRevealSpoilersByTouch || !this.clickDetector.onTouchEvent(motionEvent)) {
            z = false;
        } else {
            if (motionEvent.getActionMasked() == 1) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.dispatchTouchEvent(obtain);
                obtain.recycle();
            }
            z = true;
        }
        return super.dispatchTouchEvent(motionEvent) || z;
    }

    public void setSpoilersRevealed(boolean z, boolean z2) {
        TextStyleSpan[] textStyleSpanArr;
        this.isSpoilersRevealed = z;
        Editable text = getText();
        if (text != null) {
            for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) text.getSpans(0, text.length(), TextStyleSpan.class)) {
                if (textStyleSpan.isSpoiler()) {
                    textStyleSpan.setSpoilerRevealed(z);
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
    public void onDraw(Canvas canvas) {
        canvas.save();
        this.path.rewind();
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            Rect bounds = spoilerEffect.getBounds();
            this.path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipPath(this.path);
        this.path.rewind();
        if (!this.spoilers.isEmpty()) {
            this.spoilers.get(0).getRipplePath(this.path);
        }
        canvas.clipPath(this.path);
        canvas.translate(0.0f, -getPaddingTop());
        super.onDraw(canvas);
        canvas.restore();
        this.rect.set(0, getScrollY(), getWidth(), (getScrollY() + getHeight()) - getPaddingBottom());
        canvas.save();
        canvas.clipRect(this.rect);
        for (SpoilerEffect spoilerEffect2 : this.spoilers) {
            Rect bounds2 = spoilerEffect2.getBounds();
            Rect rect = this.rect;
            int i = rect.top;
            int i2 = bounds2.bottom;
            if ((i <= i2 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i2 >= i)) {
                spoilerEffect2.setColor(getPaint().getColor());
                spoilerEffect2.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void invalidateEffects() {
        TextStyleSpan[] textStyleSpanArr;
        Editable text = getText();
        if (text != null) {
            for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) text.getSpans(0, text.length(), TextStyleSpan.class)) {
                if (textStyleSpan.isSpoiler()) {
                    textStyleSpan.setSpoilerRevealed(this.isSpoilersRevealed);
                }
            }
        }
        invalidateSpoilers();
    }

    private void invalidateSpoilers() {
        List<SpoilerEffect> list = this.spoilers;
        if (list != null) {
            this.spoilersPool.addAll(list);
            this.spoilers.clear();
            if (this.isSpoilersRevealed) {
                invalidate();
                return;
            }
            Layout layout = getLayout();
            if (layout != null && (layout.getText() instanceof Spannable)) {
                SpoilerEffect.addSpoilers(this, this.spoilersPool, this.spoilers);
            }
            invalidate();
        }
    }
}
