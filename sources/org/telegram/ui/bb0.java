package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bb0 implements RequestDelegate {
    public final int f44010a;
    public final lb0 f44011b;
    public final Bundle f44012c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public bb0(lb0 lb0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i3) {
        this.f44010a = i3;
        this.f44011b = lb0Var;
        this.f44012c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f44010a) {
            case 0:
                final lb0 lb0Var = this.f44011b;
                final Bundle bundle = this.f44012c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i3;
                        String str2;
                        int i10;
                        int i11 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        lb0 lb0Var2 = lb0Var;
                        switch (i11) {
                            case 0:
                                xd0 xd0Var = lb0Var2.f47284a0;
                                if (xd0Var.getParentActivity() != null) {
                                    lb0Var2.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        xd0Var.p1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lb0Var2.getContext());
                                            String M0 = org.telegram.messenger.bd.M0(2131748737, null);
                                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                            s1Var.S = M0;
                                            mf.b c2 = mf.b.c();
                                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131748738, org.telegram.messenger.bd.a(c2.b("+" + lb0Var2.M))));
                                            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                            org.telegram.ui.Components.t4.e0(i3, tL_error2, xd0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            xd0Var.D1(0, true, null, true);
                                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                xd0 xd0Var2 = lb0Var2.f47284a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = lb0Var2.E.getString("emailPattern");
                                        lb0Var2.f47294y = true;
                                    }
                                    xd0Var2.p1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                        org.telegram.ui.Components.t4.e0(i10, tL_error2, xd0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    xd0Var2.D1(0, true, null, true);
                                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final lb0 lb0Var2 = this.f44011b;
                final Bundle bundle2 = this.f44012c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i3;
                        String str2;
                        int i10;
                        int i11 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        lb0 lb0Var22 = lb0Var2;
                        switch (i11) {
                            case 0:
                                xd0 xd0Var = lb0Var22.f47284a0;
                                if (xd0Var.getParentActivity() != null) {
                                    lb0Var22.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        xd0Var.p1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lb0Var22.getContext());
                                            String M0 = org.telegram.messenger.bd.M0(2131748737, null);
                                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                            s1Var.S = M0;
                                            mf.b c2 = mf.b.c();
                                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131748738, org.telegram.messenger.bd.a(c2.b("+" + lb0Var22.M))));
                                            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                            org.telegram.ui.Components.t4.e0(i3, tL_error2, xd0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            xd0Var.D1(0, true, null, true);
                                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                xd0 xd0Var2 = lb0Var22.f47284a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = lb0Var22.E.getString("emailPattern");
                                        lb0Var22.f47294y = true;
                                    }
                                    xd0Var2.p1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                        org.telegram.ui.Components.t4.e0(i10, tL_error2, xd0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    xd0Var2.D1(0, true, null, true);
                                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
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
