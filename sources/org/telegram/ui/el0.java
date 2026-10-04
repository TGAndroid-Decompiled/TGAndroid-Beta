package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el0 implements Runnable {
    public final org.telegram.ui.web.c1 E;
    public final ci.d f36041a;
    public final ci.d f36042b;
    public final TLRPC.TL_messages_requestUrlAuth f36043c;
    public final String[] d;
    public final org.telegram.ui.Cells.w8 f36044e;
    public final boolean[] f36045f;
    public final int[] h;
    public final boolean[] f36046n;
    public final org.telegram.ui.ActionBar.f3 f36047r;
    public final String f36048s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final boolean f36049w;
    public final String f36050x;
    public final TLRPC.TL_urlAuthResultRequest f36051y;

    public el0(ci.d dVar, ci.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.w8 w8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.f3 f3Var, String str, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.c1 c1Var) {
        this.f36041a = dVar;
        this.f36042b = dVar2;
        this.f36043c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.f36044e = w8Var;
        this.f36045f = zArr;
        this.h = iArr;
        this.f36046n = zArr2;
        this.f36047r = f3Var;
        this.f36048s = str;
        this.v = d6Var;
        this.f36049w = z10;
        this.f36050x = str2;
        this.f36051y = tL_urlAuthResultRequest;
        this.E = c1Var;
    }

    @Override
    public final void run() {
        ci.d dVar = this.f36041a;
        if (dVar.N || this.f36042b.N) {
            return;
        }
        boolean z10 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f36043c;
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
        org.telegram.ui.Cells.w8 w8Var = this.f36044e;
        tL_messages_acceptUrlAuth.write_allowed = (w8Var == null || !w8Var.f23691e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f36045f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f36046n;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f36047r;
        final String str2 = this.f36048s;
        final org.telegram.ui.ActionBar.d6 d6Var = this.v;
        final boolean z11 = this.f36049w;
        final String str3 = this.f36050x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f36051y;
        final org.telegram.ui.web.c1 c1Var = this.E;
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
                        org.telegram.ui.Components.yc a2 = gl0.a();
                        int i10 = R.raw.error;
                        String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                        } else {
                            replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, d6Var));
                        }
                        a2.M(string, replaceSingleLinkBold, i10).j();
                        return;
                    }
                    gl0.a().d0(tL_error, false);
                    return;
                }
                gl0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, c1Var);
            }
        });
    }
}
