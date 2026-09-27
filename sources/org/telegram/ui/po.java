package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class po extends org.telegram.ui.ActionBar.j {
    public final int f36511a;
    public final Object f36512b;

    public po(Object obj, int i10) {
        this.f36511a = i10;
        this.f36512b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        switch (this.f36511a) {
            case 0:
                so soVar = (so) this.f36512b;
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
                gp gpVar = (gp) this.f36512b;
                if (i10 == -1) {
                    gpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.rr rrVar = gpVar.f34006r;
                    if (rrVar == null || rrVar.f28081c <= 0.0f) {
                        gpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((sp) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((zp) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 4:
                lq lqVar = (lq) this.f36512b;
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
                qr qrVar = (qr) this.f36512b;
                if (i10 == -1) {
                    if (qrVar.g0(true)) {
                        qrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    qrVar.u0();
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f36512b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    return;
                } else {
                    j8Var.t0(i10);
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) this.f36512b).dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.f36512b;
                if (i10 == -1) {
                    if (!wiVar.f30023y0.i()) {
                        wiVar.dismiss();
                        return;
                    }
                    return;
                }
                wiVar.f30023y0.t(i10);
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.e40) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.uf0) this.f36512b).f28874r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ch0) this.f36512b).dismiss();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.vq0) this.f36512b).onBackPressed();
                return;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.o61) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.f36512b).b(false, false);
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((di1) this.f36512b).a(false, false);
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((yt) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((xu) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((lv) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((lz) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 22:
                b00 b00Var = (b00) this.f36512b;
                if (i10 == -1) {
                    if (b00Var.W(true)) {
                        b00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(b00Var.T - 1.0f) < 0.1f) {
                        b00Var.c0();
                        return;
                    } else if (Math.abs(b00Var.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < b00Var.f32188a.getChildCount(); i11++) {
                            View childAt = b00Var.f32188a.getChildAt(i11);
                            b00Var.f32188a.getClass();
                            if (RecyclerView.S(childAt) == b00Var.L && (childAt instanceof org.telegram.ui.Components.b10)) {
                                int i12 = -b00Var.f32194s;
                                b00Var.f32194s = i12;
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
                e10 e10Var = (e10) this.f36512b;
                if (i10 == -1) {
                    if (e10Var.h0(true)) {
                        e10Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    e10Var.q0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((p20) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 26:
                c70 c70Var = (c70) this.f36512b;
                if (i10 == -1) {
                    if (c70Var.f0(true)) {
                        c70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    c70Var.o0();
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((j70) this.f36512b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((l70) this.f36512b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((r70) this.f36512b).finishFragment();
                    return;
                }
                return;
        }
    }
}
