package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl0 implements Runnable {
    public final org.telegram.ui.web.d1 E;
    public final di.d f37801a;
    public final di.d f37802b;
    public final TLRPC.TL_messages_requestUrlAuth f37803c;
    public final String[] d;
    public final org.telegram.ui.Cells.w8 f37804e;
    public final boolean[] f37805f;
    public final int[] h;
    public final boolean[] f37806n;
    public final org.telegram.ui.ActionBar.f3 f37807r;
    public final String f37808s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean f37809w;
    public final String f37810x;
    public final TLRPC.TL_urlAuthResultRequest f37811y;

    public jl0(di.d dVar, di.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.w8 w8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.f3 f3Var, String str, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.d1 d1Var) {
        this.f37801a = dVar;
        this.f37802b = dVar2;
        this.f37803c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.f37804e = w8Var;
        this.f37805f = zArr;
        this.h = iArr;
        this.f37806n = zArr2;
        this.f37807r = f3Var;
        this.f37808s = str;
        this.v = f6Var;
        this.f37809w = z10;
        this.f37810x = str2;
        this.f37811y = tL_urlAuthResultRequest;
        this.E = d1Var;
    }

    @Override
    public final void run() {
        di.d dVar = this.f37801a;
        if (dVar.N || this.f37802b.N) {
            return;
        }
        boolean z10 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f37803c;
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
        org.telegram.ui.Cells.w8 w8Var = this.f37804e;
        tL_messages_acceptUrlAuth.write_allowed = (w8Var == null || !w8Var.f23490e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f37805f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f37806n;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f37807r;
        final String str2 = this.f37808s;
        final org.telegram.ui.ActionBar.f6 f6Var = this.v;
        final boolean z11 = this.f37809w;
        final String str3 = this.f37810x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f37811y;
        final org.telegram.ui.web.d1 d1Var = this.E;
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
                        org.telegram.ui.Components.yc a2 = ll0.a();
                        int i10 = R.raw.error;
                        String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                        } else {
                            replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var));
                        }
                        a2.M(string, replaceSingleLinkBold, i10).j();
                        return;
                    }
                    ll0.a().d0(tL_error, false);
                    return;
                }
                ll0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, d1Var);
            }
        });
    }
}
