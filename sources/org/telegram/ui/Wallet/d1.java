package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.l90;
public final class d1 implements v10 {
    public final int f42280a;
    public final Object f42281b;
    public final Object f42282c;
    public final Object d;
    public final Object f42283e;
    public final Object f42284f;
    public final Object f42285g;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f42280a = i7;
        this.f42281b = obj;
        this.d = obj2;
        this.f42282c = obj3;
        this.f42283e = obj4;
        this.f42284f = obj5;
        this.f42285g = obj6;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f42280a) {
            case 0:
                int i7 = 0;
                d2 d2Var = (d2) this.f42281b;
                l90 l90Var = (l90) this.d;
                String str = (String) this.f42282c;
                String str2 = (String) this.f42283e;
                String str3 = (String) this.f42284f;
                String str4 = (String) this.f42285g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = d2Var.d;
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.f27222id == tonconnectsession2.f27222id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            d2Var.p(tonconnectsession);
                            l90Var.a(new y1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    d2Var.p(tonconnectsession);
                    l90Var.a(new y1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                l90Var.a(null, d2.z(tL_error, "createSession"));
                return;
            case 1:
                d2 d2Var2 = (d2) this.f42281b;
                s sVar = (s) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f42283e;
                String str5 = (String) this.f42282c;
                byte[] bArr = (byte[]) this.f42284f;
                y1 y1Var = (y1) this.f42285g;
                i0 i0Var = (i0) obj;
                String str6 = (String) obj2;
                d2Var2.getClass();
                if (str6 == null && i0Var != null) {
                    i0 b10 = i0Var.b();
                    Utilities.f21341e.c(new bi.r7(d2Var2, b10, tonconnectsession4, str5, bArr, y1Var, new s(3, b10, sVar), 11));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                sVar.a(str6);
                return;
            case 2:
                d2 d2Var3 = (d2) this.f42281b;
                s sVar2 = (s) this.d;
                i0 i0Var2 = (i0) this.f42283e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f42284f;
                String str7 = (String) this.f42282c;
                byte[] bArr2 = (byte[]) this.f42285g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.f21341e.c(new bi.r7(d2Var3, i0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, sVar2, 12));
                    return;
                } else {
                    sVar2.a(d2.z(tL_error2, "getNextEventId"));
                    return;
                }
            case 3:
                d2 d2Var4 = (d2) this.f42281b;
                bi.p5 p5Var = (bi.p5) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f42283e;
                String str8 = (String) this.f42282c;
                byte[] bArr3 = (byte[]) this.f42284f;
                JSONArray jSONArray = (JSONArray) this.f42285g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = d2Var4.f42287b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.f27222id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) && !tonconnectsession6.closed && !tonconnectsession6.closing && tonconnectsession6.nonce != null && TextUtils.equals(str8, l0Var.t()) && Arrays.equals(bArr3, l0Var.y())) {
                        l0Var.z(new c1(d2Var4, p5Var, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        p5Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                p5Var.a(null, d2.z(tL_error3, "createSession"));
                return;
            default:
                s2 s2Var = (s2) this.f42281b;
                int[] iArr = (int[]) this.d;
                l0 l0Var2 = (l0) this.f42282c;
                TextView textView = (TextView) this.f42283e;
                c2 c2Var = (c2) this.f42284f;
                h7 h7Var = (h7) this.f42285g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!s2Var.f43148e && !s2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = l0.n(wallettransaction.fee, true);
                        CharSequence m10 = l0Var2.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = id.V(null, null, 2131743120, n10);
                        } else {
                            V = id.V(null, null, 2131743119, n10, m10);
                        }
                        textView.setText(V);
                    } else if (l0Var2.v() < c2Var.f42211c) {
                        iArr[0] = 2;
                        textView.setText(id.M0(2131743066, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(id.M0(2131742986, null));
                        if (str9 != null) {
                            d2.m("widget preview", str9);
                        }
                    }
                    h7Var.run();
                    return;
                }
                return;
        }
    }

    public d1(d2 d2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i7) {
        this.f42280a = i7;
        this.f42281b = d2Var;
        this.d = obj;
        this.f42283e = tLObject;
        this.f42282c = str;
        this.f42284f = bArr;
        this.f42285g = obj2;
    }

    public d1(d2 d2Var, s sVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f42280a = 2;
        this.f42281b = d2Var;
        this.d = sVar;
        this.f42283e = i0Var;
        this.f42284f = tonconnectsession;
        this.f42282c = str;
        this.f42285g = bArr;
    }
}
