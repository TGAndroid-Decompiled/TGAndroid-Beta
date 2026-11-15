package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.j90;
import org.telegram.ui.x21;
public final class d1 implements s10 {
    public final int f43723a;
    public final Object f43724b;
    public final Object f43725c;
    public final Object d;
    public final Object f43726e;
    public final Object f43727f;
    public final Object f43728g;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f43723a = i7;
        this.f43724b = obj;
        this.d = obj2;
        this.f43725c = obj3;
        this.f43726e = obj4;
        this.f43727f = obj5;
        this.f43728g = obj6;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f43723a) {
            case 0:
                int i7 = 0;
                d2 d2Var = (d2) this.f43724b;
                j90 j90Var = (j90) this.d;
                String str = (String) this.f43725c;
                String str2 = (String) this.f43726e;
                String str3 = (String) this.f43727f;
                String str4 = (String) this.f43728g;
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
                        if (tonconnectsession3.f28313id == tonconnectsession2.f28313id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            d2Var.p(tonconnectsession);
                            j90Var.a(new y1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    d2Var.p(tonconnectsession);
                    j90Var.a(new y1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                j90Var.a(null, d2.z(tL_error, "createSession"));
                return;
            case 1:
                d2 d2Var2 = (d2) this.f43724b;
                x21 x21Var = (x21) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f43726e;
                String str5 = (String) this.f43725c;
                byte[] bArr = (byte[]) this.f43727f;
                y1 y1Var = (y1) this.f43728g;
                i0 i0Var = (i0) obj;
                String str6 = (String) obj2;
                d2Var2.getClass();
                if (str6 == null && i0Var != null) {
                    i0 b10 = i0Var.b();
                    Utilities.f22416e.c(new di.j6(d2Var2, b10, tonconnectsession4, str5, bArr, y1Var, new x21(8, b10, x21Var), 11));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                x21Var.a(str6);
                return;
            case 2:
                d2 d2Var3 = (d2) this.f43724b;
                x21 x21Var2 = (x21) this.d;
                i0 i0Var2 = (i0) this.f43726e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f43727f;
                String str7 = (String) this.f43725c;
                byte[] bArr2 = (byte[]) this.f43728g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.f22416e.c(new di.j6(d2Var3, i0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, x21Var2, 12));
                    return;
                } else {
                    x21Var2.a(d2.z(tL_error2, "getNextEventId"));
                    return;
                }
            case 3:
                d2 d2Var4 = (d2) this.f43724b;
                t1 t1Var = (t1) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f43726e;
                String str8 = (String) this.f43725c;
                byte[] bArr3 = (byte[]) this.f43727f;
                JSONArray jSONArray = (JSONArray) this.f43728g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = d2Var4.f43730b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.f28313id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) && !tonconnectsession6.closed && !tonconnectsession6.closing && tonconnectsession6.nonce != null && TextUtils.equals(str8, l0Var.t()) && Arrays.equals(bArr3, l0Var.y())) {
                        l0Var.z(new c1(d2Var4, t1Var, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        t1Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                t1Var.a(null, d2.z(tL_error3, "createSession"));
                return;
            default:
                r2 r2Var = (r2) this.f43724b;
                int[] iArr = (int[]) this.d;
                l0 l0Var2 = (l0) this.f43725c;
                TextView textView = (TextView) this.f43726e;
                c2 c2Var = (c2) this.f43727f;
                g7 g7Var = (g7) this.f43728g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!r2Var.f44432e && !r2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = l0.n(wallettransaction.fee, true);
                        CharSequence m10 = l0Var2.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = hd.V(null, null, 2131743120, n10);
                        } else {
                            V = hd.V(null, null, 2131743119, n10, m10);
                        }
                        textView.setText(V);
                    } else if (l0Var2.v() < c2Var.f43560c) {
                        iArr[0] = 2;
                        textView.setText(hd.M0(2131743066, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(hd.M0(2131742986, null));
                        if (str9 != null) {
                            d2.m("widget preview", str9);
                        }
                    }
                    g7Var.run();
                    return;
                }
                return;
        }
    }

    public d1(d2 d2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i7) {
        this.f43723a = i7;
        this.f43724b = d2Var;
        this.d = obj;
        this.f43726e = tLObject;
        this.f43725c = str;
        this.f43727f = bArr;
        this.f43728g = obj2;
    }

    public d1(d2 d2Var, x21 x21Var, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f43723a = 2;
        this.f43724b = d2Var;
        this.d = x21Var;
        this.f43726e = i0Var;
        this.f43727f = tonconnectsession;
        this.f43725c = str;
        this.f43728g = bArr;
    }
}
