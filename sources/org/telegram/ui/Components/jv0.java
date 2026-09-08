package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class jv0 implements Runnable {
    public final int f27604a;
    public final androidx.activity.g f27605b;

    public jv0(androidx.activity.g gVar, int i10) {
        this.f27604a = i10;
        this.f27605b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f27604a;
        androidx.activity.g gVar = this.f27605b;
        switch (i10) {
            case 0:
                ov0 ov0Var = (ov0) gVar.f874c;
                boolean z10 = ov0Var.O;
                Paint paint = ov0Var.f29227b0;
                Paint paint2 = ov0Var.W;
                if (!z10) {
                    kv0 kv0Var = (kv0) gVar.d;
                    if (kv0Var != null) {
                        kv0Var.f27938c.recycle();
                    }
                    ov0Var.P = false;
                    return;
                }
                kv0 kv0Var2 = ov0Var.Q;
                ov0Var.R = kv0Var2;
                ov0Var.f29225a0.setShader(paint2.getShader());
                ov0Var.f29229c0.setShader(paint.getShader());
                Bitmap bitmap = ((kv0) gVar.d).f27938c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((kv0) gVar.d).getClass();
                ValueAnimator valueAnimator = ov0Var.f29235g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ov0Var.f29234f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ov0Var.f29235g0 = ofFloat;
                ofFloat.addUpdateListener(new h70(gVar, 22));
                ov0Var.f29235g0.addListener(new pk0(2, gVar, kv0Var2));
                ov0Var.f29235g0.setDuration(50L);
                ov0Var.f29235g0.start();
                ov0Var.N();
                ov0Var.Q = (kv0) gVar.d;
                AndroidUtilities.runOnUIThread(new jv0(gVar, 1), 16L);
                return;
            default:
                ov0 ov0Var2 = (ov0) gVar.f874c;
                ov0Var2.P = false;
                ov0Var2.W();
                return;
        }
    }
}
