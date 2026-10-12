package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class c7 implements Utilities.Callback2 {
    public final int f24839a;
    public final l8 f24840b;

    public c7(l8 l8Var, int i10) {
        this.f24839a = i10;
        this.f24840b = l8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f24839a) {
            case 0:
                l8 l8Var = this.f24840b;
                l8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.a1 a1Var = l8Var.X;
                float floatValue = ((Float) obj).floatValue();
                a1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f24840b.f28065i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
