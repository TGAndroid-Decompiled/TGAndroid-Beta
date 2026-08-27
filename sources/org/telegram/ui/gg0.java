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

    public final hg0 f38410a;

    public gg0(hg0 hg0Var) {
        this.f38410a = hg0Var;
    }

    public final void a(wf0 wf0Var) {
        int i10;
        hg0 hg0Var = this.f38410a;
        hg0Var.H = true;
        ig0 ig0Var = hg0Var.R;
        ig0Var.F = 0;
        ig0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            boolean z10 = ig0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = ig0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i11 < 28 || ig0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i11 < 26 || ig0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            mj0 mj0Var = hg0Var.f38804a;
            if (mj0Var != null && "888".equals(mj0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (ig0Var.v) {
                ig0Var.f39099r.clear();
                if (!z10) {
                    ig0Var.f39099r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    ig0Var.f39099r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    ig0Var.f39099r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    ig0Var.f39099r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ig0Var.f39099r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !ig0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ig0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ig0Var.getParentActivity().requestPermissions((String[]) ig0Var.f39099r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z10 && (!z11 || !z12)) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z11 && z12) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                    ig0Var.h = ig0Var.showDialog(alertDialog$Builder.f22702a);
                    hg0Var.H = true;
                    return;
                }
            }
        }
        fg0 fg0Var = new fg0(0, wf0Var, this);
        wf0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(fg0Var, 400L);
    }
}
