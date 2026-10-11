package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ga0;
import org.telegram.ui.hb0;
public abstract class s2 {
    public static void a(final int i10, final Utilities.CallbackReturn callbackReturn, final Utilities.Callback2 callback2, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final Utilities.Callback3 callback3, final boolean z10, final boolean z11, final hb0 hb0Var) {
        if (!hb0Var.f38405b) {
            final org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null && U.getContext() != null) {
                final Activity parentActivity = U.getParentActivity();
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                if (parentActivity != null && currentUser != null) {
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(U.getContext(), 3, null);
                    if (z11) {
                        a2Var.q(250L);
                    }
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final hb0 hb0Var2 = hb0Var;
                            boolean z12 = hb0Var2.f38405b;
                            final org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                            if (!z12 && tLMethod != null) {
                                final int i11 = i10;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                ?? obj2 = new Object();
                                final Activity activity = parentActivity;
                                final Utilities.Callback2 callback22 = callback2;
                                final Utilities.Callback3 callback32 = callback3;
                                final Utilities.CallbackReturn callbackReturn2 = callbackReturn;
                                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                                final org.telegram.ui.ActionBar.m2 m2Var = U;
                                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                                final boolean z13 = z10;
                                final boolean z14 = z11;
                                connectionsManager.sendRequestTyped(tLMethod, obj2, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj3, Object obj4) {
                                        TLObject tLObject = (TLObject) obj3;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                        a2Var2.dismiss();
                                        final hb0 hb0Var3 = hb0Var2;
                                        if (hb0Var3.f38405b) {
                                            return;
                                        }
                                        final TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                                        final Utilities.Callback3 callback33 = callback32;
                                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = inputCheckPasswordSRP2;
                                        if (tL_error != null) {
                                            boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                                            final int i12 = i11;
                                            final Utilities.CallbackReturn callbackReturn3 = callbackReturn2;
                                            final Utilities.Callback2 callback23 = callback22;
                                            final boolean z15 = z13;
                                            final boolean z16 = z14;
                                            if (!equals && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                                                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                                                    ConnectionsManager.getInstance(i12).sendRequestTyped(new TL_account.getPassword(), new Object(), new Utilities.Callback2() {
                                                        @Override
                                                        public final void run(Object obj5, Object obj6) {
                                                            Utilities.Callback2 callback24;
                                                            Utilities.CallbackReturn callbackReturn4;
                                                            int i13;
                                                            r2 r2Var;
                                                            TL_account.Password password = (TL_account.Password) obj5;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj6;
                                                            hb0 hb0Var4 = hb0.this;
                                                            if (hb0Var4.f38405b) {
                                                                return;
                                                            }
                                                            if (tL_error2 == null) {
                                                                TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                                int i14 = i12;
                                                                Utilities.CallbackReturn callbackReturn5 = callbackReturn3;
                                                                Utilities.Callback2 callback25 = callback23;
                                                                Utilities.Callback3 callback34 = callback33;
                                                                boolean z17 = z15;
                                                                boolean z18 = z16;
                                                                if (twoStepVerificationActivity4 == null) {
                                                                    r2 r2Var2 = new r2(hb0Var4);
                                                                    r2Var2.setCurrentAccount(i14);
                                                                    callback24 = callback25;
                                                                    callbackReturn4 = callbackReturn5;
                                                                    i13 = i14;
                                                                    n2 n2Var = new n2(i13, callbackReturn4, callback24, r2Var2, callback34, z17, z18, hb0Var4, 1);
                                                                    r2Var2.Z = 1;
                                                                    r2Var2.f34635b0 = n2Var;
                                                                    r2Var2.s0(new ga0(hb0Var4, z17, r2Var2, 12));
                                                                    r2Var = r2Var2;
                                                                } else {
                                                                    callback24 = callback25;
                                                                    callbackReturn4 = callbackReturn5;
                                                                    i13 = i14;
                                                                    r2Var = twoStepVerificationActivity4;
                                                                }
                                                                r2Var.I = password;
                                                                TwoStepVerificationActivity.m0(password);
                                                                s2.a(i13, callbackReturn4, callback24, r2Var.l0(), r2Var, callback34, z17, z18, hb0Var4);
                                                                return;
                                                            }
                                                            hb0Var4.b();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                hb0Var3.f38406c = true;
                                                if (twoStepVerificationActivity3 != null) {
                                                    try {
                                                        twoStepVerificationActivity3.o0();
                                                        twoStepVerificationActivity3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                callback33.run(tLObject, tL_error, inputCheckPasswordSRP3);
                                                hb0Var3.b();
                                                return;
                                            }
                                            if (twoStepVerificationActivity3 != null) {
                                                twoStepVerificationActivity3.o0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i12);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            ?? obj5 = new Object();
                                            final Activity activity2 = activity;
                                            final org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                                            connectionsManager2.sendRequestTyped(getpassword, obj5, new Utilities.Callback2() {
                                                @Override
                                                public final void run(Object obj6, Object obj7) {
                                                    int i13;
                                                    int i14;
                                                    int dp;
                                                    int i15;
                                                    int i16;
                                                    int dp2;
                                                    int i17;
                                                    int i18;
                                                    int i19;
                                                    TL_account.Password password = (TL_account.Password) obj6;
                                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                                                    hb0 hb0Var4 = hb0.this;
                                                    if (hb0Var4.f38405b) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        r2 r2Var = new r2(hb0Var4);
                                                        int i20 = i12;
                                                        r2Var.setCurrentAccount(i20);
                                                        Utilities.CallbackReturn callbackReturn4 = callbackReturn3;
                                                        Utilities.Callback2 callback24 = callback23;
                                                        Utilities.Callback3 callback34 = callback33;
                                                        boolean z17 = z15;
                                                        n2 n2Var = new n2(i20, callbackReturn4, callback24, r2Var, callback34, z17, z16, hb0Var4, 0);
                                                        r2Var.Z = 1;
                                                        r2Var.f34635b0 = n2Var;
                                                        r2Var.I = password;
                                                        r2Var.J = false;
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != 0 && U2.getContext() != null) {
                                                            if (z17) {
                                                                ?? obj8 = new Object();
                                                                obj8.f21349a = true;
                                                                U2.showAsSheet(r2Var, obj8);
                                                                return;
                                                            }
                                                            U2.presentFragment(r2Var);
                                                            return;
                                                        }
                                                        hb0Var4.b();
                                                        return;
                                                    }
                                                    hb0Var4.b();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.n(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i21 = org.telegram.ui.ActionBar.h6.f20930j5;
                                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
                                                    textView.setTextSize(1, 16.0f);
                                                    if (LocaleController.isRTL) {
                                                        i13 = 5;
                                                    } else {
                                                        i13 = 3;
                                                    }
                                                    textView.setGravity(i13 | 48);
                                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                                                    linearLayout.addView(textView, w7.x5.n(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView = new ImageView(activity3);
                                                    imageView.setImageResource(R.drawable.list_circle);
                                                    if (LocaleController.isRTL) {
                                                        i14 = AndroidUtilities.dp(11.0f);
                                                    } else {
                                                        i14 = 0;
                                                    }
                                                    int dp3 = AndroidUtilities.dp(9.0f);
                                                    if (LocaleController.isRTL) {
                                                        dp = 0;
                                                    } else {
                                                        dp = AndroidUtilities.dp(11.0f);
                                                    }
                                                    imageView.setPadding(i14, dp3, dp, 0);
                                                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, i21, false);
                                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                                                    TextView textView2 = new TextView(activity3);
                                                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
                                                    textView2.setTextSize(1, 16.0f);
                                                    if (LocaleController.isRTL) {
                                                        i15 = 5;
                                                    } else {
                                                        i15 = 3;
                                                    }
                                                    textView2.setGravity(i15 | 48);
                                                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText1, textView2);
                                                    if (LocaleController.isRTL) {
                                                        linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                                                        linearLayout2.addView(imageView, w7.x5.q(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, w7.x5.n(-2, -2));
                                                        linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                                                    }
                                                    LinearLayout e7 = org.telegram.messenger.q.e(activity3, 0);
                                                    linearLayout.addView(e7, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView2 = new ImageView(activity3);
                                                    imageView2.setImageResource(R.drawable.list_circle);
                                                    if (LocaleController.isRTL) {
                                                        i16 = AndroidUtilities.dp(11.0f);
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int dp4 = AndroidUtilities.dp(9.0f);
                                                    if (LocaleController.isRTL) {
                                                        dp2 = 0;
                                                    } else {
                                                        dp2 = AndroidUtilities.dp(11.0f);
                                                    }
                                                    imageView2.setPadding(i16, dp4, dp2, 0);
                                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i21, false), mode));
                                                    TextView textView3 = new TextView(activity3);
                                                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (LocaleController.isRTL) {
                                                        i17 = 5;
                                                    } else {
                                                        i17 = 3;
                                                    }
                                                    textView3.setGravity(i17 | 48);
                                                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText2, textView3);
                                                    if (LocaleController.isRTL) {
                                                        e7.addView(textView3, w7.x5.n(-1, -2));
                                                        i18 = 5;
                                                        e7.addView(imageView2, w7.x5.q(-2, -2, 5));
                                                    } else {
                                                        i18 = 5;
                                                        e7.addView(imageView2, w7.x5.n(-2, -2));
                                                        e7.addView(textView3, w7.x5.n(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                                                    if (equals2) {
                                                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new o2(0, m2Var3));
                                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (LocaleController.isRTL) {
                                                            i19 = i18;
                                                        } else {
                                                            i19 = 3;
                                                        }
                                                        textView4.setGravity(i19 | 48);
                                                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                                                        linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                                    }
                                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                    if (twoStepVerificationActivity4 != null) {
                                                        twoStepVerificationActivity4.showDialog(alertDialog$Builder.f20404a);
                                                    } else {
                                                        m2Var3.showDialog(alertDialog$Builder.f20404a);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        hb0Var3.f38406c = true;
                                        if (twoStepVerificationActivity3 != null) {
                                            try {
                                                twoStepVerificationActivity3.o0();
                                                twoStepVerificationActivity3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        callback33.run(tLObject, tL_error, inputCheckPasswordSRP3);
                                        hb0Var3.b();
                                    }
                                });
                                return;
                            }
                            a2Var2.dismiss();
                            hb0Var2.b();
                        }
                    };
                    if (callbackReturn != null) {
                        callback.run((TLMethod) callbackReturn.run(inputCheckPasswordSRP));
                        return;
                    } else if (callback2 != null) {
                        callback2.run(inputCheckPasswordSRP, callback);
                        return;
                    } else {
                        return;
                    }
                }
                hb0Var.b();
                return;
            }
            hb0Var.b();
        }
    }
}
