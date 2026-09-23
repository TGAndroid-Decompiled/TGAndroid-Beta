package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class po extends org.telegram.ui.ActionBar.j {
    public final int f36152a;
    public final Object f36153b;

    public po(Object obj, int i10) {
        this.f36152a = i10;
        this.f36153b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f36152a) {
            case 0:
                so soVar = (so) this.f36153b;
                if (i10 == -1) {
                    if (soVar.e0(true)) {
                        soVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    soVar.j0();
                    return;
                } else {
                    return;
                }
            case 1:
                gp gpVar = (gp) this.f36153b;
                if (i10 == -1) {
                    gpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.qr qrVar = gpVar.f33624r;
                    if (qrVar == null || qrVar.f27437c <= 0.0f) {
                        gpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((sp) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((zp) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 4:
                lq lqVar = (lq) this.f36153b;
                if (i10 == -1) {
                    if (lqVar.m0(true)) {
                        lqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    lqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                qr qrVar2 = (qr) this.f36153b;
                if (i10 == -1) {
                    if (qrVar2.g0(true)) {
                        qrVar2.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    qrVar2.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f36153b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    return;
                } else {
                    j8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) this.f36153b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.f36153b;
                if (i10 == -1) {
                    if (!wiVar.f29726y0.i()) {
                        wiVar.dismiss();
                        return;
                    }
                    return;
                }
                wiVar.f29726y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.c40) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kf0) this.f36153b).f25595r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qg0) this.f36153b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.hq0) this.f36153b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.y51) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f36153b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((fi1) this.f36153b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((xt) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((wu) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((kv) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((jz) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 22:
                zz zzVar = (zz) this.f36153b;
                if (i10 == -1) {
                    if (zzVar.W(true)) {
                        zzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(zzVar.T - 1.0f) < 0.1f) {
                        zzVar.c0();
                        return;
                    } else if (Math.abs(zzVar.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < zzVar.f40280a.getChildCount(); i11++) {
                            View childAt = zzVar.f40280a.getChildAt(i11);
                            zzVar.f40280a.getClass();
                            if (RecyclerView.R(childAt) == zzVar.L && (childAt instanceof org.telegram.ui.Components.a10)) {
                                int i12 = -zzVar.f40286s;
                                zzVar.f40286s = i12;
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
                c10 c10Var = (c10) this.f36153b;
                if (i10 == -1) {
                    if (c10Var.h0(true)) {
                        c10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    c10Var.q0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((o20) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 26:
                b70 b70Var = (b70) this.f36153b;
                if (i10 == -1) {
                    if (b70Var.f0(true)) {
                        b70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    b70Var.o0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((i70) this.f36153b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((k70) this.f36153b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((q70) this.f36153b).finishFragment();
                    return;
                }
                return;
        }
    }
}
