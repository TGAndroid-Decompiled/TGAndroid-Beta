package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class vv0 implements Runnable {
    public final int f29808a;
    public final androidx.activity.g f29809b;

    public vv0(androidx.activity.g gVar, int i10) {
        this.f29808a = i10;
        this.f29809b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f29808a;
        androidx.activity.g gVar = this.f29809b;
        switch (i10) {
            case 0:
                aw0 aw0Var = (aw0) gVar.f1882c;
                boolean z10 = aw0Var.O;
                Paint paint = aw0Var.f22781b0;
                Paint paint2 = aw0Var.W;
                if (!z10) {
                    wv0 wv0Var = (wv0) gVar.d;
                    if (wv0Var != null) {
                        wv0Var.f30182c.recycle();
                    }
                    aw0Var.P = false;
                    return;
                }
                wv0 wv0Var2 = aw0Var.Q;
                aw0Var.R = wv0Var2;
                aw0Var.f22779a0.setShader(paint2.getShader());
                aw0Var.f22783c0.setShader(paint.getShader());
                Bitmap bitmap = ((wv0) gVar.d).f30182c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((wv0) gVar.d).getClass();
                ValueAnimator valueAnimator = aw0Var.f22788g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                aw0Var.f22787f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                aw0Var.f22788g0 = ofFloat;
                ofFloat.addUpdateListener(new s70(gVar, 22));
                aw0Var.f22788g0.addListener(new al0(2, gVar, wv0Var2));
                aw0Var.f22788g0.setDuration(50L);
                aw0Var.f22788g0.start();
                aw0Var.N();
                aw0Var.Q = (wv0) gVar.d;
                AndroidUtilities.runOnUIThread(new vv0(gVar, 1), 16L);
                return;
            default:
                aw0 aw0Var2 = (aw0) gVar.f1882c;
                aw0Var2.P = false;
                aw0Var2.W();
                return;
        }
    }
}
