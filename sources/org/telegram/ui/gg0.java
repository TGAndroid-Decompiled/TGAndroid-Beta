package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gg0 {
    public final hg0 f37598a;

    public gg0(hg0 hg0Var) {
        this.f37598a = hg0Var;
    }

    public final void a(wf0 wf0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        hg0 hg0Var = this.f37598a;
        hg0Var.N = true;
        ig0 ig0Var = hg0Var.f37846a0;
        ig0Var.J = 0;
        ig0Var.r1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (AndroidUtilities.isSimAvailable()) {
            if (ig0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ig0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i11 >= 28 && ig0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i11 >= 26 && ig0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            pj0 pj0Var = hg0Var.f37845a;
            if (pj0Var != null && "888".equals(pj0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (ig0Var.v) {
                ig0Var.f38213r.clear();
                if (!z11) {
                    ig0Var.f38213r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    ig0Var.f38213r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    ig0Var.f38213r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i11 >= 26) {
                    ig0Var.f38213r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ig0Var.f38213r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !ig0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ig0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ig0Var.getParentActivity().requestPermissions((String[]) ig0Var.f38213r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.f20678a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z12 && z13) {
                        alertDialog$Builder.f20678a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f20678a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    int i12 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                    alertDialog$Builder.n(i12, null);
                    ig0Var.h = ig0Var.showDialog(alertDialog$Builder.f20678a);
                    hg0Var.N = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        fg0 fg0Var = new fg0(0, wf0Var, this);
        wf0Var.h.f(z10, z10);
        AndroidUtilities.runOnUIThread(fg0Var, 400L);
    }
}
