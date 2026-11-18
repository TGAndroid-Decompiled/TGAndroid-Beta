package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class y6 implements org.telegram.messenger.q10 {
    public final int f42340a;
    public final g8 f42341b;

    public y6(g8 g8Var, int i7) {
        this.f42340a = i7;
        this.f42341b = g8Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42340a) {
            case 0:
                g8 g8Var = this.f42341b;
                g8Var.S1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = g8Var.R1;
                float floatValue = ((Float) obj).floatValue();
                v0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f42341b.f35388c2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
