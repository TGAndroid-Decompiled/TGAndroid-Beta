package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class pw0 implements Runnable {
    public final int f29865a;
    public final androidx.activity.g f29866b;

    public pw0(androidx.activity.g gVar, int i10) {
        this.f29865a = i10;
        this.f29866b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f29865a;
        androidx.activity.g gVar = this.f29866b;
        switch (i10) {
            case 0:
                uw0 uw0Var = (uw0) gVar.f2128c;
                boolean z10 = uw0Var.O;
                Paint paint = uw0Var.f31580b0;
                Paint paint2 = uw0Var.W;
                if (!z10) {
                    qw0 qw0Var = (qw0) gVar.d;
                    if (qw0Var != null) {
                        qw0Var.f30261c.recycle();
                    }
                    uw0Var.P = false;
                    return;
                }
                qw0 qw0Var2 = uw0Var.Q;
                uw0Var.R = qw0Var2;
                uw0Var.f31578a0.setShader(paint2.getShader());
                uw0Var.f31582c0.setShader(paint.getShader());
                Bitmap bitmap = ((qw0) gVar.d).f30261c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((qw0) gVar.d).getClass();
                ValueAnimator valueAnimator = uw0Var.f31588g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                uw0Var.f31587f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                uw0Var.f31588g0 = ofFloat;
                ofFloat.addUpdateListener(new k80(gVar, 23));
                uw0Var.f31588g0.addListener(new wl0(2, gVar, qw0Var2));
                uw0Var.f31588g0.setDuration(50L);
                uw0Var.f31588g0.start();
                uw0Var.N();
                uw0Var.Q = (qw0) gVar.d;
                AndroidUtilities.runOnUIThread(new pw0(gVar, 1), 16L);
                return;
            default:
                uw0 uw0Var2 = (uw0) gVar.f2128c;
                uw0Var2.P = false;
                uw0Var2.W();
                return;
        }
    }
}
