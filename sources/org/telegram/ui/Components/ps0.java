package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class ps0 extends s4.w {
    public uu0 d;
    public final cw0 f29853e;

    public ps0(cw0 cw0Var) {
        this.f29853e = cw0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47702a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        zv0 zv0Var;
        s4.i0 adapter = recyclerView.getAdapter();
        bt0 bt0Var = null;
        if (adapter instanceof zv0) {
            zv0Var = (zv0) adapter;
        } else {
            zv0Var = null;
        }
        if (k() && zv0Var != null && zv0Var.M(d1Var.b())) {
            vu0 vu0Var = this.f29853e.f25450k0[0];
            if (vu0Var != null) {
                bt0Var = vu0Var.h;
            }
            this.d = bt0Var;
            if (bt0Var != null) {
                bt0Var.setItemAnimator(vu0Var.d);
            }
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        cw0 cw0Var = this.f29853e;
        if (!cw0Var.C1) {
            xs0 xs0Var = cw0Var.W;
            if (xs0Var == null || !xs0Var.f35858w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        zv0 zv0Var;
        ai.e9 e9Var;
        ArrayList arrayList;
        s4.i0 adapter = recyclerView.getAdapter();
        if (adapter instanceof zv0) {
            zv0Var = (zv0) adapter;
        } else {
            zv0Var = null;
        }
        if (zv0Var == null || !zv0Var.M(d1Var.b()) || !zv0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = zv0Var.f33695y;
        if (!zv0Var.h && (e9Var = zv0Var.f33692s) != null && b10 >= 0 && b10 < e9Var.f899i.size() && b11 >= 0 && b11 < zv0Var.f33692s.f899i.size()) {
            if (!(zv0Var.f33692s instanceof ai.v8) && zv0Var.f33690n <= 0) {
                arrayList = new ArrayList(zv0Var.f33692s.f898g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < zv0Var.f33692s.f899i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) zv0Var.f33692s.f899i.get(i10)).getId()));
                }
            }
            if (!zv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                zv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) zv0Var.f33692s.f899i.get(b10);
            MessageObject messageObject2 = (MessageObject) zv0Var.f33692s.f899i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            zv0Var.f33692s.C(arrayList, false);
            zv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        ai.e9 e9Var;
        ArrayList arrayList;
        boolean z10;
        uu0 uu0Var = this.d;
        if (uu0Var != null && d1Var != null) {
            uu0Var.d1(false);
        }
        if (i10 == 0) {
            uu0 uu0Var2 = this.d;
            if (uu0Var2 != null && (uu0Var2.getAdapter() instanceof zv0)) {
                zv0 zv0Var = (zv0) this.d.getAdapter();
                ArrayList arrayList2 = zv0Var.f33695y;
                if (!zv0Var.h && (e9Var = zv0Var.f33692s) != null && zv0Var.E) {
                    if (!(e9Var instanceof ai.v8) && zv0Var.f33690n <= 0) {
                        arrayList = e9Var.f898g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < zv0Var.f33692s.f899i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) zv0Var.f33692s.f899i.get(i11)).getId()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i12) != arrayList.get(i12)) {
                                z10 = true;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (z10) {
                        zv0Var.f33692s.C(arrayList, true);
                    }
                    zv0Var.E = false;
                }
            }
            uu0 uu0Var3 = this.d;
            if (uu0Var3 != null) {
                uu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        uu0 uu0Var4 = this.d;
        if (uu0Var4 != null) {
            uu0Var4.I0(false);
        }
        if (d1Var != null) {
            d1Var.f47702a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
