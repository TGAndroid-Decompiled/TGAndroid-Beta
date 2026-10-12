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
import org.telegram.ui.Components.v51;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class v51 implements Runnable {
    public final int f31404a = 2;
    public final Object f31405b;
    public final Object f31406c;
    public final Object d;
    public final Object f31407e;
    public final Object f31408f;
    public final Object h;
    public final Object f31409n;
    public final Object f31410r;
    public final Object f31411s;

    public v51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.db dbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f31408f = e3Var;
        this.h = e3VarArr;
        this.f31409n = context;
        this.f31405b = iArr;
        this.f31406c = c6Var;
        this.f31407e = zArr;
        this.f31410r = inputtonconnectoauthsessionArr;
        this.f31411s = dbVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String A;
        String str;
        switch (this.f31404a) {
            case 0:
                final org.telegram.ui.el elVar = (org.telegram.ui.el) this.d;
                boolean[] zArr = (boolean[]) this.f31407e;
                String str2 = (String) this.f31408f;
                LinearLayout linearLayout = (LinearLayout) this.f31409n;
                ArrayList arrayList = (ArrayList) this.f31405b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f31410r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f31411s;
                ArrayList arrayList2 = (ArrayList) this.f31406c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (A = g51.A(g51.F(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, elVar.getContext(), elVar.d, false, false);
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
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, elVar.getContext(), elVar.d, false, false);
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
                                                org.telegram.ui.el elVar2 = elVar;
                                                translateController.setDialogTranslateTo(elVar2.f32658b, str4);
                                                m1Var.d(true);
                                                elVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.f32658b, str4);
                                                m1Var.d(true);
                                                elVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(elVar.getContext(), elVar.d), w7.w5.n(-1, 8));
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
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, elVar.getContext(), elVar.d, false, false);
                            e1Var3.setChecked(z10);
                            e1Var3.setText(language2.displayName);
                            if (z10 == 0) {
                                e1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.el elVar2 = elVar;
                                                translateController.setDialogTranslateTo(elVar2.f32658b, str5);
                                                m1Var.d(true);
                                                elVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.f32658b, str5);
                                                m1Var.d(true);
                                                elVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f31408f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f31409n;
                ArrayList arrayList6 = (ArrayList) this.f31410r;
                ArrayList arrayList7 = (ArrayList) this.f31411s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f31405b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f31406c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f31407e, true);
                int i15 = notificationsCustomSettingsActivity.f33671s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f33672w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f33672w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f33672w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33672w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f31408f;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.h;
                Context context = (Context) this.f31409n;
                int[] iArr = (int[]) this.f31405b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f31406c;
                boolean[] zArr2 = (boolean[]) this.f31407e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f31410r;
                ai.db dbVar = (ai.db) this.f31411s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.nl0.f40430a = e3Var;
                    e3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.k2 B = org.telegram.ui.Wallet.f2.B(context, iArr[0], null, tL_urlAuthResultRequest, c6Var, new org.telegram.ui.g90(e3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, e3Var, dbVar, 2), new org.telegram.ui.og0(9, e3VarArr, zArr2));
                e3VarArr[0] = B;
                org.telegram.ui.nl0.f40430a = B;
                return;
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f31407e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f31408f;
                byte[] bArr = (byte[]) this.f31409n;
                JSONArray jSONArray = (JSONArray) this.f31405b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f31406c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f31410r;
                ai.m0 m0Var = (ai.m0) this.f31411s;
                f2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.a9(f2Var, str6, bArr, org.telegram.ui.Wallet.f2.q(i0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, f2Var.f34703f.getCurrentTime()), m0Var, tonconnectsession, 13));
                    return;
                } catch (Exception e7) {
                    m0Var.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth connect", e7));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.d;
                final String str7 = (String) this.f31408f;
                final byte[] bArr2 = (byte[]) this.f31407e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.c2) this.f31409n).f34541a;
                final ai.m0 m0Var2 = (ai.m0) this.f31405b;
                final org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f31406c;
                final JSONArray jSONArray2 = (JSONArray) this.f31410r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f31411s;
                org.telegram.ui.Wallet.l0 l0Var = f2Var2.f34700b;
                if (TextUtils.equals(str7, l0Var.r()) && Arrays.equals(bArr2, l0Var.w()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f20065id;
                    tonconnectregisterkey.client_id = str8;
                    f2Var2.f34703f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            f2 f2Var3 = f2.this;
                            ai.m0 m0Var3 = m0Var2;
                            i0 i0Var3 = i0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            f2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.globalQueue.postRunnable(new v51(f2Var3, i0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, m0Var3));
                            } else {
                                m0Var3.run(null, f2.x(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                m0Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public v51(org.telegram.ui.el elVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = elVar;
        this.f31407e = zArr;
        this.f31408f = str;
        this.f31409n = linearLayout;
        this.f31405b = arrayList;
        this.h = str2;
        this.f31410r = translateController;
        this.f31411s = m1Var;
        this.f31406c = arrayList2;
    }

    public v51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f31405b = arrayList;
        this.f31406c = arrayList2;
        this.f31407e = arrayList3;
        this.f31408f = arrayList4;
        this.h = arrayList5;
        this.f31409n = arrayList6;
        this.f31410r = arrayList7;
        this.f31411s = arrayList8;
    }

    public v51(org.telegram.ui.Wallet.f2 f2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.c2 c2Var, ai.m0 m0Var, org.telegram.ui.Wallet.i0 i0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = f2Var;
        this.f31408f = str;
        this.f31407e = bArr;
        this.h = tonconnectsession;
        this.f31409n = c2Var;
        this.f31405b = m0Var;
        this.f31406c = i0Var;
        this.f31410r = jSONArray;
        this.f31411s = tL_urlAuthResultRequest;
    }

    public v51(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, ai.m0 m0Var) {
        this.d = f2Var;
        this.f31407e = i0Var;
        this.h = tonconnectsession;
        this.f31408f = str;
        this.f31409n = bArr;
        this.f31405b = jSONArray;
        this.f31406c = tL_urlAuthResultRequest;
        this.f31410r = tonconnectchallenge;
        this.f31411s = m0Var;
    }
}
