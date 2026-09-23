package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class kv0 implements Runnable {
    public final int f25710a;
    public final androidx.activity.g f25711b;

    public kv0(androidx.activity.g gVar, int i10) {
        this.f25710a = i10;
        this.f25711b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f25710a;
        androidx.activity.g gVar = this.f25711b;
        switch (i10) {
            case 0:
                pv0 pv0Var = (pv0) gVar.f1882c;
                boolean z10 = pv0Var.O;
                Paint paint = pv0Var.f27145b0;
                Paint paint2 = pv0Var.W;
                if (!z10) {
                    lv0 lv0Var = (lv0) gVar.d;
                    if (lv0Var != null) {
                        lv0Var.f25952c.recycle();
                    }
                    pv0Var.P = false;
                    return;
                }
                lv0 lv0Var2 = pv0Var.Q;
                pv0Var.R = lv0Var2;
                pv0Var.f27143a0.setShader(paint2.getShader());
                pv0Var.f27147c0.setShader(paint.getShader());
                Bitmap bitmap = ((lv0) gVar.d).f25952c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((lv0) gVar.d).getClass();
                ValueAnimator valueAnimator = pv0Var.f27152g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pv0Var.f27151f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                pv0Var.f27152g0 = ofFloat;
                ofFloat.addUpdateListener(new i70(gVar, 22));
                pv0Var.f27152g0.addListener(new qk0(2, gVar, lv0Var2));
                pv0Var.f27152g0.setDuration(50L);
                pv0Var.f27152g0.start();
                pv0Var.N();
                pv0Var.Q = (lv0) gVar.d;
                AndroidUtilities.runOnUIThread(new kv0(gVar, 1), 16L);
                return;
            default:
                pv0 pv0Var2 = (pv0) gVar.f1882c;
                pv0Var2.P = false;
                pv0Var2.W();
                return;
        }
    }
}
