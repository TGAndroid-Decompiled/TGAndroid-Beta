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
public abstract class s71 extends org.telegram.ui.ActionBar.h3 {
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
    public TextView f30402b;
    public final FrameLayout f30403c;
    public final ai.u1 d;
    public lm0 e;
    public lm0 f30404f;
    public final Drawable h;
    public final View f30405n;
    public AnimatorSet f30406r;
    public final wx0 f30407s;
    public final b10 v;
    public final r71 f30408w;
    public final RectF f30409x;
    public int f30410y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public s71(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.f30409x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.k6.Ii;
        this.J = org.telegram.ui.ActionBar.k6.f21272i6;
        int i11 = org.telegram.ui.ActionBar.k6.f21118a;
        int i12 = org.telegram.ui.ActionBar.k6.f21183d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.k6.G6;
        int i13 = org.telegram.ui.ActionBar.k6.f21571y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.k6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = g6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        q71 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30403c = frameLayout;
        r71 r71Var = new r71(this, context, g6Var);
        this.f30408w = r71Var;
        r71Var.f27839x = true;
        r71Var.updateColors();
        r71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(r71Var, w7.z5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        b10 b10Var = new b10(context, null);
        this.v = b10Var;
        b10Var.setViewType(6);
        b10Var.f24923w = false;
        b10Var.setUseHeaderOffset(true);
        wx0 wx0Var = new wx0(context, b10Var, 1, null);
        this.f30407s = wx0Var;
        wx0Var.addView(b10Var, 0, w7.z5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        wh.n nVar = wx0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        y90 y90Var = wx0Var.e;
        y90Var.setText(string2);
        wx0Var.setVisibility(8);
        wx0Var.setAnimateLayoutChange(true);
        wx0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.g6 g6Var2 = wx0Var.f32374n;
        org.telegram.ui.ActionBar.r6.W(nVar, i16, g6Var2);
        y90Var.setTag(Integer.valueOf(i17));
        org.telegram.ui.ActionBar.r6.W(y90Var, i17, g6Var2);
        wx0Var.G = i18;
        this.containerView.addView(wx0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 25);
        this.d = u1Var;
        u1Var.setOverScrollMode(2);
        u1Var.setTag(13);
        u1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        u1Var.setClipToPadding(false);
        u1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.r6.m(u1Var, 20, this.J, g6Var);
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
        this.f30405n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, 58, 51));
        G(0.0f);
        u1Var.setEmptyView(wx0Var);
        u1Var.W1 = true;
        u1Var.X1 = 0;
    }

    public static int m(s71 s71Var) {
        return s71Var.backgroundPaddingTop;
    }

    public q71 C(Context context) {
        return new q71(this, context);
    }

    public abstract void D(MotionEvent motionEvent, ei.e2 e2Var);

    public final void E(boolean z10) {
        Integer num;
        float f7;
        View view = this.f30405n;
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
            AnimatorSet animatorSet = this.f30406r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30406r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f30406r.setDuration(150L);
            this.f30406r.addListener(new org.telegram.ui.ho(25, this, z10));
            this.f30406r.start();
        }
    }

    public abstract void F(String str);

    public final void G(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.k6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        ai.u1 u1Var = this.d;
        u1Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, this.O, false), org.telegram.ui.ActionBar.k6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, this.Q, false), org.telegram.ui.ActionBar.k6.x0(null, this.P, false), f7, 1.0f);
        int childCount = u1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = u1Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (this.f30405n.getTag() != null) {
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

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f30403c.setTranslationY(f7);
        this.f30407s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new tt0(this, i10, 1));
    }

    public void L() {
        int i10;
        int i11;
        ai.u1 u1Var = this.d;
        if (u1Var.getChildCount() > 0) {
            s4.b1 K = u1Var.K(0);
            if (K != null) {
                i10 = K.f46343a.getTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (i10 > 0 && K != null && K.b() == 0) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            if (i10 >= 0 && K != null && K.b() == 0) {
                E(false);
            } else {
                E(true);
                i10 = i11;
            }
            if (this.f30410y != i10) {
                this.f30410y = i10;
                I(i10);
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.f30408w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f30402b == null) {
            TextView textView = new TextView(getContext());
            this.f30402b = textView;
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, this.resourcesProvider);
            this.f30402b.setTextSize(1, 20.0f);
            this.f30402b.setTypeface(AndroidUtilities.bold());
            this.f30402b.setLines(1);
            this.f30402b.setMaxLines(1);
            this.f30402b.setSingleLine(true);
            TextView textView2 = this.f30402b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f30402b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f30402b;
            FrameLayout.LayoutParams d = w7.z5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f30403c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f30408w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f30402b.setText(charSequence);
    }

    public void K() {
    }
}
