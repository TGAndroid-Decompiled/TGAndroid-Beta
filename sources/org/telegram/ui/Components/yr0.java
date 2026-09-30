package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class yr0 extends s4.v {
    public eu0 d;
    public final mv0 e;

    public yr0(mv0 mv0Var) {
        this.e = mv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f43068a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        jv0 jv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        ls0 ls0Var = null;
        if (adapter instanceof jv0) {
            jv0Var = (jv0) adapter;
        } else {
            jv0Var = null;
        }
        if (k() && jv0Var != null && jv0Var.L(c1Var.b())) {
            fu0 fu0Var = this.e.f26425k0[0];
            if (fu0Var != null) {
                ls0Var = fu0Var.h;
            }
            this.d = ls0Var;
            if (ls0Var != null) {
                ls0Var.setItemAnimator(fu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        mv0 mv0Var = this.e;
        if (!mv0Var.C1) {
            hs0 hs0Var = mv0Var.W;
            if (hs0Var == null || !hs0Var.f37665w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        jv0 jv0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof jv0) {
            jv0Var = (jv0) adapter;
        } else {
            jv0Var = null;
        }
        if (jv0Var == null || !jv0Var.L(c1Var.b()) || !jv0Var.L(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = jv0Var.f25556y;
        if (!jv0Var.h && (d9Var = jv0Var.f25553s) != null && b10 >= 0 && b10 < d9Var.f725i.size() && b11 >= 0 && b11 < jv0Var.f25553s.f725i.size()) {
            if (!(jv0Var.f25553s instanceof ai.u8) && jv0Var.f25551n <= 0) {
                arrayList = new ArrayList(jv0Var.f25553s.f724g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < jv0Var.f25553s.f725i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) jv0Var.f25553s.f725i.get(i10)).getId()));
                }
            }
            if (!jv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                jv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) jv0Var.f25553s.f725i.get(b10);
            MessageObject messageObject2 = (MessageObject) jv0Var.f25553s.f725i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            jv0Var.f25553s.C(arrayList, false);
            jv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        eu0 eu0Var = this.d;
        if (eu0Var != null && c1Var != null) {
            eu0Var.e1(false);
        }
        if (i10 == 0) {
            eu0 eu0Var2 = this.d;
            if (eu0Var2 != null && (eu0Var2.getAdapter() instanceof jv0)) {
                jv0 jv0Var = (jv0) this.d.getAdapter();
                ArrayList arrayList2 = jv0Var.f25556y;
                if (!jv0Var.h && (d9Var = jv0Var.f25553s) != null && jv0Var.E) {
                    if (!(d9Var instanceof ai.u8) && jv0Var.f25551n <= 0) {
                        arrayList = d9Var.f724g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < jv0Var.f25553s.f725i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) jv0Var.f25553s.f725i.get(i11)).getId()));
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
                        jv0Var.f25553s.C(arrayList, true);
                    }
                    jv0Var.E = false;
                }
            }
            eu0 eu0Var3 = this.d;
            if (eu0Var3 != null) {
                eu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        eu0 eu0Var4 = this.d;
        if (eu0Var4 != null) {
            eu0Var4.J0(false);
        }
        if (c1Var != null) {
            c1Var.f43068a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
