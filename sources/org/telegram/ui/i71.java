package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class i71 extends mq0 {
    public final org.telegram.messenger.gf f46583a;
    public final j71 f46584b;

    public i71(j71 j71Var, org.telegram.messenger.gf gfVar) {
        this.f46584b = j71Var;
        this.f46583a = gfVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        u71 u71Var = this.f46584b.f46842a;
        org.telegram.messenger.gf gfVar = this.f46583a;
        if (gfVar.h != null) {
            File z11 = org.telegram.messenger.w7.z(4);
            File file = new File(z11, Utilities.f21331b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.gc.K(gfVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(gfVar.h);
            u71Var.C1 = new pc1(file2, file2, "");
            u71Var.D1 = K;
            u71Var.f50255c2 = 0;
            u71Var.f50310y0.requestLayout();
            u71Var.g1(false);
            u71Var.f50308x1 = null;
            u71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
