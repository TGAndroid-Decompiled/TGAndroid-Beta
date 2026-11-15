package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class ld implements TextView.OnEditorActionListener {
    public final int f48972a;
    public final Object f48973b;
    public final Object f48974c;

    public ld(int i7, Object obj, Object obj2) {
        this.f48972a = i7;
        this.f48973b = obj;
        this.f48974c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        v4.e1 T;
        int b10;
        v4.e1 T2;
        int b11;
        switch (this.f48972a) {
            case 0:
                xd xdVar = (xd) this.f48973b;
                z41 z41Var = (z41) this.f48974c;
                if (i7 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    hd hdVar = new hd(xdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.f43426a0 = 1;
                    twoStepVerificationActivity.f43430c0 = hdVar;
                    xdVar.H0.setLoading(true);
                    twoStepVerificationActivity.x0(new id(xdVar, z41Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f48973b;
                ki.o1 o1Var = (ki.o1) this.f48974c;
                if ((i7 != 6 && keyEvent.getKeyCode() != 66) || !t1Var.isShowing()) {
                    return false;
                }
                o1Var.h(t1Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.hn hnVar = (org.telegram.ui.Components.hn) this.f48974c;
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) ((l4) this.f48973b).f48827e;
                b61 b61Var = jnVar.f36107s;
                if (i7 == 5) {
                    View F = b61Var.F(hnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = b61Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i10 = b10 - jnVar.f36110u0;
                    int i11 = jnVar.N;
                    int i12 = i11 - 1;
                    if (i10 == i12 && i11 < jnVar.K) {
                        jnVar.U();
                        return true;
                    } else if (i10 == i12) {
                        org.telegram.messenger.g0.v1(hnVar.getTextView());
                        return true;
                    } else {
                        v4.e1 K = b61Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f58535a;
                        if (!(view instanceof org.telegram.ui.Cells.z5)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.z5) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                kr0 kr0Var = (kr0) this.f48974c;
                nr0 nr0Var = ((lr0) this.f48973b).d;
                if (i7 == 5) {
                    b61 b61Var2 = nr0Var.f49618c;
                    View F2 = b61Var2.F(kr0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = b61Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i13 = b11 - nr0Var.f49633o0;
                    int i14 = nr0Var.E;
                    int i15 = i14 - 1;
                    if (i13 == i15 && i14 < nr0Var.f49631n) {
                        nr0Var.k0();
                        return true;
                    } else if (i13 == i15) {
                        org.telegram.messenger.g0.v1(kr0Var.getTextView());
                        return true;
                    } else {
                        v4.e1 K2 = nr0Var.f49618c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f58535a;
                        if (!(view2 instanceof org.telegram.ui.Cells.z5)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.z5) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
