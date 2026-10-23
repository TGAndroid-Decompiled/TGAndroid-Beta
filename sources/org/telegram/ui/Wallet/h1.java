package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.hb0;
public final class h1 implements Utilities.Callback2 {
    public final int f34562a;
    public final e2 f34563b;
    public final String f34564c;
    public final Object d;
    public final Object e;
    public final Object f34565f;
    public final Object f34566g;

    public h1(e2 e2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f34562a = i10;
        this.f34563b = e2Var;
        this.d = obj;
        this.e = tLObject;
        this.f34564c = str;
        this.f34565f = bArr;
        this.f34566g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f34562a) {
            case 0:
                e2 e2Var = this.f34563b;
                hb0 hb0Var = (hb0) this.d;
                String str = this.f34564c;
                String str2 = (String) this.e;
                String str3 = (String) this.f34565f;
                String str4 = (String) this.f34566g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                e2Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = e2Var.d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        int i11 = size;
                        if (tonconnectsession3.f20601id == tonconnectsession2.f20601id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            e2Var.n(tonconnectsession);
                            hb0Var.run(new z1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    e2Var.n(tonconnectsession);
                    hb0Var.run(new z1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                hb0Var.run(null, e2.x(tL_error, "createSession"));
                return;
            case 1:
                e2 e2Var2 = this.f34563b;
                w wVar = (w) this.d;
                i0 i0Var = (i0) this.e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f34565f;
                String str5 = this.f34564c;
                byte[] bArr = (byte[]) this.f34566g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new ai.v7(e2Var2, i0Var, tonconnectsession4, str5, bArr, tonconnectnexteventid, wVar, 11));
                    return;
                } else {
                    wVar.run(e2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                e2 e2Var3 = this.f34563b;
                r1 r1Var = (r1) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str6 = this.f34564c;
                byte[] bArr2 = (byte[]) this.f34565f;
                JSONArray jSONArray = (JSONArray) this.f34566g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = e2Var3.f34430b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f20601id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, l0Var.s()) && Arrays.equals(bArr2, l0Var.x())) {
                        l0Var.y(new b1(e2Var3, r1Var, tonconnectsession5, str6, bArr2, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        r1Var.run(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                r1Var.run(null, e2.x(tL_error3, "createSession"));
                return;
            default:
                e2 e2Var4 = this.f34563b;
                w wVar2 = (w) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.e;
                String str7 = this.f34564c;
                byte[] bArr3 = (byte[]) this.f34565f;
                z1 z1Var = (z1) this.f34566g;
                i0 i0Var2 = (i0) obj;
                String str8 = (String) obj2;
                e2Var4.getClass();
                if (str8 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.globalQueue.postRunnable(new ai.v7(e2Var4, b10, tonconnectsession6, str7, bArr3, z1Var, new w(5, b10, wVar2), 13));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                wVar2.run(str8);
                return;
        }
    }

    public h1(e2 e2Var, hb0 hb0Var, String str, String str2, String str3, String str4) {
        this.f34562a = 0;
        this.f34563b = e2Var;
        this.d = hb0Var;
        this.f34564c = str;
        this.e = str2;
        this.f34565f = str3;
        this.f34566g = str4;
    }

    public h1(e2 e2Var, w wVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f34562a = 1;
        this.f34563b = e2Var;
        this.d = wVar;
        this.e = i0Var;
        this.f34565f = tonconnectsession;
        this.f34564c = str;
        this.f34566g = bArr;
    }
}
