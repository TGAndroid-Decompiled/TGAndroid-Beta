package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class fs0 extends sj0 {
    public final Context f33859c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 f33860e;
    public final ds0 f33861f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f33862n = new ArrayList();
    public qr0 f33863r;
    public final ws0 f33864s;

    public fs0(ws0 ws0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33864s = ws0Var;
        this.f33859c = context;
        this.d = i3;
        this.f33860e = e6Var;
        this.f33861f = new ds0(this, i3, e6Var);
        E();
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f33862n;
        arrayList.clear();
        ArrayList c2 = this.f33864s.f40136w1[8].c();
        int i3 = 0;
        for (int i10 = 0; i10 < c2.size(); i10++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) c2.get(i10);
            if (ziVar.X != i3) {
                int i11 = ziVar.f26868k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i11;
                tL_message.message = org.telegram.messenger.bd.u(j10, false);
                tL_message.f27022id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j10 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(this.d, tL_message, false, false);
                ziVar2.D = 10;
                ziVar2.U = 1;
                ziVar2.f26864j0 = true;
                arrayList.add(ziVar2);
                i3 = ziVar.X;
            }
            arrayList.add(ziVar);
        }
    }

    @Override
    public final int b() {
        return this.f33862n.size();
    }

    @Override
    public final int d(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f33862n;
            if (i3 < arrayList.size()) {
                return ((org.telegram.messenger.zi) arrayList.get(i3)).U;
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
    public final void t(u4.d1 d1Var, int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f33862n;
            if (i3 < arrayList.size()) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
                int i10 = d1Var.f55544f;
                View view = d1Var.f55540a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.q1) view).u3(ziVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.t0) view).setMessageObject(ziVar);
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        if (i3 == 0) {
            es0 es0Var = new es0(this.f33859c, this.d, false, null, this.f33860e);
            es0Var.setDelegate(this.f33861f);
            return new u4.d1(es0Var);
        }
        return new u4.d1(new org.telegram.ui.Cells.t0(this.f33859c, this.f33860e, false));
    }
}
