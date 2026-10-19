package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class fw0 implements Runnable {
    public final int f26387a;
    public final androidx.activity.g f26388b;

    public fw0(androidx.activity.g gVar, int i10) {
        this.f26387a = i10;
        this.f26388b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f26387a;
        androidx.activity.g gVar = this.f26388b;
        switch (i10) {
            case 0:
                kw0 kw0Var = (kw0) gVar.f2648c;
                boolean z10 = kw0Var.O;
                Paint paint = kw0Var.W;
                if (!z10) {
                    gw0 gw0Var = (gw0) gVar.d;
                    if (gw0Var != null) {
                        gw0Var.f26712c.recycle();
                    }
                    kw0Var.P = false;
                    return;
                }
                gw0 gw0Var2 = kw0Var.Q;
                kw0Var.R = gw0Var2;
                kw0Var.f27994a0.setShader(paint.getShader());
                kw0Var.f27998c0.setShader(kw0Var.f27996b0.getShader());
                Bitmap bitmap = ((gw0) gVar.d).f26712c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((gw0) gVar.d).getClass();
                ValueAnimator valueAnimator = kw0Var.f28003g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                kw0Var.f28002f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                kw0Var.f28003g0 = ofFloat;
                ofFloat.addUpdateListener(new b80(gVar, 23));
                kw0Var.f28003g0.addListener(new ml0(3, gVar, gw0Var2));
                kw0Var.f28003g0.setDuration(50L);
                kw0Var.f28003g0.start();
                kw0Var.N();
                kw0Var.Q = (gw0) gVar.d;
                AndroidUtilities.runOnUIThread(new fw0(gVar, 1), 16L);
                return;
            default:
                kw0 kw0Var2 = (kw0) gVar.f2648c;
                kw0Var2.P = false;
                kw0Var2.W();
                return;
        }
    }
}
