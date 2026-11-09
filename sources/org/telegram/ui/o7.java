package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class o7 extends g7 {
    public m.q3 f48364n;
    public final ArrayList f48365r;
    public org.telegram.ui.Components.xp f48366s;
    public final t7 f48367w;

    public o7(t7 t7Var) {
        super(t7Var, 1);
        this.f48367w = t7Var;
        this.f48365r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z9;
        super.F();
        ArrayList arrayList = this.f48365r;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45604e;
            if (i7 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i7)).d.f6415a.getPath();
                if (((m7) arrayList2.get(i7)).d.d == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                arrayList.add(new org.telegram.messenger.gf(0, path, 0, z9, 0, 0));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        if (this.f48366s == null) {
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.X9, false)), org.telegram.ui.ActionBar.l6.R4);
            this.f48366s = xpVar;
            xpVar.f40453x = true;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) d1Var.f57056a;
        ci.b bVar = ((m7) this.f45604e.get(i7)).d;
        Object tag = o7Var.getTag();
        ImageReceiver imageReceiver = o7Var.f29668c;
        if (bVar == tag) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.f22562p);
        int i10 = bVar.d;
        File file = bVar.f6415a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.hc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.j(max, "_", max), this.f48366s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.f6417c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.hc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.j(max, "_", max), this.f48366s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.f6417c, false, false), false);
        }
        o7Var.i(this.f48367w.h.f6428j.contains(bVar), z9);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (this.f48364n == null) {
            this.f48364n = new m.q3(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f48364n, this.f48367w.f50101e.getCurrentAccount());
        n7Var.setStyle(1);
        return new v4.d1(n7Var);
    }
}
