package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il0 implements Runnable {
    public final org.telegram.ui.web.c1 E;
    public final bi.d f33752a;
    public final bi.d f33753b;
    public final TLRPC.TL_messages_requestUrlAuth f33754c;
    public final String[] d;
    public final org.telegram.ui.Cells.x8 e;
    public final boolean[] f33755f;
    public final int[] h;
    public final boolean[] f33756n;
    public final org.telegram.ui.ActionBar.h3 f33757r;
    public final String f33758s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean f33759w;
    public final String f33760x;
    public final TLRPC.TL_urlAuthResultRequest f33761y;

    public il0(bi.d dVar, bi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.x8 x8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.h3 h3Var, String str, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.c1 c1Var) {
        this.f33752a = dVar;
        this.f33753b = dVar2;
        this.f33754c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.e = x8Var;
        this.f33755f = zArr;
        this.h = iArr;
        this.f33756n = zArr2;
        this.f33757r = h3Var;
        this.f33758s = str;
        this.v = f6Var;
        this.f33759w = z10;
        this.f33760x = str2;
        this.f33761y = tL_urlAuthResultRequest;
        this.E = c1Var;
    }

    @Override
    public final void run() {
        bi.d dVar = this.f33752a;
        if (dVar.N || this.f33753b.N) {
            return;
        }
        boolean z10 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f33754c;
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
        tL_messages_acceptUrlAuth.share_phone_number = this.f33755f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f33756n;
        final org.telegram.ui.ActionBar.h3 h3Var = this.f33757r;
        final String str2 = this.f33758s;
        final org.telegram.ui.ActionBar.f6 f6Var = this.v;
        final boolean z11 = this.f33759w;
        final String str3 = this.f33760x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f33761y;
        final org.telegram.ui.web.c1 c1Var = this.E;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                CharSequence replaceSingleLinkBold;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                zArr[0] = true;
                h3Var.dismiss();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Components.wc a2 = kl0.a();
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
                    kl0.a().d0(tL_error, false);
                    return;
                }
                kl0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, c1Var);
            }
        });
    }
}
