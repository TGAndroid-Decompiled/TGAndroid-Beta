package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class n7 extends f7 {
    public m.o3 f50084n;
    public final ArrayList f50085r;
    public org.telegram.ui.Components.mq f50086s;
    public final s7 f50087w;

    public n7(s7 s7Var) {
        super(s7Var, 1);
        this.f50087w = s7Var;
        this.f50085r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f50085r;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47077e;
            if (i7 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i7)).d.f10963a.getPath();
                if (((l7) arrayList2.get(i7)).d.d == 1) {
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
        if (this.f50086s == null) {
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.X9, false)), org.telegram.ui.ActionBar.n6.R4);
            this.f50086s = mqVar;
            mqVar.f37616x = true;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) f1Var.f59123a;
        ei.b bVar = ((l7) this.f47077e.get(i7)).d;
        Object tag = p7Var.getTag();
        ImageReceiver imageReceiver = p7Var.f31226c;
        if (bVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.f24117p);
        int i10 = bVar.d;
        File file = bVar.f10963a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.fc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.f50086s, null, null, 0);
            p7Var.m(org.telegram.messenger.g0.i0(bVar.f10965c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.fc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.f50086s, null, null, 0);
            p7Var.m(org.telegram.messenger.g0.i0(bVar.f10965c, false, false), false);
        }
        p7Var.i(this.f50087w.h.f10976j.contains(bVar), z10);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (this.f50084n == null) {
            this.f50084n = new m.o3(viewGroup.getContext(), null);
        }
        m7 m7Var = new m7(this, viewGroup.getContext(), this.f50084n, this.f50087w.f51909e.getCurrentAccount());
        m7Var.setStyle(1);
        return new v4.f1(m7Var);
    }
}
