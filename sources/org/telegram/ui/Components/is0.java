package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class is0 extends pj0 {
    public final Context f34853c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 f34854e;
    public final gs0 f34855f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f34856n = new ArrayList();
    public tr0 f34857r;
    public final zs0 f34858s;

    public is0(zs0 zs0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f34858s = zs0Var;
        this.f34853c = context;
        this.d = i7;
        this.f34854e = g6Var;
        this.f34855f = new gs0(this, i7, g6Var);
        E();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f34856n;
        arrayList.clear();
        ArrayList c10 = this.f34858s.f41121v1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(i10);
            if (ijVar.X != i7) {
                int i11 = ijVar.f23262k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.id.u(j3, false);
                tL_message.f26977id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(this.d, tL_message, false, false);
                ijVar2.D = 10;
                ijVar2.U = 1;
                ijVar2.f23259j0 = true;
                arrayList.add(ijVar2);
                i7 = ijVar.X;
            }
            arrayList.add(ijVar);
        }
    }

    @Override
    public final int b() {
        return this.f34856n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f34856n;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.ij) arrayList.get(i7)).U;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f34856n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                int i10 = d1Var.f57060f;
                View view = d1Var.f57056a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.q1) view).w3(ijVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.t0) view).setMessageObject(ijVar);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            hs0 hs0Var = new hs0(this.f34853c, this.d, false, null, this.f34854e);
            hs0Var.setDelegate(this.f34855f);
            return new v4.d1(hs0Var);
        }
        return new v4.d1(new org.telegram.ui.Cells.t0(this.f34853c, this.f34854e, false));
    }
}
