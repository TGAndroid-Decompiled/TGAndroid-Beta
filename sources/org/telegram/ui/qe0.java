package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qe0 implements RequestDelegate {
    public final int f39143a;
    public final te0 f39144b;

    public qe0(te0 te0Var, int i10) {
        this.f39143a = i10;
        this.f39144b = te0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39143a) {
            case 0:
                final te0 te0Var = this.f39144b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        te0 te0Var2 = te0Var;
                        switch (i11) {
                            case 0:
                                te0Var2.getClass();
                                if (tL_error2 == null) {
                                    te0Var2.f40090n = (TL_account.Password) tLObject2;
                                    te0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ah0 ah0Var = te0Var2.f40095y;
                                ah0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ah0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28163a |= 256;
                                            obj.f28164b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28165c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                                        a2Var.T = formatSpannable;
                                        a2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qw(20, te0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = ah0Var.showDialog(a2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                                    }
                                    ah0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                ah0 ah0Var2 = te0Var2.f40095y;
                                te0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) ah0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qe0(te0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ah0Var2.v1(false, true);
                                    te0Var2.postDelayed(new d20(29, te0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    ah0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ah0Var2.getParentActivity() != null) {
                                            te0Var2.f40086a.setText("");
                                            ah0.U0(ah0Var2, te0Var2.f40094x, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                                        } else {
                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                                        }
                                        ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final te0 te0Var2 = this.f39144b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        te0 te0Var22 = te0Var2;
                        switch (i11) {
                            case 0:
                                te0Var22.getClass();
                                if (tL_error2 == null) {
                                    te0Var22.f40090n = (TL_account.Password) tLObject2;
                                    te0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ah0 ah0Var = te0Var22.f40095y;
                                ah0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ah0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28163a |= 256;
                                            obj.f28164b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28165c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                                        a2Var.T = formatSpannable;
                                        a2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qw(20, te0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ah0Var.showDialog(a2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                                    }
                                    ah0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                ah0 ah0Var2 = te0Var22.f40095y;
                                te0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) ah0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qe0(te0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ah0Var2.v1(false, true);
                                    te0Var22.postDelayed(new d20(29, te0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ah0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ah0Var2.getParentActivity() != null) {
                                            te0Var22.f40086a.setText("");
                                            ah0.U0(ah0Var2, te0Var22.f40094x, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                                        } else {
                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                                        }
                                        ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final te0 te0Var3 = this.f39144b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        te0 te0Var22 = te0Var3;
                        switch (i11) {
                            case 0:
                                te0Var22.getClass();
                                if (tL_error2 == null) {
                                    te0Var22.f40090n = (TL_account.Password) tLObject2;
                                    te0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ah0 ah0Var = te0Var22.f40095y;
                                ah0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ah0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28163a |= 256;
                                            obj.f28164b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28165c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                                        a2Var.T = formatSpannable;
                                        a2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qw(20, te0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ah0Var.showDialog(a2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                                    }
                                    ah0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                ah0 ah0Var2 = te0Var22.f40095y;
                                te0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) ah0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qe0(te0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ah0Var2.v1(false, true);
                                    te0Var22.postDelayed(new d20(29, te0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ah0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ah0Var2.getParentActivity() != null) {
                                            te0Var22.f40086a.setText("");
                                            ah0.U0(ah0Var2, te0Var22.f40094x, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                                        } else {
                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                                        }
                                        ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
        }
    }
}
