package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class t6 implements org.telegram.messenger.v10 {
    public final int f38214a;
    public final a8 f38215b;

    public t6(a8 a8Var, int i7) {
        this.f38214a = i7;
        this.f38215b = a8Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f38214a) {
            case 0:
                a8 a8Var = this.f38215b;
                a8Var.R1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = a8Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                v0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f38215b.f31735b2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
