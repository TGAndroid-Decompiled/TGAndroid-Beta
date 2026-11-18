package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class rs0 extends bk0 {
    public final Context f39292c;
    public final org.telegram.messenger.pv d;
    public boolean h;
    public as0 f39297s;
    public final gt0 f39300y;
    public final ArrayList f39293e = new ArrayList();
    public final ArrayList f39294f = new ArrayList();
    public final ap0 f39295n = new ap0(this, 5);
    public final v4.w0 f39296r = new v4.w0();
    public final v4.z f39298w = new v4.z(new gi.c(this, 6));
    public final HashSet f39299x = new HashSet();

    public rs0(gt0 gt0Var, Context context) {
        this.f39300y = gt0Var;
        this.f39292c = context;
        org.telegram.messenger.pv I1 = gt0Var.f35642y1.getMessagesController().I1();
        this.d = I1;
        if (gt0Var.x0()) {
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
                arrayList = this.f39294f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.ov) arrayList.get(i11)).f26104a == dialogId) {
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
            Long valueOf = Long.valueOf(ovVar.f26104a);
            HashSet hashSet = this.f39299x;
            boolean contains = hashSet.contains(valueOf);
            gt0 gt0Var = this.f39300y;
            if (contains) {
                hashSet.remove(Long.valueOf(ovVar.f26104a));
                if (hashSet.size() <= 0 && gt0Var.F1) {
                    gt0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(ovVar.f26104a));
                if (hashSet.size() > 0 && !gt0Var.F1) {
                    gt0Var.q1(true);
                    org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35638x0;
                    if (r0Var != null) {
                        r0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.f35635w0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                }
            }
            gt0Var.o1(hashSet.size(), true);
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
                    if (ovVar2.f26104a == longValue) {
                        if (!ovVar2.f26105b) {
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
            org.telegram.ui.ActionBar.r0 r0Var3 = gt0Var.f35641y0;
            if (r0Var3 != null) {
                if (z10) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                r0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = gt0Var.f35643z0;
            if (r0Var4 != null) {
                if (!z10) {
                    i10 = 8;
                }
                r0Var4.setVisibility(i10);
            }
            u2Var.c0(hashSet.contains(Long.valueOf(ovVar.f26104a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f39293e;
        arrayList.clear();
        ArrayList arrayList2 = this.f39294f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26300j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f39294f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f39294f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.ov) arrayList.get(i7)).f26104a;
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
        View view = f1Var.f59123a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            return;
        }
        org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
        ArrayList arrayList = this.f39294f;
        org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList.get(i7);
        u2Var.d0(ovVar.f26104a, ovVar.d, ovVar.c(), false, false);
        boolean z10 = true;
        u2Var.f31985t0 = true;
        u2Var.c0(this.f39299x.contains(Long.valueOf(ovVar.f26104a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z10 = false;
        }
        u2Var.f31987t2 = z10;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        qs0 qs0Var = new qs0(this, this.f39292c);
        gt0 gt0Var = this.f39300y;
        qs0Var.setDialogCellDelegate(gt0Var);
        qs0Var.f31980s0 = true;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, qs0Var, gt0Var.I1);
        return new v4.f1(qs0Var);
    }
}
