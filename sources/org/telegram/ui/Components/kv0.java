package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class kv0 implements Runnable {
    public final int f28504a;
    public final androidx.activity.g f28505b;

    public kv0(androidx.activity.g gVar, int i10) {
        this.f28504a = i10;
        this.f28505b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f28504a;
        androidx.activity.g gVar = this.f28505b;
        switch (i10) {
            case 0:
                pv0 pv0Var = (pv0) gVar.f335c;
                boolean z4 = pv0Var.L;
                Paint paint = pv0Var.V;
                Paint paint2 = pv0Var.T;
                if (!z4) {
                    lv0 lv0Var = (lv0) gVar.d;
                    if (lv0Var != null) {
                        lv0Var.f28889c.recycle();
                    }
                    pv0Var.M = false;
                    return;
                }
                lv0 lv0Var2 = pv0Var.N;
                pv0Var.O = lv0Var2;
                pv0Var.U.setShader(paint2.getShader());
                pv0Var.W.setShader(paint.getShader());
                Bitmap bitmap = ((lv0) gVar.d).f28889c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((lv0) gVar.d).getClass();
                ValueAnimator valueAnimator = pv0Var.f30202d0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pv0Var.f30201c0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                pv0Var.f30202d0 = ofFloat;
                ofFloat.addUpdateListener(new k70(gVar, 22));
                pv0Var.f30202d0.addListener(new eg.w2(29, gVar, lv0Var2));
                pv0Var.f30202d0.setDuration(50L);
                pv0Var.f30202d0.start();
                pv0Var.N();
                pv0Var.N = (lv0) gVar.d;
                AndroidUtilities.runOnUIThread(new kv0(gVar, 1), 16L);
                return;
            default:
                pv0 pv0Var2 = (pv0) gVar.f335c;
                pv0Var2.M = false;
                pv0Var2.W();
                return;
        }
    }
}
