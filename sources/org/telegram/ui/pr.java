package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class pr extends Drawable {

    public final org.telegram.ui.ActionBar.c6 f41412a;

    public final Paint f41413b = new Paint(1);

    public final Paint f41414c;
    public final Drawable d;

    public final RectF f41415e;

    public final org.telegram.ui.Components.i6 f41416f;

    public final org.telegram.ui.Components.i6 f41417g;
    public final Paint h;

    public final Path f41418i;

    public final Drawable f41419j;

    public int f41420k;

    public boolean f41421l;

    public final org.telegram.ui.Components.y5 f41422m;

    public pr(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f41414c = paint;
        this.f41415e = new RectF();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f41416f = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f41417g = i6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f41418i = path;
        this.f41422m = new org.telegram.ui.Components.y5(new ti(this, 12), 320L, org.telegram.ui.Components.er.h, 0);
        or orVar = new or(0, this);
        this.f41412a = c6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f41419j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.r(-16777216);
        i6Var.t(AndroidUtilities.dp(7.0f));
        i6Var.setCallback(orVar);
        i6Var.f29239b = 17;
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var2.r(-16777216);
        i6Var2.t(AndroidUtilities.dp(7.0f));
        i6Var2.setCallback(orVar);
        i6Var2.f29239b = 17;
        i6Var2.G = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f41421l == z10) {
            return;
        }
        this.f41421l = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float fE = this.f41422m.e(this.f41421l);
        float fDp = AndroidUtilities.dp(5.0f);
        org.telegram.ui.Components.i6 i6Var = this.f41416f;
        float fD = i6Var.d() + (i6Var.g() * fDp);
        float fDp2 = AndroidUtilities.dp(5.0f);
        org.telegram.ui.Components.i6 i6Var2 = this.f41417g;
        float fD2 = i6Var2.d() + (i6Var2.g() * fDp2);
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        if (fD > 0.0f || fD2 > 0.0f || fE > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        } else {
            canvas2 = canvas;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (bounds.width() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f), (bounds.height() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.f41413b;
        paint.setColor(-1);
        float fWidth = (bounds.width() * 0.98f) + bounds.left;
        float fHeight = (bounds.height() * 0.18f) + bounds.top;
        float fHeight2 = (bounds.height() * 0.78f) + bounds.top;
        float fDp3 = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.f41414c;
        RectF rectF = this.f41415e;
        if (fD > 0.0f) {
            f10 = fDp3;
            float f13 = f10 / 2.0f;
            f11 = fHeight;
            rectF.set(fWidth - fD, f11 - f13, fWidth, f11 + f13);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f10 = fDp3;
            f11 = fHeight;
        }
        if (fD2 > 0.0f) {
            float f14 = f10 / 2.0f;
            rectF.set(fWidth - fD2, fHeight2 - f14, fWidth, fHeight2 + f14);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        }
        float f15 = 1.0f - fE;
        if (fD * f15 > 0.0f) {
            paint.setAlpha((int) (i6Var.g() * 255.0f * f15));
            i6Var.f29257w = (int) (i6Var.g() * 255.0f * f15);
            float f16 = f10 / 2.0f;
            rectF.set(fWidth - fD, f11 - f16, fWidth, f11 + f16);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            i6Var.m(rectF);
            i6Var.draw(canvas2);
        }
        if (fE > 0.0f) {
            canvas2.save();
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f41412a);
            int i10 = this.f41420k;
            Drawable drawable2 = this.f41419j;
            if (i10 != iV0) {
                this.f41420k = iV0;
                drawable2.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
            }
            f12 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (fE * 255.0f));
            float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, fE);
            canvas2.scale(fLerp, fLerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (fE > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f41418i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f12 = 255.0f;
        }
        if (fD2 > 0.0f) {
            paint.setAlpha((int) (i6Var2.g() * f12));
            i6Var2.f29257w = (int) (i6Var2.g() * f12);
            float f17 = f10 / 2.0f;
            rectF.set(fWidth - fD2, fHeight2 - f17, fWidth, fHeight2 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            i6Var2.m(rectF);
            i6Var2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
