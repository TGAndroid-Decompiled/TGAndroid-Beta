package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class nw0 implements Runnable {
    public final int f29294a;
    public final androidx.activity.g f29295b;

    public nw0(androidx.activity.g gVar, int i10) {
        this.f29294a = i10;
        this.f29295b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f29294a;
        androidx.activity.g gVar = this.f29295b;
        switch (i10) {
            case 0:
                sw0 sw0Var = (sw0) gVar.f2128c;
                boolean z10 = sw0Var.O;
                Paint paint = sw0Var.f30919b0;
                Paint paint2 = sw0Var.W;
                if (!z10) {
                    ow0 ow0Var = (ow0) gVar.d;
                    if (ow0Var != null) {
                        ow0Var.f29596c.recycle();
                    }
                    sw0Var.P = false;
                    return;
                }
                ow0 ow0Var2 = sw0Var.Q;
                sw0Var.R = ow0Var2;
                sw0Var.f30917a0.setShader(paint2.getShader());
                sw0Var.f30921c0.setShader(paint.getShader());
                Bitmap bitmap = ((ow0) gVar.d).f29596c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((ow0) gVar.d).getClass();
                ValueAnimator valueAnimator = sw0Var.f30927g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                sw0Var.f30926f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                sw0Var.f30927g0 = ofFloat;
                ofFloat.addUpdateListener(new j80(gVar, 23));
                sw0Var.f30927g0.addListener(new ul0(2, gVar, ow0Var2));
                sw0Var.f30927g0.setDuration(50L);
                sw0Var.f30927g0.start();
                sw0Var.N();
                sw0Var.Q = (ow0) gVar.d;
                AndroidUtilities.runOnUIThread(new nw0(gVar, 1), 16L);
                return;
            default:
                sw0 sw0Var2 = (sw0) gVar.f2128c;
                sw0Var2.P = false;
                sw0Var2.W();
                return;
        }
    }
}
