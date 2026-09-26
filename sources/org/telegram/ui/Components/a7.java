package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class a7 implements Utilities.Callback2 {
    public final int f22552a;
    public final j8 f22553b;

    public a7(j8 j8Var, int i10) {
        this.f22552a = i10;
        this.f22553b = j8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22552a) {
            case 0:
                j8 j8Var = this.f22553b;
                j8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.a1 a1Var = j8Var.X;
                float floatValue = ((Float) obj).floatValue();
                a1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f22553b.f25296i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
