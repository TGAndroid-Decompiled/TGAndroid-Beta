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
public final class a51 extends View {
    public final i6 f31679a;
    public final i6 f31680b;
    public final Paint f31681c;
    public final Paint d;
    public final Paint f31682e;
    public boolean f31683f;
    public final w5 h;
    public final int[] f31684n;

    public a51(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f31681c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f31682e = paint3;
        xq xqVar = xq.h;
        this.h = new w5(this, 0L, 300L, xqVar);
        this.f31684n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        i6 i6Var = new i6(true, false, false);
        this.f31679a = i6Var;
        i6Var.n(0.4f, 360L, xqVar);
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.N(10.6f));
        i6Var.setCallback(this);
        i6Var.f34516b = 17;
        i6 i6Var2 = new i6(true, false, false);
        this.f31680b = i6Var2;
        i6Var2.n(0.2f, 360L, xqVar);
        i6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var2.u(-1);
        i6Var2.w(org.telegram.messenger.g0.N(8.6f));
        i6Var2.setCallback(this);
        i6Var2.f34516b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        i6Var2.f34514a.setXfermode(new PorterDuffXfermode(mode));
        i6Var2.M = org.telegram.messenger.g0.f22537q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i7, boolean z9, boolean z10) {
        boolean z11;
        String str;
        if (z9 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f31683f = z11;
        i6 i6Var = this.f31679a;
        i6 i6Var2 = this.f31680b;
        if (z10) {
            i6Var.t("GIF", true, true);
            i6Var2.t("", true, true);
        } else {
            if (i7 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            i6Var.t(str, true, true);
            int[] iArr = this.f31684n;
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
                i6Var2.t("", true, true);
            } else if (length == 6) {
                i6Var2.t("2K", TextUtils.isEmpty(i6Var2.f34522i), true);
            } else if (length == 7) {
                i6Var2.t("4K", TextUtils.isEmpty(i6Var2.f34522i), true);
            } else {
                i6Var2.t("" + iArr[length], TextUtils.isEmpty(i6Var2.f34522i), true);
            }
        }
        setClickable(!this.f31683f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float C = com.google.android.recaptcha.internal.a.C(this.h.d(this.f31683f), 0.35f, 1.0f, 255.0f);
        int i7 = (int) C;
        Paint paint = this.f31681c;
        paint.setAlpha(i7);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        float N = org.telegram.messenger.g0.N(21.33f);
        float N2 = org.telegram.messenger.g0.N(6.0f);
        i6 i6Var = this.f31679a;
        float max = Math.max(N, i6Var.c() + N2);
        float N3 = org.telegram.messenger.g0.N(17.33f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        i6Var.setBounds(rect);
        i6Var.B = i7;
        i6Var.draw(canvas);
        i6 i6Var2 = this.f31680b;
        float c10 = i6Var2.c() + (org.telegram.messenger.g0.N(2.0f) * i6Var2.i());
        float N4 = org.telegram.messenger.g0.N(8.33f);
        rect.set((int) ((org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)) - c10), (int) ((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)), (int) (org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.g0.N(1.33f), -org.telegram.messenger.g0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), this.f31682e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (i6Var2.i() * C));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), paint2);
        rect.offset((int) (-org.telegram.messenger.g0.N(1.33f)), 0);
        canvas.save();
        i6Var2.setBounds(rect);
        i6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z9) {
        String str;
        this.f31683f = false;
        if (z9) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f31679a.t(str, true, true);
        this.f31680b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31679a != drawable && this.f31680b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
