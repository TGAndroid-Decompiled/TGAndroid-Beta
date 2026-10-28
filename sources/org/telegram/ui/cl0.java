package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class cl0 implements Runnable {
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.a1 G;
    public final fi.d f38379a;
    public final fi.d f38380b;
    public final TLRPC.TL_urlAuthResultRequest f38381c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f38382f;
    public final org.telegram.ui.Cells.a9 h;
    public final boolean[] f38383n;
    public final boolean[] f38384r;
    public final int[] f38385s;
    public final boolean[] v;
    public final org.telegram.ui.ActionBar.k3 f38386w;
    public final String f38387x;
    public final org.telegram.ui.ActionBar.u6 f38388y;

    public cl0(fi.d dVar, fi.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.a9 a9Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.k3 k3Var, String str, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, String str2, org.telegram.ui.web.a1 a1Var) {
        this.f38379a = dVar;
        this.f38380b = dVar2;
        this.f38381c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f38382f = strArr;
        this.h = a9Var;
        this.f38383n = zArr;
        this.f38384r = zArr2;
        this.f38385s = iArr;
        this.v = zArr3;
        this.f38386w = k3Var;
        this.f38387x = str;
        this.f38388y = u6Var;
        this.E = z10;
        this.F = str2;
        this.G = a1Var;
    }

    @Override
    public final void run() {
        final fi.d dVar = this.f38379a;
        if (!dVar.Q && !this.f38380b.Q) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f38381c;
            boolean z10 = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z10 || inputtonconnectoauthsessionArr[0] != null) {
                boolean z11 = true;
                dVar.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.e;
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
                String str = this.f38382f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.a9 a9Var = this.h;
                if (a9Var == null || !a9Var.e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f38383n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f38384r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f38385s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                ?? obj = new Object();
                final boolean[] zArr = this.v;
                final org.telegram.ui.ActionBar.k3 k3Var = this.f38386w;
                final String str2 = this.f38387x;
                final org.telegram.ui.ActionBar.u6 u6Var = this.f38388y;
                final boolean z12 = this.E;
                final String str3 = this.F;
                final org.telegram.ui.web.a1 a1Var = this.G;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        CharSequence replaceSingleLinkBold;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        fi.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        k3Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.wc a2 = fl0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                } else {
                                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var));
                                }
                                a2.M(string, replaceSingleLinkBold, i10).j();
                                return;
                            }
                            fl0.a().g0(tL_error, false);
                            return;
                        }
                        fl0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, a1Var);
                    }
                });
            }
        }
    }
}
