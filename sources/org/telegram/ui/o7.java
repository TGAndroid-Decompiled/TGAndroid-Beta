package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class o7 extends g7 {
    public m.p3 f40158n;
    public final ArrayList f40159r;
    public org.telegram.ui.Components.eq f40160s;
    public final t7 f40161w;

    public o7(t7 t7Var) {
        super(t7Var, 1);
        this.f40161w = t7Var;
        this.f40159r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f40159r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i10)).d.f48492a.getPath();
                if (((m7) arrayList2.get(i10)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new org.telegram.messenger.ef(0, path, 0, z10, 0, 0));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        if (this.f40160s == null) {
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.X9, false)), org.telegram.ui.ActionBar.t6.R4);
            this.f40160s = eqVar;
            eqVar.f25847x = true;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) c1Var.f47898a;
        sh.a aVar = ((m7) this.e.get(i10)).d;
        Object tag = s7Var.getTag();
        ImageReceiver imageReceiver = s7Var.f23021c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.i0.c1().x / org.telegram.messenger.i0.f16025p);
        int i11 = aVar.d;
        File file = aVar.f48492a;
        if (i11 == 1) {
            imageReceiver.q0(org.telegram.messenger.ic.g("vthumb://0:" + file.getAbsolutePath()), a1.g.i(max, max, "_"), this.f40160s, null, null, 0);
            s7Var.m(org.telegram.messenger.i0.i0(aVar.f48494c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.ic.g("thumb://0:" + file.getAbsolutePath()), a1.g.i(max, max, "_"), this.f40160s, null, null, 0);
            s7Var.m(org.telegram.messenger.i0.i0(aVar.f48494c, false, false), false);
        }
        s7Var.i(this.f40161w.h.f48503j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (this.f40158n == null) {
            this.f40158n = new m.p3(viewGroup.getContext(), (org.telegram.ui.ActionBar.p6) null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f40158n, this.f40161w.e.getCurrentAccount());
        n7Var.setStyle(1);
        return new s4.c1(n7Var);
    }
}
