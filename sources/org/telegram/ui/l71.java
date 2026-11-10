package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class l71 extends qq0 {
    public final org.telegram.messenger.gf f47540a;
    public final m71 f47541b;

    public l71(m71 m71Var, org.telegram.messenger.gf gfVar) {
        this.f47541b = m71Var;
        this.f47540a = gfVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        x71 x71Var = this.f47541b.f47820a;
        org.telegram.messenger.gf gfVar = this.f47540a;
        if (gfVar.h != null) {
            File z11 = org.telegram.messenger.w7.z(4);
            File file = new File(z11, Utilities.f21339b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.gc.K(gfVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(gfVar.h);
            x71Var.C1 = new uc1(file2, file2, "");
            x71Var.D1 = K;
            x71Var.f51572c2 = 0;
            x71Var.f51627y0.requestLayout();
            x71Var.g1(false);
            x71Var.f51625x1 = null;
            x71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
