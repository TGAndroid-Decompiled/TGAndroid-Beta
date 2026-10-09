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
    public final int[] f38687a;
    public final ci.d f38688b;
    public final ci.d f38689c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.f3 f38690e;
    public final boolean f38691f;
    public final String f38692g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f38693i;
    public final boolean f38694j;
    public final org.telegram.ui.web.b1 f38695k;
    public final String f38696l;
    public final org.telegram.ui.ActionBar.e6 f38697m;

    public il0(int[] iArr, ci.d dVar, ci.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f38687a = iArr;
        this.f38688b = dVar;
        this.f38689c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f38690e = f3Var;
        this.f38691f = z10;
        this.f38692g = str;
        this.h = urlAuthResult;
        this.f38693i = strArr;
        this.f38694j = z11;
        this.f38695k = b1Var;
        this.f38696l = str2;
        this.f38697m = e6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f38687a;
        ci.d dVar = this.f38688b;
        ci.d dVar2 = this.f38689c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f38690e;
        final boolean z10 = this.f38691f;
        final String str = this.f38692g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f38693i;
        final boolean z11 = this.f38694j;
        final org.telegram.ui.web.b1 b1Var = this.f38695k;
        final String str2 = this.f38696l;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f38697m;
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
