package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class ld implements TextView.OnEditorActionListener {
    public final int f47305a;
    public final Object f47306b;
    public final Object f47307c;

    public ld(int i3, Object obj, Object obj2) {
        this.f47305a = i3;
        this.f47306b = obj;
        this.f47307c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        u4.d1 T;
        int b10;
        u4.d1 T2;
        int b11;
        switch (this.f47305a) {
            case 0:
                xd xdVar = (xd) this.f47306b;
                r41 r41Var = (r41) this.f47307c;
                if (i3 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    hd hdVar = new hd(xdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.f42083a0 = 1;
                    twoStepVerificationActivity.f42087c0 = hdVar;
                    xdVar.H0.setLoading(true);
                    twoStepVerificationActivity.x0(new id(xdVar, r41Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f47306b;
                ii.o1 o1Var = (ii.o1) this.f47307c;
                if ((i3 != 6 && keyEvent.getKeyCode() != 66) || !s1Var.isShowing()) {
                    return false;
                }
                o1Var.g(s1Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.ym ymVar = (org.telegram.ui.Components.ym) this.f47307c;
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) ((n4) this.f47306b).f47865e;
                u51 u51Var = anVar.f31939s;
                if (i3 == 5) {
                    View F = u51Var.F(ymVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = u51Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i10 = b10 - anVar.f31942u0;
                    int i11 = anVar.N;
                    int i12 = i11 - 1;
                    if (i10 == i12 && i11 < anVar.K) {
                        anVar.T();
                        return true;
                    } else if (i10 == i12) {
                        org.telegram.messenger.g0.v1(ymVar.getTextView());
                        return true;
                    } else {
                        u4.d1 K = u51Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f55540a;
                        if (!(view instanceof org.telegram.ui.Cells.z5)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.z5) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                cr0 cr0Var = (cr0) this.f47307c;
                fr0 fr0Var = ((dr0) this.f47306b).d;
                if (i3 == 5) {
                    u51 u51Var2 = fr0Var.f45331c;
                    View F2 = u51Var2.F(cr0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = u51Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i13 = b11 - fr0Var.f45346o0;
                    int i14 = fr0Var.E;
                    int i15 = i14 - 1;
                    if (i13 == i15 && i14 < fr0Var.f45344n) {
                        fr0Var.k0();
                        return true;
                    } else if (i13 == i15) {
                        org.telegram.messenger.g0.v1(cr0Var.getTextView());
                        return true;
                    } else {
                        u4.d1 K2 = fr0Var.f45331c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f55540a;
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
