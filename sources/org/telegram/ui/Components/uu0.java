package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

public final class uu0 implements Runnable {

    public final int f33214a;

    public final androidx.activity.g f33215b;

    public uu0(androidx.activity.g gVar, int i10) {
        this.f33214a = i10;
        this.f33215b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f33214a;
        androidx.activity.g gVar = this.f33215b;
        switch (i10) {
            case 0:
                zu0 zu0Var = (zu0) gVar.f875c;
                boolean z10 = zu0Var.K;
                Paint paint = zu0Var.U;
                Paint paint2 = zu0Var.S;
                if (!z10) {
                    vu0 vu0Var = (vu0) gVar.d;
                    if (vu0Var != null) {
                        vu0Var.f34059c.recycle();
                    }
                    zu0Var.L = false;
                } else {
                    vu0 vu0Var2 = zu0Var.M;
                    zu0Var.N = vu0Var2;
                    zu0Var.T.setShader(paint2.getShader());
                    zu0Var.V.setShader(paint.getShader());
                    Bitmap bitmap = ((vu0) gVar.d).f34059c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((vu0) gVar.d).getClass();
                    ValueAnimator valueAnimator = zu0Var.f35371c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    zu0Var.f35369b0 = 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    zu0Var.f35371c0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new v60(gVar, 22));
                    zu0Var.f35371c0.addListener(new fk0(2, gVar, vu0Var2));
                    zu0Var.f35371c0.setDuration(50L);
                    zu0Var.f35371c0.start();
                    zu0Var.N();
                    zu0Var.M = (vu0) gVar.d;
                    AndroidUtilities.runOnUIThread(new uu0(gVar, 1), 16L);
                }
                break;
            default:
                zu0 zu0Var2 = (zu0) gVar.f875c;
                zu0Var2.L = false;
                zu0Var2.W();
                break;
        }
    }
}
