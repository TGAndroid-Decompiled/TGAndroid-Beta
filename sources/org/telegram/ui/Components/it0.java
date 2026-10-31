package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class it0 extends sk0 {
    public final Context f27077c;
    public final org.telegram.messenger.gw d;
    public boolean h;
    public rs0 f27081s;
    public final zt0 f27084y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f27078f = new ArrayList();
    public final uo0 f27079n = new uo0(this, 7);
    public final s4.u0 f27080r = new s4.u0();
    public final s4.x f27082w = new s4.x(new org.telegram.ui.ja(this, 5));
    public final HashSet f27083x = new HashSet();

    public it0(zt0 zt0Var, Context context) {
        this.f27084y = zt0Var;
        this.f27077c = context;
        org.telegram.messenger.gw F1 = zt0Var.f33240x1.getMessagesController().F1();
        this.d = F1;
        if (zt0Var.v0()) {
            F1.g(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.fw fwVar;
        boolean z10;
        int i10;
        if (view instanceof org.telegram.ui.Cells.v2) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            long dialogId = v2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f27078f;
                if (i12 < arrayList.size()) {
                    if (((org.telegram.messenger.fw) arrayList.get(i12)).f15624a == dialogId) {
                        fwVar = (org.telegram.messenger.fw) arrayList.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    fwVar = null;
                    break;
                }
            }
            if (fwVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(fwVar.f15624a);
            HashSet hashSet = this.f27083x;
            boolean contains = hashSet.contains(valueOf);
            zt0 zt0Var = this.f27084y;
            if (contains) {
                hashSet.remove(Long.valueOf(fwVar.f15624a));
                if (hashSet.size() <= 0 && zt0Var.E1) {
                    zt0Var.l1(false);
                }
            } else {
                hashSet.add(Long.valueOf(fwVar.f15624a));
                if (hashSet.size() > 0 && !zt0Var.E1) {
                    zt0Var.l1(true);
                    org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33236w0;
                    if (t0Var != null) {
                        t0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.f33233v0;
                    if (t0Var2 != null) {
                        t0Var2.setVisibility(8);
                    }
                }
            }
            zt0Var.j1(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.fw fwVar2 = (org.telegram.messenger.fw) arrayList.get(i13);
                    if (fwVar2.f15624a == longValue) {
                        if (!fwVar2.f15625b) {
                            z10 = false;
                        }
                    } else {
                        i13++;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = zt0Var.f33239x0;
            if (t0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                t0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = zt0Var.f33242y0;
            if (t0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                t0Var4.setVisibility(i11);
            }
            v2Var.c0(hashSet.contains(Long.valueOf(fwVar.f15624a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f27078f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f15772j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f27078f.size();
    }

    @Override
    public final long c(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27078f;
            if (i10 < arrayList.size()) {
                return ((org.telegram.messenger.fw) arrayList.get(i10)).f15624a;
            }
        }
        return i10;
    }

    @Override
    public final int d(int i10) {
        return 13;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.f47898a;
        if (!(view instanceof org.telegram.ui.Cells.v2)) {
            return;
        }
        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
        ArrayList arrayList = this.f27078f;
        org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList.get(i10);
        v2Var.d0(fwVar.f15624a, fwVar.d, fwVar.c(), false, false);
        boolean z10 = true;
        v2Var.f23263s0 = true;
        v2Var.c0(this.f27083x.contains(Long.valueOf(fwVar.f15624a)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        v2Var.f23265s2 = z10;
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ht0 ht0Var = new ht0(this, this.f27077c);
        zt0 zt0Var = this.f27084y;
        ht0Var.setDialogCellDelegate(zt0Var);
        ht0Var.f23257r0 = true;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, ht0Var, zt0Var.H1);
        return new s4.c1(ht0Var);
    }
}
