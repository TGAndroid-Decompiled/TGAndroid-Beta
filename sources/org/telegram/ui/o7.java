package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class o7 extends g7 {
    public m.o3 f49832n;
    public final ArrayList f49833r;
    public org.telegram.ui.Components.fq f49834s;
    public final t7 f49835w;

    public o7(t7 t7Var) {
        super(t7Var, 1);
        this.f49835w = t7Var;
        this.f49833r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f49833r;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47020e;
            if (i7 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i7)).d.f10646a.getPath();
                if (((m7) arrayList2.get(i7)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new org.telegram.messenger.ff(0, path, 0, z10, 0, 0));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        if (this.f49834s == null) {
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.f49834s = fqVar;
            fqVar.f34678x = true;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) e1Var.f58535a;
        ei.b bVar = ((m7) this.f47020e.get(i7)).d;
        Object tag = n7Var.getTag();
        ImageReceiver imageReceiver = n7Var.f30744c;
        if (bVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        n7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.f23608p);
        int i10 = bVar.d;
        File file = bVar.f10646a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.gc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.f49834s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.f10648c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.gc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.f49834s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.f10648c, false, false), false);
        }
        n7Var.i(this.f49835w.h.f10659j.contains(bVar), z10);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (this.f49832n == null) {
            this.f49832n = new m.o3(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f49832n, this.f49835w.f51399e.getCurrentAccount());
        n7Var.setStyle(1);
        return new v4.e1(n7Var);
    }
}
