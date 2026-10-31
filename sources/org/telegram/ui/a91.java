package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class a91 extends yr0 {
    public final org.telegram.messenger.ef f35591a;
    public final b91 f35592b;

    public a91(b91 b91Var, org.telegram.messenger.ef efVar) {
        this.f35592b = b91Var;
        this.f35591a = efVar;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        m91 m91Var = this.f35592b.f36142a;
        org.telegram.messenger.ef efVar = this.f35591a;
        if (efVar.h != null) {
            File z12 = org.telegram.messenger.b8.z(4);
            File file = new File(z12, Utilities.f14519b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.i0.c1();
            Bitmap K = org.telegram.messenger.hc.K(efVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(efVar.h);
            m91Var.C1 = new ne1(file2, file2, "");
            m91Var.D1 = K;
            m91Var.f39547c2 = 0;
            m91Var.f39603y0.requestLayout();
            m91Var.f1(false);
            m91Var.f39601x1 = null;
            m91Var.m1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
