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
    public org.telegram.ui.Cells.q7 f40605n;
    public final ArrayList f40606r;
    public org.telegram.ui.Components.fq f40607s;
    public final r7 v;

    public n7(r7 r7Var) {
        super(r7Var, 1);
        this.v = r7Var;
        this.f40606r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f40606r;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37834e;
            if (i9 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i9)).d.f10780a.getPath();
                if (((l7) arrayList2.get(i9)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        if (this.f40607s == null) {
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.X9, false)), org.telegram.ui.ActionBar.f6.R4);
            this.f40607s = fqVar;
            fqVar.f28550w = true;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) q1Var.f5501a;
        hh.a aVar = ((l7) this.f37834e.get(i9)).d;
        Object tag = r7Var.getTag();
        ImageReceiver imageReceiver = r7Var.f25094c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        r7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i10 = aVar.d;
        File file = aVar.f10780a;
        if (i10 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), e2.c.l(max, "_", max), this.f40607s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.f10782c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), e2.c.l(max, "_", max), this.f40607s, null, null, 0);
            r7Var.m(AndroidUtilities.formatFileSize(aVar.f10782c), false);
        }
        r7Var.i(this.v.f42294f.f10793j.contains(aVar), z10);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        if (this.f40605n == null) {
            this.f40605n = new org.telegram.ui.Cells.q7(viewGroup.getContext(), null);
        }
        m7 m7Var = new m7(this, viewGroup.getContext(), this.f40605n, this.v.d.getCurrentAccount());
        m7Var.setStyle(1);
        return new f2.q1(m7Var);
    }
}
