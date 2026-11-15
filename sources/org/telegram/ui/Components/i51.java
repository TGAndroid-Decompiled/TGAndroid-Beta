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
public final class i51 extends View {
    public final g6 f35455a;
    public final g6 f35456b;
    public final Paint f35457c;
    public final Paint d;
    public final Paint f35458e;
    public boolean f35459f;
    public final u5 h;
    public final int[] f35460n;

    public i51(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f35457c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f35458e = paint3;
        er erVar = er.h;
        this.h = new u5(this, 0L, 300L, erVar);
        this.f35460n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        g6 g6Var = new g6(true, false, false);
        this.f35455a = g6Var;
        g6Var.n(0.4f, 360L, erVar);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.N(10.6f));
        g6Var.setCallback(this);
        g6Var.f34829b = 17;
        g6 g6Var2 = new g6(true, false, false);
        this.f35456b = g6Var2;
        g6Var2.n(0.2f, 360L, erVar);
        g6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var2.u(-1);
        g6Var2.w(org.telegram.messenger.g0.N(8.6f));
        g6Var2.setCallback(this);
        g6Var2.f34829b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        g6Var2.f34827a.setXfermode(new PorterDuffXfermode(mode));
        g6Var2.N = org.telegram.messenger.g0.f23609q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i7, boolean z10, boolean z11) {
        boolean z12;
        String str;
        if (z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f35459f = z12;
        g6 g6Var = this.f35455a;
        g6 g6Var2 = this.f35456b;
        if (z11) {
            g6Var.t("GIF", true, true);
            g6Var2.t("", true, true);
        } else {
            if (i7 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            g6Var.t(str, true, true);
            int[] iArr = this.f35460n;
            int length = iArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (i7 >= iArr[length]) {
                        break;
                    }
                    length--;
                } else {
                    length = -1;
                    break;
                }
            }
            if (length < 0) {
                g6Var2.t("", true, true);
            } else if (length == 6) {
                g6Var2.t("2K", TextUtils.isEmpty(g6Var2.f34836i), true);
            } else if (length == 7) {
                g6Var2.t("4K", TextUtils.isEmpty(g6Var2.f34836i), true);
            } else {
                g6Var2.t("" + iArr[length], TextUtils.isEmpty(g6Var2.f34836i), true);
            }
        }
        setClickable(!this.f35459f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float C = com.google.android.gms.internal.vision.e2.C(this.h.d(this.f35459f), 0.35f, 1.0f, 255.0f);
        int i7 = (int) C;
        Paint paint = this.f35457c;
        paint.setAlpha(i7);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        float N = org.telegram.messenger.g0.N(21.33f);
        float N2 = org.telegram.messenger.g0.N(6.0f);
        g6 g6Var = this.f35455a;
        float max = Math.max(N, g6Var.c() + N2);
        float N3 = org.telegram.messenger.g0.N(17.33f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        g6Var.setBounds(rect);
        g6Var.C = i7;
        g6Var.draw(canvas);
        g6 g6Var2 = this.f35456b;
        float c10 = g6Var2.c() + (org.telegram.messenger.g0.N(2.0f) * g6Var2.i());
        float N4 = org.telegram.messenger.g0.N(8.33f);
        rect.set((int) ((org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)) - c10), (int) ((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)), (int) (org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.g0.N(1.33f), -org.telegram.messenger.g0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), this.f35458e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (g6Var2.i() * C));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), paint2);
        rect.offset((int) (-org.telegram.messenger.g0.N(1.33f)), 0);
        canvas.save();
        g6Var2.setBounds(rect);
        g6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f35459f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f35455a.t(str, true, true);
        this.f35456b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f35455a != drawable && this.f35456b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
