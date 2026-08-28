package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class u6 implements Utilities.Callback2 {
    public final int f32934a;
    public final c8 f32935b;

    public u6(c8 c8Var, int i9) {
        this.f32934a = i9;
        this.f32935b = c8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f32934a) {
            case 0:
                c8 c8Var = this.f32935b;
                c8Var.U = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.T;
                float floatValue = ((Float) obj).floatValue();
                c1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f32935b.f27385e0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
