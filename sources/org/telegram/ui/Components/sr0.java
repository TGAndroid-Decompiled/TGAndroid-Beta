package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class sr0 extends v4.w {
    public cs0 d;
    public final it0 f39693e;

    public sr0(it0 it0Var) {
        this.f39693e = it0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59245a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        ft0 ft0Var;
        v4.i0 adapter = recyclerView.getAdapter();
        mq0 mq0Var = null;
        if (adapter instanceof ft0) {
            ft0Var = (ft0) adapter;
        } else {
            ft0Var = null;
        }
        if (k() && ft0Var != null && ft0Var.M(f1Var.b())) {
            ds0 ds0Var = this.f39693e.f36133n0[0];
            if (ds0Var != null) {
                mq0Var = ds0Var.h;
            }
            this.d = mq0Var;
            if (mq0Var != null) {
                mq0Var.setItemAnimator(ds0Var.d);
            }
            return v4.w.l(15, 0);
        }
        return v4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        it0 it0Var = this.f39693e;
        if (!it0Var.F1) {
            iq0 iq0Var = it0Var.f36100c0;
            if (iq0Var == null || !iq0Var.f49873f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        ft0 ft0Var;
        fi.h6 h6Var;
        ArrayList arrayList;
        v4.i0 adapter = recyclerView.getAdapter();
        if (adapter instanceof ft0) {
            ft0Var = (ft0) adapter;
        } else {
            ft0Var = null;
        }
        if (ft0Var == null || !ft0Var.M(f1Var.b()) || !ft0Var.M(f1Var2.b())) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        ArrayList arrayList2 = ft0Var.E;
        if (!ft0Var.h && (h6Var = ft0Var.f35199s) != null && b10 >= 0 && b10 < h6Var.f12051i.size() && b11 >= 0 && b11 < ft0Var.f35199s.f12051i.size()) {
            if (!(ft0Var.f35199s instanceof fi.a6) && ft0Var.f35197n <= 0) {
                arrayList = new ArrayList(ft0Var.f35199s.f12050g);
            } else {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < ft0Var.f35199s.f12051i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) ft0Var.f35199s.f12051i.get(i7)).e1()));
                }
            }
            if (!ft0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ft0Var.F = true;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) ft0Var.f35199s.f12051i.get(b10);
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) ft0Var.f35199s.f12051i.get(b11);
            arrayList.remove(Integer.valueOf(fjVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(fjVar.e1()));
            ft0Var.f35199s.C(arrayList, false);
            ft0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        fi.h6 h6Var;
        ArrayList arrayList;
        boolean z10;
        cs0 cs0Var = this.d;
        if (cs0Var != null && f1Var != null) {
            cs0Var.d1(false);
        }
        if (i7 == 0) {
            cs0 cs0Var2 = this.d;
            if (cs0Var2 != null && (cs0Var2.getAdapter() instanceof ft0)) {
                ft0 ft0Var = (ft0) this.d.getAdapter();
                ArrayList arrayList2 = ft0Var.E;
                if (!ft0Var.h && (h6Var = ft0Var.f35199s) != null && ft0Var.F) {
                    if (!(h6Var instanceof fi.a6) && ft0Var.f35197n <= 0) {
                        arrayList = h6Var.f12050g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < ft0Var.f35199s.f12051i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) ft0Var.f35199s.f12051i.get(i10)).e1()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i11) != arrayList.get(i11)) {
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (z10) {
                        ft0Var.f35199s.C(arrayList, true);
                    }
                    ft0Var.F = false;
                }
            }
            cs0 cs0Var3 = this.d;
            if (cs0Var3 != null) {
                cs0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        cs0 cs0Var4 = this.d;
        if (cs0Var4 != null) {
            cs0Var4.I0(false);
        }
        if (f1Var != null) {
            f1Var.f59245a.setPressed(true);
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }
}
