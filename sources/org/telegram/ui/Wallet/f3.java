package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a20;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f60;
public abstract class f3 {
    public static void a(final int i7, final a20 a20Var, final s10 s10Var, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final u10 u10Var, final boolean z10, final boolean z11, final bg.u0 u0Var) {
        if (!u0Var.f3340b) {
            final org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null && T.getContext() != null) {
                final Activity parentActivity = T.getParentActivity();
                TLRPC.User f10 = m10.i(i7).f();
                if (parentActivity != null && f10 != null) {
                    final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, T.getContext(), null);
                    if (z11) {
                        t1Var.r(250L);
                    }
                    z10 z10Var = new z10() {
                        @Override
                        public final void a(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final bg.u0 u0Var2 = u0Var;
                            boolean z12 = u0Var2.f3340b;
                            final org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                            if (!z12 && tLMethod != null) {
                                final int i10 = i7;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                d3.b bVar = new d3.b(1);
                                final Activity activity = parentActivity;
                                final s10 s10Var2 = s10Var;
                                final u10 u10Var2 = u10Var;
                                final a20 a20Var2 = a20Var;
                                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                                final org.telegram.ui.ActionBar.e2 e2Var = T;
                                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                                final boolean z13 = z10;
                                final boolean z14 = z11;
                                connectionsManager.sendRequestTyped(tLMethod, bVar, new s10() {
                                    @Override
                                    public final void a(Object obj2, Object obj3) {
                                        TLObject tLObject = (TLObject) obj2;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                        t1Var2.dismiss();
                                        final bg.u0 u0Var3 = u0Var2;
                                        if (u0Var3.f3340b) {
                                            return;
                                        }
                                        final TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                                        final u10 u10Var3 = u10Var2;
                                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = inputCheckPasswordSRP2;
                                        if (tL_error != null) {
                                            boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                                            final int i11 = i10;
                                            final a20 a20Var3 = a20Var2;
                                            final s10 s10Var3 = s10Var2;
                                            final boolean z15 = z13;
                                            final boolean z16 = z14;
                                            if (!equals && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                                                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                                                    ConnectionsManager.getInstance(i11).sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new s10() {
                                                        @Override
                                                        public final void a(Object obj4, Object obj5) {
                                                            s10 s10Var4;
                                                            a20 a20Var4;
                                                            int i12;
                                                            e3 e3Var;
                                                            TL_account.Password password = (TL_account.Password) obj4;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                            bg.u0 u0Var4 = bg.u0.this;
                                                            if (u0Var4.f3340b) {
                                                                return;
                                                            }
                                                            if (tL_error2 == null) {
                                                                TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                                int i13 = i11;
                                                                a20 a20Var5 = a20Var3;
                                                                s10 s10Var5 = s10Var3;
                                                                u10 u10Var4 = u10Var3;
                                                                boolean z17 = z15;
                                                                boolean z18 = z16;
                                                                if (twoStepVerificationActivity4 == null) {
                                                                    e3 e3Var2 = new e3(u0Var4);
                                                                    e3Var2.setCurrentAccount(i13);
                                                                    s10Var4 = s10Var5;
                                                                    a20Var4 = a20Var5;
                                                                    i12 = i13;
                                                                    a3 a3Var = new a3(i12, a20Var4, s10Var4, e3Var2, u10Var4, z17, z18, u0Var4, 1);
                                                                    e3Var2.f43426a0 = 1;
                                                                    e3Var2.f43430c0 = a3Var;
                                                                    e3Var2.x0(new f60(u0Var4, z17, e3Var2, 13));
                                                                    e3Var = e3Var2;
                                                                } else {
                                                                    s10Var4 = s10Var5;
                                                                    a20Var4 = a20Var5;
                                                                    i12 = i13;
                                                                    e3Var = twoStepVerificationActivity4;
                                                                }
                                                                e3Var.J = password;
                                                                TwoStepVerificationActivity.r0(password);
                                                                f3.a(i12, a20Var4, s10Var4, e3Var.q0(), e3Var, u10Var4, z17, z18, u0Var4);
                                                                return;
                                                            }
                                                            u0Var4.a();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                u0Var3.f3341c = true;
                                                if (twoStepVerificationActivity3 != null) {
                                                    try {
                                                        twoStepVerificationActivity3.t0();
                                                        twoStepVerificationActivity3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                u10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                                u0Var3.a();
                                                return;
                                            }
                                            if (twoStepVerificationActivity3 != null) {
                                                twoStepVerificationActivity3.t0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i11);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            d3.b bVar2 = new d3.b(1);
                                            final Activity activity2 = activity;
                                            final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                            connectionsManager2.sendRequestTyped(getpassword, bVar2, new s10() {
                                                @Override
                                                public final void a(Object obj4, Object obj5) {
                                                    int i12;
                                                    int i13;
                                                    int L;
                                                    int i14;
                                                    int i15;
                                                    int L2;
                                                    int i16;
                                                    int i17;
                                                    TL_account.Password password = (TL_account.Password) obj4;
                                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                    bg.u0 u0Var4 = bg.u0.this;
                                                    if (u0Var4.f3340b) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        e3 e3Var = new e3(u0Var4);
                                                        int i18 = i11;
                                                        e3Var.setCurrentAccount(i18);
                                                        a20 a20Var4 = a20Var3;
                                                        s10 s10Var4 = s10Var3;
                                                        u10 u10Var4 = u10Var3;
                                                        boolean z17 = z15;
                                                        a3 a3Var = new a3(i18, a20Var4, s10Var4, e3Var, u10Var4, z17, z16, u0Var4, 0);
                                                        e3Var.f43426a0 = 1;
                                                        e3Var.f43430c0 = a3Var;
                                                        e3Var.J = password;
                                                        e3Var.K = false;
                                                        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                        if (T2 != 0 && T2.getContext() != null) {
                                                            if (z17) {
                                                                ?? obj6 = new Object();
                                                                obj6.f28476a = true;
                                                                T2.showAsSheet(e3Var, obj6);
                                                                return;
                                                            }
                                                            T2.presentFragment(e3Var);
                                                            return;
                                                        }
                                                        u0Var4.a();
                                                        return;
                                                    }
                                                    u0Var4.a();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    String M0 = hd.M0(2131751297, null);
                                                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder.f28392a;
                                                    t1Var3.S = M0;
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.o(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i19 = org.telegram.ui.ActionBar.j6.f28957j5;
                                                    org.telegram.ui.ActionBar.q6.U(textView, i19, null);
                                                    textView.setTextSize(1, 16.0f);
                                                    if (hd.f24104a0) {
                                                        i12 = 5;
                                                    } else {
                                                        i12 = 3;
                                                    }
                                                    textView.setGravity(i12 | 48);
                                                    textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131742864, null)));
                                                    linearLayout.addView(textView, c8.ja.o(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView = new ImageView(activity3);
                                                    imageView.setImageResource(2131231623);
                                                    if (hd.f24104a0) {
                                                        i13 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int L3 = org.telegram.messenger.g0.L(9.0f);
                                                    if (hd.f24104a0) {
                                                        L = 0;
                                                    } else {
                                                        L = org.telegram.messenger.g0.L(11.0f);
                                                    }
                                                    imageView.setPadding(i13, L3, L, 0);
                                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                                    org.telegram.ui.ActionBar.q6.s(imageView, i19, null, mode);
                                                    TextView textView2 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.q6.U(textView2, i19, null);
                                                    textView2.setTextSize(1, 16.0f);
                                                    if (hd.f24104a0) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = 3;
                                                    }
                                                    textView2.setGravity(i14 | 48);
                                                    textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131751300, null)));
                                                    if (hd.f24104a0) {
                                                        linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                                                        linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, c8.ja.o(-2, -2));
                                                        linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                                                    }
                                                    LinearLayout e10 = org.telegram.messenger.k5.e(activity3, 0);
                                                    linearLayout.addView(e10, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView2 = new ImageView(activity3);
                                                    imageView2.setImageResource(2131231623);
                                                    if (hd.f24104a0) {
                                                        i15 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    int L4 = org.telegram.messenger.g0.L(9.0f);
                                                    if (hd.f24104a0) {
                                                        L2 = 0;
                                                    } else {
                                                        L2 = org.telegram.messenger.g0.L(11.0f);
                                                    }
                                                    imageView2.setPadding(i15, L4, L2, 0);
                                                    org.telegram.ui.ActionBar.q6.s(imageView2, i19, null, mode);
                                                    TextView textView3 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.q6.U(textView3, i19, null);
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (hd.f24104a0) {
                                                        i16 = 5;
                                                    } else {
                                                        i16 = 3;
                                                    }
                                                    textView3.setGravity(i16 | 48);
                                                    textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131751299, null)));
                                                    if (hd.f24104a0) {
                                                        e10.addView(textView3, c8.ja.o(-1, -2));
                                                        i17 = 5;
                                                        e10.addView(imageView2, c8.ja.r(-2, -2, 5));
                                                    } else {
                                                        i17 = 5;
                                                        e10.addView(imageView2, c8.ja.o(-2, -2));
                                                        e10.addView(textView3, c8.ja.o(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                                                    if (equals2) {
                                                        alertDialog$Builder.k(hd.M0(2131751291, null), new b3(e2Var3, 0));
                                                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        org.telegram.ui.ActionBar.q6.U(textView4, i19, null);
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (!hd.f24104a0) {
                                                            i17 = 3;
                                                        }
                                                        org.telegram.messenger.k5.l(textView4, i17 | 48, null, 2131751298);
                                                        linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.h(hd.M0(2131747831, null), null);
                                                    }
                                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                    if (twoStepVerificationActivity4 != null) {
                                                        twoStepVerificationActivity4.showDialog(t1Var3);
                                                    } else {
                                                        e2Var3.showDialog(t1Var3);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        u0Var3.f3341c = true;
                                        if (twoStepVerificationActivity3 != null) {
                                            try {
                                                twoStepVerificationActivity3.t0();
                                                twoStepVerificationActivity3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        u10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                        u0Var3.a();
                                    }
                                });
                                return;
                            }
                            t1Var2.dismiss();
                            u0Var2.a();
                        }
                    };
                    if (a20Var != null) {
                        z10Var.a((TLMethod) a20Var.a(inputCheckPasswordSRP));
                        return;
                    } else if (s10Var != null) {
                        s10Var.a(inputCheckPasswordSRP, z10Var);
                        return;
                    } else {
                        return;
                    }
                }
                u0Var.a();
                return;
            }
            u0Var.a();
        }
    }
}
