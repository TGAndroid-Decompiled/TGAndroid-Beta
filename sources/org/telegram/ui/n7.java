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
    public org.telegram.ui.Cells.s7 f40134n;
    public final ArrayList f40135r;
    public org.telegram.ui.Components.fr f40136s;
    public final r7 v;

    public n7(r7 r7Var) {
        super(r7Var, 1);
        this.v = r7Var;
        this.f40135r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f40135r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37219e;
            if (i10 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i10)).d.f54738a.getPath();
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
        if (this.f40136s == null) {
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.X9, false)), org.telegram.ui.ActionBar.i6.R4);
            this.f40136s = frVar;
            frVar.f26503w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) d1Var.f47702a;
        zh.a aVar = ((l7) this.f37219e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f23069c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f54738a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f40136s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54740c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f40136s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54740c), false);
        }
        t7Var.i(this.v.f41336f.f54751j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (this.f40134n == null) {
            this.f40134n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        m7 m7Var = new m7(this, viewGroup.getContext(), this.f40134n, this.v.d.getCurrentAccount());
        m7Var.setStyle(1);
        return new s4.d1(m7Var);
    }
}
