package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class il0 implements Utilities.Callback {
    public final int[] f38733a;
    public final ci.d f38734b;
    public final ci.d f38735c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.f3 f38736e;
    public final boolean f38737f;
    public final String f38738g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f38739i;
    public final boolean f38740j;
    public final org.telegram.ui.web.b1 f38741k;
    public final String f38742l;
    public final org.telegram.ui.ActionBar.e6 f38743m;

    public il0(int[] iArr, ci.d dVar, ci.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f38733a = iArr;
        this.f38734b = dVar;
        this.f38735c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f38736e = f3Var;
        this.f38737f = z10;
        this.f38738g = str;
        this.h = urlAuthResult;
        this.f38739i = strArr;
        this.f38740j = z11;
        this.f38741k = b1Var;
        this.f38742l = str2;
        this.f38743m = e6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f38733a;
        ci.d dVar = this.f38734b;
        ci.d dVar2 = this.f38735c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f38736e;
        final boolean z10 = this.f38737f;
        final String str = this.f38738g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f38739i;
        final boolean z11 = this.f38740j;
        final org.telegram.ui.web.b1 b1Var = this.f38741k;
        final String str2 = this.f38742l;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f38743m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.N && !dVar2.N) {
            final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
            b2Var.q(200L);
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
                        ml0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, b1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            f3Var2.dismiss();
                            org.telegram.ui.Components.ad a2 = ml0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, e6Var));
                            }
                            a2.M(string, replaceSingleLinkBold, i10).j();
                            return;
                        }
                        org.telegram.ui.Cells.c1.p(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
