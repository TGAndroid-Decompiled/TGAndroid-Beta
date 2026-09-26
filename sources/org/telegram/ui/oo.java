package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class oo extends org.telegram.ui.ActionBar.j {
    public final int f36272a;
    public final Object f36273b;

    public oo(Object obj, int i10) {
        this.f36272a = i10;
        this.f36273b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f36272a) {
            case 0:
                ro roVar = (ro) this.f36273b;
                if (i10 == -1) {
                    if (roVar.e0(true)) {
                        roVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    roVar.j0();
                    return;
                } else {
                    return;
                }
            case 1:
                fp fpVar = (fp) this.f36273b;
                if (i10 == -1) {
                    fpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.rr rrVar = fpVar.f33729r;
                    if (rrVar == null || rrVar.f28047c <= 0.0f) {
                        fpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((rp) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((yp) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 4:
                kq kqVar = (kq) this.f36273b;
                if (i10 == -1) {
                    if (kqVar.m0(true)) {
                        kqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    kqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                pr prVar = (pr) this.f36273b;
                if (i10 == -1) {
                    if (prVar.g0(true)) {
                        prVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    prVar.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f36273b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    return;
                } else {
                    j8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) this.f36273b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.f36273b;
                if (i10 == -1) {
                    if (!wiVar.f30081y0.i()) {
                        wiVar.dismiss();
                        return;
                    }
                    return;
                }
                wiVar.f30081y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.d40) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.vf0) this.f36273b).f29077r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bh0) this.f36273b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.vq0) this.f36273b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.n61) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f36273b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((fi1) this.f36273b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((wt) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((vu) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((jv) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((iz) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 22:
                yz yzVar = (yz) this.f36273b;
                if (i10 == -1) {
                    if (yzVar.W(true)) {
                        yzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(yzVar.T - 1.0f) < 0.1f) {
                        yzVar.c0();
                        return;
                    } else if (Math.abs(yzVar.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < yzVar.f40283a.getChildCount(); i11++) {
                            View childAt = yzVar.f40283a.getChildAt(i11);
                            yzVar.f40283a.getClass();
                            if (RecyclerView.R(childAt) == yzVar.L && (childAt instanceof org.telegram.ui.Components.b10)) {
                                int i12 = -yzVar.f40289s;
                                yzVar.f40289s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 23:
                b10 b10Var = (b10) this.f36273b;
                if (i10 == -1) {
                    if (b10Var.h0(true)) {
                        b10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    b10Var.q0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((m20) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 26:
                z60 z60Var = (z60) this.f36273b;
                if (i10 == -1) {
                    if (z60Var.f0(true)) {
                        z60Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    z60Var.o0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((g70) this.f36273b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((i70) this.f36273b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((o70) this.f36273b).finishFragment();
                    return;
                }
                return;
        }
    }
}
