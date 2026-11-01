package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class jt0 extends tk0 {
    public final Context f27565c;
    public final org.telegram.messenger.hw d;
    public boolean h;
    public ss0 f27569s;
    public final au0 f27572y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f27566f = new ArrayList();
    public final vo0 f27567n = new vo0(this, 7);
    public final s4.u0 f27568r = new s4.u0();
    public final s4.x f27570w = new s4.x(new org.telegram.ui.ja(this, 5));
    public final HashSet f27571x = new HashSet();

    public jt0(au0 au0Var, Context context) {
        this.f27572y = au0Var;
        this.f27565c = context;
        org.telegram.messenger.hw F1 = au0Var.f24568x1.getMessagesController().F1();
        this.d = F1;
        if (au0Var.w0()) {
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
        org.telegram.messenger.gw gwVar;
        boolean z10;
        int i10;
        if (view instanceof org.telegram.ui.Cells.v2) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            long dialogId = v2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f27566f;
                if (i12 < arrayList.size()) {
                    if (((org.telegram.messenger.gw) arrayList.get(i12)).f15965a == dialogId) {
                        gwVar = (org.telegram.messenger.gw) arrayList.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    gwVar = null;
                    break;
                }
            }
            if (gwVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(gwVar.f15965a);
            HashSet hashSet = this.f27571x;
            boolean contains = hashSet.contains(valueOf);
            au0 au0Var = this.f27572y;
            if (contains) {
                hashSet.remove(Long.valueOf(gwVar.f15965a));
                if (hashSet.size() <= 0 && au0Var.E1) {
                    au0Var.m1(false);
                }
            } else {
                hashSet.add(Long.valueOf(gwVar.f15965a));
                if (hashSet.size() > 0 && !au0Var.E1) {
                    au0Var.m1(true);
                    org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24564w0;
                    if (t0Var != null) {
                        t0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = au0Var.f24561v0;
                    if (t0Var2 != null) {
                        t0Var2.setVisibility(8);
                    }
                }
            }
            au0Var.k1(hashSet.size(), true);
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
                    org.telegram.messenger.gw gwVar2 = (org.telegram.messenger.gw) arrayList.get(i13);
                    if (gwVar2.f15965a == longValue) {
                        if (!gwVar2.f15966b) {
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
            org.telegram.ui.ActionBar.t0 t0Var3 = au0Var.f24567x0;
            if (t0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                t0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = au0Var.f24570y0;
            if (t0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                t0Var4.setVisibility(i11);
            }
            v2Var.c0(hashSet.contains(Long.valueOf(gwVar.f15965a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f27566f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f16121j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f27566f.size();
    }

    @Override
    public final long c(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27566f;
            if (i10 < arrayList.size()) {
                return ((org.telegram.messenger.gw) arrayList.get(i10)).f15965a;
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
        View view = c1Var.f47909a;
        if (!(view instanceof org.telegram.ui.Cells.v2)) {
            return;
        }
        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
        ArrayList arrayList = this.f27566f;
        org.telegram.messenger.gw gwVar = (org.telegram.messenger.gw) arrayList.get(i10);
        v2Var.d0(gwVar.f15965a, gwVar.d, gwVar.c(), false, false);
        boolean z10 = true;
        v2Var.f23264s0 = true;
        v2Var.c0(this.f27571x.contains(Long.valueOf(gwVar.f15965a)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        v2Var.f23266s2 = z10;
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        it0 it0Var = new it0(this, this.f27565c);
        au0 au0Var = this.f27572y;
        it0Var.setDialogCellDelegate(au0Var);
        it0Var.f23258r0 = true;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, it0Var, au0Var.H1);
        return new s4.c1(it0Var);
    }
}
