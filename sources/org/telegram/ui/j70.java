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
public final class j70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public h70 I;
    public long J;
    public boolean K;
    public LocaleController.LocaleInfo L;
    public boolean M;
    public boolean N;
    public final Object f38191a;
    public final Object f38192b;
    public final int f38193c;
    public z4.g d;
    public org.telegram.ui.Components.sa e;
    public TextView f38194f;
    public GradientDrawable h;
    public di.n f38195n;
    public FrameLayout f38196r;
    public ah.v f38197s;
    public org.telegram.ui.Components.vj0 v;
    public int f38198w;
    public boolean f38199x;
    public boolean f38200y;

    public j70() {
        super(null);
        this.f38191a = new Object();
        this.f38192b = new Object();
        this.f38193c = UserConfig.selectedAccount;
        this.f38198w = 0;
        this.f38199x = false;
        this.f38200y = false;
    }

    public final void U() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f38193c;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new x40(2, this, str2), 8);
        }
    }

    public final void V(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.h6.Ph)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.h6.m1(0.9f, getThemedColor(org.telegram.ui.ActionBar.h6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.h6.f20994d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f38194f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f38195n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        di.n nVar = this.f38195n;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, x02, x02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        if (z10) {
            h70 h70Var = this.I;
            if (h70Var != null) {
                h70Var.postRunnable(new dz(this, 11));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.h6.G6;
                ((TextView) childAt.findViewWithTag(this.f38191a)).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f38192b)).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
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
        ah.v vVar = new ah.v(this, context, frameLayout, 20);
        this.f38197s = vVar;
        scrollView.addView(vVar, w7.z5.x(-1, -2, 51));
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = vj0Var;
        vj0Var.h = true;
        vj0Var.Z = true;
        vj0Var.o();
        org.telegram.ui.Components.vj0 vj0Var2 = this.v;
        if (org.telegram.ui.ActionBar.h6.B0().q()) {
            i10 = this.v.e[0] - 1;
        } else {
            i10 = 0;
        }
        vj0Var2.P(i10);
        org.telegram.ui.Components.vj0 vj0Var3 = this.v;
        if (org.telegram.ui.ActionBar.h6.B0().q()) {
            i11 = this.v.e[0] - 1;
        } else {
            i11 = 0;
        }
        vj0Var3.N(i11, false, false);
        if (org.telegram.ui.ActionBar.h6.B0().q()) {
            i12 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i12 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i12));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.i51(21, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f38196r = frameLayout2;
        this.f38197s.addView(frameLayout2, w7.z5.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f38196r.addView(textureView, w7.z5.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new f70(this, 0));
        z4.g gVar = new z4.g(context);
        this.d = gVar;
        gVar.setAdapter(new i70(this, 0));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f38197s.addView(this.d, w7.z5.c(-1.0f, -1));
        this.d.b(new o2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        di.n nVar = new di.n(this, context);
        this.f38195n = nVar;
        w7.b6.b(nVar, 0.02f, 1.2f);
        this.f38195n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f38195n.setGravity(17);
        this.f38195n.setTypeface(AndroidUtilities.bold());
        this.f38195n.setTextSize(1, 15.0f);
        this.f38195n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f38197s.addView(this.f38195n, w7.z5.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f38195n.setOnClickListener(new View.OnClickListener(this) {
            public final j70 f36568b;

            {
                this.f36568b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j70 j70Var = this.f36568b;
                        if (!j70Var.f38200y) {
                            j70Var.f38200y = true;
                            j70Var.presentFragment(new dg0(), true);
                            j70Var.M = true;
                            return;
                        }
                        return;
                    default:
                        j70 j70Var2 = this.f36568b;
                        if (!j70Var2.f38200y && j70Var2.L != null) {
                            j70Var2.f38200y = true;
                            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(view.getContext(), 3, null);
                            b2Var.f20669g0 = false;
                            b2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new g70(j70Var2, b2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(j70Var2.L, true, false, j70Var2.f38193c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.sa saVar = new org.telegram.ui.Components.sa(context, this.d, 6);
        this.e = saVar;
        this.f38197s.addView(saVar, w7.z5.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f38194f = textView;
        textView.setGravity(17);
        this.f38194f.setTextSize(1, 16.0f);
        this.f38197s.addView(this.f38194f, w7.z5.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f38194f.setOnClickListener(new View.OnClickListener(this) {
            public final j70 f36568b;

            {
                this.f36568b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j70 j70Var = this.f36568b;
                        if (!j70Var.f38200y) {
                            j70Var.f38200y = true;
                            j70Var.presentFragment(new dg0(), true);
                            j70Var.M = true;
                            return;
                        }
                        return;
                    default:
                        j70 j70Var2 = this.f36568b;
                        if (!j70Var2.f38200y && j70Var2.L != null) {
                            j70Var2.f38200y = true;
                            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(view.getContext(), 3, null);
                            b2Var.f20669g0 = false;
                            b2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new g70(j70Var2, b2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(j70Var2.L, true, false, j70Var2.f38193c);
                            return;
                        }
                        return;
                }
            }
        });
        float f7 = 4;
        this.f38197s.addView(frameLayout, w7.z5.d(64, 64.0f, 53, 0.0f, f7, f7, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.f38193c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        U();
        this.f38199x = true;
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
        return w7.c6.a(new e(this, 18), org.telegram.ui.ActionBar.h6.f20994d6, org.telegram.ui.ActionBar.h6.q6, org.telegram.ui.ActionBar.h6.P9, org.telegram.ui.ActionBar.h6.Q9, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, true)) > 0.699999988079071d) {
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
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.f38193c).removeObserver(this, NotificationCenter.configLoaded);
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
        if (this.f38199x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f38198w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f38198w = 0;
            }
            this.f38199x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }
}
