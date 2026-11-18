package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class l71 extends oq0 {
    public final org.telegram.messenger.ef f49471a;
    public final m71 f49472b;

    public l71(m71 m71Var, org.telegram.messenger.ef efVar) {
        this.f49472b = m71Var;
        this.f49471a = efVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        x71 x71Var = this.f49472b.f49734a;
        org.telegram.messenger.ef efVar = this.f49471a;
        if (efVar.h != null) {
            File z12 = org.telegram.messenger.w7.z(4);
            File file = new File(z12, Utilities.f22777b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.ec.K(efVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(efVar.h);
            x71Var.D1 = new sc1(file2, file2, "");
            x71Var.E1 = K;
            x71Var.d2 = 0;
            x71Var.f53739z0.requestLayout();
            x71Var.g1(false);
            x71Var.f53738y1 = null;
            x71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
