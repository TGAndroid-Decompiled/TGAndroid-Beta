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
    public org.telegram.ui.Cells.q7 f40358n;
    public final ArrayList f40359r;
    public org.telegram.ui.Components.pq f40360s;
    public final u7 v;

    public q7(u7 u7Var) {
        super(u7Var, 1);
        this.v = u7Var;
        this.f40359r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z4;
        super.F();
        ArrayList arrayList = this.f40359r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37339e;
            if (i10 < arrayList2.size()) {
                String path = ((o7) arrayList2.get(i10)).d.f16243a.getPath();
                if (((o7) arrayList2.get(i10)).d.d == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z4, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        if (this.f40360s == null) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.X9, false)), org.telegram.ui.ActionBar.k6.R4);
            this.f40360s = pqVar;
            pqVar.f30173w = true;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) m1Var.f5875a;
        nh.a aVar = ((o7) this.f37339e.get(i10)).d;
        Object tag = r7Var.getTag();
        ImageReceiver imageReceiver = r7Var.f23561c;
        if (aVar == tag) {
            z4 = true;
        } else {
            z4 = false;
        }
        r7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f16243a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.f40360s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.f16245c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.f40360s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.f16245c), false);
        }
        r7Var.i(this.v.f41804f.f16256j.contains(aVar), z4);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        if (this.f40358n == null) {
            this.f40358n = new org.telegram.ui.Cells.q7(viewGroup.getContext(), null);
        }
        p7 p7Var = new p7(this, viewGroup.getContext(), this.f40358n, this.v.d.getCurrentAccount());
        p7Var.setStyle(1);
        return new f2.m1(p7Var);
    }
}
