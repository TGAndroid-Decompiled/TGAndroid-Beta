package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class o7 extends g7 {
    public ga.d f50562n;
    public final ArrayList f50563r;
    public org.telegram.ui.Components.lq f50564s;
    public final t7 f50565w;

    public o7(t7 t7Var) {
        super(t7Var, 1);
        this.f50565w = t7Var;
        this.f50563r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f50563r;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47709e;
            if (i7 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i7)).d.f10956a.getPath();
                if (((m7) arrayList2.get(i7)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new org.telegram.messenger.ef(0, path, 0, z10, 0, 0));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        if (this.f50564s == null) {
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.X9, false)), org.telegram.ui.ActionBar.n6.R4);
            this.f50564s = lqVar;
            lqVar.f37204x = true;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) f1Var.f59245a;
        ei.b bVar = ((m7) this.f47709e.get(i7)).d;
        Object tag = o7Var.getTag();
        ImageReceiver imageReceiver = o7Var.f31263c;
        if (bVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        o7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.f24225p);
        int i10 = bVar.d;
        File file = bVar.f10956a;
        if (i10 == 1) {
            imageReceiver.r0(org.telegram.messenger.fc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.f50564s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.f10958c, false, false), true);
        } else {
            imageReceiver.r0(org.telegram.messenger.fc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.f50564s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.f10958c, false, false), false);
        }
        o7Var.i(this.f50565w.h.f10969j.contains(bVar), z10);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (this.f50562n == null) {
            this.f50562n = new ga.d(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f50562n, this.f50565w.f52277e.getCurrentAccount());
        n7Var.setStyle(1);
        return new v4.f1(n7Var);
    }
}
