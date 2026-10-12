package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nl0 implements Utilities.Callback {
    public final int[] f38732a;
    public final di.d f38733b;
    public final di.d f38734c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.e3 e;
    public final boolean f38735f;
    public final String f38736g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f38737i;
    public final boolean f38738j;
    public final org.telegram.ui.web.b1 f38739k;
    public final String f38740l;
    public final org.telegram.ui.ActionBar.c6 f38741m;

    public nl0(int[] iArr, di.d dVar, di.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f38732a = iArr;
        this.f38733b = dVar;
        this.f38734c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = e3Var;
        this.f38735f = z10;
        this.f38736g = str;
        this.h = urlAuthResult;
        this.f38737i = strArr;
        this.f38738j = z11;
        this.f38739k = b1Var;
        this.f38740l = str2;
        this.f38741m = c6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f38732a;
        di.d dVar = this.f38733b;
        di.d dVar2 = this.f38734c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.e3 e3Var = this.e;
        final boolean z10 = this.f38735f;
        final String str = this.f38736g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f38737i;
        final boolean z11 = this.f38738j;
        final org.telegram.ui.web.b1 b1Var = this.f38739k;
        final String str2 = this.f38740l;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f38741m;
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
                        rl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, b1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            e3Var2.dismiss();
                            org.telegram.ui.Components.zc a2 = rl0.a();
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
                        org.telegram.ui.Cells.d0.r(e3Var2.topBulletinContainer, e3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
