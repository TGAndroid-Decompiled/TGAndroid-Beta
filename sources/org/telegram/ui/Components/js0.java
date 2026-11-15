package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class js0 extends tj0 {
    public final Context f36171c;
    public final org.telegram.messenger.tv d;
    public boolean h;
    public sr0 f36176s;
    public final ys0 f36179y;
    public final ArrayList f36172e = new ArrayList();
    public final ArrayList f36173f = new ArrayList();
    public final ro0 f36174n = new ro0(this, 5);
    public final v4.v0 f36175r = new v4.v0();
    public final v4.y f36177w = new v4.y(new gi.c(this, 6));
    public final HashSet f36178x = new HashSet();

    public js0(ys0 ys0Var, Context context) {
        this.f36179y = ys0Var;
        this.f36171c = context;
        org.telegram.messenger.tv G1 = ys0Var.f42150y1.getMessagesController().G1();
        this.d = G1;
        if (ys0Var.x0()) {
            G1.g(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        org.telegram.messenger.sv svVar;
        boolean z10;
        int i7;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            long dialogId = t2Var.getDialogId();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                arrayList = this.f36173f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.sv) arrayList.get(i11)).f26569a == dialogId) {
                        svVar = (org.telegram.messenger.sv) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    svVar = null;
                    break;
                }
            }
            if (svVar == null) {
                return;
            }
            Long valueOf = Long.valueOf(svVar.f26569a);
            HashSet hashSet = this.f36178x;
            boolean contains = hashSet.contains(valueOf);
            ys0 ys0Var = this.f36179y;
            if (contains) {
                hashSet.remove(Long.valueOf(svVar.f26569a));
                if (hashSet.size() <= 0 && ys0Var.F1) {
                    ys0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(svVar.f26569a));
                if (hashSet.size() > 0 && !ys0Var.F1) {
                    ys0Var.q1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42146x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.f42143w0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                }
            }
            ys0Var.o1(hashSet.size(), true);
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
                    org.telegram.messenger.sv svVar2 = (org.telegram.messenger.sv) arrayList.get(i12);
                    if (svVar2.f26569a == longValue) {
                        if (!svVar2.f26570b) {
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
            org.telegram.ui.ActionBar.q0 q0Var3 = ys0Var.f42149y0;
            if (q0Var3 != null) {
                if (z10) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                q0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = ys0Var.f42151z0;
            if (q0Var4 != null) {
                if (!z10) {
                    i10 = 8;
                }
                q0Var4.setVisibility(i10);
            }
            t2Var.e0(hashSet.contains(Long.valueOf(svVar.f26569a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f36172e;
        arrayList.clear();
        ArrayList arrayList2 = this.f36173f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26740j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f36173f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f36173f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.sv) arrayList.get(i7)).f26569a;
            }
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        return 13;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        View view = e1Var.f58535a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
        ArrayList arrayList = this.f36173f;
        org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList.get(i7);
        t2Var.f0(svVar.f26569a, svVar.d, svVar.c(), false, false);
        boolean z10 = true;
        t2Var.f31635t0 = true;
        t2Var.e0(this.f36178x.contains(Long.valueOf(svVar.f26569a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z10 = false;
        }
        t2Var.f31637t2 = z10;
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        is0 is0Var = new is0(this, this.f36171c);
        ys0 ys0Var = this.f36179y;
        is0Var.setDialogCellDelegate(ys0Var);
        is0Var.f31630s0 = true;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, is0Var, ys0Var.I1);
        return new v4.e1(is0Var);
    }
}
