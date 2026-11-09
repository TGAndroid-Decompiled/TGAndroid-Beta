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
import org.telegram.ui.Components.z21;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class z21 implements Runnable {
    public final int f40881a = 2;
    public final Object f40882b;
    public final Object f40883c;
    public final Object d;
    public final Object f40884e;
    public final Object f40885f;
    public final Object h;
    public final Object f40886n;
    public final Object f40887r;
    public final Object f40888s;

    public z21(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.g6 g6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.l0 l0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f40885f = v2Var;
        this.h = v2VarArr;
        this.f40886n = context;
        this.f40882b = iArr;
        this.f40883c = g6Var;
        this.f40884e = zArr;
        this.f40887r = inputtonconnectoauthsessionArr;
        this.f40888s = l0Var;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        View view;
        String K0;
        String str;
        switch (this.f40881a) {
            case 0:
                final org.telegram.ui.dk dkVar = (org.telegram.ui.dk) this.d;
                boolean[] zArr = (boolean[]) this.f40884e;
                String str2 = (String) this.f40885f;
                LinearLayout linearLayout = (LinearLayout) this.f40886n;
                ArrayList arrayList = (ArrayList) this.f40882b;
                String str3 = (String) this.h;
                final org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) this.f40887r;
                final org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f40888s;
                ArrayList arrayList2 = (ArrayList) this.f40883c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = l21.K0(l21.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, dkVar.getContext(), dkVar.d, false, false);
                        z0Var.setChecked(true);
                        z0Var.setText(K0);
                        linearLayout.addView(z0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) arrayList.get(i7);
                        final String str4 = y00Var.f26569a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, dkVar.getContext(), dkVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z10 = z11 ? 1 : 0;
                                z11 = true;
                            } else {
                                z10 = z11 ? 1 : 0;
                            }
                            z0Var2.setChecked(z11);
                            z0Var2.setText(y00Var.f26570b);
                            if (!z11) {
                                view = z0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.dk dkVar2 = dkVar;
                                                f10Var.I(dkVar2.f32077b, str4);
                                                g1Var.d(true);
                                                dkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.dk dkVar3 = dkVar;
                                                f10Var.I(dkVar3.f32077b, str4);
                                                g1Var.d(true);
                                                dkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = z0Var2;
                            }
                            linearLayout.addView(view);
                            i7 = i10;
                            z11 = z10;
                        }
                    }
                    int i11 = z11 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(dkVar.getContext(), dkVar.d), c8.ha.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) arrayList2.get(i12);
                        final String str5 = y00Var2.f26569a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z9 = 1;
                            } else {
                                z9 = i11;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, dkVar.getContext(), dkVar.d, false, false);
                            z0Var3.setChecked(z9);
                            z0Var3.setText(y00Var2.f26570b);
                            if (z9 == 0) {
                                z0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.dk dkVar2 = dkVar;
                                                f10Var.I(dkVar2.f32077b, str5);
                                                g1Var.d(true);
                                                dkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.dk dkVar3 = dkVar;
                                                f10Var.I(dkVar3.f32077b, str5);
                                                g1Var.d(true);
                                                dkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(z0Var3);
                        }
                        i12 = i13;
                    }
                    zArr[i11] = true;
                    return;
                }
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f40885f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f40886n;
                ArrayList arrayList6 = (ArrayList) this.f40887r;
                ArrayList arrayList7 = (ArrayList) this.f40888s;
                notificationsCustomSettingsActivity.getMessagesController().Y3((ArrayList) this.f40882b, true);
                notificationsCustomSettingsActivity.getMessagesController().S3((ArrayList) this.f40883c, true);
                notificationsCustomSettingsActivity.getMessagesController().V3((ArrayList) this.f40884e);
                int i14 = notificationsCustomSettingsActivity.f41317s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f41319x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f41319x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f41319x = arrayList5;
                    notificationsCustomSettingsActivity.f41318w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f41319x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f40885f;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.h;
                Context context = (Context) this.f40886n;
                int[] iArr = (int[]) this.f40882b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f40883c;
                boolean[] zArr2 = (boolean[]) this.f40884e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f40887r;
                bg.l0 l0Var = (bg.l0) this.f40888s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.di0.f44987a = v2Var;
                    v2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.y2 D = org.telegram.ui.Wallet.d2.D(context, iArr[0], null, tL_urlAuthResultRequest, g6Var, new org.telegram.ui.v60(v2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, v2Var, l0Var, 2), new org.telegram.ui.bd0(15, v2VarArr, zArr2));
                v2VarArr[0] = D;
                org.telegram.ui.di0.f44987a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f40884e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f40885f;
                byte[] bArr = (byte[]) this.f40886n;
                JSONArray jSONArray = (JSONArray) this.f40882b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f40883c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f40887r;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f40888s;
                d2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new bi.a3(d2Var, str6, bArr, org.telegram.ui.Wallet.d2.s(i0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, d2Var.f42349f.getCurrentTime()), t1Var, tonconnectsession, 21));
                    return;
                } catch (Exception e10) {
                    t1Var.a(null, org.telegram.ui.Wallet.d2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.d;
                final String str7 = (String) this.f40885f;
                final byte[] bArr2 = (byte[]) this.f40884e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.a2) this.f40886n).f42101a;
                final org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) this.f40882b;
                final org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f40883c;
                final JSONArray jSONArray2 = (JSONArray) this.f40887r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f40888s;
                org.telegram.ui.Wallet.l0 l0Var2 = d2Var2.f42346b;
                if (TextUtils.equals(str7, l0Var2.t()) && Arrays.equals(bArr2, l0Var2.y()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f27218id;
                    tonconnectregisterkey.client_id = str8;
                    d2Var2.f42349f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            d2 d2Var3 = d2.this;
                            t1 t1Var3 = t1Var2;
                            i0 i0Var3 = i0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            d2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f21336e.c(new z21(d2Var3, i0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, t1Var3));
                            } else {
                                t1Var3.a(null, d2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                t1Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public z21(org.telegram.ui.dk dkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.f10 f10Var, org.telegram.ui.ActionBar.g1 g1Var, ArrayList arrayList2) {
        this.d = dkVar;
        this.f40884e = zArr;
        this.f40885f = str;
        this.f40886n = linearLayout;
        this.f40882b = arrayList;
        this.h = str2;
        this.f40887r = f10Var;
        this.f40888s = g1Var;
        this.f40883c = arrayList2;
    }

    public z21(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f40882b = arrayList;
        this.f40883c = arrayList2;
        this.f40884e = arrayList3;
        this.f40885f = arrayList4;
        this.h = arrayList5;
        this.f40886n = arrayList6;
        this.f40887r = arrayList7;
        this.f40888s = arrayList8;
    }

    public z21(org.telegram.ui.Wallet.d2 d2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.t1 t1Var, org.telegram.ui.Wallet.i0 i0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = d2Var;
        this.f40885f = str;
        this.f40884e = bArr;
        this.h = tonconnectsession;
        this.f40886n = a2Var;
        this.f40882b = t1Var;
        this.f40883c = i0Var;
        this.f40887r = jSONArray;
        this.f40888s = tL_urlAuthResultRequest;
    }

    public z21(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.t1 t1Var) {
        this.d = d2Var;
        this.f40884e = i0Var;
        this.h = tonconnectsession;
        this.f40885f = str;
        this.f40886n = bArr;
        this.f40882b = jSONArray;
        this.f40883c = tL_urlAuthResultRequest;
        this.f40887r = tonconnectchallenge;
        this.f40888s = t1Var;
    }
}
