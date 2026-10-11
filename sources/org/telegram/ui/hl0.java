package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hl0 implements Utilities.Callback {
    public final int[] f38502a;
    public final ci.d f38503b;
    public final ci.d f38504c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.e3 f38505e;
    public final boolean f38506f;
    public final String f38507g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f38508i;
    public final boolean f38509j;
    public final org.telegram.ui.web.b1 f38510k;
    public final String f38511l;
    public final org.telegram.ui.ActionBar.d6 f38512m;

    public hl0(int[] iArr, ci.d dVar, ci.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f38502a = iArr;
        this.f38503b = dVar;
        this.f38504c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f38505e = e3Var;
        this.f38506f = z10;
        this.f38507g = str;
        this.h = urlAuthResult;
        this.f38508i = strArr;
        this.f38509j = z11;
        this.f38510k = b1Var;
        this.f38511l = str2;
        this.f38512m = d6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f38502a;
        ci.d dVar = this.f38503b;
        ci.d dVar2 = this.f38504c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.e3 e3Var = this.f38505e;
        final boolean z10 = this.f38506f;
        final String str = this.f38507g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f38508i;
        final boolean z11 = this.f38509j;
        final org.telegram.ui.web.b1 b1Var = this.f38510k;
        final String str2 = this.f38511l;
        final org.telegram.ui.ActionBar.d6 d6Var = this.f38512m;
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
                        ll0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, b1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            e3Var2.dismiss();
                            org.telegram.ui.Components.ad a2 = ll0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var));
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
