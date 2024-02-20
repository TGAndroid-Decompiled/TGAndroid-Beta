package org.telegram.ui.Components.spoilers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
public class SpoilersTextView extends TextView implements TextSelectionHelper.SimpleSelectabeleView {
    public boolean allowClickSpoilers;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmoji;
    private ColorFilter animatedEmojiColorFilter;
    public int cacheType;
    private SpoilersClickDetector clickDetector;
    private boolean isSpoilersRevealed;
    private Layout lastLayout;
    private int lastTextLength;
    private Path path;
    protected List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
    private Paint xRefPaint;

    public SpoilersTextView(Context context) {
        this(context, true);
    }

    public SpoilersTextView(Context context, final boolean z) {
        super(context);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.path = new Path();
        this.allowClickSpoilers = true;
        this.cacheType = 0;
        this.lastLayout = null;
        this.clickDetector = new SpoilersClickDetector(this, this.spoilers, new SpoilersClickDetector.OnSpoilerClickedListener() {
            @Override
            public final void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
                SpoilersTextView.this.lambda$new$2(z, spoilerEffect, f, f2);
            }
        });
    }

    public void lambda$new$2(boolean z, SpoilerEffect spoilerEffect, float f, float f2) {
        if (this.isSpoilersRevealed || !z) {
            return;
        }
        spoilerEffect.setOnRippleEndCallback(new Runnable() {
            @Override
            public final void run() {
                SpoilersTextView.this.lambda$new$1();
            }
        });
        float sqrt = (float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d));
        for (SpoilerEffect spoilerEffect2 : this.spoilers) {
            spoilerEffect2.startRipple(f, f2, sqrt);
        }
    }

    public void lambda$new$1() {
        post(new Runnable() {
            @Override
            public final void run() {
                SpoilersTextView.this.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
        this.isSpoilersRevealed = true;
        invalidateSpoilers();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.allowClickSpoilers && this.clickDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.isSpoilersRevealed = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        invalidateSpoilers();
        updateAnimatedEmoji(true);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateSpoilers();
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        this.path.rewind();
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            Rect bounds = spoilerEffect.getBounds();
            this.path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
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
        super.onDraw(canvas);
        canvas.restore();
        updateAnimatedEmoji(false);
        if (this.animatedEmoji != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, getLayout(), this.animatedEmoji, 0.0f, this.spoilers, 0.0f, getHeight(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas.restore();
        }
        if (this.spoilers.isEmpty()) {
            return;
        }
        boolean z = this.spoilers.get(0).getRippleProgress() != -1.0f;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
        } else {
            canvas.save();
        }
        canvas.translate(getPaddingLeft(), getPaddingTop() + AndroidUtilities.dp(2.0f));
        for (SpoilerEffect spoilerEffect2 : this.spoilers) {
            spoilerEffect2.setColor(getPaint().getColor());
            spoilerEffect2.draw(canvas);
        }
        if (z) {
            this.path.rewind();
            this.spoilers.get(0).getRipplePath(this.path);
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            canvas.drawPath(this.path, this.xRefPaint);
        }
        canvas.restore();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAnimatedEmoji(true);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateSpoilers();
    }

    public void updateAnimatedEmoji(boolean z) {
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (!z && this.lastLayout == getLayout() && this.lastTextLength == length) {
            return;
        }
        this.animatedEmoji = AnimatedEmojiSpan.update(this.cacheType, this, this.animatedEmoji, getLayout());
        this.lastLayout = getLayout();
        this.lastTextLength = length;
    }

    private void invalidateSpoilers() {
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
        if (getLayout() != null && (getText() instanceof Spanned)) {
            SpoilerEffect.addSpoilers(this, this.spoilersPool, this.spoilers);
        }
        invalidate();
    }

    @Override
    public Layout getStaticTextLayout() {
        return getLayout();
    }
}
