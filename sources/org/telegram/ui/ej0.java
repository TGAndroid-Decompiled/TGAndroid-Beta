package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ej0 implements org.telegram.messenger.r20 {
    public final int[] f36854a;
    public final vh.d f36855b;
    public final vh.d f36856c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.z2 e;
    public final boolean f36857f;
    public final String f36858g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f36859i;
    public final boolean f36860j;
    public final org.telegram.ui.web.z0 f36861k;
    public final String f36862l;
    public final org.telegram.ui.ActionBar.p6 f36863m;

    public ej0(int[] iArr, vh.d dVar, vh.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.z2 z2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.z0 z0Var, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f36854a = iArr;
        this.f36855b = dVar;
        this.f36856c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = z2Var;
        this.f36857f = z10;
        this.f36858g = str;
        this.h = urlAuthResult;
        this.f36859i = strArr;
        this.f36860j = z11;
        this.f36861k = z0Var;
        this.f36862l = str2;
        this.f36863m = p6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f36854a;
        vh.d dVar = this.f36855b;
        vh.d dVar2 = this.f36856c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.z2 z2Var = this.e;
        final boolean z10 = this.f36857f;
        final String str = this.f36858g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f36859i;
        final boolean z11 = this.f36860j;
        final org.telegram.ui.web.z0 z0Var = this.f36861k;
        final String str2 = this.f36862l;
        final org.telegram.ui.ActionBar.p6 p6Var = this.f36863m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, org.telegram.messenger.w0.f18945b, null);
            x1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new a3.b(1), new org.telegram.messenger.k20() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence O2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.x1.this.dismiss();
                    org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                    if (urlAuthResult2 != null) {
                        z2Var2.dismiss();
                        hj0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, z0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            z2Var2.dismiss();
                            org.telegram.ui.Components.cc a2 = hj0.a();
                            String L0 = org.telegram.messenger.dd.L0(2131753128, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                O2 = org.telegram.messenger.dd.L0(2131753129, null);
                            } else {
                                O2 = org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.dd.a0(null, null, 2131753130, str3));
                            }
                            a2.I(2131624011, L0, O2).j();
                            return;
                        }
                        org.telegram.ui.Cells.f1.s(z2Var2.E, z2Var2.I0, tL_error, false);
                    }
                }
            });
        }
    }
}
