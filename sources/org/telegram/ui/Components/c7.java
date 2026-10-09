package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class c7 implements Utilities.Callback2 {
    public final int f25270a;
    public final l8 f25271b;

    public c7(l8 l8Var, int i10) {
        this.f25270a = i10;
        this.f25271b = l8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f25270a) {
            case 0:
                l8 l8Var = this.f25271b;
                l8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.b1 b1Var = l8Var.X;
                float floatValue = ((Float) obj).floatValue();
                b1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f25271b.f28343i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
