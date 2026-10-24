package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 implements Runnable {
    public final int f27508a;
    public final androidx.activity.g f27509b;

    public iw0(androidx.activity.g gVar, int i10) {
        this.f27508a = i10;
        this.f27509b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f27508a;
        androidx.activity.g gVar = this.f27509b;
        switch (i10) {
            case 0:
                nw0 nw0Var = (nw0) gVar.f2655c;
                boolean z10 = nw0Var.O;
                Paint paint = nw0Var.f29049b0;
                Paint paint2 = nw0Var.W;
                if (!z10) {
                    jw0 jw0Var = (jw0) gVar.d;
                    if (jw0Var != null) {
                        jw0Var.f27808c.recycle();
                    }
                    nw0Var.P = false;
                    return;
                }
                jw0 jw0Var2 = nw0Var.Q;
                nw0Var.R = jw0Var2;
                nw0Var.f29047a0.setShader(paint2.getShader());
                nw0Var.f29051c0.setShader(paint.getShader());
                Bitmap bitmap = ((jw0) gVar.d).f27808c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((jw0) gVar.d).getClass();
                ValueAnimator valueAnimator = nw0Var.f29056g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                nw0Var.f29055f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nw0Var.f29056g0 = ofFloat;
                ofFloat.addUpdateListener(new b80(gVar, 23));
                nw0Var.f29056g0.addListener(new pl0(3, gVar, jw0Var2));
                nw0Var.f29056g0.setDuration(50L);
                nw0Var.f29056g0.start();
                nw0Var.M();
                nw0Var.Q = (jw0) gVar.d;
                AndroidUtilities.runOnUIThread(new iw0(gVar, 1), 16L);
                return;
            default:
                nw0 nw0Var2 = (nw0) gVar.f2655c;
                nw0Var2.P = false;
                nw0Var2.V();
                return;
        }
    }
}
