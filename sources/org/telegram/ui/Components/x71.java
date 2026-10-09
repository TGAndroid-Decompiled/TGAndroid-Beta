package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x71 extends View {
    public final q6 f32763a;
    public final q6 f32764b;
    public final Paint f32765c;
    public final Paint d;
    public final Paint f32766e;
    public boolean f32767f;
    public final g6 h;
    public final int[] f32768n;

    public x71(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f32765c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f32766e = paint3;
        hs hsVar = hs.h;
        this.h = new g6(this, 0L, 300L, hsVar);
        this.f32768n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        q6 q6Var = new q6(true, false, false);
        this.f32763a = q6Var;
        q6Var.n(0.4f, 360L, hsVar);
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dpf2(10.6f));
        q6Var.setCallback(this);
        q6Var.f30065b = 17;
        q6 q6Var2 = new q6(true, false, false);
        this.f32764b = q6Var2;
        q6Var2.n(0.2f, 360L, hsVar);
        q6Var2.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var2.u(-1);
        q6Var2.w(AndroidUtilities.dpf2(8.6f));
        q6Var2.setCallback(this);
        q6Var2.f30065b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        q6Var2.f30063a.setXfermode(new PorterDuffXfermode(mode));
        q6Var2.M = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        boolean z12;
        String str;
        if (z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f32767f = z12;
        q6 q6Var = this.f32763a;
        q6 q6Var2 = this.f32764b;
        if (z11) {
            q6Var.t("GIF", true, true);
            q6Var2.t("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            q6Var.t(str, true, true);
            int[] iArr = this.f32768n;
            int length = iArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (i10 >= iArr[length]) {
                        break;
                    }
                    length--;
                } else {
                    length = -1;
                    break;
                }
            }
            if (length < 0) {
                q6Var2.t("", true, true);
            } else if (length == 6) {
                q6Var2.t("2K", TextUtils.isEmpty(q6Var2.f30071i), true);
            } else if (length == 7) {
                q6Var2.t("4K", TextUtils.isEmpty(q6Var2.f30071i), true);
            } else {
                q6Var2.t("" + iArr[length], TextUtils.isEmpty(q6Var2.f30071i), true);
            }
        }
        setClickable(!this.f32767f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float B = com.google.android.gms.internal.vision.e2.B(this.h.e(this.f32767f), 0.35f, 1.0f, 255.0f);
        int i10 = (int) B;
        Paint paint = this.f32765c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        q6 q6Var = this.f32763a;
        float max = Math.max(dpf2, q6Var.c() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        q6Var.setBounds(rect);
        q6Var.B = i10;
        q6Var.draw(canvas);
        q6 q6Var2 = this.f32764b;
        float c10 = q6Var2.c() + (AndroidUtilities.dpf2(2.0f) * q6Var2.i());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - c10), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.f32766e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (q6Var2.i() * B));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        q6Var2.setBounds(rect);
        q6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f32767f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f32763a.t(str, true, true);
        this.f32764b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32763a != drawable && this.f32764b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
