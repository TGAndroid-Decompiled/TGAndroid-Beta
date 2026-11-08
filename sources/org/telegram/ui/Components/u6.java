package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class u6 implements org.telegram.messenger.v10 {
    public final int f38520a;
    public final b8 f38521b;

    public u6(b8 b8Var, int i7) {
        this.f38520a = i7;
        this.f38521b = b8Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f38520a) {
            case 0:
                b8 b8Var = this.f38521b;
                b8Var.O1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.N1;
                float floatValue = ((Float) obj).floatValue();
                v0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f38521b.Y1.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
