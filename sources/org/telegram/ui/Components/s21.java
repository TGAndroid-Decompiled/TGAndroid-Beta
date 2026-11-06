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
import org.telegram.ui.Components.s21;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class s21 implements Runnable {
    public final int f37919a = 2;
    public final Object f37920b;
    public final Object f37921c;
    public final Object d;
    public final Object f37922e;
    public final Object f37923f;
    public final Object h;
    public final Object f37924n;
    public final Object f37925r;
    public final Object f37926s;

    public s21(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.l0 l0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f37923f = v2Var;
        this.h = v2VarArr;
        this.f37924n = context;
        this.f37920b = iArr;
        this.f37921c = f6Var;
        this.f37922e = zArr;
        this.f37925r = inputtonconnectoauthsessionArr;
        this.f37926s = l0Var;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        View view;
        String K0;
        String str;
        switch (this.f37919a) {
            case 0:
                final org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.d;
                boolean[] zArr = (boolean[]) this.f37922e;
                String str2 = (String) this.f37923f;
                LinearLayout linearLayout = (LinearLayout) this.f37924n;
                ArrayList arrayList = (ArrayList) this.f37920b;
                String str3 = (String) this.h;
                final org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) this.f37925r;
                final org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f37926s;
                ArrayList arrayList2 = (ArrayList) this.f37921c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = e21.K0(e21.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                        z0Var.setChecked(true);
                        z0Var.setText(K0);
                        linearLayout.addView(z0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.y00 y00Var = (org.telegram.messenger.y00) arrayList.get(i7);
                        final String str4 = y00Var.f26554a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z10 = z11 ? 1 : 0;
                                z11 = true;
                            } else {
                                z10 = z11 ? 1 : 0;
                            }
                            z0Var2.setChecked(z11);
                            z0Var2.setText(y00Var.f26555b);
                            if (!z11) {
                                view = z0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                f10Var.I(bkVar2.f38505b, str4);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                f10Var.I(bkVar3.f38505b, str4);
                                                g1Var.d(true);
                                                bkVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(bkVar.getContext(), bkVar.d), c8.ha.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) arrayList2.get(i12);
                        final String str5 = y00Var2.f26554a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z9 = 1;
                            } else {
                                z9 = i11;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                            z0Var3.setChecked(z9);
                            z0Var3.setText(y00Var2.f26555b);
                            if (z9 == 0) {
                                z0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                f10Var.I(bkVar2.f38505b, str5);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                f10Var.I(bkVar3.f38505b, str5);
                                                g1Var.d(true);
                                                bkVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f37923f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f37924n;
                ArrayList arrayList6 = (ArrayList) this.f37925r;
                ArrayList arrayList7 = (ArrayList) this.f37926s;
                notificationsCustomSettingsActivity.getMessagesController().Y3((ArrayList) this.f37920b, true);
                notificationsCustomSettingsActivity.getMessagesController().S3((ArrayList) this.f37921c, true);
                notificationsCustomSettingsActivity.getMessagesController().V3((ArrayList) this.f37922e);
                int i14 = notificationsCustomSettingsActivity.f41282s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f41284x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f41284x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f41284x = arrayList5;
                    notificationsCustomSettingsActivity.f41283w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f41284x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f37923f;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.h;
                Context context = (Context) this.f37924n;
                int[] iArr = (int[]) this.f37920b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f37921c;
                boolean[] zArr2 = (boolean[]) this.f37922e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f37925r;
                bg.l0 l0Var = (bg.l0) this.f37926s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.bi0.f44340a = v2Var;
                    v2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.a3 D = org.telegram.ui.Wallet.f2.D(context, iArr[0], null, tL_urlAuthResultRequest, f6Var, new org.telegram.ui.t60(v2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, v2Var, l0Var, 2), new org.telegram.ui.zc0(15, v2VarArr, zArr2));
                v2VarArr[0] = D;
                org.telegram.ui.bi0.f44340a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f37922e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f37923f;
                byte[] bArr = (byte[]) this.f37924n;
                JSONArray jSONArray = (JSONArray) this.f37920b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f37921c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f37925r;
                org.telegram.ui.Wallet.v1 v1Var = (org.telegram.ui.Wallet.v1) this.f37926s;
                f2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new bi.a3(f2Var, str6, bArr, org.telegram.ui.Wallet.f2.s(k0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, f2Var.f42439f.getCurrentTime()), v1Var, tonconnectsession, 21));
                    return;
                } catch (Exception e10) {
                    v1Var.a(null, org.telegram.ui.Wallet.f2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.d;
                final String str7 = (String) this.f37923f;
                final byte[] bArr2 = (byte[]) this.f37922e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.c2) this.f37924n).f42191a;
                final org.telegram.ui.Wallet.v1 v1Var2 = (org.telegram.ui.Wallet.v1) this.f37920b;
                final org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.f37921c;
                final JSONArray jSONArray2 = (JSONArray) this.f37925r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f37926s;
                org.telegram.ui.Wallet.n0 n0Var = f2Var2.f42436b;
                if (TextUtils.equals(str7, n0Var.t()) && Arrays.equals(bArr2, n0Var.y()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f27214id;
                    tonconnectregisterkey.client_id = str8;
                    f2Var2.f42439f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            f2 f2Var3 = f2.this;
                            v1 v1Var3 = v1Var2;
                            k0 k0Var3 = k0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            f2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f21333e.c(new s21(f2Var3, k0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, v1Var3));
                            } else {
                                v1Var3.a(null, f2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                v1Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public s21(org.telegram.ui.bk bkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.f10 f10Var, org.telegram.ui.ActionBar.g1 g1Var, ArrayList arrayList2) {
        this.d = bkVar;
        this.f37922e = zArr;
        this.f37923f = str;
        this.f37924n = linearLayout;
        this.f37920b = arrayList;
        this.h = str2;
        this.f37925r = f10Var;
        this.f37926s = g1Var;
        this.f37921c = arrayList2;
    }

    public s21(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f37920b = arrayList;
        this.f37921c = arrayList2;
        this.f37922e = arrayList3;
        this.f37923f = arrayList4;
        this.h = arrayList5;
        this.f37924n = arrayList6;
        this.f37925r = arrayList7;
        this.f37926s = arrayList8;
    }

    public s21(org.telegram.ui.Wallet.f2 f2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.v1 v1Var, org.telegram.ui.Wallet.k0 k0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = f2Var;
        this.f37923f = str;
        this.f37922e = bArr;
        this.h = tonconnectsession;
        this.f37924n = c2Var;
        this.f37920b = v1Var;
        this.f37921c = k0Var;
        this.f37925r = jSONArray;
        this.f37926s = tL_urlAuthResultRequest;
    }

    public s21(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.v1 v1Var) {
        this.d = f2Var;
        this.f37922e = k0Var;
        this.h = tonconnectsession;
        this.f37923f = str;
        this.f37924n = bArr;
        this.f37920b = jSONArray;
        this.f37921c = tL_urlAuthResultRequest;
        this.f37925r = tonconnectchallenge;
        this.f37926s = v1Var;
    }
}
