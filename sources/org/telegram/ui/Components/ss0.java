package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class ss0 extends dk0 {
    public final Context f39688c;
    public final int d;
    public final org.telegram.ui.ActionBar.h6 f39689e;
    public final qs0 f39690f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f39691n = new ArrayList();
    public cs0 f39692r;
    public final jt0 f39693s;

    public ss0(jt0 jt0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f39693s = jt0Var;
        this.f39688c = context;
        this.d = i7;
        this.f39689e = h6Var;
        this.f39690f = new qs0(this, i7, h6Var);
        E();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f39691n;
        arrayList.clear();
        ArrayList c10 = this.f39693s.f36683w1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c10.get(i10);
            if (fjVar.X != i7) {
                int i11 = fjVar.f23993k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.gd.u(j3, false);
                tL_message.f28452id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(this.d, tL_message, false, false);
                fjVar2.D = 10;
                fjVar2.U = 1;
                fjVar2.f23999l0 = true;
                arrayList.add(fjVar2);
                i7 = fjVar.X;
            }
            arrayList.add(fjVar);
        }
    }

    @Override
    public final int b() {
        return this.f39691n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f39691n;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.fj) arrayList.get(i7)).U;
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
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f39691n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
                int i10 = f1Var.f59165f;
                View view = f1Var.f59161a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.r1) view).y3(fjVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(fjVar);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            rs0 rs0Var = new rs0(this.f39688c, this.d, false, null, this.f39689e);
            rs0Var.setDelegate(this.f39690f);
            return new v4.f1(rs0Var);
        }
        return new v4.f1(new org.telegram.ui.Cells.v0(this.f39688c, this.f39689e, false));
    }
}
