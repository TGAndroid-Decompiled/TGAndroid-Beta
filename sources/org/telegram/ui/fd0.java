package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fd0 implements RequestDelegate {
    public final int f38212a;
    public final pd0 f38213b;
    public final Bundle f38214c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public fd0(pd0 pd0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i9) {
        this.f38212a = i9;
        this.f38213b = pd0Var;
        this.f38214c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38212a) {
            case 0:
                final pd0 pd0Var = this.f38213b;
                final Bundle bundle = this.f38214c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i9;
                        String str2;
                        int i10;
                        int i11 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        pd0 pd0Var2 = pd0Var;
                        switch (i11) {
                            case 0:
                                fg0 fg0Var = pd0Var2.S;
                                if (fg0Var.getParentActivity() != null) {
                                    pd0Var2.R = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        fg0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                            c2Var.N = string;
                                            int i12 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            ne.b c10 = ne.b.c();
                                            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i12, LocaleController.addNbsp(c10.b("+" + pd0Var2.H))));
                                            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                            org.telegram.ui.Components.y4.f0(i9, tL_error2, fg0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            fg0Var.u1(0, true, null, true);
                                            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                fg0 fg0Var2 = pd0Var2.S;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pd0Var2.f41492y.getString("emailPattern");
                                        pd0Var2.f41491x = true;
                                    }
                                    fg0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                        org.telegram.ui.Components.y4.f0(i10, tL_error2, fg0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    fg0Var2.u1(0, true, null, true);
                                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final pd0 pd0Var2 = this.f38213b;
                final Bundle bundle2 = this.f38214c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i9;
                        String str2;
                        int i10;
                        int i11 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        pd0 pd0Var22 = pd0Var2;
                        switch (i11) {
                            case 0:
                                fg0 fg0Var = pd0Var22.S;
                                if (fg0Var.getParentActivity() != null) {
                                    pd0Var22.R = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        fg0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                            c2Var.N = string;
                                            int i12 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            ne.b c10 = ne.b.c();
                                            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i12, LocaleController.addNbsp(c10.b("+" + pd0Var22.H))));
                                            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                            org.telegram.ui.Components.y4.f0(i9, tL_error2, fg0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            fg0Var.u1(0, true, null, true);
                                            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                fg0 fg0Var2 = pd0Var22.S;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pd0Var22.f41492y.getString("emailPattern");
                                        pd0Var22.f41491x = true;
                                    }
                                    fg0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                        org.telegram.ui.Components.y4.f0(i10, tL_error2, fg0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    fg0Var2.u1(0, true, null, true);
                                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
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
