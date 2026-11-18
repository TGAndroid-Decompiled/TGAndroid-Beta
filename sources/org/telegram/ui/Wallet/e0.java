package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.m60;
import org.telegram.ui.p51;
import org.telegram.ui.u60;
import org.telegram.ui.u80;
public final class e0 implements q10 {
    public final int f44097a;
    public final Object f44098b;
    public final Object f44099c;

    public e0(int i7, Object obj, Object obj2) {
        this.f44097a = i7;
        this.f44098b = obj;
        this.f44099c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Object obj3 = null;
        int i7 = 0;
        switch (this.f44097a) {
            case 0:
                u0 u0Var = (u0) this.f44098b;
                p51 p51Var = (p51) this.f44099c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    u0.n("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
                    String str = tL_error.text;
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    p51Var.a(str);
                    return;
                }
                u0.P("enable backup: server accepted request");
                u0Var.w0(walletState);
                p51Var.a(null);
                return;
            case 1:
                q10 q10Var = (q10) this.f44099c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (!((g0) this.f44098b).f44238a) {
                    q10Var.a(wallettransaction, str2);
                    return;
                }
                return;
            case 2:
                String str3 = (String) this.f44098b;
                ai.y1 y1Var = (ai.y1) this.f44099c;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse != null && apiresponse.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject = optJSONArray.getJSONObject(0);
                            if (str3.equals(jSONObject.optString("domain"))) {
                                String optString = jSONObject.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    obj3 = optString;
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                y1Var.a(obj3);
                return;
            case 3:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f44098b;
                u60 u60Var = (u60) this.f44099c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str4 = (String) obj2;
                if (str4 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                u60Var.a(str4);
                return;
            case 4:
                ((r0) this.f44098b).close();
                ((m60) this.f44099c).a((h2) obj, (String) obj2);
                return;
            case 5:
                ((r0) this.f44098b).close();
                org.telegram.messenger.g0.g3(new p((Object) ((e0) this.f44099c), (Object) ((TL_wallet.inputTonConnectOauthSession) obj), (String) obj2, 3));
                return;
            case 6:
                d9.g0((d9) this.f44098b, (x10) this.f44099c, (r0) obj, (String) obj2);
                return;
            case 7:
                na naVar = (na) this.f44098b;
                o oVar = (o) this.f44099c;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    naVar.f44663a0.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                oVar.a(obj3);
                return;
            case 8:
                sh.p pVar = (sh.p) this.f44098b;
                String str5 = (String) this.f44099c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = pVar.f57475a;
                if (webpagepreview != null) {
                    mp.u1(i10).f4(webpagepreview.users, false);
                    mp.u1(i10).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                pVar.f57476b.put(str5, obj3);
                ArrayList arrayList = (ArrayList) pVar.f57477c.remove(str5);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj4 = arrayList.get(i7);
                        i7++;
                        ((q10) obj4).a(obj3, tL_error2);
                    }
                    return;
                }
                return;
            default:
                wg.a0 a0Var = (wg.a0) this.f44098b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.f44099c;
                Boolean bool = (Boolean) obj;
                String str6 = (String) obj2;
                a0Var.f59707m2.f61200a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    u80 u80Var = LaunchActivity.H1.f43108w0;
                    if (T != null) {
                        if (bool.booleanValue()) {
                            a0Var.dismiss();
                            bn ua2 = bn.ua(-a0Var.X1.f28403id);
                            T.presentFragment(ua2);
                            T.whenFullyVisible(new wg.r(1, ua2, tL_starsGiveawayOption));
                            if (u80Var != null) {
                                u80Var.c(true);
                                return;
                            }
                            return;
                        } else if (str6 != null) {
                            a0Var.dismiss();
                            lc.b0(T).Q(2131624012, 36, gd.a0(null, null, 2131743641, str6)).j();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
