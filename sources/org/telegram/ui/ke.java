package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class ke implements org.telegram.messenger.z10 {
    public final int f48642a;
    public final an f48643b;

    public ke(an anVar, int i7) {
        this.f48642a = i7;
        this.f48643b = anVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f48642a;
        an anVar = this.f48643b;
        switch (i7) {
            case 0:
                org.telegram.messenger.lj ljVar = (org.telegram.messenger.lj) obj;
                an anVar2 = this.f48643b;
                anVar2.f45421x5 = ljVar;
                anVar2.G5.f23819k.suggested_post = ljVar.c();
                anVar2.gc(true, null, anVar2.G5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                anVar.kc((org.telegram.messenger.lj) obj);
                return;
            case 2:
                anVar.cc(true, false);
                if (((Boolean) obj).booleanValue()) {
                    anVar.finishFragment();
                    return;
                }
                return;
            case 3:
                anVar.Ga((String) obj, false);
                return;
            case 4:
                anVar.T1 = (org.telegram.messenger.e3) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.W6 = anVar.Q9();
                    q1Var.X6 = anVar.ba();
                    boolean aa2 = anVar.aa();
                    if (q1Var.Y6 != aa2) {
                        q1Var.Y6 = aa2;
                        anVar.A0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.F6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            anVar.D0.g(R);
                        }
                    }
                    q1Var.Z6 = anVar.m9();
                    int n92 = anVar.n9();
                    if (q1Var.f30909a7 != n92) {
                        q1Var.f30909a7 = n92;
                        q1Var.a4();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    t0Var.f31461f0 = anVar.Q9();
                    t0Var.f31473j0 = anVar.ba();
                    anVar.aa();
                    anVar.m9();
                    int n93 = anVar.n9();
                    if (t0Var.f31476k0 != n93) {
                        t0Var.f31476k0 = n93;
                        t0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.z1) {
                    ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(anVar.n9() / 2.0f);
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
                    anVar.S1 = tL_premium_boostsStatus;
                    anVar.getMessagesController().G0().b(anVar.f45258k6, tL_premium_boostsStatus, new ke(anVar, 4));
                    return;
                }
                return;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.p11 p11Var = anVar.f45201g2;
                if (p11Var != null) {
                    p11Var.n(l10.longValue(), true);
                    return;
                }
                return;
            case 8:
                er erVar = anVar.f45187f0;
                erVar.f46885c.add(((org.telegram.ui.ActionBar.q0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = an.f45107ld;
                anVar.db(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = an.f45107ld;
                anVar.db(intValue2);
                return;
        }
    }
}
