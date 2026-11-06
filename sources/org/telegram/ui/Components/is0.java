package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class is0 extends oj0 {
    public final Context f34769c;
    public final org.telegram.messenger.vv d;
    public boolean h;
    public rr0 f34774s;
    public final xs0 f34777y;
    public final ArrayList f34770e = new ArrayList();
    public final ArrayList f34771f = new ArrayList();
    public final ir0 f34772n = new ir0(this, 2);
    public final v4.u0 f34773r = new v4.u0();
    public final v4.y f34775w = new v4.y(new ei.d(this, 6));
    public final HashSet f34776x = new HashSet();

    public is0(xs0 xs0Var, Context context) {
        this.f34777y = xs0Var;
        this.f34769c = context;
        org.telegram.messenger.vv G1 = xs0Var.f40440x1.getMessagesController().G1();
        this.d = G1;
        if (xs0Var.x0()) {
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
                arrayList = this.f34771f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.uv) arrayList.get(i11)).f25894a == dialogId) {
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
            Long valueOf = Long.valueOf(uvVar.f25894a);
            HashSet hashSet = this.f34776x;
            boolean contains = hashSet.contains(valueOf);
            xs0 xs0Var = this.f34777y;
            if (contains) {
                hashSet.remove(Long.valueOf(uvVar.f25894a));
                if (hashSet.size() <= 0 && xs0Var.E1) {
                    xs0Var.o1(false);
                }
            } else {
                hashSet.add(Long.valueOf(uvVar.f25894a));
                if (hashSet.size() > 0 && !xs0Var.E1) {
                    xs0Var.o1(true);
                    org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40436w0;
                    if (r0Var != null) {
                        r0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = xs0Var.f40433v0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                }
            }
            xs0Var.m1(hashSet.size(), true);
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
                    if (uvVar2.f25894a == longValue) {
                        if (!uvVar2.f25895b) {
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
            org.telegram.ui.ActionBar.r0 r0Var3 = xs0Var.f40439x0;
            if (r0Var3 != null) {
                if (z9) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                r0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = xs0Var.f40442y0;
            if (r0Var4 != null) {
                if (!z9) {
                    i10 = 8;
                }
                r0Var4.setVisibility(i10);
            }
            t2Var.c0(hashSet.contains(Long.valueOf(uvVar.f25894a)), true);
        }
    }

    public final void F(boolean z9) {
        ArrayList arrayList = this.f34770e;
        arrayList.clear();
        ArrayList arrayList2 = this.f34771f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26212j);
        if (z9) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f34771f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f34771f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.uv) arrayList.get(i7)).f25894a;
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
        View view = d1Var.f56951a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
        ArrayList arrayList = this.f34771f;
        org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
        t2Var.d0(uvVar.f25894a, uvVar.d, uvVar.c(), false, false);
        boolean z9 = true;
        t2Var.f30474s0 = true;
        t2Var.c0(this.f34776x.contains(Long.valueOf(uvVar.f25894a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z9 = false;
        }
        t2Var.f30476s2 = z9;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        hs0 hs0Var = new hs0(this, this.f34769c);
        xs0 xs0Var = this.f34777y;
        hs0Var.setDialogCellDelegate(xs0Var);
        hs0Var.f30468r0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, hs0Var, xs0Var.H1);
        return new v4.d1(hs0Var);
    }
}
