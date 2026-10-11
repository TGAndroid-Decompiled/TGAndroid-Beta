package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.et;
import org.telegram.ui.vb0;
import org.telegram.ui.ye;
public final class i1 implements Utilities.Callback2 {
    public final int f35070a;
    public final f2 f35071b;
    public final String f35072c;
    public final Object d;
    public final Object f35073e;
    public final Object f35074f;
    public final Object f35075g;

    public i1(f2 f2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f35070a = i10;
        this.f35071b = f2Var;
        this.d = obj;
        this.f35073e = tLObject;
        this.f35072c = str;
        this.f35074f = bArr;
        this.f35075g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f35070a) {
            case 0:
                f2 f2Var = this.f35071b;
                vb0 vb0Var = (vb0) this.d;
                String str = this.f35072c;
                String str2 = (String) this.f35073e;
                String str3 = (String) this.f35074f;
                String str4 = (String) this.f35075g;
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
                        if (tonconnectsession3.f20293id == tonconnectsession2.f20293id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            f2Var.n(tonconnectsession);
                            vb0Var.run(new a2(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    f2Var.n(tonconnectsession);
                    vb0Var.run(new a2(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                vb0Var.run(null, f2.x(tL_error, "createSession"));
                return;
            case 1:
                f2 f2Var2 = this.f35071b;
                et etVar = (et) this.d;
                i0 i0Var = (i0) this.f35073e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f35074f;
                String str5 = this.f35072c;
                byte[] bArr = (byte[]) this.f35075g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new ye((Object) f2Var2, (Object) i0Var, (Object) tonconnectsession4, str5, (Object) bArr, (Object) tonconnectnexteventid, (Object) etVar, 7));
                    return;
                } else {
                    etVar.run(f2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                f2 f2Var3 = this.f35071b;
                ai.m0 m0Var = (ai.m0) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f35073e;
                String str6 = this.f35072c;
                byte[] bArr2 = (byte[]) this.f35074f;
                JSONArray jSONArray = (JSONArray) this.f35075g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = f2Var3.f34891b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f20293id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, l0Var.r()) && Arrays.equals(bArr2, l0Var.w())) {
                        l0Var.x(new c1(f2Var3, m0Var, tonconnectsession5, str6, bArr2, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        m0Var.run(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                m0Var.run(null, f2.x(tL_error3, "createSession"));
                return;
            default:
                f2 f2Var4 = this.f35071b;
                et etVar2 = (et) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.f35073e;
                String str7 = this.f35072c;
                byte[] bArr3 = (byte[]) this.f35074f;
                a2 a2Var = (a2) this.f35075g;
                i0 i0Var2 = (i0) obj;
                String str8 = (String) obj2;
                f2Var4.getClass();
                if (str8 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.globalQueue.postRunnable(new ye((Object) f2Var4, (Object) b10, (Object) tonconnectsession6, str7, (Object) bArr3, (Object) a2Var, (Object) new et(28, b10, etVar2), 9));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                etVar2.run(str8);
                return;
        }
    }

    public i1(f2 f2Var, et etVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f35070a = 1;
        this.f35071b = f2Var;
        this.d = etVar;
        this.f35073e = i0Var;
        this.f35074f = tonconnectsession;
        this.f35072c = str;
        this.f35075g = bArr;
    }

    public i1(f2 f2Var, vb0 vb0Var, String str, String str2, String str3, String str4) {
        this.f35070a = 0;
        this.f35071b = f2Var;
        this.d = vb0Var;
        this.f35072c = str;
        this.f35073e = str2;
        this.f35074f = str3;
        this.f35075g = str4;
    }
}
