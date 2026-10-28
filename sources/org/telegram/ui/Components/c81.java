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
public abstract class c81 extends org.telegram.ui.ActionBar.k3 {
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
    public TextView f27091b;
    public final FrameLayout f27092c;
    public final bi.r1 d;
    public mm0 e;
    public mm0 f27093f;
    public final Drawable h;
    public final View f27094n;
    public AnimatorSet f27095r;
    public final fy0 f27096s;
    public final c10 v;
    public final b81 f27097w;
    public final RectF f27098x;
    public int f27099y;

    static {
        new org.telegram.ui.Cells.x8("colorProgress", 10);
    }

    public c81(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.f27098x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.y6.Ii;
        this.J = org.telegram.ui.ActionBar.y6.f23449i6;
        int i11 = org.telegram.ui.ActionBar.y6.f23293a;
        int i12 = org.telegram.ui.ActionBar.y6.f23357d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.y6.G6;
        int i13 = org.telegram.ui.ActionBar.y6.f23749y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.y6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = u6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        a81 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27092c = frameLayout;
        b81 b81Var = new b81(this, context, u6Var);
        this.f27097w = b81Var;
        b81Var.f30350x = true;
        b81Var.updateColors();
        b81Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(b81Var, kb1.h(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        c10 c10Var = new c10(context, null);
        this.v = c10Var;
        c10Var.setViewType(6);
        c10Var.f27026w = false;
        c10Var.setUseHeaderOffset(true);
        fy0 fy0Var = new fy0(context, c10Var, 1, null);
        this.f27096s = fy0Var;
        fy0Var.addView(c10Var, 0, kb1.h(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        xh.n nVar = fy0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        aa0 aa0Var = fy0Var.e;
        aa0Var.setText(string2);
        fy0Var.setVisibility(8);
        fy0Var.setAnimateLayoutChange(true);
        fy0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.u6 u6Var2 = fy0Var.f28316n;
        org.telegram.ui.ActionBar.f7.V(nVar, i16, u6Var2);
        aa0Var.setTag(Integer.valueOf(i17));
        org.telegram.ui.ActionBar.f7.V(aa0Var, i17, u6Var2);
        fy0Var.G = i18;
        this.containerView.addView(fy0Var, kb1.h(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 25);
        this.d = r1Var;
        r1Var.setOverScrollMode(2);
        r1Var.setTag(13);
        r1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        r1Var.setClipToPadding(false);
        r1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.f7.m(r1Var, 20, this.J, u6Var);
        getContext();
        yz yzVar = new yz(AndroidUtilities.dp(8.0f), 0, r1Var);
        this.R = yzVar;
        yzVar.P = false;
        r1Var.setLayoutManager(yzVar);
        r1Var.setHorizontalScrollBarEnabled(false);
        r1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(r1Var, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r1Var.setOnScrollListener(new ml(this, 17));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f27094n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, kb1.i(-1, 58, 51));
        H(0.0f);
        r1Var.setEmptyView(fy0Var);
        r1Var.W1 = true;
        r1Var.X1 = 0;
    }

    public static int m(c81 c81Var) {
        return c81Var.backgroundPaddingTop;
    }

    public a81 C(Context context) {
        return new a81(this, context);
    }

    public abstract void D(MotionEvent motionEvent, fi.c2 c2Var);

    public final void F(boolean z10) {
        Integer num;
        float f7;
        View view = this.f27094n;
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
            AnimatorSet animatorSet = this.f27095r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27095r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f27095r.setDuration(150L);
            this.f27095r.addListener(new org.telegram.ui.lo(25, this, z10));
            this.f27095r.start();
        }
    }

    public abstract void G(String str);

    public final void H(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.y6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        bi.r1 r1Var = this.d;
        r1Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, this.O, false), org.telegram.ui.ActionBar.y6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, this.Q, false), org.telegram.ui.ActionBar.y6.x0(null, this.P, false), f7, 1.0f);
        int childCount = r1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = r1Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                ((org.telegram.ui.Cells.b4) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.i4) {
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                if (this.f27094n.getTag() != null) {
                    i10 = this.P;
                } else {
                    i10 = this.Q;
                }
                i4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        r1Var.invalidate();
        this.container.invalidate();
    }

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f27092c.setTranslationY(f7);
        this.f27096s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new bu0(this, i10, 1));
    }

    public void L() {
        int i10;
        int i11;
        bi.r1 r1Var = this.d;
        if (r1Var.getChildCount() > 0) {
            s4.e1 K = r1Var.K(0);
            if (K != null) {
                i10 = K.f47773a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f27099y != i10) {
                this.f27099y = i10;
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
        AndroidUtilities.hideKeyboard(this.f27097w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f27091b == null) {
            TextView textView = new TextView(getContext());
            this.f27091b = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, this.resourcesProvider);
            this.f27091b.setTextSize(1, 20.0f);
            this.f27091b.setTypeface(AndroidUtilities.bold());
            this.f27091b.setLines(1);
            this.f27091b.setMaxLines(1);
            this.f27091b.setSingleLine(true);
            TextView textView2 = this.f27091b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f27091b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f27091b;
            FrameLayout.LayoutParams h = kb1.h(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f27092c;
            frameLayout.addView(textView3, h);
            ((FrameLayout.LayoutParams) this.f27097w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f27091b.setText(charSequence);
    }

    public void K() {
    }
}
