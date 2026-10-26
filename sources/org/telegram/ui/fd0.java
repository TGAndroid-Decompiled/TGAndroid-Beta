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
    public final int f39343a;
    public final od0 f39344b;
    public final Bundle f39345c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public fd0(od0 od0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f39343a = i10;
        this.f39344b = od0Var;
        this.f39345c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39343a) {
            case 0:
                final od0 od0Var = this.f39344b;
                final Bundle bundle = this.f39345c;
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
                        od0 od0Var2 = od0Var;
                        switch (i12) {
                            case 0:
                                gg0 gg0Var = od0Var2.W;
                                if (gg0Var.getParentActivity() != null) {
                                    od0Var2.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        gg0Var.l1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(od0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                            e2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            kf.b c10 = kf.b.c();
                                            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + od0Var2.L))));
                                            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                            org.telegram.ui.Components.g5.e0(i10, tL_error2, gg0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            gg0Var.z1(0, true, null, true);
                                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                gg0 gg0Var2 = od0Var2.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = od0Var2.f42163y.getString("emailPattern");
                                        od0Var2.f42162x = true;
                                    }
                                    gg0Var2.l1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                                        org.telegram.ui.Components.g5.e0(i11, tL_error2, gg0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    gg0Var2.z1(0, true, null, true);
                                    gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final od0 od0Var2 = this.f39344b;
                final Bundle bundle2 = this.f39345c;
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
                        od0 od0Var22 = od0Var2;
                        switch (i12) {
                            case 0:
                                gg0 gg0Var = od0Var22.W;
                                if (gg0Var.getParentActivity() != null) {
                                    od0Var22.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        gg0Var.l1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(od0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                            e2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            kf.b c10 = kf.b.c();
                                            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + od0Var22.L))));
                                            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                            org.telegram.ui.Components.g5.e0(i10, tL_error2, gg0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            gg0Var.z1(0, true, null, true);
                                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                gg0 gg0Var2 = od0Var22.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = od0Var22.f42163y.getString("emailPattern");
                                        od0Var22.f42162x = true;
                                    }
                                    gg0Var2.l1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.r2) gg0Var2).currentAccount;
                                        org.telegram.ui.Components.g5.e0(i11, tL_error2, gg0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    gg0Var2.z1(0, true, null, true);
                                    gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
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
