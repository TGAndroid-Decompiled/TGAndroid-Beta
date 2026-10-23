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
public final class ai0 extends si0 {
    public final Drawable T;
    public final Drawable U;
    public final f11 V;
    public f11 W;
    public final Paint f24628a0;
    public final Path f24629b0;
    public float f24630c0;
    public final DecimalFormat f24631d0;

    public ai0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f24628a0 = paint;
        Path path = new Path();
        this.f24629b0 = path;
        this.f24631d0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.T = context.getResources().getDrawable(R.drawable.profile_balance_gram).mutate();
        this.U = context.getResources().getDrawable(R.drawable.profile_balance_gram_color).mutate();
        this.V = new f11(LocaleController.getString(R.string.StarsBalance) + ":", 11.0f, null);
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
        canvas.translate(0.0f, (-AndroidUtilities.dp(20.0f)) * this.f24630c0);
        float f10 = f7 * 0.85f;
        this.V.c(0.0f, height, f10, this.F, canvas);
        canvas.translate(this.V.l() + AndroidUtilities.dp(4.0f), 0.0f);
        if (!this.G && this.H < 0.8f) {
            drawable = this.T;
        } else {
            drawable = this.U;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int i10 = ((int) height) - (dp / 2);
        drawable.setBounds(0, i10, dp, i10 + dp);
        drawable.setAlpha((int) (255.0f * f7));
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(2.0f) + dp, 0.0f);
        this.W.c(0.0f, height, f7, this.F, canvas);
        canvas.translate(AndroidUtilities.dpf2(4.8f) + this.W.l(), height);
        int m12 = org.telegram.ui.ActionBar.h6.m1(f10, this.F);
        Paint paint = this.f24628a0;
        paint.setColor(m12);
        canvas.drawPath(this.f24629b0, paint);
    }

    @Override
    public final float e(float f7) {
        f11 f11Var = this.V;
        f11Var.f26035p = -1.0f;
        this.W.f26035p = -1.0f;
        float max = Math.max(0.0f, f7 - AndroidUtilities.dp(43.0f));
        f11Var.f26035p = Math.max(0.0f, max - this.W.l());
        this.W.f26035p = Math.max(0.0f, max - f11Var.l());
        return this.W.l() + f11Var.l() + AndroidUtilities.dp(27.0f);
    }

    public void setBalance(long j10) {
        String format = this.f24631d0.format(new BigDecimal(org.telegram.ui.Wallet.m0.o(j10, false)));
        this.W = new f11(format, 11.0f, AndroidUtilities.bold());
        setContentDescription(LocaleController.getString(R.string.StarsBalance) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f7) {
        if (this.f24630c0 == f7) {
            return;
        }
        this.f24630c0 = f7;
        invalidate();
    }
}
