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
public final class g51 extends View {
    public final h6 f33803a;
    public final h6 f33804b;
    public final Paint f33805c;
    public final Paint d;
    public final Paint f33806e;
    public boolean f33807f;
    public final v5 h;
    public final int[] f33808n;

    public g51(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f33805c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f33806e = paint3;
        wq wqVar = wq.h;
        this.h = new v5(this, 0L, 300L, wqVar);
        this.f33808n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        h6 h6Var = new h6(true, false, false);
        this.f33803a = h6Var;
        h6Var.n(0.4f, 360L, wqVar);
        h6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        h6Var.u(-1);
        h6Var.w(org.telegram.messenger.g0.N(10.6f));
        h6Var.setCallback(this);
        h6Var.f34187b = 17;
        h6 h6Var2 = new h6(true, false, false);
        this.f33804b = h6Var2;
        h6Var2.n(0.2f, 360L, wqVar);
        h6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        h6Var2.u(-1);
        h6Var2.w(org.telegram.messenger.g0.N(8.6f));
        h6Var2.setCallback(this);
        h6Var2.f34187b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        h6Var2.f34185a.setXfermode(new PorterDuffXfermode(mode));
        h6Var2.M = org.telegram.messenger.g0.f22567q.x;
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
        this.f33807f = z11;
        h6 h6Var = this.f33803a;
        h6 h6Var2 = this.f33804b;
        if (z10) {
            h6Var.t("GIF", true, true);
            h6Var2.t("", true, true);
        } else {
            if (i7 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            h6Var.t(str, true, true);
            int[] iArr = this.f33808n;
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
                h6Var2.t("", true, true);
            } else if (length == 6) {
                h6Var2.t("2K", TextUtils.isEmpty(h6Var2.f34193i), true);
            } else if (length == 7) {
                h6Var2.t("4K", TextUtils.isEmpty(h6Var2.f34193i), true);
            } else {
                h6Var2.t("" + iArr[length], TextUtils.isEmpty(h6Var2.f34193i), true);
            }
        }
        setClickable(!this.f33807f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float C = com.google.android.recaptcha.internal.a.C(this.h.d(this.f33807f), 0.35f, 1.0f, 255.0f);
        int i7 = (int) C;
        Paint paint = this.f33805c;
        paint.setAlpha(i7);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        float N = org.telegram.messenger.g0.N(21.33f);
        float N2 = org.telegram.messenger.g0.N(6.0f);
        h6 h6Var = this.f33803a;
        float max = Math.max(N, h6Var.c() + N2);
        float N3 = org.telegram.messenger.g0.N(17.33f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        h6Var.setBounds(rect);
        h6Var.B = i7;
        h6Var.draw(canvas);
        h6 h6Var2 = this.f33804b;
        float c10 = h6Var2.c() + (org.telegram.messenger.g0.N(2.0f) * h6Var2.i());
        float N4 = org.telegram.messenger.g0.N(8.33f);
        rect.set((int) ((org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)) - c10), (int) ((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)), (int) (org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.g0.N(1.33f), -org.telegram.messenger.g0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), this.f33806e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (h6Var2.i() * C));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), paint2);
        rect.offset((int) (-org.telegram.messenger.g0.N(1.33f)), 0);
        canvas.save();
        h6Var2.setBounds(rect);
        h6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z9) {
        String str;
        this.f33807f = false;
        if (z9) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f33803a.t(str, true, true);
        this.f33804b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33803a != drawable && this.f33804b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
