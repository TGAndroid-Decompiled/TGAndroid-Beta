package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class d7 implements Utilities.Callback2 {
    public final int f24310a;
    public final m8 f24311b;

    public d7(m8 m8Var, int i10) {
        this.f24310a = i10;
        this.f24311b = m8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f24310a) {
            case 0:
                m8 m8Var = this.f24311b;
                m8Var.Y = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.a1 a1Var = m8Var.X;
                float floatValue = ((Float) obj).floatValue();
                a1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f24311b.f27244i0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
