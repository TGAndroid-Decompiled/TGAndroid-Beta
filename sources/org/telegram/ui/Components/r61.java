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
public abstract class r61 extends org.telegram.ui.ActionBar.h3 {
    public float B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final rz O;
    public final boolean P;
    public TextView f30664b;
    public final FrameLayout f30665c;
    public final mh.d1 d;
    public rl0 f30666e;
    public rl0 f30667f;
    public final Drawable h;
    public final View f30668n;
    public AnimatorSet f30669r;
    public final zw0 f30670s;
    public final u00 v;
    public final q61 f30671w;
    public final RectF f30672x;
    public int f30673y;

    static {
        new ih.g("colorProgress", 12);
    }

    public r61(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.f30672x = new RectF();
        this.D = true;
        this.E = true;
        this.F = org.telegram.ui.ActionBar.k6.Ii;
        this.G = org.telegram.ui.ActionBar.k6.f21752i6;
        int i11 = org.telegram.ui.ActionBar.k6.f21600a;
        int i12 = org.telegram.ui.ActionBar.k6.f21661d6;
        this.H = i12;
        this.I = i12;
        this.J = org.telegram.ui.ActionBar.k6.G6;
        int i13 = org.telegram.ui.ActionBar.k6.f22038y6;
        this.K = i13;
        this.L = i13;
        int i14 = org.telegram.ui.ActionBar.k6.Q5;
        this.M = i14;
        this.N = i14;
        this.P = true;
        this.resourcesProvider = g6Var;
        J();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        p61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30665c = frameLayout;
        q61 q61Var = new q61(this, context, g6Var);
        this.f30671w = q61Var;
        q61Var.f26135x = true;
        q61Var.e();
        q61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(q61Var, k7.c6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        u00 u00Var = new u00(context, null);
        this.v = u00Var;
        u00Var.setViewType(6);
        u00Var.f31465w = false;
        u00Var.setUseHeaderOffset(true);
        zw0 zw0Var = new zw0(context, u00Var, 1, null);
        this.f30670s = zw0Var;
        zw0Var.addView(u00Var, 0, k7.c6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        jh.s sVar = zw0Var.d;
        sVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        g90 g90Var = zw0Var.f34033e;
        g90Var.setText(string2);
        zw0Var.setVisibility(8);
        zw0Var.setAnimateLayoutChange(true);
        zw0Var.e(true, false);
        int i16 = this.J;
        int i17 = this.K;
        int i18 = this.H;
        sVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.g6 g6Var2 = zw0Var.f34035n;
        sVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var2));
        g90Var.setTag(Integer.valueOf(i17));
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i17, g6Var2));
        zw0Var.D = i18;
        this.containerView.addView(zw0Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        mh.d1 d1Var = new mh.d1(this, context, g6Var, 22);
        this.d = d1Var;
        d1Var.setOverScrollMode(2);
        d1Var.setTag(13);
        d1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        d1Var.setClipToPadding(false);
        d1Var.setHideIfEmpty(false);
        d1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(this.G, g6Var));
        getContext();
        rz rzVar = new rz(AndroidUtilities.dp(8.0f), 0, d1Var);
        this.O = rzVar;
        rzVar.P = false;
        d1Var.setLayoutManager(rzVar);
        d1Var.setHorizontalScrollBarEnabled(false);
        d1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(d1Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d1Var.setOnScrollListener(new nb0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f30668n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, k7.c6.e(-1, 58, 51));
        G(0.0f);
        d1Var.setEmptyView(zw0Var);
        d1Var.V1 = true;
        d1Var.W1 = 0;
    }

    public p61 C(Context context) {
        return new p61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, lg.f fVar);

    public final void E(boolean z4) {
        Integer num;
        float f10;
        View view = this.f30668n;
        if ((z4 && view.getTag() != null) || (!z4 && view.getTag() == null)) {
            if (z4) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z4) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f30669r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30669r = animatorSet2;
            Property property = View.ALPHA;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f30669r.setDuration(150L);
            this.f30669r.addListener(new x20(14, this, z4));
            this.f30669r.start();
        }
    }

    public abstract void F(String str);

    public final void G(float f10) {
        int i10;
        this.B = f10;
        this.C = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(this.H, this.resourcesProvider), org.telegram.ui.ActionBar.k6.v0(this.I, this.resourcesProvider), f10, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.C, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.C);
        int i11 = this.C;
        this.navBarColor = i11;
        mh.d1 d1Var = this.d;
        d1Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, this.L, false), org.telegram.ui.ActionBar.k6.w0(null, this.K, false), f10, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, this.N, false), org.telegram.ui.ActionBar.k6.w0(null, this.M, false), f10, 1.0f);
        int childCount = d1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = d1Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (this.f30668n.getTag() != null) {
                    i10 = this.M;
                } else {
                    i10 = this.N;
                }
                e4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        d1Var.invalidate();
        this.container.invalidate();
    }

    public void H(int i10) {
        this.d.setTopGlowOffset(i10);
        float f10 = i10;
        this.f30665c.setTranslationY(f10);
        this.f30670s.setTranslationY(f10);
        this.containerView.invalidate();
    }

    public final void I(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new ts0(this, i10, 1));
    }

    public void K() {
        int i10;
        int i11;
        mh.d1 d1Var = this.d;
        if (d1Var.getChildCount() > 0) {
            f2.m1 K = d1Var.K(0);
            if (K != null) {
                i10 = K.f5875a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f30673y != i10) {
                this.f30673y = i10;
                H(i10);
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.f30671w.G);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f30664b == null) {
            TextView textView = new TextView(getContext());
            this.f30664b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, this.resourcesProvider));
            this.f30664b.setTextSize(1, 20.0f);
            this.f30664b.setTypeface(AndroidUtilities.bold());
            this.f30664b.setLines(1);
            this.f30664b.setMaxLines(1);
            this.f30664b.setSingleLine(true);
            TextView textView2 = this.f30664b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f30664b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f30664b;
            FrameLayout.LayoutParams d = k7.c6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f30665c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f30671w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f30664b.setText(charSequence);
    }

    public void J() {
    }
}
