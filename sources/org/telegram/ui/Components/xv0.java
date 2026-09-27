package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class xv0 implements Runnable {
    public final int f30496a;
    public final androidx.activity.g f30497b;

    public xv0(androidx.activity.g gVar, int i10) {
        this.f30496a = i10;
        this.f30497b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f30496a;
        androidx.activity.g gVar = this.f30497b;
        switch (i10) {
            case 0:
                cw0 cw0Var = (cw0) gVar.f1884c;
                boolean z10 = cw0Var.O;
                Paint paint = cw0Var.f23428b0;
                Paint paint2 = cw0Var.W;
                if (!z10) {
                    yv0 yv0Var = (yv0) gVar.d;
                    if (yv0Var != null) {
                        yv0Var.f30793c.recycle();
                    }
                    cw0Var.P = false;
                    return;
                }
                yv0 yv0Var2 = cw0Var.Q;
                cw0Var.R = yv0Var2;
                cw0Var.f23426a0.setShader(paint2.getShader());
                cw0Var.f23430c0.setShader(paint.getShader());
                Bitmap bitmap = ((yv0) gVar.d).f30793c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((yv0) gVar.d).getClass();
                ValueAnimator valueAnimator = cw0Var.f23435g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                cw0Var.f23434f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                cw0Var.f23435g0 = ofFloat;
                ofFloat.addUpdateListener(new u70(gVar, 22));
                cw0Var.f23435g0.addListener(new cl0(2, gVar, yv0Var2));
                cw0Var.f23435g0.setDuration(50L);
                cw0Var.f23435g0.start();
                cw0Var.N();
                cw0Var.Q = (yv0) gVar.d;
                AndroidUtilities.runOnUIThread(new xv0(gVar, 1), 16L);
                return;
            default:
                cw0 cw0Var2 = (cw0) gVar.f1884c;
                cw0Var2.P = false;
                cw0Var2.W();
                return;
        }
    }
}
