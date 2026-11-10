package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class ne implements org.telegram.messenger.c20 {
    public final int f48195a;
    public final cn f48196b;

    public ne(cn cnVar, int i7) {
        this.f48195a = i7;
        this.f48196b = cnVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f48195a;
        cn cnVar = this.f48196b;
        switch (i7) {
            case 0:
                org.telegram.messenger.nj njVar = (org.telegram.messenger.nj) obj;
                cn cnVar2 = this.f48196b;
                cnVar2.f44708w5 = njVar;
                cnVar2.F5.f23266k.suggested_post = njVar.c();
                cnVar2.ec(true, null, cnVar2.F5, null, null, true, 0, null, false, 0L);
                return;
            case 1:
                cnVar.jc((org.telegram.messenger.nj) obj);
                return;
            case 2:
                cnVar.bc(true, false);
                if (((Boolean) obj).booleanValue()) {
                    cnVar.finishFragment();
                    return;
                }
                return;
            case 3:
                cnVar.Fa((String) obj, false);
                return;
            case 4:
                cnVar.S1 = (org.telegram.messenger.e3) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.V6 = cnVar.P9();
                    q1Var.W6 = cnVar.aa();
                    boolean Z9 = cnVar.Z9();
                    if (q1Var.X6 != Z9) {
                        q1Var.X6 = Z9;
                        cnVar.f44741z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            cnVar.C0.g(R);
                        }
                    }
                    q1Var.Y6 = cnVar.l9();
                    int m92 = cnVar.m9();
                    if (q1Var.Z6 != m92) {
                        q1Var.Z6 = m92;
                        q1Var.Z3();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    t0Var.f30322e0 = cnVar.P9();
                    t0Var.f30335i0 = cnVar.aa();
                    cnVar.Z9();
                    cnVar.l9();
                    int m93 = cnVar.m9();
                    if (t0Var.f30338j0 != m93) {
                        t0Var.f30338j0 = m93;
                        t0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.z1) {
                    ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(cnVar.m9() / 2.0f);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.a0) {
                    view.invalidate();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    cnVar.R1 = tL_premium_boostsStatus;
                    cnVar.getMessagesController().G0().b(cnVar.f44545j6, tL_premium_boostsStatus, new ne(cnVar, 4));
                    return;
                }
                return;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.m11 m11Var = cnVar.f44490f2;
                if (m11Var != null) {
                    m11Var.n(l10.longValue(), true);
                    return;
                }
                return;
            case 8:
                fr frVar = cnVar.f44474e0;
                frVar.f45825c.add(((org.telegram.ui.ActionBar.r0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = cn.f44408kd;
                cnVar.cb(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = cn.f44408kd;
                cnVar.cb(intValue2);
                return;
        }
    }
}
