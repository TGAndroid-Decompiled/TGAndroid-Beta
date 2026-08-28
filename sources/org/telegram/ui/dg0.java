package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dg0 {
    public final eg0 f37537a;

    public dg0(eg0 eg0Var) {
        this.f37537a = eg0Var;
    }

    public final void a(tf0 tf0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        eg0 eg0Var = this.f37537a;
        eg0Var.H = true;
        fg0 fg0Var = eg0Var.R;
        fg0Var.F = 0;
        fg0Var.n1(0, false);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && AndroidUtilities.isSimAvailable()) {
            if (fg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (fg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 >= 28 && fg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i10 >= 26 && fg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            kj0 kj0Var = eg0Var.f37932a;
            if (kj0Var != null && "888".equals(kj0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (fg0Var.v) {
                fg0Var.f38279r.clear();
                if (!z10) {
                    fg0Var.f38279r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    fg0Var.f38279r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    fg0Var.f38279r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i10 >= 26) {
                    fg0Var.f38279r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!fg0Var.f38279r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !fg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !fg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            fg0Var.getParentActivity().requestPermissions((String[]) fg0Var.f38279r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z10 && (!z11 || !z12)) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i9 = R.raw.calls_log;
                    } else if (z11 && z12) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i9 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i9 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i9, 46, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                    fg0Var.h = fg0Var.showDialog(alertDialog$Builder.f22702a);
                    eg0Var.H = true;
                    return;
                }
            }
        }
        cg0 cg0Var = new cg0(0, tf0Var, this);
        tf0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(cg0Var, 400L);
    }
}
