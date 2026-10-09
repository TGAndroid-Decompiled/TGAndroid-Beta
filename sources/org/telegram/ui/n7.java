package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class n7 extends f7 {
    public org.telegram.ui.Cells.s7 f40088n;
    public final ArrayList f40089r;
    public org.telegram.ui.Components.fr f40090s;
    public final r7 v;

    public n7(r7 r7Var) {
        super(r7Var, 1);
        this.v = r7Var;
        this.f40089r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f40089r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37173e;
            if (i10 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i10)).d.f54692a.getPath();
                if (((l7) arrayList2.get(i10)).d.d == 1) {
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        if (this.f40090s == null) {
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.X9, false)), org.telegram.ui.ActionBar.i6.R4);
            this.f40090s = frVar;
            frVar.f26471w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) d1Var.f47656a;
        zh.a aVar = ((l7) this.f37173e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f23065c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f54692a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f40090s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54694c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f40090s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54694c), false);
        }
        t7Var.i(this.v.f41290f.f54705j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (this.f40088n == null) {
            this.f40088n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        m7 m7Var = new m7(this, viewGroup.getContext(), this.f40088n, this.v.d.getCurrentAccount());
        m7Var.setStyle(1);
        return new s4.d1(m7Var);
    }
}
