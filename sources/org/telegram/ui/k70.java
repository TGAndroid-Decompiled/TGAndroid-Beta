package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable A;
    public CharSequence[] B;
    public String[] C;
    public int D;
    public j70 E;
    public long F;
    public boolean G;
    public LocaleController.LocaleInfo H;
    public boolean I;
    public boolean J;
    public final Object f39772a;
    public final Object f39773b;
    public final int f39774c;
    public m2.g d;
    public org.telegram.ui.Components.pa f39775e;
    public TextView f39776f;
    public GradientDrawable h;
    public cg.s0 f39777n;
    public FrameLayout f39778r;
    public bg.d1 f39779s;
    public org.telegram.ui.Components.xi0 v;
    public int f39780w;
    public boolean f39781x;
    public boolean f39782y;

    public k70() {
        super(null);
        this.f39772a = new Object();
        this.f39773b = new Object();
        this.f39774c = UserConfig.selectedAccount;
        this.f39780w = 0;
        this.f39781x = false;
        this.f39782y = false;
    }

    public final void U() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f39774c;
        String str2 = MessagesController.getInstance(i10).suggestedLangCode;
        if ((str2 == null || (str2.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (str2 = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            str2 = "en";
        }
        if (str2.contains("-")) {
            str = str2.split("-")[0];
        } else {
            str = str2;
        }
        String localeAlias = LocaleController.getLocaleAlias(str);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i11 = 0; i11 < LocaleController.getInstance().languages.size(); i11++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i11);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(str2) || localeInfo3.shortName.equals(str) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo != null && localeInfo2 != null && localeInfo != localeInfo2) {
            TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
            if (localeInfo2 != currentLocaleInfo) {
                tL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
                this.H = localeInfo2;
            } else {
                tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
                this.H = localeInfo;
            }
            tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
            ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new zg(28, this, str2), 8);
        }
    }

    public final void V(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.A.setColorFilter(org.telegram.ui.ActionBar.g6.l1(0.9f, getThemedColor(org.telegram.ui.ActionBar.g6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f39776f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f39777n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        cg.s0 s0Var = this.f39777n;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, w02, w02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.f39775e.invalidate();
        if (z10) {
            j70 j70Var = this.E;
            if (j70Var != null) {
                j70Var.postRunnable(new q00(this, 10));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.g6.G6;
                ((TextView) childAt.findViewWithTag(this.f39772a)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f39773b)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        Drawable mutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.A = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.A), 0, spannableStringBuilder.length(), 33);
        this.B[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, i7.f6.e(28, 28, 17));
        bg.d1 d1Var = new bg.d1(this, context, frameLayout, 20);
        this.f39779s = d1Var;
        scrollView.addView(d1Var, i7.f6.x(-1, -2, 51));
        int i13 = R.raw.sun;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i13, String.valueOf(i13), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = xi0Var;
        xi0Var.h = true;
        xi0Var.W = true;
        xi0Var.m();
        org.telegram.ui.Components.xi0 xi0Var2 = this.v;
        if (org.telegram.ui.ActionBar.g6.A0().q()) {
            i10 = this.v.f34737e[0] - 1;
        } else {
            i10 = 0;
        }
        xi0Var2.N(i10);
        org.telegram.ui.Components.xi0 xi0Var3 = this.v;
        if (org.telegram.ui.ActionBar.g6.A0().q()) {
            i11 = this.v.f34737e[0] - 1;
        } else {
            i11 = 0;
        }
        xi0Var3.L(i11, false, false);
        if (org.telegram.ui.ActionBar.g6.A0().q()) {
            i12 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i12 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i12));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.fi0(29, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39778r = frameLayout2;
        this.f39779s.addView(frameLayout2, i7.f6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f39778r.addView(textureView, i7.f6.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new h70(this, 0));
        m2.g gVar = new m2.g(context);
        this.d = gVar;
        gVar.setAdapter(new cg.k1(this, 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f39779s.addView(this.d, i7.f6.c(-1.0f, -1));
        this.d.b(new q2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        cg.s0 s0Var = new cg.s0(this, context);
        this.f39777n = s0Var;
        i7.h6.b(s0Var, 0.02f, 1.2f);
        this.f39777n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f39777n.setGravity(17);
        this.f39777n.setTypeface(AndroidUtilities.bold());
        this.f39777n.setTextSize(1, 15.0f);
        this.f39777n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39779s.addView(this.f39777n, i7.f6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f39777n.setOnClickListener(new View.OnClickListener(this) {
            public final k70 f38476b;

            {
                this.f38476b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k70 k70Var = this.f38476b;
                        if (!k70Var.f39782y) {
                            k70Var.f39782y = true;
                            k70Var.presentFragment(new fg0(), true);
                            k70Var.I = true;
                            return;
                        }
                        return;
                    default:
                        k70 k70Var2 = this.f38476b;
                        if (!k70Var2.f39782y && k70Var2.H != null) {
                            k70Var2.f39782y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.f22783c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new i70(k70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(k70Var2.H, true, false, k70Var2.f39774c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.pa paVar = new org.telegram.ui.Components.pa(context, this.d, 6);
        this.f39775e = paVar;
        this.f39779s.addView(paVar, i7.f6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39776f = textView;
        textView.setGravity(17);
        this.f39776f.setTextSize(1, 16.0f);
        this.f39779s.addView(this.f39776f, i7.f6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f39776f.setOnClickListener(new View.OnClickListener(this) {
            public final k70 f38476b;

            {
                this.f38476b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k70 k70Var = this.f38476b;
                        if (!k70Var.f39782y) {
                            k70Var.f39782y = true;
                            k70Var.presentFragment(new fg0(), true);
                            k70Var.I = true;
                            return;
                        }
                        return;
                    default:
                        k70 k70Var2 = this.f38476b;
                        if (!k70Var2.f39782y && k70Var2.H != null) {
                            k70Var2.f39782y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.f22783c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new i70(k70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(k70Var2.H, true, false, k70Var2.f39774c);
                            return;
                        }
                        return;
                }
            }
        });
        float f9 = 4;
        this.f39779s.addView(frameLayout, i7.f6.d(64, 64.0f, 53, 0.0f, f9, f9, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i14 = this.f39774c;
        NotificationCenter.getInstance(i14).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i14).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i14);
        U();
        this.f39781x = true;
        V(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack && i10 != NotificationCenter.configLoaded) {
            return;
        }
        U();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 18), org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.q6, org.telegram.ui.ActionBar.g6.P9, org.telegram.ui.ActionBar.g6.Q9, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.J) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.B = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.C = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.I = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.f39774c).removeObserver(this, NotificationCenter.configLoaded);
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        AndroidUtilities.unlockOrientation(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f39781x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f39780w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f39780w = 0;
            }
            this.f39781x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }
}
