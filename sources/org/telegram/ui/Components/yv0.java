package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class yv0 implements Runnable {
    public final int f30822a;
    public final androidx.activity.g f30823b;

    public yv0(androidx.activity.g gVar, int i10) {
        this.f30822a = i10;
        this.f30823b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f30822a;
        androidx.activity.g gVar = this.f30823b;
        switch (i10) {
            case 0:
                dw0 dw0Var = (dw0) gVar.f1889c;
                boolean z10 = dw0Var.O;
                Paint paint = dw0Var.f23749b0;
                Paint paint2 = dw0Var.W;
                if (!z10) {
                    zv0 zv0Var = (zv0) gVar.d;
                    if (zv0Var != null) {
                        zv0Var.f31077c.recycle();
                    }
                    dw0Var.P = false;
                    return;
                }
                zv0 zv0Var2 = dw0Var.Q;
                dw0Var.R = zv0Var2;
                dw0Var.f23747a0.setShader(paint2.getShader());
                dw0Var.f23751c0.setShader(paint.getShader());
                Bitmap bitmap = ((zv0) gVar.d).f31077c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((zv0) gVar.d).getClass();
                ValueAnimator valueAnimator = dw0Var.f23756g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                dw0Var.f23755f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                dw0Var.f23756g0 = ofFloat;
                ofFloat.addUpdateListener(new v70(gVar, 22));
                dw0Var.f23756g0.addListener(new dl0(2, gVar, zv0Var2));
                dw0Var.f23756g0.setDuration(50L);
                dw0Var.f23756g0.start();
                dw0Var.N();
                dw0Var.Q = (zv0) gVar.d;
                AndroidUtilities.runOnUIThread(new yv0(gVar, 1), 16L);
                return;
            default:
                dw0 dw0Var2 = (dw0) gVar.f1889c;
                dw0Var2.P = false;
                dw0Var2.W();
                return;
        }
    }
}
