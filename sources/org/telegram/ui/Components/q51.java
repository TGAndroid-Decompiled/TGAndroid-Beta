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
import org.telegram.ui.Components.q51;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class q51 implements Runnable {
    public final int f30054a = 2;
    public final Object f30055b;
    public final Object f30056c;
    public final Object d;
    public final Object f30057e;
    public final Object f30058f;
    public final Object h;
    public final Object f30059n;
    public final Object f30060r;
    public final Object f30061s;

    public q51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.db dbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f30058f = f3Var;
        this.h = f3VarArr;
        this.f30059n = context;
        this.f30055b = iArr;
        this.f30056c = e6Var;
        this.f30057e = zArr;
        this.f30060r = inputtonconnectoauthsessionArr;
        this.f30061s = dbVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String B;
        String str;
        switch (this.f30054a) {
            case 0:
                final org.telegram.ui.al alVar = (org.telegram.ui.al) this.d;
                boolean[] zArr = (boolean[]) this.f30057e;
                String str2 = (String) this.f30058f;
                LinearLayout linearLayout = (LinearLayout) this.f30059n;
                ArrayList arrayList = (ArrayList) this.f30055b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f30060r;
                final org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f30061s;
                ArrayList arrayList2 = (ArrayList) this.f30056c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (B = b51.B(b51.F(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, alVar.getContext(), alVar.d, false, false);
                        f1Var.setChecked(true);
                        f1Var.setText(B);
                        linearLayout.addView(f1Var);
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
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, alVar.getContext(), alVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            f1Var2.setChecked(z12);
                            f1Var2.setText(language.displayName);
                            if (!z12) {
                                view = f1Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.f30666b, str4);
                                                n1Var.d(true);
                                                alVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.f30666b, str4);
                                                n1Var.d(true);
                                                alVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = f1Var2;
                            }
                            linearLayout.addView(view);
                            i10 = i11;
                            z12 = z11;
                        }
                    }
                    int i12 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.k1(alVar.getContext(), alVar.d), w7.x5.n(-1, 8));
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
                            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, alVar.getContext(), alVar.d, false, false);
                            f1Var3.setChecked(z10);
                            f1Var3.setText(language2.displayName);
                            if (z10 == 0) {
                                f1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.f30666b, str5);
                                                n1Var.d(true);
                                                alVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.f30666b, str5);
                                                n1Var.d(true);
                                                alVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(f1Var3);
                        }
                        i13 = i14;
                    }
                    zArr[i12] = true;
                    return;
                }
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f30058f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f30059n;
                ArrayList arrayList6 = (ArrayList) this.f30060r;
                ArrayList arrayList7 = (ArrayList) this.f30061s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f30055b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f30056c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f30057e, true);
                int i15 = notificationsCustomSettingsActivity.f33834s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f33835w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f33835w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f33835w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33835w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f30058f;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.h;
                Context context = (Context) this.f30059n;
                int[] iArr = (int[]) this.f30055b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f30056c;
                boolean[] zArr2 = (boolean[]) this.f30057e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f30060r;
                ai.db dbVar = (ai.db) this.f30061s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.ml0.f39936a = f3Var;
                    f3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.i2 B2 = org.telegram.ui.Wallet.d2.B(context, iArr[0], null, tL_urlAuthResultRequest, e6Var, new org.telegram.ui.e90(f3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, f3Var, dbVar, 2), new org.telegram.ui.tf0(12, f3VarArr, zArr2));
                f3VarArr[0] = B2;
                org.telegram.ui.ml0.f39936a = B2;
                return;
            case 3:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f30057e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f30058f;
                byte[] bArr = (byte[]) this.f30059n;
                JSONArray jSONArray = (JSONArray) this.f30055b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f30056c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f30060r;
                ai.m0 m0Var = (ai.m0) this.f30061s;
                d2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.a9(d2Var, str6, bArr, org.telegram.ui.Wallet.d2.q(h0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, d2Var.f34791f.getCurrentTime()), m0Var, tonconnectsession, 13));
                    return;
                } catch (Exception e7) {
                    m0Var.run(null, org.telegram.ui.Wallet.d2.h("prepare OAuth connect", e7));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.d;
                final String str7 = (String) this.f30058f;
                final byte[] bArr2 = (byte[]) this.f30057e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.a2) this.f30059n).f34610a;
                final ai.m0 m0Var2 = (ai.m0) this.f30055b;
                final org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f30056c;
                final JSONArray jSONArray2 = (JSONArray) this.f30060r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f30061s;
                org.telegram.ui.Wallet.k0 k0Var = d2Var2.f34788b;
                if (TextUtils.equals(str7, k0Var.r()) && Arrays.equals(bArr2, k0Var.w()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f20299id;
                    tonconnectregisterkey.client_id = str8;
                    d2Var2.f34791f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            d2 d2Var3 = d2.this;
                            ai.m0 m0Var3 = m0Var2;
                            h0 h0Var3 = h0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            d2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.globalQueue.postRunnable(new q51(d2Var3, h0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, m0Var3));
                            } else {
                                m0Var3.run(null, d2.x(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                m0Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public q51(org.telegram.ui.al alVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.n1 n1Var, ArrayList arrayList2) {
        this.d = alVar;
        this.f30057e = zArr;
        this.f30058f = str;
        this.f30059n = linearLayout;
        this.f30055b = arrayList;
        this.h = str2;
        this.f30060r = translateController;
        this.f30061s = n1Var;
        this.f30056c = arrayList2;
    }

    public q51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f30055b = arrayList;
        this.f30056c = arrayList2;
        this.f30057e = arrayList3;
        this.f30058f = arrayList4;
        this.h = arrayList5;
        this.f30059n = arrayList6;
        this.f30060r = arrayList7;
        this.f30061s = arrayList8;
    }

    public q51(org.telegram.ui.Wallet.d2 d2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.a2 a2Var, ai.m0 m0Var, org.telegram.ui.Wallet.h0 h0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = d2Var;
        this.f30058f = str;
        this.f30057e = bArr;
        this.h = tonconnectsession;
        this.f30059n = a2Var;
        this.f30055b = m0Var;
        this.f30056c = h0Var;
        this.f30060r = jSONArray;
        this.f30061s = tL_urlAuthResultRequest;
    }

    public q51(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, ai.m0 m0Var) {
        this.d = d2Var;
        this.f30057e = h0Var;
        this.h = tonconnectsession;
        this.f30058f = str;
        this.f30059n = bArr;
        this.f30055b = jSONArray;
        this.f30056c = tL_urlAuthResultRequest;
        this.f30060r = tonconnectchallenge;
        this.f30061s = m0Var;
    }
}
