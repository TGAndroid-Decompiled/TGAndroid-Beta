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
public final class al0 implements Runnable {
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.a1 G;
    public final fi.d f37819a;
    public final fi.d f37820b;
    public final TLRPC.TL_urlAuthResultRequest f37821c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f37822f;
    public final org.telegram.ui.Cells.a9 h;
    public final boolean[] f37823n;
    public final boolean[] f37824r;
    public final int[] f37825s;
    public final boolean[] v;
    public final org.telegram.ui.ActionBar.k3 f37826w;
    public final String f37827x;
    public final org.telegram.ui.ActionBar.u6 f37828y;

    public al0(fi.d dVar, fi.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.a9 a9Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.k3 k3Var, String str, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, String str2, org.telegram.ui.web.a1 a1Var) {
        this.f37819a = dVar;
        this.f37820b = dVar2;
        this.f37821c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f37822f = strArr;
        this.h = a9Var;
        this.f37823n = zArr;
        this.f37824r = zArr2;
        this.f37825s = iArr;
        this.v = zArr3;
        this.f37826w = k3Var;
        this.f37827x = str;
        this.f37828y = u6Var;
        this.E = z10;
        this.F = str2;
        this.G = a1Var;
    }

    @Override
    public final void run() {
        final fi.d dVar = this.f37819a;
        if (!dVar.Q && !this.f37820b.Q) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f37821c;
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
                String str = this.f37822f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.a9 a9Var = this.h;
                if (a9Var == null || !a9Var.e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f37823n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f37824r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f37825s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                ?? obj = new Object();
                final boolean[] zArr = this.v;
                final org.telegram.ui.ActionBar.k3 k3Var = this.f37826w;
                final String str2 = this.f37827x;
                final org.telegram.ui.ActionBar.u6 u6Var = this.f37828y;
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
                                org.telegram.ui.Components.wc a2 = dl0.a();
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
                            dl0.a().g0(tL_error, false);
                            return;
                        }
                        dl0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, a1Var);
                    }
                });
            }
        }
    }
}
