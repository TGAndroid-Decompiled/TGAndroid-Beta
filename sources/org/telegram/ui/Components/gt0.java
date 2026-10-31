package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class gt0 extends sk0 {
    public final Context f26518c;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final et0 f26519f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f26520n = new ArrayList();
    public rs0 f26521r;
    public final zt0 f26522s;

    public gt0(zt0 zt0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f26522s = zt0Var;
        this.f26518c = context;
        this.d = i10;
        this.e = p6Var;
        this.f26519f = new et0(this, i10, p6Var);
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f26520n;
        arrayList.clear();
        ArrayList c10 = this.f26522s.f33234v1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) c10.get(i11);
            if (jjVar.X != i10) {
                int i12 = jjVar.f16337k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = org.telegram.messenger.cd.u(j10, false);
                tL_message.f19814id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j10 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(this.d, tL_message, false, false);
                jjVar2.D = 10;
                jjVar2.U = 1;
                jjVar2.f16334j0 = true;
                arrayList.add(jjVar2);
                i10 = jjVar.X;
            }
            arrayList.add(jjVar);
        }
    }

    @Override
    public final int b() {
        return this.f26520n.size();
    }

    @Override
    public final int d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26520n;
            if (i10 < arrayList.size()) {
                return ((org.telegram.messenger.jj) arrayList.get(i10)).U;
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
            ArrayList arrayList = this.f26520n;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
                int i11 = c1Var.f47901f;
                View view = c1Var.f47898a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.q1) view).s3(jjVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.s0) view).setMessageObject(jjVar);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            ft0 ft0Var = new ft0(this.f26518c, this.d, false, null, this.e);
            ft0Var.setDelegate(this.f26519f);
            return new s4.c1(ft0Var);
        }
        return new s4.c1(new org.telegram.ui.Cells.s0(this.f26518c, this.e, false));
    }
}
