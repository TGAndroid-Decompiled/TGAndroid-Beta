package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class s6 implements org.telegram.messenger.n10 {
    public final int f37932a;
    public final z7 f37933b;

    public s6(z7 z7Var, int i3) {
        this.f37932a = i3;
        this.f37933b = z7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f37932a) {
            case 0:
                z7 z7Var = this.f37933b;
                z7Var.P1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.u0 u0Var = z7Var.O1;
                float floatValue = ((Float) obj).floatValue();
                u0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f37933b.Z1.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
