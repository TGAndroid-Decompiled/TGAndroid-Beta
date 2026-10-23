package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class b7 implements Utilities.Callback2 {
    public final int f24966a;
    public final k8 f24967b;

    public b7(k8 k8Var, int i10) {
        this.f24966a = i10;
        this.f24967b = k8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f24966a) {
            case 0:
                k8 k8Var = this.f24967b;
                k8Var.X = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.a1 a1Var = k8Var.W;
                float floatValue = ((Float) obj).floatValue();
                a1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f24967b.f27924h0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
