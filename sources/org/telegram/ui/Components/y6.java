package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class y6 implements Utilities.Callback2 {
    public final int f30164a;
    public final h8 f30165b;

    public y6(h8 h8Var, int i10) {
        this.f30164a = i10;
        this.f30165b = h8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f30164a) {
            case 0:
                h8 h8Var = this.f30165b;
                h8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.b1 b1Var = h8Var.X;
                float floatValue = ((Float) obj).floatValue();
                b1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f30165b.f24562i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
