package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class y6 implements Utilities.Callback2 {
    public final int f30161a;
    public final h8 f30162b;

    public y6(h8 h8Var, int i10) {
        this.f30161a = i10;
        this.f30162b = h8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30161a) {
            case 0:
                h8 h8Var = this.f30162b;
                h8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.b1 b1Var = h8Var.X;
                float floatValue = ((Float) obj).floatValue();
                b1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f30162b.f24565i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
