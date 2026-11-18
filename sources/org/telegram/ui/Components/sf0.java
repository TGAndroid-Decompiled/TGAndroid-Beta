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
public final class sf0 extends mg0 {
    public final Drawable R;
    public final Drawable S;
    public final vy0 T;
    public vy0 U;
    public final Paint V;
    public final Path W;
    public float f39616a0;
    public final DecimalFormat f39617b0;

    public sf0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.V = paint;
        Path path = new Path();
        this.W = path;
        this.f39617b0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.R = i5.c.g(context, 2131232582);
        this.S = i5.c.g(context, 2131232583);
        this.T = new vy0(org.telegram.messenger.gd.M0(2131744920, null) + ":", 11.0f, null);
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
        canvas.translate(0.0f, (-org.telegram.messenger.g0.L(20.0f)) * this.f39616a0);
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
        int r12 = org.telegram.ui.ActionBar.n6.r1(f11, this.F);
        Paint paint = this.V;
        paint.setColor(r12);
        canvas.drawPath(this.W, paint);
    }

    @Override
    public final float c(float f10) {
        vy0 vy0Var = this.T;
        vy0Var.f41493p = -1.0f;
        this.U.f41493p = -1.0f;
        float max = Math.max(0.0f, f10 - org.telegram.messenger.g0.L(43.0f));
        vy0Var.f41493p = Math.max(0.0f, max - this.U.k());
        this.U.f41493p = Math.max(0.0f, max - vy0Var.k());
        return this.U.k() + vy0Var.k() + org.telegram.messenger.g0.L(27.0f);
    }

    public void setBalance(long j3) {
        String format = this.f39617b0.format(new BigDecimal(org.telegram.ui.Wallet.u0.u(j3, false)));
        this.U = new vy0(format, 11.0f, org.telegram.messenger.g0.o());
        setContentDescription(org.telegram.messenger.gd.M0(2131744920, null) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f10) {
        if (this.f39616a0 == f10) {
            return;
        }
        this.f39616a0 = f10;
        invalidate();
    }
}
