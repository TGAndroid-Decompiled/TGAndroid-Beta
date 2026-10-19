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
import org.telegram.ui.Components.g51;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class g51 implements Runnable {
    public final int f26479a = 2;
    public final Object f26480b;
    public final Object f26481c;
    public final Object d;
    public final Object e;
    public final Object f26482f;
    public final Object h;
    public final Object f26483n;
    public final Object f26484r;
    public final Object f26485s;

    public g51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.vb vbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f26482f = f3Var;
        this.h = f3VarArr;
        this.f26483n = context;
        this.f26480b = iArr;
        this.f26481c = d6Var;
        this.e = zArr;
        this.f26484r = inputtonconnectoauthsessionArr;
        this.f26485s = vbVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String A;
        String str;
        switch (this.f26479a) {
            case 0:
                final org.telegram.ui.rk rkVar = (org.telegram.ui.rk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f26482f;
                LinearLayout linearLayout = (LinearLayout) this.f26483n;
                ArrayList arrayList = (ArrayList) this.f26480b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f26484r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f26485s;
                ArrayList arrayList2 = (ArrayList) this.f26481c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (A = s41.A(s41.E(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, rkVar.getContext(), rkVar.d, false, false);
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
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, rkVar.getContext(), rkVar.d, false, false);
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
                                                org.telegram.ui.rk rkVar2 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar2.f27423b, str4);
                                                m1Var.d(true);
                                                rkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.rk rkVar3 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar3.f27423b, str4);
                                                m1Var.d(true);
                                                rkVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(rkVar.getContext(), rkVar.d), w7.z5.n(-1, 8));
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
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, rkVar.getContext(), rkVar.d, false, false);
                            e1Var3.setChecked(z10);
                            e1Var3.setText(language2.displayName);
                            if (z10 == 0) {
                                e1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.rk rkVar2 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar2.f27423b, str5);
                                                m1Var.d(true);
                                                rkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.rk rkVar3 = rkVar;
                                                translateController.setDialogTranslateTo(rkVar3.f27423b, str5);
                                                m1Var.d(true);
                                                rkVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f26482f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f26483n;
                ArrayList arrayList6 = (ArrayList) this.f26484r;
                ArrayList arrayList7 = (ArrayList) this.f26485s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f26480b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f26481c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i15 = notificationsCustomSettingsActivity.f33205s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f33206w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f33206w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f33206w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33206w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f26482f;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.h;
                Context context = (Context) this.f26483n;
                int[] iArr = (int[]) this.f26480b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f26481c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f26484r;
                ai.vb vbVar = (ai.vb) this.f26485s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.uk0.f42004a = f3Var;
                    f3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.k2 B = org.telegram.ui.Wallet.f2.B(context, iArr[0], null, tL_urlAuthResultRequest, d6Var, new org.telegram.ui.l80(f3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, f3Var, vbVar, 2), new org.telegram.ui.xg0(6, f3VarArr, zArr2));
                f3VarArr[0] = B;
                org.telegram.ui.uk0.f42004a = B;
                return;
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f26482f;
                byte[] bArr = (byte[]) this.f26483n;
                JSONArray jSONArray = (JSONArray) this.f26480b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f26481c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f26484r;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f26485s;
                f2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.g3(f2Var, str6, bArr, org.telegram.ui.Wallet.f2.q(j0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, f2Var.f34191f.getCurrentTime()), s1Var, tonconnectsession, 20));
                    return;
                } catch (Exception e) {
                    s1Var.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.d;
                final String str7 = (String) this.f26482f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.c2) this.f26483n).f34061a;
                final org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.f26480b;
                final org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.f26481c;
                final JSONArray jSONArray2 = (JSONArray) this.f26484r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f26485s;
                org.telegram.ui.Wallet.m0 m0Var = f2Var2.f34189b;
                if (TextUtils.equals(str7, m0Var.s()) && Arrays.equals(bArr2, m0Var.x()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f20531id;
                    tonconnectregisterkey.client_id = str8;
                    f2Var2.f34191f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
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
                                Utilities.globalQueue.postRunnable(new g51(f2Var3, j0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, s1Var3));
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

    public g51(org.telegram.ui.rk rkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = rkVar;
        this.e = zArr;
        this.f26482f = str;
        this.f26483n = linearLayout;
        this.f26480b = arrayList;
        this.h = str2;
        this.f26484r = translateController;
        this.f26485s = m1Var;
        this.f26481c = arrayList2;
    }

    public g51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f26480b = arrayList;
        this.f26481c = arrayList2;
        this.e = arrayList3;
        this.f26482f = arrayList4;
        this.h = arrayList5;
        this.f26483n = arrayList6;
        this.f26484r = arrayList7;
        this.f26485s = arrayList8;
    }

    public g51(org.telegram.ui.Wallet.f2 f2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.s1 s1Var, org.telegram.ui.Wallet.j0 j0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = f2Var;
        this.f26482f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.f26483n = c2Var;
        this.f26480b = s1Var;
        this.f26481c = j0Var;
        this.f26484r = jSONArray;
        this.f26485s = tL_urlAuthResultRequest;
    }

    public g51(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.j0 j0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.s1 s1Var) {
        this.d = f2Var;
        this.e = j0Var;
        this.h = tonconnectsession;
        this.f26482f = str;
        this.f26483n = bArr;
        this.f26480b = jSONArray;
        this.f26481c = tL_urlAuthResultRequest;
        this.f26484r = tonconnectchallenge;
        this.f26485s = s1Var;
    }
}
