package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class s6 implements org.telegram.messenger.s10 {
    public final int f39185a;
    public final y7 f39186b;

    public s6(y7 y7Var, int i7) {
        this.f39185a = i7;
        this.f39186b = y7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f39185a) {
            case 0:
                y7 y7Var = this.f39186b;
                y7Var.S1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = y7Var.R1;
                float floatValue = ((Float) obj).floatValue();
                v0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f39186b.f41896c2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
