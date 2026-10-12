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
    public final int f27209a = 2;
    public final Object f27210b;
    public final Object f27211c;
    public final Object d;
    public final Object e;
    public final Object f27212f;
    public final Object h;
    public final Object f27213n;
    public final Object f27214r;
    public final Object f27215s;

    public m51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bi.ma maVar) {
        this.d = tL_urlAuthResultRequest;
        this.f27212f = e3Var;
        this.h = e3VarArr;
        this.f27213n = context;
        this.f27210b = iArr;
        this.f27211c = c6Var;
        this.e = zArr;
        this.f27214r = inputtonconnectoauthsessionArr;
        this.f27215s = maVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String A;
        String str;
        switch (this.f27209a) {
            case 0:
                final org.telegram.ui.el elVar = (org.telegram.ui.el) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f27212f;
                LinearLayout linearLayout = (LinearLayout) this.f27213n;
                ArrayList arrayList = (ArrayList) this.f27210b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f27214r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f27215s;
                ArrayList arrayList2 = (ArrayList) this.f27211c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (A = x41.A(x41.F(str2, null, null))) != null) {
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
                                                translateController.setDialogTranslateTo(elVar2.f27849b, str4);
                                                m1Var.d(true);
                                                elVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.f27849b, str4);
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(elVar.getContext(), elVar.d), w7.a6.n(-1, 8));
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
                                                translateController.setDialogTranslateTo(elVar2.f27849b, str5);
                                                m1Var.d(true);
                                                elVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.f27849b, str5);
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
                ArrayList arrayList3 = (ArrayList) this.f27212f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f27213n;
                ArrayList arrayList6 = (ArrayList) this.f27214r;
                ArrayList arrayList7 = (ArrayList) this.f27215s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f27210b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f27211c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i15 = notificationsCustomSettingsActivity.f32159s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f32160w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f32160w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f32160w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f32160w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f27212f;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.h;
                Context context = (Context) this.f27213n;
                int[] iArr = (int[]) this.f27210b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f27211c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f27214r;
                bi.ma maVar = (bi.ma) this.f27215s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.rl0.f39819a = e3Var;
                    e3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.i2 B = org.telegram.ui.Wallet.d2.B(context, iArr[0], null, tL_urlAuthResultRequest, c6Var, new org.telegram.ui.j90(e3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, e3Var, maVar, 2), new org.telegram.ui.wc0(23, e3VarArr, zArr2));
                e3VarArr[0] = B;
                org.telegram.ui.rl0.f39819a = B;
                return;
            case 3:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f27212f;
                byte[] bArr = (byte[]) this.f27213n;
                JSONArray jSONArray = (JSONArray) this.f27210b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f27211c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f27214r;
                bi.f0 f0Var = (bi.f0) this.f27215s;
                d2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new bi.k8(d2Var, str6, bArr, org.telegram.ui.Wallet.d2.q(g0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, d2Var.f33043f.getCurrentTime()), f0Var, tonconnectsession, 13));
                    return;
                } catch (Exception e) {
                    f0Var.run(null, org.telegram.ui.Wallet.d2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.d;
                final String str7 = (String) this.f27212f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.a2) this.f27213n).f32918a;
                final bi.f0 f0Var2 = (bi.f0) this.f27210b;
                final org.telegram.ui.Wallet.g0 g0Var2 = (org.telegram.ui.Wallet.g0) this.f27211c;
                final JSONArray jSONArray2 = (JSONArray) this.f27214r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f27215s;
                org.telegram.ui.Wallet.j0 j0Var = d2Var2.f33041b;
                if (TextUtils.equals(str7, j0Var.r()) && Arrays.equals(bArr2, j0Var.w()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f19475id;
                    tonconnectregisterkey.client_id = str8;
                    d2Var2.f33043f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            d2 d2Var3 = d2.this;
                            bi.f0 f0Var3 = f0Var2;
                            g0 g0Var3 = g0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            d2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.globalQueue.postRunnable(new m51(d2Var3, g0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, f0Var3));
                            } else {
                                f0Var3.run(null, d2.x(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                f0Var2.run(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public m51(org.telegram.ui.el elVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = elVar;
        this.e = zArr;
        this.f27212f = str;
        this.f27213n = linearLayout;
        this.f27210b = arrayList;
        this.h = str2;
        this.f27214r = translateController;
        this.f27215s = m1Var;
        this.f27211c = arrayList2;
    }

    public m51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f27210b = arrayList;
        this.f27211c = arrayList2;
        this.e = arrayList3;
        this.f27212f = arrayList4;
        this.h = arrayList5;
        this.f27213n = arrayList6;
        this.f27214r = arrayList7;
        this.f27215s = arrayList8;
    }

    public m51(org.telegram.ui.Wallet.d2 d2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.a2 a2Var, bi.f0 f0Var, org.telegram.ui.Wallet.g0 g0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = d2Var;
        this.f27212f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.f27213n = a2Var;
        this.f27210b = f0Var;
        this.f27211c = g0Var;
        this.f27214r = jSONArray;
        this.f27215s = tL_urlAuthResultRequest;
    }

    public m51(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.g0 g0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, bi.f0 f0Var) {
        this.d = d2Var;
        this.e = g0Var;
        this.h = tonconnectsession;
        this.f27212f = str;
        this.f27213n = bArr;
        this.f27210b = jSONArray;
        this.f27211c = tL_urlAuthResultRequest;
        this.f27214r = tonconnectchallenge;
        this.f27215s = f0Var;
    }
}
