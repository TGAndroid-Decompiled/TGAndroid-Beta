package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class hs0 extends sj0 {
    public final Context f34491c;
    public final org.telegram.messenger.nv d;
    public boolean h;
    public qr0 f34496s;
    public final ws0 f34499y;
    public final ArrayList f34492e = new ArrayList();
    public final ArrayList f34493f = new ArrayList();
    public final sp0 f34494n = new sp0(this, 4);
    public final u4.v0 f34495r = new u4.v0();
    public final u4.y f34497w = new u4.y(new fi.c(this, 6));
    public final HashSet f34498x = new HashSet();

    public hs0(ws0 ws0Var, Context context) {
        this.f34499y = ws0Var;
        this.f34491c = context;
        org.telegram.messenger.nv G1 = ws0Var.f40142y1.getMessagesController().G1();
        this.d = G1;
        if (ws0Var.x0()) {
            G1.g(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.mv mvVar;
        boolean z10;
        int i3;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            long dialogId = t2Var.getDialogId();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                arrayList = this.f34493f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.mv) arrayList.get(i11)).f24264a == dialogId) {
                        mvVar = (org.telegram.messenger.mv) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    mvVar = null;
                    break;
                }
            }
            if (mvVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(mvVar.f24264a);
            HashSet hashSet = this.f34498x;
            boolean contains = hashSet.contains(valueOf);
            ws0 ws0Var = this.f34499y;
            if (contains) {
                hashSet.remove(Long.valueOf(mvVar.f24264a));
                if (hashSet.size() <= 0 && ws0Var.F1) {
                    ws0Var.o1(false);
                }
            } else {
                hashSet.add(Long.valueOf(mvVar.f24264a));
                if (hashSet.size() > 0 && !ws0Var.F1) {
                    ws0Var.o1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40138x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.f40135w0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                }
            }
            ws0Var.m1(hashSet.size(), true);
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
                    org.telegram.messenger.mv mvVar2 = (org.telegram.messenger.mv) arrayList.get(i12);
                    if (mvVar2.f24264a == longValue) {
                        if (!mvVar2.f24265b) {
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
            org.telegram.ui.ActionBar.q0 q0Var3 = ws0Var.f40141y0;
            if (q0Var3 != null) {
                if (z10) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                q0Var3.setVisibility(i3);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = ws0Var.f40143z0;
            if (q0Var4 != null) {
                if (!z10) {
                    i10 = 8;
                }
                q0Var4.setVisibility(i10);
            }
            t2Var.c0(hashSet.contains(Long.valueOf(mvVar.f24264a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f34492e;
        arrayList.clear();
        ArrayList arrayList2 = this.f34493f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f24441j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f34493f.size();
    }

    @Override
    public final long c(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f34493f;
            if (i3 < arrayList.size()) {
                return ((org.telegram.messenger.mv) arrayList.get(i3)).f24264a;
            }
        }
        return i3;
    }

    @Override
    public final int d(int i3) {
        return 13;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.f55540a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
        ArrayList arrayList = this.f34493f;
        org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i3);
        t2Var.d0(mvVar.f24264a, mvVar.d, mvVar.c(), false, false);
        boolean z10 = true;
        t2Var.f30559t0 = true;
        t2Var.c0(this.f34498x.contains(Long.valueOf(mvVar.f24264a)), false);
        if (i3 + 1 >= arrayList.size()) {
            z10 = false;
        }
        t2Var.f30561t2 = z10;
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        gs0 gs0Var = new gs0(this, this.f34491c);
        ws0 ws0Var = this.f34499y;
        gs0Var.setDialogCellDelegate(ws0Var);
        gs0Var.f30554s0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, gs0Var, ws0Var.I1);
        return new u4.d1(gs0Var);
    }
}
