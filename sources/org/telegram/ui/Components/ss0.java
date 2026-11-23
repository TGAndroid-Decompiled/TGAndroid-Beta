package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class ss0 extends dk0 {
    public final Context f39680c;
    public final int d;
    public final org.telegram.ui.ActionBar.h6 f39681e;
    public final qs0 f39682f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f39683n = new ArrayList();
    public cs0 f39684r;
    public final jt0 f39685s;

    public ss0(jt0 jt0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f39685s = jt0Var;
        this.f39680c = context;
        this.d = i7;
        this.f39681e = h6Var;
        this.f39682f = new qs0(this, i7, h6Var);
        E();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f39683n;
        arrayList.clear();
        ArrayList c10 = this.f39685s.f36677w1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c10.get(i10);
            if (gjVar.X != i7) {
                int i11 = gjVar.f24213k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.hd.u(j3, false);
                tL_message.f28455id = 0;
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
                gjVar2.f24219l0 = true;
                arrayList.add(gjVar2);
                i7 = gjVar.X;
            }
            arrayList.add(gjVar);
        }
    }

    @Override
    public final int b() {
        return this.f39683n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f39683n;
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
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f39683n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                int i10 = f1Var.f59169f;
                View view = f1Var.f59165a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.r1) view).y3(gjVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(gjVar);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            rs0 rs0Var = new rs0(this.f39680c, this.d, false, null, this.f39681e);
            rs0Var.setDelegate(this.f39682f);
            return new v4.f1(rs0Var);
        }
        return new v4.f1(new org.telegram.ui.Cells.v0(this.f39680c, this.f39681e, false));
    }
}
