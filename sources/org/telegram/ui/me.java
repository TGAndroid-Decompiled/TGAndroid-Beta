package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class me implements org.telegram.messenger.y10 {
    public final int f49832a;
    public final bn f49833b;

    public me(bn bnVar, int i7) {
        this.f49832a = i7;
        this.f49833b = bnVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f49832a;
        bn bnVar = this.f49833b;
        switch (i7) {
            case 0:
                org.telegram.messenger.lj ljVar = (org.telegram.messenger.lj) obj;
                bn bnVar2 = this.f49833b;
                bnVar2.f46221y5 = ljVar;
                bnVar2.H5.f24177k.suggested_post = ljVar.c();
                bnVar2.fc(true, null, bnVar2.H5, null, null, true, 0, null, false, 0L);
                return;
            case 1:
                bnVar.kc((org.telegram.messenger.lj) obj);
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
                if (view instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                    r1Var.W6 = bnVar.Q9();
                    r1Var.X6 = bnVar.ba();
                    boolean aa2 = bnVar.aa();
                    if (r1Var.Y6 != aa2) {
                        r1Var.Y6 = aa2;
                        bnVar.A0.getClass();
                        int R = RecyclerView.R(view);
                        r1Var.F6 = true;
                        r1Var.forceLayout();
                        if (R >= 0) {
                            bnVar.D0.g(R);
                        }
                    }
                    r1Var.Z6 = bnVar.m9();
                    int n92 = bnVar.n9();
                    if (r1Var.f31328a7 != n92) {
                        r1Var.f31328a7 = n92;
                        r1Var.b4();
                        r1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f32076f0 = bnVar.Q9();
                    v0Var.f32088j0 = bnVar.ba();
                    bnVar.aa();
                    bnVar.m9();
                    int n93 = bnVar.n9();
                    if (v0Var.f32091k0 != n93) {
                        v0Var.f32091k0 = n93;
                        v0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.a2) {
                    ((org.telegram.ui.Cells.a2) view).getTextView().setTranslationX(bnVar.n9() / 2.0f);
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
                    bnVar.getMessagesController().I0().b(bnVar.f46056l6, tL_premium_boostsStatus, new me(bnVar, 4));
                    return;
                }
                return;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.a21 a21Var = bnVar.f45987g2;
                if (a21Var != null) {
                    a21Var.n(l10.longValue(), true);
                    return;
                }
                return;
            case 8:
                fr frVar = bnVar.f45973f0;
                frVar.f47795c.add(((org.telegram.ui.ActionBar.q0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = bn.f45893md;
                bnVar.db(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = bn.f45893md;
                bnVar.db(intValue2);
                return;
        }
    }
}
