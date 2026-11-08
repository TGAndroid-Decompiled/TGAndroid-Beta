package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class j71 extends nq0 {
    public final org.telegram.messenger.gf f46868a;
    public final k71 f46869b;

    public j71(k71 k71Var, org.telegram.messenger.gf gfVar) {
        this.f46869b = k71Var;
        this.f46868a = gfVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        v71 v71Var = this.f46869b.f47135a;
        org.telegram.messenger.gf gfVar = this.f46868a;
        if (gfVar.h != null) {
            File z11 = org.telegram.messenger.w7.z(4);
            File file = new File(z11, Utilities.f21334b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.gc.K(gfVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(gfVar.h);
            v71Var.C1 = new qc1(file2, file2, "");
            v71Var.D1 = K;
            v71Var.f50531c2 = 0;
            v71Var.f50586y0.requestLayout();
            v71Var.g1(false);
            v71Var.f50584x1 = null;
            v71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
