package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class ks0 extends pj0 {
    public final Context f35470c;
    public final org.telegram.messenger.vv d;
    public boolean h;
    public tr0 f35475s;
    public final zs0 f35478y;
    public final ArrayList f35471e = new ArrayList();
    public final ArrayList f35472f = new ArrayList();
    public final kr0 f35473n = new kr0(this, 2);
    public final v4.u0 f35474r = new v4.u0();
    public final v4.y f35476w = new v4.y(new ei.d(this, 6));
    public final HashSet f35477x = new HashSet();

    public ks0(zs0 zs0Var, Context context) {
        this.f35478y = zs0Var;
        this.f35470c = context;
        org.telegram.messenger.vv G1 = zs0Var.f41127x1.getMessagesController().G1();
        this.d = G1;
        if (zs0Var.x0()) {
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
                arrayList = this.f35472f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.uv) arrayList.get(i11)).f25896a == dialogId) {
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
            Long valueOf = Long.valueOf(uvVar.f25896a);
            HashSet hashSet = this.f35477x;
            boolean contains = hashSet.contains(valueOf);
            zs0 zs0Var = this.f35478y;
            if (contains) {
                hashSet.remove(Long.valueOf(uvVar.f25896a));
                if (hashSet.size() <= 0 && zs0Var.E1) {
                    zs0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(uvVar.f25896a));
                if (hashSet.size() > 0 && !zs0Var.E1) {
                    zs0Var.q1(true);
                    org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41123w0;
                    if (r0Var != null) {
                        r0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = zs0Var.f41120v0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                }
            }
            zs0Var.o1(hashSet.size(), true);
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
                    if (uvVar2.f25896a == longValue) {
                        if (!uvVar2.f25897b) {
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
            org.telegram.ui.ActionBar.r0 r0Var3 = zs0Var.f41126x0;
            if (r0Var3 != null) {
                if (z9) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                r0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = zs0Var.f41129y0;
            if (r0Var4 != null) {
                if (!z9) {
                    i10 = 8;
                }
                r0Var4.setVisibility(i10);
            }
            t2Var.c0(hashSet.contains(Long.valueOf(uvVar.f25896a)), true);
        }
    }

    public final void F(boolean z9) {
        ArrayList arrayList = this.f35471e;
        arrayList.clear();
        ArrayList arrayList2 = this.f35472f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26218j);
        if (z9) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f35472f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f35472f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.uv) arrayList.get(i7)).f25896a;
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
        View view = d1Var.f57056a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
        ArrayList arrayList = this.f35472f;
        org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
        t2Var.d0(uvVar.f25896a, uvVar.d, uvVar.c(), false, false);
        boolean z9 = true;
        t2Var.f30482s0 = true;
        t2Var.c0(this.f35477x.contains(Long.valueOf(uvVar.f25896a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z9 = false;
        }
        t2Var.f30484s2 = z9;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        js0 js0Var = new js0(this, this.f35470c);
        zs0 zs0Var = this.f35478y;
        js0Var.setDialogCellDelegate(zs0Var);
        js0Var.f30476r0 = true;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, js0Var, zs0Var.H1);
        return new v4.d1(js0Var);
    }
}
