package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class tw0 implements Runnable {
    public final int f30986a;
    public final androidx.activity.g f30987b;

    public tw0(androidx.activity.g gVar, int i10) {
        this.f30986a = i10;
        this.f30987b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f30986a;
        androidx.activity.g gVar = this.f30987b;
        switch (i10) {
            case 0:
                yw0 yw0Var = (yw0) gVar.f2126c;
                boolean z10 = yw0Var.O;
                Paint paint = yw0Var.f33193b0;
                Paint paint2 = yw0Var.W;
                if (!z10) {
                    uw0 uw0Var = (uw0) gVar.d;
                    if (uw0Var != null) {
                        uw0Var.f31275c.recycle();
                    }
                    yw0Var.P = false;
                    return;
                }
                uw0 uw0Var2 = yw0Var.Q;
                yw0Var.R = uw0Var2;
                yw0Var.f33191a0.setShader(paint2.getShader());
                yw0Var.f33195c0.setShader(paint.getShader());
                Bitmap bitmap = ((uw0) gVar.d).f31275c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((uw0) gVar.d).getClass();
                ValueAnimator valueAnimator = yw0Var.f33201g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                yw0Var.f33200f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yw0Var.f33201g0 = ofFloat;
                ofFloat.addUpdateListener(new m80(gVar, 23));
                yw0Var.f33201g0.addListener(new am0(2, gVar, uw0Var2));
                yw0Var.f33201g0.setDuration(50L);
                yw0Var.f33201g0.start();
                yw0Var.N();
                yw0Var.Q = (uw0) gVar.d;
                AndroidUtilities.runOnUIThread(new tw0(gVar, 1), 16L);
                return;
            default:
                yw0 yw0Var2 = (yw0) gVar.f2126c;
                yw0Var2.P = false;
                yw0Var2.W();
                return;
        }
    }
}
