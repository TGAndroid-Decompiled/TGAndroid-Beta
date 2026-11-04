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
public final class z41 extends View {
    public final g6 f40911a;
    public final g6 f40912b;
    public final Paint f40913c;
    public final Paint d;
    public final Paint f40914e;
    public boolean f40915f;
    public final u5 h;
    public final int[] f40916n;

    public z41(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40913c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f40914e = paint3;
        xq xqVar = xq.h;
        this.h = new u5(this, 0L, 300L, xqVar);
        this.f40916n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        g6 g6Var = new g6(true, false, false);
        this.f40911a = g6Var;
        g6Var.n(0.4f, 360L, xqVar);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.N(10.6f));
        g6Var.setCallback(this);
        g6Var.f33983b = 17;
        g6 g6Var2 = new g6(true, false, false);
        this.f40912b = g6Var2;
        g6Var2.n(0.2f, 360L, xqVar);
        g6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var2.u(-1);
        g6Var2.w(org.telegram.messenger.g0.N(8.6f));
        g6Var2.setCallback(this);
        g6Var2.f33983b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        g6Var2.f33981a.setXfermode(new PorterDuffXfermode(mode));
        g6Var2.M = org.telegram.messenger.g0.f22608q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i3, boolean z10, boolean z11) {
        boolean z12;
        String str;
        if (z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f40915f = z12;
        g6 g6Var = this.f40911a;
        g6 g6Var2 = this.f40912b;
        if (z11) {
            g6Var.t("GIF", true, true);
            g6Var2.t("", true, true);
        } else {
            if (i3 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            g6Var.t(str, true, true);
            int[] iArr = this.f40916n;
            int length = iArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (i3 >= iArr[length]) {
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
                g6Var2.t("2K", TextUtils.isEmpty(g6Var2.f33989i), true);
            } else if (length == 7) {
                g6Var2.t("4K", TextUtils.isEmpty(g6Var2.f33989i), true);
            } else {
                g6Var2.t("" + iArr[length], TextUtils.isEmpty(g6Var2.f33989i), true);
            }
        }
        setClickable(!this.f40915f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float B = com.google.android.recaptcha.internal.a.B(this.h.d(this.f40915f), 0.35f, 1.0f, 255.0f);
        int i3 = (int) B;
        Paint paint = this.f40913c;
        paint.setAlpha(i3);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        float N = org.telegram.messenger.g0.N(21.33f);
        float N2 = org.telegram.messenger.g0.N(6.0f);
        g6 g6Var = this.f40911a;
        float max = Math.max(N, g6Var.c() + N2);
        float N3 = org.telegram.messenger.g0.N(17.33f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        g6Var.setBounds(rect);
        g6Var.B = i3;
        g6Var.draw(canvas);
        g6 g6Var2 = this.f40912b;
        float c2 = g6Var2.c() + (org.telegram.messenger.g0.N(2.0f) * g6Var2.i());
        float N4 = org.telegram.messenger.g0.N(8.33f);
        rect.set((int) ((org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)) - c2), (int) ((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)), (int) (org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.g0.N(1.33f), -org.telegram.messenger.g0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), this.f40914e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (g6Var2.i() * B));
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
        this.f40915f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f40911a.t(str, true, true);
        this.f40912b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f40911a != drawable && this.f40912b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
