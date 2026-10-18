package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.db0;
public final class i1 implements Utilities.Callback2 {
    public final int f34322a;
    public final f2 f34323b;
    public final String f34324c;
    public final Object d;
    public final Object e;
    public final Object f34325f;
    public final Object f34326g;

    public i1(f2 f2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f34322a = i10;
        this.f34323b = f2Var;
        this.d = obj;
        this.e = tLObject;
        this.f34324c = str;
        this.f34325f = bArr;
        this.f34326g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f34322a) {
            case 0:
                f2 f2Var = this.f34323b;
                db0 db0Var = (db0) this.d;
                String str = this.f34324c;
                String str2 = (String) this.e;
                String str3 = (String) this.f34325f;
                String str4 = (String) this.f34326g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f2Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = f2Var.d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        int i11 = size;
                        if (tonconnectsession3.f20537id == tonconnectsession2.f20537id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            f2Var.n(tonconnectsession);
                            db0Var.run(new a2(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    f2Var.n(tonconnectsession);
                    db0Var.run(new a2(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                db0Var.run(null, f2.x(tL_error, "createSession"));
                return;
            case 1:
                f2 f2Var2 = this.f34323b;
                x xVar = (x) this.d;
                j0 j0Var = (j0) this.e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f34325f;
                String str5 = this.f34324c;
                byte[] bArr = (byte[]) this.f34326g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new ai.u7(f2Var2, j0Var, tonconnectsession4, str5, bArr, tonconnectnexteventid, xVar, 11));
                    return;
                } else {
                    xVar.run(f2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                f2 f2Var3 = this.f34323b;
                s1 s1Var = (s1) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str6 = this.f34324c;
                byte[] bArr2 = (byte[]) this.f34325f;
                JSONArray jSONArray = (JSONArray) this.f34326g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m0 m0Var = f2Var3.f34224b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f20537id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, m0Var.s()) && Arrays.equals(bArr2, m0Var.x())) {
                        m0Var.y(new c1(f2Var3, s1Var, tonconnectsession5, str6, bArr2, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        s1Var.run(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                s1Var.run(null, f2.x(tL_error3, "createSession"));
                return;
            default:
                f2 f2Var4 = this.f34323b;
                x xVar2 = (x) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.e;
                String str7 = this.f34324c;
                byte[] bArr3 = (byte[]) this.f34325f;
                a2 a2Var = (a2) this.f34326g;
                j0 j0Var2 = (j0) obj;
                String str8 = (String) obj2;
                f2Var4.getClass();
                if (str8 == null && j0Var2 != null) {
                    j0 b10 = j0Var2.b();
                    Utilities.globalQueue.postRunnable(new ai.u7(f2Var4, b10, tonconnectsession6, str7, bArr3, a2Var, new x(5, b10, xVar2), 13));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                xVar2.run(str8);
                return;
        }
    }

    public i1(f2 f2Var, db0 db0Var, String str, String str2, String str3, String str4) {
        this.f34322a = 0;
        this.f34323b = f2Var;
        this.d = db0Var;
        this.f34324c = str;
        this.e = str2;
        this.f34325f = str3;
        this.f34326g = str4;
    }

    public i1(f2 f2Var, x xVar, j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f34322a = 1;
        this.f34323b = f2Var;
        this.d = xVar;
        this.e = j0Var;
        this.f34325f = tonconnectsession;
        this.f34324c = str;
        this.f34326g = bArr;
    }
}
