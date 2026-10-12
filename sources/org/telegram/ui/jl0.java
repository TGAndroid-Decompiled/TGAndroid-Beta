package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class jl0 implements Utilities.Callback {
    public final int[] f39241a;
    public final ci.d f39242b;
    public final ci.d f39243c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.e3 f39244e;
    public final boolean f39245f;
    public final String f39246g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f39247i;
    public final boolean f39248j;
    public final org.telegram.ui.web.b1 f39249k;
    public final String f39250l;
    public final org.telegram.ui.ActionBar.c6 f39251m;

    public jl0(int[] iArr, ci.d dVar, ci.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f39241a = iArr;
        this.f39242b = dVar;
        this.f39243c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f39244e = e3Var;
        this.f39245f = z10;
        this.f39246g = str;
        this.h = urlAuthResult;
        this.f39247i = strArr;
        this.f39248j = z11;
        this.f39249k = b1Var;
        this.f39250l = str2;
        this.f39251m = c6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f39241a;
        ci.d dVar = this.f39242b;
        ci.d dVar2 = this.f39243c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.e3 e3Var = this.f39244e;
        final boolean z10 = this.f39245f;
        final String str = this.f39246g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f39247i;
        final boolean z11 = this.f39248j;
        final org.telegram.ui.web.b1 b1Var = this.f39249k;
        final String str2 = this.f39250l;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f39251m;
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
                        nl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, b1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            e3Var2.dismiss();
                            org.telegram.ui.Components.zc a2 = nl0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, c6Var));
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
