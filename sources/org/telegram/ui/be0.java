package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class be0 implements RequestDelegate {
    public final int f36192a;
    public final me0 f36193b;
    public final TLRPC.TL_auth_signIn f36194c;

    public be0(me0 me0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f36192a = i10;
        this.f36193b = me0Var;
        this.f36194c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36192a) {
            case 0:
                final me0 me0Var = this.f36193b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f36194c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        int i14 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final me0 me0Var2 = me0Var;
                        switch (i14) {
                            case 0:
                                int i15 = me0Var2.f39667h0;
                                hf0 hf0Var = me0Var2.f39682u0;
                                me0Var2.y(false);
                                if (tL_error2 == null) {
                                    me0Var2.f39665f0 = false;
                                    hf0Var.D1(false, true);
                                    me0Var2.u();
                                    me0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            hf0Var.f37938q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", me0Var2.d);
                                        bundle.putString("phoneHash", me0Var2.f39660c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        me0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        me0Var2.f39682u0.C1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        me0Var2.f39682u0.C1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        me0Var2.p(new f70(25, me0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    me0Var2.f39666g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new be0(me0Var2, tL_auth_signIn2, 1), 10);
                                        me0Var2.u();
                                        me0Var2.t();
                                    } else {
                                        me0Var2.f39665f0 = false;
                                        hf0Var.D1(false, true);
                                        if ((i15 == 3 && ((i12 = me0Var2.f39668i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i15 == 2 && ((i11 = me0Var2.f39668i0) == 4 || i11 == 3)) || (i15 == 4 && ((i10 = me0Var2.f39668i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            me0Var2.s();
                                        }
                                        if (i15 == 15) {
                                            org.telegram.messenger.zs.e().b(me0Var2, 257);
                                        } else if (i15 == 2) {
                                            org.telegram.messenger.i0.D3(true);
                                            org.telegram.messenger.zs.e().b(me0Var2, 257);
                                        } else if (i15 == 3) {
                                            org.telegram.messenger.i0.C3(true);
                                            org.telegram.messenger.zs.e().b(me0Var2, 258);
                                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(9));
                                        }
                                        me0Var2.f39663e0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    me0Var2.c(true);
                                                    hf0Var.C1(0, true, null, true);
                                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                                                } else {
                                                    String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.z20.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    hf0Var.t1(L0, sb2.toString());
                                                }
                                            } else {
                                                me0Var2.w();
                                                return;
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                zr zrVar = me0Var2.f39664f;
                                                bs[] bsVarArr = zrVar.f44219f;
                                                if (i16 < bsVarArr.length) {
                                                    bsVarArr[i16].setText("");
                                                    i16++;
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
                                if (i15 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                me0Var2.f39665f0 = false;
                                hf0 hf0Var2 = me0Var2.f39682u0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.m0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", me0Var2.d);
                                    bundle2.putString("phoneHash", me0Var2.f39660c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    me0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    me0Var2.f39682u0.C1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    me0Var2.f39682u0.C1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final me0 me0Var2 = this.f36193b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f36194c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        int i14 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final me0 me0Var22 = me0Var2;
                        switch (i14) {
                            case 0:
                                int i15 = me0Var22.f39667h0;
                                hf0 hf0Var = me0Var22.f39682u0;
                                me0Var22.y(false);
                                if (tL_error2 == null) {
                                    me0Var22.f39665f0 = false;
                                    hf0Var.D1(false, true);
                                    me0Var22.u();
                                    me0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            hf0Var.f37938q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", me0Var22.d);
                                        bundle.putString("phoneHash", me0Var22.f39660c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        me0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        me0Var22.f39682u0.C1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        me0Var22.f39682u0.C1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        me0Var22.p(new f70(25, me0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    me0Var22.f39666g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new be0(me0Var22, tL_auth_signIn22, 1), 10);
                                        me0Var22.u();
                                        me0Var22.t();
                                    } else {
                                        me0Var22.f39665f0 = false;
                                        hf0Var.D1(false, true);
                                        if ((i15 == 3 && ((i12 = me0Var22.f39668i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i15 == 2 && ((i11 = me0Var22.f39668i0) == 4 || i11 == 3)) || (i15 == 4 && ((i10 = me0Var22.f39668i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            me0Var22.s();
                                        }
                                        if (i15 == 15) {
                                            org.telegram.messenger.zs.e().b(me0Var22, 257);
                                        } else if (i15 == 2) {
                                            org.telegram.messenger.i0.D3(true);
                                            org.telegram.messenger.zs.e().b(me0Var22, 257);
                                        } else if (i15 == 3) {
                                            org.telegram.messenger.i0.C3(true);
                                            org.telegram.messenger.zs.e().b(me0Var22, 258);
                                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(9));
                                        }
                                        me0Var22.f39663e0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    me0Var22.c(true);
                                                    hf0Var.C1(0, true, null, true);
                                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                                                } else {
                                                    String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.z20.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    hf0Var.t1(L0, sb2.toString());
                                                }
                                            } else {
                                                me0Var22.w();
                                                return;
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                zr zrVar = me0Var22.f39664f;
                                                bs[] bsVarArr = zrVar.f44219f;
                                                if (i16 < bsVarArr.length) {
                                                    bsVarArr[i16].setText("");
                                                    i16++;
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
                                if (i15 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                me0Var22.f39665f0 = false;
                                hf0 hf0Var2 = me0Var22.f39682u0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.m0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", me0Var22.d);
                                    bundle2.putString("phoneHash", me0Var22.f39660c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    me0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    me0Var22.f39682u0.C1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    me0Var22.f39682u0.C1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
