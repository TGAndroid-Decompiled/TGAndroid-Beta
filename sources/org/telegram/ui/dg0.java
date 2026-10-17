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
    public final eg0 f36194a;

    public dg0(eg0 eg0Var) {
        this.f36194a = eg0Var;
    }

    public final void a(tf0 tf0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        eg0 eg0Var = this.f36194a;
        eg0Var.L = true;
        fg0 fg0Var = eg0Var.V;
        fg0Var.J = 0;
        fg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (AndroidUtilities.isSimAvailable()) {
            if (fg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (fg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i11 >= 28 && fg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i11 >= 26 && fg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            mj0 mj0Var = eg0Var.f36521a;
            if (mj0Var != null && "888".equals(mj0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (fg0Var.v) {
                fg0Var.f36924r.clear();
                if (!z11) {
                    fg0Var.f36924r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    fg0Var.f36924r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    fg0Var.f36924r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i11 >= 26) {
                    fg0Var.f36924r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!fg0Var.f36924r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !fg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !fg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            fg0Var.getParentActivity().requestPermissions((String[]) fg0Var.f36924r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.f20601a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z12 && z13) {
                        alertDialog$Builder.f20601a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f20601a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                    fg0Var.h = fg0Var.showDialog(alertDialog$Builder.f20601a);
                    eg0Var.L = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        cg0 cg0Var = new cg0(0, tf0Var, this);
        tf0Var.h.f(z10, z10);
        AndroidUtilities.runOnUIThread(cg0Var, 400L);
    }
}
