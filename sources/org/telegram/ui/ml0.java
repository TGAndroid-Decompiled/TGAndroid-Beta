package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ml0 implements Utilities.Callback {
    public final int[] f38027a;
    public final di.d f38028b;
    public final di.d f38029c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.e3 e;
    public final boolean f38030f;
    public final String f38031g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f38032i;
    public final boolean f38033j;
    public final org.telegram.ui.web.c1 f38034k;
    public final String f38035l;
    public final org.telegram.ui.ActionBar.c6 f38036m;

    public ml0(int[] iArr, di.d dVar, di.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.c1 c1Var, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f38027a = iArr;
        this.f38028b = dVar;
        this.f38029c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = e3Var;
        this.f38030f = z10;
        this.f38031g = str;
        this.h = urlAuthResult;
        this.f38032i = strArr;
        this.f38033j = z11;
        this.f38034k = c1Var;
        this.f38035l = str2;
        this.f38036m = c6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f38027a;
        di.d dVar = this.f38028b;
        di.d dVar2 = this.f38029c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.e3 e3Var = this.e;
        final boolean z10 = this.f38030f;
        final String str = this.f38031g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f38032i;
        final boolean z11 = this.f38033j;
        final org.telegram.ui.web.c1 c1Var = this.f38034k;
        final String str2 = this.f38035l;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f38036m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.N && !dVar2.N) {
            final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
            a2Var.q(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    CharSequence replaceSingleLinkBold;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.a2.this.dismiss();
                    org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                    if (urlAuthResult2 != null) {
                        e3Var2.dismiss();
                        ql0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, c1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            e3Var2.dismiss();
                            org.telegram.ui.Components.zc a2 = ql0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var));
                            }
                            a2.M(string, replaceSingleLinkBold, i10).j();
                            return;
                        }
                        org.telegram.ui.Cells.c1.p(e3Var2.topBulletinContainer, e3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
