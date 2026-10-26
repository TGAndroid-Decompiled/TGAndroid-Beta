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
public final class p70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public n70 I;
    public long J;
    public boolean K;
    public LocaleController.LocaleInfo L;
    public boolean M;
    public boolean N;
    public int O;
    public final y5 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object f42382a;
    public final Object f42383b;
    public final int f42384c;
    public a5.m d;
    public org.telegram.ui.Components.sa e;
    public TextView f42385f;
    public GradientDrawable h;
    public ei.n f42386n;
    public FrameLayout f42387r;
    public bh.p f42388s;
    public org.telegram.ui.Components.xj0 v;
    public int f42389w;
    public boolean f42390x;
    public boolean f42391y;

    public p70() {
        super(null);
        this.f42382a = new Object();
        this.f42383b = new Object();
        this.f42384c = UserConfig.selectedAccount;
        this.f42389w = 0;
        this.f42390x = false;
        this.f42391y = false;
        this.P = new y5(this, 7);
    }

    public final void V() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f42384c;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new j10(3, this, str2), 8);
        }
    }

    public final void W(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.y6.Ph)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.y6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.y6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        this.f42385f.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23597q6, false));
        this.f42386n.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false));
        ei.n nVar = this.f42386n;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, x02, x02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.O = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        if (z10) {
            n70 n70Var = this.I;
            if (n70Var != null) {
                n70Var.postRunnable(new p00(this, 10));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.y6.G6;
                ((TextView) childAt.findViewWithTag(this.f42382a)).setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f42383b)).setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
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
        frameLayout.addView((View) imageView, org.telegram.ui.Components.gb1.i(28, 28, 17));
        bh.p pVar = new bh.p(this, context, frameLayout, 18);
        this.f42388s = pVar;
        scrollView.addView(pVar, org.telegram.ui.Components.gb1.B(-1, -2, 51));
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = xj0Var;
        xj0Var.h = true;
        xj0Var.Z = true;
        xj0Var.o();
        org.telegram.ui.Components.xj0 xj0Var2 = this.v;
        if (org.telegram.ui.ActionBar.y6.C0().q()) {
            i10 = this.v.e[0] - 1;
        } else {
            i10 = 0;
        }
        xj0Var2.P(i10);
        org.telegram.ui.Components.xj0 xj0Var3 = this.v;
        if (org.telegram.ui.ActionBar.y6.C0().q()) {
            i11 = this.v.e[0] - 1;
        } else {
            i11 = 0;
        }
        xj0Var3.N(i11, false, false);
        if (org.telegram.ui.ActionBar.y6.C0().q()) {
            i12 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i12 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i12));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.k51(22, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42387r = frameLayout2;
        this.f42388s.addView(frameLayout2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f42387r.addView(textureView, org.telegram.ui.Components.gb1.i(200, 150, 17));
        textureView.setSurfaceTextureListener(new l70(this, 0));
        a5.m mVar = new a5.m(context);
        this.d = mVar;
        mVar.setAdapter(new o70(this, 0));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f42388s.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.d.b(new l2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.n nVar = new ei.n(this, context);
        this.f42386n = nVar;
        org.telegram.ui.Components.gb1.c(nVar, 0.02f, 1.2f);
        this.f42386n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f42386n.setGravity(17);
        this.f42386n.setTypeface(AndroidUtilities.bold());
        this.f42386n.setTextSize(1, 15.0f);
        this.f42386n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f42388s.addView(this.f42386n, org.telegram.ui.Components.gb1.h(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f42386n.setOnClickListener(new View.OnClickListener(this) {
            public final p70 f40814b;

            {
                this.f40814b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p70 p70Var = this.f40814b;
                        if (!p70Var.f42391y) {
                            p70Var.f42391y = true;
                            p70Var.presentFragment(new gg0(), true);
                            p70Var.M = true;
                            return;
                        }
                        return;
                    default:
                        p70 p70Var2 = this.f40814b;
                        if (!p70Var2.f42391y && p70Var2.L != null) {
                            p70Var2.f42391y = true;
                            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(view.getContext(), 3, null);
                            e2Var.f22575i0 = false;
                            e2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new m70(p70Var2, e2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(p70Var2.L, true, false, p70Var2.f42384c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.sa saVar = new org.telegram.ui.Components.sa(context, this.d, 6);
        this.e = saVar;
        this.f42388s.addView(saVar, org.telegram.ui.Components.gb1.h(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42385f = textView;
        textView.setGravity(17);
        this.f42385f.setTextSize(1, 16.0f);
        this.f42388s.addView(this.f42385f, org.telegram.ui.Components.gb1.h(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f42385f.setOnClickListener(new View.OnClickListener(this) {
            public final p70 f40814b;

            {
                this.f40814b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p70 p70Var = this.f40814b;
                        if (!p70Var.f42391y) {
                            p70Var.f42391y = true;
                            p70Var.presentFragment(new gg0(), true);
                            p70Var.M = true;
                            return;
                        }
                        return;
                    default:
                        p70 p70Var2 = this.f40814b;
                        if (!p70Var2.f42391y && p70Var2.L != null) {
                            p70Var2.f42391y = true;
                            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(view.getContext(), 3, null);
                            e2Var.f22575i0 = false;
                            e2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new m70(p70Var2, e2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(p70Var2.L, true, false, p70Var2.f42384c);
                            return;
                        }
                        return;
                }
            }
        });
        float f7 = 4;
        this.f42388s.addView(frameLayout, org.telegram.ui.Components.gb1.h(64, 64.0f, 53, 0.0f, f7, f7, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.f42384c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        V();
        this.f42390x = true;
        W(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack && i10 != NotificationCenter.configLoaded) {
            return;
        }
        V();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.gb1.C(new j6(10, this), org.telegram.ui.ActionBar.y6.f23356d6, org.telegram.ui.ActionBar.y6.f23597q6, org.telegram.ui.ActionBar.y6.P9, org.telegram.ui.ActionBar.y6.Q9, org.telegram.ui.ActionBar.y6.Sh, org.telegram.ui.ActionBar.y6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, true)) > 0.699999988079071d) {
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
        NotificationCenter.getInstance(this.f42384c).removeObserver(this, NotificationCenter.configLoaded);
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
        if (this.f42390x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f42389w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f42389w = 0;
            }
            this.f42390x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }

    @Override
    public final void onThemeColorsChanged() {
        y5 y5Var = this.P;
        try {
            if (this.fragmentView != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Oh;
                int themedColor = getThemedColor(i10);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.Ph);
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
                int o12 = org.telegram.ui.ActionBar.y6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.y6.A8));
                Drawable drawable = this.E;
                if (drawable != null && o12 != this.S) {
                    this.S = o12;
                    drawable.setColorFilter(o12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false));
                TextView textView = this.f42385f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23597q6, false));
                }
                ei.n nVar = this.f42386n;
                if (nVar != null) {
                    nVar.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false));
                    org.telegram.ui.ActionBar.y6.E1(this.f42386n.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
                org.telegram.ui.Components.xj0 xj0Var = this.v;
                if (xj0Var != null && x02 != this.T) {
                    this.T = x02;
                    xj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.sa saVar = this.e;
                if (saVar != null) {
                    saVar.invalidate();
                }
                if (this.d != null) {
                    for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                        View childAt = this.d.getChildAt(i11);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f42382a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f42383b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                        }
                    }
                }
                if (this.I != null && this.O != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false)) {
                    AndroidUtilities.cancelRunOnUIThread(y5Var);
                    AndroidUtilities.runOnUIThread(y5Var, 100L);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
