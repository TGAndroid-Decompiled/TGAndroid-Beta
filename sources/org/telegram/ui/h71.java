package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class h71 extends mq0 {
    public final org.telegram.messenger.ff f47627a;
    public final i71 f47628b;

    public h71(i71 i71Var, org.telegram.messenger.ff ffVar) {
        this.f47628b = i71Var;
        this.f47627a = ffVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        t71 t71Var = this.f47628b.f47927a;
        org.telegram.messenger.ff ffVar = this.f47627a;
        if (ffVar.h != null) {
            File z12 = org.telegram.messenger.w7.z(4);
            File file = new File(z12, Utilities.f22414b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.fc.K(ffVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(ffVar.h);
            t71Var.D1 = new pc1(file2, file2, "");
            t71Var.E1 = K;
            t71Var.d2 = 0;
            t71Var.f51478z0.requestLayout();
            t71Var.g1(false);
            t71Var.f51477y1 = null;
            t71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
