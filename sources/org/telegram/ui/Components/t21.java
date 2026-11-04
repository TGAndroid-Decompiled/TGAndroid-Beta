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
import org.telegram.ui.Components.t21;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class t21 implements Runnable {
    public final int f38227a = 2;
    public final Object f38228b;
    public final Object f38229c;
    public final Object d;
    public final Object f38230e;
    public final Object f38231f;
    public final Object h;
    public final Object f38232n;
    public final Object f38233r;
    public final Object f38234s;

    public t21(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.t2[] t2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, cg.k0 k0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f38231f = t2Var;
        this.h = t2VarArr;
        this.f38232n = context;
        this.f38228b = iArr;
        this.f38229c = e6Var;
        this.f38230e = zArr;
        this.f38233r = inputtonconnectoauthsessionArr;
        this.f38234s = k0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String K0;
        String str;
        switch (this.f38227a) {
            case 0:
                final org.telegram.ui.xj xjVar = (org.telegram.ui.xj) this.d;
                boolean[] zArr = (boolean[]) this.f38230e;
                String str2 = (String) this.f38231f;
                LinearLayout linearLayout = (LinearLayout) this.f38232n;
                ArrayList arrayList = (ArrayList) this.f38228b;
                String str3 = (String) this.h;
                final org.telegram.messenger.x00 x00Var = (org.telegram.messenger.x00) this.f38233r;
                final org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f38234s;
                ArrayList arrayList2 = (ArrayList) this.f38229c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (K0 = f21.K0(f21.O0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, xjVar.getContext(), xjVar.d, false, false);
                        y0Var.setChecked(true);
                        y0Var.setText(K0);
                        linearLayout.addView(y0Var);
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i10 = i3 + 1;
                        org.telegram.messenger.q00 q00Var = (org.telegram.messenger.q00) arrayList.get(i3);
                        final String str4 = q00Var.f24844a;
                        if (TextUtils.equals(str4, str3)) {
                            i3 = i10;
                        } else {
                            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, xjVar.getContext(), xjVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            y0Var2.setChecked(z12);
                            y0Var2.setText(q00Var.f24845b);
                            if (!z12) {
                                view = y0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.xj xjVar2 = xjVar;
                                                x00Var.I(xjVar2.f38973b, str4);
                                                f1Var.d(true);
                                                xjVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.xj xjVar3 = xjVar;
                                                x00Var.I(xjVar3.f38973b, str4);
                                                f1Var.d(true);
                                                xjVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = y0Var2;
                            }
                            linearLayout.addView(view);
                            i3 = i10;
                            z12 = z11;
                        }
                    }
                    int i11 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.c1(xjVar.getContext(), xjVar.d), b8.mf.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        org.telegram.messenger.q00 q00Var2 = (org.telegram.messenger.q00) arrayList2.get(i12);
                        final String str5 = q00Var2.f24844a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z10 = 1;
                            } else {
                                z10 = i11;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(2, xjVar.getContext(), xjVar.d, false, false);
                            y0Var3.setChecked(z10);
                            y0Var3.setText(q00Var2.f24845b);
                            if (z10 == 0) {
                                y0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.xj xjVar2 = xjVar;
                                                x00Var.I(xjVar2.f38973b, str5);
                                                f1Var.d(true);
                                                xjVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.xj xjVar3 = xjVar;
                                                x00Var.I(xjVar3.f38973b, str5);
                                                f1Var.d(true);
                                                xjVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(y0Var3);
                        }
                        i12 = i13;
                    }
                    zArr[i11] = true;
                    return;
                }
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f38231f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f38232n;
                ArrayList arrayList6 = (ArrayList) this.f38233r;
                ArrayList arrayList7 = (ArrayList) this.f38234s;
                notificationsCustomSettingsActivity.getMessagesController().Y3((ArrayList) this.f38228b, true);
                notificationsCustomSettingsActivity.getMessagesController().S3((ArrayList) this.f38229c, true);
                notificationsCustomSettingsActivity.getMessagesController().V3((ArrayList) this.f38230e);
                int i14 = notificationsCustomSettingsActivity.f41339s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f41341x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f41341x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f41341x = arrayList5;
                    notificationsCustomSettingsActivity.f41340w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f41341x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f38231f;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.h;
                Context context = (Context) this.f38232n;
                int[] iArr = (int[]) this.f38228b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f38229c;
                boolean[] zArr2 = (boolean[]) this.f38230e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f38233r;
                cg.k0 k0Var = (cg.k0) this.f38234s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.yh0.f52282a = t2Var;
                    t2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.y2 D = org.telegram.ui.Wallet.c2.D(context, iArr[0], null, tL_urlAuthResultRequest, e6Var, new org.telegram.ui.n60(t2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, t2Var, k0Var, 2), new org.telegram.ui.tb0(19, t2VarArr, zArr2));
                t2VarArr[0] = D;
                org.telegram.ui.yh0.f52282a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f38230e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f38231f;
                byte[] bArr = (byte[]) this.f38232n;
                JSONArray jSONArray = (JSONArray) this.f38228b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f38229c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f38233r;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f38234s;
                c2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new ai.w1(c2Var, str6, bArr, org.telegram.ui.Wallet.c2.s(h0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, c2Var.f42381f.getCurrentTime()), s1Var, tonconnectsession, 22));
                    return;
                } catch (Exception e10) {
                    s1Var.a(null, org.telegram.ui.Wallet.c2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) this.d;
                final String str7 = (String) this.f38231f;
                final byte[] bArr2 = (byte[]) this.f38230e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.z1) this.f38232n).f43494a;
                final org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.f38228b;
                final org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f38229c;
                final JSONArray jSONArray2 = (JSONArray) this.f38233r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f38234s;
                org.telegram.ui.Wallet.k0 k0Var2 = c2Var2.f42378b;
                if (TextUtils.equals(str7, k0Var2.t()) && Arrays.equals(bArr2, k0Var2.y()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f27264id;
                    tonconnectregisterkey.client_id = str8;
                    c2Var2.f42381f.sendRequestTyped(tonconnectregisterkey, new c3.b(1), new org.telegram.messenger.n10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            c2 c2Var3 = c2.this;
                            s1 s1Var3 = s1Var2;
                            h0 h0Var3 = h0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            c2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f21387e.c(new t21(c2Var3, h0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, s1Var3));
                            } else {
                                s1Var3.a(null, c2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                s1Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public t21(org.telegram.ui.xj xjVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.x00 x00Var, org.telegram.ui.ActionBar.f1 f1Var, ArrayList arrayList2) {
        this.d = xjVar;
        this.f38230e = zArr;
        this.f38231f = str;
        this.f38232n = linearLayout;
        this.f38228b = arrayList;
        this.h = str2;
        this.f38233r = x00Var;
        this.f38234s = f1Var;
        this.f38229c = arrayList2;
    }

    public t21(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f38228b = arrayList;
        this.f38229c = arrayList2;
        this.f38230e = arrayList3;
        this.f38231f = arrayList4;
        this.h = arrayList5;
        this.f38232n = arrayList6;
        this.f38233r = arrayList7;
        this.f38234s = arrayList8;
    }

    public t21(org.telegram.ui.Wallet.c2 c2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.s1 s1Var, org.telegram.ui.Wallet.h0 h0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = c2Var;
        this.f38231f = str;
        this.f38230e = bArr;
        this.h = tonconnectsession;
        this.f38232n = z1Var;
        this.f38228b = s1Var;
        this.f38229c = h0Var;
        this.f38233r = jSONArray;
        this.f38234s = tL_urlAuthResultRequest;
    }

    public t21(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.s1 s1Var) {
        this.d = c2Var;
        this.f38230e = h0Var;
        this.h = tonconnectsession;
        this.f38231f = str;
        this.f38232n = bArr;
        this.f38228b = jSONArray;
        this.f38229c = tL_urlAuthResultRequest;
        this.f38233r = tonconnectchallenge;
        this.f38234s = s1Var;
    }
}
