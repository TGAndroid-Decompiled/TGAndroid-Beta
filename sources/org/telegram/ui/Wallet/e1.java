package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.d01;
import org.telegram.ui.ma0;
public final class e1 implements k20 {
    public final int f34445a;
    public final Object f34446b;
    public final Object f34447c;
    public final Object d;
    public final Object e;
    public final Object f34448f;
    public final Object f34449g;

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f34445a = i10;
        this.f34446b = obj;
        this.d = obj2;
        this.f34447c = obj3;
        this.e = obj4;
        this.f34448f = obj5;
        this.f34449g = obj6;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f34445a) {
            case 0:
                int i10 = 0;
                e2 e2Var = (e2) this.f34446b;
                ma0 ma0Var = (ma0) this.d;
                String str = (String) this.f34447c;
                String str2 = (String) this.e;
                String str3 = (String) this.f34448f;
                String str4 = (String) this.f34449g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = e2Var.d;
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.f20056id == tonconnectsession2.f20056id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            e2Var.p(tonconnectsession);
                            ma0Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    e2Var.p(tonconnectsession);
                    ma0Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                ma0Var.a(null, e2.z(tL_error, "createSession"));
                return;
            case 1:
                e2 e2Var2 = (e2) this.f34446b;
                d01 d01Var = (d01) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.e;
                String str5 = (String) this.f34447c;
                byte[] bArr = (byte[]) this.f34448f;
                z1 z1Var = (z1) this.f34449g;
                h0 h0Var = (h0) obj;
                String str6 = (String) obj2;
                e2Var2.getClass();
                if (str6 == null && h0Var != null) {
                    h0 b10 = h0Var.b();
                    Utilities.e.c(new mg.c0(e2Var2, b10, tonconnectsession4, str5, bArr, z1Var, new d01(10, b10, d01Var), 9));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                d01Var.a(str6);
                return;
            case 2:
                e2 e2Var3 = (e2) this.f34446b;
                d01 d01Var2 = (d01) this.d;
                h0 h0Var2 = (h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f34448f;
                String str7 = (String) this.f34447c;
                byte[] bArr2 = (byte[]) this.f34449g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new mg.c0(e2Var3, h0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, d01Var2, 10));
                    return;
                } else {
                    d01Var2.a(e2.z(tL_error2, "getNextEventId"));
                    return;
                }
            case 3:
                e2 e2Var4 = (e2) this.f34446b;
                ih.s sVar = (ih.s) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str8 = (String) this.f34447c;
                byte[] bArr3 = (byte[]) this.f34448f;
                JSONArray jSONArray = (JSONArray) this.f34449g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var4.f34451b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.f20056id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) && !tonconnectsession6.closed && !tonconnectsession6.closing && tonconnectsession6.nonce != null && TextUtils.equals(str8, k0Var.t()) && Arrays.equals(bArr3, k0Var.y())) {
                        k0Var.z(new d1(e2Var4, sVar, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        sVar.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                sVar.a(null, e2.z(tL_error3, "createSession"));
                return;
            default:
                u2 u2Var = (u2) this.f34446b;
                int[] iArr = (int[]) this.d;
                k0 k0Var2 = (k0) this.f34447c;
                TextView textView = (TextView) this.e;
                d2 d2Var = (d2) this.f34448f;
                k7 k7Var = (k7) this.f34449g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!u2Var.e && !u2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var2.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = dd.V(null, null, 2131743146, n10);
                        } else {
                            V = dd.V(null, null, 2131743145, n10, m10);
                        }
                        textView.setText(V);
                    } else if (k0Var2.v() < d2Var.f34375c) {
                        iArr[0] = 2;
                        textView.setText(dd.L0(2131743092, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(dd.L0(2131743012, null));
                        if (str9 != null) {
                            e2.m("widget preview", str9);
                        }
                    }
                    k7Var.run();
                    return;
                }
                return;
        }
    }

    public e1(e2 e2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f34445a = i10;
        this.f34446b = e2Var;
        this.d = obj;
        this.e = tLObject;
        this.f34447c = str;
        this.f34448f = bArr;
        this.f34449g = obj2;
    }

    public e1(e2 e2Var, d01 d01Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f34445a = 2;
        this.f34446b = e2Var;
        this.d = d01Var;
        this.e = h0Var;
        this.f34448f = tonconnectsession;
        this.f34447c = str;
        this.f34449g = bArr;
    }
}
