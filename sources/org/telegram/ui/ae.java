package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ae implements TextView.OnEditorActionListener {
    public final int f32558a;
    public final Object f32559b;
    public final Object f32560c;

    public ae(int i10, Object obj, Object obj2) {
        this.f32558a = i10;
        this.f32559b = obj;
        this.f32560c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        f2.l1 T;
        int b10;
        f2.l1 T2;
        int b11;
        switch (this.f32558a) {
            case 0:
                me meVar = (me) this.f32559b;
                oa1 oa1Var = (oa1) this.f32560c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    vd vdVar = new vd(meVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.W = 1;
                    twoStepVerificationActivity.Y = vdVar;
                    meVar.N0.setLoading(true);
                    twoStepVerificationActivity.s0(new wd(meVar, oa1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f32559b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.f32560c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !d2Var.isShowing()) {
                    return false;
                }
                s1Var.l(d2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.mn mnVar = (org.telegram.ui.Components.mn) this.f32560c;
                org.telegram.ui.Components.pn pnVar = ((org.telegram.ui.Components.nn) this.f32559b).d;
                rb1 rb1Var = pnVar.f27960s;
                if (i10 == 5) {
                    View F = rb1Var.F(mnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = rb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - pnVar.f27957q0;
                    int i12 = pnVar.J;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < pnVar.G) {
                        pnVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(mnVar.getTextView());
                        return true;
                    } else {
                        f2.l1 K = rb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f5774a;
                        if (!(view instanceof org.telegram.ui.Cells.b6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.b6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                jv0 jv0Var = (jv0) this.f32560c;
                mv0 mv0Var = ((kv0) this.f32559b).d;
                if (i10 == 5) {
                    rb1 rb1Var2 = mv0Var.f36233c;
                    View F2 = rb1Var2.F(jv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = rb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - mv0Var.f36243k0;
                    int i15 = mv0Var.f36261y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < mv0Var.f36245n) {
                        mv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(jv0Var.getTextView());
                        return true;
                    } else {
                        f2.l1 K2 = mv0Var.f36233c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f5774a;
                        if (!(view2 instanceof org.telegram.ui.Cells.b6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.b6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
