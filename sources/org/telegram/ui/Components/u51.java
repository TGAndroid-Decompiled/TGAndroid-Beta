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
public final class u51 extends View {
    public final m6 f40278a;
    public final m6 f40279b;
    public final Paint f40280c;
    public final Paint d;
    public final Paint f40281e;
    public boolean f40282f;
    public final c6 h;
    public final int[] f40283n;

    public u51(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40280c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f40281e = paint3;
        kr krVar = kr.h;
        this.h = new c6(this, 0L, 300L, krVar);
        this.f40283n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        m6 m6Var = new m6(true, false, false);
        this.f40278a = m6Var;
        m6Var.n(0.4f, 360L, krVar);
        m6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        m6Var.u(-1);
        m6Var.w(org.telegram.messenger.g0.N(10.6f));
        m6Var.setCallback(this);
        m6Var.f37394b = 17;
        m6 m6Var2 = new m6(true, false, false);
        this.f40279b = m6Var2;
        m6Var2.n(0.2f, 360L, krVar);
        m6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        m6Var2.u(-1);
        m6Var2.w(org.telegram.messenger.g0.N(8.6f));
        m6Var2.setCallback(this);
        m6Var2.f37394b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        m6Var2.f37392a.setXfermode(new PorterDuffXfermode(mode));
        m6Var2.N = org.telegram.messenger.g0.f24226q.x;
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
        this.f40282f = z12;
        m6 m6Var = this.f40278a;
        m6 m6Var2 = this.f40279b;
        if (z11) {
            m6Var.t("GIF", true, true);
            m6Var2.t("", true, true);
        } else {
            if (i7 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            m6Var.t(str, true, true);
            int[] iArr = this.f40283n;
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
                m6Var2.t("", true, true);
            } else if (length == 6) {
                m6Var2.t("2K", TextUtils.isEmpty(m6Var2.f37401i), true);
            } else if (length == 7) {
                m6Var2.t("4K", TextUtils.isEmpty(m6Var2.f37401i), true);
            } else {
                m6Var2.t("" + iArr[length], TextUtils.isEmpty(m6Var2.f37401i), true);
            }
        }
        setClickable(!this.f40282f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float C = com.google.android.gms.internal.vision.e2.C(this.h.d(this.f40282f), 0.35f, 1.0f, 255.0f);
        int i7 = (int) C;
        Paint paint = this.f40280c;
        paint.setAlpha(i7);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        float N = org.telegram.messenger.g0.N(21.33f);
        float N2 = org.telegram.messenger.g0.N(6.0f);
        m6 m6Var = this.f40278a;
        float max = Math.max(N, m6Var.c() + N2);
        float N3 = org.telegram.messenger.g0.N(17.33f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        m6Var.setBounds(rect);
        m6Var.C = i7;
        m6Var.draw(canvas);
        m6 m6Var2 = this.f40279b;
        float c10 = m6Var2.c() + (org.telegram.messenger.g0.N(2.0f) * m6Var2.i());
        float N4 = org.telegram.messenger.g0.N(8.33f);
        rect.set((int) ((org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)) - c10), (int) ((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)), (int) (org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.g0.N(1.33f), -org.telegram.messenger.g0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), this.f40281e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (m6Var2.i() * C));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), paint2);
        rect.offset((int) (-org.telegram.messenger.g0.N(1.33f)), 0);
        canvas.save();
        m6Var2.setBounds(rect);
        m6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f40282f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f40278a.t(str, true, true);
        this.f40279b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f40278a != drawable && this.f40279b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
