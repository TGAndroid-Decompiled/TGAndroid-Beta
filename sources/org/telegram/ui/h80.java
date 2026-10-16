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
public final class h80 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public f80 I;
    public long J;
    public boolean K;
    public LocaleController.LocaleInfo L;
    public boolean M;
    public boolean N;
    public final Object f36437a;
    public final Object f36438b;
    public final int f36439c;
    public z4.g d;
    public org.telegram.ui.Components.ua e;
    public TextView f36440f;
    public GradientDrawable h;
    public ci.n f36441n;
    public FrameLayout f36442r;
    public ah.v f36443s;
    public org.telegram.ui.Components.yj0 v;
    public int f36444w;
    public boolean f36445x;
    public boolean f36446y;

    public h80() {
        super(null);
        this.f36437a = new Object();
        this.f36438b = new Object();
        this.f36439c = UserConfig.selectedAccount;
        this.f36444w = 0;
        this.f36445x = false;
        this.f36446y = false;
    }

    public final void U() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.f36439c;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new to(25, this, str2), 8);
        }
    }

    public final void V(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.g6.m1(0.9f, getThemedColor(org.telegram.ui.ActionBar.g6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.f19601d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.f36440f.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f36441n.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        ci.n nVar = this.f36441n;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, x02, x02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        if (z10) {
            f80 f80Var = this.I;
            if (f80Var != null) {
                f80Var.postRunnable(new zz(this, 11));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.g6.G6;
                ((TextView) childAt.findViewWithTag(this.f36437a)).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f36438b)).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
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
        this.f36443s = vVar;
        scrollView.addView(vVar, w7.z5.x(-1, -2, 51));
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = yj0Var;
        yj0Var.h = true;
        yj0Var.Z = true;
        yj0Var.o();
        org.telegram.ui.Components.yj0 yj0Var2 = this.v;
        if (org.telegram.ui.ActionBar.g6.B0().q()) {
            i10 = this.v.e[0] - 1;
        } else {
            i10 = 0;
        }
        yj0Var2.P(i10);
        org.telegram.ui.Components.yj0 yj0Var3 = this.v;
        if (org.telegram.ui.ActionBar.g6.B0().q()) {
            i11 = this.v.e[0] - 1;
        } else {
            i11 = 0;
        }
        yj0Var3.N(i11, false, false);
        if (org.telegram.ui.ActionBar.g6.B0().q()) {
            i12 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i12 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i12));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new xv(11, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36442r = frameLayout2;
        this.f36443s.addView(frameLayout2, w7.z5.a(-2.0f, 0.0f, 78.0f, 0.0f, 0.0f, -1, 51));
        TextureView textureView = new TextureView(context);
        this.f36442r.addView(textureView, w7.z5.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new d80(this, 0));
        z4.g gVar = new z4.g(context);
        this.d = gVar;
        gVar.setAdapter(new g80(this, 0));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f36443s.addView(this.d, w7.z5.d(-1.0f, -1));
        this.d.b(new o2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ci.n nVar = new ci.n(this, context);
        this.f36441n = nVar;
        w7.b6.b(nVar, 0.02f, 1.2f);
        this.f36441n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f36441n.setGravity(17);
        this.f36441n.setTypeface(AndroidUtilities.bold());
        this.f36441n.setTextSize(1, 15.0f);
        this.f36441n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f36443s.addView(this.f36441n, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, 76.0f, -1, 81));
        this.f36441n.setOnClickListener(new View.OnClickListener(this) {
            public final h80 f34479b;

            {
                this.f34479b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h80 h80Var = this.f34479b;
                        if (!h80Var.f36446y) {
                            h80Var.f36446y = true;
                            h80Var.presentFragment(new ah0(), true);
                            h80Var.M = true;
                            return;
                        }
                        return;
                    default:
                        h80 h80Var2 = this.f34479b;
                        if (!h80Var2.f36446y && h80Var2.L != null) {
                            h80Var2.f36446y = true;
                            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(view.getContext(), 3, null);
                            a2Var.f19269g0 = false;
                            a2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new e80(h80Var2, a2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(h80Var2.L, true, false, h80Var2.f36439c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ua uaVar = new org.telegram.ui.Components.ua(context, this.d, 6);
        this.e = uaVar;
        this.f36443s.addView(uaVar, w7.z5.a(5.0f, 0.0f, 350.0f, 0.0f, 0.0f, 66, 49));
        TextView textView = new TextView(context);
        this.f36440f = textView;
        textView.setGravity(17);
        this.f36440f.setTextSize(1, 16.0f);
        this.f36443s.addView(this.f36440f, w7.z5.a(30.0f, 0.0f, 0.0f, 0.0f, 20.0f, -2, 81));
        this.f36440f.setOnClickListener(new View.OnClickListener(this) {
            public final h80 f34479b;

            {
                this.f34479b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h80 h80Var = this.f34479b;
                        if (!h80Var.f36446y) {
                            h80Var.f36446y = true;
                            h80Var.presentFragment(new ah0(), true);
                            h80Var.M = true;
                            return;
                        }
                        return;
                    default:
                        h80 h80Var2 = this.f34479b;
                        if (!h80Var2.f36446y && h80Var2.L != null) {
                            h80Var2.f36446y = true;
                            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(view.getContext(), 3, null);
                            a2Var.f19269g0 = false;
                            a2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new e80(h80Var2, a2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(h80Var2.L, true, false, h80Var2.f36439c);
                            return;
                        }
                        return;
                }
            }
        });
        float f7 = 4;
        this.f36443s.addView(frameLayout, w7.z5.a(64.0f, 0.0f, f7, f7, 0.0f, 64, 53));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.f36439c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        U();
        this.f36445x = true;
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
        return w7.c6.a(new e(this, 18), org.telegram.ui.ActionBar.g6.f19601d6, org.telegram.ui.ActionBar.g6.q6, org.telegram.ui.ActionBar.g6.P9, org.telegram.ui.ActionBar.g6.Q9, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, true)) > 0.699999988079071d) {
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
        NotificationCenter.getInstance(this.f36439c).removeObserver(this, NotificationCenter.configLoaded);
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
        if (this.f36445x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f36444w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f36444w = 0;
            }
            this.f36445x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }
}
