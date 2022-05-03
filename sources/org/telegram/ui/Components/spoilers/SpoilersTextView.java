package org.telegram.ui.Components.spoilers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Spanned;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;

public class SpoilersTextView extends TextView {
    private boolean isSpoilersRevealed;
    private Paint xRefPaint;
    private List<SpoilerEffect> spoilers = new ArrayList();
    private Stack<SpoilerEffect> spoilersPool = new Stack<>();
    private Path path = new Path();
    private SpoilersClickDetector clickDetector = new SpoilersClickDetector(this, this.spoilers, new SpoilersClickDetector.OnSpoilerClickedListener() {
        @Override
        public final void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
            SpoilersTextView.this.lambda$new$2(spoilerEffect, f, f2);
        }
    });

    public SpoilersTextView(Context context) {
        super(context);
    }

    public void lambda$new$2(SpoilerEffect spoilerEffect, float f, float f2) {
        if (!this.isSpoilersRevealed) {
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
        if (this.clickDetector.onTouchEvent(motionEvent)) {
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
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        invalidateSpoilers();
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateSpoilers();
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
        if (!this.spoilers.isEmpty()) {
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
            if (getLayout() != null && (getText() instanceof Spanned)) {
                SpoilerEffect.addSpoilers(this, this.spoilersPool, this.spoilers);
            }
            invalidate();
        }
    }
}
