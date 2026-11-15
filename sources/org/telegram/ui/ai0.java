package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ai0 implements org.telegram.messenger.z10 {
    public final int[] f45050a;
    public final hi.d f45051b;
    public final hi.d f45052c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.u2 f45053e;
    public final boolean f45054f;
    public final String f45055g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f45056i;
    public final boolean f45057j;
    public final org.telegram.ui.web.v0 f45058k;
    public final String f45059l;
    public final org.telegram.ui.ActionBar.e6 f45060m;

    public ai0(int[] iArr, hi.d dVar, hi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.u2 u2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.v0 v0Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f45050a = iArr;
        this.f45051b = dVar;
        this.f45052c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f45053e = u2Var;
        this.f45054f = z10;
        this.f45055g = str;
        this.h = urlAuthResult;
        this.f45056i = strArr;
        this.f45057j = z11;
        this.f45058k = v0Var;
        this.f45059l = str2;
        this.f45060m = e6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f45050a;
        hi.d dVar = this.f45051b;
        hi.d dVar2 = this.f45052c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.u2 u2Var = this.f45053e;
        final boolean z10 = this.f45054f;
        final String str = this.f45055g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f45056i;
        final boolean z11 = this.f45057j;
        final org.telegram.ui.web.v0 v0Var = this.f45058k;
        final String str2 = this.f45059l;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f45060m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.R && !dVar2.R) {
            final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.f26609b, null);
            t1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.s10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.t1.this.dismiss();
                    org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                    if (urlAuthResult2 != null) {
                        u2Var2.dismiss();
                        di0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, v0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            u2Var2.dismiss();
                            org.telegram.ui.Components.cc a10 = di0.a();
                            String M0 = org.telegram.messenger.hd.M0(2131753128, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.hd.M0(2131753129, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var), org.telegram.messenger.hd.a0(null, null, 2131753130, str3));
                            }
                            a10.I(2131624012, M0, P2).j();
                            return;
                        }
                        org.telegram.ui.Cells.y0.q(u2Var2.F, u2Var2.J0, tL_error, false);
                    }
                }
            });
        }
    }
}
