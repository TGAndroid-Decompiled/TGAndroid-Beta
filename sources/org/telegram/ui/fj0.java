package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class fj0 implements Runnable {
    public final org.telegram.ui.ActionBar.p6 D;
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.z0 G;
    public final vh.d f37158a;
    public final vh.d f37159b;
    public final TLRPC.TL_urlAuthResultRequest f37160c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f37161f;
    public final org.telegram.ui.Cells.t8 h;
    public final boolean[] f37162n;
    public final boolean[] f37163r;
    public final int[] f37164s;
    public final boolean[] f37165w;
    public final org.telegram.ui.ActionBar.z2 f37166x;
    public final String f37167y;

    public fj0(vh.d dVar, vh.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.t8 t8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.z2 z2Var, String str, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str2, org.telegram.ui.web.z0 z0Var) {
        this.f37158a = dVar;
        this.f37159b = dVar2;
        this.f37160c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f37161f = strArr;
        this.h = t8Var;
        this.f37162n = zArr;
        this.f37163r = zArr2;
        this.f37164s = iArr;
        this.f37165w = zArr3;
        this.f37166x = z2Var;
        this.f37167y = str;
        this.D = p6Var;
        this.E = z10;
        this.F = str2;
        this.G = z0Var;
    }

    @Override
    public final void run() {
        final vh.d dVar = this.f37158a;
        if (!dVar.Q && !this.f37159b.Q) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f37160c;
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
                String str = this.f37161f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.t8 t8Var = this.h;
                if (t8Var == null || !t8Var.e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f37162n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f37163r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f37164s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                a3.b bVar = new a3.b(1);
                final boolean[] zArr = this.f37165w;
                final org.telegram.ui.ActionBar.z2 z2Var = this.f37166x;
                final String str2 = this.f37167y;
                final org.telegram.ui.ActionBar.p6 p6Var = this.D;
                final boolean z12 = this.E;
                final String str3 = this.F;
                final org.telegram.ui.web.z0 z0Var = this.G;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.k20() {
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
                                org.telegram.ui.Components.cc a2 = hj0.a();
                                String L0 = org.telegram.messenger.dd.L0(2131753128, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    O2 = org.telegram.messenger.dd.L0(2131753129, null);
                                } else {
                                    O2 = org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.dd.a0(null, null, 2131753130, str4));
                                }
                                a2.I(2131624011, L0, O2).j();
                                return;
                            }
                            hj0.a().f0(tL_error, false);
                            return;
                        }
                        hj0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, z0Var);
                    }
                });
            }
        }
    }
}
