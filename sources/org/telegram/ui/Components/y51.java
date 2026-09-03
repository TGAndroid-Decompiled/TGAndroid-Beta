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
import org.telegram.ui.na1;
public final class y51 extends org.telegram.ui.ActionBar.j {
    public final int f33394a;
    public final Object f33395b;

    public y51(Object obj, int i10) {
        this.f33394a = i10;
        this.f33395b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f33394a) {
            case 0:
                if (i10 == -1) {
                    ((b61) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) this.f33395b).b(false, false);
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((bi1) this.f33395b).a(false, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.zt) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((org.telegram.ui.yu) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.lv) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.iz) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.zz zzVar = (org.telegram.ui.zz) this.f33395b;
                if (i10 == -1) {
                    if (zzVar.W(true)) {
                        zzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(zzVar.Q - 1.0f) < 0.1f) {
                        zzVar.c0();
                        return;
                    } else if (Math.abs(zzVar.Q - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < zzVar.f44048a.getChildCount(); i11++) {
                            View childAt = zzVar.f44048a.getChildAt(i11);
                            zzVar.f44048a.getClass();
                            if (RecyclerView.R(childAt) == zzVar.I && (childAt instanceof a10)) {
                                int i12 = -zzVar.f44055s;
                                zzVar.f44055s = i12;
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
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) this.f33395b;
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
            case 11:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.m20) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) this.f33395b;
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
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.f70) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.h70) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.n70) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.p70) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.d80) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((LanguageSelectActivity) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) this.f33395b;
                if (i10 == -1) {
                    ob0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(ob0Var.C);
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.fc0) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.og0 og0Var = (org.telegram.ui.og0) this.f33395b;
                if (i10 == 1) {
                    og0Var.p1();
                    return;
                } else if (i10 == -1 && og0Var.onBackPressed(true)) {
                    og0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.qg0) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.qh0) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.rh0) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.bj0 bj0Var = (org.telegram.ui.bj0) this.f33395b;
                if (i10 == -1) {
                    bj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", bj0Var.f35546b);
                    bj0Var.presentFragment(new na1(bundle));
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) this.f33395b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) this.f33395b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((PasscodeActivity) this.f33395b).finishFragment();
                    return;
                }
                return;
        }
    }
}
