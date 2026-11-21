package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
public final class z6 implements org.telegram.messenger.q10 {
    public final int f42685a;
    public final f8 f42686b;

    public z6(f8 f8Var, int i7) {
        this.f42685a = i7;
        this.f42686b = f8Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42685a) {
            case 0:
                f8 f8Var = this.f42686b;
                f8Var.S1 = !((Boolean) obj2).booleanValue();
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.u0 u0Var = f8Var.R1;
                float floatValue = ((Float) obj).floatValue();
                u0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f42686b.f35111c2.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
