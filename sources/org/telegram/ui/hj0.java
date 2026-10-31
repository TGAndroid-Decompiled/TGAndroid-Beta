package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class hj0 implements Runnable {
    public final org.telegram.ui.ActionBar.p6 D;
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.z0 G;
    public final vh.d f37972a;
    public final vh.d f37973b;
    public final TLRPC.TL_urlAuthResultRequest f37974c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f37975f;
    public final org.telegram.ui.Cells.t8 h;
    public final boolean[] f37976n;
    public final boolean[] f37977r;
    public final int[] f37978s;
    public final boolean[] f37979w;
    public final org.telegram.ui.ActionBar.z2 f37980x;
    public final String f37981y;

    public hj0(vh.d dVar, vh.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.t8 t8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.z2 z2Var, String str, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str2, org.telegram.ui.web.z0 z0Var) {
        this.f37972a = dVar;
        this.f37973b = dVar2;
        this.f37974c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f37975f = strArr;
        this.h = t8Var;
        this.f37976n = zArr;
        this.f37977r = zArr2;
        this.f37978s = iArr;
        this.f37979w = zArr3;
        this.f37980x = z2Var;
        this.f37981y = str;
        this.D = p6Var;
        this.E = z10;
        this.F = str2;
        this.G = z0Var;
    }

    @Override
    public final void run() {
        final vh.d dVar = this.f37972a;
        if (!dVar.Q && !this.f37973b.Q) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f37974c;
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
                String str = this.f37975f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.t8 t8Var = this.h;
                if (t8Var == null || !t8Var.e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f37976n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f37977r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f37978s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                a3.b bVar = new a3.b(1);
                final boolean[] zArr = this.f37979w;
                final org.telegram.ui.ActionBar.z2 z2Var = this.f37980x;
                final String str2 = this.f37981y;
                final org.telegram.ui.ActionBar.p6 p6Var = this.D;
                final boolean z12 = this.E;
                final String str3 = this.F;
                final org.telegram.ui.web.z0 z0Var = this.G;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.j20() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        CharSequence O2;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        vh.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        z2Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.cc a2 = jj0.a();
                                String L0 = org.telegram.messenger.cd.L0(2131753128, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    O2 = org.telegram.messenger.cd.L0(2131753129, null);
                                } else {
                                    O2 = org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.cd.a0(null, null, 2131753130, str4));
                                }
                                a2.I(2131624011, L0, O2).j();
                                return;
                            }
                            jj0.a().f0(tL_error, false);
                            return;
                        }
                        jj0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, z0Var);
                    }
                });
            }
        }
    }
}
