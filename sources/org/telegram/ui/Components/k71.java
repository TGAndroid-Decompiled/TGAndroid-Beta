package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class k71 extends org.telegram.ui.ActionBar.f3 {
    public float E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final yz R;
    public final boolean S;
    public TextView f27732b;
    public final FrameLayout f27733c;
    public final ai.u1 d;
    public hm0 e;
    public hm0 f27734f;
    public final Drawable h;
    public final View f27735n;
    public AnimatorSet f27736r;
    public final sx0 f27737s;
    public final b10 v;
    public final j71 f27738w;
    public final RectF f27739x;
    public int f27740y;

    static {
        new org.telegram.ui.Cells.s8("colorProgress", 10);
    }

    public k71(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.f27739x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.h6.Ii;
        this.J = org.telegram.ui.ActionBar.h6.f21076i6;
        int i11 = org.telegram.ui.ActionBar.h6.f20922a;
        int i12 = org.telegram.ui.ActionBar.h6.f20987d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.h6.G6;
        int i13 = org.telegram.ui.ActionBar.h6.f21375y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.h6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = d6Var;
        L();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        i71 D = D(context);
        this.containerView = D;
        D.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27733c = frameLayout;
        j71 j71Var = new j71(this, context, d6Var);
        this.f27738w = j71Var;
        j71Var.f27689x = true;
        j71Var.d();
        j71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(j71Var, w7.z5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        b10 b10Var = new b10(context, null);
        this.v = b10Var;
        b10Var.setViewType(6);
        b10Var.f24770w = false;
        b10Var.setUseHeaderOffset(true);
        sx0 sx0Var = new sx0(context, b10Var, 1, null);
        this.f27737s = sx0Var;
        sx0Var.addView(b10Var, 0, w7.z5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        wh.n nVar = sx0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        x90 x90Var = sx0Var.e;
        x90Var.setText(string2);
        sx0Var.setVisibility(8);
        sx0Var.setAnimateLayoutChange(true);
        sx0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.d6 d6Var2 = sx0Var.f30354n;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var2));
        x90Var.setTag(Integer.valueOf(i17));
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i17, d6Var2));
        sx0Var.G = i18;
        this.containerView.addView(sx0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, d6Var, 25);
        this.d = u1Var;
        u1Var.setOverScrollMode(2);
        u1Var.setTag(13);
        u1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        u1Var.setClipToPadding(false);
        u1Var.setHideIfEmpty(false);
        u1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(this.J, d6Var));
        getContext();
        yz yzVar = new yz(AndroidUtilities.dp(8.0f), 0, u1Var);
        this.R = yzVar;
        yzVar.P = false;
        u1Var.setLayoutManager(yzVar);
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        u1Var.setOnScrollListener(new kv(this, 12));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f27735n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, 58, 51));
        I(0.0f);
        u1Var.setEmptyView(sx0Var);
        u1Var.W1 = true;
        u1Var.X1 = 0;
    }

    public static int n(k71 k71Var) {
        return k71Var.backgroundPaddingTop;
    }

    public i71 D(Context context) {
        return new i71(this, context);
    }

    public abstract void E(MotionEvent motionEvent, ei.e2 e2Var);

    public final void F(boolean z10) {
        Integer num;
        float f7;
        View view = this.f27735n;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f27736r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27736r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f27736r.setDuration(150L);
            this.f27736r.addListener(new org.telegram.ui.fo(25, this, z10));
            this.f27736r.start();
        }
    }

    public abstract void G(String str);

    public final void I(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.h6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        ai.u1 u1Var = this.d;
        u1Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, this.O, false), org.telegram.ui.ActionBar.h6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, this.Q, false), org.telegram.ui.ActionBar.h6.x0(null, this.P, false), f7, 1.0f);
        int childCount = u1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = u1Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (this.f27735n.getTag() != null) {
                    i10 = this.P;
                } else {
                    i10 = this.Q;
                }
                d4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        u1Var.invalidate();
        this.container.invalidate();
    }

    public void J(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f27733c.setTranslationY(f7);
        this.f27737s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void K(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new pt0(this, i10, 1));
    }

    public void M() {
        int i10;
        int i11;
        ai.u1 u1Var = this.d;
        if (u1Var.getChildCount() > 0) {
            s4.b1 K = u1Var.K(0);
            if (K != null) {
                i10 = K.f45912a.getTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (i10 > 0 && K != null && K.b() == 0) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            if (i10 >= 0 && K != null && K.b() == 0) {
                F(false);
            } else {
                F(true);
                i10 = i11;
            }
            if (this.f27740y != i10) {
                this.f27740y = i10;
                J(i10);
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.f27738w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f27732b == null) {
            TextView textView = new TextView(getContext());
            this.f27732b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21093j5, this.resourcesProvider));
            this.f27732b.setTextSize(1, 20.0f);
            this.f27732b.setTypeface(AndroidUtilities.bold());
            this.f27732b.setLines(1);
            this.f27732b.setMaxLines(1);
            this.f27732b.setSingleLine(true);
            TextView textView2 = this.f27732b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f27732b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f27732b;
            FrameLayout.LayoutParams d = w7.z5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f27733c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f27738w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f27732b.setText(charSequence);
    }

    public void L() {
    }
}
