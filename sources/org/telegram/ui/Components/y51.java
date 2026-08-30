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
import org.telegram.ui.ga1;
import org.telegram.ui.th1;
public final class y51 extends org.telegram.ui.ActionBar.j {
    public final int f30884a;
    public final Object f30885b;

    public y51(Object obj, int i10) {
        this.f30884a = i10;
        this.f30885b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f30884a) {
            case 0:
                if (i10 == -1) {
                    ((b61) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.u0) this.f30885b).b(false, false);
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((th1) this.f30885b).a(false, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.yt) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((org.telegram.ui.xu) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.kv) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.hz) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) this.f30885b;
                if (i10 == -1) {
                    if (yzVar.W(true)) {
                        yzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    if (Math.abs(yzVar.Q - 1.0f) < 0.1f) {
                        yzVar.c0();
                        return;
                    } else if (Math.abs(yzVar.Q - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < yzVar.f40603a.getChildCount(); i11++) {
                            View childAt = yzVar.f40603a.getChildAt(i11);
                            yzVar.f40603a.getClass();
                            if (RecyclerView.R(childAt) == yzVar.I && (childAt instanceof z00)) {
                                int i12 = -yzVar.f40609s;
                                yzVar.f40609s = i12;
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
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) this.f30885b;
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
                    ((FiltersSetupActivity) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.l20) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.y60 y60Var = (org.telegram.ui.y60) this.f30885b;
                if (i10 == -1) {
                    if (y60Var.f0(true)) {
                        y60Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    y60Var.o0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.e70) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.g70) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.m70) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.o70) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.c80) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((LanguageSelectActivity) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.nb0 nb0Var = (org.telegram.ui.nb0) this.f30885b;
                if (i10 == -1) {
                    nb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(nb0Var.C);
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((org.telegram.ui.ec0) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ng0 ng0Var = (org.telegram.ui.ng0) this.f30885b;
                if (i10 == 1) {
                    ng0Var.p1();
                    return;
                } else if (i10 == -1 && ng0Var.onBackPressed(true)) {
                    ng0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 23:
                if (i10 == -1) {
                    ((org.telegram.ui.pg0) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((org.telegram.ui.ph0) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((org.telegram.ui.qh0) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.aj0 aj0Var = (org.telegram.ui.aj0) this.f30885b;
                if (i10 == -1) {
                    aj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", aj0Var.f32648b);
                    aj0Var.presentFragment(new ga1(bundle));
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) this.f30885b).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) this.f30885b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((PasscodeActivity) this.f30885b).finishFragment();
                    return;
                }
                return;
        }
    }
}
