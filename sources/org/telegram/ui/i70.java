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
public final class i70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable A;
    public CharSequence[] B;
    public String[] C;
    public int D;
    public g70 E;
    public long F;
    public boolean G;
    public LocaleController.LocaleInfo H;
    public boolean I;
    public boolean J;
    public final Object f39043a;
    public final Object f39044b;
    public final int f39045c;
    public m2.g d;
    public org.telegram.ui.Components.ka f39046e;
    public TextView f39047f;
    public GradientDrawable h;
    public bh.e f39048n;
    public FrameLayout f39049r;
    public fh.v f39050s;
    public org.telegram.ui.Components.mi0 v;
    public int f39051w;
    public boolean f39052x;
    public boolean f39053y;

    public i70() {
        super(null);
        this.f39043a = new Object();
        this.f39044b = new Object();
        this.f39045c = UserConfig.selectedAccount;
        this.f39051w = 0;
        this.f39052x = false;
        this.f39053y = false;
    }

    public final void T() {
        String str;
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i9 = this.f39045c;
        String str2 = MessagesController.getInstance(i9).suggestedLangCode;
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
        for (int i10 = 0; i10 < LocaleController.getInstance().languages.size(); i10++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i10);
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
            ConnectionsManager.getInstance(i9).sendRequest(tL_langpack_getStrings, new v40(2, this, str2), 8);
        }
    }

    public final void U(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i9), getThemedColor(org.telegram.ui.ActionBar.f6.Ph)});
        this.A.setColorFilter(org.telegram.ui.ActionBar.f6.l1(0.9f, getThemedColor(org.telegram.ui.ActionBar.f6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f39047f.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        this.f39048n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        bh.e eVar = this.f39048n;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        eVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, w02, w02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.SRC_IN));
        this.f39046e.invalidate();
        if (z10) {
            g70 g70Var = this.E;
            if (g70Var != null) {
                g70Var.postRunnable(new o00(this, 10));
            }
            for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                View childAt = this.d.getChildAt(i11);
                int i12 = org.telegram.ui.ActionBar.f6.G6;
                ((TextView) childAt.findViewWithTag(this.f39043a)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                ((TextView) childAt.findViewWithTag(this.f39044b)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            }
            return;
        }
        Intro.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        int i11;
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
        frameLayout.addView((View) imageView, g7.e6.e(28, 28, 17));
        fh.v vVar = new fh.v(this, context, frameLayout, 19);
        this.f39050s = vVar;
        scrollView.addView(vVar, g7.e6.x(-1, -2, 51));
        int i12 = R.raw.sun;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i12, String.valueOf(i12), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = mi0Var;
        mi0Var.h = true;
        mi0Var.W = true;
        mi0Var.m();
        org.telegram.ui.Components.mi0 mi0Var2 = this.v;
        if (org.telegram.ui.ActionBar.f6.A0().q()) {
            i9 = this.v.f30847e[0] - 1;
        } else {
            i9 = 0;
        }
        mi0Var2.N(i9);
        org.telegram.ui.Components.mi0 mi0Var3 = this.v;
        if (org.telegram.ui.ActionBar.f6.A0().q()) {
            i10 = this.v.f30847e[0] - 1;
        } else {
            i10 = 0;
        }
        mi0Var3.L(i10, false, false);
        if (org.telegram.ui.ActionBar.f6.A0().q()) {
            i11 = R.string.AccDescrSwitchToDayTheme;
        } else {
            i11 = R.string.AccDescrSwitchToNightTheme;
        }
        imageView.setContentDescription(LocaleController.getString(i11));
        imageView.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.vh0(28, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39049r = frameLayout2;
        this.f39050s.addView(frameLayout2, g7.e6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f39049r.addView(textureView, g7.e6.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new e70(this, 0));
        m2.g gVar = new m2.g(context);
        this.d = gVar;
        gVar.setAdapter(new h70(this, 0));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f39050s.addView(this.d, g7.e6.c(-1.0f, -1));
        this.d.b(new p2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bh.e eVar = new bh.e(this, context);
        this.f39048n = eVar;
        g7.g6.b(eVar, 0.02f, 1.2f);
        this.f39048n.setText(LocaleController.getString(R.string.StartMessaging));
        this.f39048n.setGravity(17);
        this.f39048n.setTypeface(AndroidUtilities.bold());
        this.f39048n.setTextSize(1, 15.0f);
        this.f39048n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39050s.addView(this.f39048n, g7.e6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f39048n.setOnClickListener(new View.OnClickListener(this) {
            public final i70 f37429b;

            {
                this.f37429b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i70 i70Var = this.f37429b;
                        if (!i70Var.f39053y) {
                            i70Var.f39053y = true;
                            i70Var.presentFragment(new fg0(), true);
                            i70Var.I = true;
                            return;
                        }
                        return;
                    default:
                        i70 i70Var2 = this.f37429b;
                        if (!i70Var2.f39053y && i70Var2.H != null) {
                            i70Var2.f39053y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.f22766c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new f70(i70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(i70Var2.H, true, false, i70Var2.f39045c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ka kaVar = new org.telegram.ui.Components.ka(context, this.d, 6);
        this.f39046e = kaVar;
        this.f39050s.addView(kaVar, g7.e6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39047f = textView;
        textView.setGravity(17);
        this.f39047f.setTextSize(1, 16.0f);
        this.f39050s.addView(this.f39047f, g7.e6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f39047f.setOnClickListener(new View.OnClickListener(this) {
            public final i70 f37429b;

            {
                this.f37429b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i70 i70Var = this.f37429b;
                        if (!i70Var.f39053y) {
                            i70Var.f39053y = true;
                            i70Var.presentFragment(new fg0(), true);
                            i70Var.I = true;
                            return;
                        }
                        return;
                    default:
                        i70 i70Var2 = this.f37429b;
                        if (!i70Var2.f39053y && i70Var2.H != null) {
                            i70Var2.f39053y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.f22766c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new f70(i70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(i70Var2.H, true, false, i70Var2.f39045c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f39050s.addView(frameLayout, g7.e6.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.f39045c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        T();
        this.f39052x = true;
        U(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.suggestedLangpack && i9 != NotificationCenter.configLoaded) {
            return;
        }
        T();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 18), org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23229q6, org.telegram.ui.ActionBar.f6.P9, org.telegram.ui.ActionBar.f6.Q9, org.telegram.ui.ActionBar.f6.Sh, org.telegram.ui.ActionBar.f6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
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
        NotificationCenter.getInstance(this.f39045c).removeObserver(this, NotificationCenter.configLoaded);
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
        if (this.f39052x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.f39051w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f39051w = 0;
            }
            this.f39052x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }
}
