package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class ju implements View.OnClickListener {
    public final int f37137a = 1;
    public final int f37138b;
    public final Object f37139c;
    public final Object d;
    public final Object e;
    public final Object f37140f;
    public final Object h;
    public final Object f37141n;

    public ju(di.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.e3 e3Var, di.d dVar2, org.telegram.ui.web.c1 c1Var, int i10) {
        this.f37139c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.e = zArr;
        this.f37140f = e3Var;
        this.h = dVar2;
        this.f37141n = c1Var;
        this.f37138b = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37137a;
        JSONObject jSONObject = null;
        int i11 = this.f37138b;
        Object obj = this.f37141n;
        Object obj2 = this.h;
        Object obj3 = this.f37140f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f37139c;
        switch (i10) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) obj6, (org.telegram.ui.Cells.s8) obj5, (org.telegram.ui.Cells.s8[]) obj4, this.f37138b, (org.telegram.ui.Cells.d5[]) obj3, (org.telegram.ui.Cells.w8[]) obj2, (AnimatorSet[]) obj, view);
                return;
            case 1:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj5;
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj3;
                di.d dVar = (di.d) obj2;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                if (!((di.d) obj6).N) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar.N) {
                            dVar.setLoading(true);
                            if (c1Var != null) {
                                boolean z10 = org.telegram.ui.web.c1.P0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                c1Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new bi.f0(16, zArr, e3Var));
                            return;
                        }
                        return;
                    }
                    zArr[0] = true;
                    e3Var.dismiss();
                    return;
                }
                return;
            case 2:
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                wh.n nVar = (wh.n) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.ui.Wallet.o oVar = new org.telegram.ui.Wallet.o(zArr2, j2VarArr, c6Var, nVar, 9);
                    if (wallettransaction.comment_encrypted_preparing) {
                        oVar.run(wallettransaction.comment, null);
                        return;
                    }
                    org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i11);
                    String str2 = wallettransaction.comment;
                    org.telegram.ui.Wallet.k0.E("decrypting transaction comment");
                    v.x(new org.telegram.ui.Wallet.j(v, oVar, str, str2), true, false);
                    return;
                }
                return;
            default:
                di.d dVar2 = (di.d) obj6;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj5;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj4;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                Activity activity = (Activity) obj;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.f37138b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new bi.ia(dVar2, e3VarArr, c6Var2, i12, tL_messages_checkChatInvite, 14));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr3[0] = true;
                        pf.d.q(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new zh.o6(dVar2), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public ju(di.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, Activity activity) {
        this.f37139c = dVar;
        this.d = starsSubscription;
        this.f37138b = i10;
        this.e = e3VarArr;
        this.f37140f = c6Var;
        this.h = zArr;
        this.f37141n = activity;
    }

    public ju(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f37139c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.f37138b = i10;
        this.f37140f = d5VarArr;
        this.h = w8VarArr;
        this.f37141n = animatorSetArr;
    }

    public ju(boolean[] zArr, org.telegram.ui.Wallet.j2[] j2VarArr, org.telegram.ui.ActionBar.c6 c6Var, wh.n nVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.f37139c = zArr;
        this.d = j2VarArr;
        this.e = c6Var;
        this.f37140f = nVar;
        this.h = wallettransaction;
        this.f37138b = i10;
        this.f37141n = str;
    }
}
