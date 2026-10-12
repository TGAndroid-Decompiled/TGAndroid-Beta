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
    public org.telegram.ui.Cells.s7 f41202n;
    public final ArrayList f41203r;
    public org.telegram.ui.Components.hr f41204s;
    public final u7 v;

    public q7(u7 u7Var) {
        super(u7Var, 1);
        this.v = u7Var;
        this.f41203r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f41203r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f38270e;
            if (i10 < arrayList2.size()) {
                String path = ((o7) arrayList2.get(i10)).d.f54926a.getPath();
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        if (this.f41204s == null) {
            org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.X9, false)), org.telegram.ui.ActionBar.h6.R4);
            this.f41204s = hrVar;
            hrVar.f26883w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) d1Var.f47897a;
        zh.a aVar = ((o7) this.f38270e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f22838c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f54926a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f41204s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54928c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f41204s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54928c), false);
        }
        t7Var.i(this.v.f42384f.f54939j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (this.f41202n == null) {
            this.f41202n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        p7 p7Var = new p7(this, viewGroup.getContext(), this.f41202n, this.v.d.getCurrentAccount());
        p7Var.setStyle(1);
        return new s4.d1(p7Var);
    }
}
