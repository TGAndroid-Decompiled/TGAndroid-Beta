package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 implements Runnable {
    public final int f27771a;
    public final androidx.activity.g f27772b;

    public jw0(androidx.activity.g gVar, int i10) {
        this.f27771a = i10;
        this.f27772b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f27771a;
        androidx.activity.g gVar = this.f27772b;
        switch (i10) {
            case 0:
                ow0 ow0Var = (ow0) gVar.f2655c;
                boolean z10 = ow0Var.O;
                Paint paint = ow0Var.f29330b0;
                Paint paint2 = ow0Var.W;
                if (!z10) {
                    kw0 kw0Var = (kw0) gVar.d;
                    if (kw0Var != null) {
                        kw0Var.f28174c.recycle();
                    }
                    ow0Var.P = false;
                    return;
                }
                kw0 kw0Var2 = ow0Var.Q;
                ow0Var.R = kw0Var2;
                ow0Var.f29328a0.setShader(paint2.getShader());
                ow0Var.f29332c0.setShader(paint.getShader());
                Bitmap bitmap = ((kw0) gVar.d).f28174c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((kw0) gVar.d).getClass();
                ValueAnimator valueAnimator = ow0Var.f29337g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ow0Var.f29336f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ow0Var.f29337g0 = ofFloat;
                ofFloat.addUpdateListener(new d80(gVar, 23));
                ow0Var.f29337g0.addListener(new ql0(3, gVar, kw0Var2));
                ow0Var.f29337g0.setDuration(50L);
                ow0Var.f29337g0.start();
                ow0Var.M();
                ow0Var.Q = (kw0) gVar.d;
                AndroidUtilities.runOnUIThread(new jw0(gVar, 1), 16L);
                return;
            default:
                ow0 ow0Var2 = (ow0) gVar.f2655c;
                ow0Var2.P = false;
                ow0Var2.V();
                return;
        }
    }
}
