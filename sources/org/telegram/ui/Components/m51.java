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
import org.telegram.ui.hh1;
import org.telegram.ui.t91;
public final class m51 extends org.telegram.ui.ActionBar.k {
    public final int f30577a;
    public final Object f30578b;

    public m51(Object obj, int i10) {
        this.f30577a = i10;
        this.f30578b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f30577a) {
            case 0:
                if (i10 == -1) {
                    ((p51) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) this.f30578b).b(false, false);
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((hh1) this.f30578b).a(false, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.rt) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((org.telegram.ui.pu) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.cv) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.xy) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) this.f30578b;
                if (i10 == -1) {
                    if (nzVar.W(true)) {
                        nzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(nzVar.P - 1.0f) < 0.1f) {
                        nzVar.c0();
                        return;
                    } else if (Math.abs(nzVar.P - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < nzVar.f40929a.getChildCount(); i11++) {
                            View childAt = nzVar.f40929a.getChildAt(i11);
                            nzVar.f40929a.getClass();
                            if (RecyclerView.R(childAt) == nzVar.H && (childAt instanceof v00)) {
                                int i12 = -nzVar.f40936s;
                                nzVar.f40936s = i12;
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
                org.telegram.ui.p00 p00Var = (org.telegram.ui.p00) this.f30578b;
                if (i10 == -1) {
                    if (p00Var.h0(true)) {
                        p00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    p00Var.q0();
                    return;
                } else {
                    return;
                }
            case 11:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.z10) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.m60 m60Var = (org.telegram.ui.m60) this.f30578b;
                if (i10 == -1) {
                    if (m60Var.f0(true)) {
                        m60Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    m60Var.o0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.t60) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.v60) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.c70) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.e70) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.s70) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((LanguageSelectActivity) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.eb0 eb0Var = (org.telegram.ui.eb0) this.f30578b;
                if (i10 == -1) {
                    eb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(eb0Var.B);
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.ub0) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) this.f30578b;
                if (i10 == 1) {
                    fg0Var.p1();
                    return;
                } else if (i10 == -1 && fg0Var.onBackPressed(true)) {
                    fg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.hg0) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.hh0) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.ih0) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.si0 si0Var = (org.telegram.ui.si0) this.f30578b;
                if (i10 == -1) {
                    si0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", si0Var.f42403b);
                    si0Var.presentFragment(new t91(bundle));
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) this.f30578b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) this.f30578b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((PasscodeActivity) this.f30578b).finishFragment();
                    return;
                }
                return;
        }
    }
}
