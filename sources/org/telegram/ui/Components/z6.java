package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.Callback2 {
    public final int f29601a;
    public final j8 f29602b;

    public z6(j8 j8Var, int i10) {
        this.f29601a = i10;
        this.f29602b = j8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f29601a) {
            case 0:
                j8 j8Var = this.f29602b;
                j8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.c1 c1Var = j8Var.X;
                float floatValue = ((Float) obj).floatValue();
                c1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f29602b.f24287i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
