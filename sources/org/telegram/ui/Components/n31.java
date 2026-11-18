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
import org.telegram.ui.Components.n31;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class n31 implements Runnable {
    public final int f37715a = 2;
    public final Object f37716b;
    public final Object f37717c;
    public final Object d;
    public final Object f37718e;
    public final Object f37719f;
    public final Object h;
    public final Object f37720n;
    public final Object f37721r;
    public final Object f37722s;

    public n31(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.x2[] x2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.i6 i6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.m0 m0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f37719f = x2Var;
        this.h = x2VarArr;
        this.f37720n = context;
        this.f37716b = iArr;
        this.f37717c = i6Var;
        this.f37718e = zArr;
        this.f37721r = inputtonconnectoauthsessionArr;
        this.f37722s = m0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String L0;
        String str;
        switch (this.f37715a) {
            case 0:
                final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.d;
                boolean[] zArr = (boolean[]) this.f37718e;
                String str2 = (String) this.f37719f;
                LinearLayout linearLayout = (LinearLayout) this.f37720n;
                ArrayList arrayList = (ArrayList) this.f37716b;
                String str3 = (String) this.h;
                final org.telegram.messenger.z00 z00Var = (org.telegram.messenger.z00) this.f37721r;
                final org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f37722s;
                ArrayList arrayList2 = (ArrayList) this.f37717c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (L0 = y21.L0(y21.P0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, ckVar.getContext(), ckVar.d, false, false);
                        z0Var.setChecked(true);
                        z0Var.setText(L0);
                        linearLayout.addView(z0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.s00 s00Var = (org.telegram.messenger.s00) arrayList.get(i7);
                        final String str4 = s00Var.f26718a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, ckVar.getContext(), ckVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            z0Var2.setChecked(z12);
                            z0Var2.setText(s00Var.f26719b);
                            if (!z12) {
                                view = z0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                z00Var.I(ckVar2.f38256b, str4);
                                                h1Var.d(true);
                                                ckVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                z00Var.I(ckVar3.f38256b, str4);
                                                h1Var.d(true);
                                                ckVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = z0Var2;
                            }
                            linearLayout.addView(view);
                            i7 = i10;
                            z12 = z11;
                        }
                    }
                    int i11 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.e1(ckVar.getContext(), ckVar.d), c8.ma.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        org.telegram.messenger.s00 s00Var2 = (org.telegram.messenger.s00) arrayList2.get(i12);
                        final String str5 = s00Var2.f26718a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z10 = 1;
                            } else {
                                z10 = i11;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, ckVar.getContext(), ckVar.d, false, false);
                            z0Var3.setChecked(z10);
                            z0Var3.setText(s00Var2.f26719b);
                            if (z10 == 0) {
                                z0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                z00Var.I(ckVar2.f38256b, str5);
                                                h1Var.d(true);
                                                ckVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                z00Var.I(ckVar3.f38256b, str5);
                                                h1Var.d(true);
                                                ckVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f37719f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f37720n;
                ArrayList arrayList6 = (ArrayList) this.f37721r;
                ArrayList arrayList7 = (ArrayList) this.f37722s;
                notificationsCustomSettingsActivity.getMessagesController().f4((ArrayList) this.f37716b, true);
                notificationsCustomSettingsActivity.getMessagesController().Z3((ArrayList) this.f37717c, true);
                notificationsCustomSettingsActivity.getMessagesController().c4((ArrayList) this.f37718e);
                int i14 = notificationsCustomSettingsActivity.f43123s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f43125x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f43125x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f43125x = arrayList5;
                    notificationsCustomSettingsActivity.f43124w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f43125x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f37719f;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.h;
                Context context = (Context) this.f37720n;
                int[] iArr = (int[]) this.f37716b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f37717c;
                boolean[] zArr2 = (boolean[]) this.f37718e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f37721r;
                bg.m0 m0Var = (bg.m0) this.f37722s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.gi0.f48115a = x2Var;
                    x2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.e3 D = org.telegram.ui.Wallet.l2.D(context, iArr[0], null, tL_urlAuthResultRequest, i6Var, new org.telegram.ui.t60(x2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, x2Var, m0Var, 2), new org.telegram.ui.ve0(6, x2VarArr, zArr2));
                x2VarArr[0] = D;
                org.telegram.ui.gi0.f48115a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f37718e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f37719f;
                byte[] bArr = (byte[]) this.f37720n;
                JSONArray jSONArray = (JSONArray) this.f37716b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f37717c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f37721r;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f37722s;
                l2Var.getClass();
                try {
                    org.telegram.messenger.g0.g3(new bi.h2(l2Var, str6, bArr, org.telegram.ui.Wallet.l2.s(r0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, l2Var.f44483f.getCurrentTime()), e0Var, tonconnectsession, 22));
                    return;
                } catch (Exception e10) {
                    e0Var.a(null, org.telegram.ui.Wallet.l2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) this.d;
                final String str7 = (String) this.f37719f;
                final byte[] bArr2 = (byte[]) this.f37718e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.i2) this.f37720n).f44341a;
                final org.telegram.ui.Wallet.e0 e0Var2 = (org.telegram.ui.Wallet.e0) this.f37716b;
                final org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.f37717c;
                final JSONArray jSONArray2 = (JSONArray) this.f37721r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f37722s;
                org.telegram.ui.Wallet.u0 u0Var = l2Var2.f44480b;
                if (TextUtils.equals(str7, u0Var.y()) && Arrays.equals(bArr2, u0Var.E()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f28667id;
                    tonconnectregisterkey.client_id = str8;
                    l2Var2.f44483f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.q10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            l2 l2Var3 = l2.this;
                            e0 e0Var3 = e0Var2;
                            r0 r0Var3 = r0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            l2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f22782e.c(new n31(l2Var3, r0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, e0Var3));
                            } else {
                                e0Var3.a(null, l2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                e0Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public n31(org.telegram.ui.ck ckVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.z00 z00Var, org.telegram.ui.ActionBar.h1 h1Var, ArrayList arrayList2) {
        this.d = ckVar;
        this.f37718e = zArr;
        this.f37719f = str;
        this.f37720n = linearLayout;
        this.f37716b = arrayList;
        this.h = str2;
        this.f37721r = z00Var;
        this.f37722s = h1Var;
        this.f37717c = arrayList2;
    }

    public n31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f37716b = arrayList;
        this.f37717c = arrayList2;
        this.f37718e = arrayList3;
        this.f37719f = arrayList4;
        this.h = arrayList5;
        this.f37720n = arrayList6;
        this.f37721r = arrayList7;
        this.f37722s = arrayList8;
    }

    public n31(org.telegram.ui.Wallet.l2 l2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.Wallet.e0 e0Var, org.telegram.ui.Wallet.r0 r0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = l2Var;
        this.f37719f = str;
        this.f37718e = bArr;
        this.h = tonconnectsession;
        this.f37720n = i2Var;
        this.f37716b = e0Var;
        this.f37717c = r0Var;
        this.f37721r = jSONArray;
        this.f37722s = tL_urlAuthResultRequest;
    }

    public n31(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.e0 e0Var) {
        this.d = l2Var;
        this.f37718e = r0Var;
        this.h = tonconnectsession;
        this.f37719f = str;
        this.f37720n = bArr;
        this.f37716b = jSONArray;
        this.f37717c = tL_urlAuthResultRequest;
        this.f37721r = tonconnectchallenge;
        this.f37722s = e0Var;
    }
}
