package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class gs0 extends oj0 {
    public final Context f33990c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 f33991e;
    public final es0 f33992f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f33993n = new ArrayList();
    public rr0 f33994r;
    public final xs0 f33995s;

    public gs0(xs0 xs0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33995s = xs0Var;
        this.f33990c = context;
        this.d = i7;
        this.f33991e = f6Var;
        this.f33992f = new es0(this, i7, f6Var);
        E();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f33993n;
        arrayList.clear();
        ArrayList c10 = this.f33995s.f40434v1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(i10);
            if (ijVar.X != i7) {
                int i11 = ijVar.f23244k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.hd.u(j3, false);
                tL_message.f26974id = 0;
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
                ijVar2.f23241j0 = true;
                arrayList.add(ijVar2);
                i7 = ijVar.X;
            }
            arrayList.add(ijVar);
        }
    }

    @Override
    public final int b() {
        return this.f33993n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f33993n;
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
            ArrayList arrayList = this.f33993n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                int i10 = d1Var.f56955f;
                View view = d1Var.f56951a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.q1) view).v3(ijVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.t0) view).setMessageObject(ijVar);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            fs0 fs0Var = new fs0(this.f33990c, this.d, false, null, this.f33991e);
            fs0Var.setDelegate(this.f33992f);
            return new v4.d1(fs0Var);
        }
        return new v4.d1(new org.telegram.ui.Cells.t0(this.f33990c, this.f33991e, false));
    }
}
