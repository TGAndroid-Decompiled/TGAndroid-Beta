package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ai0 implements org.telegram.messenger.c20 {
    public final int[] f43698a;
    public final fi.d f43699b;
    public final fi.d f43700c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.v2 f43701e;
    public final boolean f43702f;
    public final String f43703g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f43704i;
    public final boolean f43705j;
    public final org.telegram.ui.web.x0 f43706k;
    public final String f43707l;
    public final org.telegram.ui.ActionBar.g6 f43708m;

    public ai0(int[] iArr, fi.d dVar, fi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.x0 x0Var, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f43698a = iArr;
        this.f43699b = dVar;
        this.f43700c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f43701e = v2Var;
        this.f43702f = z9;
        this.f43703g = str;
        this.h = urlAuthResult;
        this.f43704i = strArr;
        this.f43705j = z10;
        this.f43706k = x0Var;
        this.f43707l = str2;
        this.f43708m = g6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f43698a;
        fi.d dVar = this.f43699b;
        fi.d dVar2 = this.f43700c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.v2 v2Var = this.f43701e;
        final boolean z9 = this.f43702f;
        final String str = this.f43703g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f43704i;
        final boolean z10 = this.f43705j;
        final org.telegram.ui.web.x0 x0Var = this.f43706k;
        final String str2 = this.f43707l;
        final org.telegram.ui.ActionBar.g6 g6Var = this.f43708m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f25566b, null);
            u1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.v10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.u1.this.dismiss();
                    org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                    if (urlAuthResult2 != null) {
                        v2Var2.dismiss();
                        di0.b(z9, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z10, x0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            v2Var2.dismiss();
                            org.telegram.ui.Components.hc a10 = di0.a();
                            String M0 = org.telegram.messenger.id.M0(2131753128, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.id.M0(2131753129, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.uj, g6Var), org.telegram.messenger.id.a0(null, null, 2131753130, str3));
                            }
                            a10.I(2131624011, M0, P2).j();
                            return;
                        }
                        org.telegram.ui.Cells.f1.r(v2Var2.E, v2Var2.I0, tL_error, false);
                    }
                }
            });
        }
    }
}
