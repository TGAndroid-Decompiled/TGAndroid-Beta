package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class wv0 implements Runnable {
    public final int f30174a;
    public final androidx.activity.g f30175b;

    public wv0(androidx.activity.g gVar, int i10) {
        this.f30174a = i10;
        this.f30175b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f30174a;
        androidx.activity.g gVar = this.f30175b;
        switch (i10) {
            case 0:
                bw0 bw0Var = (bw0) gVar.f1890c;
                boolean z10 = bw0Var.O;
                Paint paint = bw0Var.f23093b0;
                Paint paint2 = bw0Var.W;
                if (!z10) {
                    xv0 xv0Var = (xv0) gVar.d;
                    if (xv0Var != null) {
                        xv0Var.f30385c.recycle();
                    }
                    bw0Var.P = false;
                    return;
                }
                xv0 xv0Var2 = bw0Var.Q;
                bw0Var.R = xv0Var2;
                bw0Var.f23091a0.setShader(paint2.getShader());
                bw0Var.f23095c0.setShader(paint.getShader());
                Bitmap bitmap = ((xv0) gVar.d).f30385c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((xv0) gVar.d).getClass();
                ValueAnimator valueAnimator = bw0Var.f23100g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                bw0Var.f23099f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                bw0Var.f23100g0 = ofFloat;
                ofFloat.addUpdateListener(new q70(gVar, 22));
                bw0Var.f23100g0.addListener(new al0(2, gVar, xv0Var2));
                bw0Var.f23100g0.setDuration(50L);
                bw0Var.f23100g0.start();
                bw0Var.N();
                bw0Var.Q = (xv0) gVar.d;
                AndroidUtilities.runOnUIThread(new wv0(gVar, 1), 16L);
                return;
            default:
                bw0 bw0Var2 = (bw0) gVar.f1890c;
                bw0Var2.P = false;
                bw0Var2.W();
                return;
        }
    }
}
