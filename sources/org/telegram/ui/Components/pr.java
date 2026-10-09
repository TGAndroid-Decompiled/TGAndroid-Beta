package org.telegram.ui.Components;

import org.json.JSONArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class pr implements Utilities.Callback2 {
    public final int f29924a;
    public final String f29925b;
    public final Object f29926c;
    public final Object d;
    public final Object f29927e;
    public final Object f29928f;
    public final Object f29929g;
    public final Object h;

    public pr(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.f29924a = i10;
        this.f29926c = obj;
        this.d = obj2;
        this.f29927e = obj3;
        this.f29925b = str;
        this.f29928f = obj4;
        this.f29929g = obj5;
        this.h = obj6;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f29924a) {
            case 0:
                ci.d dVar = (ci.d) this.f29926c;
                String[] strArr = (String[]) this.f29927e;
                String str = this.f29925b;
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) this.f29928f;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f29929g;
                int[] iArr = (int[]) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                ((String[]) this.d)[0] = null;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    strArr[0] = str;
                    dVar.setEnabled(true);
                    e9Var.setText(LocaleController.formatString(R.string.UsernameAvailable, sc.v.i("@", str)));
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21146w6, e6Var));
                    return;
                }
                strArr[0] = null;
                dVar.setEnabled(false);
                e9Var.setText(LocaleController.getString(R.string.UsernameInUse));
                e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, e6Var));
                int i10 = -iArr[0];
                iArr[0] = i10;
                AndroidUtilities.shakeViewSpring(e9Var, i10);
                return;
            case 1:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f29926c;
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f29927e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f29928f;
                String str2 = this.f29925b;
                byte[] bArr = (byte[]) this.f29929g;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d2Var.getClass();
                if (tL_error2 == null && tonconnectchallenge != null) {
                    Utilities.globalQueue.postRunnable(new ii.k(d2Var, h0Var, tonconnectsession, str2, bArr, y1Var, tonconnectchallenge, ftVar, 4));
                    return;
                } else {
                    ftVar.run(org.telegram.ui.Wallet.d2.x(tL_error2, "registerKey"));
                    return;
                }
            default:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.f29926c;
                ai.m0 m0Var = (ai.m0) this.d;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f29927e;
                String str3 = this.f29925b;
                byte[] bArr2 = (byte[]) this.f29928f;
                JSONArray jSONArray = (JSONArray) this.f29929g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj;
                String str4 = (String) obj2;
                d2Var2.getClass();
                if (str4 == null && h0Var2 != null) {
                    org.telegram.ui.Wallet.h0 b10 = h0Var2.b();
                    Utilities.globalQueue.postRunnable(new ii.k(d2Var2, b10, tonconnectsession2, str3, bArr2, jSONArray, tL_urlAuthResultRequest, new ai.m0(26, b10, m0Var), 5));
                    return;
                }
                if (str4 == null) {
                    str4 = "Recovery phrase is unavailable";
                }
                m0Var.run(null, str4);
                return;
        }
    }

    public pr(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.ft ftVar, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, org.telegram.ui.Wallet.y1 y1Var) {
        this.f29924a = 1;
        this.f29926c = d2Var;
        this.d = ftVar;
        this.f29927e = h0Var;
        this.f29928f = tonconnectsession;
        this.f29925b = str;
        this.f29929g = bArr;
        this.h = y1Var;
    }
}
