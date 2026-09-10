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
public final class pv0 extends View {
    public final ImageReceiver f26253a;
    public final g9 f26254b;
    public final Paint f26255c;
    public float d;
    public boolean e;
    public ValueAnimator f26256f;

    public pv0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f26253a = imageReceiver;
        this.f26254b = new g9((org.telegram.ui.ActionBar.f6) null);
        Paint paint = new Paint(1);
        this.f26255c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f26256f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        if (z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f7).setDuration(200L);
            duration.setInterpolator(wr.f28819f);
            duration.addUpdateListener(new q70(this, 21));
            duration.addListener(new zn0(this, 5));
            duration.start();
            this.f26256f = duration;
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
        this.f26253a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26253a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f7 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f7, f7);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18090m5, false);
        Paint paint = this.f26255c;
        paint.setColor(w02);
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
            ImageReceiver imageReceiver = this.f26253a;
            imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.draw(canvas);
        }
    }

    public void setAvatar(TLObject tLObject) {
        g9 g9Var = this.f26254b;
        g9Var.p(tLObject);
        this.f26253a.setForUserOrChat(tLObject, g9Var);
    }

    public void setHideAvatar(boolean z10) {
        this.e = z10;
        invalidate();
    }
}
