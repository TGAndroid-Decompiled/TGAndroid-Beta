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
public final class gf0 extends ag0 {
    public final Drawable Q;
    public final Drawable R;
    public final ny0 S;
    public ny0 T;
    public final Paint U;
    public final Path V;
    public float W;
    public final DecimalFormat f33945a0;

    public gf0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.U = paint;
        Path path = new Path();
        this.V = path;
        this.f33945a0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.Q = jg.g.h(context, 2131232580);
        this.R = jg.g.h(context, 2131232581);
        this.S = new ny0(org.telegram.messenger.id.M0(2131745155, null) + ":", 11.0f, null);
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
        canvas.translate(0.0f, (-org.telegram.messenger.g0.L(20.0f)) * this.W);
        float f11 = f10 * 0.85f;
        this.S.c(0.0f, height, f11, this.E, canvas);
        canvas.translate(this.S.k() + org.telegram.messenger.g0.L(4.0f), 0.0f);
        if (!this.F && this.G < 0.8f) {
            drawable = this.Q;
        } else {
            drawable = this.R;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int i7 = ((int) height) - (L / 2);
        drawable.setBounds(0, i7, L, i7 + L);
        drawable.setAlpha((int) (255.0f * f10));
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(2.0f) + L, 0.0f);
        this.T.c(0.0f, height, f10, this.E, canvas);
        canvas.translate(org.telegram.messenger.g0.N(4.8f) + this.T.k(), height);
        int r12 = org.telegram.ui.ActionBar.l6.r1(f11, this.E);
        Paint paint = this.U;
        paint.setColor(r12);
        canvas.drawPath(this.V, paint);
    }

    @Override
    public final float c(float f10) {
        ny0 ny0Var = this.S;
        ny0Var.f36552p = -1.0f;
        this.T.f36552p = -1.0f;
        float max = Math.max(0.0f, f10 - org.telegram.messenger.g0.L(43.0f));
        ny0Var.f36552p = Math.max(0.0f, max - this.T.k());
        this.T.f36552p = Math.max(0.0f, max - ny0Var.k());
        return this.T.k() + ny0Var.k() + org.telegram.messenger.g0.L(27.0f);
    }

    public void setBalance(long j3) {
        String format = this.f33945a0.format(new BigDecimal(org.telegram.ui.Wallet.l0.p(j3, false)));
        this.T = new ny0(format, 11.0f, org.telegram.messenger.g0.o());
        setContentDescription(org.telegram.messenger.id.M0(2131745155, null) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f10) {
        if (this.W == f10) {
            return;
        }
        this.W = f10;
        invalidate();
    }
}
