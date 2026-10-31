package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;
import org.telegram.ui.na0;
public final class e1 implements j20 {
    public final int f34440a;
    public final Object f34441b;
    public final Object f34442c;
    public final Object d;
    public final Object e;
    public final Object f34443f;
    public final Object f34444g;

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f34440a = i10;
        this.f34441b = obj;
        this.d = obj2;
        this.f34442c = obj3;
        this.e = obj4;
        this.f34443f = obj5;
        this.f34444g = obj6;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f34440a) {
            case 0:
                int i10 = 0;
                e2 e2Var = (e2) this.f34441b;
                na0 na0Var = (na0) this.d;
                String str = (String) this.f34442c;
                String str2 = (String) this.e;
                String str3 = (String) this.f34443f;
                String str4 = (String) this.f34444g;
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
                        if (tonconnectsession3.f20055id == tonconnectsession2.f20055id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            e2Var.p(tonconnectsession);
                            na0Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    e2Var.p(tonconnectsession);
                    na0Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                na0Var.a(null, e2.z(tL_error, "createSession"));
                return;
            case 1:
                e2 e2Var2 = (e2) this.f34441b;
                f11 f11Var = (f11) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.e;
                String str5 = (String) this.f34442c;
                byte[] bArr = (byte[]) this.f34443f;
                z1 z1Var = (z1) this.f34444g;
                h0 h0Var = (h0) obj;
                String str6 = (String) obj2;
                e2Var2.getClass();
                if (str6 == null && h0Var != null) {
                    h0 b10 = h0Var.b();
                    Utilities.e.c(new mg.c0(e2Var2, b10, tonconnectsession4, str5, bArr, z1Var, new f11(9, b10, f11Var), 9));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                f11Var.a(str6);
                return;
            case 2:
                e2 e2Var3 = (e2) this.f34441b;
                f11 f11Var2 = (f11) this.d;
                h0 h0Var2 = (h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f34443f;
                String str7 = (String) this.f34442c;
                byte[] bArr2 = (byte[]) this.f34444g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new mg.c0(e2Var3, h0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, f11Var2, 10));
                    return;
                } else {
                    f11Var2.a(e2.z(tL_error2, "getNextEventId"));
                    return;
                }
            case 3:
                e2 e2Var4 = (e2) this.f34441b;
                ih.s sVar = (ih.s) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str8 = (String) this.f34442c;
                byte[] bArr3 = (byte[]) this.f34443f;
                JSONArray jSONArray = (JSONArray) this.f34444g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var4.f34446b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.f20055id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) && !tonconnectsession6.closed && !tonconnectsession6.closing && tonconnectsession6.nonce != null && TextUtils.equals(str8, k0Var.t()) && Arrays.equals(bArr3, k0Var.y())) {
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
                t2 t2Var = (t2) this.f34441b;
                int[] iArr = (int[]) this.d;
                k0 k0Var2 = (k0) this.f34442c;
                TextView textView = (TextView) this.e;
                d2 d2Var = (d2) this.f34443f;
                k7 k7Var = (k7) this.f34444g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!t2Var.e && !t2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var2.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = cd.V(null, null, 2131743146, n10);
                        } else {
                            V = cd.V(null, null, 2131743145, n10, m10);
                        }
                        textView.setText(V);
                    } else if (k0Var2.v() < d2Var.f34374c) {
                        iArr[0] = 2;
                        textView.setText(cd.L0(2131743092, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(cd.L0(2131743012, null));
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
        this.f34440a = i10;
        this.f34441b = e2Var;
        this.d = obj;
        this.e = tLObject;
        this.f34442c = str;
        this.f34443f = bArr;
        this.f34444g = obj2;
    }

    public e1(e2 e2Var, f11 f11Var, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f34440a = 2;
        this.f34441b = e2Var;
        this.d = f11Var;
        this.e = h0Var;
        this.f34443f = tonconnectsession;
        this.f34442c = str;
        this.f34444g = bArr;
    }
}
