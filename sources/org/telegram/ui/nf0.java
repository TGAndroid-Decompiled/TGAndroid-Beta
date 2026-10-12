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
public final class nf0 implements RequestDelegate {
    public final int f40402a;
    public final zf0 f40403b;
    public final TLRPC.TL_auth_signIn f40404c;

    public nf0(zf0 zf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f40402a = i10;
        this.f40403b = zf0Var;
        this.f40404c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40402a) {
            case 0:
                final zf0 zf0Var = this.f40403b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f40404c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final zf0 zf0Var2 = zf0Var;
                                int i14 = zf0Var2.f44823f0;
                                xg0 xg0Var = zf0Var2.f44838s0;
                                zf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    zf0Var2.f44819d0 = false;
                                    xg0Var.v1(false, true);
                                    zf0Var2.w();
                                    zf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xg0Var.f43957p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", zf0Var2.d);
                                        bundle.putString("phoneHash", zf0Var2.f44817c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        zf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        zf0Var2.f44838s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        zf0Var2.f44838s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        zf0Var2.q(new q70(28, zf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    zf0Var2.f44821e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) xg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new nf0(zf0Var2, tL_auth_signIn2, 1), 10);
                                        zf0Var2.w();
                                        zf0Var2.v();
                                    } else {
                                        zf0Var2.f44819d0 = false;
                                        xg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = zf0Var2.f44824g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = zf0Var2.f44824g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = zf0Var2.f44824g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            zf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xh(24));
                                        }
                                        zf0Var2.f44818c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    zf0Var2.c(true);
                                                    xg0Var.u1(0, true, null, true);
                                                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                zf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                fs fsVar = zf0Var2.f44822f;
                                                hs[] hsVarArr = fsVar.f37834f;
                                                if (i15 < hsVarArr.length) {
                                                    hsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    fsVar.f37833e = false;
                                                    hsVarArr[0].requestFocus();
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
                                final zf0 zf0Var3 = zf0Var;
                                zf0Var3.f44819d0 = false;
                                xg0 xg0Var2 = zf0Var3.f44838s0;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", zf0Var3.d);
                                    bundle2.putString("phoneHash", zf0Var3.f44817c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    zf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    zf0Var3.f44838s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    zf0Var3.f44838s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final zf0 zf0Var2 = this.f40403b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f40404c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final zf0 zf0Var22 = zf0Var2;
                                int i14 = zf0Var22.f44823f0;
                                xg0 xg0Var = zf0Var22.f44838s0;
                                zf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    zf0Var22.f44819d0 = false;
                                    xg0Var.v1(false, true);
                                    zf0Var22.w();
                                    zf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xg0Var.f43957p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", zf0Var22.d);
                                        bundle.putString("phoneHash", zf0Var22.f44817c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        zf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        zf0Var22.f44838s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        zf0Var22.f44838s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        zf0Var22.q(new q70(28, zf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    zf0Var22.f44821e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) xg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new nf0(zf0Var22, tL_auth_signIn22, 1), 10);
                                        zf0Var22.w();
                                        zf0Var22.v();
                                    } else {
                                        zf0Var22.f44819d0 = false;
                                        xg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = zf0Var22.f44824g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = zf0Var22.f44824g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = zf0Var22.f44824g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            zf0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xh(24));
                                        }
                                        zf0Var22.f44818c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    zf0Var22.c(true);
                                                    xg0Var.u1(0, true, null, true);
                                                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                zf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                fs fsVar = zf0Var22.f44822f;
                                                hs[] hsVarArr = fsVar.f37834f;
                                                if (i15 < hsVarArr.length) {
                                                    hsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    fsVar.f37833e = false;
                                                    hsVarArr[0].requestFocus();
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
                                final zf0 zf0Var3 = zf0Var2;
                                zf0Var3.f44819d0 = false;
                                xg0 xg0Var2 = zf0Var3.f44838s0;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", zf0Var3.d);
                                    bundle2.putString("phoneHash", zf0Var3.f44817c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    zf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    zf0Var3.f44838s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    zf0Var3.f44838s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
