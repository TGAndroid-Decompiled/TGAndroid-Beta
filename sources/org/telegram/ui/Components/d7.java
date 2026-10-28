package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class d7 implements Utilities.Callback2 {
    public final int f27356a;
    public final m8 f27357b;

    public d7(m8 m8Var, int i10) {
        this.f27356a = i10;
        this.f27357b = m8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27356a) {
            case 0:
                m8 m8Var = this.f27357b;
                m8Var.X = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.c1 c1Var = m8Var.W;
                float floatValue = ((Float) obj).floatValue();
                c1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f27357b.f30439h0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
