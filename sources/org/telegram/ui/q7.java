package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class q7 extends i7 {
    public org.telegram.ui.Cells.s7 f39725n;
    public final ArrayList f39726r;
    public org.telegram.ui.Components.sq f39727s;
    public final v7 v;

    public q7(v7 v7Var) {
        super(v7Var, 1);
        this.v = v7Var;
        this.f39726r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39726r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37016e;
            if (i10 < arrayList2.size()) {
                String path = ((o7) arrayList2.get(i10)).d.f53573a.getPath();
                if (((o7) arrayList2.get(i10)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        if (this.f39727s == null) {
            org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.X9, false)), org.telegram.ui.ActionBar.i6.R4);
            this.f39727s = sqVar;
            sqVar.f30931w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) c1Var.f46538a;
        zh.a aVar = ((o7) this.f37016e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f23079c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f53573a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a4.a.l(max, max, "_"), this.f39727s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f53575c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a4.a.l(max, max, "_"), this.f39727s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f53575c), false);
        }
        t7Var.i(this.v.f41622f.f53586j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (this.f39725n == null) {
            this.f39725n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        p7 p7Var = new p7(this, viewGroup.getContext(), this.f39725n, this.v.d.getCurrentAccount());
        p7Var.setStyle(1);
        return new s4.c1(p7Var);
    }
}
