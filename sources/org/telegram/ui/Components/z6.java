package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.Callback2 {
    public final int f35226a;
    public final g8 f35227b;

    public z6(g8 g8Var, int i10) {
        this.f35226a = i10;
        this.f35227b = g8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f35226a) {
            case 0:
                g8 g8Var = this.f35227b;
                g8Var.U = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.c1 c1Var = g8Var.T;
                float floatValue = ((Float) obj).floatValue();
                c1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f35227b.f28783e0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
