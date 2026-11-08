package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class o7 extends g7 {
    public m.q3 f48288n;
    public final ArrayList f48289r;
    public org.telegram.ui.Components.xp f48290s;
    public final t7 f48291w;

    public o7(t7 t7Var) {
        super(t7Var, 1);
        this.f48291w = t7Var;
        this.f48289r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z9;
        super.F();
        ArrayList arrayList = this.f48289r;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45467e;
            if (i7 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i7)).d.f6417a.getPath();
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
        if (this.f48290s == null) {
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false)), org.telegram.ui.ActionBar.k6.R4);
            this.f48290s = xpVar;
            xpVar.f40361x = true;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) d1Var.f57044a;
        ci.b bVar = ((m7) this.f45467e.get(i7)).d;
        Object tag = o7Var.getTag();
        ImageReceiver imageReceiver = o7Var.f29664c;
        if (bVar == tag) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.f22562p);
        int i10 = bVar.d;
        File file = bVar.f6417a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.hc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.j(max, "_", max), this.f48290s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.f6419c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.hc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.j(max, "_", max), this.f48290s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.f6419c, false, false), false);
        }
        o7Var.i(this.f48291w.h.f6430j.contains(bVar), z9);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (this.f48288n == null) {
            this.f48288n = new m.q3(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f48288n, this.f48291w.f49954e.getCurrentAccount());
        n7Var.setStyle(1);
        return new v4.d1(n7Var);
    }
}
