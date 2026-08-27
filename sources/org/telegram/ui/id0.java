package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class id0 implements RequestDelegate {

    public final int f39058a;

    public final sd0 f39059b;

    public final Bundle f39060c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public id0(sd0 sd0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f39058a = i10;
        this.f39059b = sd0Var;
        this.f39060c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39058a) {
            case 0:
                final int i10 = 0;
                final sd0 sd0Var = this.f39059b;
                final Bundle bundle = this.f39060c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        String str2;
                        int i11 = i10;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        sd0 sd0Var2 = sd0Var;
                        switch (i11) {
                            case 0:
                                ig0 ig0Var = sd0Var2.S;
                                if (ig0Var.getParentActivity() != null) {
                                    sd0Var2.R = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ig0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sd0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                            b2Var.N = string;
                                            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(oe.b.c().b("+" + sd0Var2.H))));
                                            i0.a.C(R.string.OK, alertDialog$Builder, null);
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            org.telegram.ui.Components.y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount, tL_error2, ig0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                        } else {
                                            ig0Var.u1(0, true, null, true);
                                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                ig0 ig0Var2 = sd0Var2.S;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = sd0Var2.f42590y.getString("emailPattern");
                                        sd0Var2.f42589x = true;
                                    }
                                    ig0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    break;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        org.telegram.ui.Components.y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount, tL_error2, ig0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                    } else {
                                        ig0Var2.u1(0, true, null, true);
                                        ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final sd0 sd0Var2 = this.f39059b;
                final Bundle bundle2 = this.f39060c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        String str2;
                        int i12 = i11;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail3 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle3 = bundle2;
                        TLObject tLObject2 = tLObject;
                        sd0 sd0Var3 = sd0Var2;
                        switch (i12) {
                            case 0:
                                ig0 ig0Var = sd0Var3.S;
                                if (ig0Var.getParentActivity() != null) {
                                    sd0Var3.R = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ig0Var.g1(bundle3, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sd0Var3.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                            b2Var.N = string;
                                            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(oe.b.c().b("+" + sd0Var3.H))));
                                            i0.a.C(R.string.OK, alertDialog$Builder, null);
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            org.telegram.ui.Components.y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount, tL_error2, ig0Var, tL_auth_resetLoginEmail3, new Object[0]);
                                        } else {
                                            ig0Var.u1(0, true, null, true);
                                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                ig0 ig0Var2 = sd0Var3.S;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = sd0Var3.f42590y.getString("emailPattern");
                                        sd0Var3.f42589x = true;
                                    }
                                    ig0Var2.g1(bundle3, tL_auth_sentCode, true);
                                    break;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        org.telegram.ui.Components.y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount, tL_error2, ig0Var2, tL_auth_resetLoginEmail3, new Object[0]);
                                    } else {
                                        ig0Var2.u1(0, true, null, true);
                                        ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
