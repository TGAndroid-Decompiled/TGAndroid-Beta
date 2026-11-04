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
import org.telegram.messenger.Intro;
import org.telegram.tgnet.ConnectionsManager;
public final class o50 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public n50 J;
    public long K;
    public boolean L;
    public org.telegram.messenger.yc M;
    public boolean N;
    public boolean O;
    public int P;
    public final o4 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object f48188a;
    public final Object f48189b;
    public final int f48190c;
    public b5.l d;
    public org.telegram.ui.Components.da f48191e;
    public TextView f48192f;
    public GradientDrawable h;
    public fi.j f48193n;
    public FrameLayout f48194r;
    public ai.c0 f48195s;
    public org.telegram.ui.Components.ch0 f48196w;
    public int f48197x;
    public boolean f48198y;

    public o50() {
        super(null);
        this.f48188a = new Object();
        this.f48189b = new Object();
        this.f48190c = org.telegram.messenger.h10.f22829t0;
        this.f48197x = 0;
        this.f48198y = false;
        this.E = false;
        this.Q = new o4(this, 8);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.Z():void");
    }

    public final void a0(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i3), getThemedColor(org.telegram.ui.ActionBar.k6.Di)});
        this.F.setColorFilter(org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f48192f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
        this.f48193n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
        fi.j jVar = this.f48193n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        jVar.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02));
        this.f48196w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i3, false), PorterDuff.Mode.SRC_IN));
        this.f48191e.invalidate();
        this.P = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (z10) {
            n50 n50Var = this.J;
            if (n50Var != null) {
                n50Var.postRunnable(new fz(this, 10));
            }
            for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                View childAt = this.d.getChildAt(i11);
                int i12 = org.telegram.ui.ActionBar.k6.G6;
                ((TextView) childAt.findViewWithTag(this.f48188a)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                ((TextView) childAt.findViewWithTag(this.f48189b)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            }
            return;
        }
        Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        int i10;
        int i11;
        Drawable g7 = k2.p1.g(context, 2131232772);
        this.F = g7;
        g7.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131747756, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, b8.mf.e(28, 28, 17));
        ai.c0 c0Var = new ai.c0(this, context, frameLayout, 23);
        this.f48195s = c0Var;
        scrollView.addView(c0Var, b8.mf.x(-1, -2, 51));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624239, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f48196w = ch0Var;
        ch0Var.h = true;
        ch0Var.f32719a0 = true;
        ch0Var.o();
        org.telegram.ui.Components.ch0 ch0Var2 = this.f48196w;
        if (org.telegram.ui.ActionBar.k6.D0().q()) {
            i3 = this.f48196w.f32725e[0] - 1;
        } else {
            i3 = 0;
        }
        ch0Var2.P(i3);
        org.telegram.ui.Components.ch0 ch0Var3 = this.f48196w;
        if (org.telegram.ui.ActionBar.k6.D0().q()) {
            i10 = this.f48196w.f32725e[0] - 1;
        } else {
            i10 = 0;
        }
        ch0Var3.N(i10, false, false);
        if (org.telegram.ui.ActionBar.k6.D0().q()) {
            i11 = 2131754751;
        } else {
            i11 = 2131754750;
        }
        imageView.setContentDescription(org.telegram.messenger.bd.M0(i11, null));
        imageView.setAnimation(this.f48196w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.ux0(24, this, (Object) imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48194r = frameLayout2;
        this.f48195s.addView(frameLayout2, b8.mf.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f48194r.addView(textureView, b8.mf.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new m50(this, 0));
        b5.l lVar = new b5.l(context);
        this.d = lVar;
        lVar.setAdapter(new org.telegram.ui.Components.w10(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f48195s.addView(this.d, b8.mf.c(-1.0f, -1));
        this.d.b(new l2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        fi.j jVar = new fi.j(this, context);
        this.f48193n = jVar;
        b8.pf.b(jVar, 0.02f, 1.2f);
        this.f48193n.setText(org.telegram.messenger.bd.M0(2131744921, null));
        this.f48193n.setGravity(17);
        this.f48193n.setTypeface(org.telegram.messenger.g0.o());
        this.f48193n.setTextSize(1, 15.0f);
        this.f48193n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f48195s.addView(this.f48193n, b8.mf.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f48193n.setOnClickListener(new View.OnClickListener(this) {
            public final o50 f47109b;

            {
                this.f47109b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o50 o50Var = this.f47109b;
                        if (!o50Var.E) {
                            o50Var.E = true;
                            o50Var.presentFragment(new xd0(), true);
                            o50Var.N = true;
                            return;
                        }
                        return;
                    default:
                        o50 o50Var2 = this.f47109b;
                        if (!o50Var2.E && o50Var2.M != null) {
                            o50Var2.E = true;
                            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, view.getContext(), null);
                            s1Var.f28546j0 = false;
                            s1Var.r(1000L);
                            org.telegram.messenger.hs.e().b(new org.telegram.messenger.gs(o50Var2, s1Var, 1), 274);
                            org.telegram.messenger.bd.E0().d(o50Var2.M, true, false, o50Var2.f48190c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(context, this.d, 6);
        this.f48191e = daVar;
        this.f48195s.addView(daVar, b8.mf.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f48192f = textView;
        textView.setGravity(17);
        this.f48192f.setTextSize(1, 16.0f);
        this.f48195s.addView(this.f48192f, b8.mf.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f48192f.setOnClickListener(new View.OnClickListener(this) {
            public final o50 f47109b;

            {
                this.f47109b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o50 o50Var = this.f47109b;
                        if (!o50Var.E) {
                            o50Var.E = true;
                            o50Var.presentFragment(new xd0(), true);
                            o50Var.N = true;
                            return;
                        }
                        return;
                    default:
                        o50 o50Var2 = this.f47109b;
                        if (!o50Var2.E && o50Var2.M != null) {
                            o50Var2.E = true;
                            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, view.getContext(), null);
                            s1Var.f28546j0 = false;
                            s1Var.r(1000L);
                            org.telegram.messenger.hs.e().b(new org.telegram.messenger.gs(o50Var2, s1Var, 1), 274);
                            org.telegram.messenger.bd.E0().d(o50Var2.M, true, false, o50Var2.f48190c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f48195s.addView(frameLayout, b8.mf.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23344y4);
        int i12 = this.f48190c;
        org.telegram.messenger.hs.f(i12).c(this, org.telegram.messenger.hs.J2);
        ConnectionsManager.getInstance(i12).updateDcSettings();
        org.telegram.messenger.bd.E0().V0(i12, true);
        Z();
        this.f48198y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.f23344y4 && i3 != org.telegram.messenger.hs.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(10, this), org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28121q6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.O) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp.e1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, org.telegram.messenger.bd.M0(2131747754, null), org.telegram.messenger.bd.M0(2131747752, null), org.telegram.messenger.bd.M0(2131747748, null), org.telegram.messenger.bd.M0(2131747750, null), org.telegram.messenger.bd.M0(2131747746, null)};
        this.H = new String[]{org.telegram.messenger.bd.M0(2131747757, null), org.telegram.messenger.bd.M0(2131747755, null), org.telegram.messenger.bd.M0(2131747753, null), org.telegram.messenger.bd.M0(2131747749, null), org.telegram.messenger.bd.M0(2131747751, null), org.telegram.messenger.bd.M0(2131747747, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        org.telegram.messenger.g0.r(this.Q);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23344y4);
        org.telegram.messenger.hs.f(this.f48190c).n(this, org.telegram.messenger.hs.J2);
        org.telegram.messenger.hp.e1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.Q3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f48198y) {
            if (org.telegram.messenger.bd.f21784a0) {
                this.d.setCurrentItem(6);
                this.f48197x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f48197x = 0;
            }
            this.f48198y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        o4 o4Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Ci;
                int themedColor = getThemedColor(i3);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Di);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null) {
                    if (themedColor == this.R) {
                        if (themedColor2 != this.S) {
                        }
                    }
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8));
                Drawable drawable = this.F;
                if (drawable != null && r12 != this.T) {
                    this.T = r12;
                    drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                TextView textView = this.f48192f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
                }
                fi.j jVar = this.f48193n;
                if (jVar != null) {
                    jVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
                    org.telegram.ui.ActionBar.k6.H1(this.f48193n.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
                org.telegram.ui.Components.ch0 ch0Var = this.f48196w;
                if (ch0Var != null && x02 != this.U) {
                    this.U = x02;
                    ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.da daVar = this.f48191e;
                if (daVar != null) {
                    daVar.invalidate();
                }
                if (this.d != null) {
                    for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                        View childAt = this.d.getChildAt(i10);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f48188a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f48189b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                    }
                }
                if (this.J != null && this.P != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)) {
                    org.telegram.messenger.g0.r(o4Var);
                    org.telegram.messenger.g0.i3(o4Var, 100L);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
