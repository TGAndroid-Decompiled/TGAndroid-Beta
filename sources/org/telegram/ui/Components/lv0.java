package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class lv0 implements Runnable {
    public final int f26889a;
    public final androidx.activity.g f26890b;

    public lv0(androidx.activity.g gVar, int i10) {
        this.f26889a = i10;
        this.f26890b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f26889a;
        androidx.activity.g gVar = this.f26890b;
        switch (i10) {
            case 0:
                qv0 qv0Var = (qv0) gVar.f298c;
                boolean z4 = qv0Var.L;
                Paint paint = qv0Var.V;
                Paint paint2 = qv0Var.T;
                if (!z4) {
                    mv0 mv0Var = (mv0) gVar.d;
                    if (mv0Var != null) {
                        mv0Var.f27134c.recycle();
                    }
                    qv0Var.M = false;
                    return;
                }
                mv0 mv0Var2 = qv0Var.N;
                qv0Var.O = mv0Var2;
                qv0Var.U.setShader(paint2.getShader());
                qv0Var.W.setShader(paint.getShader());
                Bitmap bitmap = ((mv0) gVar.d).f27134c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((mv0) gVar.d).getClass();
                ValueAnimator valueAnimator = qv0Var.f28275d0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qv0Var.f28274c0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qv0Var.f28275d0 = ofFloat;
                ofFloat.addUpdateListener(new i70(gVar, 22));
                qv0Var.f28275d0.addListener(new dg.y2(29, gVar, mv0Var2));
                qv0Var.f28275d0.setDuration(50L);
                qv0Var.f28275d0.start();
                qv0Var.N();
                qv0Var.N = (mv0) gVar.d;
                AndroidUtilities.runOnUIThread(new lv0(gVar, 1), 16L);
                return;
            default:
                qv0 qv0Var2 = (qv0) gVar.f298c;
                qv0Var2.M = false;
                qv0Var2.W();
                return;
        }
    }
}
