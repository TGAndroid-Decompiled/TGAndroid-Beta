package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d80;
public abstract class r2 {
    public static void a(final int i10, final Utilities.CallbackReturn callbackReturn, final Utilities.Callback2 callback2, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final Utilities.Callback3 callback3, final boolean z10, final boolean z11, final ag.b1 b1Var) {
        if (!b1Var.f1255b) {
            final org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null && U.getContext() != null) {
                final Activity parentActivity = U.getParentActivity();
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                if (parentActivity != null && currentUser != null) {
                    final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(U.getContext(), 3, null);
                    if (z11) {
                        e2Var.r(250L);
                    }
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final ag.b1 b1Var2 = b1Var;
                            boolean z12 = b1Var2.f1255b;
                            final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (!z12 && tLMethod != null) {
                                final int i11 = i10;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                                ?? obj2 = new Object();
                                final Activity activity = parentActivity;
                                final Utilities.Callback2 callback22 = callback2;
                                final Utilities.Callback3 callback32 = callback3;
                                final Utilities.CallbackReturn callbackReturn2 = callbackReturn;
                                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                                final org.telegram.ui.ActionBar.r2 r2Var = U;
                                final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                                final boolean z13 = z10;
                                final boolean z14 = z11;
                                connectionsManager.sendRequestTyped(tLMethod, obj2, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj3, Object obj4) {
                                        TLObject tLObject = (TLObject) obj3;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                        e2Var2.dismiss();
                                        final ag.b1 b1Var3 = b1Var2;
                                        if (b1Var3.f1255b) {
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
                                                            q2 q2Var;
                                                            TL_account.Password password = (TL_account.Password) obj5;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj6;
                                                            ag.b1 b1Var4 = ag.b1.this;
                                                            if (b1Var4.f1255b) {
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
                                                                    q2 q2Var2 = new q2(b1Var4);
                                                                    q2Var2.setCurrentAccount(i14);
                                                                    callback24 = callback25;
                                                                    callbackReturn4 = callbackReturn5;
                                                                    i13 = i14;
                                                                    m2 m2Var = new m2(i13, callbackReturn4, callback24, q2Var2, callback34, z17, z18, b1Var4, 1);
                                                                    q2Var2.Z = 1;
                                                                    q2Var2.f36305b0 = m2Var;
                                                                    q2Var2.t0(new d80(b1Var4, z17, q2Var2, 13));
                                                                    q2Var = q2Var2;
                                                                } else {
                                                                    callback24 = callback25;
                                                                    callbackReturn4 = callbackReturn5;
                                                                    i13 = i14;
                                                                    q2Var = twoStepVerificationActivity4;
                                                                }
                                                                q2Var.I = password;
                                                                TwoStepVerificationActivity.n0(password);
                                                                r2.a(i13, callbackReturn4, callback24, q2Var.m0(), q2Var, callback34, z17, z18, b1Var4);
                                                                return;
                                                            }
                                                            b1Var4.b();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                b1Var3.f1256c = true;
                                                if (twoStepVerificationActivity3 != null) {
                                                    try {
                                                        twoStepVerificationActivity3.p0();
                                                        twoStepVerificationActivity3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                callback33.run(tLObject, tL_error, inputCheckPasswordSRP3);
                                                b1Var3.b();
                                                return;
                                            }
                                            if (twoStepVerificationActivity3 != null) {
                                                twoStepVerificationActivity3.p0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i12);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            ?? obj5 = new Object();
                                            final Activity activity2 = activity;
                                            final org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
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
                                                    ag.b1 b1Var4 = ag.b1.this;
                                                    if (b1Var4.f1255b) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        q2 q2Var = new q2(b1Var4);
                                                        int i20 = i12;
                                                        q2Var.setCurrentAccount(i20);
                                                        Utilities.CallbackReturn callbackReturn4 = callbackReturn3;
                                                        Utilities.Callback2 callback24 = callback23;
                                                        Utilities.Callback3 callback34 = callback33;
                                                        boolean z17 = z15;
                                                        m2 m2Var = new m2(i20, callbackReturn4, callback24, q2Var, callback34, z17, z16, b1Var4, 0);
                                                        q2Var.Z = 1;
                                                        q2Var.f36305b0 = m2Var;
                                                        q2Var.I = password;
                                                        q2Var.J = false;
                                                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                        if (U2 != 0 && U2.getContext() != null) {
                                                            if (z17) {
                                                                ?? obj8 = new Object();
                                                                obj8.f22928a = true;
                                                                U2.showAsSheet(q2Var, obj8);
                                                                return;
                                                            }
                                                            U2.presentFragment(q2Var);
                                                            return;
                                                        }
                                                        b1Var4.b();
                                                        return;
                                                    }
                                                    b1Var4.b();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.o(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i21 = org.telegram.ui.ActionBar.y6.f23464j5;
                                                    org.telegram.ui.ActionBar.f7.V(textView, i21, null);
                                                    textView.setTextSize(1, 16.0f);
                                                    if (LocaleController.isRTL) {
                                                        i13 = 5;
                                                    } else {
                                                        i13 = 3;
                                                    }
                                                    textView.setGravity(i13 | 48);
                                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                                                    linearLayout.addView(textView, gb1.r(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                                    org.telegram.ui.ActionBar.f7.t(imageView, i21, null, mode);
                                                    TextView textView2 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.f7.V(textView2, i21, null);
                                                    textView2.setTextSize(1, 16.0f);
                                                    if (LocaleController.isRTL) {
                                                        i15 = 5;
                                                    } else {
                                                        i15 = 3;
                                                    }
                                                    textView2.setGravity(i15 | 48);
                                                    org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText1, textView2);
                                                    if (LocaleController.isRTL) {
                                                        linearLayout2.addView(textView2, gb1.r(-1, -2));
                                                        linearLayout2.addView(imageView, gb1.u(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, gb1.r(-2, -2));
                                                        linearLayout2.addView(textView2, gb1.r(-1, -2));
                                                    }
                                                    LinearLayout f7 = org.telegram.messenger.t.f(activity3, 0);
                                                    linearLayout.addView(f7, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                                                    org.telegram.ui.ActionBar.f7.t(imageView2, i21, null, mode);
                                                    TextView textView3 = new TextView(activity3);
                                                    org.telegram.ui.ActionBar.f7.V(textView3, i21, null);
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (LocaleController.isRTL) {
                                                        i17 = 5;
                                                    } else {
                                                        i17 = 3;
                                                    }
                                                    textView3.setGravity(i17 | 48);
                                                    org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText2, textView3);
                                                    if (LocaleController.isRTL) {
                                                        f7.addView(textView3, gb1.r(-1, -2));
                                                        i18 = 5;
                                                        f7.addView(imageView2, gb1.u(-2, -2, 5));
                                                    } else {
                                                        i18 = 5;
                                                        f7.addView(imageView2, gb1.r(-2, -2));
                                                        f7.addView(textView3, gb1.r(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2;
                                                    if (equals2) {
                                                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new n2(r2Var3, 0));
                                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        org.telegram.ui.ActionBar.f7.V(textView4, i21, null);
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (LocaleController.isRTL) {
                                                            i19 = i18;
                                                        } else {
                                                            i19 = 3;
                                                        }
                                                        textView4.setGravity(i19 | 48);
                                                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                                                        linearLayout.addView(textView4, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                                    }
                                                    TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                                                    if (twoStepVerificationActivity4 != null) {
                                                        twoStepVerificationActivity4.showDialog(alertDialog$Builder.f22368a);
                                                    } else {
                                                        r2Var3.showDialog(alertDialog$Builder.f22368a);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        b1Var3.f1256c = true;
                                        if (twoStepVerificationActivity3 != null) {
                                            try {
                                                twoStepVerificationActivity3.p0();
                                                twoStepVerificationActivity3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        callback33.run(tLObject, tL_error, inputCheckPasswordSRP3);
                                        b1Var3.b();
                                    }
                                });
                                return;
                            }
                            e2Var2.dismiss();
                            b1Var2.b();
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
                b1Var.b();
                return;
            }
            b1Var.b();
        }
    }
}
