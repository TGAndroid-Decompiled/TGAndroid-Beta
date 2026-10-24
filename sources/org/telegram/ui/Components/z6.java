package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.Callback2 {
    public final int f33160a;
    public final i8 f33161b;

    public z6(i8 i8Var, int i10) {
        this.f33160a = i10;
        this.f33161b = i8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f33160a) {
            case 0:
                i8 i8Var = this.f33161b;
                i8Var.X = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.a1 a1Var = i8Var.W;
                float floatValue = ((Float) obj).floatValue();
                a1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f33161b.f27335h0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
