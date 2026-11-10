package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class hs0 extends oj0 {
    public final Context f34453c;
    public final int d;
    public final org.telegram.ui.ActionBar.h6 f34454e;
    public final fs0 f34455f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f34456n = new ArrayList();
    public sr0 f34457r;
    public final ys0 f34458s;

    public hs0(ys0 ys0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f34458s = ys0Var;
        this.f34453c = context;
        this.d = i7;
        this.f34454e = h6Var;
        this.f34455f = new fs0(this, i7, h6Var);
        E();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f34456n;
        arrayList.clear();
        ArrayList c10 = this.f34458s.f40713v1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(i10);
            if (ijVar.X != i7) {
                int i11 = ijVar.f23266k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.id.u(j3, false);
                tL_message.f26981id = 0;
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
                ijVar2.f23263j0 = true;
                arrayList.add(ijVar2);
                i7 = ijVar.X;
            }
            arrayList.add(ijVar);
        }
    }

    @Override
    public final int b() {
        return this.f34456n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f34456n;
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
            ArrayList arrayList = this.f34456n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                int i10 = d1Var.f57056f;
                View view = d1Var.f57052a;
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
            gs0 gs0Var = new gs0(this.f34453c, this.d, false, null, this.f34454e);
            gs0Var.setDelegate(this.f34455f);
            return new v4.d1(gs0Var);
        }
        return new v4.d1(new org.telegram.ui.Cells.t0(this.f34453c, this.f34454e, false));
    }
}
