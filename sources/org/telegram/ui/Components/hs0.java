package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class hs0 extends tj0 {
    public final Context f35328c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 f35329e;
    public final fs0 f35330f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f35331n = new ArrayList();
    public sr0 f35332r;
    public final ys0 f35333s;

    public hs0(ys0 ys0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35333s = ys0Var;
        this.f35328c = context;
        this.d = i7;
        this.f35329e = e6Var;
        this.f35330f = new fs0(this, i7, e6Var);
        E();
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f35331n;
        arrayList.clear();
        ArrayList c10 = this.f35333s.f42146w1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c10.get(i10);
            if (gjVar.X != i7) {
                int i11 = gjVar.f23819k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.hd.u(j3, false);
                tL_message.f28072id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(this.d, tL_message, false, false);
                gjVar2.D = 10;
                gjVar2.U = 1;
                gjVar2.f23825l0 = true;
                arrayList.add(gjVar2);
                i7 = gjVar.X;
            }
            arrayList.add(gjVar);
        }
    }

    @Override
    public final int b() {
        return this.f35331n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f35331n;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.gj) arrayList.get(i7)).U;
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
    public final void t(v4.e1 e1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f35331n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                int i10 = e1Var.f58539f;
                View view = e1Var.f58535a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.q1) view).x3(gjVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.t0) view).setMessageObject(gjVar);
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            gs0 gs0Var = new gs0(this.f35328c, this.d, false, null, this.f35329e);
            gs0Var.setDelegate(this.f35330f);
            return new v4.e1(gs0Var);
        }
        return new v4.e1(new org.telegram.ui.Cells.t0(this.f35328c, this.f35329e, false));
    }
}
