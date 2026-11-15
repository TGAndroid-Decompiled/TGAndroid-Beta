package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public final class if0 extends cg0 {
    public final Drawable R;
    public final Drawable S;
    public final oy0 T;
    public oy0 U;
    public final Paint V;
    public final Path W;
    public float f35604a0;
    public final DecimalFormat f35605b0;

    public if0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.V = paint;
        Path path = new Path();
        this.W = path;
        this.f35605b0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.R = i5.c.g(context, 2131232581);
        this.S = i5.c.g(context, 2131232582);
        this.T = new oy0(org.telegram.messenger.hd.M0(2131745155, null) + ":", 11.0f, null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.16f));
        path.moveTo(0.0f, -org.telegram.messenger.g0.N(3.33f));
        path.lineTo(org.telegram.messenger.g0.N(3.16f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.N(3.33f));
        setBalance(0L);
    }

    @Override
    public final void b(Canvas canvas, float f10) {
        Drawable drawable;
        float height = getHeight() / 2.0f;
        canvas.translate(0.0f, (-org.telegram.messenger.g0.L(20.0f)) * this.f35604a0);
        float f11 = f10 * 0.85f;
        this.T.c(0.0f, height, f11, this.F, canvas);
        canvas.translate(this.T.k() + org.telegram.messenger.g0.L(4.0f), 0.0f);
        if (!this.G && this.H < 0.8f) {
            drawable = this.R;
        } else {
            drawable = this.S;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int i7 = ((int) height) - (L / 2);
        drawable.setBounds(0, i7, L, i7 + L);
        drawable.setAlpha((int) (255.0f * f10));
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(2.0f) + L, 0.0f);
        this.U.c(0.0f, height, f10, this.F, canvas);
        canvas.translate(org.telegram.messenger.g0.N(4.8f) + this.U.k(), height);
        int r12 = org.telegram.ui.ActionBar.j6.r1(f11, this.F);
        Paint paint = this.V;
        paint.setColor(r12);
        canvas.drawPath(this.W, paint);
    }

    @Override
    public final float c(float f10) {
        oy0 oy0Var = this.T;
        oy0Var.f38114p = -1.0f;
        this.U.f38114p = -1.0f;
        float max = Math.max(0.0f, f10 - org.telegram.messenger.g0.L(43.0f));
        oy0Var.f38114p = Math.max(0.0f, max - this.U.k());
        this.U.f38114p = Math.max(0.0f, max - oy0Var.k());
        return this.U.k() + oy0Var.k() + org.telegram.messenger.g0.L(27.0f);
    }

    public void setBalance(long j3) {
        String format = this.f35605b0.format(new BigDecimal(org.telegram.ui.Wallet.l0.p(j3, false)));
        this.U = new oy0(format, 11.0f, org.telegram.messenger.g0.o());
        setContentDescription(org.telegram.messenger.hd.M0(2131745155, null) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f10) {
        if (this.f35604a0 == f10) {
            return;
        }
        this.f35604a0 = f10;
        invalidate();
    }
}
