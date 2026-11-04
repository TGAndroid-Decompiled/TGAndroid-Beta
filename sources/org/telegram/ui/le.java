package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;
public final class le implements org.telegram.messenger.u10 {
    public final int f47310a;
    public final wm f47311b;

    public le(wm wmVar, int i3) {
        this.f47310a = i3;
        this.f47311b = wmVar;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f47310a;
        wm wmVar = this.f47311b;
        switch (i3) {
            case 0:
                org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) obj;
                wm wmVar2 = this.f47311b;
                wmVar2.f51540x5 = ejVar;
                wmVar2.G5.f26868k.suggested_post = ejVar.c();
                wmVar2.bc(true, null, wmVar2.G5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                wmVar.gc((org.telegram.messenger.ej) obj);
                return;
            case 2:
                wmVar.Yb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    wmVar.finishFragment();
                    return;
                }
                return;
            case 3:
                wmVar.Da((String) obj, false);
                return;
            case 4:
                wmVar.T1 = (org.telegram.messenger.e3) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.V6 = wmVar.O9();
                    q1Var.W6 = wmVar.Z9();
                    boolean Y9 = wmVar.Y9();
                    if (q1Var.X6 != Y9) {
                        q1Var.X6 = Y9;
                        wmVar.A0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.E6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            wmVar.D0.g(R);
                        }
                    }
                    q1Var.Y6 = wmVar.k9();
                    int l92 = wmVar.l9();
                    if (q1Var.Z6 != l92) {
                        q1Var.Z6 = l92;
                        q1Var.X3();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                    t0Var.f30385f0 = wmVar.O9();
                    t0Var.f30397j0 = wmVar.Z9();
                    wmVar.Y9();
                    wmVar.k9();
                    int l93 = wmVar.l9();
                    if (t0Var.f30400k0 != l93) {
                        t0Var.f30400k0 = l93;
                        t0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.z1) {
                    ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(wmVar.l9() / 2.0f);
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
                    wmVar.S1 = tL_premium_boostsStatus;
                    wmVar.getMessagesController().G0().b(wmVar.f51376k6, tL_premium_boostsStatus, new le(wmVar, 4));
                    return;
                }
                return;
            case 7:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.g11 g11Var = wmVar.f51323g2;
                if (g11Var != null) {
                    g11Var.n(l10.longValue(), true);
                    return;
                }
                return;
            case 8:
                ar arVar = wmVar.f51307f0;
                arVar.f43829c.add(((org.telegram.ui.ActionBar.q0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i10 = wm.f51227jd;
                wmVar.ab(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = wm.f51227jd;
                wmVar.ab(intValue2);
                return;
        }
    }
}
