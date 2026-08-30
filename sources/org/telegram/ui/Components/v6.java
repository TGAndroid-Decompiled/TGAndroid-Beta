package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class v6 implements Utilities.Callback2 {
    public final int f29368a;
    public final c8 f29369b;

    public v6(c8 c8Var, int i10) {
        this.f29368a = i10;
        this.f29369b = c8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f29368a) {
            case 0:
                c8 c8Var = this.f29369b;
                c8Var.V = !((Boolean) obj2).booleanValue();
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.U;
                float floatValue = ((Float) obj).floatValue();
                c1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                this.f29369b.f23893f0.setBackground(new BitmapDrawable((Bitmap) obj));
                return;
        }
    }
}
