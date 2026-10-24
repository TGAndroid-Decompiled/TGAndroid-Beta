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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public l70 I;
    public long J;
    public boolean K;
    public LocaleController.LocaleInfo L;
    public boolean M;
    public boolean N;
    public int O;
    public final z5 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object f39753a;
    public final Object f39754b;
    public final int f39755c;
    public z4.h d;
    public org.telegram.ui.Components.qa e;
    public TextView f39756f;
    public GradientDrawable h;
    public di.n f39757n;
    public FrameLayout f39758r;
    public ah.v f39759s;
    public org.telegram.ui.Components.xj0 v;
    public int f39760w;
    public boolean f39761x;
    public boolean f39762y;

    public n70() {
        super(null);
        this.f39753a = new Object();
        this.f39754b = new Object();
        this.f39755c = UserConfig.selectedAccount;
        this.f39760w = 0;
        this.f39761x = false;
        this.f39762y = false;
        this.P = new z5(this, 7);
    }

    public final void U() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f39755c;
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
                this.L = localeInfo2;
            } else {
                tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
                this.L = localeInfo;
            }
            tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
            ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new a50(2, this, str2), 8);
        }
    }

    public final void V(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.k6.Ph)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.k6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f39756f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f39757n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        di.n nVar = this.f39757n;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, x02, x02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.O = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        if (z10) {
            l70 l70Var = this.I;
            if (l70Var != null) {
                l70Var.postRunnable(new fz(this, 11));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.k6.G6;
                ((TextView) childAt.findViewWithTag(this.f39753a)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f39754b)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        Drawable mutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.E = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, w7.z5.e(28, 28, 17));
        ah.v vVar = new ah.v(this, context, frameLayout, 19);
        this.f39759s = vVar;
        scrollView.addView(vVar, w7.z5.x(-1, -2, 51));
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = xj0Var;
        xj0Var.h = true;
        xj0Var.Z = true;
        xj0Var.o();
        org.telegram.ui.Components.xj0 xj0Var2 = this.v;
        if (org.telegram.ui.ActionBar.k6.C0().q()) {
            i10 = this.v.e[0] - 1;
        } else {
            i10 = 0;
        }
        xj0Var2.P(i10);
        org.telegram.ui.Components.xj0 xj0Var3 = this.v;
        if (org.telegram.ui.ActionBar.k6.C0().q()) {
            i11 = this.v.e[0] - 1;
        } else {
            i11 = 0;
        }
        xj0Var3.N(i11, false, false);
        if (org.telegram.ui.ActionBar.k6.C0().q()) {
            i12 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i12 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i12));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.c51(22, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39758r = frameLayout2;
        this.f39759s.addView(frameLayout2, w7.z5.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f39758r.addView(textureView, w7.z5.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new j70(this, 0));
        z4.h hVar = new z4.h(context);
        this.d = hVar;
        hVar.setAdapter(new m70(this, 0));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f39759s.addView(this.d, w7.z5.c(-1.0f, -1));
        this.d.b(new n2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        di.n nVar = new di.n(this, context);
        this.f39757n = nVar;
        w7.b6.b(nVar, 0.02f, 1.2f);
        this.f39757n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f39757n.setGravity(17);
        this.f39757n.setTypeface(AndroidUtilities.bold());
        this.f39757n.setTextSize(1, 15.0f);
        this.f39757n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39759s.addView(this.f39757n, w7.z5.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f39757n.setOnClickListener(new View.OnClickListener(this) {
            public final n70 f38160b;

            {
                this.f38160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n70 n70Var = this.f38160b;
                        if (!n70Var.f39762y) {
                            n70Var.f39762y = true;
                            n70Var.presentFragment(new hg0(), true);
                            n70Var.M = true;
                            return;
                        }
                        return;
                    default:
                        n70 n70Var2 = this.f38160b;
                        if (!n70Var2.f39762y && n70Var2.L != null) {
                            n70Var2.f39762y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.f20763i0 = false;
                            c2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new k70(n70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(n70Var2.L, true, false, n70Var2.f39755c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.qa qaVar = new org.telegram.ui.Components.qa(context, this.d, 6);
        this.e = qaVar;
        this.f39759s.addView(qaVar, w7.z5.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39756f = textView;
        textView.setGravity(17);
        this.f39756f.setTextSize(1, 16.0f);
        this.f39759s.addView(this.f39756f, w7.z5.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f39756f.setOnClickListener(new View.OnClickListener(this) {
            public final n70 f38160b;

            {
                this.f38160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n70 n70Var = this.f38160b;
                        if (!n70Var.f39762y) {
                            n70Var.f39762y = true;
                            n70Var.presentFragment(new hg0(), true);
                            n70Var.M = true;
                            return;
                        }
                        return;
                    default:
                        n70 n70Var2 = this.f38160b;
                        if (!n70Var2.f39762y && n70Var2.L != null) {
                            n70Var2.f39762y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.f20763i0 = false;
                            c2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new k70(n70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(n70Var2.L, true, false, n70Var2.f39755c);
                            return;
                        }
                        return;
                }
            }
        });
        float f7 = 4;
        this.f39759s.addView(frameLayout, w7.z5.d(64, 64.0f, 53, 0.0f, f7, f7, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.f39755c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        U();
        this.f39761x = true;
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
        return w7.c6.a(new i6(10, this), org.telegram.ui.ActionBar.k6.f21184d6, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.N) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.F = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.G = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.f39755c).removeObserver(this, NotificationCenter.configLoaded);
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
        if (this.f39761x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f39760w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f39760w = 0;
            }
            this.f39761x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }

    @Override
    public final void onThemeColorsChanged() {
        z5 z5Var = this.P;
        try {
            if (this.fragmentView != null) {
                int i10 = org.telegram.ui.ActionBar.k6.Oh;
                int themedColor = getThemedColor(i10);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ph);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null) {
                    if (themedColor == this.Q) {
                        if (themedColor2 != this.R) {
                        }
                    }
                    this.Q = themedColor;
                    this.R = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int o12 = org.telegram.ui.ActionBar.k6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8));
                Drawable drawable = this.E;
                if (drawable != null && o12 != this.S) {
                    this.S = o12;
                    drawable.setColorFilter(o12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
                TextView textView = this.f39756f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
                }
                di.n nVar = this.f39757n;
                if (nVar != null) {
                    nVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                    org.telegram.ui.ActionBar.k6.E1(this.f39757n.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                org.telegram.ui.Components.xj0 xj0Var = this.v;
                if (xj0Var != null && x02 != this.T) {
                    this.T = x02;
                    xj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.qa qaVar = this.e;
                if (qaVar != null) {
                    qaVar.invalidate();
                }
                if (this.d != null) {
                    for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                        View childAt = this.d.getChildAt(i11);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f39753a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f39754b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                    }
                }
                if (this.I != null && this.O != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false)) {
                    AndroidUtilities.cancelRunOnUIThread(z5Var);
                    AndroidUtilities.runOnUIThread(z5Var, 100L);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
