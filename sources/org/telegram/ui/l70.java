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

public final class l70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable A;
    public CharSequence[] B;
    public String[] C;
    public int D;
    public k70 E;
    public long F;
    public boolean G;
    public LocaleController.LocaleInfo H;
    public boolean I;
    public boolean J;

    public final Object f39962a;

    public final Object f39963b;

    public final int f39964c;
    public m2.g d;

    public org.telegram.ui.Components.ia f39965e;

    public TextView f39966f;
    public GradientDrawable h;

    public ag.e1 f39967n;

    public FrameLayout f39968r;

    public ag.y1 f39969s;
    public org.telegram.ui.Components.oi0 v;

    public int f39970w;

    public boolean f39971x;

    public boolean f39972y;

    public l70() {
        super(null);
        this.f39962a = new Object();
        this.f39963b = new Object();
        this.f39964c = UserConfig.selectedAccount;
        this.f39970w = 0;
        this.f39971x = false;
        this.f39972y = false;
    }

    public final void U() {
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f39964c;
        String language = MessagesController.getInstance(i10).suggestedLangCode;
        if ((language == null || (language.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (language = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            language = "en";
        }
        String str = language.contains("-") ? language.split("-")[0] : language;
        String localeAlias = LocaleController.getLocaleAlias(str);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i11 = 0; i11 < LocaleController.getInstance().languages.size(); i11++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i11);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(language) || localeInfo3.shortName.equals(str) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo == null || localeInfo2 == null || localeInfo == localeInfo2) {
            return;
        }
        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
        if (localeInfo2 != currentLocaleInfo) {
            tL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
            this.H = localeInfo2;
        } else {
            tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
            this.H = localeInfo;
        }
        tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
        ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new gg(29, this, language), 8);
    }

    public final void V(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.A.setColorFilter(org.telegram.ui.ActionBar.g6.l1(0.9f, getThemedColor(org.telegram.ui.ActionBar.g6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f39966f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f39967n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        ag.e1 e1Var = this.f39967n;
        int iDp = AndroidUtilities.dp(24.0f);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        e1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iW0, iW0));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.f39965e.invalidate();
        if (!z10) {
            Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            return;
        }
        k70 k70Var = this.E;
        if (k70Var != null) {
            k70Var.postRunnable(new r00(this, 10));
        }
        for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
            View childAt = this.d.getChildAt(i12);
            TextView textView = (TextView) childAt.findViewWithTag(this.f39962a);
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            ((TextView) childAt.findViewWithTag(this.f39963b)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        }
    }

    @Override
    public final View createView(Context context) {
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.A = drawableMutate;
        drawableMutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.A), 0, spannableStringBuilder.length(), 33);
        this.B[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(ri0Var, h7.z5.e(28, 28, 17));
        ag.y1 y1Var = new ag.y1(this, context, frameLayout, 19);
        this.f39969s = y1Var;
        scrollView.addView(y1Var, h7.z5.x(-1, -2, 51));
        int i10 = R.raw.sun;
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(i10, String.valueOf(i10), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = oi0Var;
        oi0Var.h = true;
        oi0Var.W = true;
        oi0Var.m();
        this.v.N(org.telegram.ui.ActionBar.g6.A0().q() ? this.v.f31312e[0] - 1 : 0);
        this.v.L(org.telegram.ui.ActionBar.g6.A0().q() ? this.v.f31312e[0] - 1 : 0, false, false);
        ri0Var.setContentDescription(LocaleController.getString(org.telegram.ui.ActionBar.g6.A0().q() ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
        ri0Var.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.xh0(29, this, ri0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39968r = frameLayout2;
        this.f39969s.addView(frameLayout2, h7.z5.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f39968r.addView(textureView, h7.z5.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new h70(this, 0));
        m2.g gVar = new m2.g(context);
        this.d = gVar;
        gVar.setAdapter(new ag.b2(this, 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f39969s.addView(this.d, h7.z5.c(-1.0f, -1));
        this.d.b(new q2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ag.e1 e1Var = new ag.e1(this, context);
        this.f39967n = e1Var;
        h7.b6.b(e1Var, 0.02f, 1.2f);
        this.f39967n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f39967n.setGravity(17);
        this.f39967n.setTypeface(AndroidUtilities.bold());
        this.f39967n.setTextSize(1, 15.0f);
        this.f39967n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39969s.addView(this.f39967n, h7.z5.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        final int i11 = 0;
        this.f39967n.setOnClickListener(new View.OnClickListener(this) {

            public final l70 f38330b;

            {
                this.f38330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        l70 l70Var = this.f38330b;
                        if (!l70Var.f39972y) {
                            l70Var.f39972y = true;
                            l70Var.presentFragment(new ig0(), true);
                            l70Var.I = true;
                            break;
                        }
                        break;
                    default:
                        l70 l70Var2 = this.f38330b;
                        if (!l70Var2.f39972y && l70Var2.H != null) {
                            l70Var2.f39972y = true;
                            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(view.getContext(), 3, null);
                            b2Var.f22747c0 = false;
                            b2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new i70(l70Var2, b2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(l70Var2.H, true, false, l70Var2.f39964c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(context, this.d, 6);
        this.f39965e = iaVar;
        this.f39969s.addView(iaVar, h7.z5.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39966f = textView;
        textView.setGravity(17);
        this.f39966f.setTextSize(1, 16.0f);
        this.f39969s.addView(this.f39966f, h7.z5.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        final int i12 = 1;
        this.f39966f.setOnClickListener(new View.OnClickListener(this) {

            public final l70 f38330b;

            {
                this.f38330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        l70 l70Var = this.f38330b;
                        if (!l70Var.f39972y) {
                            l70Var.f39972y = true;
                            l70Var.presentFragment(new ig0(), true);
                            l70Var.I = true;
                            break;
                        }
                        break;
                    default:
                        l70 l70Var2 = this.f38330b;
                        if (!l70Var2.f39972y && l70Var2.H != null) {
                            l70Var2.f39972y = true;
                            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(view.getContext(), 3, null);
                            b2Var.f22747c0 = false;
                            b2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new i70(l70Var2, b2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(l70Var2.H, true, false, l70Var2.f39964c);
                            break;
                        }
                        break;
                }
            }
        });
        float f10 = 4;
        this.f39969s.addView(frameLayout, h7.z5.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.f39964c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        U();
        this.f39971x = true;
        V(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack || i10 == NotificationCenter.configLoaded) {
            U();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new e(this, 18), org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.q6, org.telegram.ui.ActionBar.g6.P9, org.telegram.ui.ActionBar.g6.Q9, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (!this.J) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
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
        NotificationCenter.getInstance(this.f39964c).removeObserver(this, NotificationCenter.configLoaded);
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
        if (this.f39971x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f39970w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f39970w = 0;
            }
            this.f39971x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }
}
