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
import org.telegram.ui.Components.r51;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class r51 implements Runnable {
    public final int f30420a = 2;
    public final Object f30421b;
    public final Object f30422c;
    public final Object d;
    public final Object f30423e;
    public final Object f30424f;
    public final Object h;
    public final Object f30425n;
    public final Object f30426r;
    public final Object f30427s;

    public r51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.db dbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f30424f = e3Var;
        this.h = e3VarArr;
        this.f30425n = context;
        this.f30421b = iArr;
        this.f30422c = d6Var;
        this.f30423e = zArr;
        this.f30426r = inputtonconnectoauthsessionArr;
        this.f30427s = dbVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String B;
        String str;
        switch (this.f30420a) {
            case 0:
                final org.telegram.ui.al alVar = (org.telegram.ui.al) this.d;
                boolean[] zArr = (boolean[]) this.f30423e;
                String str2 = (String) this.f30424f;
                LinearLayout linearLayout = (LinearLayout) this.f30425n;
                ArrayList arrayList = (ArrayList) this.f30421b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f30426r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f30427s;
                ArrayList arrayList2 = (ArrayList) this.f30422c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (B = c51.B(c51.F(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, alVar.getContext(), alVar.d, false, false);
                        e1Var.setChecked(true);
                        e1Var.setText(B);
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
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, alVar.getContext(), alVar.d, false, false);
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
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.f31074b, str4);
                                                m1Var.d(true);
                                                alVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.f31074b, str4);
                                                m1Var.d(true);
                                                alVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(alVar.getContext(), alVar.d), w7.x5.n(-1, 8));
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
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, alVar.getContext(), alVar.d, false, false);
                            e1Var3.setChecked(z10);
                            e1Var3.setText(language2.displayName);
                            if (z10 == 0) {
                                e1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.f31074b, str5);
                                                m1Var.d(true);
                                                alVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.f31074b, str5);
                                                m1Var.d(true);
                                                alVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f30424f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f30425n;
                ArrayList arrayList6 = (ArrayList) this.f30426r;
                ArrayList arrayList7 = (ArrayList) this.f30427s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f30421b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f30422c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f30423e, true);
                int i15 = notificationsCustomSettingsActivity.f33896s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f33897w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f33897w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f33897w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33897w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f30424f;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.h;
                Context context = (Context) this.f30425n;
                int[] iArr = (int[]) this.f30421b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f30422c;
                boolean[] zArr2 = (boolean[]) this.f30423e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f30426r;
                ai.db dbVar = (ai.db) this.f30427s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.ll0.f39731a = e3Var;
                    e3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.k2 B2 = org.telegram.ui.Wallet.f2.B(context, iArr[0], null, tL_urlAuthResultRequest, d6Var, new org.telegram.ui.d90(e3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, e3Var, dbVar, 2), new org.telegram.ui.uf0(11, e3VarArr, zArr2));
                e3VarArr[0] = B2;
                org.telegram.ui.ll0.f39731a = B2;
                return;
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f30423e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f30424f;
                byte[] bArr = (byte[]) this.f30425n;
                JSONArray jSONArray = (JSONArray) this.f30421b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f30422c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f30426r;
                ai.m0 m0Var = (ai.m0) this.f30427s;
                f2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.a9(f2Var, str6, bArr, org.telegram.ui.Wallet.f2.q(i0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, f2Var.f34928f.getCurrentTime()), m0Var, tonconnectsession, 13));
                    return;
                } catch (Exception e7) {
                    m0Var.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth connect", e7));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.d;
                final String str7 = (String) this.f30424f;
                final byte[] bArr2 = (byte[]) this.f30423e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.c2) this.f30425n).f34766a;
                final ai.m0 m0Var2 = (ai.m0) this.f30421b;
                final org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f30422c;
                final JSONArray jSONArray2 = (JSONArray) this.f30426r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f30427s;
                org.telegram.ui.Wallet.l0 l0Var = f2Var2.f34925b;
                if (TextUtils.equals(str7, l0Var.r()) && Arrays.equals(bArr2, l0Var.w()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f20329id;
                    tonconnectregisterkey.client_id = str8;
                    f2Var2.f34928f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
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
                                Utilities.globalQueue.postRunnable(new r51(f2Var3, i0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, m0Var3));
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

    public r51(org.telegram.ui.al alVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = alVar;
        this.f30423e = zArr;
        this.f30424f = str;
        this.f30425n = linearLayout;
        this.f30421b = arrayList;
        this.h = str2;
        this.f30426r = translateController;
        this.f30427s = m1Var;
        this.f30422c = arrayList2;
    }

    public r51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f30421b = arrayList;
        this.f30422c = arrayList2;
        this.f30423e = arrayList3;
        this.f30424f = arrayList4;
        this.h = arrayList5;
        this.f30425n = arrayList6;
        this.f30426r = arrayList7;
        this.f30427s = arrayList8;
    }

    public r51(org.telegram.ui.Wallet.f2 f2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.c2 c2Var, ai.m0 m0Var, org.telegram.ui.Wallet.i0 i0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = f2Var;
        this.f30424f = str;
        this.f30423e = bArr;
        this.h = tonconnectsession;
        this.f30425n = c2Var;
        this.f30421b = m0Var;
        this.f30422c = i0Var;
        this.f30426r = jSONArray;
        this.f30427s = tL_urlAuthResultRequest;
    }

    public r51(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, ai.m0 m0Var) {
        this.d = f2Var;
        this.f30423e = i0Var;
        this.h = tonconnectsession;
        this.f30424f = str;
        this.f30425n = bArr;
        this.f30421b = jSONArray;
        this.f30422c = tL_urlAuthResultRequest;
        this.f30426r = tonconnectchallenge;
        this.f30427s = m0Var;
    }
}
