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
public abstract class q61 extends org.telegram.ui.ActionBar.g3 {
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
    public final pz O;
    public final boolean P;
    public TextView f28090b;
    public final FrameLayout f28091c;
    public final lh.e1 d;
    public ql0 e;
    public ql0 f28092f;
    public final Drawable h;
    public final View f28093n;
    public AnimatorSet f28094r;
    public final zw0 f28095s;
    public final u00 v;
    public final p61 f28096w;
    public final RectF f28097x;
    public int f28098y;

    static {
        new hh.g("colorProgress", 12);
    }

    public q61(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        this.f28097x = new RectF();
        this.D = true;
        this.E = true;
        this.F = org.telegram.ui.ActionBar.j6.Ii;
        this.G = org.telegram.ui.ActionBar.j6.f19971i6;
        int i11 = org.telegram.ui.ActionBar.j6.f19820a;
        int i12 = org.telegram.ui.ActionBar.j6.f19881d6;
        this.H = i12;
        this.I = i12;
        this.J = org.telegram.ui.ActionBar.j6.G6;
        int i13 = org.telegram.ui.ActionBar.j6.f20256y6;
        this.K = i13;
        this.L = i13;
        int i14 = org.telegram.ui.ActionBar.j6.Q5;
        this.M = i14;
        this.N = i14;
        this.P = true;
        this.resourcesProvider = f6Var;
        J();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        o61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28091c = frameLayout;
        p61 p61Var = new p61(this, context, f6Var);
        this.f28096w = p61Var;
        p61Var.f24120x = true;
        p61Var.e();
        p61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(p61Var, k7.b6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        u00 u00Var = new u00(context, null);
        this.v = u00Var;
        u00Var.setViewType(6);
        u00Var.f29071w = false;
        u00Var.setUseHeaderOffset(true);
        zw0 zw0Var = new zw0(context, u00Var, 1, null);
        this.f28095s = zw0Var;
        zw0Var.addView(u00Var, 0, k7.b6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        ih.s sVar = zw0Var.d;
        sVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        f90 f90Var = zw0Var.e;
        f90Var.setText(string2);
        zw0Var.setVisibility(8);
        zw0Var.setAnimateLayoutChange(true);
        zw0Var.e(true, false);
        int i16 = this.J;
        int i17 = this.K;
        int i18 = this.H;
        sVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f6 f6Var2 = zw0Var.f31486n;
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        f90Var.setTag(Integer.valueOf(i17));
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var2));
        zw0Var.D = i18;
        this.containerView.addView(zw0Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 22);
        this.d = e1Var;
        e1Var.setOverScrollMode(2);
        e1Var.setTag(13);
        e1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        e1Var.setClipToPadding(false);
        e1Var.setHideIfEmpty(false);
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.G, f6Var));
        getContext();
        pz pzVar = new pz(AndroidUtilities.dp(8.0f), 0, e1Var);
        this.O = pzVar;
        pzVar.P = false;
        e1Var.setLayoutManager(pzVar);
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(e1Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e1Var.setOnScrollListener(new mb0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f28093n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, k7.b6.e(-1, 58, 51));
        G(0.0f);
        e1Var.setEmptyView(zw0Var);
        e1Var.V1 = true;
        e1Var.W1 = 0;
    }

    public o61 C(Context context) {
        return new o61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, kg.f fVar);

    public final void E(boolean z4) {
        Integer num;
        float f10;
        View view = this.f28093n;
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
            AnimatorSet animatorSet = this.f28094r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28094r = animatorSet2;
            Property property = View.ALPHA;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f28094r.setDuration(150L);
            this.f28094r.addListener(new m00(16, this, z4));
            this.f28094r.start();
        }
    }

    public abstract void F(String str);

    public final void G(float f10) {
        int i10;
        this.B = f10;
        this.C = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(this.H, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(this.I, this.resourcesProvider), f10, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.C, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.C);
        int i11 = this.C;
        this.navBarColor = i11;
        lh.e1 e1Var = this.d;
        e1Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.L, false), org.telegram.ui.ActionBar.j6.w0(null, this.K, false), f10, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.N, false), org.telegram.ui.ActionBar.j6.w0(null, this.M, false), f10, 1.0f);
        int childCount = e1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = e1Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.v3) {
                ((org.telegram.ui.Cells.v3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (this.f28093n.getTag() != null) {
                    i10 = this.M;
                } else {
                    i10 = this.N;
                }
                d4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        e1Var.invalidate();
        this.container.invalidate();
    }

    public void H(int i10) {
        this.d.setTopGlowOffset(i10);
        float f10 = i10;
        this.f28091c.setTranslationY(f10);
        this.f28095s.setTranslationY(f10);
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
        lh.e1 e1Var = this.d;
        if (e1Var.getChildCount() > 0) {
            f2.l1 K = e1Var.K(0);
            if (K != null) {
                i10 = K.f5774a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f28098y != i10) {
                this.f28098y = i10;
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
        AndroidUtilities.hideKeyboard(this.f28096w.G);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f28090b == null) {
            TextView textView = new TextView(getContext());
            this.f28090b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, this.resourcesProvider));
            this.f28090b.setTextSize(1, 20.0f);
            this.f28090b.setTypeface(AndroidUtilities.bold());
            this.f28090b.setLines(1);
            this.f28090b.setMaxLines(1);
            this.f28090b.setSingleLine(true);
            TextView textView2 = this.f28090b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f28090b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f28090b;
            FrameLayout.LayoutParams d = k7.b6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f28091c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f28096w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f28090b.setText(charSequence);
    }

    public void J() {
    }
}
