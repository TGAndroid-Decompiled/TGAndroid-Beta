package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qd0 implements RequestDelegate {
    public final int f40438a;
    public final zd0 f40439b;
    public final Bundle f40440c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public qd0(zd0 zd0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f40438a = i10;
        this.f40439b = zd0Var;
        this.f40440c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40438a) {
            case 0:
                final zd0 zd0Var = this.f40439b;
                final Bundle bundle = this.f40440c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i10;
                        String str2;
                        int i11;
                        int i12 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        zd0 zd0Var2 = zd0Var;
                        switch (i12) {
                            case 0:
                                og0 og0Var = zd0Var2.T;
                                if (og0Var.getParentActivity() != null) {
                                    zd0Var2.S = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        og0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zd0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                            d2Var.O = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            se.b c3 = se.b.c();
                                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c3.b("+" + zd0Var2.I))));
                                            l.d.C(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i10, tL_error2, og0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            og0Var.u1(0, true, null, true);
                                            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                og0 og0Var2 = zd0Var2.T;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = zd0Var2.f43922y.getString("emailPattern");
                                        zd0Var2.f43921x = true;
                                    }
                                    og0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                        org.telegram.ui.Components.z4.f0(i11, tL_error2, og0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    og0Var2.u1(0, true, null, true);
                                    og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final zd0 zd0Var2 = this.f40439b;
                final Bundle bundle2 = this.f40440c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i10;
                        String str2;
                        int i11;
                        int i12 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        zd0 zd0Var22 = zd0Var2;
                        switch (i12) {
                            case 0:
                                og0 og0Var = zd0Var22.T;
                                if (og0Var.getParentActivity() != null) {
                                    zd0Var22.S = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        og0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zd0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                            d2Var.O = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            se.b c3 = se.b.c();
                                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c3.b("+" + zd0Var22.I))));
                                            l.d.C(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i10, tL_error2, og0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            og0Var.u1(0, true, null, true);
                                            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                og0 og0Var2 = zd0Var22.T;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = zd0Var22.f43922y.getString("emailPattern");
                                        zd0Var22.f43921x = true;
                                    }
                                    og0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                                        org.telegram.ui.Components.z4.f0(i11, tL_error2, og0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    og0Var2.u1(0, true, null, true);
                                    og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
