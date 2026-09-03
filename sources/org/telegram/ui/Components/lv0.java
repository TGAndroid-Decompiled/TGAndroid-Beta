package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class lv0 implements Runnable {
    public final int f26887a;
    public final androidx.activity.g f26888b;

    public lv0(androidx.activity.g gVar, int i10) {
        this.f26887a = i10;
        this.f26888b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f26887a;
        androidx.activity.g gVar = this.f26888b;
        switch (i10) {
            case 0:
                qv0 qv0Var = (qv0) gVar.f313c;
                boolean z4 = qv0Var.L;
                Paint paint = qv0Var.V;
                Paint paint2 = qv0Var.T;
                if (!z4) {
                    mv0 mv0Var = (mv0) gVar.d;
                    if (mv0Var != null) {
                        mv0Var.f27147c.recycle();
                    }
                    qv0Var.M = false;
                    return;
                }
                mv0 mv0Var2 = qv0Var.N;
                qv0Var.O = mv0Var2;
                qv0Var.U.setShader(paint2.getShader());
                qv0Var.W.setShader(paint.getShader());
                Bitmap bitmap = ((mv0) gVar.d).f27147c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((mv0) gVar.d).getClass();
                ValueAnimator valueAnimator = qv0Var.f28289d0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qv0Var.f28288c0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qv0Var.f28289d0 = ofFloat;
                ofFloat.addUpdateListener(new j70(gVar, 22));
                qv0Var.f28289d0.addListener(new dg.y2(29, gVar, mv0Var2));
                qv0Var.f28289d0.setDuration(50L);
                qv0Var.f28289d0.start();
                qv0Var.N();
                qv0Var.N = (mv0) gVar.d;
                AndroidUtilities.runOnUIThread(new lv0(gVar, 1), 16L);
                return;
            default:
                qv0 qv0Var2 = (qv0) gVar.f313c;
                qv0Var2.M = false;
                qv0Var2.W();
                return;
        }
    }
}
