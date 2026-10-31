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
public final class ig0 extends bh0 {
    public final Drawable Q;
    public final Drawable R;
    public final qz0 S;
    public qz0 T;
    public final Paint U;
    public final Path V;
    public float W;
    public final DecimalFormat f26977a0;

    public ig0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.U = paint;
        Path path = new Path();
        this.V = path;
        this.f26977a0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.Q = i0.a.f(context, 2131232577);
        this.R = i0.a.f(context, 2131232578);
        this.S = new qz0(org.telegram.messenger.cd.L0(2131745173, null) + ":", 11.0f, null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.16f));
        path.moveTo(0.0f, -org.telegram.messenger.i0.N(3.33f));
        path.lineTo(org.telegram.messenger.i0.N(3.16f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.i0.N(3.33f));
        setBalance(0L);
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        Drawable drawable;
        float height = getHeight() / 2.0f;
        canvas.translate(0.0f, (-org.telegram.messenger.i0.L(20.0f)) * this.W);
        float f10 = f7 * 0.85f;
        this.S.c(0.0f, height, f10, this.E, canvas);
        canvas.translate(this.S.k() + org.telegram.messenger.i0.L(4.0f), 0.0f);
        if (!this.F && this.G < 0.8f) {
            drawable = this.Q;
        } else {
            drawable = this.R;
        }
        int L = org.telegram.messenger.i0.L(13.0f);
        int i10 = ((int) height) - (L / 2);
        drawable.setBounds(0, i10, L, i10 + L);
        drawable.setAlpha((int) (255.0f * f7));
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.i0.L(2.0f) + L, 0.0f);
        this.T.c(0.0f, height, f7, this.E, canvas);
        canvas.translate(org.telegram.messenger.i0.N(4.8f) + this.T.k(), height);
        int r12 = org.telegram.ui.ActionBar.t6.r1(f10, this.E);
        Paint paint = this.U;
        paint.setColor(r12);
        canvas.drawPath(this.V, paint);
    }

    @Override
    public final float c(float f7) {
        qz0 qz0Var = this.S;
        qz0Var.f29784p = -1.0f;
        this.T.f29784p = -1.0f;
        float max = Math.max(0.0f, f7 - org.telegram.messenger.i0.L(43.0f));
        qz0Var.f29784p = Math.max(0.0f, max - this.T.k());
        this.T.f29784p = Math.max(0.0f, max - qz0Var.k());
        return this.T.k() + qz0Var.k() + org.telegram.messenger.i0.L(27.0f);
    }

    public void setBalance(long j10) {
        String format = this.f26977a0.format(new BigDecimal(org.telegram.ui.Wallet.k0.p(j10, false)));
        this.T = new qz0(format, 11.0f, org.telegram.messenger.i0.o());
        setContentDescription(org.telegram.messenger.cd.L0(2131745173, null) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f7) {
        if (this.W == f7) {
            return;
        }
        this.W = f7;
        invalidate();
    }
}
