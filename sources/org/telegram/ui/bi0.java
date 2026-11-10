package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bi0 implements org.telegram.messenger.c20 {
    public final int[] f44066a;
    public final fi.d f44067b;
    public final fi.d f44068c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.w2 f44069e;
    public final boolean f44070f;
    public final String f44071g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f44072i;
    public final boolean f44073j;
    public final org.telegram.ui.web.x0 f44074k;
    public final String f44075l;
    public final org.telegram.ui.ActionBar.h6 f44076m;

    public bi0(int[] iArr, fi.d dVar, fi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.w2 w2Var, boolean z9, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.x0 x0Var, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f44066a = iArr;
        this.f44067b = dVar;
        this.f44068c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f44069e = w2Var;
        this.f44070f = z9;
        this.f44071g = str;
        this.h = urlAuthResult;
        this.f44072i = strArr;
        this.f44073j = z10;
        this.f44074k = x0Var;
        this.f44075l = str2;
        this.f44076m = h6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f44066a;
        fi.d dVar = this.f44067b;
        fi.d dVar2 = this.f44068c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.w2 w2Var = this.f44069e;
        final boolean z9 = this.f44070f;
        final String str = this.f44071g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f44072i;
        final boolean z10 = this.f44073j;
        final org.telegram.ui.web.x0 x0Var = this.f44074k;
        final String str2 = this.f44075l;
        final org.telegram.ui.ActionBar.h6 h6Var = this.f44076m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f25570b, null);
            u1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.v10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.u1.this.dismiss();
                    org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                    if (urlAuthResult2 != null) {
                        w2Var2.dismiss();
                        ei0.b(z9, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z10, x0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            w2Var2.dismiss();
                            org.telegram.ui.Components.gc a10 = ei0.a();
                            String M0 = org.telegram.messenger.id.M0(2131753128, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.id.M0(2131753129, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.uj, h6Var), org.telegram.messenger.id.a0(null, null, 2131753130, str3));
                            }
                            a10.I(2131624011, M0, P2).j();
                            return;
                        }
                        org.telegram.ui.Cells.f1.r(w2Var2.E, w2Var2.I0, tL_error, false);
                    }
                }
            });
        }
    }
}
