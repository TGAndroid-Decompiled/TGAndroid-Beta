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
import org.telegram.ui.Components.f51;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class f51 implements Runnable {
    public final int f26084a = 2;
    public final Object f26085b;
    public final Object f26086c;
    public final Object d;
    public final Object e;
    public final Object f26087f;
    public final Object h;
    public final Object f26088n;
    public final Object f26089r;
    public final Object f26090s;

    public f51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.vb vbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f26087f = f3Var;
        this.h = f3VarArr;
        this.f26088n = context;
        this.f26085b = iArr;
        this.f26086c = d6Var;
        this.e = zArr;
        this.f26089r = inputtonconnectoauthsessionArr;
        this.f26090s = vbVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String A;
        String str;
        switch (this.f26084a) {
            case 0:
                final org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f26087f;
                LinearLayout linearLayout = (LinearLayout) this.f26088n;
                ArrayList arrayList = (ArrayList) this.f26085b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f26089r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f26090s;
                ArrayList arrayList2 = (ArrayList) this.f26086c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (A = r41.A(r41.F(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, tkVar.getContext(), tkVar.d, false, false);
                        e1Var.setChecked(true);
                        e1Var.setText(A);
                        linearLayout.addView(e1Var);
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
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, tkVar.getContext(), tkVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            e1Var2.setChecked(z12);
                            e1Var2.setText(language.displayName);
                            if (!z12) {
                                view = e1Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.tk tkVar2 = tkVar;
                                                translateController.setDialogTranslateTo(tkVar2.f27077b, str4);
                                                m1Var.d(true);
                                                tkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.tk tkVar3 = tkVar;
                                                translateController.setDialogTranslateTo(tkVar3.f27077b, str4);
                                                m1Var.d(true);
                                                tkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = e1Var2;
                            }
                            linearLayout.addView(view);
                            i10 = i11;
                            z12 = z11;
                        }
                    }
                    int i12 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(tkVar.getContext(), tkVar.d), w7.z5.n(-1, 8));
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
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, tkVar.getContext(), tkVar.d, false, false);
                            e1Var3.setChecked(z10);
                            e1Var3.setText(language2.displayName);
                            if (z10 == 0) {
                                e1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.tk tkVar2 = tkVar;
                                                translateController.setDialogTranslateTo(tkVar2.f27077b, str5);
                                                m1Var.d(true);
                                                tkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.tk tkVar3 = tkVar;
                                                translateController.setDialogTranslateTo(tkVar3.f27077b, str5);
                                                m1Var.d(true);
                                                tkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(e1Var3);
                        }
                        i13 = i14;
                    }
                    zArr[i12] = true;
                    return;
                }
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f26087f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f26088n;
                ArrayList arrayList6 = (ArrayList) this.f26089r;
                ArrayList arrayList7 = (ArrayList) this.f26090s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f26085b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f26086c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i15 = notificationsCustomSettingsActivity.f33199s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f33200w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f33200w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f33200w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33200w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f26087f;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.h;
                Context context = (Context) this.f26088n;
                int[] iArr = (int[]) this.f26085b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f26086c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f26089r;
                ai.vb vbVar = (ai.vb) this.f26090s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.wk0.f42876a = f3Var;
                    f3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.k2 B = org.telegram.ui.Wallet.f2.B(context, iArr[0], null, tL_urlAuthResultRequest, d6Var, new org.telegram.ui.n80(f3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, f3Var, vbVar, 2), new org.telegram.ui.yg0(6, f3VarArr, zArr2));
                f3VarArr[0] = B;
                org.telegram.ui.wk0.f42876a = B;
                return;
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f26087f;
                byte[] bArr = (byte[]) this.f26088n;
                JSONArray jSONArray = (JSONArray) this.f26085b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f26086c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f26089r;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f26090s;
                f2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.j3(f2Var, str6, bArr, org.telegram.ui.Wallet.f2.q(j0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, f2Var.f34171f.getCurrentTime()), s1Var, tonconnectsession, 20));
                    return;
                } catch (Exception e) {
                    s1Var.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.d;
                final String str7 = (String) this.f26087f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.c2) this.f26088n).f34040a;
                final org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.f26085b;
                final org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.f26086c;
                final JSONArray jSONArray2 = (JSONArray) this.f26089r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f26090s;
                org.telegram.ui.Wallet.m0 m0Var = f2Var2.f34169b;
                if (TextUtils.equals(str7, m0Var.s()) && Arrays.equals(bArr2, m0Var.x()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f20530id;
                    tonconnectregisterkey.client_id = str8;
                    f2Var2.f34171f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            f2 f2Var3 = f2.this;
                            s1 s1Var3 = s1Var2;
                            j0 j0Var3 = j0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            f2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.globalQueue.postRunnable(new f51(f2Var3, j0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, s1Var3));
                            } else {
                                s1Var3.run(null, f2.x(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                s1Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public f51(org.telegram.ui.tk tkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = tkVar;
        this.e = zArr;
        this.f26087f = str;
        this.f26088n = linearLayout;
        this.f26085b = arrayList;
        this.h = str2;
        this.f26089r = translateController;
        this.f26090s = m1Var;
        this.f26086c = arrayList2;
    }

    public f51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f26085b = arrayList;
        this.f26086c = arrayList2;
        this.e = arrayList3;
        this.f26087f = arrayList4;
        this.h = arrayList5;
        this.f26088n = arrayList6;
        this.f26089r = arrayList7;
        this.f26090s = arrayList8;
    }

    public f51(org.telegram.ui.Wallet.f2 f2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.s1 s1Var, org.telegram.ui.Wallet.j0 j0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = f2Var;
        this.f26087f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.f26088n = c2Var;
        this.f26085b = s1Var;
        this.f26086c = j0Var;
        this.f26089r = jSONArray;
        this.f26090s = tL_urlAuthResultRequest;
    }

    public f51(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.s1 s1Var) {
        this.d = f2Var;
        this.e = j0Var;
        this.h = tonconnectsession;
        this.f26087f = str;
        this.f26088n = bArr;
        this.f26085b = jSONArray;
        this.f26086c = tL_urlAuthResultRequest;
        this.f26089r = tonconnectchallenge;
        this.f26090s = s1Var;
    }
}
