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
public final class bw0 extends View {
    public final ImageReceiver f25053a;
    public final h9 f25054b;
    public final Paint f25055c;
    public float d;
    public boolean e;
    public ValueAnimator f25056f;

    public bw0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f25053a = imageReceiver;
        this.f25054b = new h9((org.telegram.ui.ActionBar.d6) null);
        Paint paint = new Paint(1);
        this.f25055c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f25056f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        if (z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f7).setDuration(200L);
            duration.setInterpolator(bs.f25025f);
            duration.addUpdateListener(new b80(this, 22));
            duration.addListener(new c80(this, 21));
            duration.start();
            this.f25056f = duration;
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
        this.f25053a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25053a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f7 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f7, f7);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21156m5, false);
        Paint paint = this.f25055c;
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
            ImageReceiver imageReceiver = this.f25053a;
            imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.draw(canvas);
        }
    }

    public void setAvatar(TLObject tLObject) {
        h9 h9Var = this.f25054b;
        h9Var.p(tLObject);
        this.f25053a.setForUserOrChat(tLObject, h9Var);
    }

    public void setHideAvatar(boolean z10) {
        this.e = z10;
        invalidate();
    }
}
