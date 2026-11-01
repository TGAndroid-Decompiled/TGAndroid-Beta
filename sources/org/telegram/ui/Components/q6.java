package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class q6 implements org.telegram.messenger.k20 {
    public final int f29643a;
    public final w7 f29644b;

    public q6(w7 w7Var, int i10) {
        this.f29643a = i10;
        this.f29644b = w7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f29643a) {
            case 0:
                w7 w7Var = this.f29644b;
                w7Var.O1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.x0 x0Var = w7Var.N1;
                float floatValue = ((Float) obj).floatValue();
                x0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f29644b.Y1.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
