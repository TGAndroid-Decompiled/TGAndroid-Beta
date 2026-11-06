package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class ne implements org.telegram.messenger.c20 {
    public final int f48007a;
    public final an f48008b;

    public ne(an anVar, int i7) {
        this.f48007a = i7;
        this.f48008b = anVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f48007a;
        an anVar = this.f48008b;
        switch (i7) {
            case 0:
                org.telegram.messenger.nj njVar = (org.telegram.messenger.nj) obj;
                an anVar2 = this.f48008b;
                anVar2.f43980w5 = njVar;
                anVar2.F5.f23237k.suggested_post = njVar.c();
                anVar2.cc(true, null, anVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                anVar.gc((org.telegram.messenger.nj) obj);
                return;
            case 2:
                anVar.Yb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    anVar.finishFragment();
                    return;
                }
                return;
            case 3:
                anVar.Da((String) obj, false);
                return;
            case 4:
                anVar.S1 = (org.telegram.messenger.e3) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.V6 = anVar.O9();
                    q1Var.W6 = anVar.Z9();
                    boolean Y9 = anVar.Y9();
                    if (q1Var.X6 != Y9) {
                        q1Var.X6 = Y9;
                        anVar.f44013z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            anVar.C0.g(R);
                        }
                    }
                    q1Var.Y6 = anVar.k9();
                    int l92 = anVar.l9();
                    if (q1Var.Z6 != l92) {
                        q1Var.Z6 = l92;
                        q1Var.Y3();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    t0Var.f30302e0 = anVar.O9();
                    t0Var.f30315i0 = anVar.Z9();
                    anVar.Y9();
                    anVar.k9();
                    int l93 = anVar.l9();
                    if (t0Var.f30318j0 != l93) {
                        t0Var.f30318j0 = l93;
                        t0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.z1) {
                    ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(anVar.l9() / 2.0f);
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
                    anVar.R1 = tL_premium_boostsStatus;
                    anVar.getMessagesController().G0().b(anVar.f43818j6, tL_premium_boostsStatus, new ne(anVar, 4));
                    return;
                }
                return;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.g11 g11Var = anVar.f43764f2;
                if (g11Var != null) {
                    g11Var.n(l10.longValue(), true);
                    return;
                }
                return;
            case 8:
                cr crVar = anVar.f43748e0;
                crVar.f44858c.add(((org.telegram.ui.ActionBar.r0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = an.f43682id;
                anVar.ab(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = an.f43682id;
                anVar.ab(intValue2);
                return;
        }
    }
}
