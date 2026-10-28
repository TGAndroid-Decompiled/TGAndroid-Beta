package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.w51;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class w51 implements Runnable {
    public final int f34453a = 2;
    public final Object f34454b;
    public final Object f34455c;
    public final Object d;
    public final Object e;
    public final Object f34456f;
    public final Object h;
    public final Object f34457n;
    public final Object f34458r;
    public final Object f34459s;

    public w51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.k3[] k3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.u6 u6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ag.q0 q0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f34456f = k3Var;
        this.h = k3VarArr;
        this.f34457n = context;
        this.f34454b = iArr;
        this.f34455c = u6Var;
        this.e = zArr;
        this.f34458r = inputtonconnectoauthsessionArr;
        this.f34459s = q0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String J;
        String str;
        switch (this.f34453a) {
            case 0:
                final org.telegram.ui.vk vkVar = (org.telegram.ui.vk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f34456f;
                LinearLayout linearLayout = (LinearLayout) this.f34457n;
                ArrayList arrayList = (ArrayList) this.f34454b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f34458r;
                final org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f34459s;
                ArrayList arrayList2 = (ArrayList) this.f34455c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (J = g51.J(g51.N(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, vkVar.getContext(), vkVar.d, false, false);
                        g1Var.setChecked(true);
                        g1Var.setText(J);
                        linearLayout.addView(g1Var);
                    }
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str4 = language.code;
                        if (TextUtils.equals(str4, str3)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, vkVar.getContext(), vkVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            g1Var2.setChecked(z12);
                            g1Var2.setText(language.displayName);
                            if (!z12) {
                                view = g1Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.vk vkVar2 = vkVar;
                                                translateController.setDialogTranslateTo(vkVar2.f34967b, str4);
                                                o1Var.d(true);
                                                vkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.vk vkVar3 = vkVar;
                                                translateController.setDialogTranslateTo(vkVar3.f34967b, str4);
                                                o1Var.d(true);
                                                vkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = g1Var2;
                            }
                            linearLayout.addView(view);
                            i10 = i11;
                            z12 = z11;
                        }
                    }
                    int i12 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.l1(vkVar.getContext(), vkVar.d), kb1.r(-1, 8));
                    int size2 = arrayList2.size();
                    int i13 = i12;
                    while (i13 < size2) {
                        int i14 = i13 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i13);
                        final String str5 = language2.code;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z10 = 1;
                            } else {
                                z10 = i12;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, vkVar.getContext(), vkVar.d, false, false);
                            g1Var3.setChecked(z10);
                            g1Var3.setText(language2.displayName);
                            if (z10 == 0) {
                                g1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.vk vkVar2 = vkVar;
                                                translateController.setDialogTranslateTo(vkVar2.f34967b, str5);
                                                o1Var.d(true);
                                                vkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.vk vkVar3 = vkVar;
                                                translateController.setDialogTranslateTo(vkVar3.f34967b, str5);
                                                o1Var.d(true);
                                                vkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(g1Var3);
                        }
                        i13 = i14;
                    }
                    zArr[i12] = true;
                    return;
                }
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f34456f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f34457n;
                ArrayList arrayList6 = (ArrayList) this.f34458r;
                ArrayList arrayList7 = (ArrayList) this.f34459s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f34454b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f34455c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i15 = notificationsCustomSettingsActivity.f35603s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f35604w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f35604w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f35604w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f35604w = arrayList7;
                }
                notificationsCustomSettingsActivity.m0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f34456f;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.h;
                Context context = (Context) this.f34457n;
                int[] iArr = (int[]) this.f34454b;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f34455c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f34458r;
                ag.q0 q0Var = (ag.q0) this.f34459s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.fl0.f39397a = k3Var;
                    k3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.j2 B = org.telegram.ui.Wallet.e2.B(context, iArr[0], null, tL_urlAuthResultRequest, u6Var, new org.telegram.ui.r80(k3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, k3Var, q0Var, 2), new org.telegram.ui.kb0(26, k3VarArr, zArr2));
                k3VarArr[0] = B;
                org.telegram.ui.fl0.f39397a = B;
                return;
            case 3:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f34456f;
                byte[] bArr = (byte[]) this.f34457n;
                JSONArray jSONArray = (JSONArray) this.f34454b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f34455c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f34458r;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f34459s;
                e2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new bi.c3(e2Var, str6, bArr, org.telegram.ui.Wallet.e2.q(i0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, e2Var.f36516f.getCurrentTime()), r1Var, tonconnectsession, 20));
                    return;
                } catch (Exception e) {
                    r1Var.run(null, org.telegram.ui.Wallet.e2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.d;
                final String str7 = (String) this.f34456f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.b2) this.f34457n).f36413a;
                final org.telegram.ui.Wallet.r1 r1Var2 = (org.telegram.ui.Wallet.r1) this.f34454b;
                final org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f34455c;
                final JSONArray jSONArray2 = (JSONArray) this.f34458r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f34459s;
                org.telegram.ui.Wallet.l0 l0Var = e2Var2.f36514b;
                if (TextUtils.equals(str7, l0Var.t()) && Arrays.equals(bArr2, l0Var.y()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f22291id;
                    tonconnectregisterkey.client_id = str8;
                    e2Var2.f36516f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            e2 e2Var3 = e2.this;
                            r1 r1Var3 = r1Var2;
                            i0 i0Var3 = i0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            e2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.globalQueue.postRunnable(new w51(e2Var3, i0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, r1Var3));
                            } else {
                                r1Var3.run(null, e2.x(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                r1Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public w51(org.telegram.ui.vk vkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.o1 o1Var, ArrayList arrayList2) {
        this.d = vkVar;
        this.e = zArr;
        this.f34456f = str;
        this.f34457n = linearLayout;
        this.f34454b = arrayList;
        this.h = str2;
        this.f34458r = translateController;
        this.f34459s = o1Var;
        this.f34455c = arrayList2;
    }

    public w51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f34454b = arrayList;
        this.f34455c = arrayList2;
        this.e = arrayList3;
        this.f34456f = arrayList4;
        this.h = arrayList5;
        this.f34457n = arrayList6;
        this.f34458r = arrayList7;
        this.f34459s = arrayList8;
    }

    public w51(org.telegram.ui.Wallet.e2 e2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.r1 r1Var, org.telegram.ui.Wallet.i0 i0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = e2Var;
        this.f34456f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.f34457n = b2Var;
        this.f34454b = r1Var;
        this.f34455c = i0Var;
        this.f34458r = jSONArray;
        this.f34459s = tL_urlAuthResultRequest;
    }

    public w51(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.r1 r1Var) {
        this.d = e2Var;
        this.e = i0Var;
        this.h = tonconnectsession;
        this.f34456f = str;
        this.f34457n = bArr;
        this.f34454b = jSONArray;
        this.f34455c = tL_urlAuthResultRequest;
        this.f34458r = tonconnectchallenge;
        this.f34459s = r1Var;
    }
}
