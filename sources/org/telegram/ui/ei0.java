package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class ei0 implements Runnable {
    public final org.telegram.ui.ActionBar.h6 E;
    public final boolean F;
    public final String G;
    public final org.telegram.ui.web.v0 H;
    public final hi.e f47306a;
    public final hi.e f47307b;
    public final TLRPC.TL_urlAuthResultRequest f47308c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth f47309e;
    public final String[] f47310f;
    public final org.telegram.ui.Cells.s8 h;
    public final boolean[] f47311n;
    public final boolean[] f47312r;
    public final int[] f47313s;
    public final boolean[] f47314w;
    public final org.telegram.ui.ActionBar.w2 f47315x;
    public final String f47316y;

    public ei0(hi.e eVar, hi.e eVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.s8 s8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.w2 w2Var, String str, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str2, org.telegram.ui.web.v0 v0Var) {
        this.f47306a = eVar;
        this.f47307b = eVar2;
        this.f47308c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.f47309e = tL_messages_requestUrlAuth;
        this.f47310f = strArr;
        this.h = s8Var;
        this.f47311n = zArr;
        this.f47312r = zArr2;
        this.f47313s = iArr;
        this.f47314w = zArr3;
        this.f47315x = w2Var;
        this.f47316y = str;
        this.E = h6Var;
        this.F = z10;
        this.G = str2;
        this.H = v0Var;
    }

    @Override
    public final void run() {
        final hi.e eVar = this.f47306a;
        if (!eVar.R && !this.f47307b.R) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f47308c;
            boolean z10 = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z10 || inputtonconnectoauthsessionArr[0] != null) {
                boolean z11 = true;
                eVar.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f47309e;
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
                String str = this.f47310f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.s8 s8Var = this.h;
                if (s8Var == null || !s8Var.f31814e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f47311n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f47312r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f47313s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                d3.b bVar = new d3.b(1);
                final boolean[] zArr = this.f47314w;
                final org.telegram.ui.ActionBar.w2 w2Var = this.f47315x;
                final String str2 = this.f47316y;
                final org.telegram.ui.ActionBar.h6 h6Var = this.E;
                final boolean z12 = this.F;
                final String str3 = this.G;
                final org.telegram.ui.web.v0 v0Var = this.H;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.r10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        CharSequence P2;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        hi.e.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        w2Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.lc a10 = gi0.a();
                                String N0 = org.telegram.messenger.hd.N0(2131753125, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    P2 = org.telegram.messenger.hd.N0(2131753126, null);
                                } else {
                                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), org.telegram.messenger.hd.a0(null, null, 2131753127, str4));
                                }
                                a10.I(2131624012, N0, P2).j();
                                return;
                            }
                            gi0.a().g0(tL_error, false);
                            return;
                        }
                        gi0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, v0Var);
                    }
                });
            }
        }
    }
}
