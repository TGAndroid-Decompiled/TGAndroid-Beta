package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

public final class gv implements Runnable {

    public final int f38480a;

    public final gy f38481b;

    public gv(gy gyVar, int i10) {
        this.f38480a = i10;
        this.f38481b = gyVar;
    }

    @Override
    public final void run() {
        boolean zEquals;
        org.telegram.ui.ActionBar.f6 f6VarN0;
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Components.mc mcVarA0;
        gv gvVar;
        int i10;
        String string;
        we1 we1Var = null;
        switch (this.f38480a) {
            case 0:
                MessagesController.getInstance(this.f38481b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                gy gyVar = this.f38481b;
                gyVar.getClass();
                gyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                gy gyVar2 = this.f38481b;
                gyVar2.A4(false, true);
                if (gyVar2.f38498a0 != null) {
                    int i11 = 0;
                    while (true) {
                        fy[] fyVarArr = gyVar2.f38498a0;
                        if (i11 < fyVarArr.length) {
                            if (fyVarArr[i11].getVisibility() == 0) {
                                fy fyVar = gyVar2.f38498a0[i11];
                                if (!fyVar.d.C) {
                                    fyVar.q(false);
                                }
                            }
                            i11++;
                        }
                        break;
                    }
                }
                break;
            case 3:
                gy gyVar3 = this.f38481b;
                gyVar3.T.f31468r.requestFocus();
                AndroidUtilities.showKeyboard(gyVar3.T.f31468r);
                break;
            case 4:
                gy gyVar4 = this.f38481b;
                gyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", gyVar4.T2);
                gyVar4.presentFragment(new oh.o(bundle));
                break;
            case 5:
                gy gyVar5 = this.f38481b;
                gyVar5.f38498a0[0].f38225a.requestLayout();
                bx bxVar = gyVar5.B3;
                if (bxVar != null && (bxVar.getFragment() instanceof we1)) {
                    we1Var = (we1) gyVar5.B3.getFragment();
                }
                if (we1Var != null) {
                    we1Var.B0();
                }
                gyVar5.G3(false);
                gyVar5.S4();
                px pxVar = gyVar5.f38619y0;
                if (pxVar != null) {
                    pxVar.invalidate();
                }
                break;
            case 6:
                gy gyVar6 = this.f38481b;
                gyVar6.getClass();
                gyVar6.presentFragment(new x71(null));
                break;
            case 7:
                gy gyVar7 = this.f38481b;
                if (!gyVar7.U2.collapsed_in_dialogs) {
                    gyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(gyVar7.T2, true);
                    gyVar7.finishFragment();
                }
                break;
            case 8:
                gy gyVar8 = this.f38481b;
                if (gyVar8.U2.collapsed_in_dialogs) {
                    gyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(gyVar8.T2, false);
                    gyVar8.finishFragment();
                }
                break;
            case 9:
                gy gyVar9 = this.f38481b;
                gyVar9.getClass();
                gyVar9.presentFragment(new m());
                break;
            case 10:
                this.f38481b.G4();
                break;
            case 11:
                gy gyVar10 = this.f38481b;
                if (!gy.f38494t4) {
                    gy.f38494t4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string2 = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.g6.N0(string2) == null || org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                        string2 = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string3 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.g6.N0(string3) == null || !org.telegram.ui.ActionBar.g6.N0(string3).q()) {
                        string3 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                    if (string2.equals(string3)) {
                        if (f6Var.q() || string2.equals("Dark Blue") || string2.equals("Night")) {
                            str2 = string3;
                        }
                        zEquals = str.equals(f6Var.m());
                        if (zEquals) {
                            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
                        } else {
                            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str);
                        }
                        v0Var = gyVar10.f38530g0;
                        if (v0Var != null) {
                            int[] iArr = {(gyVar10.f38530g0.getIconView().getMeasuredWidth() / 2) + i, (gyVar10.f38530g0.getIconView().getMeasuredHeight() / 2) + i};
                            v0Var.getLocationInWindow(iArr);
                            int i12 = iArr[0];
                            int i13 = iArr[1];
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarN0, Boolean.FALSE, iArr, -1, Boolean.valueOf(zEquals), null, null, null, Boolean.TRUE);
                        }
                        mcVarA0 = org.telegram.ui.Components.mc.a0(gyVar10);
                        gvVar = new gv(gyVar10, 26);
                        i10 = org.telegram.ui.ActionBar.g6.f23244o;
                        if (i10 != 0) {
                            if (mcVarA0 != null) {
                                try {
                                    int i14 = R.raw.auto_night_off;
                                    if (i10 == 3) {
                                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                                    } else {
                                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                                    }
                                    mcVarA0.I(i14, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, gvVar).j();
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                            }
                            org.telegram.ui.ActionBar.g6.f23244o = 0;
                            org.telegram.ui.ActionBar.g6.q1();
                            org.telegram.ui.ActionBar.g6.A();
                        }
                    } else {
                        str2 = string3;
                    }
                    str = string2;
                    zEquals = str.equals(f6Var.m());
                    if (zEquals) {
                        f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
                    } else {
                        f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str);
                    }
                    v0Var = gyVar10.f38530g0;
                    if (v0Var != null) {
                        int[] iArr2 = {(gyVar10.f38530g0.getIconView().getMeasuredWidth() / 2) + i12, (gyVar10.f38530g0.getIconView().getMeasuredHeight() / 2) + i13};
                        v0Var.getLocationInWindow(iArr2);
                        int i15 = iArr2[0];
                        int i16 = iArr2[1];
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarN0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(zEquals), null, null, null, Boolean.TRUE);
                    }
                    mcVarA0 = org.telegram.ui.Components.mc.a0(gyVar10);
                    gvVar = new gv(gyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.g6.f23244o;
                    if (i10 != 0) {
                        if (mcVarA0 != null) {
                            int i17 = R.raw.auto_night_off;
                            if (i10 == 3) {
                                string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                            } else {
                                string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                            }
                            mcVarA0.I(i17, string, LocaleController.getString("Settings", R.string.Settings), 5000, false, gvVar).j();
                        }
                        org.telegram.ui.ActionBar.g6.f23244o = 0;
                        org.telegram.ui.ActionBar.g6.q1();
                        org.telegram.ui.ActionBar.g6.A();
                    }
                    break;
                }
                break;
            case 12:
                gy gyVar11 = this.f38481b;
                gyVar11.getClass();
                gyVar11.presentFragment(new o60(new Bundle()));
                break;
            case 13:
                gy.b0(this.f38481b);
                break;
            case 14:
                this.f38481b.m3();
                break;
            case 15:
                gy.q0(this.f38481b);
                break;
            case 16:
                this.f38481b.U4();
                break;
            case 17:
                gy gyVar12 = this.f38481b;
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.f23619a = true;
                gyVar12.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 18:
                this.f38481b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                gy gyVar13 = this.f38481b;
                ArrayList arrayList = gyVar13.E2;
                gyVar13.F2 = false;
                if (gyVar13.f38621y2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i18)).longValue(), 0L));
                    }
                    gyVar13.f38621y2.w(gyVar13, arrayList2, gyVar13.f38615x1.getFieldText(), false, gyVar13.F2, gyVar13.G2, gyVar13.H2, null);
                    break;
                }
                break;
            case 20:
                gy gyVar14 = this.f38481b;
                org.telegram.ui.Components.y4.M(gyVar14.getParentActivity(), -1L, new nx(gyVar14), gyVar14.getResourceProvider());
                break;
            case 21:
                gy.x0(this.f38481b);
                break;
            case 22:
                gy gyVar15 = this.f38481b;
                gyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    gyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                }
                break;
            case 23:
                this.f38481b.A4(false, true);
                break;
            case 24:
                gy gyVar16 = this.f38481b;
                gyVar16.getClass();
                gyVar16.presentFragment(new m());
                break;
            case 25:
                gy gyVar17 = this.f38481b;
                gyVar17.getClass();
                gyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                gy gyVar18 = this.f38481b;
                gyVar18.getClass();
                gyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                gy gyVar19 = this.f38481b;
                gyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(gyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.f38481b.getMessagesController().clearSendAsPeers();
                break;
            default:
                gy gyVar20 = this.f38481b;
                px pxVar2 = gyVar20.f38619y0;
                if (pxVar2 == null || !pxVar2.f29761u0) {
                    gyVar20.T.f31468r.getText().clear();
                    AndroidUtilities.hideKeyboard(gyVar20.T.f31468r);
                    gyVar20.T.f31468r.clearFocus();
                    gyVar20.U.b(false);
                } else {
                    pxVar2.Q(false);
                }
                break;
        }
    }
}
