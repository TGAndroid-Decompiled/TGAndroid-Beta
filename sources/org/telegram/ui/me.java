package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class me implements org.telegram.messenger.x10 {
    public final int f49840a;
    public final bn f49841b;

    public me(bn bnVar, int i7) {
        this.f49840a = i7;
        this.f49841b = bnVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f49840a;
        bn bnVar = this.f49841b;
        switch (i7) {
            case 0:
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                bn bnVar2 = this.f49841b;
                bnVar2.f46250y5 = kjVar;
                bnVar2.H5.f23968k.suggested_post = kjVar.c();
                bnVar2.gc(true, null, bnVar2.H5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                bnVar.kc((org.telegram.messenger.kj) obj);
                return;
            case 2:
                bnVar.cc(true, false);
                if (((Boolean) obj).booleanValue()) {
                    bnVar.finishFragment();
                    return;
                }
                return;
            case 3:
                bnVar.Ga((String) obj, false);
                return;
            case 4:
                bnVar.T1 = (org.telegram.messenger.g3) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.W6 = bnVar.Q9();
                    q1Var.X6 = bnVar.ba();
                    boolean aa2 = bnVar.aa();
                    if (q1Var.Y6 != aa2) {
                        q1Var.Y6 = aa2;
                        bnVar.A0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.F6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            bnVar.D0.g(R);
                        }
                    }
                    q1Var.Z6 = bnVar.m9();
                    int n92 = bnVar.n9();
                    if (q1Var.f31281a7 != n92) {
                        q1Var.f31281a7 = n92;
                        q1Var.b4();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.u0) {
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) view;
                    u0Var.f32020f0 = bnVar.Q9();
                    u0Var.f32032j0 = bnVar.ba();
                    bnVar.aa();
                    bnVar.m9();
                    int n93 = bnVar.n9();
                    if (u0Var.f32035k0 != n93) {
                        u0Var.f32035k0 = n93;
                        u0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.z1) {
                    ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(bnVar.n9() / 2.0f);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.a0) {
                    view.invalidate();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.g0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    bnVar.S1 = tL_premium_boostsStatus;
                    bnVar.getMessagesController().I0().b(bnVar.f46085l6, tL_premium_boostsStatus, new me(bnVar, 4));
                    return;
                }
                return;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.z11 z11Var = bnVar.f46016g2;
                if (z11Var != null) {
                    z11Var.n(l10.longValue(), true);
                    return;
                }
                return;
            case 8:
                fr frVar = bnVar.f46002f0;
                frVar.f47782c.add(((org.telegram.ui.ActionBar.r0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = bn.f45922md;
                bnVar.db(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = bn.f45922md;
                bnVar.db(intValue2);
                return;
        }
    }
}
