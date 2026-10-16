package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ac0;
import org.telegram.ui.ff;
import org.telegram.ui.mt;
public final class h1 implements Utilities.Callback2 {
    public final int f32967a;
    public final e2 f32968b;
    public final String f32969c;
    public final Object d;
    public final Object e;
    public final Object f32970f;
    public final Object f32971g;

    public h1(e2 e2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f32967a = i10;
        this.f32968b = e2Var;
        this.d = obj;
        this.e = tLObject;
        this.f32969c = str;
        this.f32970f = bArr;
        this.f32971g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f32967a) {
            case 0:
                e2 e2Var = this.f32968b;
                ac0 ac0Var = (ac0) this.d;
                String str = this.f32969c;
                String str2 = (String) this.e;
                String str3 = (String) this.f32970f;
                String str4 = (String) this.f32971g;
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
                        if (tonconnectsession3.f19175id == tonconnectsession2.f19175id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            e2Var.n(tonconnectsession);
                            ac0Var.run(new z1(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    e2Var.n(tonconnectsession);
                    ac0Var.run(new z1(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                ac0Var.run(null, e2.x(tL_error, "createSession"));
                return;
            case 1:
                e2 e2Var2 = this.f32968b;
                mt mtVar = (mt) this.d;
                h0 h0Var = (h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f32970f;
                String str5 = this.f32969c;
                byte[] bArr = (byte[]) this.f32971g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new ff((Object) e2Var2, (Object) h0Var, (Object) tonconnectsession4, str5, (Object) bArr, (Object) tonconnectnexteventid, (Object) mtVar, 7));
                    return;
                } else {
                    mtVar.run(e2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                e2 e2Var3 = this.f32968b;
                bi.f0 f0Var = (bi.f0) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str6 = this.f32969c;
                byte[] bArr2 = (byte[]) this.f32970f;
                JSONArray jSONArray = (JSONArray) this.f32971g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var3.f32818b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f19175id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, k0Var.r()) && Arrays.equals(bArr2, k0Var.w())) {
                        k0Var.x(new b1(e2Var3, f0Var, tonconnectsession5, str6, bArr2, jSONArray, tL_urlAuthResultRequest), true, false);
                        return;
                    } else {
                        f0Var.run(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                f0Var.run(null, e2.x(tL_error3, "createSession"));
                return;
            default:
                e2 e2Var4 = this.f32968b;
                mt mtVar2 = (mt) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.e;
                String str7 = this.f32969c;
                byte[] bArr3 = (byte[]) this.f32970f;
                z1 z1Var = (z1) this.f32971g;
                h0 h0Var2 = (h0) obj;
                String str8 = (String) obj2;
                e2Var4.getClass();
                if (str8 == null && h0Var2 != null) {
                    h0 b10 = h0Var2.b();
                    Utilities.globalQueue.postRunnable(new ff((Object) e2Var4, (Object) b10, (Object) tonconnectsession6, str7, (Object) bArr3, (Object) z1Var, (Object) new mt(28, b10, mtVar2), 9));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                mtVar2.run(str8);
                return;
        }
    }

    public h1(e2 e2Var, mt mtVar, h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f32967a = 1;
        this.f32968b = e2Var;
        this.d = mtVar;
        this.e = h0Var;
        this.f32970f = tonconnectsession;
        this.f32969c = str;
        this.f32971g = bArr;
    }

    public h1(e2 e2Var, ac0 ac0Var, String str, String str2, String str3, String str4) {
        this.f32967a = 0;
        this.f32968b = e2Var;
        this.d = ac0Var;
        this.f32969c = str;
        this.e = str2;
        this.f32970f = str3;
        this.f32971g = str4;
    }
}
