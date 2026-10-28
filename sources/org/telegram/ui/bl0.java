package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bl0 implements Utilities.Callback {
    public final int[] f38052a;
    public final fi.d f38053b;
    public final fi.d f38054c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.k3 e;
    public final boolean f38055f;
    public final String f38056g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f38057i;
    public final boolean f38058j;
    public final org.telegram.ui.web.a1 f38059k;
    public final String f38060l;
    public final org.telegram.ui.ActionBar.u6 f38061m;

    public bl0(int[] iArr, fi.d dVar, fi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.k3 k3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.a1 a1Var, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f38052a = iArr;
        this.f38053b = dVar;
        this.f38054c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = k3Var;
        this.f38055f = z10;
        this.f38056g = str;
        this.h = urlAuthResult;
        this.f38057i = strArr;
        this.f38058j = z11;
        this.f38059k = a1Var;
        this.f38060l = str2;
        this.f38061m = u6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f38052a;
        fi.d dVar = this.f38053b;
        fi.d dVar2 = this.f38054c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.k3 k3Var = this.e;
        final boolean z10 = this.f38055f;
        final String str = this.f38056g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f38057i;
        final boolean z11 = this.f38058j;
        final org.telegram.ui.web.a1 a1Var = this.f38059k;
        final String str2 = this.f38060l;
        final org.telegram.ui.ActionBar.u6 u6Var = this.f38061m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ApplicationLoader.applicationContext, 3, null);
            e2Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    CharSequence replaceSingleLinkBold;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.e2.this.dismiss();
                    org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                    if (urlAuthResult2 != null) {
                        k3Var2.dismiss();
                        fl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, a1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            k3Var2.dismiss();
                            org.telegram.ui.Components.wc a2 = fl0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var));
                            }
                            a2.M(string, replaceSingleLinkBold, i10).j();
                            return;
                        }
                        d3.t(k3Var2.topBulletinContainer, k3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
