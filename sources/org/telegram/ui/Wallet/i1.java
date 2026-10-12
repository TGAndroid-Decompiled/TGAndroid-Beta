package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.df;
import org.telegram.ui.jt;
import org.telegram.ui.xb0;
public final class i1 implements Utilities.Callback2 {
    public final int f34881a;
    public final f2 f34882b;
    public final String f34883c;
    public final Object d;
    public final Object f34884e;
    public final Object f34885f;
    public final Object f34886g;

    public i1(f2 f2Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, int i10) {
        this.f34881a = i10;
        this.f34882b = f2Var;
        this.d = obj;
        this.f34884e = tLObject;
        this.f34883c = str;
        this.f34885f = bArr;
        this.f34886g = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        switch (this.f34881a) {
            case 0:
                f2 f2Var = this.f34882b;
                xb0 xb0Var = (xb0) this.d;
                String str = this.f34883c;
                String str2 = (String) this.f34884e;
                String str3 = (String) this.f34885f;
                String str4 = (String) this.f34886g;
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
                        if (tonconnectsession3.f20066id == tonconnectsession2.f20066id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            f2Var.n(tonconnectsession);
                            xb0Var.run(new a2(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                        size = i11;
                    }
                    tonconnectsession = tonconnectsession2;
                    f2Var.n(tonconnectsession);
                    xb0Var.run(new a2(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                xb0Var.run(null, f2.x(tL_error, "createSession"));
                return;
            case 1:
                f2 f2Var2 = this.f34882b;
                jt jtVar = (jt) this.d;
                i0 i0Var = (i0) this.f34884e;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.f34885f;
                String str5 = this.f34883c;
                byte[] bArr = (byte[]) this.f34886g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f2Var2.getClass();
                if (tL_error2 == null && tonconnectnexteventid != null) {
                    Utilities.globalQueue.postRunnable(new df((Object) f2Var2, (Object) i0Var, (Object) tonconnectsession4, str5, (Object) bArr, (Object) tonconnectnexteventid, (Object) jtVar, 7));
                    return;
                } else {
                    jtVar.run(f2.x(tL_error2, "getNextEventId"));
                    return;
                }
            case 2:
                f2 f2Var3 = this.f34882b;
                ai.m0 m0Var = (ai.m0) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f34884e;
                String str6 = this.f34883c;
                byte[] bArr2 = (byte[]) this.f34885f;
                JSONArray jSONArray = (JSONArray) this.f34886g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = f2Var3.f34702b;
                if (tL_error3 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.f20066id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str6, l0Var.r()) && Arrays.equals(bArr2, l0Var.w())) {
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
                f2 f2Var4 = this.f34882b;
                jt jtVar2 = (jt) this.d;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.f34884e;
                String str7 = this.f34883c;
                byte[] bArr3 = (byte[]) this.f34885f;
                a2 a2Var = (a2) this.f34886g;
                i0 i0Var2 = (i0) obj;
                String str8 = (String) obj2;
                f2Var4.getClass();
                if (str8 == null && i0Var2 != null) {
                    i0 b10 = i0Var2.b();
                    Utilities.globalQueue.postRunnable(new df((Object) f2Var4, (Object) b10, (Object) tonconnectsession6, str7, (Object) bArr3, (Object) a2Var, (Object) new jt(28, b10, jtVar2), 9));
                    return;
                }
                if (str8 == null) {
                    str8 = "Recovery phrase is unavailable";
                }
                jtVar2.run(str8);
                return;
        }
    }

    public i1(f2 f2Var, jt jtVar, i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.f34881a = 1;
        this.f34882b = f2Var;
        this.d = jtVar;
        this.f34884e = i0Var;
        this.f34885f = tonconnectsession;
        this.f34883c = str;
        this.f34886g = bArr;
    }

    public i1(f2 f2Var, xb0 xb0Var, String str, String str2, String str3, String str4) {
        this.f34881a = 0;
        this.f34882b = f2Var;
        this.d = xb0Var;
        this.f34883c = str;
        this.f34884e = str2;
        this.f34885f = str3;
        this.f34886g = str4;
    }
}
