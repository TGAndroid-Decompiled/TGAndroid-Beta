package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class ts0 extends dk0 {
    public final Context f40142c;
    public final org.telegram.messenger.pv d;
    public boolean h;
    public cs0 f40147s;
    public final it0 f40150y;
    public final ArrayList f40143e = new ArrayList();
    public final ArrayList f40144f = new ArrayList();
    public final bp0 f40145n = new bp0(this, 5);
    public final v4.w0 f40146r = new v4.w0();
    public final v4.z f40148w = new v4.z(new gi.c(this, 6));
    public final HashSet f40149x = new HashSet();

    public ts0(it0 it0Var, Context context) {
        this.f40150y = it0Var;
        this.f40142c = context;
        org.telegram.messenger.pv I1 = it0Var.f36166y1.getMessagesController().I1();
        this.d = I1;
        if (it0Var.x0()) {
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
                arrayList = this.f40144f;
                if (i11 < arrayList.size()) {
                    if (((org.telegram.messenger.ov) arrayList.get(i11)).f26201a == dialogId) {
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
            Long valueOf = Long.valueOf(ovVar.f26201a);
            HashSet hashSet = this.f40149x;
            boolean contains = hashSet.contains(valueOf);
            it0 it0Var = this.f40150y;
            if (contains) {
                hashSet.remove(Long.valueOf(ovVar.f26201a));
                if (hashSet.size() <= 0 && it0Var.F1) {
                    it0Var.q1(false);
                }
            } else {
                hashSet.add(Long.valueOf(ovVar.f26201a));
                if (hashSet.size() > 0 && !it0Var.F1) {
                    it0Var.q1(true);
                    org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36162x0;
                    if (q0Var != null) {
                        q0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = it0Var.f36159w0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                }
            }
            it0Var.o1(hashSet.size(), true);
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
                    if (ovVar2.f26201a == longValue) {
                        if (!ovVar2.f26202b) {
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
            org.telegram.ui.ActionBar.q0 q0Var3 = it0Var.f36165y0;
            if (q0Var3 != null) {
                if (z10) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                q0Var3.setVisibility(i7);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = it0Var.f36167z0;
            if (q0Var4 != null) {
                if (!z10) {
                    i10 = 8;
                }
                q0Var4.setVisibility(i10);
            }
            u2Var.e0(hashSet.contains(Long.valueOf(ovVar.f26201a)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f40143e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40144f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.f26394j);
        if (z10) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f40144f.size();
    }

    @Override
    public final long c(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f40144f;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.ov) arrayList.get(i7)).f26201a;
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
        View view = f1Var.f59245a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            return;
        }
        org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
        ArrayList arrayList = this.f40144f;
        org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList.get(i7);
        u2Var.f0(ovVar.f26201a, ovVar.d, ovVar.c(), false, false);
        boolean z10 = true;
        u2Var.f32066t0 = true;
        u2Var.e0(this.f40149x.contains(Long.valueOf(ovVar.f26201a)), false);
        if (i7 + 1 >= arrayList.size()) {
            z10 = false;
        }
        u2Var.f32068t2 = z10;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ss0 ss0Var = new ss0(this, this.f40142c);
        it0 it0Var = this.f40150y;
        ss0Var.setDialogCellDelegate(it0Var);
        ss0Var.f32061s0 = true;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, ss0Var, it0Var.I1);
        return new v4.f1(ss0Var);
    }
}
