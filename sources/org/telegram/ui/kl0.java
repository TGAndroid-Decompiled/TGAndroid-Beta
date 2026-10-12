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
public final class kl0 implements Runnable {
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.b1 G;
    public final ci.d f39536a;
    public final ci.d f39537b;
    public final TLRPC.TL_urlAuthResultRequest f39538c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth f39539e;
    public final String[] f39540f;
    public final org.telegram.ui.Cells.w8 h;
    public final boolean[] f39541n;
    public final boolean[] f39542r;
    public final int[] f39543s;
    public final boolean[] v;
    public final org.telegram.ui.ActionBar.e3 f39544w;
    public final String f39545x;
    public final org.telegram.ui.ActionBar.c6 f39546y;

    public kl0(ci.d dVar, ci.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.w8 w8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.e3 e3Var, String str, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str2, org.telegram.ui.web.b1 b1Var) {
        this.f39536a = dVar;
        this.f39537b = dVar2;
        this.f39538c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.f39539e = tL_messages_requestUrlAuth;
        this.f39540f = strArr;
        this.h = w8Var;
        this.f39541n = zArr;
        this.f39542r = zArr2;
        this.f39543s = iArr;
        this.v = zArr3;
        this.f39544w = e3Var;
        this.f39545x = str;
        this.f39546y = c6Var;
        this.E = z10;
        this.F = str2;
        this.G = b1Var;
    }

    @Override
    public final void run() {
        final ci.d dVar = this.f39536a;
        if (!dVar.N && !this.f39537b.N) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f39538c;
            boolean z10 = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z10 || inputtonconnectoauthsessionArr[0] != null) {
                boolean z11 = true;
                dVar.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f39539e;
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
                String str = this.f39540f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.w8 w8Var = this.h;
                if (w8Var == null || !w8Var.f23452e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f39541n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f39542r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f39543s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                ?? obj = new Object();
                final boolean[] zArr = this.v;
                final org.telegram.ui.ActionBar.e3 e3Var = this.f39544w;
                final String str2 = this.f39545x;
                final org.telegram.ui.ActionBar.c6 c6Var = this.f39546y;
                final boolean z12 = this.E;
                final String str3 = this.F;
                final org.telegram.ui.web.b1 b1Var = this.G;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        CharSequence replaceSingleLinkBold;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        ci.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        e3Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.zc a2 = nl0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                } else {
                                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, c6Var));
                                }
                                a2.M(string, replaceSingleLinkBold, i10).j();
                                return;
                            }
                            nl0.a().f0(tL_error, false);
                            return;
                        }
                        nl0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, b1Var);
                    }
                });
            }
        }
    }
}
