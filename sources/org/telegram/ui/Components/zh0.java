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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 extends ri0 {
    public final Drawable R;
    public final Drawable S;
    public final d11 T;
    public d11 U;
    public final Paint V;
    public final Path W;
    public float f32931a0;
    public final DecimalFormat f32932b0;

    public zh0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        Paint paint = new Paint(1);
        this.V = paint;
        Path path = new Path();
        this.W = path;
        this.f32932b0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.R = context.getResources().getDrawable(R.drawable.profile_balance_gram).mutate();
        this.S = context.getResources().getDrawable(R.drawable.profile_balance_gram_color).mutate();
        this.T = new d11(LocaleController.getString(R.string.StarsBalance) + ":", 11.0f, null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.16f));
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setBalance(0L);
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        Drawable drawable;
        float height = getHeight() / 2.0f;
        canvas.translate(0.0f, (-AndroidUtilities.dp(20.0f)) * this.f32931a0);
        float f10 = f7 * 0.85f;
        this.T.c(0.0f, height, f10, this.H, canvas);
        canvas.translate(this.T.l() + AndroidUtilities.dp(4.0f), 0.0f);
        if (!this.I && this.J < 0.8f) {
            drawable = this.R;
        } else {
            drawable = this.S;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int i10 = ((int) height) - (dp / 2);
        drawable.setBounds(0, i10, dp, i10 + dp);
        drawable.setAlpha((int) (255.0f * f7));
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(2.0f) + dp, 0.0f);
        this.U.c(0.0f, height, f7, this.H, canvas);
        canvas.translate(AndroidUtilities.dpf2(4.8f) + this.U.l(), height);
        int m12 = org.telegram.ui.ActionBar.h6.m1(f10, this.H);
        Paint paint = this.V;
        paint.setColor(m12);
        canvas.drawPath(this.W, paint);
    }

    @Override
    public final float e(float f7) {
        d11 d11Var = this.T;
        d11Var.f25447p = -1.0f;
        this.U.f25447p = -1.0f;
        float max = Math.max(0.0f, f7 - AndroidUtilities.dp(43.0f));
        d11Var.f25447p = Math.max(0.0f, max - this.U.l());
        this.U.f25447p = Math.max(0.0f, max - d11Var.l());
        return this.U.l() + d11Var.l() + AndroidUtilities.dp(27.0f);
    }

    public void setBalance(long j10) {
        String format = this.f32932b0.format(new BigDecimal(org.telegram.ui.Wallet.m0.n(j10, false)));
        this.U = new d11(format, 11.0f, AndroidUtilities.bold());
        setContentDescription(LocaleController.getString(R.string.StarsBalance) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f7) {
        if (this.f32931a0 == f7) {
            return;
        }
        this.f32931a0 = f7;
        invalidate();
    }
}
