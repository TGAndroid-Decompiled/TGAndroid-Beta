package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class ow0 implements Runnable {
    public final int f29612a;
    public final androidx.activity.g f29613b;

    public ow0(androidx.activity.g gVar, int i10) {
        this.f29612a = i10;
        this.f29613b = gVar;
    }

    @Override
    public final void run() {
        int i10 = this.f29612a;
        androidx.activity.g gVar = this.f29613b;
        switch (i10) {
            case 0:
                tw0 tw0Var = (tw0) gVar.f2128c;
                boolean z10 = tw0Var.O;
                Paint paint = tw0Var.f31245b0;
                Paint paint2 = tw0Var.W;
                if (!z10) {
                    pw0 pw0Var = (pw0) gVar.d;
                    if (pw0Var != null) {
                        pw0Var.f29883c.recycle();
                    }
                    tw0Var.P = false;
                    return;
                }
                pw0 pw0Var2 = tw0Var.Q;
                tw0Var.R = pw0Var2;
                tw0Var.f31243a0.setShader(paint2.getShader());
                tw0Var.f31247c0.setShader(paint.getShader());
                Bitmap bitmap = ((pw0) gVar.d).f29883c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((pw0) gVar.d).getClass();
                ValueAnimator valueAnimator = tw0Var.f31253g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tw0Var.f31252f0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                tw0Var.f31253g0 = ofFloat;
                ofFloat.addUpdateListener(new k80(gVar, 23));
                tw0Var.f31253g0.addListener(new vl0(2, gVar, pw0Var2));
                tw0Var.f31253g0.setDuration(50L);
                tw0Var.f31253g0.start();
                tw0Var.N();
                tw0Var.Q = (pw0) gVar.d;
                AndroidUtilities.runOnUIThread(new ow0(gVar, 1), 16L);
                return;
            default:
                tw0 tw0Var2 = (tw0) gVar.f2128c;
                tw0Var2.P = false;
                tw0Var2.W();
                return;
        }
    }
}
