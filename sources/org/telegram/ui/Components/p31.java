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
import org.telegram.ui.Components.p31;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class p31 implements Runnable {
    public final int f38473a = 2;
    public final Object f38474b;
    public final Object f38475c;
    public final Object d;
    public final Object f38476e;
    public final Object f38477f;
    public final Object h;
    public final Object f38478n;
    public final Object f38479r;
    public final Object f38480s;

    public p31(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, int[] iArr, org.telegram.ui.ActionBar.h6 h6Var, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, bg.m0 m0Var) {
        this.d = tL_urlAuthResultRequest;
        this.f38477f = w2Var;
        this.h = w2VarArr;
        this.f38478n = context;
        this.f38474b = iArr;
        this.f38475c = h6Var;
        this.f38476e = zArr;
        this.f38479r = inputtonconnectoauthsessionArr;
        this.f38480s = m0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        String L0;
        String str;
        switch (this.f38473a) {
            case 0:
                final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.d;
                boolean[] zArr = (boolean[]) this.f38476e;
                String str2 = (String) this.f38477f;
                LinearLayout linearLayout = (LinearLayout) this.f38478n;
                ArrayList arrayList = (ArrayList) this.f38474b;
                String str3 = (String) this.h;
                final org.telegram.messenger.a10 a10Var = (org.telegram.messenger.a10) this.f38479r;
                final org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f38480s;
                ArrayList arrayList2 = (ArrayList) this.f38475c;
                boolean z12 = false;
                if (!zArr[0]) {
                    if (str2 != null && (L0 = b31.L0(b31.P0(str2, null, null))) != null) {
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, ckVar.getContext(), ckVar.d, false, false);
                        y0Var.setChecked(true);
                        y0Var.setText(L0);
                        linearLayout.addView(y0Var);
                    }
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i10 = i7 + 1;
                        org.telegram.messenger.t00 t00Var = (org.telegram.messenger.t00) arrayList.get(i7);
                        final String str4 = t00Var.f26941a;
                        if (TextUtils.equals(str4, str3)) {
                            i7 = i10;
                        } else {
                            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, ckVar.getContext(), ckVar.d, false, false);
                            if (str2 != null && str2.equals(str4)) {
                                z11 = z12 ? 1 : 0;
                                z12 = true;
                            } else {
                                z11 = z12 ? 1 : 0;
                            }
                            y0Var2.setChecked(z12);
                            y0Var2.setText(t00Var.f26942b);
                            if (!z12) {
                                view = y0Var2;
                                view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                a10Var.I(ckVar2.f39470b, str4);
                                                g1Var.d(true);
                                                ckVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                a10Var.I(ckVar3.f39470b, str4);
                                                g1Var.d(true);
                                                ckVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                view = y0Var2;
                            }
                            linearLayout.addView(view);
                            i7 = i10;
                            z12 = z11;
                        }
                    }
                    int i11 = z12 ? 1 : 0;
                    linearLayout.addView(new org.telegram.ui.ActionBar.d1(ckVar.getContext(), ckVar.d), c8.ma.o(-1, 8));
                    int size2 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        org.telegram.messenger.t00 t00Var2 = (org.telegram.messenger.t00) arrayList2.get(i12);
                        final String str5 = t00Var2.f26941a;
                        if (!TextUtils.equals(str5, str3)) {
                            if (str2 != null && str2.equals(str5)) {
                                z10 = 1;
                            } else {
                                z10 = i11;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(2, ckVar.getContext(), ckVar.d, false, false);
                            y0Var3.setChecked(z10);
                            y0Var3.setText(t00Var2.f26942b);
                            if (z10 == 0) {
                                y0Var3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view2) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.ck ckVar2 = ckVar;
                                                a10Var.I(ckVar2.f39470b, str5);
                                                g1Var.d(true);
                                                ckVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.ck ckVar3 = ckVar;
                                                a10Var.I(ckVar3.f39470b, str5);
                                                g1Var.d(true);
                                                ckVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f38477f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f38478n;
                ArrayList arrayList6 = (ArrayList) this.f38479r;
                ArrayList arrayList7 = (ArrayList) this.f38480s;
                notificationsCustomSettingsActivity.getMessagesController().f4((ArrayList) this.f38474b, true);
                notificationsCustomSettingsActivity.getMessagesController().Z3((ArrayList) this.f38475c, true);
                notificationsCustomSettingsActivity.getMessagesController().c4((ArrayList) this.f38476e);
                int i14 = notificationsCustomSettingsActivity.f43168s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f43170x = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f43170x = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f43170x = arrayList5;
                    notificationsCustomSettingsActivity.f43169w = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f43170x = arrayList7;
                }
                notificationsCustomSettingsActivity.q0(true);
                return;
            case 2:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f38477f;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.h;
                Context context = (Context) this.f38478n;
                int[] iArr = (int[]) this.f38474b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f38475c;
                boolean[] zArr2 = (boolean[]) this.f38476e;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.f38479r;
                bg.m0 m0Var = (bg.m0) this.f38480s;
                if (!tL_urlAuthResultRequest.request_wallet) {
                    org.telegram.ui.gi0.f48124a = w2Var;
                    w2Var.show();
                    return;
                }
                org.telegram.ui.Wallet.e3 D = org.telegram.ui.Wallet.l2.D(context, iArr[0], null, tL_urlAuthResultRequest, h6Var, new org.telegram.ui.u60(w2VarArr, zArr2, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest, w2Var, m0Var, 2), new org.telegram.ui.fe0(8, w2VarArr, zArr2));
                w2VarArr[0] = D;
                org.telegram.ui.gi0.f48124a = D;
                return;
            case 3:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.d;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f38476e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                String str6 = (String) this.f38477f;
                byte[] bArr = (byte[]) this.f38478n;
                JSONArray jSONArray = (JSONArray) this.f38474b;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) this.f38475c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f38479r;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f38480s;
                l2Var.getClass();
                try {
                    org.telegram.messenger.g0.g3(new bi.l2(l2Var, str6, bArr, org.telegram.ui.Wallet.l2.s(r0Var, tonconnectsession, str6, bArr, jSONArray, tL_urlAuthResultRequest2.domain, null, tonconnectchallenge, l2Var.f44527f.getCurrentTime()), e0Var, tonconnectsession, 22));
                    return;
                } catch (Exception e10) {
                    e0Var.a(null, org.telegram.ui.Wallet.l2.i("prepare OAuth connect", e10));
                    return;
                }
            default:
                final org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) this.d;
                final String str7 = (String) this.f38477f;
                final byte[] bArr2 = (byte[]) this.f38476e;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.h;
                String str8 = ((org.telegram.ui.Wallet.i2) this.f38478n).f44385a;
                final org.telegram.ui.Wallet.e0 e0Var2 = (org.telegram.ui.Wallet.e0) this.f38474b;
                final org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.f38475c;
                final JSONArray jSONArray2 = (JSONArray) this.f38479r;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) this.f38480s;
                org.telegram.ui.Wallet.u0 u0Var = l2Var2.f44524b;
                if (TextUtils.equals(str7, u0Var.y()) && Arrays.equals(bArr2, u0Var.E()) && ((str = tonconnectsession2.client_id) == null || str8.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.f28696id;
                    tonconnectregisterkey.client_id = str8;
                    l2Var2.f44527f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.messenger.r10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            l2 l2Var3 = l2.this;
                            e0 e0Var3 = e0Var2;
                            r0 r0Var3 = r0Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str9 = str7;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest4 = tL_urlAuthResultRequest3;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            l2Var3.getClass();
                            if (tL_error == null && tonconnectchallenge2 != null) {
                                Utilities.f22810e.c(new p31(l2Var3, r0Var3, tonconnectsession3, str9, bArr3, jSONArray3, tL_urlAuthResultRequest4, tonconnectchallenge2, e0Var3));
                            } else {
                                e0Var3.a(null, l2.z(tL_error, "registerKey"));
                            }
                        }
                    });
                    return;
                }
                e0Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                return;
        }
    }

    public p31(org.telegram.ui.ck ckVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, org.telegram.messenger.a10 a10Var, org.telegram.ui.ActionBar.g1 g1Var, ArrayList arrayList2) {
        this.d = ckVar;
        this.f38476e = zArr;
        this.f38477f = str;
        this.f38478n = linearLayout;
        this.f38474b = arrayList;
        this.h = str2;
        this.f38479r = a10Var;
        this.f38480s = g1Var;
        this.f38475c = arrayList2;
    }

    public p31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f38474b = arrayList;
        this.f38475c = arrayList2;
        this.f38476e = arrayList3;
        this.f38477f = arrayList4;
        this.h = arrayList5;
        this.f38478n = arrayList6;
        this.f38479r = arrayList7;
        this.f38480s = arrayList8;
    }

    public p31(org.telegram.ui.Wallet.l2 l2Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.Wallet.e0 e0Var, org.telegram.ui.Wallet.r0 r0Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.d = l2Var;
        this.f38477f = str;
        this.f38476e = bArr;
        this.h = tonconnectsession;
        this.f38478n = i2Var;
        this.f38474b = e0Var;
        this.f38475c = r0Var;
        this.f38479r = jSONArray;
        this.f38480s = tL_urlAuthResultRequest;
    }

    public p31(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.tonConnectChallenge tonconnectchallenge, org.telegram.ui.Wallet.e0 e0Var) {
        this.d = l2Var;
        this.f38476e = r0Var;
        this.h = tonconnectsession;
        this.f38477f = str;
        this.f38478n = bArr;
        this.f38474b = jSONArray;
        this.f38475c = tL_urlAuthResultRequest;
        this.f38479r = tonconnectchallenge;
        this.f38480s = e0Var;
    }
}
