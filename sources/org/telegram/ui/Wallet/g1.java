package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ft;
import org.telegram.ui.wb0;
import org.telegram.ui.ze;
public final class g1 implements Utilities.Callback2 {
    public final int f34951a;
    public final d2 f34952b;
    public final String f34953c;
    public final Object d;
    public final Object f34954e;
    public final Object f34955f;
    public final Object f34956g;

    public g1(d2 d2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f34951a = i10;
        this.f34952b = d2Var;
        this.d = obj;
        this.f34954e = tLObject;
        this.f34953c = str;
        this.f34955f = bArr;
        this.f34956g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f34951a) {
            case 0:
                d2 d2Var = this.f34952b;
                wb0 wb0Var = (wb0) this.d;
                String str = this.f34953c;
                String str2 = (String) this.f34954e;
                String str3 = (String) this.f34955f;
                String str4 = (String) this.f34956g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = d2Var.d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        int i11 = size;
                        if (tonconnectsession3.f20299id == tonconnectsession2.f20299id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            d2Var.n(tonconnectsession);
                            wb0Var.run(new y1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    d2Var.n(tonconnectsession);
                    wb0Var.run(new y1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                wb0Var.run(null, d2.x(tL_error, "createSession"));
                return;
            case 1:
                d2 d2Var2 = this.f34952b;
                ft ftVar = (ft) this.d;
                h0 h0Var = (h0) this.f34954e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f34955f;
                String str5 = this.f34953c;
                byte[] bArr = (byte[]) this.f34956g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new ze((Object) d2Var2, (Object) h0Var, (Object) tonconnectsession4, str5, (Object) bArr, (Object) tonconnectnexteventid, (Object) ftVar, 7));
                    return;
                } else {
                    ftVar.run(d2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                d2 d2Var3 = this.f34952b;
                ai.m0 m0Var = (ai.m0) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f34954e;
                String str6 = this.f34953c;
                byte[] bArr2 = (byte[]) this.f34955f;
                JSONArray jSONArray = (JSONArray) this.f34956g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = d2Var3.f34768b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f20299id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, k0Var.r()) && Arrays.equals(bArr2, k0Var.w())) {
                        k0Var.x(new pr(d2Var3, m0Var, tonconnectsession5, str6, bArr2, jSONArray, tL_urlAuthResultRequest, 2), true, false);
                        return;
                    } else {
                        m0Var.run(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                m0Var.run(null, d2.x(tL_error3, "createSession"));
                return;
            default:
                d2 d2Var4 = this.f34952b;
                ft ftVar2 = (ft) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.f34954e;
                String str7 = this.f34953c;
                byte[] bArr3 = (byte[]) this.f34955f;
                y1 y1Var = (y1) this.f34956g;
                h0 h0Var2 = (h0) obj;
                String str8 = (String) obj2;
                d2Var4.getClass();
                if (str8 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.globalQueue.postRunnable(new ze((Object) d2Var4, (Object) b10, (Object) tonconnectsession6, str7, (Object) bArr3, (Object) y1Var, (Object) new ft(28, b10, ftVar2), 9));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                ftVar2.run(str8);
                return;
        }
    }

    public g1(d2 d2Var, ft ftVar, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f34951a = 1;
        this.f34952b = d2Var;
        this.d = ftVar;
        this.f34954e = h0Var;
        this.f34955f = tonconnectsession;
        this.f34953c = str;
        this.f34956g = bArr;
    }

    public g1(d2 d2Var, wb0 wb0Var, String str, String str2, String str3, String str4) {
        this.f34951a = 0;
        this.f34952b = d2Var;
        this.d = wb0Var;
        this.f34953c = str;
        this.f34954e = str2;
        this.f34955f = str3;
        this.f34956g = str4;
    }
}
