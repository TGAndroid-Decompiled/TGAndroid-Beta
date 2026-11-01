package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class ht0 extends tk0 {
    public final Context f26915c;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final ft0 f26916f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f26917n = new ArrayList();
    public ss0 f26918r;
    public final au0 f26919s;

    public ht0(au0 au0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f26919s = au0Var;
        this.f26915c = context;
        this.d = i10;
        this.e = p6Var;
        this.f26916f = new ft0(this, i10, p6Var);
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f26917n;
        arrayList.clear();
        ArrayList c10 = this.f26919s.f24562v1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) c10.get(i11);
            if (kjVar.X != i10) {
                int i12 = kjVar.f16690k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = org.telegram.messenger.dd.u(j10, false);
                tL_message.f19815id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j10 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(this.d, tL_message, false, false);
                kjVar2.D = 10;
                kjVar2.U = 1;
                kjVar2.f16687j0 = true;
                arrayList.add(kjVar2);
                i10 = kjVar.X;
            }
            arrayList.add(kjVar);
        }
    }

    @Override
    public final int b() {
        return this.f26917n.size();
    }

    @Override
    public final int d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26917n;
            if (i10 < arrayList.size()) {
                return ((org.telegram.messenger.kj) arrayList.get(i10)).U;
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
    public final void t(s4.c1 c1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26917n;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
                int i11 = c1Var.f47912f;
                View view = c1Var.f47909a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.q1) view).s3(kjVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.s0) view).setMessageObject(kjVar);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            gt0 gt0Var = new gt0(this.f26915c, this.d, false, null, this.e);
            gt0Var.setDelegate(this.f26916f);
            return new s4.c1(gt0Var);
        }
        return new s4.c1(new org.telegram.ui.Cells.s0(this.f26915c, this.e, false));
    }
}
