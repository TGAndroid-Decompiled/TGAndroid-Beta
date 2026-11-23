package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class di0 implements org.telegram.messenger.y10 {
    public final int[] f46940a;
    public final hi.d f46941b;
    public final hi.d f46942c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.w2 f46943e;
    public final boolean f46944f;
    public final String f46945g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f46946i;
    public final boolean f46947j;
    public final org.telegram.ui.web.v0 f46948k;
    public final String f46949l;
    public final org.telegram.ui.ActionBar.h6 f46950m;

    public di0(int[] iArr, hi.d dVar, hi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.w2 w2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.v0 v0Var, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f46940a = iArr;
        this.f46941b = dVar;
        this.f46942c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f46943e = w2Var;
        this.f46944f = z10;
        this.f46945g = str;
        this.h = urlAuthResult;
        this.f46946i = strArr;
        this.f46947j = z11;
        this.f46948k = v0Var;
        this.f46949l = str2;
        this.f46950m = h6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f46940a;
        hi.d dVar = this.f46941b;
        hi.d dVar2 = this.f46942c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.w2 w2Var = this.f46943e;
        final boolean z10 = this.f46944f;
        final String str = this.f46945g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f46946i;
        final boolean z11 = this.f46947j;
        final org.telegram.ui.web.v0 v0Var = this.f46948k;
        final String str2 = this.f46949l;
        final org.telegram.ui.ActionBar.h6 h6Var = this.f46950m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.R && !dVar2.R) {
            final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.f26895b, null);
            t1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.r10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.t1.this.dismiss();
                    org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                    if (urlAuthResult2 != null) {
                        w2Var2.dismiss();
                        gi0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, v0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            w2Var2.dismiss();
                            org.telegram.ui.Components.lc a10 = gi0.a();
                            String N0 = org.telegram.messenger.hd.N0(2131753125, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.hd.N0(2131753126, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), org.telegram.messenger.hd.a0(null, null, 2131753127, str3));
                            }
                            a10.I(2131624012, N0, P2).j();
                            return;
                        }
                        org.telegram.ui.Cells.c0.t(w2Var2.F, w2Var2.J0, tL_error, false);
                    }
                }
            });
        }
    }
}
