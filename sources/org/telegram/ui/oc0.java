package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oc0 implements RequestDelegate {
    public final int f40224a;
    public final wc0 f40225b;
    public final Bundle f40226c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public oc0(wc0 wc0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f40224a = i10;
        this.f40225b = wc0Var;
        this.f40226c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40224a) {
            case 0:
                final wc0 wc0Var = this.f40225b;
                final Bundle bundle = this.f40226c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.i0.g3(new Runnable() {
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
                        wc0 wc0Var2 = wc0Var;
                        switch (i12) {
                            case 0:
                                hf0 hf0Var = wc0Var2.W;
                                if (hf0Var.getParentActivity() != null) {
                                    wc0Var2.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        hf0Var.o1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wc0Var2.getContext());
                                            String L0 = org.telegram.messenger.cd.L0(2131748740, null);
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                            x1Var.R = L0;
                                            af.b c10 = af.b.c();
                                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131748741, org.telegram.messenger.cd.a(c10.b("+" + wc0Var2.L))));
                                            i0.a.w(null, 2131747847, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                            org.telegram.ui.Components.s4.e0(i10, tL_error2, hf0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            hf0Var.C1(0, true, null, true);
                                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                hf0 hf0Var2 = wc0Var2.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = wc0Var2.D.getString("emailPattern");
                                        wc0Var2.f42936y = true;
                                    }
                                    hf0Var2.o1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                        org.telegram.ui.Components.s4.e0(i11, tL_error2, hf0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    hf0Var2.C1(0, true, null, true);
                                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final wc0 wc0Var2 = this.f40225b;
                final Bundle bundle2 = this.f40226c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.i0.g3(new Runnable() {
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
                        wc0 wc0Var22 = wc0Var2;
                        switch (i12) {
                            case 0:
                                hf0 hf0Var = wc0Var22.W;
                                if (hf0Var.getParentActivity() != null) {
                                    wc0Var22.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        hf0Var.o1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wc0Var22.getContext());
                                            String L0 = org.telegram.messenger.cd.L0(2131748740, null);
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                            x1Var.R = L0;
                                            af.b c10 = af.b.c();
                                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131748741, org.telegram.messenger.cd.a(c10.b("+" + wc0Var22.L))));
                                            i0.a.w(null, 2131747847, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                            org.telegram.ui.Components.s4.e0(i10, tL_error2, hf0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            hf0Var.C1(0, true, null, true);
                                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                hf0 hf0Var2 = wc0Var22.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = wc0Var22.D.getString("emailPattern");
                                        wc0Var22.f42936y = true;
                                    }
                                    hf0Var2.o1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                        org.telegram.ui.Components.s4.e0(i11, tL_error2, hf0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    hf0Var2.C1(0, true, null, true);
                                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
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
