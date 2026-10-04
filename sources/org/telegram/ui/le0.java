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
public final class le0 implements RequestDelegate {
    public final int f38253a;
    public final ne0 f38254b;

    public le0(ne0 ne0Var, int i10) {
        this.f38253a = i10;
        this.f38254b = ne0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38253a) {
            case 0:
                final ne0 ne0Var = this.f38254b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ne0 ne0Var2 = ne0Var;
                        switch (i11) {
                            case 0:
                                ne0Var2.getClass();
                                if (tL_error2 == null) {
                                    ne0Var2.f38955n = (TL_account.Password) tLObject2;
                                    ne0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ug0 ug0Var = ne0Var2.f38960y;
                                ug0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ug0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28502a |= 256;
                                            obj.f28503b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28504c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.n11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                                        b2Var.T = formatSpannable;
                                        b2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new pw(19, ne0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = ug0Var.showDialog(b2Var);
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
                                    ug0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                ug0 ug0Var2 = ne0Var2.f38960y;
                                ne0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) ug0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new le0(ne0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ug0Var2.v1(false, true);
                                    ne0Var2.postDelayed(new h90(15, ne0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    ug0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ug0Var2.getParentActivity() != null) {
                                            ne0Var2.f38950a.setText("");
                                            ug0.U0(ug0Var2, ne0Var2.f38959x, true);
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
                                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final ne0 ne0Var2 = this.f38254b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ne0 ne0Var22 = ne0Var2;
                        switch (i11) {
                            case 0:
                                ne0Var22.getClass();
                                if (tL_error2 == null) {
                                    ne0Var22.f38955n = (TL_account.Password) tLObject2;
                                    ne0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ug0 ug0Var = ne0Var22.f38960y;
                                ug0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ug0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28502a |= 256;
                                            obj.f28503b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28504c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.n11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                                        b2Var.T = formatSpannable;
                                        b2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new pw(19, ne0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ug0Var.showDialog(b2Var);
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
                                    ug0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                ug0 ug0Var2 = ne0Var22.f38960y;
                                ne0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) ug0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new le0(ne0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ug0Var2.v1(false, true);
                                    ne0Var22.postDelayed(new h90(15, ne0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ug0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ug0Var2.getParentActivity() != null) {
                                            ne0Var22.f38950a.setText("");
                                            ug0.U0(ug0Var2, ne0Var22.f38959x, true);
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
                                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final ne0 ne0Var3 = this.f38254b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ne0 ne0Var22 = ne0Var3;
                        switch (i11) {
                            case 0:
                                ne0Var22.getClass();
                                if (tL_error2 == null) {
                                    ne0Var22.f38955n = (TL_account.Password) tLObject2;
                                    ne0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ug0 ug0Var = ne0Var22.f38960y;
                                ug0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ug0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28502a |= 256;
                                            obj.f28503b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28504c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.n11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                                        b2Var.T = formatSpannable;
                                        b2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new pw(19, ne0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ug0Var.showDialog(b2Var);
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
                                    ug0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                ug0 ug0Var2 = ne0Var22.f38960y;
                                ne0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) ug0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new le0(ne0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ug0Var2.v1(false, true);
                                    ne0Var22.postDelayed(new h90(15, ne0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ug0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ug0Var2.getParentActivity() != null) {
                                            ne0Var22.f38950a.setText("");
                                            ug0.U0(ug0Var2, ne0Var22.f38959x, true);
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
                                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
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
