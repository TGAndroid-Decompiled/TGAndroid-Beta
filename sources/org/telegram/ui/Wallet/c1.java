package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;
import org.telegram.ui.f90;
public final class c1 implements n10 {
    public final int f42371a;
    public final Object f42372b;
    public final Object f42373c;
    public final Object d;
    public final Object f42374e;
    public final Object f42375f;
    public final Object f42376g;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.f42371a = i3;
        this.f42372b = obj;
        this.d = obj2;
        this.f42373c = obj3;
        this.f42374e = obj4;
        this.f42375f = obj5;
        this.f42376g = obj6;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f42371a) {
            case 0:
                int i3 = 0;
                c2 c2Var = (c2) this.f42372b;
                f90 f90Var = (f90) this.d;
                String str = (String) this.f42373c;
                String str2 = (String) this.f42374e;
                String str3 = (String) this.f42375f;
                String str4 = (String) this.f42376g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c2Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = c2Var.d;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.f27264id == tonconnectsession2.f27264id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            c2Var.p(tonconnectsession);
                            f90Var.a(new x1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    c2Var.p(tonconnectsession);
                    f90Var.a(new x1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                f90Var.a(null, c2.z(tL_error, "createSession"));
                return;
            case 1:
                c2 c2Var2 = (c2) this.f42372b;
                e51 e51Var = (e51) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f42374e;
                String str5 = (String) this.f42373c;
                byte[] bArr = (byte[]) this.f42375f;
                x1 x1Var = (x1) this.f42376g;
                h0 h0Var = (h0) obj;
                String str6 = (String) obj2;
                c2Var2.getClass();
                if (str6 == null && h0Var != null) {
                    h0 b10 = h0Var.b();
                    Utilities.f21387e.c(new ci.s6(c2Var2, b10, tonconnectsession4, str5, bArr, x1Var, new e51(6, b10, e51Var), 11));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                e51Var.a(str6);
                return;
            case 2:
                c2 c2Var3 = (c2) this.f42372b;
                e51 e51Var2 = (e51) this.d;
                h0 h0Var2 = (h0) this.f42374e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f42375f;
                String str7 = (String) this.f42373c;
                byte[] bArr2 = (byte[]) this.f42376g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.f21387e.c(new ci.s6(c2Var3, h0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, e51Var2, 12));
                    return;
                } else {
                    e51Var2.a(c2.z(tL_error2, "getNextEventId"));
                    return;
                }
            case 3:
                c2 c2Var4 = (c2) this.f42372b;
                s1 s1Var = (s1) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f42374e;
                String str8 = (String) this.f42373c;
                byte[] bArr3 = (byte[]) this.f42375f;
                JSONArray jSONArray = (JSONArray) this.f42376g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = c2Var4.f42378b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.f27264id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) && !tonconnectsession6.closed && !tonconnectsession6.closing && tonconnectsession6.nonce != null && TextUtils.equals(str8, k0Var.t()) && Arrays.equals(bArr3, k0Var.y())) {
                        k0Var.z(new b1(c2Var4, s1Var, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        s1Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                s1Var.a(null, c2.z(tL_error3, "createSession"));
                return;
            default:
                s2 s2Var = (s2) this.f42372b;
                int[] iArr = (int[]) this.d;
                k0 k0Var2 = (k0) this.f42373c;
                TextView textView = (TextView) this.f42374e;
                b2 b2Var = (b2) this.f42375f;
                e7 e7Var = (e7) this.f42376g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!s2Var.f43147e && !s2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n4 = k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var2.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = bd.V(null, null, 2131743130, n4);
                        } else {
                            V = bd.V(null, null, 2131743129, n4, m10);
                        }
                        textView.setText(V);
                    } else if (k0Var2.v() < b2Var.f42224c) {
                        iArr[0] = 2;
                        textView.setText(bd.M0(2131743076, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(bd.M0(2131742996, null));
                        if (str9 != null) {
                            c2.m("widget preview", str9);
                        }
                    }
                    e7Var.run();
                    return;
                }
                return;
        }
    }

    public c1(c2 c2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i3) {
        this.f42371a = i3;
        this.f42372b = c2Var;
        this.d = obj;
        this.f42374e = tLObject;
        this.f42373c = str;
        this.f42375f = bArr;
        this.f42376g = obj2;
    }

    public c1(c2 c2Var, e51 e51Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f42371a = 2;
        this.f42372b = c2Var;
        this.d = e51Var;
        this.f42374e = h0Var;
        this.f42375f = tonconnectsession;
        this.f42373c = str;
        this.f42376g = bArr;
    }
}
