package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.Callback2 {
    public final int f30744a;
    public final i8 f30745b;

    public z6(i8 i8Var, int i10) {
        this.f30744a = i10;
        this.f30745b = i8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30744a) {
            case 0:
                i8 i8Var = this.f30745b;
                i8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.b1 b1Var = i8Var.X;
                float floatValue = ((Float) obj).floatValue();
                b1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f30745b.f24920i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
