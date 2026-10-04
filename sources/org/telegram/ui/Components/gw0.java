package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class gw0 implements Runnable {
    public final int f26941a;
    public final androidx.activity.g f26942b;

    public gw0(androidx.activity.g gVar, int i10) {
        this.f26941a = i10;
        this.f26942b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f26941a;
        androidx.activity.g gVar = this.f26942b;
        switch (i10) {
            case 0:
                lw0 lw0Var = (lw0) gVar.f2050c;
                boolean z10 = lw0Var.O;
                Paint paint = lw0Var.f28445b0;
                Paint paint2 = lw0Var.W;
                if (!z10) {
                    hw0 hw0Var = (hw0) gVar.d;
                    if (hw0Var != null) {
                        hw0Var.f27254c.recycle();
                    }
                    lw0Var.P = false;
                    return;
                }
                hw0 hw0Var2 = lw0Var.Q;
                lw0Var.R = hw0Var2;
                lw0Var.f28443a0.setShader(paint2.getShader());
                lw0Var.f28447c0.setShader(paint.getShader());
                Bitmap bitmap = ((hw0) gVar.d).f27254c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((hw0) gVar.d).getClass();
                ValueAnimator valueAnimator = lw0Var.f28453g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                lw0Var.f28452f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                lw0Var.f28453g0 = ofFloat;
                ofFloat.addUpdateListener(new v70(gVar, 22));
                lw0Var.f28453g0.addListener(new cl0(2, gVar, hw0Var2));
                lw0Var.f28453g0.setDuration(50L);
                lw0Var.f28453g0.start();
                lw0Var.N();
                lw0Var.Q = (hw0) gVar.d;
                AndroidUtilities.runOnUIThread(new gw0(gVar, 1), 16L);
                return;
            default:
                lw0 lw0Var2 = (lw0) gVar.f2050c;
                lw0Var2.P = false;
                lw0Var2.W();
                return;
        }
    }
}
