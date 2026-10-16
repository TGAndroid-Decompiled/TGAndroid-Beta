package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ae0 implements RequestDelegate {
    public final int f33886a;
    public final je0 f33887b;
    public final Bundle f33888c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public ae0(je0 je0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f33886a = i10;
        this.f33887b = je0Var;
        this.f33888c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f33886a) {
            case 0:
                final je0 je0Var = this.f33887b;
                final Bundle bundle = this.f33888c;
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
                        je0 je0Var2 = je0Var;
                        switch (i12) {
                            case 0:
                                ah0 ah0Var = je0Var2.W;
                                if (ah0Var.getParentActivity() != null) {
                                    je0Var2.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ah0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(je0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                                            a2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            jf.b c10 = jf.b.c();
                                            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + je0Var2.L))));
                                            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                            org.telegram.ui.Components.g5.e0(i10, tL_error2, ah0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            ah0Var.u1(0, true, null, true);
                                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ah0 ah0Var2 = je0Var2.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = je0Var2.f37039y.getString("emailPattern");
                                        je0Var2.f37038x = true;
                                    }
                                    ah0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.m2) ah0Var2).currentAccount;
                                        org.telegram.ui.Components.g5.e0(i11, tL_error2, ah0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    ah0Var2.u1(0, true, null, true);
                                    ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final je0 je0Var2 = this.f33887b;
                final Bundle bundle2 = this.f33888c;
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
                        je0 je0Var22 = je0Var2;
                        switch (i12) {
                            case 0:
                                ah0 ah0Var = je0Var22.W;
                                if (ah0Var.getParentActivity() != null) {
                                    je0Var22.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ah0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(je0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                                            a2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            jf.b c10 = jf.b.c();
                                            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + je0Var22.L))));
                                            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                            org.telegram.ui.Components.g5.e0(i10, tL_error2, ah0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            ah0Var.u1(0, true, null, true);
                                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ah0 ah0Var2 = je0Var22.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = je0Var22.f37039y.getString("emailPattern");
                                        je0Var22.f37038x = true;
                                    }
                                    ah0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.m2) ah0Var2).currentAccount;
                                        org.telegram.ui.Components.g5.e0(i11, tL_error2, ah0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    ah0Var2.u1(0, true, null, true);
                                    ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
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
