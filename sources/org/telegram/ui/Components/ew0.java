package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class ew0 implements Runnable {
    public final int f26008a;
    public final androidx.activity.g f26009b;

    public ew0(androidx.activity.g gVar, int i10) {
        this.f26008a = i10;
        this.f26009b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f26008a;
        androidx.activity.g gVar = this.f26009b;
        switch (i10) {
            case 0:
                jw0 jw0Var = (jw0) gVar.f2652c;
                boolean z10 = jw0Var.O;
                Paint paint = jw0Var.W;
                if (!z10) {
                    fw0 fw0Var = (fw0) gVar.d;
                    if (fw0Var != null) {
                        fw0Var.f26400c.recycle();
                    }
                    jw0Var.P = false;
                    return;
                }
                fw0 fw0Var2 = jw0Var.Q;
                jw0Var.R = fw0Var2;
                jw0Var.f27612a0.setShader(paint.getShader());
                jw0Var.f27616c0.setShader(jw0Var.f27614b0.getShader());
                Bitmap bitmap = ((fw0) gVar.d).f26400c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((fw0) gVar.d).getClass();
                ValueAnimator valueAnimator = jw0Var.f27621g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                jw0Var.f27620f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                jw0Var.f27621g0 = ofFloat;
                ofFloat.addUpdateListener(new b80(gVar, 23));
                jw0Var.f27621g0.addListener(new ml0(3, gVar, fw0Var2));
                jw0Var.f27621g0.setDuration(50L);
                jw0Var.f27621g0.start();
                jw0Var.N();
                jw0Var.Q = (fw0) gVar.d;
                AndroidUtilities.runOnUIThread(new ew0(gVar, 1), 16L);
                return;
            default:
                jw0 jw0Var2 = (jw0) gVar.f2652c;
                jw0Var2.P = false;
                jw0Var2.W();
                return;
        }
    }
}
