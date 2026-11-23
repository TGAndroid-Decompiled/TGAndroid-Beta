package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o31;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class o31 implements Runnable {
    public final int f37998a = 2;
    public final Object f37999b;
    public final Object f38000c;
    public final Object d;
    public final Object f38001e;
    public final Object f38002f;
    public final Object h;
    public final Object f38003n;
    public final Object f38004r;
    public final Object f38005s;

    public o31(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.i6 i6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.m0 m0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f38002f = w2Var;
        this.h = w2VarArr;
        this.f38003n = context;
        this.f37999b = iArr;
        this.f38000c = i6Var;
        this.f38001e = zArr;
        this.f38004r = inputtonconnectoauthsessionArr;
        this.f38005s = m0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String L0;
        String str;
        switch (this.f37998a) {
            case 0:
                final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.d;
                boolean[] zArr = (boolean[]) this.f38001e;
                String str2 = (String) this.f38002f;
                LinearLayout linearLayout = (LinearLayout) this.f38003n;
                ArrayList arrayList = (ArrayList) this.f37999b;
                String str3 = (String) this.h;
                final org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) this.f38004r;
                final org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f38005s;
                ArrayList arrayList2 = (ArrayList) this.f38000c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (L0 = a31.L0(a31.P0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, ckVar.getContext(), ckVar.d, false, false);
                        y0Var.setChecked(true);
                        y0Var.setText(L0);
                        linearLayout.addView(y0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.r00 r00Var = (org.telegram.messenger.r00) arrayList.get(i7);
                        final String str4 = r00Var.f26618a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, ckVar.getContext(), ckVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            y0Var2.setChecked(z12);
                            y0Var2.setText(r00Var.f26619b);
                            if (!z12) {
                                view = y0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                y00Var.I(ckVar2.f39170b, str4);
                                                g1Var.d(true);
                                                ckVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                y00Var.I(ckVar3.f39170b, str4);
                                                g1Var.d(true);
                                                ckVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = y0Var2;
                            }
                            linearLayout.addView(view);
                            i7 = i10;
                            z12 = z11;
                        }
                    }
                    int i11 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(ckVar.getContext(), ckVar.d), c8.na.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        org.telegram.messenger.r00 r00Var2 = (org.telegram.messenger.r00) arrayList2.get(i12);
                        final String str5 = r00Var2.f26618a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z10 = 1;
                            } else {
                                z10 = i11;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(2, ckVar.getContext(), ckVar.d, false, false);
                            y0Var3.setChecked(z10);
                            y0Var3.setText(r00Var2.f26619b);
                            if (z10 == 0) {
                                y0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                y00Var.I(ckVar2.f39170b, str5);
                                                g1Var.d(true);
                                                ckVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                y00Var.I(ckVar3.f39170b, str5);
                                                g1Var.d(true);
                                                ckVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(y0Var3);
                        }
                        i12 = i13;
                    }
                    zArr[i11] = true;
                    return;
                }
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f38002f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f38003n;
                ArrayList arrayList6 = (ArrayList) this.f38004r;
                ArrayList arrayList7 = (ArrayList) this.f38005s;
                notificationsCustomSettingsActivity.getMessagesController().f4((ArrayList) this.f37999b, true);
                notificationsCustomSettingsActivity.getMessagesController().Z3((ArrayList) this.f38000c, true);
                notificationsCustomSettingsActivity.getMessagesController().c4((ArrayList) this.f38001e);
                int i14 = notificationsCustomSettingsActivity.f43243s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f43245x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f43245x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f43245x = arrayList5;
                    notificationsCustomSettingsActivity.f43244w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f43245x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f38002f;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.h;
                Context context = (Context) this.f38003n;
                int[] iArr = (int[]) this.f37999b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f38000c;
                boolean[] zArr2 = (boolean[]) this.f38001e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f38004r;
                bg.m0 m0Var = (bg.m0) this.f38005s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.ei0.f47562a = w2Var;
                    w2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.f3 D = org.telegram.ui.Wallet.m2.D(context, iArr[0], null, tL_urlAuthResultRequest, i6Var, new org.telegram.ui.t60(w2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, w2Var, m0Var, 2), new org.telegram.ui.bd0(12, w2VarArr, zArr2));
                w2VarArr[0] = D;
                org.telegram.ui.ei0.f47562a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.d;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.f38001e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f38002f;
                byte[] bArr = (byte[]) this.f38003n;
                JSONArray jSONArray = (JSONArray) this.f37999b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f38000c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f38004r;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.f38005s;
                m2Var.getClass();
                try {
                    org.telegram.messenger.g0.g3(new bi.n2(m2Var, str6, bArr, org.telegram.ui.Wallet.m2.s(s0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, m2Var.f44652f.getCurrentTime()), f0Var, tonconnectsession, 22));
                    return;
                } catch (Exception e10) {
                    f0Var.a(null, org.telegram.ui.Wallet.m2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.m2 m2Var2 = (org.telegram.ui.Wallet.m2) this.d;
                final String str7 = (String) this.f38002f;
                final byte[] bArr2 = (byte[]) this.f38001e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.j2) this.f38003n).f44513a;
                final org.telegram.ui.Wallet.f0 f0Var2 = (org.telegram.ui.Wallet.f0) this.f37999b;
                final org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) this.f38000c;
                final JSONArray jSONArray2 = (JSONArray) this.f38004r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f38005s;
                org.telegram.ui.Wallet.v0 v0Var = m2Var2.f44649b;
                if (TextUtils.equals(str7, v0Var.y()) && Arrays.equals(bArr2, v0Var.E()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f28754id;
                    tonconnectregisterkey.client_id = str8;
                    m2Var2.f44652f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.p10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            m2 m2Var3 = m2.this;
                            f0 f0Var3 = f0Var2;
                            s0 s0Var3 = s0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            m2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f22877e.c(new o31(m2Var3, s0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, f0Var3));
                            } else {
                                f0Var3.a(null, m2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                f0Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public o31(org.telegram.ui.ck ckVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.y00 y00Var, org.telegram.ui.ActionBar.g1 g1Var, ArrayList arrayList2) {
        this.d = ckVar;
        this.f38001e = zArr;
        this.f38002f = str;
        this.f38003n = linearLayout;
        this.f37999b = arrayList;
        this.h = str2;
        this.f38004r = y00Var;
        this.f38005s = g1Var;
        this.f38000c = arrayList2;
    }

    public o31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f37999b = arrayList;
        this.f38000c = arrayList2;
        this.f38001e = arrayList3;
        this.f38002f = arrayList4;
        this.h = arrayList5;
        this.f38003n = arrayList6;
        this.f38004r = arrayList7;
        this.f38005s = arrayList8;
    }

    public o31(org.telegram.ui.Wallet.m2 m2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.j2 j2Var, org.telegram.ui.Wallet.f0 f0Var, org.telegram.ui.Wallet.s0 s0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = m2Var;
        this.f38002f = str;
        this.f38001e = bArr;
        this.h = tonconnectsession;
        this.f38003n = j2Var;
        this.f37999b = f0Var;
        this.f38000c = s0Var;
        this.f38004r = jSONArray;
        this.f38005s = tL_urlAuthResultRequest;
    }

    public o31(org.telegram.ui.Wallet.m2 m2Var, org.telegram.ui.Wallet.s0 s0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.f0 f0Var) {
        this.d = m2Var;
        this.f38001e = s0Var;
        this.h = tonconnectsession;
        this.f38002f = str;
        this.f38003n = bArr;
        this.f37999b = jSONArray;
        this.f38000c = tL_urlAuthResultRequest;
        this.f38004r = tonconnectchallenge;
        this.f38005s = f0Var;
    }
}
