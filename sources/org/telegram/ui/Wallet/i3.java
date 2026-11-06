package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g60;
public abstract class i3 {
    public static void a(final int i7, final d20 d20Var, final v10 v10Var, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final x10 x10Var, final boolean z9, final boolean z10, final bg.v0 v0Var) {
        if (!v0Var.f3389b) {
            final org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null && T.getContext() != null) {
                final Activity parentActivity = T.getParentActivity();
                TLRPC.User f10 = p10.i(i7).f();
                if (parentActivity != null && f10 != null) {
                    final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, T.getContext(), null);
                    if (z10) {
                        u1Var.r(250L);
                    }
                    c20 c20Var = new c20() {
                        @Override
                        public final void a(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final bg.v0 v0Var2 = v0Var;
                            boolean z11 = v0Var2.f3389b;
                            final org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                            if (!z11 && tLMethod != null) {
                                final int i10 = i7;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                                d3.b bVar = new d3.b(1);
                                final Activity activity = parentActivity;
                                final v10 v10Var2 = v10Var;
                                final x10 x10Var2 = x10Var;
                                final d20 d20Var2 = d20Var;
                                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                                final org.telegram.ui.ActionBar.f2 f2Var = T;
                                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                                final boolean z12 = z9;
                                final boolean z13 = z10;
                                connectionsManager.sendRequestTyped(tLMethod, bVar, new v10() {
                                    @Override
                                    public final void a(Object obj2, Object obj3) {
                                        TLObject tLObject = (TLObject) obj2;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                        u1Var2.dismiss();
                                        final bg.v0 v0Var3 = v0Var2;
                                        if (v0Var3.f3389b) {
                                            return;
                                        }
                                        final TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                                        final x10 x10Var3 = x10Var2;
                                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = inputCheckPasswordSRP2;
                                        if (tL_error != null) {
                                            boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                                            final int i11 = i10;
                                            final d20 d20Var3 = d20Var2;
                                            final v10 v10Var3 = v10Var2;
                                            final boolean z14 = z12;
                                            final boolean z15 = z13;
                                            if (!equals && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                                                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                                                    ConnectionsManager.getInstance(i11).sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new v10() {
                                                        @Override
                                                        public final void a(Object obj4, Object obj5) {
                                                            v10 v10Var4;
                                                            d20 d20Var4;
                                                            int i12;
                                                            h3 h3Var;
                                                            TL_account.Password password = (TL_account.Password) obj4;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                            bg.v0 v0Var4 = bg.v0.this;
                                                            if (v0Var4.f3389b) {
                                                                return;
                                                            }
                                                            if (tL_error2 == null) {
                                                                TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                                int i13 = i11;
                                                                d20 d20Var5 = d20Var3;
                                                                v10 v10Var5 = v10Var3;
                                                                x10 x10Var4 = x10Var3;
                                                                boolean z16 = z14;
                                                                boolean z17 = z15;
                                                                if (twoStepVerificationActivity4 == null) {
                                                                    h3 h3Var2 = new h3(v0Var4);
                                                                    h3Var2.setCurrentAccount(i13);
                                                                    v10Var4 = v10Var5;
                                                                    d20Var4 = d20Var5;
                                                                    i12 = i13;
                                                                    d3 d3Var = new d3(i12, d20Var4, v10Var4, h3Var2, x10Var4, z16, z17, v0Var4, 1);
                                                                    h3Var2.Z = 1;
                                                                    h3Var2.f42052b0 = d3Var;
                                                                    h3Var2.x0(new g60(v0Var4, z16, h3Var2, 13));
                                                                    h3Var = h3Var2;
                                                                } else {
                                                                    v10Var4 = v10Var5;
                                                                    d20Var4 = d20Var5;
                                                                    i12 = i13;
                                                                    h3Var = twoStepVerificationActivity4;
                                                                }
                                                                h3Var.I = password;
                                                                TwoStepVerificationActivity.r0(password);
                                                                i3.a(i12, d20Var4, v10Var4, h3Var.q0(), h3Var, x10Var4, z16, z17, v0Var4);
                                                                return;
                                                            }
                                                            v0Var4.a();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                v0Var3.f3390c = true;
                                                if (twoStepVerificationActivity3 != null) {
                                                    try {
                                                        twoStepVerificationActivity3.t0();
                                                        twoStepVerificationActivity3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                x10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                                v0Var3.a();
                                                return;
                                            }
                                            if (twoStepVerificationActivity3 != null) {
                                                twoStepVerificationActivity3.t0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i11);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            d3.b bVar2 = new d3.b(1);
                                            final Activity activity2 = activity;
                                            final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                            connectionsManager2.sendRequestTyped(getpassword, bVar2, new v10() {
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
                                                    bg.v0 v0Var4 = bg.v0.this;
                                                    if (v0Var4.f3389b) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        h3 h3Var = new h3(v0Var4);
                                                        int i18 = i11;
                                                        h3Var.setCurrentAccount(i18);
                                                        d20 d20Var4 = d20Var3;
                                                        v10 v10Var4 = v10Var3;
                                                        x10 x10Var4 = x10Var3;
                                                        boolean z16 = z14;
                                                        d3 d3Var = new d3(i18, d20Var4, v10Var4, h3Var, x10Var4, z16, z15, v0Var4, 0);
                                                        h3Var.Z = 1;
                                                        h3Var.f42052b0 = d3Var;
                                                        h3Var.I = password;
                                                        h3Var.J = false;
                                                        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                        if (T2 != 0 && T2.getContext() != null) {
                                                            if (z16) {
                                                                ?? obj6 = new Object();
                                                                obj6.f27420a = true;
                                                                T2.showAsSheet(h3Var, obj6);
                                                                return;
                                                            }
                                                            T2.presentFragment(h3Var);
                                                            return;
                                                        }
                                                        v0Var4.a();
                                                        return;
                                                    }
                                                    v0Var4.a();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    String M0 = hd.M0(2131751298, null);
                                                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder.f27292a;
                                                    u1Var3.R = M0;
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.o(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i19 = org.telegram.ui.ActionBar.k6.f27956j5;
                                                    org.telegram.ui.ActionBar.r6.V(textView, i19, null);
                                                    textView.setTextSize(1, 16.0f);
                                                    if (hd.f22871a0) {
                                                        i12 = 5;
                                                    } else {
                                                        i12 = 3;
                                                    }
                                                    textView.setGravity(i12 | 48);
                                                    textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131742865, null)));
                                                    linearLayout.addView(textView, c8.ha.o(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView = new ImageView(activity3);
                                                    imageView.setImageResource(2131231623);
                                                    if (hd.f22871a0) {
                                                        i13 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int L3 = org.telegram.messenger.g0.L(9.0f);
                                                    if (hd.f22871a0) {
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
                                                    if (hd.f22871a0) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = 3;
                                                    }
                                                    textView2.setGravity(i14 | 48);
                                                    textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131751301, null)));
                                                    if (hd.f22871a0) {
                                                        linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                                                        linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, c8.ha.o(-2, -2));
                                                        linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                                                    }
                                                    LinearLayout e10 = org.telegram.messenger.k5.e(activity3, 0);
                                                    linearLayout.addView(e10, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView2 = new ImageView(activity3);
                                                    imageView2.setImageResource(2131231623);
                                                    if (hd.f22871a0) {
                                                        i15 = org.telegram.messenger.g0.L(11.0f);
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    int L4 = org.telegram.messenger.g0.L(9.0f);
                                                    if (hd.f22871a0) {
                                                        L2 = 0;
                                                    } else {
                                                        L2 = org.telegram.messenger.g0.L(11.0f);
                                                    }
                                                    imageView2.setPadding(i15, L4, L2, 0);
                                                    org.telegram.ui.ActionBar.r6.t(imageView2, i19, null, mode);
                                                    TextView textView3 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.r6.V(textView3, i19, null);
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (hd.f22871a0) {
                                                        i16 = 5;
                                                    } else {
                                                        i16 = 3;
                                                    }
                                                    textView3.setGravity(i16 | 48);
                                                    textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131751300, null)));
                                                    if (hd.f22871a0) {
                                                        e10.addView(textView3, c8.ha.o(-1, -2));
                                                        i17 = 5;
                                                        e10.addView(imageView2, c8.ha.r(-2, -2, 5));
                                                    } else {
                                                        i17 = 5;
                                                        e10.addView(imageView2, c8.ha.o(-2, -2));
                                                        e10.addView(textView3, c8.ha.o(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                                                    if (equals2) {
                                                        alertDialog$Builder.k(hd.M0(2131751292, null), new e3(f2Var3, 0));
                                                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        org.telegram.ui.ActionBar.r6.V(textView4, i19, null);
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (!hd.f22871a0) {
                                                            i17 = 3;
                                                        }
                                                        org.telegram.messenger.k5.m(textView4, i17 | 48, null, 2131751299);
                                                        linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.h(hd.M0(2131747830, null), null);
                                                    }
                                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                    if (twoStepVerificationActivity4 != null) {
                                                        twoStepVerificationActivity4.showDialog(u1Var3);
                                                    } else {
                                                        f2Var3.showDialog(u1Var3);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        v0Var3.f3390c = true;
                                        if (twoStepVerificationActivity3 != null) {
                                            try {
                                                twoStepVerificationActivity3.t0();
                                                twoStepVerificationActivity3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        x10Var3.a(tLObject, tL_error, inputCheckPasswordSRP3);
                                        v0Var3.a();
                                    }
                                });
                                return;
                            }
                            u1Var2.dismiss();
                            v0Var2.a();
                        }
                    };
                    if (d20Var != null) {
                        c20Var.a((TLMethod) d20Var.a(inputCheckPasswordSRP));
                        return;
                    } else if (v10Var != null) {
                        v10Var.a(inputCheckPasswordSRP, c20Var);
                        return;
                    } else {
                        return;
                    }
                }
                v0Var.a();
                return;
            }
            v0Var.a();
        }
    }
}
