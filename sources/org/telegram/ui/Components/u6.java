package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

public final class u6 implements Utilities.Callback2 {

    public final int f32987a;

    public final b8 f32988b;

    public u6(b8 b8Var, int i10) {
        this.f32987a = i10;
        this.f32988b = b8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f32987a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                b8 b8Var = this.f32988b;
                b8Var.U = z10;
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.b1 b1Var = b8Var.T;
                float fFloatValue = ((Float) obj).floatValue();
                b1Var.getClass();
                mediaController.setPlaybackSpeed(true, (fFloatValue * 2.8f) + 0.2f);
                break;
            default:
                this.f32988b.f27017e0.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
