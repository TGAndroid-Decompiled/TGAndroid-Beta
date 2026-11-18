package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gb0 implements RequestDelegate {
    public final int f47951a;
    public final pb0 f47952b;
    public final Bundle f47953c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public gb0(pb0 pb0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i7) {
        this.f47951a = i7;
        this.f47952b = pb0Var;
        this.f47953c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f47951a) {
            case 0:
                final pb0 pb0Var = this.f47952b;
                final Bundle bundle = this.f47953c;
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
                        pb0 pb0Var2 = pb0Var;
                        switch (i11) {
                            case 0:
                                ee0 ee0Var = pb0Var2.f50789a0;
                                if (ee0Var.getParentActivity() != null) {
                                    pb0Var2.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ee0Var.y1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pb0Var2.getContext());
                                            String M0 = org.telegram.messenger.gd.M0(2131748537, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                            u1Var.S = M0;
                                            pf.b c10 = pf.b.c();
                                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748538, org.telegram.messenger.gd.a(c10.b("+" + pb0Var2.M))));
                                            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                            org.telegram.ui.Components.b5.c0(i7, tL_error2, ee0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            ee0Var.M1(0, true, null, true);
                                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ee0 ee0Var2 = pb0Var2.f50789a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pb0Var2.E.getString("emailPattern");
                                        pb0Var2.f50799y = true;
                                    }
                                    ee0Var2.y1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.h2) ee0Var2).currentAccount;
                                        org.telegram.ui.Components.b5.c0(i10, tL_error2, ee0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    ee0Var2.M1(0, true, null, true);
                                    ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final pb0 pb0Var2 = this.f47952b;
                final Bundle bundle2 = this.f47953c;
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
                        pb0 pb0Var22 = pb0Var2;
                        switch (i11) {
                            case 0:
                                ee0 ee0Var = pb0Var22.f50789a0;
                                if (ee0Var.getParentActivity() != null) {
                                    pb0Var22.W = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        ee0Var.y1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pb0Var22.getContext());
                                            String M0 = org.telegram.messenger.gd.M0(2131748537, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                            u1Var.S = M0;
                                            pf.b c10 = pf.b.c();
                                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748538, org.telegram.messenger.gd.a(c10.b("+" + pb0Var22.M))));
                                            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                            org.telegram.ui.Components.b5.c0(i7, tL_error2, ee0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            ee0Var.M1(0, true, null, true);
                                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ee0 ee0Var2 = pb0Var22.f50789a0;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pb0Var22.E.getString("emailPattern");
                                        pb0Var22.f50799y = true;
                                    }
                                    ee0Var2.y1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i10 = ((org.telegram.ui.ActionBar.h2) ee0Var2).currentAccount;
                                        org.telegram.ui.Components.b5.c0(i10, tL_error2, ee0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    ee0Var2.M1(0, true, null, true);
                                    ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
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
