package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class k71 extends pq0 {
    public final org.telegram.messenger.gf f47231a;
    public final l71 f47232b;

    public k71(l71 l71Var, org.telegram.messenger.gf gfVar) {
        this.f47232b = l71Var;
        this.f47231a = gfVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        w71 w71Var = this.f47232b.f47493a;
        org.telegram.messenger.gf gfVar = this.f47231a;
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
            w71Var.C1 = new tc1(file2, file2, "");
            w71Var.D1 = K;
            w71Var.f50913c2 = 0;
            w71Var.f50968y0.requestLayout();
            w71Var.g1(false);
            w71Var.f50966x1 = null;
            w71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
