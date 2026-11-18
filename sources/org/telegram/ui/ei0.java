package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class ei0 implements Runnable {
    public final org.telegram.ui.ActionBar.i6 E;
    public final boolean F;
    public final String G;
    public final org.telegram.ui.web.v0 H;
    public final hi.d f47277a;
    public final hi.d f47278b;
    public final TLRPC.TL_urlAuthResultRequest f47279c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth f47280e;
    public final String[] f47281f;
    public final org.telegram.ui.Cells.r8 h;
    public final boolean[] f47282n;
    public final boolean[] f47283r;
    public final int[] f47284s;
    public final boolean[] f47285w;
    public final org.telegram.ui.ActionBar.x2 f47286x;
    public final String f47287y;

    public ei0(hi.d dVar, hi.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.r8 r8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.x2 x2Var, String str, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, String str2, org.telegram.ui.web.v0 v0Var) {
        this.f47277a = dVar;
        this.f47278b = dVar2;
        this.f47279c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.f47280e = tL_messages_requestUrlAuth;
        this.f47281f = strArr;
        this.h = r8Var;
        this.f47282n = zArr;
        this.f47283r = zArr2;
        this.f47284s = iArr;
        this.f47285w = zArr3;
        this.f47286x = x2Var;
        this.f47287y = str;
        this.E = i6Var;
        this.F = z10;
        this.G = str2;
        this.H = v0Var;
    }

    @Override
    public final void run() {
        final hi.d dVar = this.f47277a;
        if (!dVar.R && !this.f47278b.R) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f47279c;
            boolean z10 = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z10 || inputtonconnectoauthsessionArr[0] != null) {
                boolean z11 = true;
                dVar.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f47280e;
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
                String str = this.f47281f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.r8 r8Var = this.h;
                if (r8Var == null || !r8Var.f31730e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f47282n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f47283r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f47284s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                d3.b bVar = new d3.b(1);
                final boolean[] zArr = this.f47285w;
                final org.telegram.ui.ActionBar.x2 x2Var = this.f47286x;
                final String str2 = this.f47287y;
                final org.telegram.ui.ActionBar.i6 i6Var = this.E;
                final boolean z12 = this.F;
                final String str3 = this.G;
                final org.telegram.ui.web.v0 v0Var = this.H;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.q10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        CharSequence P2;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        hi.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        x2Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.lc a10 = gi0.a();
                                String M0 = org.telegram.messenger.gd.M0(2131753126, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    P2 = org.telegram.messenger.gd.M0(2131753127, null);
                                } else {
                                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), org.telegram.messenger.gd.a0(null, null, 2131753128, str4));
                                }
                                a10.I(2131624012, M0, P2).j();
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
