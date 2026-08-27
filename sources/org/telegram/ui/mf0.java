package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class mf0 extends org.telegram.ui.Components.ev0 implements NotificationCenter.NotificationCenterDelegate {

    public static final int f40477p0 = 0;
    public final TextView A;
    public final LinearLayout B;
    public final org.telegram.ui.Components.ri0 C;
    public Bundle D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ImageView H;
    public final ImageView I;
    public final org.telegram.ui.Components.oi0 J;
    public final org.telegram.ui.Components.oi0 K;
    public final org.telegram.ui.Components.oi0 L;
    public boolean M;
    public Timer N;
    public Timer O;
    public int P;
    public final Object Q;
    public int R;
    public int S;
    public double T;
    public double U;
    public boolean V;
    public boolean W;

    public final org.telegram.ui.Components.oi0 f40478a;

    public String f40479a0;

    public String f40480b;

    public final int f40481b0;

    public String f40482c;

    public int f40483c0;
    public String d;

    public int f40484d0;

    public String f40485e;

    public boolean f40486e0;

    public final ur f40487f;

    public String f40488f0;

    public String f40489g0;
    public final org.telegram.ui.Components.voip.m2 h;

    public String f40490h0;

    public int f40491i0;

    public String f40492j0;

    public Bundle f40493k0;

    public TLRPC.TL_auth_sentCode f40494l0;
    public boolean m0;

    public final TextView f40495n;

    public final ye0 f40496n0;

    public final ig0 f40497o0;

    public final TextView f40498r;

    public final org.telegram.ui.Components.ri0 f40499s;
    public final kf0 v;

    public final rd0 f40500w;

    public final kf0 f40501x;

    public final FrameLayout f40502y;

    public mf0(ig0 ig0Var, Context context, int i10) {
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        rd0 rd0Var;
        int i11;
        super(context);
        this.f40497o0 = ig0Var;
        this.Q = new Object();
        this.R = 60000;
        this.S = 15000;
        this.f40479a0 = "";
        this.f40486e0 = false;
        this.f40488f0 = "*";
        this.f40489g0 = "";
        this.f40496n0 = new ye0(this, 2);
        this.f40481b0 = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f40495n = textView;
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f40498r = textView2;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView2);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        String string = ig0Var.B != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
        if (i10 != 11) {
            if (i10 == 3) {
                textView.setGravity(1);
                ViewGroup frameLayout2 = new FrameLayout(context);
                addView(frameLayout2, h7.z5.l(1.0f, -1, 0));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                frameLayout2.addView(linearLayout, h7.z5.e(-1, -2, 17));
                ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                FrameLayout frameLayout3 = new FrameLayout(context);
                linearLayout.addView(frameLayout3, h7.z5.e(-2, -2, 1));
                org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
                this.f40499s = ri0Var;
                int i12 = R.raw.phone_flash_call;
                org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(i12, String.valueOf(i12), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                this.f40478a = oi0Var;
                ri0Var.setAnimation(oi0Var);
                frameLayout3.addView(ri0Var, h7.z5.c(64.0f, 64));
                textView2.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                linearLayout.addView(textView2, h7.z5.t(-2, -2, 1, 0, 16, 0, 0));
                linearLayout.addView(textView, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
                viewGroup = frameLayout2;
            } else {
                textView.setGravity(49);
                FrameLayout frameLayout4 = new FrameLayout(context);
                addView(frameLayout4, h7.z5.t(-2, -2, 49, 0, 16, 0, 0));
                int i13 = i10 == 1 ? 128 : 64;
                if (i10 == 1) {
                    int i14 = R.raw.code_laptop;
                    float f10 = i13;
                    this.f40478a = new org.telegram.ui.Components.oi0(i14, String.valueOf(i14), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
                } else {
                    int i15 = R.raw.sms_incoming_info;
                    float f11 = i13;
                    this.f40478a = new org.telegram.ui.Components.oi0(i15, String.valueOf(i15), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
                    int i16 = R.raw.phone_stars_to_dots;
                    this.J = new org.telegram.ui.Components.oi0(i16, String.valueOf(i16), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
                    int i17 = R.raw.phone_dots;
                    this.K = new org.telegram.ui.Components.oi0(i17, String.valueOf(i17), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
                    int i18 = R.raw.phone_dots_to_stars;
                    this.L = new org.telegram.ui.Components.oi0(i18, String.valueOf(i18), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), true, null);
                }
                org.telegram.ui.Components.ri0 ri0Var2 = new org.telegram.ui.Components.ri0(context);
                this.f40499s = ri0Var2;
                ri0Var2.setAnimation(this.f40478a);
                if (i10 == 1 && !AndroidUtilities.isSmallScreen()) {
                    ri0Var2.setTranslationY(-AndroidUtilities.dp(24.0f));
                }
                frameLayout4.addView(ri0Var2, h7.z5.d(i13, i13, 51, 0.0f, 0.0f, 0.0f, (i10 != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
                if (string == null) {
                    string = LocaleController.getString(i10 == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
                }
                textView2.setText(string);
                addView(textView2, h7.z5.t(-2, -2, 49, 0, 18, 0, 0));
                int i19 = i10 == 15 ? 16 : 0;
                addView(textView, h7.z5.t(-2, -2, 49, i19, 17, i19, 0));
            }
            if (i10 != 11) {
                jf0 jf0Var = new jf0(this, context, 1);
                this.f40487f = jf0Var;
                addView(jf0Var, h7.z5.t(-2, 42, 1, 0, 32, 0, 0));
            }
            if (i10 == 3) {
                this.f40487f.setVisibility(8);
            }
            org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(ig0Var, context);
            this.h = m2Var;
            int i20 = org.telegram.ui.ActionBar.g6.I6;
            m2Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            m2Var.setTextColor(ig0Var.getThemedColor(i20));
            m2Var.setTextSize(1, 14.0f);
            m2Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            m2Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            final int i21 = 0;
            m2Var.setOnClickListener(new View.OnClickListener(this) {

                public final mf0 f38798b;

                {
                    this.f38798b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i21) {
                        case 0:
                            this.f38798b.c(true);
                            break;
                        case 1:
                            mf0 mf0Var = this.f38798b;
                            kf0 kf0Var = mf0Var.v;
                            if (mf0Var.R <= 0 || mf0Var.N == null) {
                                mf0Var.f40486e0 = true;
                                kf0Var.invalidate();
                                kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                int i22 = mf0Var.f40483c0;
                                if (i22 == 4 || i22 == 2 || i22 == 17 || i22 == 16 || i22 == 11 || i22 == 15) {
                                    if (i22 == 4 || i22 == 11) {
                                        kf0Var.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        kf0Var.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", mf0Var.f40480b);
                                    bundle.putString("ephone", mf0Var.f40485e);
                                    bundle.putString("phoneFormated", mf0Var.d);
                                    bundle.putInt("prevType", mf0Var.f40481b0);
                                    mf0Var.s();
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = mf0Var.d;
                                    tL_auth_resendCode.phone_code_hash = mf0Var.f40482c;
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) mf0Var.f40497o0).currentAccount).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                } else if (i22 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                    mf0Var.V = false;
                                    mf0Var.u();
                                    mf0Var.f40486e0 = false;
                                    mf0Var.x();
                                }
                            }
                            break;
                        default:
                            mf0 mf0Var2 = this.f38798b;
                            mf0Var2.getClass();
                            try {
                                mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.f40492j0)));
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            break;
                    }
                }
            });
            addView(m2Var, h7.z5.t(-2, -2, 1, 0, 18, 0, 0));
            m2Var.setVisibility(8);
            frameLayout = new FrameLayout(context);
            this.f40502y = frameLayout;
            kf0 kf0Var = new kf0(this, context, 0);
            this.v = kf0Var;
            kf0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            kf0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            kf0Var.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            kf0Var.setTextSize(1, 15.0f);
            kf0Var.setGravity(51);
            final int i22 = 1;
            kf0Var.setOnClickListener(new View.OnClickListener(this) {

                public final mf0 f38798b;

                {
                    this.f38798b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i22) {
                        case 0:
                            this.f38798b.c(true);
                            break;
                        case 1:
                            mf0 mf0Var = this.f38798b;
                            kf0 kf0Var2 = mf0Var.v;
                            if (mf0Var.R <= 0 || mf0Var.N == null) {
                                mf0Var.f40486e0 = true;
                                kf0Var2.invalidate();
                                kf0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                int i23 = mf0Var.f40483c0;
                                if (i23 == 4 || i23 == 2 || i23 == 17 || i23 == 16 || i23 == 11 || i23 == 15) {
                                    if (i23 == 4 || i23 == 11) {
                                        kf0Var2.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        kf0Var2.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", mf0Var.f40480b);
                                    bundle.putString("ephone", mf0Var.f40485e);
                                    bundle.putString("phoneFormated", mf0Var.d);
                                    bundle.putInt("prevType", mf0Var.f40481b0);
                                    mf0Var.s();
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = mf0Var.d;
                                    tL_auth_resendCode.phone_code_hash = mf0Var.f40482c;
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) mf0Var.f40497o0).currentAccount).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                } else if (i23 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                    mf0Var.V = false;
                                    mf0Var.u();
                                    mf0Var.f40486e0 = false;
                                    mf0Var.x();
                                }
                            }
                            break;
                        default:
                            mf0 mf0Var2 = this.f38798b;
                            mf0Var2.getClass();
                            try {
                                mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.f40492j0)));
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(kf0Var, h7.z5.e(-2, -2, 49));
            rd0Var = new rd0(context, 1);
            this.f40500w = rd0Var;
            if (i10 != 15) {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                Interpolator interpolator = org.telegram.ui.Components.ws.f34319e;
                animationLoadAnimation.setInterpolator(interpolator);
                rd0Var.setInAnimation(animationLoadAnimation);
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                animationLoadAnimation2.setInterpolator(interpolator);
                rd0Var.setOutAnimation(animationLoadAnimation2);
                kf0 kf0Var2 = new kf0(this, context, 1);
                this.f40501x = kf0Var2;
                kf0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                kf0Var2.setTextSize(1, 15.0f);
                kf0Var2.setGravity(49);
                kf0Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                frameLayout.addView(kf0Var2, h7.z5.e(-1, -2, 17));
                rd0Var.addView(frameLayout, h7.z5.e(-2, -2, 17));
            } else {
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                Interpolator interpolator2 = org.telegram.ui.Components.er.f28122f;
                animationLoadAnimation3.setInterpolator(interpolator2);
                rd0Var.setInAnimation(animationLoadAnimation3);
                Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                animationLoadAnimation4.setInterpolator(interpolator2);
                rd0Var.setOutAnimation(animationLoadAnimation4);
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.B = linearLayout2;
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(17);
                linearLayout2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                int iDp = AndroidUtilities.dp(6.0f);
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wh, false);
                int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Q9, false);
                linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW0, iW1, iW1));
                final int i23 = 2;
                linearLayout2.setOnClickListener(new View.OnClickListener(this) {

                    public final mf0 f38798b;

                    {
                        this.f38798b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                this.f38798b.c(true);
                                break;
                            case 1:
                                mf0 mf0Var = this.f38798b;
                                kf0 kf0Var3 = mf0Var.v;
                                if (mf0Var.R <= 0 || mf0Var.N == null) {
                                    mf0Var.f40486e0 = true;
                                    kf0Var3.invalidate();
                                    kf0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                    int i24 = mf0Var.f40483c0;
                                    if (i24 == 4 || i24 == 2 || i24 == 17 || i24 == 16 || i24 == 11 || i24 == 15) {
                                        if (i24 == 4 || i24 == 11) {
                                            kf0Var3.setText(LocaleController.getString(R.string.Calling));
                                        } else {
                                            kf0Var3.setText(LocaleController.getString(R.string.SendingSms));
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phone", mf0Var.f40480b);
                                        bundle.putString("ephone", mf0Var.f40485e);
                                        bundle.putString("phoneFormated", mf0Var.d);
                                        bundle.putInt("prevType", mf0Var.f40481b0);
                                        mf0Var.s();
                                        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                        tL_auth_resendCode.phone_number = mf0Var.d;
                                        tL_auth_resendCode.phone_code_hash = mf0Var.f40482c;
                                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) mf0Var.f40497o0).currentAccount).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                    } else if (i24 == 3) {
                                        AndroidUtilities.setWaitingForSms(false);
                                        NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                        mf0Var.V = false;
                                        mf0Var.u();
                                        mf0Var.f40486e0 = false;
                                        mf0Var.x();
                                    }
                                }
                                break;
                            default:
                                mf0 mf0Var2 = this.f38798b;
                                mf0Var2.getClass();
                                try {
                                    mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.f40492j0)));
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                                break;
                        }
                    }
                });
                rd0Var.addView(linearLayout2, h7.z5.c(52.0f, -1));
                org.telegram.ui.Components.ri0 ri0Var3 = new org.telegram.ui.Components.ri0(context);
                this.C = ri0Var3;
                ri0Var3.f(R.raw.fragment, 36, 36, null);
                linearLayout2.addView(ri0Var3, h7.z5.t(36, 36, 16, 0, 0, 2, 0));
                TextView textView3 = new TextView(context);
                textView3.setText(LocaleController.getString(R.string.OpenFragment));
                textView3.setTextColor(-1);
                textView3.setTextSize(1, 15.0f);
                textView3.setGravity(17);
                textView3.setTypeface(AndroidUtilities.bold());
                linearLayout2.addView(textView3);
            }
            TextView textView4 = new TextView(context);
            this.A = textView4;
            textView4.setLineSpacing(org.telegram.ui.Cells.pa.c(2.0f, R.string.WrongCode, textView4), 1.0f);
            textView4.setTextSize(1, 15.0f);
            textView4.setGravity(49);
            textView4.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            rd0Var.addView(textView4, h7.z5.e(-2, -2, 17));
            if (viewGroup == null) {
                FrameLayout frameLayout5 = new FrameLayout(context);
                if (i10 == 15) {
                    i11 = -1;
                } else {
                    i11 = -2;
                }
                frameLayout5.addView(rd0Var, h7.z5.d(i11, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout5, h7.z5.l(1.0f, -1, 0));
            } else {
                viewGroup.addView(rd0Var, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
            }
            i6.q2(rd0Var);
            if (i10 != 15) {
                this.f40501x.setOnClickListener(new u70(8, this, context));
            }
        }
        textView2.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
        FrameLayout frameLayout6 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.H = imageView;
        ImageView imageView2 = new ImageView(context);
        this.I = imageView2;
        frameLayout6.addView(imageView);
        frameLayout6.addView(imageView2);
        imageView.setImageResource(R.drawable.login_arrow1);
        imageView2.setImageResource(R.drawable.login_phone1);
        addView(frameLayout6, h7.z5.t(64, 64, 1, 0, 16, 0, 0));
        addView(textView2, h7.z5.t(-2, -2, 49, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.F = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setGravity(1);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.y1.p(R.string.MissedCallDescriptionSubtitle, textView5);
        addView(textView5, h7.z5.t(-1, -2, 49, 36, 16, 36, 0));
        jf0 jf0Var2 = new jf0(this, context, 0);
        this.f40487f = jf0Var2;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        TextView textView6 = new TextView(context);
        this.E = textView6;
        textView6.setTextSize(1, 20.0f);
        textView6.setMaxLines(1);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setPadding(0, 0, 0, 0);
        textView6.setGravity(16);
        linearLayoutG.addView(textView6, h7.z5.t(-2, -1, 16, 0, 0, 4, 0));
        linearLayoutG.addView(jf0Var2, h7.z5.n(-2, -1));
        addView(linearLayoutG, h7.z5.t(-2, 34, 1, 0, 28, 0, 0));
        TextView textView7 = new TextView(context);
        this.G = textView7;
        textView7.setTextSize(1, 14.0f);
        textView7.setGravity(1);
        textView7.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.y1.p(R.string.MissedCallDescriptionSubtitle2, textView7);
        addView(textView7, h7.z5.t(-1, -2, 49, 36, 28, 36, 12));
        viewGroup = null;
        if (i10 != 11) {
            jf0 jf0Var3 = new jf0(this, context, 1);
            this.f40487f = jf0Var3;
            addView(jf0Var3, h7.z5.t(-2, 42, 1, 0, 32, 0, 0));
        }
        if (i10 == 3) {
            this.f40487f.setVisibility(8);
        }
        org.telegram.ui.Components.voip.m2 m2Var2 = new org.telegram.ui.Components.voip.m2(ig0Var, context);
        this.h = m2Var2;
        int i24 = org.telegram.ui.ActionBar.g6.I6;
        m2Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
        m2Var2.setTextColor(ig0Var.getThemedColor(i24));
        m2Var2.setTextSize(1, 14.0f);
        m2Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m2Var2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        final int i25 = 0;
        m2Var2.setOnClickListener(new View.OnClickListener(this) {

            public final mf0 f38798b;

            {
                this.f38798b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i25) {
                    case 0:
                        this.f38798b.c(true);
                        break;
                    case 1:
                        mf0 mf0Var = this.f38798b;
                        kf0 kf0Var3 = mf0Var.v;
                        if (mf0Var.R <= 0 || mf0Var.N == null) {
                            mf0Var.f40486e0 = true;
                            kf0Var3.invalidate();
                            kf0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                            int i26 = mf0Var.f40483c0;
                            if (i26 == 4 || i26 == 2 || i26 == 17 || i26 == 16 || i26 == 11 || i26 == 15) {
                                if (i26 == 4 || i26 == 11) {
                                    kf0Var3.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    kf0Var3.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", mf0Var.f40480b);
                                bundle.putString("ephone", mf0Var.f40485e);
                                bundle.putString("phoneFormated", mf0Var.d);
                                bundle.putInt("prevType", mf0Var.f40481b0);
                                mf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = mf0Var.d;
                                tL_auth_resendCode.phone_code_hash = mf0Var.f40482c;
                                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) mf0Var.f40497o0).currentAccount).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                            } else if (i26 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                mf0Var.V = false;
                                mf0Var.u();
                                mf0Var.f40486e0 = false;
                                mf0Var.x();
                            }
                        }
                        break;
                    default:
                        mf0 mf0Var2 = this.f38798b;
                        mf0Var2.getClass();
                        try {
                            mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.f40492j0)));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        break;
                }
            }
        });
        addView(m2Var2, h7.z5.t(-2, -2, 1, 0, 18, 0, 0));
        m2Var2.setVisibility(8);
        frameLayout = new FrameLayout(context);
        this.f40502y = frameLayout;
        kf0 kf0Var3 = new kf0(this, context, 0);
        this.v = kf0Var3;
        kf0Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
        kf0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        kf0Var3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
        kf0Var3.setTextSize(1, 15.0f);
        kf0Var3.setGravity(51);
        final int i26 = 1;
        kf0Var3.setOnClickListener(new View.OnClickListener(this) {

            public final mf0 f38798b;

            {
                this.f38798b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        this.f38798b.c(true);
                        break;
                    case 1:
                        mf0 mf0Var = this.f38798b;
                        kf0 kf0Var4 = mf0Var.v;
                        if (mf0Var.R <= 0 || mf0Var.N == null) {
                            mf0Var.f40486e0 = true;
                            kf0Var4.invalidate();
                            kf0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                            int i27 = mf0Var.f40483c0;
                            if (i27 == 4 || i27 == 2 || i27 == 17 || i27 == 16 || i27 == 11 || i27 == 15) {
                                if (i27 == 4 || i27 == 11) {
                                    kf0Var4.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    kf0Var4.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("phone", mf0Var.f40480b);
                                bundle.putString("ephone", mf0Var.f40485e);
                                bundle.putString("phoneFormated", mf0Var.d);
                                bundle.putInt("prevType", mf0Var.f40481b0);
                                mf0Var.s();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = mf0Var.d;
                                tL_auth_resendCode.phone_code_hash = mf0Var.f40482c;
                                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) mf0Var.f40497o0).currentAccount).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                            } else if (i27 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                mf0Var.V = false;
                                mf0Var.u();
                                mf0Var.f40486e0 = false;
                                mf0Var.x();
                            }
                        }
                        break;
                    default:
                        mf0 mf0Var2 = this.f38798b;
                        mf0Var2.getClass();
                        try {
                            mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.f40492j0)));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        break;
                }
            }
        });
        frameLayout.addView(kf0Var3, h7.z5.e(-2, -2, 49));
        rd0Var = new rd0(context, 1);
        this.f40500w = rd0Var;
        if (i10 != 15) {
            Animation animationLoadAnimation5 = AnimationUtils.loadAnimation(context, R.anim.text_in);
            Interpolator interpolator3 = org.telegram.ui.Components.ws.f34319e;
            animationLoadAnimation5.setInterpolator(interpolator3);
            rd0Var.setInAnimation(animationLoadAnimation5);
            Animation animationLoadAnimation6 = AnimationUtils.loadAnimation(context, R.anim.text_out);
            animationLoadAnimation6.setInterpolator(interpolator3);
            rd0Var.setOutAnimation(animationLoadAnimation6);
            kf0 kf0Var4 = new kf0(this, context, 1);
            this.f40501x = kf0Var4;
            kf0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            kf0Var4.setTextSize(1, 15.0f);
            kf0Var4.setGravity(49);
            kf0Var4.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            frameLayout.addView(kf0Var4, h7.z5.e(-1, -2, 17));
            rd0Var.addView(frameLayout, h7.z5.e(-2, -2, 17));
        } else {
            Animation animationLoadAnimation7 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
            Interpolator interpolator4 = org.telegram.ui.Components.er.f28122f;
            animationLoadAnimation7.setInterpolator(interpolator4);
            rd0Var.setInAnimation(animationLoadAnimation7);
            Animation animationLoadAnimation8 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
            animationLoadAnimation8.setInterpolator(interpolator4);
            rd0Var.setOutAnimation(animationLoadAnimation8);
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.B = linearLayout3;
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(17);
            linearLayout3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            int iDp2 = AndroidUtilities.dp(6.0f);
            int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wh, false);
            int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Q9, false);
            linearLayout3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, iW2, iW3, iW3));
            final int i27 = 2;
            linearLayout3.setOnClickListener(new View.OnClickListener(this) {

                public final mf0 f38798b;

                {
                    this.f38798b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i27) {
                        case 0:
                            this.f38798b.c(true);
                            break;
                        case 1:
                            mf0 mf0Var = this.f38798b;
                            kf0 kf0Var5 = mf0Var.v;
                            if (mf0Var.R <= 0 || mf0Var.N == null) {
                                mf0Var.f40486e0 = true;
                                kf0Var5.invalidate();
                                kf0Var5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                                int i28 = mf0Var.f40483c0;
                                if (i28 == 4 || i28 == 2 || i28 == 17 || i28 == 16 || i28 == 11 || i28 == 15) {
                                    if (i28 == 4 || i28 == 11) {
                                        kf0Var5.setText(LocaleController.getString(R.string.Calling));
                                    } else {
                                        kf0Var5.setText(LocaleController.getString(R.string.SendingSms));
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", mf0Var.f40480b);
                                    bundle.putString("ephone", mf0Var.f40485e);
                                    bundle.putString("phoneFormated", mf0Var.d);
                                    bundle.putInt("prevType", mf0Var.f40481b0);
                                    mf0Var.s();
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = mf0Var.d;
                                    tL_auth_resendCode.phone_code_hash = mf0Var.f40482c;
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) mf0Var.f40497o0).currentAccount).sendRequest(tL_auth_resendCode, new df0(mf0Var, bundle, 0), 10);
                                } else if (i28 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(mf0Var, NotificationCenter.didReceiveSmsCode);
                                    mf0Var.V = false;
                                    mf0Var.u();
                                    mf0Var.f40486e0 = false;
                                    mf0Var.x();
                                }
                            }
                            break;
                        default:
                            mf0 mf0Var2 = this.f38798b;
                            mf0Var2.getClass();
                            try {
                                mf0Var2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(mf0Var2.f40492j0)));
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            break;
                    }
                }
            });
            rd0Var.addView(linearLayout3, h7.z5.c(52.0f, -1));
            org.telegram.ui.Components.ri0 ri0Var4 = new org.telegram.ui.Components.ri0(context);
            this.C = ri0Var4;
            ri0Var4.f(R.raw.fragment, 36, 36, null);
            linearLayout3.addView(ri0Var4, h7.z5.t(36, 36, 16, 0, 0, 2, 0));
            TextView textView8 = new TextView(context);
            textView8.setText(LocaleController.getString(R.string.OpenFragment));
            textView8.setTextColor(-1);
            textView8.setTextSize(1, 15.0f);
            textView8.setGravity(17);
            textView8.setTypeface(AndroidUtilities.bold());
            linearLayout3.addView(textView8);
        }
        TextView textView9 = new TextView(context);
        this.A = textView9;
        textView9.setLineSpacing(org.telegram.ui.Cells.pa.c(2.0f, R.string.WrongCode, textView9), 1.0f);
        textView9.setTextSize(1, 15.0f);
        textView9.setGravity(49);
        textView9.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        rd0Var.addView(textView9, h7.z5.e(-2, -2, 17));
        if (viewGroup == null) {
            FrameLayout frameLayout7 = new FrameLayout(context);
            if (i10 == 15) {
                i11 = -1;
            } else {
                i11 = -2;
            }
            frameLayout7.addView(rd0Var, h7.z5.d(i11, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout7, h7.z5.l(1.0f, -1, 0));
        } else {
            viewGroup.addView(rd0Var, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        }
        i6.q2(rd0Var);
        if (i10 != 15) {
            this.f40501x.setOnClickListener(new u70(8, this, context));
        }
    }

    public static void o(mf0 mf0Var, Context context) {
        String str;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mf0Var.f40485e);
            sb2.append(" Android Registration/Login Issue ");
            sb2.append(str2);
            sb2.append(mf0Var.f40497o0.f39086e ? " #paidauth" : "");
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb3.append("Device: ");
            sb3.append(Build.MANUFACTURER);
            sb3.append(" ");
            sb3.append(Build.MODEL);
            sb3.append("\n");
            sb3.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(i10);
            sb3.append("\n");
            sb3.append("Locale: ");
            sb3.append(Locale.getDefault());
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Target Phone: +");
            sb3.append(mf0Var.d);
            sb3.append("\n");
            sb3.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(mf0Var.getContext());
                    List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                    if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                        completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                        completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList != null) {
                        for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                            String number = subscriptionInfo.getNumber();
                            if (!TextUtils.isEmpty(number)) {
                                String str3 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb3.append(str3);
                                sb3.append(".Phone: ");
                                sb3.append(number);
                                sb3.append("\n");
                                sb3.append(str3);
                                sb3.append(".MCC: ");
                                sb3.append(subscriptionInfo.getMcc());
                                sb3.append("\n");
                                sb3.append(str3);
                                sb3.append(".MNC: ");
                                sb3.append(subscriptionInfo.getMnc());
                                sb3.append("\n");
                                sb3.append(str3);
                                sb3.append(".Carrier: ");
                                sb3.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                                sb3.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb3.append("SIM0.Phone: ");
                            sb3.append(line1Number);
                            sb3.append("\n");
                            sb3.append("SIM0.MCC: unknown\n");
                            sb3.append("SIM0.MNC: unknown\n");
                            sb3.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb3.append("Signal: ");
                        sb3.append(signalStrength.getLevel());
                        sb3.append("/4\n");
                    } else {
                        sb3.append("Signal: unknown\n");
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            } else {
                sb3.append("Signal: unknown\n");
            }
            sb3.append("Wi-Fi: ");
            sb3.append(AndroidUtilities.isWifiEnabled(context));
            sb3.append("\n");
            sb3.append("Airplane Mode: ");
            sb3.append(AndroidUtilities.isInAirplaneMode(context));
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("App: ");
            sb3.append(BuildVars.APP_ID);
            sb3.append("\n");
            int i11 = packageInfo.versionCode % 10;
            if (i11 == 1 || i11 == 2) {
                str = "store";
            } else if (ApplicationLoader.isStandaloneBuild()) {
                str = "direct";
            } else if (ApplicationLoader.isBetaBuild()) {
                str = "beta";
            } else {
                str = ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            }
            sb3.append("App version: ");
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(str);
            sb3.append("\n");
            sb3.append("\n");
            sb3.append("Issue: ");
            sb3.append(mf0Var.f40497o0.f39086e ? "no_otp" : "no_otp_paid");
            sb3.append("\n");
            if (!TextUtils.isEmpty(mf0Var.f40479a0)) {
                sb3.append("Error: ");
                sb3.append(mf0Var.f40479a0);
                sb3.append("\n");
            }
            sb3.append("\n\n================================================\n");
            sb3.append("WRITE YOUR COMMENT HERE:\n");
            sb3.append("\n");
            sb3.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb3.toString());
            mf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            mf0Var.f40497o0.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    public static void r(org.telegram.ui.Components.oi0 oi0Var) {
        if (oi0Var != null) {
            oi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            oi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i10, false), "Phone");
            oi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        kf0 kf0Var = this.f40501x;
        if (kf0Var == null) {
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (kf0Var.getAlpha() != f10) {
            kf0Var.animate().cancel();
            kf0Var.animate().alpha(f10).setDuration(150L).start();
        }
    }

    public final void A(int i10) {
        org.telegram.ui.Components.oi0 oi0Var = this.J;
        if (oi0Var == null) {
            this.f40497o0.n1(i10, true);
            return;
        }
        if (this.M) {
            return;
        }
        this.M = true;
        org.telegram.ui.Components.oi0 oi0Var2 = this.f40478a;
        if (oi0Var2.X != oi0Var2.f31312e[0] - 1) {
            oi0Var2.f31326q0 = new ef0(this, i10, 0);
            return;
        }
        oi0Var.f31326q0 = new ye0(this, 3);
        org.telegram.ui.Components.ri0 ri0Var = this.f40499s;
        ri0Var.setAutoRepeat(false);
        oi0Var.L(0, false, false);
        ri0Var.setAnimation(oi0Var);
        ri0Var.d();
    }

    @Override
    public final boolean a() {
        return this.f40481b0 != 3;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        ig0 ig0Var = this.f40497o0;
        int i10 = 0;
        if (ig0Var.B != 0) {
            ig0Var.finishFragment();
            return false;
        }
        int i11 = this.f40484d0;
        if (i11 != 0) {
            ig0Var.u1(i11, true, null, true);
            return false;
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
            String string = LocaleController.getString(R.string.EditNumber);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.f40480b));
            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new af0(this, i10));
            ig0Var.showDialog(b2Var);
            return false;
        }
        this.W = false;
        z(true);
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.d;
        tL_auth_cancelCode.phone_code_hash = this.f40482c;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(tL_auth_cancelCode, new jh.m5(14), 10);
        w();
        u();
        this.D = null;
        int i12 = this.f40481b0;
        if (i12 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i12 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i12 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.V = false;
        return true;
    }

    @Override
    public final void d() {
        this.W = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.V) {
            ur urVar = this.f40487f;
            if (urVar.f43279f == null) {
                return;
            }
            if (i10 == NotificationCenter.didReceiveSmsCode) {
                urVar.setText("" + objArr[0]);
                h(null);
                return;
            }
            if (i10 == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.f40488f0, str)) {
                    if (!this.f40488f0.equals("*")) {
                        this.f40490h0 = str;
                        AndroidUtilities.endIncomingCall();
                    }
                    h(str);
                    CallReceiver.clearLastCall();
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = this.f40481b0;
        if (i10 == 15) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.V = false;
        w();
        u();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f40486e0 = false;
        this.W = false;
        if (this.f40484d0 == 0 || (bundle = this.D) == null) {
            return;
        }
        bundle.putInt("timeout", this.R);
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f40481b0;
        return (i10 == 3 || i10 == 11) ? this.f40480b : LocaleController.getString("YourCode", R.string.YourCode);
    }

    @Override
    public final void h(String str) {
        ig0 ig0Var = this.f40497o0;
        int i10 = ig0Var.f39079a;
        if (i10 == 11) {
            if (this.W) {
                return;
            }
        } else {
            if (this.W) {
                return;
            }
            if ((i10 < 1 || i10 > 4) && i10 != 15) {
                return;
            }
        }
        ur urVar = this.f40487f;
        if (str == null) {
            str = urVar.getCode();
        }
        int i11 = 0;
        if (TextUtils.isEmpty(str)) {
            ig0.U0(ig0Var, urVar, false);
            return;
        }
        int i12 = ig0Var.f39079a;
        if (i12 < 1 || i12 > 4 || !urVar.f43278e) {
            this.W = true;
            int i13 = this.f40481b0;
            if (i13 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i13 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i13 == 3) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.V = false;
            int i14 = ig0Var.B;
            if (i14 == 1) {
                this.d = ig0Var.C;
                TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                confirmphone.phone_code = str;
                confirmphone.phone_code_hash = this.f40482c;
                w();
                urVar.f43278e = true;
                wr[] wrVarArr = urVar.f43279f;
                int length = wrVarArr.length;
                while (i11 < length) {
                    wrVarArr[i11].j(0.0f);
                    i11++;
                }
                A(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(confirmphone, new v80(7, this, confirmphone), 2));
                return;
            }
            if (i14 == 2) {
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f40482c;
                w();
                urVar.f43278e = true;
                wr[] wrVarArr2 = urVar.f43279f;
                int length2 = wrVarArr2.length;
                while (i11 < length2) {
                    wrVarArr2[i11].j(0.0f);
                    i11++;
                }
                A(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(changephone, new n(this, 13), 2));
                ig0Var.v1(true, true);
                return;
            }
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.d;
            tL_auth_signIn.phone_code = str;
            tL_auth_signIn.phone_code_hash = this.f40482c;
            tL_auth_signIn.flags |= 1;
            w();
            urVar.f43278e = true;
            wr[] wrVarArr3 = urVar.f43279f;
            int length3 = wrVarArr3.length;
            while (i11 < length3) {
                wrVarArr3[i11].j(0.0f);
                i11++;
            }
            A(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(tL_auth_signIn, new ze0(this, tL_auth_signIn, 0), 10));
            ig0Var.v1(true, true);
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.oi0 oi0Var = this.f40478a;
        if (oi0Var != null) {
            oi0Var.K(0);
        }
        AndroidUtilities.runOnUIThread(new ye0(this, 0), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f40481b0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f40490h0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            ur urVar = this.f40487f;
            if (urVar.f43279f != null) {
                urVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.R = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.P = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f40487f.getCode();
        int length = code.length();
        int i10 = this.f40481b0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f40490h0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.D != null) {
            bundle.putBundle(i0.a.k(i10, "smsview_params_"), this.D);
        }
        int i11 = this.R;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.P;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        float f10;
        int i10;
        CharSequence charSequenceReplaceTags;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        int i11;
        int i12;
        kf0 kf0Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        int i18;
        kf0 kf0Var2;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z12;
        int i23;
        kf0 kf0Var3;
        String string;
        String strSubstring;
        String string2;
        int i24;
        int i25;
        int i26;
        String strObtainLoginPhoneCall;
        String str;
        int i27;
        String strL;
        int i28;
        String strB;
        int i29;
        int iLastIndexOf;
        kf0 kf0Var4;
        int i30;
        int i31 = 8;
        if (bundle == null) {
            if (this.f40493k0 == null || this.f40494l0 == null) {
                return;
            }
            setProblemTextVisible(true);
            this.v.setVisibility(8);
            kf0 kf0Var5 = this.f40501x;
            if (kf0Var5 != null) {
                kf0Var5.setVisibility(0);
                this.f40501x.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                int i32 = this.f40483c0;
                this.f40501x.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i32 == 17 ? R.string.ReturnEnteringPhrase : i32 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        this.V = true;
        int i33 = this.f40481b0;
        if (i33 == 15) {
            f10 = 1.0f;
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else {
            f10 = 1.0f;
            if (i33 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i33 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(27));
                }
            }
        }
        this.D = bundle;
        this.f40480b = bundle.getString("phone");
        this.f40485e = bundle.getString("ephone");
        this.d = bundle.getString("phoneFormated");
        this.f40482c = bundle.getString("phoneHash");
        this.R = bundle.getInt("timeout");
        this.P = (int) (System.currentTimeMillis() / 1000);
        this.f40483c0 = bundle.getInt("nextType");
        this.f40488f0 = bundle.getString("pattern");
        this.f40489g0 = bundle.getString("prefix");
        this.f40491i0 = bundle.getInt("length");
        this.f40484d0 = bundle.getInt("prevType", 0);
        if (this.f40491i0 == 0) {
            this.f40491i0 = 5;
        }
        this.f40492j0 = bundle.getString("url");
        this.f40493k0 = null;
        this.f40494l0 = null;
        this.f40487f.b(this.f40491i0, this.f40481b0);
        for (wr wrVar : this.f40487f.f43279f) {
            wrVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            wrVar.addTextChangedListener(new p0(this, 9));
            wrVar.setOnFocusChangeListener(new ld(this, i31));
        }
        int i34 = this.f40484d0;
        if (i34 == 17) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f10)));
        } else if (i34 == 16) {
            this.h.setVisibility(0);
            this.h.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(f10)));
        } else {
            this.h.setVisibility(8);
        }
        if (this.f40480b == null) {
            return;
        }
        String strB2 = oe.b.c().b(this.f40480b);
        if (this.f40497o0.i1()) {
            spannableStringBuilderReplaceTags = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, oe.b.c().b("+" + strB2))));
            int iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilderReplaceTags, '*');
            int iLastIndexOf2 = TextUtils.lastIndexOf(spannableStringBuilderReplaceTags, '*');
            if (iIndexOf != -1 && iLastIndexOf2 != -1 && iIndexOf != iLastIndexOf2) {
                this.f40495n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilderReplaceTags.replace(iLastIndexOf2, iLastIndexOf2 + 1, (CharSequence) "");
                spannableStringBuilderReplaceTags.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                spannableStringBuilderReplaceTags.setSpan(new org.telegram.ui.Components.r41("tg://settings/change_number", (org.telegram.ui.Components.xz0) null), iIndexOf, iLastIndexOf2 - 1, 33);
            }
        } else {
            int i35 = this.f40481b0;
            if (i35 == 1) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(strB2)));
            } else if (i35 == 2) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(strB2)));
            } else {
                if (i35 != 3) {
                    if (i35 == 4) {
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(strB2)));
                    } else if (i35 == 15) {
                        i10 = 4;
                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(strB2)));
                    } else {
                        i10 = 4;
                        charSequenceReplaceTags = "";
                    }
                    this.f40495n.setText(charSequenceReplaceTags);
                    i11 = this.f40481b0;
                    if (i11 != 15) {
                        if (i11 == 1) {
                            i30 = this.f40483c0;
                            if (i30 != 3 || i30 == i10 || i30 == 11) {
                                this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                            } else if (i30 == 15) {
                                this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                            } else if (i30 == 0) {
                                this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                            } else {
                                this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
                            }
                        } else {
                            this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                        }
                    }
                    if (this.f40481b0 != 3) {
                        ig0.T0(this.f40497o0, this.f40487f.f43279f[0]);
                        this.f40487f.f43279f[0].requestFocus();
                    } else {
                        AndroidUtilities.hideKeyboard(this.f40487f.f43279f[0]);
                    }
                    w();
                    u();
                    this.T = System.currentTimeMillis();
                    i12 = this.f40481b0;
                    if (i12 == 1) {
                        setProblemTextVisible(true);
                        this.v.setVisibility(8);
                        kf0Var4 = this.f40501x;
                        if (kf0Var4 != null) {
                            kf0Var4.setVisibility(0);
                        }
                    } else if (i12 == 3) {
                        i25 = this.f40483c0;
                        if (i25 != i10 || i25 == 2 || i25 == 17 || i25 == 16 || i25 == 11) {
                            setProblemTextVisible(false);
                            this.v.setVisibility(0);
                            this.f40501x.setVisibility(8);
                            i26 = this.f40483c0;
                            if (i26 != i10 || i26 == 11) {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                            } else if (i26 == 2 || i26 == 17 || i26 == 16) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            }
                        } else {
                            this.v.setVisibility(8);
                        }
                        strObtainLoginPhoneCall = z10 ? AndroidUtilities.obtainLoginPhoneCall(this.f40488f0) : null;
                        if (strObtainLoginPhoneCall != null) {
                            h(strObtainLoginPhoneCall);
                        } else {
                            str = this.f40490h0;
                            if (str != null) {
                                h(str);
                            } else {
                                i27 = this.f40483c0;
                                if (i27 != i10 || i27 == 2 || i27 == 17 || i27 == 16 || i27 == 11) {
                                    t();
                                }
                            }
                        }
                    } else if (i12 != 2) {
                        i20 = this.f40483c0;
                        if (i20 != 2) {
                            i22 = 17;
                            i21 = 16;
                            if (i20 == 17 && i20 != 16 && i20 != i10 && i20 != 3) {
                                i10 = 4;
                                if (i12 == i10) {
                                    i15 = this.f40483c0;
                                    if (i15 != 2) {
                                        i17 = 17;
                                        if (i15 != 17) {
                                            i16 = 16;
                                        } else {
                                            i16 = 16;
                                        }
                                    } else {
                                        i16 = 16;
                                        i17 = 17;
                                    }
                                    if (i15 != 2) {
                                        this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                    } else {
                                        this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                    }
                                    if (this.R < 1000) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    setProblemTextVisible(z11);
                                    kf0 kf0Var6 = this.v;
                                    if (this.R < 1000) {
                                        i18 = 8;
                                    } else {
                                        i18 = 0;
                                    }
                                    kf0Var6.setVisibility(i18);
                                    kf0Var2 = this.f40501x;
                                    if (kf0Var2 != null) {
                                        if (this.R < 1000) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8;
                                        }
                                        kf0Var2.setVisibility(i19);
                                    }
                                    t();
                                } else if (i12 == 11) {
                                    i13 = this.f40483c0;
                                    if (i13 != 4) {
                                        setProblemTextVisible(false);
                                        this.v.setVisibility(0);
                                        this.f40501x.setVisibility(8);
                                        i14 = this.f40483c0;
                                        if (i14 != 4) {
                                            this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        } else {
                                            this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        }
                                        t();
                                    } else {
                                        setProblemTextVisible(false);
                                        this.v.setVisibility(0);
                                        this.f40501x.setVisibility(8);
                                        i14 = this.f40483c0;
                                        if (i14 != 4) {
                                            this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        } else {
                                            this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                        }
                                        t();
                                    }
                                } else {
                                    this.v.setVisibility(8);
                                    kf0Var = this.f40501x;
                                    if (kf0Var != null) {
                                        kf0Var.setVisibility(0);
                                    }
                                    setProblemTextVisible(false);
                                    s();
                                }
                            }
                        } else {
                            i21 = 16;
                            i22 = 17;
                        }
                        if (i20 != 2 || i20 == i22 || i20 == i21) {
                            this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                        } else {
                            this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                        }
                        if (this.R < 1000) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        setProblemTextVisible(z12);
                        kf0 kf0Var7 = this.v;
                        if (this.R < 1000) {
                            i23 = 8;
                        } else {
                            i23 = 0;
                        }
                        kf0Var7.setVisibility(i23);
                        kf0Var3 = this.f40501x;
                        if (kf0Var3 != null) {
                            if (this.R < 1000) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            kf0Var3.setVisibility(i24);
                        }
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                        string = sharedPreferences.getString("sms_hash", null);
                        if (!TextUtils.isEmpty(string) || (string2 = sharedPreferences.getString("sms_hash_code", null)) == null) {
                            strSubstring = null;
                        } else {
                            if (!string2.contains(string + "|") || this.f40497o0.f39102x) {
                                strSubstring = null;
                            } else {
                                strSubstring = string2.substring(string2.indexOf(124) + 1);
                            }
                        }
                        if (strSubstring != null) {
                            this.f40487f.setCode(strSubstring);
                            h(null);
                        } else {
                            t();
                        }
                    } else if (i12 == i10) {
                        i15 = this.f40483c0;
                        if (i15 != 2) {
                            i17 = 17;
                            if (i15 != 17 || i15 == 11) {
                                i16 = 16;
                            } else {
                                i16 = 16;
                                if (i15 != 16) {
                                    if (i12 == 11) {
                                        i13 = this.f40483c0;
                                        if (i13 != 4) {
                                            setProblemTextVisible(false);
                                            this.v.setVisibility(0);
                                            this.f40501x.setVisibility(8);
                                            i14 = this.f40483c0;
                                            if (i14 != 4) {
                                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                            } else {
                                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                            }
                                            t();
                                        } else {
                                            setProblemTextVisible(false);
                                            this.v.setVisibility(0);
                                            this.f40501x.setVisibility(8);
                                            i14 = this.f40483c0;
                                            if (i14 != 4) {
                                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                            } else {
                                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                            }
                                            t();
                                        }
                                    } else {
                                        this.v.setVisibility(8);
                                        kf0Var = this.f40501x;
                                        if (kf0Var != null) {
                                            kf0Var.setVisibility(0);
                                        }
                                        setProblemTextVisible(false);
                                        s();
                                    }
                                }
                            }
                        } else {
                            i16 = 16;
                            i17 = 17;
                        }
                        if (i15 != 2 || i15 == i17 || i15 == i16) {
                            this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                        } else {
                            this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                        }
                        if (this.R < 1000) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        setProblemTextVisible(z11);
                        kf0 kf0Var8 = this.v;
                        if (this.R < 1000) {
                            i18 = 8;
                        } else {
                            i18 = 0;
                        }
                        kf0Var8.setVisibility(i18);
                        kf0Var2 = this.f40501x;
                        if (kf0Var2 != null) {
                            if (this.R < 1000) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            kf0Var2.setVisibility(i19);
                        }
                        t();
                    } else if (i12 == 11) {
                        i13 = this.f40483c0;
                        if (i13 != 4 || i13 == 2 || i13 == 17 || i13 == 16 || i13 == 11) {
                            setProblemTextVisible(false);
                            this.v.setVisibility(0);
                            this.f40501x.setVisibility(8);
                            i14 = this.f40483c0;
                            if (i14 != 4 || i14 == 11) {
                                this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                            } else if (i14 == 2 || i14 == 17 || i14 == 16) {
                                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                            }
                            t();
                        }
                    } else {
                        this.v.setVisibility(8);
                        kf0Var = this.f40501x;
                        if (kf0Var != null) {
                            kf0Var.setVisibility(0);
                        }
                        setProblemTextVisible(false);
                        s();
                    }
                    if (this.f40481b0 == 11) {
                        strL = this.f40489g0;
                        for (i28 = 0; i28 < this.f40491i0; i28++) {
                            strL = s3.c.l(strL, "0");
                        }
                        strB = oe.b.c().b("+" + strL);
                        for (i29 = 0; i29 < this.f40491i0; i29++) {
                            iLastIndexOf = strB.lastIndexOf("0");
                            if (iLastIndexOf >= 0) {
                                strB = strB.substring(0, iLastIndexOf);
                            }
                        }
                        this.E.setText(strB.replaceAll("\\)", "").replaceAll("\\(", ""));
                    }
                }
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(strB2)));
            }
        }
        charSequenceReplaceTags = spannableStringBuilderReplaceTags;
        i10 = 4;
        this.f40495n.setText(charSequenceReplaceTags);
        i11 = this.f40481b0;
        if (i11 != 15) {
            if (i11 == 1) {
                i30 = this.f40483c0;
                if (i30 != 3) {
                    this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                } else {
                    this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                }
            } else {
                this.f40501x.setText(LocaleController.getString(R.string.DidNotGetTheCode));
            }
        }
        if (this.f40481b0 != 3) {
            ig0.T0(this.f40497o0, this.f40487f.f43279f[0]);
            this.f40487f.f43279f[0].requestFocus();
        } else {
            AndroidUtilities.hideKeyboard(this.f40487f.f43279f[0]);
        }
        w();
        u();
        this.T = System.currentTimeMillis();
        i12 = this.f40481b0;
        if (i12 == 1) {
            setProblemTextVisible(true);
            this.v.setVisibility(8);
            kf0Var4 = this.f40501x;
            if (kf0Var4 != null) {
                kf0Var4.setVisibility(0);
            }
        } else if (i12 == 3) {
            i25 = this.f40483c0;
            if (i25 != i10) {
                setProblemTextVisible(false);
                this.v.setVisibility(0);
                this.f40501x.setVisibility(8);
                i26 = this.f40483c0;
                if (i26 != i10) {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                } else {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                }
            } else {
                setProblemTextVisible(false);
                this.v.setVisibility(0);
                this.f40501x.setVisibility(8);
                i26 = this.f40483c0;
                if (i26 != i10) {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                } else {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                }
            }
            if (z10) {
            }
            if (strObtainLoginPhoneCall != null) {
                h(strObtainLoginPhoneCall);
            } else {
                str = this.f40490h0;
                if (str != null) {
                    h(str);
                } else {
                    i27 = this.f40483c0;
                    if (i27 != i10) {
                        t();
                    } else {
                        t();
                    }
                }
            }
        } else if (i12 != 2) {
            i20 = this.f40483c0;
            if (i20 != 2) {
                i22 = 17;
                i21 = 16;
                if (i20 == 17) {
                }
            } else {
                i21 = 16;
                i22 = 17;
            }
            if (i20 != 2) {
                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
            } else {
                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
            }
            if (this.R < 1000) {
                z12 = true;
            } else {
                z12 = false;
            }
            setProblemTextVisible(z12);
            kf0 kf0Var9 = this.v;
            if (this.R < 1000) {
                i23 = 8;
            } else {
                i23 = 0;
            }
            kf0Var9.setVisibility(i23);
            kf0Var3 = this.f40501x;
            if (kf0Var3 != null) {
                if (this.R < 1000) {
                    i24 = 0;
                } else {
                    i24 = 8;
                }
                kf0Var3.setVisibility(i24);
            }
            SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            string = sharedPreferences2.getString("sms_hash", null);
            if (TextUtils.isEmpty(string)) {
                strSubstring = null;
            } else {
                strSubstring = null;
            }
            if (strSubstring != null) {
                this.f40487f.setCode(strSubstring);
                h(null);
            } else {
                t();
            }
        } else if (i12 == i10) {
            i15 = this.f40483c0;
            if (i15 != 2) {
                i17 = 17;
                if (i15 != 17) {
                    i16 = 16;
                } else {
                    i16 = 16;
                }
            } else {
                i16 = 16;
                i17 = 17;
            }
            if (i15 != 2) {
                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
            } else {
                this.v.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
            }
            if (this.R < 1000) {
                z11 = true;
            } else {
                z11 = false;
            }
            setProblemTextVisible(z11);
            kf0 kf0Var10 = this.v;
            if (this.R < 1000) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            kf0Var10.setVisibility(i18);
            kf0Var2 = this.f40501x;
            if (kf0Var2 != null) {
                if (this.R < 1000) {
                    i19 = 0;
                } else {
                    i19 = 8;
                }
                kf0Var2.setVisibility(i19);
            }
            t();
        } else if (i12 == 11) {
            i13 = this.f40483c0;
            if (i13 != 4) {
                setProblemTextVisible(false);
                this.v.setVisibility(0);
                this.f40501x.setVisibility(8);
                i14 = this.f40483c0;
                if (i14 != 4) {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                } else {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                }
                t();
            } else {
                setProblemTextVisible(false);
                this.v.setVisibility(0);
                this.f40501x.setVisibility(8);
                i14 = this.f40483c0;
                if (i14 != 4) {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                } else {
                    this.v.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                }
                t();
            }
        } else {
            this.v.setVisibility(8);
            kf0Var = this.f40501x;
            if (kf0Var != null) {
                kf0Var.setVisibility(0);
            }
            setProblemTextVisible(false);
            s();
        }
        if (this.f40481b0 == 11) {
            strL = this.f40489g0;
            while (i28 < this.f40491i0) {
                strL = s3.c.l(strL, "0");
            }
            strB = oe.b.c().b("+" + strL);
            while (i29 < this.f40491i0) {
                iLastIndexOf = strB.lastIndexOf("0");
                if (iLastIndexOf >= 0) {
                    strB = strB.substring(0, iLastIndexOf);
                }
            }
            this.E.setText(strB.replaceAll("\\)", "").replaceAll("\\(", ""));
        }
    }

    @Override
    public final void n() {
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, this.f40497o0.i1() ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.D6, false);
        TextView textView = this.f40495n;
        textView.setTextColor(iW0);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f40498r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = this.f40481b0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
            this.F.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.G.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.H.setColorFilter(new PorterDuffColorFilter(iW1, mode));
            this.I.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
            this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
        r(this.f40478a);
        r(this.J);
        r(this.K);
        r(this.L);
        ur urVar = this.f40487f;
        if (urVar != null) {
            urVar.invalidate();
        }
        kf0 kf0Var = this.v;
        Integer numValueOf = (Integer) kf0Var.getTag();
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(org.telegram.ui.ActionBar.g6.D6);
        }
        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, numValueOf.intValue(), false));
        if (i11 != 15) {
            this.f40501x.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        wr[] wrVarArr;
        super.onConfigurationChanged(configuration);
        ur urVar = this.f40487f;
        if (urVar == null || (wrVarArr = urVar.f43279f) == null) {
            return;
        }
        for (wr wrVar : wrVarArr) {
            wrVar.setShowSoftInputOnFocusCompat(!a() || AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f40496n0);
    }

    public final void q(Runnable runnable) {
        if (this.f40481b0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            ur urVar = this.f40487f;
            wr[] wrVarArr = urVar.f43279f;
            if (i10 >= wrVarArr.length) {
                urVar.postDelayed(new ff0(2, this, runnable), (((long) wrVarArr.length) * 75) + 400);
                return;
            } else {
                urVar.postDelayed(new ef0(this, i10, 2), ((long) i10) * 75);
                i10++;
            }
        }
    }

    public final void s() {
        if (this.O != null) {
            return;
        }
        this.S = 15000;
        int i10 = this.R;
        if (i10 > 15000) {
            this.S = i10;
        }
        this.O = new Timer();
        this.U = System.currentTimeMillis();
        this.O.schedule(new lh.h2(this, 3), 0L, 1000L);
    }

    public final void t() {
        if (this.N != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        kf0 kf0Var = this.v;
        kf0Var.setTextColor(iW0);
        kf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.N = timer;
        timer.schedule(new lf0(this), 0L, 1000L);
    }

    public final void u() {
        try {
            synchronized (this.Q) {
                try {
                    Timer timer = this.O;
                    if (timer != null) {
                        timer.cancel();
                        this.O = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void w() {
        kf0 kf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.Q) {
                try {
                    Timer timer = this.N;
                    if (timer != null) {
                        timer.cancel();
                        this.N = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void x() {
        if (this.W || this.f40486e0) {
            return;
        }
        ig0 ig0Var = this.f40497o0;
        if (ig0Var.f39094k0) {
            return;
        }
        this.f40486e0 = true;
        this.v.invalidate();
        this.f40501x.invalidate();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f40480b);
        bundle.putString("ephone", this.f40485e);
        bundle.putString("phoneFormated", this.d);
        bundle.putInt("prevType", this.f40481b0);
        this.W = true;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.d;
        tL_auth_resendCode.phone_code_hash = this.f40482c;
        A(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(tL_auth_resendCode, new df0(this, bundle, 1), 10));
    }

    public final void y() {
        int i10;
        ur urVar = this.f40487f;
        try {
            urVar.performHapticFeedback(3, 2);
            while (true) {
                wr[] wrVarArr = urVar.f43279f;
                if (i10 >= wrVarArr.length) {
                    break;
                }
                wrVarArr[i10].setText("");
                urVar.f43279f[i10].i(1.0f);
                i10++;
            }
        } catch (Exception unused) {
        }
        i10 = 0;
        rd0 rd0Var = this.f40500w;
        if (rd0Var.getCurrentView() != this.A) {
            rd0Var.showNext();
        }
        urVar.f43279f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(urVar, this.f40481b0 == 11 ? 3.5f : 10.0f, new ye0(this, 7));
        ye0 ye0Var = this.f40496n0;
        removeCallbacks(ye0Var);
        postDelayed(ye0Var, 5000L);
        this.m0 = true;
    }

    public final void z(boolean z10) {
        if (this.J == null) {
            this.f40497o0.k1(z10, true);
            return;
        }
        if (this.M) {
            this.M = false;
            this.f40499s.setAutoRepeat(false);
            org.telegram.ui.Components.oi0 oi0Var = this.K;
            oi0Var.I(0);
            oi0Var.P(oi0Var.f31312e[0] - 1, new ye0(this, 1));
        }
    }
}
