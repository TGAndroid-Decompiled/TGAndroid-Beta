package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pd0 implements RequestDelegate {
    public final int f37281a;
    public final yd0 f37282b;
    public final Bundle f37283c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public pd0(yd0 yd0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f37281a = i10;
        this.f37282b = yd0Var;
        this.f37283c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37281a) {
            case 0:
                final yd0 yd0Var = this.f37282b;
                final Bundle bundle = this.f37283c;
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
                        yd0 yd0Var2 = yd0Var;
                        switch (i12) {
                            case 0:
                                ng0 ng0Var = yd0Var2.T;
                                if (ng0Var.getParentActivity() != null) {
                                    yd0Var2.S = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ng0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yd0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                                            d2Var.O = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            se.b c3 = se.b.c();
                                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c3.b("+" + yd0Var2.I))));
                                            kh.a2.C(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i10, tL_error2, ng0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            ng0Var.u1(0, true, null, true);
                                            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ng0 ng0Var2 = yd0Var2.T;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = yd0Var2.f40491y.getString("emailPattern");
                                        yd0Var2.f40490x = true;
                                    }
                                    ng0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) ng0Var2).currentAccount;
                                        org.telegram.ui.Components.z4.f0(i11, tL_error2, ng0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    ng0Var2.u1(0, true, null, true);
                                    ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final yd0 yd0Var2 = this.f37282b;
                final Bundle bundle2 = this.f37283c;
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
                        yd0 yd0Var22 = yd0Var2;
                        switch (i12) {
                            case 0:
                                ng0 ng0Var = yd0Var22.T;
                                if (ng0Var.getParentActivity() != null) {
                                    yd0Var22.S = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ng0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yd0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                                            d2Var.O = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            se.b c3 = se.b.c();
                                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c3.b("+" + yd0Var22.I))));
                                            kh.a2.C(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i10, tL_error2, ng0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            ng0Var.u1(0, true, null, true);
                                            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ng0 ng0Var2 = yd0Var22.T;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = yd0Var22.f40491y.getString("emailPattern");
                                        yd0Var22.f40490x = true;
                                    }
                                    ng0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) ng0Var2).currentAccount;
                                        org.telegram.ui.Components.z4.f0(i11, tL_error2, ng0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    ng0Var2.u1(0, true, null, true);
                                    ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
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
