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
public final class mw0 extends View {
    public final ImageReceiver f30764a;
    public final j9 f30765b;
    public final Paint f30766c;
    public float d;
    public boolean e;
    public ValueAnimator f30767f;

    public mw0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f30764a = imageReceiver;
        this.f30765b = new j9((org.telegram.ui.ActionBar.u6) null);
        Paint paint = new Paint(1);
        this.f30766c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f30767f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        if (z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.d, f7).setDuration(200L);
            duration.setInterpolator(ds.f27586f);
            duration.addUpdateListener(new e80(this, 22));
            duration.addListener(new i10(this, 23));
            duration.start();
            this.f30767f = duration;
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
        this.f30764a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30764a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f7 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f7, f7);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23519m5, false);
        Paint paint = this.f30766c;
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
            ImageReceiver imageReceiver = this.f30764a;
            imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
            imageReceiver.draw(canvas);
        }
    }

    public void setAvatar(TLObject tLObject) {
        j9 j9Var = this.f30765b;
        j9Var.p(tLObject);
        this.f30764a.setForUserOrChat(tLObject, j9Var);
    }

    public void setHideAvatar(boolean z10) {
        this.e = z10;
        invalidate();
    }
}
