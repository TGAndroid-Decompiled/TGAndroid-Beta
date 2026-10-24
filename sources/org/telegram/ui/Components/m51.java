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
import org.telegram.ui.Components.m51;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class m51 implements Runnable {
    public final int f28515a = 2;
    public final Object f28516b;
    public final Object f28517c;
    public final Object d;
    public final Object e;
    public final Object f28518f;
    public final Object h;
    public final Object f28519n;
    public final Object f28520r;
    public final Object f28521s;

    public m51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.g6 g6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, ai.wb wbVar) {
        this.d = tL_urlAuthResultRequest;
        this.f28518f = h3Var;
        this.h = h3VarArr;
        this.f28519n = context;
        this.f28516b = iArr;
        this.f28517c = g6Var;
        this.e = zArr;
        this.f28520r = inputtonconnectoauthsessionArr;
        this.f28521s = wbVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String J;
        String str;
        switch (this.f28515a) {
            case 0:
                final org.telegram.ui.sk skVar = (org.telegram.ui.sk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f28518f;
                LinearLayout linearLayout = (LinearLayout) this.f28519n;
                ArrayList arrayList = (ArrayList) this.f28516b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f28520r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f28521s;
                ArrayList arrayList2 = (ArrayList) this.f28517c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (J = x41.J(x41.N(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, skVar.getContext(), skVar.d, false, false);
                        e1Var.setChecked(true);
                        e1Var.setText(J);
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
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, skVar.getContext(), skVar.d, false, false);
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
                                                org.telegram.ui.sk skVar2 = skVar;
                                                translateController.setDialogTranslateTo(skVar2.f29145b, str4);
                                                m1Var.d(true);
                                                skVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.sk skVar3 = skVar;
                                                translateController.setDialogTranslateTo(skVar3.f29145b, str4);
                                                m1Var.d(true);
                                                skVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(skVar.getContext(), skVar.d), w7.z5.n(-1, 8));
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
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, skVar.getContext(), skVar.d, false, false);
                            e1Var3.setChecked(z10);
                            e1Var3.setText(language2.displayName);
                            if (z10 == 0) {
                                e1Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.sk skVar2 = skVar;
                                                translateController.setDialogTranslateTo(skVar2.f29145b, str5);
                                                m1Var.d(true);
                                                skVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.sk skVar3 = skVar;
                                                translateController.setDialogTranslateTo(skVar3.f29145b, str5);
                                                m1Var.d(true);
                                                skVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f28518f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f28519n;
                ArrayList arrayList6 = (ArrayList) this.f28520r;
                ArrayList arrayList7 = (ArrayList) this.f28521s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f28516b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f28517c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i15 = notificationsCustomSettingsActivity.f33515s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f33516w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f33516w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f33516w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33516w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f28518f;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.h;
                Context context = (Context) this.f28519n;
                int[] iArr = (int[]) this.f28516b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f28517c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f28520r;
                ai.wb wbVar = (ai.wb) this.f28521s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.wk0.f43370a = h3Var;
                    h3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.j2 B = org.telegram.ui.Wallet.e2.B(context, iArr[0], null, tL_urlAuthResultRequest, g6Var, new org.telegram.ui.r80(h3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, h3Var, wbVar, 2), new org.telegram.ui.ah0(6, h3VarArr, zArr2));
                h3VarArr[0] = B;
                org.telegram.ui.wk0.f43370a = B;
                return;
            case 3:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f28518f;
                byte[] bArr = (byte[]) this.f28519n;
                JSONArray jSONArray = (JSONArray) this.f28516b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f28517c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f28520r;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f28521s;
                e2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ai.g3(e2Var, str6, bArr, org.telegram.ui.Wallet.e2.q(i0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, e2Var.f34434f.getCurrentTime()), r1Var, tonconnectsession, 20));
                    return;
                } catch (Exception e) {
                    r1Var.run(null, org.telegram.ui.Wallet.e2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.d;
                final String str7 = (String) this.f28518f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.b2) this.f28519n).f34326a;
                final org.telegram.ui.Wallet.r1 r1Var2 = (org.telegram.ui.Wallet.r1) this.f28516b;
                final org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f28517c;
                final JSONArray jSONArray2 = (JSONArray) this.f28520r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f28521s;
                org.telegram.ui.Wallet.l0 l0Var = e2Var2.f34432b;
                if (TextUtils.equals(str7, l0Var.s()) && Arrays.equals(bArr2, l0Var.x()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f20602id;
                    tonconnectregisterkey.client_id = str8;
                    e2Var2.f34434f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
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
                                Utilities.globalQueue.postRunnable(new m51(e2Var3, i0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, r1Var3));
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

    public m51(org.telegram.ui.sk skVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = skVar;
        this.e = zArr;
        this.f28518f = str;
        this.f28519n = linearLayout;
        this.f28516b = arrayList;
        this.h = str2;
        this.f28520r = translateController;
        this.f28521s = m1Var;
        this.f28517c = arrayList2;
    }

    public m51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f28516b = arrayList;
        this.f28517c = arrayList2;
        this.e = arrayList3;
        this.f28518f = arrayList4;
        this.h = arrayList5;
        this.f28519n = arrayList6;
        this.f28520r = arrayList7;
        this.f28521s = arrayList8;
    }

    public m51(org.telegram.ui.Wallet.e2 e2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.r1 r1Var, org.telegram.ui.Wallet.i0 i0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = e2Var;
        this.f28518f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.f28519n = b2Var;
        this.f28516b = r1Var;
        this.f28517c = i0Var;
        this.f28520r = jSONArray;
        this.f28521s = tL_urlAuthResultRequest;
    }

    public m51(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.r1 r1Var) {
        this.d = e2Var;
        this.e = i0Var;
        this.h = tonconnectsession;
        this.f28518f = str;
        this.f28519n = bArr;
        this.f28516b = jSONArray;
        this.f28517c = tL_urlAuthResultRequest;
        this.f28520r = tonconnectchallenge;
        this.f28521s = r1Var;
    }
}
