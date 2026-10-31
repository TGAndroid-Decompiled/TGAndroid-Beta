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
public final class i61 extends View {
    public final e6 f26895a;
    public final e6 f26896b;
    public final Paint f26897c;
    public final Paint d;
    public final Paint e;
    public boolean f26898f;
    public final t5 h;
    public final int[] f26899n;

    public i61(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f26897c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        gr grVar = gr.h;
        this.h = new t5(this, 0L, 300L, grVar);
        this.f26899n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        e6 e6Var = new e6(true, false, false);
        this.f26895a = e6Var;
        e6Var.n(0.4f, 360L, grVar);
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.N(10.6f));
        e6Var.setCallback(this);
        e6Var.f25695b = 17;
        e6 e6Var2 = new e6(true, false, false);
        this.f26896b = e6Var2;
        e6Var2.n(0.2f, 360L, grVar);
        e6Var2.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var2.u(-1);
        e6Var2.w(org.telegram.messenger.i0.N(8.6f));
        e6Var2.setCallback(this);
        e6Var2.f25695b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        e6Var2.f25693a.setXfermode(new PorterDuffXfermode(mode));
        e6Var2.M = org.telegram.messenger.i0.f16026q.x;
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
        this.f26898f = z12;
        e6 e6Var = this.f26895a;
        e6 e6Var2 = this.f26896b;
        if (z11) {
            e6Var.t("GIF", true, true);
            e6Var2.t("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            e6Var.t(str, true, true);
            int[] iArr = this.f26899n;
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
                e6Var2.t("", true, true);
            } else if (length == 6) {
                e6Var2.t("2K", TextUtils.isEmpty(e6Var2.f25700i), true);
            } else if (length == 7) {
                e6Var2.t("4K", TextUtils.isEmpty(e6Var2.f25700i), true);
            } else {
                e6Var2.t("" + iArr[length], TextUtils.isEmpty(e6Var2.f25700i), true);
            }
        }
        setClickable(!this.f26898f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float D = c3.i0.D(this.h.d(this.f26898f), 0.35f, 1.0f, 255.0f);
        int i10 = (int) D;
        Paint paint = this.f26897c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.33f));
        float N = org.telegram.messenger.i0.N(21.33f);
        float N2 = org.telegram.messenger.i0.N(6.0f);
        e6 e6Var = this.f26895a;
        float max = Math.max(N, e6Var.c() + N2);
        float N3 = org.telegram.messenger.i0.N(17.33f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        e6Var.setBounds(rect);
        e6Var.B = i10;
        e6Var.draw(canvas);
        e6 e6Var2 = this.f26896b;
        float c10 = e6Var2.c() + (org.telegram.messenger.i0.N(2.0f) * e6Var2.i());
        float N4 = org.telegram.messenger.i0.N(8.33f);
        rect.set((int) ((org.telegram.messenger.i0.N(16.0f) + (getWidth() / 2.0f)) - c10), (int) ((getHeight() / 2.0f) - org.telegram.messenger.i0.N(14.0f)), (int) (org.telegram.messenger.i0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.i0.N(14.0f)) + N4));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.i0.N(1.33f), -org.telegram.messenger.i0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(1.66f), org.telegram.messenger.i0.N(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (e6Var2.i() * D));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(1.66f), org.telegram.messenger.i0.N(1.66f), paint2);
        rect.offset((int) (-org.telegram.messenger.i0.N(1.33f)), 0);
        canvas.save();
        e6Var2.setBounds(rect);
        e6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f26898f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f26895a.t(str, true, true);
        this.f26896b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f26895a != drawable && this.f26896b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
