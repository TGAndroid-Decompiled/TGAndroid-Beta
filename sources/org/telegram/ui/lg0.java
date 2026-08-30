package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lg0 {
    public final mg0 f36081a;

    public lg0(mg0 mg0Var) {
        this.f36081a = mg0Var;
    }

    public final void a(bg0 bg0Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        mg0 mg0Var = this.f36081a;
        mg0Var.I = true;
        ng0 ng0Var = mg0Var.S;
        ng0Var.G = 0;
        ng0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            if (ng0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ng0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 >= 28 && ng0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (i11 >= 26 && ng0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            qj0 qj0Var = mg0Var.f36293a;
            if (qj0Var != null && "888".equals(qj0Var.getText())) {
                z4 = true;
                z10 = true;
                z11 = true;
                z12 = true;
            }
            if (ng0Var.v) {
                ng0Var.f36642r.clear();
                if (!z4) {
                    ng0Var.f36642r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z10) {
                    ng0Var.f36642r.add("android.permission.CALL_PHONE");
                }
                if (!z11) {
                    ng0Var.f36642r.add("android.permission.READ_CALL_LOG");
                }
                if (!z12 && i11 >= 26) {
                    ng0Var.f36642r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ng0Var.f36642r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !ng0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ng0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ng0Var.getParentActivity().requestPermissions((String[]) ng0Var.f36642r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z4 && (!z10 || !z11)) {
                        alertDialog$Builder.f19503a.Q = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z10 && z11) {
                        alertDialog$Builder.f19503a.Q = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f19503a.Q = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    ng0Var.h = ng0Var.showDialog(alertDialog$Builder.f19503a);
                    mg0Var.I = true;
                    return;
                }
            }
        }
        kg0 kg0Var = new kg0(0, bg0Var, this);
        bg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(kg0Var, 400L);
    }
}
