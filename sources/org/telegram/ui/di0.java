package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class di0 implements org.telegram.messenger.x10 {
    public final int[] f46911a;
    public final hi.d f46912b;
    public final hi.d f46913c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.x2 f46914e;
    public final boolean f46915f;
    public final String f46916g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f46917i;
    public final boolean f46918j;
    public final org.telegram.ui.web.v0 f46919k;
    public final String f46920l;
    public final org.telegram.ui.ActionBar.i6 f46921m;

    public di0(int[] iArr, hi.d dVar, hi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.x2 x2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.v0 v0Var, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f46911a = iArr;
        this.f46912b = dVar;
        this.f46913c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f46914e = x2Var;
        this.f46915f = z10;
        this.f46916g = str;
        this.h = urlAuthResult;
        this.f46917i = strArr;
        this.f46918j = z11;
        this.f46919k = v0Var;
        this.f46920l = str2;
        this.f46921m = i6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f46911a;
        hi.d dVar = this.f46912b;
        hi.d dVar2 = this.f46913c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.x2 x2Var = this.f46914e;
        final boolean z10 = this.f46915f;
        final String str = this.f46916g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f46917i;
        final boolean z11 = this.f46918j;
        final org.telegram.ui.web.v0 v0Var = this.f46919k;
        final String str2 = this.f46920l;
        final org.telegram.ui.ActionBar.i6 i6Var = this.f46921m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.R && !dVar2.R) {
            final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f26913b, null);
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
