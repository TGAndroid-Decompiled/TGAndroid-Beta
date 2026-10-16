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
public final class nl0 implements Runnable {
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.c1 G;
    public final di.d f38414a;
    public final di.d f38415b;
    public final TLRPC.TL_urlAuthResultRequest f38416c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f38417f;
    public final org.telegram.ui.Cells.w8 h;
    public final boolean[] f38418n;
    public final boolean[] f38419r;
    public final int[] f38420s;
    public final boolean[] v;
    public final org.telegram.ui.ActionBar.e3 f38421w;
    public final String f38422x;
    public final org.telegram.ui.ActionBar.c6 f38423y;

    public nl0(di.d dVar, di.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.w8 w8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.e3 e3Var, String str, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str2, org.telegram.ui.web.c1 c1Var) {
        this.f38414a = dVar;
        this.f38415b = dVar2;
        this.f38416c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f38417f = strArr;
        this.h = w8Var;
        this.f38418n = zArr;
        this.f38419r = zArr2;
        this.f38420s = iArr;
        this.v = zArr3;
        this.f38421w = e3Var;
        this.f38422x = str;
        this.f38423y = c6Var;
        this.E = z10;
        this.F = str2;
        this.G = c1Var;
    }

    @Override
    public final void run() {
        final di.d dVar = this.f38414a;
        if (!dVar.N && !this.f38415b.N) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f38416c;
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
                String str = this.f38417f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.w8 w8Var = this.h;
                if (w8Var == null || !w8Var.e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f38418n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f38419r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f38420s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                ?? obj = new Object();
                final boolean[] zArr = this.v;
                final org.telegram.ui.ActionBar.e3 e3Var = this.f38421w;
                final String str2 = this.f38422x;
                final org.telegram.ui.ActionBar.c6 c6Var = this.f38423y;
                final boolean z12 = this.E;
                final String str3 = this.F;
                final org.telegram.ui.web.c1 c1Var = this.G;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        CharSequence replaceSingleLinkBold;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        di.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        e3Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.zc a2 = ql0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                } else {
                                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var));
                                }
                                a2.M(string, replaceSingleLinkBold, i10).j();
                                return;
                            }
                            ql0.a().f0(tL_error, false);
                            return;
                        }
                        ql0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, c1Var);
                    }
                });
            }
        }
    }
}
