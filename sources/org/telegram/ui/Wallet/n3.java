package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b80;
public abstract class n3 {
    public static void a(final int i7, final z10 z10Var, final r10 r10Var, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final t10 t10Var, final boolean z10, final boolean z11, final m.b3 b3Var) {
        if (!b3Var.f20052a) {
            final org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null && T.getContext() != null) {
                final Activity parentActivity = T.getParentActivity();
                TLRPC.User f10 = k10.i(i7).f();
                if (parentActivity != null && f10 != null) {
                    final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, T.getContext(), null);
                    if (z11) {
                        t1Var.r(250L);
                    }
                    y10 y10Var = new y10() {
                        @Override
                        public final void a(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final m.b3 b3Var2 = b3Var;
                            boolean z12 = b3Var2.f20052a;
                            final org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                            if (!z12 && tLMethod != null) {
                                final int i10 = i7;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                d3.b bVar = new d3.b(1);
                                final Activity activity = parentActivity;
                                final r10 r10Var2 = r10Var;
                                final t10 t10Var2 = t10Var;
                                final z10 z10Var2 = z10Var;
                                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                                final org.telegram.ui.ActionBar.g2 g2Var = T;
                                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                                final boolean z13 = z10;
                                final boolean z14 = z11;
                                connectionsManager.sendRequestTyped(tLMethod, bVar, new r10() {
                                    @Override
                                    public final void a(Object obj2, Object obj3) {
                                        TLObject tLObject = (TLObject) obj2;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                        t1Var2.dismiss();
                                        final m.b3 b3Var3 = b3Var2;
                                        if (b3Var3.f20052a) {
                                            return;
                                        }
                                        final TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                                        final t10 t10Var3 = t10Var2;
                                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = inputCheckPasswordSRP2;
                                        if (tL_error != null) {
                                            boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                                            final int i11 = i10;
                                            final z10 z10Var3 = z10Var2;
                                            final r10 r10Var3 = r10Var2;
                                            final boolean z15 = z13;
                                            final boolean z16 = z14;
                                            if (!equals && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                                                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                                                    ConnectionsManager.getInstance(i11).sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new r10() {
                                                        @Override
                                                        public final void a(Object obj4, Object obj5) {
                                                            r10 r10Var4;
                                                            z10 z10Var4;
                                                            int i12;
                                                            m3 m3Var;
                                                            TL_account.Password password = (TL_account.Password) obj4;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                            m.b3 b3Var4 = m.b3.this;
                                                            if (b3Var4.f20052a) {
                                                                return;
                                                            }
                                                            if (tL_error2 == null) {
                                                                TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                                int i13 = i11;
                                                                z10 z10Var5 = z10Var3;
                                                                r10 r10Var5 = r10Var3;
                                                                t10 t10Var4 = t10Var3;
                                                                boolean z17 = z15;
                                                                boolean z18 = z16;
                                                                if (twoStepVerificationActivity4 == null) {
                                                                    m3 m3Var2 = new m3(b3Var4);
                                                                    m3Var2.setCurrentAccount(i13);
                                                                    r10Var4 = r10Var5;
                                                                    z10Var4 = z10Var5;
                                                                    i12 = i13;
                                                                    g3 g3Var = new g3(i12, z10Var4, r10Var4, m3Var2, t10Var4, z17, z18, b3Var4, 1);
                                                                    m3Var2.f43917a0 = 1;
                                                                    m3Var2.f43921c0 = g3Var;
                                                                    m3Var2.x0(new b80(b3Var4, z17, m3Var2, 12));
                                                                    m3Var = m3Var2;
                                                                } else {
                                                                    r10Var4 = r10Var5;
                                                                    z10Var4 = z10Var5;
                                                                    i12 = i13;
                                                                    m3Var = twoStepVerificationActivity4;
                                                                }
                                                                m3Var.J = password;
                                                                TwoStepVerificationActivity.r0(password);
                                                                n3.a(i12, z10Var4, r10Var4, m3Var.q0(), m3Var, t10Var4, z17, z18, b3Var4);
                                                                return;
                                                            }
                                                            b3Var4.b();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                b3Var3.f20053b = true;
                                                if (twoStepVerificationActivity3 != null) {
                                                    try {
                                                        twoStepVerificationActivity3.t0();
                                                        twoStepVerificationActivity3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                t10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                                b3Var3.b();
                                                return;
                                            }
                                            if (twoStepVerificationActivity3 != null) {
                                                twoStepVerificationActivity3.t0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i11);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            d3.b bVar2 = new d3.b(1);
                                            final Activity activity2 = activity;
                                            final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                            connectionsManager2.sendRequestTyped(getpassword, bVar2, new r10() {
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
                                                    m.b3 b3Var4 = m.b3.this;
                                                    if (b3Var4.f20052a) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        m3 m3Var = new m3(b3Var4);
                                                        int i18 = i11;
                                                        m3Var.setCurrentAccount(i18);
                                                        z10 z10Var4 = z10Var3;
                                                        r10 r10Var4 = r10Var3;
                                                        t10 t10Var4 = t10Var3;
                                                        boolean z17 = z15;
                                                        g3 g3Var = new g3(i18, z10Var4, r10Var4, m3Var, t10Var4, z17, z16, b3Var4, 0);
                                                        m3Var.f43917a0 = 1;
                                                        m3Var.f43921c0 = g3Var;
                                                        m3Var.J = password;
                                                        m3Var.K = false;
                                                        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                                        if (T2 != 0 && T2.getContext() != null) {
                                                            if (z17) {
                                                                ?? obj6 = new Object();
                                                                obj6.f28905a = true;
                                                                T2.showAsSheet(m3Var, obj6);
                                                                return;
                                                            }
                                                            T2.presentFragment(m3Var);
                                                            return;
                                                        }
                                                        b3Var4.b();
                                                        return;
                                                    }
                                                    b3Var4.b();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    String N0 = hd.N0(2131751285, null);
                                                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder.f28777a;
                                                    t1Var3.S = N0;
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.o(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i19 = org.telegram.ui.ActionBar.m6.f29489j5;
                                                    org.telegram.ui.ActionBar.t6.U(textView, i19, null);
                                                    textView.setTextSize(1, 16.0f);
                                                    if (hd.f24444a0) {
                                                        i12 = 5;
                                                    } else {
                                                        i12 = 3;
                                                    }
                                                    textView.setGravity(i12 | 48);
                                                    textView.setText(org.telegram.messenger.g0.W2(hd.N0(2131742598, null)));
                                                    linearLayout.addView(textView, c8.ma.o(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView = new ImageView(activity3);
                                                    imageView.setImageResource(2131231624);
                                                    if (hd.f24444a0) {
                                                        i13 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int L3 = org.telegram.messenger.g0.L(9.0f);
                                                    if (hd.f24444a0) {
                                                        L = 0;
                                                    } else {
                                                        L = org.telegram.messenger.g0.L(11.0f);
                                                    }
                                                    imageView.setPadding(i13, L3, L, 0);
                                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                                    org.telegram.ui.ActionBar.t6.s(imageView, i19, null, mode);
                                                    TextView textView2 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.t6.U(textView2, i19, null);
                                                    textView2.setTextSize(1, 16.0f);
                                                    if (hd.f24444a0) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = 3;
                                                    }
                                                    textView2.setGravity(i14 | 48);
                                                    textView2.setText(org.telegram.messenger.g0.W2(hd.N0(2131751288, null)));
                                                    if (hd.f24444a0) {
                                                        linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                                                        linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, c8.ma.o(-2, -2));
                                                        linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                                                    }
                                                    LinearLayout f11 = org.telegram.messenger.f3.f(activity3, 0);
                                                    linearLayout.addView(f11, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView2 = new ImageView(activity3);
                                                    imageView2.setImageResource(2131231624);
                                                    if (hd.f24444a0) {
                                                        i15 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    int L4 = org.telegram.messenger.g0.L(9.0f);
                                                    if (hd.f24444a0) {
                                                        L2 = 0;
                                                    } else {
                                                        L2 = org.telegram.messenger.g0.L(11.0f);
                                                    }
                                                    imageView2.setPadding(i15, L4, L2, 0);
                                                    org.telegram.ui.ActionBar.t6.s(imageView2, i19, null, mode);
                                                    TextView textView3 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.t6.U(textView3, i19, null);
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (hd.f24444a0) {
                                                        i16 = 5;
                                                    } else {
                                                        i16 = 3;
                                                    }
                                                    textView3.setGravity(i16 | 48);
                                                    textView3.setText(org.telegram.messenger.g0.W2(hd.N0(2131751287, null)));
                                                    if (hd.f24444a0) {
                                                        f11.addView(textView3, c8.ma.o(-1, -2));
                                                        i17 = 5;
                                                        f11.addView(imageView2, c8.ma.r(-2, -2, 5));
                                                    } else {
                                                        i17 = 5;
                                                        f11.addView(imageView2, c8.ma.o(-2, -2));
                                                        f11.addView(textView3, c8.ma.o(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                                                    if (equals2) {
                                                        alertDialog$Builder.k(hd.N0(2131751279, null), new h3(g2Var3, 0));
                                                        alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        org.telegram.ui.ActionBar.t6.U(textView4, i19, null);
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (!hd.f24444a0) {
                                                            i17 = 3;
                                                        }
                                                        org.telegram.messenger.f3.k(textView4, i17 | 48, null, 2131751286);
                                                        linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.h(hd.N0(2131747637, null), null);
                                                    }
                                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                    if (twoStepVerificationActivity4 != null) {
                                                        twoStepVerificationActivity4.showDialog(t1Var3);
                                                    } else {
                                                        g2Var3.showDialog(t1Var3);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        b3Var3.f20053b = true;
                                        if (twoStepVerificationActivity3 != null) {
                                            try {
                                                twoStepVerificationActivity3.t0();
                                                twoStepVerificationActivity3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        t10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                        b3Var3.b();
                                    }
                                });
                                return;
                            }
                            t1Var2.dismiss();
                            b3Var2.b();
                        }
                    };
                    if (z10Var != null) {
                        y10Var.a((TLMethod) z10Var.a(inputCheckPasswordSRP));
                        return;
                    } else if (r10Var != null) {
                        r10Var.a(inputCheckPasswordSRP, y10Var);
                        return;
                    } else {
                        return;
                    }
                }
                b3Var.b();
                return;
            }
            b3Var.b();
        }
    }
}
