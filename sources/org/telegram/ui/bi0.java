package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class bi0 implements Runnable {
    public final org.telegram.ui.ActionBar.g6 D;
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.x0 G;
    public final fi.d f44044a;
    public final fi.d f44045b;
    public final TLRPC.TL_urlAuthResultRequest f44046c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth f44047e;
    public final String[] f44048f;
    public final org.telegram.ui.Cells.r8 h;
    public final boolean[] f44049n;
    public final boolean[] f44050r;
    public final int[] f44051s;
    public final boolean[] f44052w;
    public final org.telegram.ui.ActionBar.v2 f44053x;
    public final String f44054y;

    public bi0(fi.d dVar, fi.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.r8 r8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.v2 v2Var, String str, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, String str2, org.telegram.ui.web.x0 x0Var) {
        this.f44044a = dVar;
        this.f44045b = dVar2;
        this.f44046c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.f44047e = tL_messages_requestUrlAuth;
        this.f44048f = strArr;
        this.h = r8Var;
        this.f44049n = zArr;
        this.f44050r = zArr2;
        this.f44051s = iArr;
        this.f44052w = zArr3;
        this.f44053x = v2Var;
        this.f44054y = str;
        this.D = g6Var;
        this.E = z9;
        this.F = str2;
        this.G = x0Var;
    }

    @Override
    public final void run() {
        final fi.d dVar = this.f44044a;
        if (!dVar.Q && !this.f44045b.Q) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f44046c;
            boolean z9 = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z9 || inputtonconnectoauthsessionArr[0] != null) {
                boolean z10 = true;
                dVar.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f44047e;
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
                String str = this.f44048f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.r8 r8Var = this.h;
                if (r8Var == null || !r8Var.f30214e.h) {
                    z10 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z10;
                tL_messages_acceptUrlAuth.share_phone_number = this.f44049n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f44050r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f44051s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                d3.b bVar = new d3.b(1);
                final boolean[] zArr = this.f44052w;
                final org.telegram.ui.ActionBar.v2 v2Var = this.f44053x;
                final String str2 = this.f44054y;
                final org.telegram.ui.ActionBar.g6 g6Var = this.D;
                final boolean z11 = this.E;
                final String str3 = this.F;
                final org.telegram.ui.web.x0 x0Var = this.G;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        CharSequence P2;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        fi.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        v2Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.hc a10 = di0.a();
                                String M0 = org.telegram.messenger.id.M0(2131753128, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    P2 = org.telegram.messenger.id.M0(2131753129, null);
                                } else {
                                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.uj, g6Var), org.telegram.messenger.id.a0(null, null, 2131753130, str4));
                                }
                                a10.I(2131624011, M0, P2).j();
                                return;
                            }
                            di0.a().f0(tL_error, false);
                            return;
                        }
                        di0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, x0Var);
                    }
                });
            }
        }
    }
}
