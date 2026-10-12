package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.bc0;
import org.telegram.ui.ff;
import org.telegram.ui.mt;
public final class g1 implements Utilities.Callback2 {
    public final int f33194a;
    public final d2 f33195b;
    public final String f33196c;
    public final Object d;
    public final Object e;
    public final Object f33197f;
    public final Object f33198g;

    public g1(d2 d2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f33194a = i10;
        this.f33195b = d2Var;
        this.d = obj;
        this.e = tLObject;
        this.f33196c = str;
        this.f33197f = bArr;
        this.f33198g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f33194a) {
            case 0:
                d2 d2Var = this.f33195b;
                bc0 bc0Var = (bc0) this.d;
                String str = this.f33196c;
                String str2 = (String) this.e;
                String str3 = (String) this.f33197f;
                String str4 = (String) this.f33198g;
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
                        if (tonconnectsession3.f19475id == tonconnectsession2.f19475id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            d2Var.n(tonconnectsession);
                            bc0Var.run(new y1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    d2Var.n(tonconnectsession);
                    bc0Var.run(new y1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                bc0Var.run(null, d2.x(tL_error, "createSession"));
                return;
            case 1:
                d2 d2Var2 = this.f33195b;
                mt mtVar = (mt) this.d;
                g0 g0Var = (g0) this.e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f33197f;
                String str5 = this.f33196c;
                byte[] bArr = (byte[]) this.f33198g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new ff((Object) d2Var2, (Object) g0Var, (Object) tonconnectsession4, str5, (Object) bArr, (Object) tonconnectnexteventid, (Object) mtVar, 7));
                    return;
                } else {
                    mtVar.run(d2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                d2 d2Var3 = this.f33195b;
                bi.f0 f0Var = (bi.f0) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str6 = this.f33196c;
                byte[] bArr2 = (byte[]) this.f33197f;
                JSONArray jSONArray = (JSONArray) this.f33198g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                j0 j0Var = d2Var3.f33041b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f19475id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, j0Var.r()) && Arrays.equals(bArr2, j0Var.w())) {
                        j0Var.x(new a1(d2Var3, f0Var, tonconnectsession5, str6, bArr2, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        f0Var.run(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                f0Var.run(null, d2.x(tL_error3, "createSession"));
                return;
            default:
                d2 d2Var4 = this.f33195b;
                mt mtVar2 = (mt) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.e;
                String str7 = this.f33196c;
                byte[] bArr3 = (byte[]) this.f33197f;
                y1 y1Var = (y1) this.f33198g;
                g0 g0Var2 = (g0) obj;
                String str8 = (String) obj2;
                d2Var4.getClass();
                if (str8 == null && g0Var2 != null) {
                    g0 b10 = g0Var2.b();
                    Utilities.globalQueue.postRunnable(new ff((Object) d2Var4, (Object) b10, (Object) tonconnectsession6, str7, (Object) bArr3, (Object) y1Var, (Object) new mt(28, b10, mtVar2), 9));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                mtVar2.run(str8);
                return;
        }
    }

    public g1(d2 d2Var, mt mtVar, g0 g0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f33194a = 1;
        this.f33195b = d2Var;
        this.d = mtVar;
        this.e = g0Var;
        this.f33197f = tonconnectsession;
        this.f33196c = str;
        this.f33198g = bArr;
    }

    public g1(d2 d2Var, bc0 bc0Var, String str, String str2, String str3, String str4) {
        this.f33194a = 0;
        this.f33195b = d2Var;
        this.d = bc0Var;
        this.f33196c = str;
        this.e = str2;
        this.f33197f = str3;
        this.f33198g = str4;
    }
}
