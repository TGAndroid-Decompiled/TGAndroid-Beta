package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
public final class cs0 extends View {
    public final Paint f36535a;
    public final org.telegram.ui.Components.e6 f36536b;
    public final TextPaint f36537c;
    public StaticLayout d;
    public float e;
    public float f36538f;
    public final org.telegram.ui.Components.e6 h;
    public String f36539n;
    public boolean f36540r;
    public final org.telegram.ui.Components.t5 f36541s;
    public boolean f36542w;
    public int f36543x;

    public cs0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f36535a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f36537c = textPaint;
        this.f36540r = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f36541s = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.f36536b = e6Var;
        e6Var.n(0.3f, 320L, grVar);
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.setCallback(this);
        e6Var.t("0", true, true);
        Point point = org.telegram.messenger.i0.f16026q;
        e6Var.M = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        c();
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, true, true);
        this.h = e6Var2;
        e6Var2.n(0.3f, 320L, grVar);
        e6Var2.u(-1);
        e6Var2.w(org.telegram.messenger.i0.L(14.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var2.setCallback(this);
        e6Var2.t("0", true, true);
        e6Var2.M = point.x;
    }

    public final void a(int i10, int i11) {
        b(i10, i11, true);
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        boolean z11;
        boolean z12 = false;
        int max = Math.max(0, i10);
        int max2 = Math.max(max, i11);
        if (org.telegram.messenger.cd.D0().B != null && !TextUtils.equals(this.f36539n, org.telegram.messenger.cd.D0().B.f19497c)) {
            c();
        }
        if (org.telegram.messenger.cd.X) {
            i12 = max2;
        } else {
            i12 = max;
        }
        String format = String.format("%d", Integer.valueOf(i12));
        if (z10 && !this.f36542w && !org.telegram.messenger.cd.X) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36536b.t(format, z11, true);
        if (!org.telegram.messenger.cd.X) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.f36542w && !org.telegram.messenger.cd.X) {
            z12 = true;
        }
        this.h.t(format2, z12, true);
        this.f36542w = !z10;
    }

    public final void c() {
        this.f36539n = org.telegram.messenger.cd.D0().B.f19497c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.cd.L0(2131747845, null).replace("%1$d", "").replace("%2$d", ""), this.f36537c, org.telegram.messenger.i0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.e = this.d.getLineWidth(0);
            this.f36538f = this.d.getLineDescent(0);
            return;
        }
        this.e = 0.0f;
        this.f36538f = 0.0f;
    }

    public final void d(boolean z10, boolean z11) {
        float f7;
        if (this.f36540r != z10) {
            this.f36540r = z10;
            if (!z10) {
                this.f36542w = true;
            }
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.f36541s.e(true, f7);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f36540r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f36540r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = this.f36541s.e(false, f7);
        if (e <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.e6 e6Var = this.f36536b;
        float c10 = e6Var.c() + this.e;
        org.telegram.ui.Components.e6 e6Var2 = this.h;
        float c11 = e6Var2.c() + c10 + org.telegram.messenger.i0.L(18.0f);
        float f10 = ((1.0f - e) * (-org.telegram.messenger.i0.L(8.0f))) + this.f36543x;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - c11) / 2.0f, org.telegram.messenger.i0.N(10.0f) + f10, (getWidth() + c11) / 2.0f, org.telegram.messenger.i0.N(33.0f) + f10);
        Paint paint = this.f36535a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + org.telegram.messenger.i0.L(9.0f), f10 + org.telegram.messenger.i0.L(9.5f));
        e6Var.setBounds(0, 0, (int) e6Var.c(), org.telegram.messenger.i0.L(23.0f));
        int i10 = (int) (e * 255.0f);
        e6Var.B = i10;
        e6Var.draw(canvas);
        canvas.translate(e6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f36538f / 2.0f) + (org.telegram.messenger.i0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.f36537c.setAlpha(i10);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        e6Var2.setBounds(0, 0, (int) e6Var2.c(), org.telegram.messenger.i0.L(23.0f));
        e6Var2.B = i10;
        e6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f36543x = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m;
        this.f36536b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.z20.B(43.0f, this.f36543x, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f36536b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
