package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class js0 extends oj0 {
    public final Context f35061c;
    public final org.telegram.messenger.vv d;
    public boolean h;
    public sr0 f35066s;
    public final ys0 f35069y;
    public final ArrayList f35062e = new ArrayList();
    public final ArrayList f35063f = new ArrayList();
    public final jr0 f35064n = new jr0(this, 2);
    public final v4.u0 f35065r = new v4.u0();
    public final v4.y f35067w = new v4.y(new ei.d(this, 6));
    public final HashSet f35068x = new HashSet();

    public js0(ys0 ys0Var, Context context) {
        this.f35069y = ys0Var;
        this.f35061c = context;
        org.telegram.messenger.vv G1 = ys0Var.f40719x1.getMessagesController().G1();
        this.d = G1;
        if (ys0Var.x0()) {
            G1.g(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.uv uvVar;
        boolean z9;
        int i7;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            long dialogId = t2Var.getDialogId();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                arrayList = this.f35063f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.uv) arrayList.get(i11)).f25900a == dialogId) {
                        uvVar = (org.telegram.messenger.uv) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    uvVar = null;
                    break;
                }
            }
            if (uvVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(uvVar.f25900a);
            HashSet hashSet = this.f35068x;
            boolean contains = hashSet.contains(valueOf);
            ys0 ys0Var = this.f35069y;
            if (contains) {
                hashSet.remove(Long.valueOf(uvVar.f25900a));
                if (hashSet.size() <= 0 && ys0Var.E1) {
                    ys0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(uvVar.f25900a));
                if (hashSet.size() > 0 && !ys0Var.E1) {
                    ys0Var.q1(true);
                    org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40715w0;
                    if (r0Var != null) {
                        r0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = ys0Var.f40712v0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                }
            }
            ys0Var.o1(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    org.telegram.messenger.uv uvVar2 = (org.telegram.messenger.uv) arrayList.get(i12);
                    if (uvVar2.f25900a == longValue) {
                        if (!uvVar2.f25901b) {
                            z9 = false;
                        }
                    } else {
                        i12++;
                    }
                }
                if (!z9) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = ys0Var.f40718x0;
            if (r0Var3 != null) {
                if (z9) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                r0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = ys0Var.f40721y0;
            if (r0Var4 != null) {
                if (!z9) {
                    i10 = 8;
                }
                r0Var4.setVisibility(i10);
            }
            t2Var.c0(hashSet.contains(Long.valueOf(uvVar.f25900a)), true);
        }
    }

    public final void F(boolean z9) {
        ArrayList arrayList = this.f35062e;
        arrayList.clear();
        ArrayList arrayList2 = this.f35063f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26222j);
        if (z9) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f35063f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f35063f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.uv) arrayList.get(i7)).f25900a;
            }
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        return 13;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.f57052a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
        ArrayList arrayList = this.f35063f;
        org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
        t2Var.d0(uvVar.f25900a, uvVar.d, uvVar.c(), false, false);
        boolean z9 = true;
        t2Var.f30493s0 = true;
        t2Var.c0(this.f35068x.contains(Long.valueOf(uvVar.f25900a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z9 = false;
        }
        t2Var.f30495s2 = z9;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        is0 is0Var = new is0(this, this.f35061c);
        ys0 ys0Var = this.f35069y;
        is0Var.setDialogCellDelegate(ys0Var);
        is0Var.f30487r0 = true;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, is0Var, ys0Var.H1);
        return new v4.d1(is0Var);
    }
}
