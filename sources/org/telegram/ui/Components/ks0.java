package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class ks0 extends s4.v {
    public pu0 d;
    public final xv0 e;

    public ks0(xv0 xv0Var) {
        this.e = xv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f44838a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        uv0 uv0Var;
        s4.g0 adapter = recyclerView.getAdapter();
        ws0 ws0Var = null;
        if (adapter instanceof uv0) {
            uv0Var = (uv0) adapter;
        } else {
            uv0Var = null;
        }
        if (k() && uv0Var != null && uv0Var.M(b1Var.b())) {
            qu0 qu0Var = this.e.f31364k0[0];
            if (qu0Var != null) {
                ws0Var = qu0Var.h;
            }
            this.d = ws0Var;
            if (ws0Var != null) {
                ws0Var.setItemAnimator(qu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        xv0 xv0Var = this.e;
        if (!xv0Var.C1) {
            ss0 ss0Var = xv0Var.W;
            if (ss0Var == null || !ss0Var.f36588w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        uv0 uv0Var;
        bi.o8 o8Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof uv0) {
            uv0Var = (uv0) adapter;
        } else {
            uv0Var = null;
        }
        if (uv0Var == null || !uv0Var.M(b1Var.b()) || !uv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = uv0Var.f29787y;
        if (!uv0Var.h && (o8Var = uv0Var.f29784s) != null && b10 >= 0 && b10 < o8Var.f3429i.size() && b11 >= 0 && b11 < uv0Var.f29784s.f3429i.size()) {
            if (!(uv0Var.f29784s instanceof bi.f8) && uv0Var.f29782n <= 0) {
                arrayList = new ArrayList(uv0Var.f29784s.f3428g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < uv0Var.f29784s.f3429i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) uv0Var.f29784s.f3429i.get(i10)).getId()));
                }
            }
            if (!uv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                uv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) uv0Var.f29784s.f3429i.get(b10);
            MessageObject messageObject2 = (MessageObject) uv0Var.f29784s.f3429i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            uv0Var.f29784s.C(arrayList, false);
            uv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        bi.o8 o8Var;
        ArrayList arrayList;
        boolean z10;
        pu0 pu0Var = this.d;
        if (pu0Var != null && b1Var != null) {
            pu0Var.d1(false);
        }
        if (i10 == 0) {
            pu0 pu0Var2 = this.d;
            if (pu0Var2 != null && (pu0Var2.getAdapter() instanceof uv0)) {
                uv0 uv0Var = (uv0) this.d.getAdapter();
                ArrayList arrayList2 = uv0Var.f29787y;
                if (!uv0Var.h && (o8Var = uv0Var.f29784s) != null && uv0Var.E) {
                    if (!(o8Var instanceof bi.f8) && uv0Var.f29782n <= 0) {
                        arrayList = o8Var.f3428g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < uv0Var.f29784s.f3429i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) uv0Var.f29784s.f3429i.get(i11)).getId()));
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
                        uv0Var.f29784s.C(arrayList, true);
                    }
                    uv0Var.E = false;
                }
            }
            pu0 pu0Var3 = this.d;
            if (pu0Var3 != null) {
                pu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        pu0 pu0Var4 = this.d;
        if (pu0Var4 != null) {
            pu0Var4.I0(false);
        }
        if (b1Var != null) {
            b1Var.f44838a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
