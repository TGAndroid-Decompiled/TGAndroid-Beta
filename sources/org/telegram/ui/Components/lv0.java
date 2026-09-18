package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class lv0 implements Runnable {
    public final int f25980a;
    public final androidx.activity.g f25981b;

    public lv0(androidx.activity.g gVar, int i10) {
        this.f25980a = i10;
        this.f25981b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f25980a;
        androidx.activity.g gVar = this.f25981b;
        switch (i10) {
            case 0:
                qv0 qv0Var = (qv0) gVar.f1890c;
                boolean z10 = qv0Var.O;
                Paint paint = qv0Var.f27417b0;
                Paint paint2 = qv0Var.W;
                if (!z10) {
                    mv0 mv0Var = (mv0) gVar.d;
                    if (mv0Var != null) {
                        mv0Var.f26275c.recycle();
                    }
                    qv0Var.P = false;
                    return;
                }
                mv0 mv0Var2 = qv0Var.Q;
                qv0Var.R = mv0Var2;
                qv0Var.f27415a0.setShader(paint2.getShader());
                qv0Var.f27419c0.setShader(paint.getShader());
                Bitmap bitmap = ((mv0) gVar.d).f26275c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((mv0) gVar.d).getClass();
                ValueAnimator valueAnimator = qv0Var.f27424g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qv0Var.f27423f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qv0Var.f27424g0 = ofFloat;
                ofFloat.addUpdateListener(new h70(gVar, 22));
                qv0Var.f27424g0.addListener(new qk0(2, gVar, mv0Var2));
                qv0Var.f27424g0.setDuration(50L);
                qv0Var.f27424g0.start();
                qv0Var.N();
                qv0Var.Q = (mv0) gVar.d;
                AndroidUtilities.runOnUIThread(new lv0(gVar, 1), 16L);
                return;
            default:
                qv0 qv0Var2 = (qv0) gVar.f1890c;
                qv0Var2.P = false;
                qv0Var2.W();
                return;
        }
    }
}
