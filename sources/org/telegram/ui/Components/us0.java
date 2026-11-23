package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class us0 extends dk0 {
    public final Context f40572c;
    public final org.telegram.messenger.qv d;
    public boolean h;
    public cs0 f40577s;
    public final jt0 f40580y;
    public final ArrayList f40573e = new ArrayList();
    public final ArrayList f40574f = new ArrayList();
    public final cp0 f40575n = new cp0(this, 5);
    public final v4.w0 f40576r = new v4.w0();
    public final v4.z f40578w = new v4.z(new gi.c(this, 6));
    public final HashSet f40579x = new HashSet();

    public us0(jt0 jt0Var, Context context) {
        this.f40580y = jt0Var;
        this.f40572c = context;
        org.telegram.messenger.qv I1 = jt0Var.f36683y1.getMessagesController().I1();
        this.d = I1;
        if (jt0Var.x0()) {
            I1.g(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.pv pvVar;
        boolean z10;
        int i7;
        if (view instanceof org.telegram.ui.Cells.u2) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            long dialogId = u2Var.getDialogId();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                arrayList = this.f40574f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.pv) arrayList.get(i11)).f26350a == dialogId) {
                        pvVar = (org.telegram.messenger.pv) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    pvVar = null;
                    break;
                }
            }
            if (pvVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(pvVar.f26350a);
            HashSet hashSet = this.f40579x;
            boolean contains = hashSet.contains(valueOf);
            jt0 jt0Var = this.f40580y;
            if (contains) {
                hashSet.remove(Long.valueOf(pvVar.f26350a));
                if (hashSet.size() <= 0 && jt0Var.F1) {
                    jt0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(pvVar.f26350a));
                if (hashSet.size() > 0 && !jt0Var.F1) {
                    jt0Var.q1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36679x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = jt0Var.f36676w0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                }
            }
            jt0Var.o1(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.pv pvVar2 = (org.telegram.messenger.pv) arrayList.get(i12);
                    if (pvVar2.f26350a == longValue) {
                        if (!pvVar2.f26351b) {
                            z10 = false;
                        }
                    } else {
                        i12++;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = jt0Var.f36682y0;
            if (q0Var3 != null) {
                if (z10) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                q0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = jt0Var.f36684z0;
            if (q0Var4 != null) {
                if (!z10) {
                    i10 = 8;
                }
                q0Var4.setVisibility(i10);
            }
            u2Var.c0(hashSet.contains(Long.valueOf(pvVar.f26350a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f40573e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40574f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26509j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f40574f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f40574f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.pv) arrayList.get(i7)).f26350a;
            }
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        return 13;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.f59165a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            return;
        }
        org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
        ArrayList arrayList = this.f40574f;
        org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) arrayList.get(i7);
        u2Var.d0(pvVar.f26350a, pvVar.d, pvVar.c(), false, false);
        boolean z10 = true;
        u2Var.f32016t0 = true;
        u2Var.c0(this.f40579x.contains(Long.valueOf(pvVar.f26350a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z10 = false;
        }
        u2Var.f32018t2 = z10;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ts0 ts0Var = new ts0(this, this.f40572c);
        jt0 jt0Var = this.f40580y;
        ts0Var.setDialogCellDelegate(jt0Var);
        ts0Var.f32011s0 = true;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, ts0Var, jt0Var.I1);
        return new v4.f1(ts0Var);
    }
}
