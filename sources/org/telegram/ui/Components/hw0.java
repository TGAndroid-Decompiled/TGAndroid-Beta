package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class hw0 implements Runnable {
    public final int f27338a;
    public final androidx.activity.g f27339b;

    public hw0(androidx.activity.g gVar, int i10) {
        this.f27338a = i10;
        this.f27339b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f27338a;
        androidx.activity.g gVar = this.f27339b;
        switch (i10) {
            case 0:
                mw0 mw0Var = (mw0) gVar.f2050c;
                boolean z10 = mw0Var.O;
                Paint paint = mw0Var.f28831b0;
                Paint paint2 = mw0Var.W;
                if (!z10) {
                    iw0 iw0Var = (iw0) gVar.d;
                    if (iw0Var != null) {
                        iw0Var.f27616c.recycle();
                    }
                    mw0Var.P = false;
                    return;
                }
                iw0 iw0Var2 = mw0Var.Q;
                mw0Var.R = iw0Var2;
                mw0Var.f28829a0.setShader(paint2.getShader());
                mw0Var.f28833c0.setShader(paint.getShader());
                Bitmap bitmap = ((iw0) gVar.d).f27616c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((iw0) gVar.d).getClass();
                ValueAnimator valueAnimator = mw0Var.f28839g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                mw0Var.f28838f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                mw0Var.f28839g0 = ofFloat;
                ofFloat.addUpdateListener(new v70(gVar, 22));
                mw0Var.f28839g0.addListener(new cl0(2, gVar, iw0Var2));
                mw0Var.f28839g0.setDuration(50L);
                mw0Var.f28839g0.start();
                mw0Var.N();
                mw0Var.Q = (iw0) gVar.d;
                AndroidUtilities.runOnUIThread(new hw0(gVar, 1), 16L);
                return;
            default:
                mw0 mw0Var2 = (mw0) gVar.f2050c;
                mw0Var2.P = false;
                mw0Var2.W();
                return;
        }
    }
}
