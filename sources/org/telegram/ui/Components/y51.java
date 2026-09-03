package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.oa1;
public final class y51 extends org.telegram.ui.ActionBar.j {
    public final int f30906a;
    public final Object f30907b;

    public y51(Object obj, int i10) {
        this.f30906a = i10;
        this.f30907b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f30906a) {
            case 0:
                if (i10 == -1) {
                    ((b61) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.u0) this.f30907b).b(false, false);
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((bi1) this.f30907b).a(false, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.au) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((org.telegram.ui.zu) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.mv) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.jz) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) this.f30907b;
                if (i10 == -1) {
                    if (a00Var.W(true)) {
                        a00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(a00Var.Q - 1.0f) < 0.1f) {
                        a00Var.c0();
                        return;
                    } else if (Math.abs(a00Var.Q - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < a00Var.f32398a.getChildCount(); i11++) {
                            View childAt = a00Var.f32398a.getChildAt(i11);
                            a00Var.f32398a.getClass();
                            if (RecyclerView.R(childAt) == a00Var.I && (childAt instanceof a10)) {
                                int i12 = -a00Var.f32404s;
                                a00Var.f32404s = i12;
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
            case 10:
                org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) this.f30907b;
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
            case 11:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.n20) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.a70 a70Var = (org.telegram.ui.a70) this.f30907b;
                if (i10 == -1) {
                    if (a70Var.f0(true)) {
                        a70Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    a70Var.o0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.g70) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.i70) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.o70) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.q70) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.e80) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((LanguageSelectActivity) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.pb0 pb0Var = (org.telegram.ui.pb0) this.f30907b;
                if (i10 == -1) {
                    pb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(pb0Var.C);
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.gc0) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) this.f30907b;
                if (i10 == 1) {
                    pg0Var.p1();
                    return;
                } else if (i10 == -1 && pg0Var.onBackPressed(true)) {
                    pg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.rg0) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.rh0) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.sh0) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.cj0 cj0Var = (org.telegram.ui.cj0) this.f30907b;
                if (i10 == -1) {
                    cj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", cj0Var.f33169b);
                    cj0Var.presentFragment(new oa1(bundle));
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) this.f30907b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) this.f30907b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((PasscodeActivity) this.f30907b).finishFragment();
                    return;
                }
                return;
        }
    }
}
