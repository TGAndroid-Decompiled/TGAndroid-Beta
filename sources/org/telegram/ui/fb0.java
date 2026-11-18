package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fb0 implements RequestDelegate {
    public final int f47630a;
    public final ob0 f47631b;
    public final Bundle f47632c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public fb0(ob0 ob0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i7) {
        this.f47630a = i7;
        this.f47631b = ob0Var;
        this.f47632c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47630a) {
            case 0:
                final ob0 ob0Var = this.f47631b;
                final Bundle bundle = this.f47632c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i7;
                        String str2;
                        int i10;
                        int i11 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        ob0 ob0Var2 = ob0Var;
                        switch (i11) {
                            case 0:
                                de0 de0Var = ob0Var2.f50548a0;
                                if (de0Var.getParentActivity() != null) {
                                    ob0Var2.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        de0Var.y1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ob0Var2.getContext());
                                            String M0 = org.telegram.messenger.gd.M0(2131748537, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                                            u1Var.S = M0;
                                            pf.b c10 = pf.b.c();
                                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748538, org.telegram.messenger.gd.a(c10.b("+" + ob0Var2.M))));
                                            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                                            org.telegram.ui.Components.b5.c0(i7, tL_error2, de0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            de0Var.M1(0, true, null, true);
                                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                de0 de0Var2 = ob0Var2.f50548a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ob0Var2.E.getString("emailPattern");
                                        ob0Var2.f50558y = true;
                                    }
                                    de0Var2.y1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.h2) de0Var2).currentAccount;
                                        org.telegram.ui.Components.b5.c0(i10, tL_error2, de0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    de0Var2.M1(0, true, null, true);
                                    de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final ob0 ob0Var2 = this.f47631b;
                final Bundle bundle2 = this.f47632c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i7;
                        String str2;
                        int i10;
                        int i11 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        ob0 ob0Var22 = ob0Var2;
                        switch (i11) {
                            case 0:
                                de0 de0Var = ob0Var22.f50548a0;
                                if (de0Var.getParentActivity() != null) {
                                    ob0Var22.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        de0Var.y1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ob0Var22.getContext());
                                            String M0 = org.telegram.messenger.gd.M0(2131748537, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                                            u1Var.S = M0;
                                            pf.b c10 = pf.b.c();
                                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748538, org.telegram.messenger.gd.a(c10.b("+" + ob0Var22.M))));
                                            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                                            org.telegram.ui.Components.b5.c0(i7, tL_error2, de0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            de0Var.M1(0, true, null, true);
                                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                de0 de0Var2 = ob0Var22.f50548a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ob0Var22.E.getString("emailPattern");
                                        ob0Var22.f50558y = true;
                                    }
                                    de0Var2.y1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.h2) de0Var2).currentAccount;
                                        org.telegram.ui.Components.b5.c0(i10, tL_error2, de0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    de0Var2.M1(0, true, null, true);
                                    de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
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
