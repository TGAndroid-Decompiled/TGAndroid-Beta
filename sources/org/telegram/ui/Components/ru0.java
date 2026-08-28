package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
public final class ru0 implements Runnable {
    public final int f32290a;
    public final androidx.activity.g f32291b;

    public ru0(androidx.activity.g gVar, int i9) {
        this.f32290a = i9;
        this.f32291b = gVar;
    }

    @Override
    public final void run() {
        int i9 = this.f32290a;
        androidx.activity.g gVar = this.f32291b;
        switch (i9) {
            case 0:
                xu0 xu0Var = (xu0) gVar.f367c;
                boolean z10 = xu0Var.K;
                Paint paint = xu0Var.U;
                Paint paint2 = xu0Var.S;
                if (!z10) {
                    tu0 tu0Var = (tu0) gVar.d;
                    if (tu0Var != null) {
                        tu0Var.f32822c.recycle();
                    }
                    xu0Var.L = false;
                    return;
                }
                tu0 tu0Var2 = xu0Var.M;
                xu0Var.N = tu0Var2;
                xu0Var.T.setShader(paint2.getShader());
                xu0Var.V.setShader(paint.getShader());
                Bitmap bitmap = ((tu0) gVar.d).f32822c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                ((tu0) gVar.d).getClass();
                ValueAnimator valueAnimator = xu0Var.f34776c0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                xu0Var.f34774b0 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xu0Var.f34776c0 = ofFloat;
                ofFloat.addUpdateListener(new q60(gVar, 22));
                xu0Var.f34776c0.addListener(new su0(0, gVar, tu0Var2));
                xu0Var.f34776c0.setDuration(50L);
                xu0Var.f34776c0.start();
                xu0Var.N();
                xu0Var.M = (tu0) gVar.d;
                AndroidUtilities.runOnUIThread(new ru0(gVar, 1), 16L);
                return;
            default:
                xu0 xu0Var2 = (xu0) gVar.f367c;
                xu0Var2.L = false;
                xu0Var2.W();
                return;
        }
    }
}
