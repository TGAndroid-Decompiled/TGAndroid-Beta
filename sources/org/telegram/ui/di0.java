package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class di0 implements org.telegram.messenger.x10 {
    public final int[] f46988a;
    public final hi.d f46989b;
    public final hi.d f46990c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.x2 f46991e;
    public final boolean f46992f;
    public final String f46993g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f46994i;
    public final boolean f46995j;
    public final org.telegram.ui.web.v0 f46996k;
    public final String f46997l;
    public final org.telegram.ui.ActionBar.i6 f46998m;

    public di0(int[] iArr, hi.d dVar, hi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.x2 x2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.v0 v0Var, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f46988a = iArr;
        this.f46989b = dVar;
        this.f46990c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f46991e = x2Var;
        this.f46992f = z10;
        this.f46993g = str;
        this.h = urlAuthResult;
        this.f46994i = strArr;
        this.f46995j = z11;
        this.f46996k = v0Var;
        this.f46997l = str2;
        this.f46998m = i6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f46988a;
        hi.d dVar = this.f46989b;
        hi.d dVar2 = this.f46990c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.x2 x2Var = this.f46991e;
        final boolean z10 = this.f46992f;
        final String str = this.f46993g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f46994i;
        final boolean z11 = this.f46995j;
        final org.telegram.ui.web.v0 v0Var = this.f46996k;
        final String str2 = this.f46997l;
        final org.telegram.ui.ActionBar.i6 i6Var = this.f46998m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.R && !dVar2.R) {
            final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f26915b, null);
            u1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.q10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.u1.this.dismiss();
                    org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                    if (urlAuthResult2 != null) {
                        x2Var2.dismiss();
                        gi0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, v0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            x2Var2.dismiss();
                            org.telegram.ui.Components.lc a10 = gi0.a();
                            String M0 = org.telegram.messenger.gd.M0(2131753126, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.gd.M0(2131753127, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), org.telegram.messenger.gd.a0(null, null, 2131753128, str3));
                            }
                            a10.I(2131624012, M0, P2).j();
                            return;
                        }
                        org.telegram.ui.Cells.c0.t(x2Var2.F, x2Var2.J0, tL_error, false);
                    }
                }
            });
        }
    }
}
