package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hb0 implements RequestDelegate {
    public final int f46273a;
    public final qb0 f46274b;
    public final Bundle f46275c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public hb0(qb0 qb0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i7) {
        this.f46273a = i7;
        this.f46274b = qb0Var;
        this.f46275c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46273a) {
            case 0:
                final qb0 qb0Var = this.f46274b;
                final Bundle bundle = this.f46275c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
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
                        qb0 qb0Var2 = qb0Var;
                        switch (i11) {
                            case 0:
                                ee0 ee0Var = qb0Var2.W;
                                if (ee0Var.getParentActivity() != null) {
                                    qb0Var2.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ee0Var.y1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qb0Var2.getContext());
                                            String M0 = org.telegram.messenger.id.M0(2131748729, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                            u1Var.R = M0;
                                            pf.b c10 = pf.b.c();
                                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748730, org.telegram.messenger.id.a(c10.b("+" + qb0Var2.L))));
                                            jg.g.C(null, 2131747831, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                            org.telegram.ui.Components.v4.c0(i7, tL_error2, ee0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            ee0Var.M1(0, true, null, true);
                                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ee0 ee0Var2 = qb0Var2.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = qb0Var2.D.getString("emailPattern");
                                        qb0Var2.f49011y = true;
                                    }
                                    ee0Var2.y1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                                        org.telegram.ui.Components.v4.c0(i10, tL_error2, ee0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    ee0Var2.M1(0, true, null, true);
                                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final qb0 qb0Var2 = this.f46274b;
                final Bundle bundle2 = this.f46275c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
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
                        qb0 qb0Var22 = qb0Var2;
                        switch (i11) {
                            case 0:
                                ee0 ee0Var = qb0Var22.W;
                                if (ee0Var.getParentActivity() != null) {
                                    qb0Var22.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ee0Var.y1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qb0Var22.getContext());
                                            String M0 = org.telegram.messenger.id.M0(2131748729, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                            u1Var.R = M0;
                                            pf.b c10 = pf.b.c();
                                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748730, org.telegram.messenger.id.a(c10.b("+" + qb0Var22.L))));
                                            jg.g.C(null, 2131747831, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                            org.telegram.ui.Components.v4.c0(i7, tL_error2, ee0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            ee0Var.M1(0, true, null, true);
                                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ee0 ee0Var2 = qb0Var22.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = qb0Var22.D.getString("emailPattern");
                                        qb0Var22.f49011y = true;
                                    }
                                    ee0Var2.y1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                                        org.telegram.ui.Components.v4.c0(i10, tL_error2, ee0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    ee0Var2.M1(0, true, null, true);
                                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
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
