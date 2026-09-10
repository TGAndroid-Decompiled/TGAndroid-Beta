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
    public final int f35261a;
    public final zf0 f35262b;
    public final TLRPC.TL_auth_signIn f35263c;

    public nf0(zf0 zf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f35261a = i10;
        this.f35262b = zf0Var;
        this.f35263c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35261a) {
            case 0:
                final zf0 zf0Var = this.f35262b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f35263c;
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
                                int i14 = zf0Var2.f39290f0;
                                xg0 xg0Var = zf0Var2.f39305s0;
                                zf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    zf0Var2.f39287d0 = false;
                                    xg0Var.v1(false, true);
                                    zf0Var2.w();
                                    zf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xg0Var.f38736p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", zf0Var2.d);
                                        bundle.putString("phoneHash", zf0Var2.f39285c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        zf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        zf0Var2.f39305s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        zf0Var2.f39305s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        zf0Var2.q(new h90(22, zf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    zf0Var2.f39288e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new nf0(zf0Var2, tL_auth_signIn2, 1), 10);
                                        zf0Var2.w();
                                        zf0Var2.v();
                                    } else {
                                        zf0Var2.f39287d0 = false;
                                        xg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = zf0Var2.f39291g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = zf0Var2.f39291g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = zf0Var2.f39291g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            zf0Var2.u();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(17));
                                        }
                                        zf0Var2.f39286c0 = true;
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
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    xg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                zf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                fs fsVar = zf0Var2.f39289f;
                                                hs[] hsVarArr = fsVar.f32906f;
                                                if (i15 < hsVarArr.length) {
                                                    hsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    fsVar.e = false;
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
                                zf0Var3.f39287d0 = false;
                                xg0 xg0Var2 = zf0Var3.f39305s0;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.d5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", zf0Var3.d);
                                    bundle2.putString("phoneHash", zf0Var3.f39285c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    zf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    zf0Var3.f39305s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    zf0Var3.f39305s0.u1(6, true, bundle2, false);
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
                final zf0 zf0Var2 = this.f35262b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f35263c;
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
                                int i14 = zf0Var22.f39290f0;
                                xg0 xg0Var = zf0Var22.f39305s0;
                                zf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    zf0Var22.f39287d0 = false;
                                    xg0Var.v1(false, true);
                                    zf0Var22.w();
                                    zf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xg0Var.f38736p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", zf0Var22.d);
                                        bundle.putString("phoneHash", zf0Var22.f39285c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        zf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        zf0Var22.f39305s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        zf0Var22.f39305s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        zf0Var22.q(new h90(22, zf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    zf0Var22.f39288e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new nf0(zf0Var22, tL_auth_signIn22, 1), 10);
                                        zf0Var22.w();
                                        zf0Var22.v();
                                    } else {
                                        zf0Var22.f39287d0 = false;
                                        xg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = zf0Var22.f39291g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = zf0Var22.f39291g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = zf0Var22.f39291g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            zf0Var22.u();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(zf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(17));
                                        }
                                        zf0Var22.f39286c0 = true;
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
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    xg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                zf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                fs fsVar = zf0Var22.f39289f;
                                                hs[] hsVarArr = fsVar.f32906f;
                                                if (i15 < hsVarArr.length) {
                                                    hsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    fsVar.e = false;
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
                                zf0Var3.f39287d0 = false;
                                xg0 xg0Var2 = zf0Var3.f39305s0;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.d5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", zf0Var3.d);
                                    bundle2.putString("phoneHash", zf0Var3.f39285c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    zf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    zf0Var3.f39305s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    zf0Var3.f39305s0.u1(6, true, bundle2, false);
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
