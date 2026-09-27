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
public final class ke0 implements RequestDelegate {
    public final int f35015a;
    public final me0 f35016b;

    public ke0(me0 me0Var, int i10) {
        this.f35015a = i10;
        this.f35016b = me0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35015a) {
            case 0:
                final me0 me0Var = this.f35016b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        me0 me0Var2 = me0Var;
                        switch (i11) {
                            case 0:
                                me0Var2.getClass();
                                if (tL_error2 == null) {
                                    me0Var2.f35671n = (TL_account.Password) tLObject2;
                                    me0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                tg0 tg0Var = me0Var2.f35676y;
                                tg0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (tg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f23485a |= 256;
                                            obj.f23486b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f23487c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.e11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                        c2Var.T = formatSpannable;
                                        c2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new jy(18, me0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = tg0Var.showDialog(c2Var);
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
                                    tg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                tg0 tg0Var2 = me0Var2.f35676y;
                                me0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) tg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ke0(me0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    tg0Var2.v1(false, true);
                                    me0Var2.postDelayed(new ea0(13, me0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    tg0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (tg0Var2.getParentActivity() != null) {
                                            me0Var2.f35667a.setText("");
                                            tg0.U0(tg0Var2, me0Var2.f35675x, true);
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
                                        tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final me0 me0Var2 = this.f35016b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        me0 me0Var22 = me0Var2;
                        switch (i11) {
                            case 0:
                                me0Var22.getClass();
                                if (tL_error2 == null) {
                                    me0Var22.f35671n = (TL_account.Password) tLObject2;
                                    me0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                tg0 tg0Var = me0Var22.f35676y;
                                tg0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (tg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f23485a |= 256;
                                            obj.f23486b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f23487c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.e11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                        c2Var.T = formatSpannable;
                                        c2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new jy(18, me0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = tg0Var.showDialog(c2Var);
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
                                    tg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                tg0 tg0Var2 = me0Var22.f35676y;
                                me0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) tg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ke0(me0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    tg0Var2.v1(false, true);
                                    me0Var22.postDelayed(new ea0(13, me0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    tg0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (tg0Var2.getParentActivity() != null) {
                                            me0Var22.f35667a.setText("");
                                            tg0.U0(tg0Var2, me0Var22.f35675x, true);
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
                                        tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final me0 me0Var3 = this.f35016b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        me0 me0Var22 = me0Var3;
                        switch (i11) {
                            case 0:
                                me0Var22.getClass();
                                if (tL_error2 == null) {
                                    me0Var22.f35671n = (TL_account.Password) tLObject2;
                                    me0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                tg0 tg0Var = me0Var22.f35676y;
                                tg0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (tg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f23485a |= 256;
                                            obj.f23486b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f23487c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.e11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                        c2Var.T = formatSpannable;
                                        c2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new jy(18, me0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = tg0Var.showDialog(c2Var);
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
                                    tg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                tg0 tg0Var2 = me0Var22.f35676y;
                                me0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) tg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ke0(me0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    tg0Var2.v1(false, true);
                                    me0Var22.postDelayed(new ea0(13, me0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    tg0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (tg0Var2.getParentActivity() != null) {
                                            me0Var22.f35667a.setText("");
                                            tg0.U0(tg0Var2, me0Var22.f35675x, true);
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
                                        tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
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
