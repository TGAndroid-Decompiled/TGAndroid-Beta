package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class l71 extends oq0 {
    public final org.telegram.messenger.ff f49515a;
    public final m71 f49516b;

    public l71(m71 m71Var, org.telegram.messenger.ff ffVar) {
        this.f49516b = m71Var;
        this.f49515a = ffVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        x71 x71Var = this.f49516b.f49782a;
        org.telegram.messenger.ff ffVar = this.f49515a;
        if (ffVar.h != null) {
            File z12 = org.telegram.messenger.w7.z(4);
            File file = new File(z12, Utilities.f22808b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.fc.K(ffVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(ffVar.h);
            x71Var.D1 = new sc1(file2, file2, "");
            x71Var.E1 = K;
            x71Var.d2 = 0;
            x71Var.f53784z0.requestLayout();
            x71Var.g1(false);
            x71Var.f53783y1 = null;
            x71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
