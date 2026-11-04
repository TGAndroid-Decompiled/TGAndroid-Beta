package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class p7 extends h7 {
    public m.o3 f48480n;
    public final ArrayList f48481r;
    public org.telegram.ui.Components.xp f48482s;
    public final u7 f48483w;

    public p7(u7 u7Var) {
        super(u7Var, 1);
        this.f48483w = u7Var;
        this.f48481r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f48481r;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45561e;
            if (i3 < arrayList2.size()) {
                String path = ((n7) arrayList2.get(i3)).d.f9180a.getPath();
                if (((n7) arrayList2.get(i3)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new org.telegram.messenger.ye(0, path, 0, z10, 0, 0));
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        if (this.f48482s == null) {
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false)), org.telegram.ui.ActionBar.k6.R4);
            this.f48482s = xpVar;
            xpVar.f40447x = true;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) d1Var.f55540a;
        di.b bVar = ((n7) this.f45561e.get(i3)).d;
        Object tag = n7Var.getTag();
        ImageReceiver imageReceiver = n7Var.f29683c;
        if (bVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        n7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.f22607p);
        int i10 = bVar.d;
        File file = bVar.f9180a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.ac.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.i(max, "_", max), this.f48482s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.f9182c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.ac.g("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.i(max, "_", max), this.f48482s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.f9182c, false, false), false);
        }
        n7Var.i(this.f48483w.h.f9193j.contains(bVar), z10);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        if (this.f48480n == null) {
            this.f48480n = new m.o3(viewGroup.getContext(), null);
        }
        o7 o7Var = new o7(this, viewGroup.getContext(), this.f48480n, this.f48483w.f49999e.getCurrentAccount());
        o7Var.setStyle(1);
        return new u4.d1(o7Var);
    }
}
