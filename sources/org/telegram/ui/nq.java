package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;
public final class nq implements org.telegram.messenger.k20 {
    public final int f39954a;
    public final boolean f39955b;
    public final org.telegram.messenger.vs f39956c;
    public final Object d;

    public nq(org.telegram.messenger.vs vsVar, Object obj, boolean z10, int i10) {
        this.f39954a = i10;
        this.f39956c = vsVar;
        this.d = obj;
        this.f39955b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        int i10 = this.f39954a;
        boolean z10 = false;
        boolean z11 = this.f39955b;
        Object obj3 = this.d;
        org.telegram.messenger.vs vsVar = this.f39956c;
        switch (i10) {
            case 0:
                pr prVar = (pr) vsVar;
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    prVar.getMessagesController().L3(updates, false);
                    return;
                }
                prVar.getClass();
                if (tL_error != null) {
                    p8Var.setChecked(z11);
                    org.telegram.ui.Components.cc.a0(prVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                qh.m0 m0Var = (qh.m0) vsVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                qh.x0 x0Var = m0Var.f45699b;
                if (m0Var.f45702n == ((int[]) obj3)[0] && !m0Var.E) {
                    m0Var.f45702n = 0;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error2 != null) {
                            str = tL_error2.text;
                        } else {
                            str = null;
                        }
                        org.telegram.messenger.f8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = m0Var.f45701f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    x0Var.getClass();
                                    x0Var.d1(2131232435, org.telegram.messenger.dd.L0(2131751106, null), null);
                                    return;
                                }
                                return;
                            }
                        }
                        m0Var.d = 0;
                        m0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (x0Var.f46016v0) {
                            if (str != null) {
                                str2 = org.telegram.messenger.dd.L0(2131751106, null);
                            }
                            x0Var.U0(str2);
                            return;
                        } else if (str != null) {
                            x0Var.d1(2131232435, org.telegram.messenger.dd.L0(2131751106, null), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i11 = m0Var.d;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                m0Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            m0Var.f45701f = tL_exportedNoPaidMessagesToken;
                            m0Var.h = SystemClock.elapsedRealtime();
                            x0Var.setFreeLink(m0Var.d(tL_exportedNoPaidMessagesToken));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
