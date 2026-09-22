package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class p7 extends h7 {
    public org.telegram.ui.Cells.t7 f36508n;
    public final ArrayList f36509r;
    public org.telegram.ui.Components.pq f36510s;
    public final t7 v;

    public p7(t7 t7Var) {
        super(t7Var, 1);
        this.v = t7Var;
        this.f36509r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f36509r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((n7) arrayList2.get(i10)).d.f49512a.getPath();
                if (((n7) arrayList2.get(i10)).d.d == 1) {
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
        if (this.f36510s == null) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.f36510s = pqVar;
            pqVar.f27404w = true;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) c1Var.f42995a;
        zh.a aVar = ((n7) this.e.get(i10)).d;
        Object tag = u7Var.getTag();
        ImageReceiver imageReceiver = u7Var.f21638c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        u7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f49512a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f36510s, null, null, 0);
            u7Var.m(AndroidUtilities.formatFileSize(aVar.f49514c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f36510s, null, null, 0);
            u7Var.m(AndroidUtilities.formatFileSize(aVar.f49514c), false);
        }
        u7Var.i(this.v.f37672f.f49523j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (this.f36508n == null) {
            this.f36508n = new org.telegram.ui.Cells.t7(viewGroup.getContext(), null);
        }
        o7 o7Var = new o7(this, viewGroup.getContext(), this.f36508n, this.v.d.getCurrentAccount());
        o7Var.setStyle(1);
        return new s4.c1(o7Var);
    }
}
