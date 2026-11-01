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
import org.telegram.ui.Components.c41;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class c41 implements Runnable {
    public final int f25003a = 2;
    public final Object f25004b;
    public final Object f25005c;
    public final Object d;
    public final Object e;
    public final Object f25006f;
    public final Object h;
    public final Object f25007n;
    public final Object f25008r;
    public final Object f25009s;

    public c41(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.p6 p6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, m4.a1 a1Var) {
        this.d = tL_urlAuthResultRequest;
        this.f25006f = z2Var;
        this.h = z2VarArr;
        this.f25007n = context;
        this.f25004b = iArr;
        this.f25005c = p6Var;
        this.e = zArr;
        this.f25008r = inputtonconnectoauthsessionArr;
        this.f25009s = a1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String K0;
        String str;
        switch (this.f25003a) {
            case 0:
                final org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f25006f;
                LinearLayout linearLayout = (LinearLayout) this.f25007n;
                ArrayList arrayList = (ArrayList) this.f25004b;
                String str3 = (String) this.h;
                final org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f25008r;
                final org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) this.f25009s;
                ArrayList arrayList2 = (ArrayList) this.f25005c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = n31.K0(n31.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, xkVar.getContext(), xkVar.d, false, false);
                        b1Var.setChecked(true);
                        b1Var.setText(K0);
                        linearLayout.addView(b1Var);
                    }
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        org.telegram.messenger.n10 n10Var = (org.telegram.messenger.n10) arrayList.get(i10);
                        final String str4 = n10Var.f17246a;
                        if (TextUtils.equals(str4, str3)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(2, xkVar.getContext(), xkVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            b1Var2.setChecked(z12);
                            b1Var2.setText(n10Var.f17247b);
                            if (!z12) {
                                view = b1Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.xk xkVar2 = xkVar;
                                                u10Var.I(xkVar2.f25683b, str4);
                                                k1Var.d(true);
                                                xkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.xk xkVar3 = xkVar;
                                                u10Var.I(xkVar3.f25683b, str4);
                                                k1Var.d(true);
                                                xkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = b1Var2;
                            }
                            linearLayout.addView(view);
                            i10 = i11;
                            z12 = z11;
                        }
                    }
                    int i12 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.h1(xkVar.getContext(), xkVar.d), w7.b6.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i13 = i12;
                    while (i13 < size2) {
                        int i14 = i13 + 1;
                        org.telegram.messenger.n10 n10Var2 = (org.telegram.messenger.n10) arrayList2.get(i13);
                        final String str5 = n10Var2.f17246a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z10 = 1;
                            } else {
                                z10 = i12;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(2, xkVar.getContext(), xkVar.d, false, false);
                            b1Var3.setChecked(z10);
                            b1Var3.setText(n10Var2.f17247b);
                            if (z10 == 0) {
                                b1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.xk xkVar2 = xkVar;
                                                u10Var.I(xkVar2.f25683b, str5);
                                                k1Var.d(true);
                                                xkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.xk xkVar3 = xkVar;
                                                u10Var.I(xkVar3.f25683b, str5);
                                                k1Var.d(true);
                                                xkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(b1Var3);
                        }
                        i13 = i14;
                    }
                    zArr[i12] = true;
                    return;
                }
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f25006f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f25007n;
                ArrayList arrayList6 = (ArrayList) this.f25008r;
                ArrayList arrayList7 = (ArrayList) this.f25009s;
                notificationsCustomSettingsActivity.getMessagesController().V3((ArrayList) this.f25004b, true);
                notificationsCustomSettingsActivity.getMessagesController().P3((ArrayList) this.f25005c, true);
                notificationsCustomSettingsActivity.getMessagesController().S3((ArrayList) this.e);
                int i15 = notificationsCustomSettingsActivity.f33410s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f33412x = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f33412x = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f33412x = arrayList5;
                    notificationsCustomSettingsActivity.f33411w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33412x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f25006f;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.h;
                Context context = (Context) this.f25007n;
                int[] iArr = (int[]) this.f25004b;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f25005c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f25008r;
                m4.a1 a1Var = (m4.a1) this.f25009s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.hj0.f37825a = z2Var;
                    z2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.a3 D = org.telegram.ui.Wallet.e2.D(context, iArr[0], null, tL_urlAuthResultRequest, p6Var, new org.telegram.ui.q70(z2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, z2Var, a1Var, 2), new org.telegram.ui.if0(8, z2VarArr, zArr2));
                z2VarArr[0] = D;
                org.telegram.ui.hj0.f37825a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f25006f;
                byte[] bArr = (byte[]) this.f25007n;
                JSONArray jSONArray = (JSONArray) this.f25004b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f25005c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f25008r;
                ih.s sVar = (ih.s) this.f25009s;
                e2Var.getClass();
                try {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.v8(e2Var, str6, bArr, org.telegram.ui.Wallet.e2.s(h0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, e2Var.f34453f.getCurrentTime()), sVar, tonconnectsession, 11));
                    return;
                } catch (Exception e) {
                    sVar.a(null, org.telegram.ui.Wallet.e2.i("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.d;
                final String str7 = (String) this.f25006f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.b2) this.f25007n).f34229a;
                final ih.s sVar2 = (ih.s) this.f25004b;
                final org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f25005c;
                final JSONArray jSONArray2 = (JSONArray) this.f25008r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f25009s;
                org.telegram.ui.Wallet.k0 k0Var = e2Var2.f34451b;
                if (TextUtils.equals(str7, k0Var.t()) && Arrays.equals(bArr2, k0Var.y()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f20056id;
                    tonconnectregisterkey.client_id = str8;
                    e2Var2.f34453f.sendRequestTyped(tonconnectregisterkey, new a3.b(1), new org.telegram.messenger.k20() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            e2 e2Var3 = e2.this;
                            ih.s sVar3 = sVar2;
                            h0 h0Var3 = h0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            e2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.e.c(new c41(e2Var3, h0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, sVar3));
                            } else {
                                sVar3.a(null, e2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                sVar2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public c41(org.telegram.ui.xk xkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.k1 k1Var, ArrayList arrayList2) {
        this.d = xkVar;
        this.e = zArr;
        this.f25006f = str;
        this.f25007n = linearLayout;
        this.f25004b = arrayList;
        this.h = str2;
        this.f25008r = u10Var;
        this.f25009s = k1Var;
        this.f25005c = arrayList2;
    }

    public c41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f25004b = arrayList;
        this.f25005c = arrayList2;
        this.e = arrayList3;
        this.f25006f = arrayList4;
        this.h = arrayList5;
        this.f25007n = arrayList6;
        this.f25008r = arrayList7;
        this.f25009s = arrayList8;
    }

    public c41(org.telegram.ui.Wallet.e2 e2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.b2 b2Var, ih.s sVar, org.telegram.ui.Wallet.h0 h0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = e2Var;
        this.f25006f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.f25007n = b2Var;
        this.f25004b = sVar;
        this.f25005c = h0Var;
        this.f25008r = jSONArray;
        this.f25009s = tL_urlAuthResultRequest;
    }

    public c41(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, ih.s sVar) {
        this.d = e2Var;
        this.e = h0Var;
        this.h = tonconnectsession;
        this.f25006f = str;
        this.f25007n = bArr;
        this.f25004b = jSONArray;
        this.f25005c = tL_urlAuthResultRequest;
        this.f25008r = tonconnectchallenge;
        this.f25009s = sVar;
    }
}
