package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class y6 implements org.telegram.messenger.p10 {
    public final int f42367a;
    public final e8 f42368b;

    public y6(e8 e8Var, int i7) {
        this.f42367a = i7;
        this.f42368b = e8Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42367a) {
            case 0:
                e8 e8Var = this.f42368b;
                e8Var.S1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.u0 u0Var = e8Var.R1;
                float floatValue = ((Float) obj).floatValue();
                u0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f42368b.f34594c2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
