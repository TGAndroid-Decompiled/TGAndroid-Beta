package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class rc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.b6 f32130a;
    public final Paint f32131b = new Paint(1);
    public final nz0 f32132c;
    public final Runnable d;
    public pc f32133e;
    public Integer f32134f;

    public rc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f32130a = b6Var;
        this.d = runnable;
        this.f32132c = new nz0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        rc rcVar = new rc(charSequence, runnable, b6Var);
        spannableString.setSpan(rcVar, 0, spannableString.length(), 33);
        rcVar.f32134f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f32132c.f31223c + AndroidUtilities.dp(14.0f));
    }

    public final void c(qc qcVar, boolean z10) {
        if (this.f32133e == null) {
            this.f32133e = new pc(qcVar);
        }
        this.f32133e.c(z10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float a2;
        int v02;
        float dpf2 = AndroidUtilities.dpf2(17.0f);
        float f11 = (i11 + i13) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        pc pcVar = this.f32133e;
        if (pcVar == null) {
            a2 = 1.0f;
        } else {
            a2 = pcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f32134f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.f32130a);
        }
        int i14 = v02;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, i14);
        Paint paint2 = this.f32131b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f32132c.c(f10 + AndroidUtilities.dp(7.0f), f11, 1.0f, i14, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
