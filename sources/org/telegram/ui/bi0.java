package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bi0 implements org.telegram.messenger.w10 {
    public final int[] f46050a;
    public final hi.e f46051b;
    public final hi.e f46052c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.w2 f46053e;
    public final boolean f46054f;
    public final String f46055g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f46056i;
    public final boolean f46057j;
    public final org.telegram.ui.web.v0 f46058k;
    public final String f46059l;
    public final org.telegram.ui.ActionBar.i6 f46060m;

    public bi0(int[] iArr, hi.e eVar, hi.e eVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.w2 w2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.v0 v0Var, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f46050a = iArr;
        this.f46051b = eVar;
        this.f46052c = eVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f46053e = w2Var;
        this.f46054f = z10;
        this.f46055g = str;
        this.h = urlAuthResult;
        this.f46056i = strArr;
        this.f46057j = z11;
        this.f46058k = v0Var;
        this.f46059l = str2;
        this.f46060m = i6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f46050a;
        hi.e eVar = this.f46051b;
        hi.e eVar2 = this.f46052c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.w2 w2Var = this.f46053e;
        final boolean z10 = this.f46054f;
        final String str = this.f46055g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f46056i;
        final boolean z11 = this.f46057j;
        final org.telegram.ui.web.v0 v0Var = this.f46058k;
        final String str2 = this.f46059l;
        final org.telegram.ui.ActionBar.i6 i6Var = this.f46060m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !eVar.R && !eVar2.R) {
            final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.f27013b, null);
            t1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.p10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.t1.this.dismiss();
                    org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                    if (urlAuthResult2 != null) {
                        w2Var2.dismiss();
                        ei0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, v0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            w2Var2.dismiss();
                            org.telegram.ui.Components.kc a10 = ei0.a();
                            String N0 = org.telegram.messenger.gd.N0(2131753125, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.gd.N0(2131753126, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), org.telegram.messenger.gd.a0(null, null, 2131753127, str3));
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
