package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class j71 extends oq0 {
    public final org.telegram.messenger.ef f49011a;
    public final k71 f49012b;

    public j71(k71 k71Var, org.telegram.messenger.ef efVar) {
        this.f49012b = k71Var;
        this.f49011a = efVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        v71 v71Var = this.f49012b.f49361a;
        org.telegram.messenger.ef efVar = this.f49011a;
        if (efVar.h != null) {
            File z12 = org.telegram.messenger.w7.z(4);
            File file = new File(z12, Utilities.f22875b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.ec.K(efVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(efVar.h);
            v71Var.D1 = new qc1(file2, file2, "");
            v71Var.E1 = K;
            v71Var.d2 = 0;
            v71Var.f52914z0.requestLayout();
            v71Var.g1(false);
            v71Var.f52913y1 = null;
            v71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
