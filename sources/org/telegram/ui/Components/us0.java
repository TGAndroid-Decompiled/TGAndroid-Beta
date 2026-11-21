package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class us0 extends dk0 {
    public final Context f40580c;
    public final org.telegram.messenger.pv d;
    public boolean h;
    public cs0 f40585s;
    public final jt0 f40588y;
    public final ArrayList f40581e = new ArrayList();
    public final ArrayList f40582f = new ArrayList();
    public final cp0 f40583n = new cp0(this, 5);
    public final v4.w0 f40584r = new v4.w0();
    public final v4.z f40586w = new v4.z(new gi.c(this, 6));
    public final HashSet f40587x = new HashSet();

    public us0(jt0 jt0Var, Context context) {
        this.f40588y = jt0Var;
        this.f40580c = context;
        org.telegram.messenger.pv I1 = jt0Var.f36689y1.getMessagesController().I1();
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
        org.telegram.messenger.ov ovVar;
        boolean z10;
        int i7;
        if (view instanceof org.telegram.ui.Cells.u2) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            long dialogId = u2Var.getDialogId();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                arrayList = this.f40582f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.ov) arrayList.get(i11)).f26132a == dialogId) {
                        ovVar = (org.telegram.messenger.ov) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    ovVar = null;
                    break;
                }
            }
            if (ovVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(ovVar.f26132a);
            HashSet hashSet = this.f40587x;
            boolean contains = hashSet.contains(valueOf);
            jt0 jt0Var = this.f40588y;
            if (contains) {
                hashSet.remove(Long.valueOf(ovVar.f26132a));
                if (hashSet.size() <= 0 && jt0Var.F1) {
                    jt0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(ovVar.f26132a));
                if (hashSet.size() > 0 && !jt0Var.F1) {
                    jt0Var.q1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36685x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = jt0Var.f36682w0;
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
                    org.telegram.messenger.ov ovVar2 = (org.telegram.messenger.ov) arrayList.get(i12);
                    if (ovVar2.f26132a == longValue) {
                        if (!ovVar2.f26133b) {
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
            org.telegram.ui.ActionBar.q0 q0Var3 = jt0Var.f36688y0;
            if (q0Var3 != null) {
                if (z10) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                q0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = jt0Var.f36690z0;
            if (q0Var4 != null) {
                if (!z10) {
                    i10 = 8;
                }
                q0Var4.setVisibility(i10);
            }
            u2Var.c0(hashSet.contains(Long.valueOf(ovVar.f26132a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f40581e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40582f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26328j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f40582f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f40582f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.ov) arrayList.get(i7)).f26132a;
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
        View view = f1Var.f59161a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            return;
        }
        org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
        ArrayList arrayList = this.f40582f;
        org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList.get(i7);
        u2Var.d0(ovVar.f26132a, ovVar.d, ovVar.c(), false, false);
        boolean z10 = true;
        u2Var.f32013t0 = true;
        u2Var.c0(this.f40587x.contains(Long.valueOf(ovVar.f26132a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z10 = false;
        }
        u2Var.f32015t2 = z10;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ts0 ts0Var = new ts0(this, this.f40580c);
        jt0 jt0Var = this.f40588y;
        ts0Var.setDialogCellDelegate(jt0Var);
        ts0Var.f32008s0 = true;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, ts0Var, jt0Var.I1);
        return new v4.f1(ts0Var);
    }
}
