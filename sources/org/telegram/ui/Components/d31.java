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
import org.telegram.ui.Components.d31;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class d31 implements Runnable {
    public final int f33819a = 2;
    public final Object f33820b;
    public final Object f33821c;
    public final Object d;
    public final Object f33822e;
    public final Object f33823f;
    public final Object h;
    public final Object f33824n;
    public final Object f33825r;
    public final Object f33826s;

    public d31(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.u2[] u2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.l0 l0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f33823f = u2Var;
        this.h = u2VarArr;
        this.f33824n = context;
        this.f33820b = iArr;
        this.f33821c = e6Var;
        this.f33822e = zArr;
        this.f33825r = inputtonconnectoauthsessionArr;
        this.f33826s = l0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String K0;
        String str;
        switch (this.f33819a) {
            case 0:
                final org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.d;
                boolean[] zArr = (boolean[]) this.f33822e;
                String str2 = (String) this.f33823f;
                LinearLayout linearLayout = (LinearLayout) this.f33824n;
                ArrayList arrayList = (ArrayList) this.f33820b;
                String str3 = (String) this.h;
                final org.telegram.messenger.c10 c10Var = (org.telegram.messenger.c10) this.f33825r;
                final org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f33826s;
                ArrayList arrayList2 = (ArrayList) this.f33821c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = p21.K0(p21.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                        z0Var.setChecked(true);
                        z0Var.setText(K0);
                        linearLayout.addView(z0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.v00 v00Var = (org.telegram.messenger.v00) arrayList.get(i7);
                        final String str4 = v00Var.f26916a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            z0Var2.setChecked(z12);
                            z0Var2.setText(v00Var.f26917b);
                            if (!z12) {
                                view = z0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                c10Var.I(bkVar2.f34504b, str4);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                c10Var.I(bkVar3.f34504b, str4);
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
                            z12 = z11;
                        }
                    }
                    int i11 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(bkVar.getContext(), bkVar.d), c8.ja.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        org.telegram.messenger.v00 v00Var2 = (org.telegram.messenger.v00) arrayList2.get(i12);
                        final String str5 = v00Var2.f26916a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z10 = 1;
                            } else {
                                z10 = i11;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, bkVar.getContext(), bkVar.d, false, false);
                            z0Var3.setChecked(z10);
                            z0Var3.setText(v00Var2.f26917b);
                            if (z10 == 0) {
                                z0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.bk bkVar2 = bkVar;
                                                c10Var.I(bkVar2.f34504b, str5);
                                                g1Var.d(true);
                                                bkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bk bkVar3 = bkVar;
                                                c10Var.I(bkVar3.f34504b, str5);
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
                ArrayList arrayList3 = (ArrayList) this.f33823f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f33824n;
                ArrayList arrayList6 = (ArrayList) this.f33825r;
                ArrayList arrayList7 = (ArrayList) this.f33826s;
                notificationsCustomSettingsActivity.getMessagesController().Y3((ArrayList) this.f33820b, true);
                notificationsCustomSettingsActivity.getMessagesController().S3((ArrayList) this.f33821c, true);
                notificationsCustomSettingsActivity.getMessagesController().V3((ArrayList) this.f33822e);
                int i14 = notificationsCustomSettingsActivity.f42678s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f42680x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f42680x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f42680x = arrayList5;
                    notificationsCustomSettingsActivity.f42679w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f42680x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f33823f;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.h;
                Context context = (Context) this.f33824n;
                int[] iArr = (int[]) this.f33820b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f33821c;
                boolean[] zArr2 = (boolean[]) this.f33822e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f33825r;
                bg.l0 l0Var = (bg.l0) this.f33826s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.di0.f46411a = u2Var;
                    u2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.x2 D = org.telegram.ui.Wallet.d2.D(context, iArr[0], null, tL_urlAuthResultRequest, e6Var, new org.telegram.ui.r60(u2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, u2Var, l0Var, 2), new org.telegram.ui.jd0(11, u2VarArr, zArr2));
                u2VarArr[0] = D;
                org.telegram.ui.di0.f46411a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f33822e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f33823f;
                byte[] bArr = (byte[]) this.f33824n;
                JSONArray jSONArray = (JSONArray) this.f33820b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f33821c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f33825r;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f33826s;
                d2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new bi.p1(d2Var, str6, bArr, org.telegram.ui.Wallet.d2.s(i0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, d2Var.f43733f.getCurrentTime()), t1Var, tonconnectsession, 23));
                    return;
                } catch (Exception e10) {
                    t1Var.a(null, org.telegram.ui.Wallet.d2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.d;
                final String str7 = (String) this.f33823f;
                final byte[] bArr2 = (byte[]) this.f33822e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.a2) this.f33824n).f43468a;
                final org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) this.f33820b;
                final org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f33821c;
                final JSONArray jSONArray2 = (JSONArray) this.f33825r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f33826s;
                org.telegram.ui.Wallet.l0 l0Var2 = d2Var2.f43730b;
                if (TextUtils.equals(str7, l0Var2.t()) && Arrays.equals(bArr2, l0Var2.y()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f28313id;
                    tonconnectregisterkey.client_id = str8;
                    d2Var2.f43733f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.s10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            d2 d2Var3 = d2.this;
                            t1 t1Var3 = t1Var2;
                            i0 i0Var3 = i0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            d2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f22416e.c(new d31(d2Var3, i0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, t1Var3));
                            } else {
                                t1Var3.a(null, d2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                t1Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public d31(org.telegram.ui.bk bkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.c10 c10Var, org.telegram.ui.ActionBar.g1 g1Var, ArrayList arrayList2) {
        this.d = bkVar;
        this.f33822e = zArr;
        this.f33823f = str;
        this.f33824n = linearLayout;
        this.f33820b = arrayList;
        this.h = str2;
        this.f33825r = c10Var;
        this.f33826s = g1Var;
        this.f33821c = arrayList2;
    }

    public d31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f33820b = arrayList;
        this.f33821c = arrayList2;
        this.f33822e = arrayList3;
        this.f33823f = arrayList4;
        this.h = arrayList5;
        this.f33824n = arrayList6;
        this.f33825r = arrayList7;
        this.f33826s = arrayList8;
    }

    public d31(org.telegram.ui.Wallet.d2 d2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.t1 t1Var, org.telegram.ui.Wallet.i0 i0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = d2Var;
        this.f33823f = str;
        this.f33822e = bArr;
        this.h = tonconnectsession;
        this.f33824n = a2Var;
        this.f33820b = t1Var;
        this.f33821c = i0Var;
        this.f33825r = jSONArray;
        this.f33826s = tL_urlAuthResultRequest;
    }

    public d31(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.t1 t1Var) {
        this.d = d2Var;
        this.f33822e = i0Var;
        this.h = tonconnectsession;
        this.f33823f = str;
        this.f33824n = bArr;
        this.f33820b = jSONArray;
        this.f33821c = tL_urlAuthResultRequest;
        this.f33825r = tonconnectchallenge;
        this.f33826s = t1Var;
    }
}
