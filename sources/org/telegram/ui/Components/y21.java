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
import org.telegram.ui.Components.y21;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class y21 implements Runnable {
    public final int f40548a = 2;
    public final Object f40549b;
    public final Object f40550c;
    public final Object d;
    public final Object f40551e;
    public final Object f40552f;
    public final Object h;
    public final Object f40553n;
    public final Object f40554r;
    public final Object f40555s;

    public y21(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.l0 l0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f40552f = v2Var;
        this.h = v2VarArr;
        this.f40553n = context;
        this.f40549b = iArr;
        this.f40550c = f6Var;
        this.f40551e = zArr;
        this.f40554r = inputtonconnectoauthsessionArr;
        this.f40555s = l0Var;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        View view;
        String K0;
        String str;
        switch (this.f40548a) {
            case 0:
                final org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.d;
                boolean[] zArr = (boolean[]) this.f40551e;
                String str2 = (String) this.f40552f;
                LinearLayout linearLayout = (LinearLayout) this.f40553n;
                ArrayList arrayList = (ArrayList) this.f40549b;
                String str3 = (String) this.h;
                final org.telegram.messenger.f10 f10Var = (org.telegram.messenger.f10) this.f40554r;
                final org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f40555s;
                ArrayList arrayList2 = (ArrayList) this.f40550c;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = k21.K0(k21.O0(str2, null, null))) != null) {
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
                        final String str4 = y00Var.f26569a;
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
                            z0Var2.setText(y00Var.f26570b);
                            if (!z11) {
                                view = z0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                f10Var.I(bkVar2.f31679b, str4);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                f10Var.I(bkVar3.f31679b, str4);
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
                        final String str5 = y00Var2.f26569a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z9 = 1;
                            } else {
                                z9 = i11;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                            z0Var3.setChecked(z9);
                            z0Var3.setText(y00Var2.f26570b);
                            if (z9 == 0) {
                                z0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                f10Var.I(bkVar2.f31679b, str5);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                f10Var.I(bkVar3.f31679b, str5);
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
                ArrayList arrayList3 = (ArrayList) this.f40552f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f40553n;
                ArrayList arrayList6 = (ArrayList) this.f40554r;
                ArrayList arrayList7 = (ArrayList) this.f40555s;
                notificationsCustomSettingsActivity.getMessagesController().Y3((ArrayList) this.f40549b, true);
                notificationsCustomSettingsActivity.getMessagesController().S3((ArrayList) this.f40550c, true);
                notificationsCustomSettingsActivity.getMessagesController().V3((ArrayList) this.f40551e);
                int i14 = notificationsCustomSettingsActivity.f41310s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f41312x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f41312x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f41312x = arrayList5;
                    notificationsCustomSettingsActivity.f41311w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f41312x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f40552f;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.h;
                Context context = (Context) this.f40553n;
                int[] iArr = (int[]) this.f40549b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f40550c;
                boolean[] zArr2 = (boolean[]) this.f40551e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f40554r;
                bg.l0 l0Var = (bg.l0) this.f40555s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.bi0.f44358a = v2Var;
                    v2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.z2 D = org.telegram.ui.Wallet.e2.D(context, iArr[0], null, tL_urlAuthResultRequest, f6Var, new org.telegram.ui.t60(v2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, v2Var, l0Var, 2), new org.telegram.ui.zc0(15, v2VarArr, zArr2));
                v2VarArr[0] = D;
                org.telegram.ui.bi0.f44358a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f40551e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f40552f;
                byte[] bArr = (byte[]) this.f40553n;
                JSONArray jSONArray = (JSONArray) this.f40549b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f40550c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f40554r;
                org.telegram.ui.Wallet.u1 u1Var = (org.telegram.ui.Wallet.u1) this.f40555s;
                e2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new bi.a3(e2Var, str6, bArr, org.telegram.ui.Wallet.e2.s(j0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, e2Var.f42431f.getCurrentTime()), u1Var, tonconnectsession, 21));
                    return;
                } catch (Exception e10) {
                    u1Var.a(null, org.telegram.ui.Wallet.e2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.d;
                final String str7 = (String) this.f40552f;
                final byte[] bArr2 = (byte[]) this.f40551e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.b2) this.f40553n).f42181a;
                final org.telegram.ui.Wallet.u1 u1Var2 = (org.telegram.ui.Wallet.u1) this.f40549b;
                final org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.f40550c;
                final JSONArray jSONArray2 = (JSONArray) this.f40554r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f40555s;
                org.telegram.ui.Wallet.m0 m0Var = e2Var2.f42428b;
                if (TextUtils.equals(str7, m0Var.t()) && Arrays.equals(bArr2, m0Var.y()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f27218id;
                    tonconnectregisterkey.client_id = str8;
                    e2Var2.f42431f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            e2 e2Var3 = e2.this;
                            u1 u1Var3 = u1Var2;
                            j0 j0Var3 = j0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            e2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f21336e.c(new y21(e2Var3, j0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, u1Var3));
                            } else {
                                u1Var3.a(null, e2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                u1Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public y21(org.telegram.ui.bk bkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.f10 f10Var, org.telegram.ui.ActionBar.g1 g1Var, ArrayList arrayList2) {
        this.d = bkVar;
        this.f40551e = zArr;
        this.f40552f = str;
        this.f40553n = linearLayout;
        this.f40549b = arrayList;
        this.h = str2;
        this.f40554r = f10Var;
        this.f40555s = g1Var;
        this.f40550c = arrayList2;
    }

    public y21(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f40549b = arrayList;
        this.f40550c = arrayList2;
        this.f40551e = arrayList3;
        this.f40552f = arrayList4;
        this.h = arrayList5;
        this.f40553n = arrayList6;
        this.f40554r = arrayList7;
        this.f40555s = arrayList8;
    }

    public y21(org.telegram.ui.Wallet.e2 e2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.u1 u1Var, org.telegram.ui.Wallet.j0 j0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = e2Var;
        this.f40552f = str;
        this.f40551e = bArr;
        this.h = tonconnectsession;
        this.f40553n = b2Var;
        this.f40549b = u1Var;
        this.f40550c = j0Var;
        this.f40554r = jSONArray;
        this.f40555s = tL_urlAuthResultRequest;
    }

    public y21(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.u1 u1Var) {
        this.d = e2Var;
        this.f40551e = j0Var;
        this.h = tonconnectsession;
        this.f40552f = str;
        this.f40553n = bArr;
        this.f40549b = jSONArray;
        this.f40550c = tL_urlAuthResultRequest;
        this.f40554r = tonconnectchallenge;
        this.f40555s = u1Var;
    }
}
