package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class cv0 implements Runnable {
    public final int f27578a;
    public final androidx.activity.g f27579b;

    public cv0(androidx.activity.g gVar, int i10) {
        this.f27578a = i10;
        this.f27579b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f27578a;
        androidx.activity.g gVar = this.f27579b;
        switch (i10) {
            case 0:
                hv0 hv0Var = (hv0) gVar.f862c;
                boolean z10 = hv0Var.K;
                Paint paint = hv0Var.U;
                Paint paint2 = hv0Var.S;
                if (!z10) {
                    dv0 dv0Var = (dv0) gVar.d;
                    if (dv0Var != null) {
                        dv0Var.f27882c.recycle();
                    }
                    hv0Var.L = false;
                    return;
                }
                dv0 dv0Var2 = hv0Var.M;
                hv0Var.N = dv0Var2;
                hv0Var.T.setShader(paint2.getShader());
                hv0Var.V.setShader(paint.getShader());
                Bitmap bitmap = ((dv0) gVar.d).f27882c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((dv0) gVar.d).getClass();
                ValueAnimator valueAnimator = hv0Var.f29241c0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                hv0Var.f29239b0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                hv0Var.f29241c0 = ofFloat;
                ofFloat.addUpdateListener(new d70(gVar, 22));
                hv0Var.f29241c0.addListener(new ok0(3, gVar, dv0Var2));
                hv0Var.f29241c0.setDuration(50L);
                hv0Var.f29241c0.start();
                hv0Var.N();
                hv0Var.M = (dv0) gVar.d;
                AndroidUtilities.runOnUIThread(new cv0(gVar, 1), 16L);
                return;
            default:
                hv0 hv0Var2 = (hv0) gVar.f862c;
                hv0Var2.L = false;
                hv0Var2.W();
                return;
        }
    }
}
