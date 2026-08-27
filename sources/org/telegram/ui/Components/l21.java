package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class l21 extends View {

    public float f30269a;

    public final Paint f30270b;

    public final Paint f30271c;
    public Drawable d;

    public boolean f30272e;

    public int f30273f;
    public final RectF h;

    public l21(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f30270b = paint;
        Paint paint2 = new Paint(1);
        this.f30271c = paint2;
        this.f30272e = true;
        this.f30273f = 0;
        this.h = new RectF();
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f30272e) {
            float fDp = AndroidUtilities.dp(((this.f30273f == 0 ? this.f30269a : 1.0f) * 26.0f) + 6.0f);
            float width = getWidth();
            float height = getHeight();
            RectF rectF = this.h;
            rectF.set(0.0f, 0.0f, width, height);
            canvas2.drawRoundRect(rectF, fDp, fDp, this.f30270b);
        }
        int i10 = this.f30273f;
        Paint paint = this.f30271c;
        if (i10 == 0) {
            float fMax = (Math.max(0.4f, this.f30269a) - 0.4f) / 0.6f;
            if (fMax != 0.0f) {
                float fZ = (org.telegram.messenger.rl.z(21.0f, 2, getWidth()) * fMax) + AndroidUtilities.dp(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height2, fZ, height2, paint);
                double dDp = AndroidUtilities.dp(9.0f) * fMax;
                float fCos = (float) (((double) fZ) - (Math.cos(0.7853981633974483d) * dDp));
                float fSin = (float) (Math.sin(0.7853981633974483d) * dDp);
                canvas2 = canvas;
                canvas2.drawLine(fZ, height2, fCos, height2 - fSin, paint);
                canvas2.drawLine(fZ, height2, fCos, height2 + fSin, paint);
            } else {
                canvas2 = canvas;
            }
        } else if (i10 == 1) {
            float fDp2 = AndroidUtilities.dp(21.0f);
            float width2 = getWidth() - AndroidUtilities.dp(21.0f);
            float height3 = getHeight() / 2.0f;
            canvas2.save();
            canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.f30269a, 0.0f);
            canvas2.rotate(this.f30269a * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(fDp2 + ((width2 - fDp2) * this.f30269a), height3, width2, height3, paint);
            int iDp = AndroidUtilities.dp((this.f30269a * (-1.0f)) + 9.0f);
            int iDp2 = AndroidUtilities.dp((this.f30269a * 7.0f) + 9.0f);
            double d = width2;
            double d10 = iDp;
            double d11 = height3;
            canvas.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d10)), (float) ((Math.sin(0.7853981633974483d) * d10) + d11), paint);
            double d12 = iDp2;
            canvas2 = canvas;
            canvas2.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d12)), (float) (d11 - (Math.sin(0.7853981633974483d) * d12)), paint);
            canvas.restore();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.d.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.d.draw(canvas2);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f30270b.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.f30271c.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z10) {
        this.f30272e = z10;
    }

    public void setProgress(float f10) {
        this.f30269a = f10;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.d = drawable;
        invalidate();
    }

    public void setTransformType(int i10) {
        this.f30273f = i10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Drawable drawable2 = this.d;
        return drawable2 != null && drawable == drawable2;
    }
}
