package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qk0 implements Utilities.Callback {
    public final int[] f40595a;
    public final ei.d f40596b;
    public final ei.d f40597c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.f3 e;
    public final boolean f40598f;
    public final String f40599g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f40600i;
    public final boolean f40601j;
    public final org.telegram.ui.web.a1 f40602k;
    public final String f40603l;
    public final org.telegram.ui.ActionBar.d6 f40604m;

    public qk0(int[] iArr, ei.d dVar, ei.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.a1 a1Var, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f40595a = iArr;
        this.f40596b = dVar;
        this.f40597c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = f3Var;
        this.f40598f = z10;
        this.f40599g = str;
        this.h = urlAuthResult;
        this.f40600i = strArr;
        this.f40601j = z11;
        this.f40602k = a1Var;
        this.f40603l = str2;
        this.f40604m = d6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f40595a;
        ei.d dVar = this.f40596b;
        ei.d dVar2 = this.f40597c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.f3 f3Var = this.e;
        final boolean z10 = this.f40598f;
        final String str = this.f40599g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f40600i;
        final boolean z11 = this.f40601j;
        final org.telegram.ui.web.a1 a1Var = this.f40602k;
        final String str2 = this.f40603l;
        final org.telegram.ui.ActionBar.d6 d6Var = this.f40604m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.N && !dVar2.N) {
            final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
            b2Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    CharSequence replaceSingleLinkBold;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.b2.this.dismiss();
                    org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                    if (urlAuthResult2 != null) {
                        f3Var2.dismiss();
                        uk0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, a1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            f3Var2.dismiss();
                            org.telegram.ui.Components.xc a2 = uk0.a();
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
                        org.telegram.ui.Cells.c1.t(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
