package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class ss0 extends dk0 {
    public final Context f39636c;
    public final int d;
    public final org.telegram.ui.ActionBar.h6 f39637e;
    public final qs0 f39638f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f39639n = new ArrayList();
    public cs0 f39640r;
    public final jt0 f39641s;

    public ss0(jt0 jt0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f39641s = jt0Var;
        this.f39636c = context;
        this.d = i7;
        this.f39637e = h6Var;
        this.f39638f = new qs0(this, i7, h6Var);
        E();
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f39639n;
        arrayList.clear();
        ArrayList c10 = this.f39641s.f36632w1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c10.get(i10);
            if (gjVar.X != i7) {
                int i11 = gjVar.f24177k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.hd.u(j3, false);
                tL_message.f28419id = 0;
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
                gjVar2.f24183l0 = true;
                arrayList.add(gjVar2);
                i7 = gjVar.X;
            }
            arrayList.add(gjVar);
        }
    }

    @Override
    public final int b() {
        return this.f39639n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f39639n;
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
            ArrayList arrayList = this.f39639n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                int i10 = e1Var.f59115f;
                View view = e1Var.f59111a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.r1) view).y3(gjVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(gjVar);
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            rs0 rs0Var = new rs0(this.f39636c, this.d, false, null, this.f39637e);
            rs0Var.setDelegate(this.f39638f);
            return new v4.e1(rs0Var);
        }
        return new v4.e1(new org.telegram.ui.Cells.v0(this.f39636c, this.f39637e, false));
    }
}
