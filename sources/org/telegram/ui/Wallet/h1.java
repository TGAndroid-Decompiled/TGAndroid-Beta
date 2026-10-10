package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ft;
import org.telegram.ui.wb0;
import org.telegram.ui.ze;
public final class h1 implements Utilities.Callback2 {
    public final int f35040a;
    public final e2 f35041b;
    public final String f35042c;
    public final Object d;
    public final Object f35043e;
    public final Object f35044f;
    public final Object f35045g;

    public h1(e2 e2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f35040a = i10;
        this.f35041b = e2Var;
        this.d = obj;
        this.f35043e = tLObject;
        this.f35042c = str;
        this.f35044f = bArr;
        this.f35045g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f35040a) {
            case 0:
                e2 e2Var = this.f35041b;
                wb0 wb0Var = (wb0) this.d;
                String str = this.f35042c;
                String str2 = (String) this.f35043e;
                String str3 = (String) this.f35044f;
                String str4 = (String) this.f35045g;
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
                        if (tonconnectsession3.f20303id == tonconnectsession2.f20303id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            e2Var.n(tonconnectsession);
                            wb0Var.run(new z1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    e2Var.n(tonconnectsession);
                    wb0Var.run(new z1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                wb0Var.run(null, e2.x(tL_error, "createSession"));
                return;
            case 1:
                e2 e2Var2 = this.f35041b;
                ft ftVar = (ft) this.d;
                h0 h0Var = (h0) this.f35043e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f35044f;
                String str5 = this.f35042c;
                byte[] bArr = (byte[]) this.f35045g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new ze((Object) e2Var2, (Object) h0Var, (Object) tonconnectsession4, str5, (Object) bArr, (Object) tonconnectnexteventid, (Object) ftVar, 7));
                    return;
                } else {
                    ftVar.run(e2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                e2 e2Var3 = this.f35041b;
                ai.m0 m0Var = (ai.m0) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f35043e;
                String str6 = this.f35042c;
                byte[] bArr2 = (byte[]) this.f35044f;
                JSONArray jSONArray = (JSONArray) this.f35045g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var3.f34859b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f20303id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, k0Var.r()) && Arrays.equals(bArr2, k0Var.w())) {
                        k0Var.x(new b1(e2Var3, m0Var, tonconnectsession5, str6, bArr2, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        m0Var.run(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                m0Var.run(null, e2.x(tL_error3, "createSession"));
                return;
            default:
                e2 e2Var4 = this.f35041b;
                ft ftVar2 = (ft) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.f35043e;
                String str7 = this.f35042c;
                byte[] bArr3 = (byte[]) this.f35044f;
                z1 z1Var = (z1) this.f35045g;
                h0 h0Var2 = (h0) obj;
                String str8 = (String) obj2;
                e2Var4.getClass();
                if (str8 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.globalQueue.postRunnable(new ze((Object) e2Var4, (Object) b10, (Object) tonconnectsession6, str7, (Object) bArr3, (Object) z1Var, (Object) new ft(28, b10, ftVar2), 9));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                ftVar2.run(str8);
                return;
        }
    }

    public h1(e2 e2Var, ft ftVar, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f35040a = 1;
        this.f35041b = e2Var;
        this.d = ftVar;
        this.f35043e = h0Var;
        this.f35044f = tonconnectsession;
        this.f35042c = str;
        this.f35045g = bArr;
    }

    public h1(e2 e2Var, wb0 wb0Var, String str, String str2, String str3, String str4) {
        this.f35040a = 0;
        this.f35041b = e2Var;
        this.d = wb0Var;
        this.f35042c = str;
        this.f35043e = str2;
        this.f35044f = str3;
        this.f35045g = str4;
    }
}
