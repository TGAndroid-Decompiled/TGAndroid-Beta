package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
public final class ew0 extends View {
    public final ImageReceiver f24811a;
    public final k9 f24812b;
    public final Paint f24813c;
    public float d;
    public boolean e;
    public ValueAnimator f24814f;

    public ew0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24811a = imageReceiver;
        this.f24812b = new k9((org.telegram.ui.ActionBar.c6) null);
        Paint paint = new Paint(1);
        this.f24813c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f24814f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        if (z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f7).setDuration(200L);
            duration.setInterpolator(es.f24771f);
            duration.addUpdateListener(new g80(this, 22));
            duration.addListener(new k90(this, 19));
            duration.start();
            this.f24814f = duration;
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.d = f7;
        invalidate();
    }

    @Override
    public final boolean isSelected() {
        if (this.d == 1.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24811a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24811a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f7 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f7, f7);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20063m5, false);
        Paint paint = this.f24813c;
        paint.setColor(x02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (!this.e) {
            float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
            float f10 = 2.0f * strokeWidth2;
            float width = getWidth() - f10;
            float height = getHeight() - f10;
            ImageReceiver imageReceiver = this.f24811a;
            imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.draw(canvas);
        }
    }

    public void setAvatar(TLObject tLObject) {
        k9 k9Var = this.f24812b;
        k9Var.p(tLObject);
        this.f24811a.setForUserOrChat(tLObject, k9Var);
    }

    public void setHideAvatar(boolean z10) {
        this.e = z10;
        invalidate();
    }
}
