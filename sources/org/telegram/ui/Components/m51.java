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
    public final int f26927a = 2;
    public final Object f26928b;
    public final Object f26929c;
    public final Object d;
    public final Object e;
    public final Object f26930f;
    public final Object h;
    public final Object f26931n;
    public final Object f26932r;
    public final Object f26933s;

    public m51(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bi.ma maVar) {
        this.d = tL_urlAuthResultRequest;
        this.f26930f = e3Var;
        this.h = e3VarArr;
        this.f26931n = context;
        this.f26928b = iArr;
        this.f26929c = c6Var;
        this.e = zArr;
        this.f26932r = inputtonconnectoauthsessionArr;
        this.f26933s = maVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String B;
        String str;
        switch (this.f26927a) {
            case 0:
                final org.telegram.ui.el elVar = (org.telegram.ui.el) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str2 = (String) this.f26930f;
                LinearLayout linearLayout = (LinearLayout) this.f26931n;
                ArrayList arrayList = (ArrayList) this.f26928b;
                String str3 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f26932r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f26933s;
                ArrayList arrayList2 = (ArrayList) this.f26929c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (B = x41.B(x41.F(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, elVar.getContext(), elVar.d, false, false);
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
                                                translateController.setDialogTranslateTo(elVar2.f27845b, str4);
                                                m1Var.d(true);
                                                elVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.f27845b, str4);
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(elVar.getContext(), elVar.d), w7.z5.n(-1, 8));
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
                                                translateController.setDialogTranslateTo(elVar2.f27845b, str5);
                                                m1Var.d(true);
                                                elVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.el elVar3 = elVar;
                                                translateController.setDialogTranslateTo(elVar3.f27845b, str5);
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
                ArrayList arrayList3 = (ArrayList) this.f26930f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f26931n;
                ArrayList arrayList6 = (ArrayList) this.f26932r;
                ArrayList arrayList7 = (ArrayList) this.f26933s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers((ArrayList) this.f26928b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats((ArrayList) this.f26929c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i15 = notificationsCustomSettingsActivity.f31861s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f31862w = arrayList3;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f31862w = arrayList4;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f31862w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f31862w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f26930f;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.h;
                Context context = (Context) this.f26931n;
                int[] iArr = (int[]) this.f26928b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f26929c;
                boolean[] zArr2 = (boolean[]) this.e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f26932r;
                bi.ma maVar = (bi.ma) this.f26933s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.ql0.f39184a = e3Var;
                    e3Var.show();
                    return;
                }
                org.telegram.ui.Wallet.j2 B2 = org.telegram.ui.Wallet.e2.B(context, iArr[0], null, tL_urlAuthResultRequest, c6Var, new org.telegram.ui.j90(e3VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, e3Var, maVar, 2), new org.telegram.ui.se0(18, e3VarArr, zArr2));
                e3VarArr[0] = B2;
                org.telegram.ui.ql0.f39184a = B2;
                return;
            case 3:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f26930f;
                byte[] bArr = (byte[]) this.f26931n;
                JSONArray jSONArray = (JSONArray) this.f26928b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f26929c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f26932r;
                bi.f0 f0Var = (bi.f0) this.f26933s;
                e2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new bi.k8(e2Var, str6, bArr, org.telegram.ui.Wallet.e2.q(h0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, e2Var.f32820f.getCurrentTime()), f0Var, tonconnectsession, 13));
                    return;
                } catch (Exception e) {
                    f0Var.run(null, org.telegram.ui.Wallet.e2.h("prepare OAuth connect", e));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.d;
                final String str7 = (String) this.f26930f;
                final byte[] bArr2 = (byte[]) this.e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.b2) this.f26931n).f32690a;
                final bi.f0 f0Var2 = (bi.f0) this.f26928b;
                final org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f26929c;
                final JSONArray jSONArray2 = (JSONArray) this.f26932r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f26933s;
                org.telegram.ui.Wallet.k0 k0Var = e2Var2.f32818b;
                if (TextUtils.equals(str7, k0Var.r()) && Arrays.equals(bArr2, k0Var.w()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f19175id;
                    tonconnectregisterkey.client_id = str8;
                    e2Var2.f32820f.sendRequestTyped(tonconnectregisterkey, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            e2 e2Var3 = e2.this;
                            bi.f0 f0Var3 = f0Var2;
                            h0 h0Var3 = h0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            e2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.globalQueue.postRunnable(new m51(e2Var3, h0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, f0Var3));
                            } else {
                                f0Var3.run(null, e2.x(tL_error, "registerKey"));
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
        this.f26930f = str;
        this.f26931n = linearLayout;
        this.f26928b = arrayList;
        this.h = str2;
        this.f26932r = translateController;
        this.f26933s = m1Var;
        this.f26929c = arrayList2;
    }

    public m51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f26928b = arrayList;
        this.f26929c = arrayList2;
        this.e = arrayList3;
        this.f26930f = arrayList4;
        this.h = arrayList5;
        this.f26931n = arrayList6;
        this.f26932r = arrayList7;
        this.f26933s = arrayList8;
    }

    public m51(org.telegram.ui.Wallet.e2 e2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.b2 b2Var, bi.f0 f0Var, org.telegram.ui.Wallet.h0 h0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = e2Var;
        this.f26930f = str;
        this.e = bArr;
        this.h = tonconnectsession;
        this.f26931n = b2Var;
        this.f26928b = f0Var;
        this.f26929c = h0Var;
        this.f26932r = jSONArray;
        this.f26933s = tL_urlAuthResultRequest;
    }

    public m51(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, bi.f0 f0Var) {
        this.d = e2Var;
        this.e = h0Var;
        this.h = tonconnectsession;
        this.f26930f = str;
        this.f26931n = bArr;
        this.f26928b = jSONArray;
        this.f26929c = tL_urlAuthResultRequest;
        this.f26932r = tonconnectchallenge;
        this.f26933s = f0Var;
    }
}
