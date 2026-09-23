package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class if0 implements RequestDelegate {
    public final int f34127a;
    public final uf0 f34128b;
    public final TLRPC.TL_auth_signIn f34129c;

    public if0(uf0 uf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f34127a = i10;
        this.f34128b = uf0Var;
        this.f34129c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34127a) {
            case 0:
                final uf0 uf0Var = this.f34128b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f34129c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final uf0 uf0Var2 = uf0Var;
                                int i14 = uf0Var2.f38078f0;
                                rg0 rg0Var = uf0Var2.f38093s0;
                                uf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    uf0Var2.f38075d0 = false;
                                    rg0Var.v1(false, true);
                                    uf0Var2.w();
                                    uf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            rg0Var.f36837p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", uf0Var2.d);
                                        bundle.putString("phoneHash", uf0Var2.f38073c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        uf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        uf0Var2.f38093s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        uf0Var2.f38093s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        uf0Var2.q(new ia0(19, uf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    uf0Var2.f38076e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new if0(uf0Var2, tL_auth_signIn2, 1), 10);
                                        uf0Var2.w();
                                        uf0Var2.v();
                                    } else {
                                        uf0Var2.f38075d0 = false;
                                        rg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = uf0Var2.f38079g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = uf0Var2.f38079g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = uf0Var2.f38079g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            uf0Var2.u();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(uf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(uf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(uf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(22));
                                        }
                                        uf0Var2.f38074c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    uf0Var2.c(true);
                                                    rg0Var.u1(0, true, null, true);
                                                    rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    rg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                uf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                zr zrVar = uf0Var2.f38077f;
                                                bs[] bsVarArr = zrVar.f40230f;
                                                if (i15 < bsVarArr.length) {
                                                    bsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    zrVar.e = false;
                                                    bsVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final uf0 uf0Var3 = uf0Var;
                                uf0Var3.f38075d0 = false;
                                rg0 rg0Var2 = uf0Var3.f38093s0;
                                rg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(rg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", uf0Var3.d);
                                    bundle2.putString("phoneHash", uf0Var3.f38073c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    uf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    uf0Var3.f38093s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    uf0Var3.f38093s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final uf0 uf0Var2 = this.f34128b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f34129c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final uf0 uf0Var22 = uf0Var2;
                                int i14 = uf0Var22.f38078f0;
                                rg0 rg0Var = uf0Var22.f38093s0;
                                uf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    uf0Var22.f38075d0 = false;
                                    rg0Var.v1(false, true);
                                    uf0Var22.w();
                                    uf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            rg0Var.f36837p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", uf0Var22.d);
                                        bundle.putString("phoneHash", uf0Var22.f38073c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        uf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        uf0Var22.f38093s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        uf0Var22.f38093s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        uf0Var22.q(new ia0(19, uf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    uf0Var22.f38076e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new if0(uf0Var22, tL_auth_signIn22, 1), 10);
                                        uf0Var22.w();
                                        uf0Var22.v();
                                    } else {
                                        uf0Var22.f38075d0 = false;
                                        rg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = uf0Var22.f38079g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = uf0Var22.f38079g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = uf0Var22.f38079g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            uf0Var22.u();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(uf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(uf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(uf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(22));
                                        }
                                        uf0Var22.f38074c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    uf0Var22.c(true);
                                                    rg0Var.u1(0, true, null, true);
                                                    rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    rg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                uf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                zr zrVar = uf0Var22.f38077f;
                                                bs[] bsVarArr = zrVar.f40230f;
                                                if (i15 < bsVarArr.length) {
                                                    bsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    zrVar.e = false;
                                                    bsVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final uf0 uf0Var3 = uf0Var2;
                                uf0Var3.f38075d0 = false;
                                rg0 rg0Var2 = uf0Var3.f38093s0;
                                rg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(rg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", uf0Var3.d);
                                    bundle2.putString("phoneHash", uf0Var3.f38073c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    uf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    uf0Var3.f38093s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    uf0Var3.f38093s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
