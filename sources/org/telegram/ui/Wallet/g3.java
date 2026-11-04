package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a60;
public abstract class g3 {
    public static void a(final int i3, final v10 v10Var, final n10 n10Var, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final p10 p10Var, final boolean z10, final boolean z11, final cg.u0 u0Var) {
        if (!u0Var.f4754b) {
            final org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T != null && T.getContext() != null) {
                final Activity parentActivity = T.getParentActivity();
                TLRPC.User f10 = h10.i(i3).f();
                if (parentActivity != null && f10 != null) {
                    final org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, T.getContext(), null);
                    if (z11) {
                        s1Var.r(250L);
                    }
                    u10 u10Var = new u10() {
                        @Override
                        public final void a(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final cg.u0 u0Var2 = u0Var;
                            boolean z12 = u0Var2.f4754b;
                            final org.telegram.ui.ActionBar.s1 s1Var2 = s1Var;
                            if (!z12 && tLMethod != null) {
                                final int i10 = i3;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                c3.b bVar = new c3.b(1);
                                final Activity activity = parentActivity;
                                final n10 n10Var2 = n10Var;
                                final p10 p10Var2 = p10Var;
                                final v10 v10Var2 = v10Var;
                                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                                final org.telegram.ui.ActionBar.d2 d2Var = T;
                                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                                final boolean z13 = z10;
                                final boolean z14 = z11;
                                connectionsManager.sendRequestTyped(tLMethod, bVar, new n10() {
                                    @Override
                                    public final void a(Object obj2, Object obj3) {
                                        TLObject tLObject = (TLObject) obj2;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                        s1Var2.dismiss();
                                        final cg.u0 u0Var3 = u0Var2;
                                        if (u0Var3.f4754b) {
                                            return;
                                        }
                                        final TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                                        final p10 p10Var3 = p10Var2;
                                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = inputCheckPasswordSRP2;
                                        if (tL_error != null) {
                                            boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                                            final int i11 = i10;
                                            final v10 v10Var3 = v10Var2;
                                            final n10 n10Var3 = n10Var2;
                                            final boolean z15 = z13;
                                            final boolean z16 = z14;
                                            if (!equals && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                                                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                                                    ConnectionsManager.getInstance(i11).sendRequestTyped(new TL_account.getPassword(), new c3.b(1), new n10() {
                                                        @Override
                                                        public final void a(Object obj4, Object obj5) {
                                                            n10 n10Var4;
                                                            v10 v10Var4;
                                                            int i12;
                                                            f3 f3Var;
                                                            TL_account.Password password = (TL_account.Password) obj4;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                            cg.u0 u0Var4 = cg.u0.this;
                                                            if (u0Var4.f4754b) {
                                                                return;
                                                            }
                                                            if (tL_error2 == null) {
                                                                TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                                int i13 = i11;
                                                                v10 v10Var5 = v10Var3;
                                                                n10 n10Var5 = n10Var3;
                                                                p10 p10Var4 = p10Var3;
                                                                boolean z17 = z15;
                                                                boolean z18 = z16;
                                                                if (twoStepVerificationActivity4 == null) {
                                                                    f3 f3Var2 = new f3(u0Var4);
                                                                    f3Var2.setCurrentAccount(i13);
                                                                    n10Var4 = n10Var5;
                                                                    v10Var4 = v10Var5;
                                                                    i12 = i13;
                                                                    b3 b3Var = new b3(i12, v10Var4, n10Var4, f3Var2, p10Var4, z17, z18, u0Var4, 1);
                                                                    f3Var2.f42083a0 = 1;
                                                                    f3Var2.f42087c0 = b3Var;
                                                                    f3Var2.x0(new a60(u0Var4, z17, f3Var2, 13));
                                                                    f3Var = f3Var2;
                                                                } else {
                                                                    n10Var4 = n10Var5;
                                                                    v10Var4 = v10Var5;
                                                                    i12 = i13;
                                                                    f3Var = twoStepVerificationActivity4;
                                                                }
                                                                f3Var.J = password;
                                                                TwoStepVerificationActivity.r0(password);
                                                                g3.a(i12, v10Var4, n10Var4, f3Var.q0(), f3Var, p10Var4, z17, z18, u0Var4);
                                                                return;
                                                            }
                                                            u0Var4.a();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                u0Var3.f4755c = true;
                                                if (twoStepVerificationActivity3 != null) {
                                                    try {
                                                        twoStepVerificationActivity3.t0();
                                                        twoStepVerificationActivity3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                p10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                                u0Var3.a();
                                                return;
                                            }
                                            if (twoStepVerificationActivity3 != null) {
                                                twoStepVerificationActivity3.t0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i11);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            c3.b bVar2 = new c3.b(1);
                                            final Activity activity2 = activity;
                                            final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                            connectionsManager2.sendRequestTyped(getpassword, bVar2, new n10() {
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
                                                    cg.u0 u0Var4 = cg.u0.this;
                                                    if (u0Var4.f4754b) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        f3 f3Var = new f3(u0Var4);
                                                        int i18 = i11;
                                                        f3Var.setCurrentAccount(i18);
                                                        v10 v10Var4 = v10Var3;
                                                        n10 n10Var4 = n10Var3;
                                                        p10 p10Var4 = p10Var3;
                                                        boolean z17 = z15;
                                                        b3 b3Var = new b3(i18, v10Var4, n10Var4, f3Var, p10Var4, z17, z16, u0Var4, 0);
                                                        f3Var.f42083a0 = 1;
                                                        f3Var.f42087c0 = b3Var;
                                                        f3Var.J = password;
                                                        f3Var.K = false;
                                                        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                        if (T2 != 0 && T2.getContext() != null) {
                                                            if (z17) {
                                                                ?? obj6 = new Object();
                                                                obj6.f27395a = true;
                                                                T2.showAsSheet(f3Var, obj6);
                                                                return;
                                                            }
                                                            T2.presentFragment(f3Var);
                                                            return;
                                                        }
                                                        u0Var4.a();
                                                        return;
                                                    }
                                                    u0Var4.a();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    String M0 = bd.M0(2131751298, null);
                                                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder.f27343a;
                                                    s1Var3.S = M0;
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.o(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i19 = org.telegram.ui.ActionBar.k6.f27988j5;
                                                    org.telegram.ui.ActionBar.r6.V(textView, i19, null);
                                                    textView.setTextSize(1, 16.0f);
                                                    if (bd.f21784a0) {
                                                        i12 = 5;
                                                    } else {
                                                        i12 = 3;
                                                    }
                                                    textView.setGravity(i12 | 48);
                                                    textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131742874, null)));
                                                    linearLayout.addView(textView, mf.o(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView = new ImageView(activity3);
                                                    imageView.setImageResource(2131231623);
                                                    if (bd.f21784a0) {
                                                        i13 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int L3 = org.telegram.messenger.g0.L(9.0f);
                                                    if (bd.f21784a0) {
                                                        L = 0;
                                                    } else {
                                                        L = org.telegram.messenger.g0.L(11.0f);
                                                    }
                                                    imageView.setPadding(i13, L3, L, 0);
                                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                                    org.telegram.ui.ActionBar.r6.t(imageView, i19, null, mode);
                                                    TextView textView2 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.r6.V(textView2, i19, null);
                                                    textView2.setTextSize(1, 16.0f);
                                                    if (bd.f21784a0) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = 3;
                                                    }
                                                    textView2.setGravity(i14 | 48);
                                                    textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131751301, null)));
                                                    if (bd.f21784a0) {
                                                        linearLayout2.addView(textView2, mf.o(-1, -2));
                                                        linearLayout2.addView(imageView, mf.r(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, mf.o(-2, -2));
                                                        linearLayout2.addView(textView2, mf.o(-1, -2));
                                                    }
                                                    LinearLayout e10 = org.telegram.messenger.k5.e(activity3, 0);
                                                    linearLayout.addView(e10, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView2 = new ImageView(activity3);
                                                    imageView2.setImageResource(2131231623);
                                                    if (bd.f21784a0) {
                                                        i15 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    int L4 = org.telegram.messenger.g0.L(9.0f);
                                                    if (bd.f21784a0) {
                                                        L2 = 0;
                                                    } else {
                                                        L2 = org.telegram.messenger.g0.L(11.0f);
                                                    }
                                                    imageView2.setPadding(i15, L4, L2, 0);
                                                    org.telegram.ui.ActionBar.r6.t(imageView2, i19, null, mode);
                                                    TextView textView3 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.r6.V(textView3, i19, null);
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (bd.f21784a0) {
                                                        i16 = 5;
                                                    } else {
                                                        i16 = 3;
                                                    }
                                                    textView3.setGravity(i16 | 48);
                                                    textView3.setText(org.telegram.messenger.g0.X2(bd.M0(2131751300, null)));
                                                    if (bd.f21784a0) {
                                                        e10.addView(textView3, mf.o(-1, -2));
                                                        i17 = 5;
                                                        e10.addView(imageView2, mf.r(-2, -2, 5));
                                                    } else {
                                                        i17 = 5;
                                                        e10.addView(imageView2, mf.o(-2, -2));
                                                        e10.addView(textView3, mf.o(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                                                    if (equals2) {
                                                        alertDialog$Builder.k(bd.M0(2131751292, null), new c3(d2Var3, 0));
                                                        alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        org.telegram.ui.ActionBar.r6.V(textView4, i19, null);
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (!bd.f21784a0) {
                                                            i17 = 3;
                                                        }
                                                        org.telegram.messenger.k5.m(textView4, i17 | 48, null, 2131751299);
                                                        linearLayout.addView(textView4, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.h(bd.M0(2131747839, null), null);
                                                    }
                                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                    if (twoStepVerificationActivity4 != null) {
                                                        twoStepVerificationActivity4.showDialog(s1Var3);
                                                    } else {
                                                        d2Var3.showDialog(s1Var3);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        u0Var3.f4755c = true;
                                        if (twoStepVerificationActivity3 != null) {
                                            try {
                                                twoStepVerificationActivity3.t0();
                                                twoStepVerificationActivity3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        p10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                        u0Var3.a();
                                    }
                                });
                                return;
                            }
                            s1Var2.dismiss();
                            u0Var2.a();
                        }
                    };
                    if (v10Var != null) {
                        u10Var.a((TLMethod) v10Var.a(inputCheckPasswordSRP));
                        return;
                    } else if (n10Var != null) {
                        n10Var.a(inputCheckPasswordSRP, u10Var);
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
