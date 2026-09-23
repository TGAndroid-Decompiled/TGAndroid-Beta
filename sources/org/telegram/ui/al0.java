package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al0 implements Runnable {
    public final org.telegram.ui.web.b1 E;
    public final ci.d f31819a;
    public final ci.d f31820b;
    public final TLRPC.TL_messages_requestUrlAuth f31821c;
    public final String[] d;
    public final org.telegram.ui.Cells.x8 e;
    public final boolean[] f31822f;
    public final int[] h;
    public final boolean[] f31823n;
    public final org.telegram.ui.ActionBar.f3 f31824r;
    public final String f31825s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f31826w;
    public final String f31827x;
    public final TLRPC.TL_urlAuthResultRequest f31828y;

    public al0(ci.d dVar, ci.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.x8 x8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.f3 f3Var, String str, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.b1 b1Var) {
        this.f31819a = dVar;
        this.f31820b = dVar2;
        this.f31821c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.e = x8Var;
        this.f31822f = zArr;
        this.h = iArr;
        this.f31823n = zArr2;
        this.f31824r = f3Var;
        this.f31825s = str;
        this.v = d6Var;
        this.f31826w = z10;
        this.f31827x = str2;
        this.f31828y = tL_urlAuthResultRequest;
        this.E = b1Var;
    }

    @Override
    public final void run() {
        ci.d dVar = this.f31819a;
        if (dVar.N || this.f31820b.N) {
            return;
        }
        boolean z10 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f31821c;
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 2)) {
            tL_messages_acceptUrlAuth.flags |= 2;
            tL_messages_acceptUrlAuth.peer = tL_messages_requestUrlAuth.peer;
            tL_messages_acceptUrlAuth.msg_id = tL_messages_requestUrlAuth.msg_id;
            tL_messages_acceptUrlAuth.button_id = tL_messages_requestUrlAuth.button_id;
        }
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 4)) {
            tL_messages_acceptUrlAuth.flags |= 4;
            tL_messages_acceptUrlAuth.url = tL_messages_requestUrlAuth.url;
        }
        String str = this.d[0];
        if (str != null) {
            tL_messages_acceptUrlAuth.match_code = str;
        }
        org.telegram.ui.Cells.x8 x8Var = this.e;
        tL_messages_acceptUrlAuth.write_allowed = (x8Var == null || !x8Var.e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f31822f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f31823n;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f31824r;
        final String str2 = this.f31825s;
        final org.telegram.ui.ActionBar.d6 d6Var = this.v;
        final boolean z11 = this.f31826w;
        final String str3 = this.f31827x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f31828y;
        final org.telegram.ui.web.b1 b1Var = this.E;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                CharSequence replaceSingleLinkBold;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                zArr[0] = true;
                f3Var.dismiss();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Components.xc a2 = cl0.a();
                        int i10 = R.raw.error;
                        String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                        } else {
                            replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, d6Var));
                        }
                        a2.M(string, replaceSingleLinkBold, i10).j();
                        return;
                    }
                    cl0.a().d0(tL_error, false);
                    return;
                }
                cl0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, b1Var);
            }
        });
    }
}
