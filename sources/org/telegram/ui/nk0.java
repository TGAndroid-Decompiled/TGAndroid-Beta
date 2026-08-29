package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nk0 implements Runnable {
    public final org.telegram.ui.web.z0 A;
    public final nh.d f40827a;
    public final nh.d f40828b;
    public final TLRPC.TL_messages_requestUrlAuth f40829c;
    public final String[] d;
    public final org.telegram.ui.Cells.q8 f40830e;
    public final boolean[] f40831f;
    public final int[] h;
    public final boolean[] f40832n;
    public final org.telegram.ui.ActionBar.f3 f40833r;
    public final String f40834s;
    public final org.telegram.ui.ActionBar.c6 v;
    public final boolean f40835w;
    public final String f40836x;
    public final TLRPC.TL_urlAuthResultRequest f40837y;

    public nk0(nh.d dVar, nh.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.q8 q8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.f3 f3Var, String str, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.z0 z0Var) {
        this.f40827a = dVar;
        this.f40828b = dVar2;
        this.f40829c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.f40830e = q8Var;
        this.f40831f = zArr;
        this.h = iArr;
        this.f40832n = zArr2;
        this.f40833r = f3Var;
        this.f40834s = str;
        this.v = c6Var;
        this.f40835w = z10;
        this.f40836x = str2;
        this.f40837y = tL_urlAuthResultRequest;
        this.A = z0Var;
    }

    @Override
    public final void run() {
        nh.d dVar = this.f40827a;
        if (dVar.J || this.f40828b.J) {
            return;
        }
        boolean z10 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f40829c;
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
        org.telegram.ui.Cells.q8 q8Var = this.f40830e;
        tL_messages_acceptUrlAuth.write_allowed = (q8Var == null || !q8Var.f25083e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f40831f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f40832n;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f40833r;
        final String str2 = this.f40834s;
        final org.telegram.ui.ActionBar.c6 c6Var = this.v;
        final boolean z11 = this.f40835w;
        final String str3 = this.f40836x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f40837y;
        final org.telegram.ui.web.z0 z0Var = this.A;
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
                        org.telegram.ui.Components.tc a2 = pk0.a();
                        int i10 = R.raw.error;
                        String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                        } else {
                            replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var));
                        }
                        a2.M(string, replaceSingleLinkBold, i10).j();
                        return;
                    }
                    pk0.a().d0(tL_error, false);
                    return;
                }
                pk0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, z0Var);
            }
        });
    }
}
