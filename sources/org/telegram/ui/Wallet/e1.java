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
import org.telegram.ui.i90;
public final class e1 implements v10 {
    public final int f42421a;
    public final Object f42422b;
    public final Object f42423c;
    public final Object d;
    public final Object f42424e;
    public final Object f42425f;
    public final Object f42426g;

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f42421a = i7;
        this.f42422b = obj;
        this.d = obj2;
        this.f42423c = obj3;
        this.f42424e = obj4;
        this.f42425f = obj5;
        this.f42426g = obj6;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f42421a) {
            case 0:
                int i7 = 0;
                e2 e2Var = (e2) this.f42422b;
                i90 i90Var = (i90) this.d;
                String str = (String) this.f42423c;
                String str2 = (String) this.f42424e;
                String str3 = (String) this.f42425f;
                String str4 = (String) this.f42426g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = e2Var.d;
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.f27218id == tonconnectsession2.f27218id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            e2Var.p(tonconnectsession);
                            i90Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    e2Var.p(tonconnectsession);
                    i90Var.a(new z1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                i90Var.a(null, e2.z(tL_error, "createSession"));
                return;
            case 1:
                e2 e2Var2 = (e2) this.f42422b;
                t tVar = (t) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f42424e;
                String str5 = (String) this.f42423c;
                byte[] bArr = (byte[]) this.f42425f;
                z1 z1Var = (z1) this.f42426g;
                j0 j0Var = (j0) obj;
                String str6 = (String) obj2;
                e2Var2.getClass();
                if (str6 == null && j0Var != null) {
                    j0 b10 = j0Var.b();
                    Utilities.f21336e.c(new bi.r7(e2Var2, b10, tonconnectsession4, str5, bArr, z1Var, new t(3, b10, tVar), 11));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                tVar.a(str6);
                return;
            case 2:
                e2 e2Var3 = (e2) this.f42422b;
                t tVar2 = (t) this.d;
                j0 j0Var2 = (j0) this.f42424e;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f42425f;
                String str7 = (String) this.f42423c;
                byte[] bArr2 = (byte[]) this.f42426g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2Var3.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.f21336e.c(new bi.r7(e2Var3, j0Var2, tonconnectsession5, str7, bArr2, tonconnectnexteventid, tVar2, 12));
                    return;
                } else {
                    tVar2.a(e2.z(tL_error2, "getNextEventId"));
                    return;
                }
            case 3:
                e2 e2Var4 = (e2) this.f42422b;
                bi.p5 p5Var = (bi.p5) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f42424e;
                String str8 = (String) this.f42423c;
                byte[] bArr3 = (byte[]) this.f42425f;
                JSONArray jSONArray = (JSONArray) this.f42426g;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m0 m0Var = e2Var4.f42428b;
                if (tL_error3 == null && tonconnectsession6 != null) {
                    if (tonconnectsession6.f27218id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession6.dapp_client_id) && !tonconnectsession6.closed && !tonconnectsession6.closing && tonconnectsession6.nonce != null && TextUtils.equals(str8, m0Var.t()) && Arrays.equals(bArr3, m0Var.y())) {
                        m0Var.z(new d1(e2Var4, p5Var, tonconnectsession6, str8, bArr3, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        p5Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                p5Var.a(null, e2.z(tL_error3, "createSession"));
                return;
            default:
                t2 t2Var = (t2) this.f42422b;
                int[] iArr = (int[]) this.d;
                m0 m0Var2 = (m0) this.f42423c;
                TextView textView = (TextView) this.f42424e;
                d2 d2Var = (d2) this.f42425f;
                f7 f7Var = (f7) this.f42426g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!t2Var.f43166e && !t2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder n10 = m0.n(wallettransaction.fee, true);
                        CharSequence m10 = m0Var2.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = id.V(null, null, 2131743123, n10);
                        } else {
                            V = id.V(null, null, 2131743122, n10, m10);
                        }
                        textView.setText(V);
                    } else if (m0Var2.v() < d2Var.f42386c) {
                        iArr[0] = 2;
                        textView.setText(id.M0(2131743069, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(id.M0(2131742989, null));
                        if (str9 != null) {
                            e2.m("widget preview", str9);
                        }
                    }
                    f7Var.run();
                    return;
                }
                return;
        }
    }

    public e1(e2 e2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i7) {
        this.f42421a = i7;
        this.f42422b = e2Var;
        this.d = obj;
        this.f42424e = tLObject;
        this.f42423c = str;
        this.f42425f = bArr;
        this.f42426g = obj2;
    }

    public e1(e2 e2Var, t tVar, j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f42421a = 2;
        this.f42422b = e2Var;
        this.d = tVar;
        this.f42424e = j0Var;
        this.f42425f = tonconnectsession;
        this.f42423c = str;
        this.f42426g = bArr;
    }
}
