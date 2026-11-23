package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a31;
import org.telegram.ui.bn;
import org.telegram.ui.m60;
import org.telegram.ui.t60;
import org.telegram.ui.t80;
public final class f0 implements p10 {
    public final int f44270a;
    public final Object f44271b;
    public final Object f44272c;

    public f0(int i7, Object obj, Object obj2) {
        this.f44270a = i7;
        this.f44271b = obj;
        this.f44272c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Object obj3 = null;
        int i7 = 0;
        switch (this.f44270a) {
            case 0:
                v0 v0Var = (v0) this.f44271b;
                a31 a31Var = (a31) this.f44272c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    v0.n("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
                    String str = tL_error.text;
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a31Var.a(str);
                    return;
                }
                v0.P("enable backup: server accepted request");
                v0Var.w0(walletState);
                a31Var.a(null);
                return;
            case 1:
                p10 p10Var = (p10) this.f44272c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (!((h0) this.f44271b).f44410a) {
                    p10Var.a(wallettransaction, str2);
                    return;
                }
                return;
            case 2:
                String str3 = (String) this.f44271b;
                hi.a4 a4Var = (hi.a4) this.f44272c;
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
                a4Var.a(obj3);
                return;
            case 3:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f44271b;
                t60 t60Var = (t60) this.f44272c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str4 = (String) obj2;
                if (str4 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                t60Var.a(str4);
                return;
            case 4:
                ((s0) this.f44271b).close();
                ((m60) this.f44272c).a((i2) obj, (String) obj2);
                return;
            case 5:
                ((s0) this.f44271b).close();
                org.telegram.messenger.g0.g3(new p((Object) ((f0) this.f44272c), (Object) ((TL_wallet.inputTonConnectOauthSession) obj), (String) obj2, 3));
                return;
            case 6:
                e9.g0((e9) this.f44271b, (w10) this.f44272c, (s0) obj, (String) obj2);
                return;
            case 7:
                oa oaVar = (oa) this.f44271b;
                o oVar = (o) this.f44272c;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    oaVar.f44835a0.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                oVar.a(obj3);
                return;
            case 8:
                sh.o oVar2 = (sh.o) this.f44271b;
                String str5 = (String) this.f44272c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = oVar2.f57594a;
                if (webpagepreview != null) {
                    mp.u1(i10).f4(webpagepreview.users, false);
                    mp.u1(i10).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                oVar2.f57595b.put(str5, obj3);
                ArrayList arrayList = (ArrayList) oVar2.f57596c.remove(str5);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj4 = arrayList.get(i7);
                        i7++;
                        ((p10) obj4).a(obj3, tL_error2);
                    }
                    return;
                }
                return;
            default:
                wg.z zVar = (wg.z) this.f44271b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.f44272c;
                Boolean bool = (Boolean) obj;
                String str6 = (String) obj2;
                zVar.f59980m2.f61329a.setLoading(false);
                if (zVar.getContext() != null) {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    t80 t80Var = LaunchActivity.H1.f43228w0;
                    if (T != null) {
                        if (bool.booleanValue()) {
                            zVar.dismiss();
                            bn ua2 = bn.ua(-zVar.X1.f28492id);
                            T.presentFragment(ua2);
                            T.whenFullyVisible(new v9.b(7, ua2, tL_starsGiveawayOption));
                            if (t80Var != null) {
                                t80Var.c(true);
                                return;
                            }
                            return;
                        } else if (str6 != null) {
                            zVar.dismiss();
                            kc.b0(T).Q(2131624012, 36, gd.a0(null, null, 2131743631, str6)).j();
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
