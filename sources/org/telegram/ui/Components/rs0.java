package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class rs0 extends dk0 {
    public final Context f39398c;
    public final int d;
    public final org.telegram.ui.ActionBar.i6 f39399e;
    public final ps0 f39400f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f39401n = new ArrayList();
    public cs0 f39402r;
    public final it0 f39403s;

    public rs0(it0 it0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f39403s = it0Var;
        this.f39398c = context;
        this.d = i7;
        this.f39399e = i6Var;
        this.f39400f = new ps0(this, i7, i6Var);
        E();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f39401n;
        arrayList.clear();
        ArrayList c10 = this.f39403s.f36160w1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c10.get(i10);
            if (fjVar.X != i7) {
                int i11 = fjVar.f24073k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.gd.u(j3, false);
                tL_message.f28513id = 0;
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
                fjVar2.f24079l0 = true;
                arrayList.add(fjVar2);
                i7 = fjVar.X;
            }
            arrayList.add(fjVar);
        }
    }

    @Override
    public final int b() {
        return this.f39401n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f39401n;
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
            ArrayList arrayList = this.f39401n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
                int i10 = f1Var.f59249f;
                View view = f1Var.f59245a;
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
            qs0 qs0Var = new qs0(this.f39398c, this.d, false, null, this.f39399e);
            qs0Var.setDelegate(this.f39400f);
            return new v4.f1(qs0Var);
        }
        return new v4.f1(new org.telegram.ui.Cells.v0(this.f39398c, this.f39399e, false));
    }
}
