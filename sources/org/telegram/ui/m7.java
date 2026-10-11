package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class m7 extends e7 {
    public org.telegram.ui.Cells.s7 f39857n;
    public final ArrayList f39858r;
    public org.telegram.ui.Components.fr f39859s;
    public final q7 v;

    public m7(q7 q7Var) {
        super(q7Var, 1);
        this.v = q7Var;
        this.f39858r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39858r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f36962e;
            if (i10 < arrayList2.size()) {
                String path = ((k7) arrayList2.get(i10)).d.f54815a.getPath();
                if (((k7) arrayList2.get(i10)).d.d == 1) {
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
        if (this.f39859s == null) {
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.X9, false)), org.telegram.ui.ActionBar.h6.R4);
            this.f39859s = frVar;
            frVar.f26552w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) d1Var.f47782a;
        zh.a aVar = ((k7) this.f36962e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f23093c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f54815a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f39859s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54817c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.l(max, max, "_"), this.f39859s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f54817c), false);
        }
        t7Var.i(this.v.f41090f.f54828j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (this.f39857n == null) {
            this.f39857n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        l7 l7Var = new l7(this, viewGroup.getContext(), this.f39857n, this.v.d.getCurrentAccount());
        l7Var.setStyle(1);
        return new s4.d1(l7Var);
    }
}
