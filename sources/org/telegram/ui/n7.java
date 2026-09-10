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
    public org.telegram.ui.Cells.t7 f35143n;
    public final ArrayList f35144r;
    public org.telegram.ui.Components.vq f35145s;
    public final r7 v;

    public n7(r7 r7Var) {
        super(r7Var, 1);
        this.v = r7Var;
        this.f35144r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f35144r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i10)).d.f47167a.getPath();
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        if (this.f35145s == null) {
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.f35145s = vqVar;
            vqVar.f28580w = true;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) c1Var.f41610a;
        yh.a aVar = ((l7) this.e.get(i10)).d;
        Object tag = u7Var.getTag();
        ImageReceiver imageReceiver = u7Var.f20497c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        u7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f47167a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f35145s, null, null, 0);
            u7Var.m(AndroidUtilities.formatFileSize(aVar.f47169c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f35145s, null, null, 0);
            u7Var.m(AndroidUtilities.formatFileSize(aVar.f47169c), false);
        }
        u7Var.i(this.v.f36246f.f47178j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (this.f35143n == null) {
            this.f35143n = new org.telegram.ui.Cells.t7(viewGroup.getContext(), null);
        }
        m7 m7Var = new m7(this, viewGroup.getContext(), this.f35143n, this.v.d.getCurrentAccount());
        m7Var.setStyle(1);
        return new s4.c1(m7Var);
    }
}
