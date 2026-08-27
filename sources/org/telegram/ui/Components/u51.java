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

public abstract class u51 extends org.telegram.ui.ActionBar.e3 {
    public float A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final dz N;
    public final boolean O;

    public TextView f32977b;

    public final FrameLayout f32978c;
    public final hh.f1 d;

    public yk0 f32979e;

    public yk0 f32980f;
    public final Drawable h;

    public final View f32981n;

    public AnimatorSet f32982r;

    public final iw0 f32983s;
    public final h00 v;

    public final t51 f32984w;

    public final RectF f32985x;

    public int f32986y;

    static {
        new dh.g("colorProgress", 12);
    }

    public u51(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.f32985x = new RectF();
        this.C = true;
        this.D = true;
        this.E = org.telegram.ui.ActionBar.g6.Ii;
        this.F = org.telegram.ui.ActionBar.g6.f23144i6;
        int i11 = org.telegram.ui.ActionBar.g6.f22993a;
        int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
        this.G = i12;
        this.H = i12;
        this.I = org.telegram.ui.ActionBar.g6.G6;
        int i13 = org.telegram.ui.ActionBar.g6.f23423y6;
        this.J = i13;
        this.K = i13;
        int i14 = org.telegram.ui.ActionBar.g6.Q5;
        this.L = i14;
        this.M = i14;
        this.O = true;
        this.resourcesProvider = c6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        s51 s51VarD = D(context);
        this.containerView = s51VarD;
        s51VarD.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32978c = frameLayout;
        t51 t51Var = new t51(this, context, c6Var);
        this.f32984w = t51Var;
        t51Var.f31471x = true;
        t51Var.d();
        t51Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(t51Var, h7.z5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        h00 h00Var = new h00(context, null);
        this.v = h00Var;
        h00Var.setViewType(6);
        h00Var.f28887w = false;
        h00Var.setUseHeaderOffset(true);
        iw0 iw0Var = new iw0(context, h00Var, 1, null);
        this.f32983s = iw0Var;
        iw0Var.addView(h00Var, 0, h7.z5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        eh.s sVar = iw0Var.d;
        sVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        p80 p80Var = iw0Var.f29506e;
        p80Var.setText(string2);
        iw0Var.setVisibility(8);
        iw0Var.setAnimateLayoutChange(true);
        iw0Var.e(true, false);
        int i16 = this.I;
        int i17 = this.J;
        int i18 = this.G;
        sVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.c6 c6Var2 = iw0Var.f29508n;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var2));
        p80Var.setTag(Integer.valueOf(i17));
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var2));
        iw0Var.C = i18;
        this.containerView.addView(iw0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        hh.f1 f1Var = new hh.f1(this, context, c6Var, 24);
        this.d = f1Var;
        f1Var.setOverScrollMode(2);
        f1Var.setTag(13);
        f1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        f1Var.setClipToPadding(false);
        f1Var.setHideIfEmpty(false);
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.F, c6Var));
        getContext();
        dz dzVar = new dz(AndroidUtilities.dp(8.0f), 0, f1Var);
        this.N = dzVar;
        dzVar.P = false;
        f1Var.setLayoutManager(dzVar);
        f1Var.setHorizontalScrollBarEnabled(false);
        f1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(f1Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f1Var.setOnScrollListener(new xm(this, 15));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f32981n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, h7.z5.e(-1, 58, 51));
        H(0.0f);
        f1Var.setEmptyView(iw0Var);
        f1Var.U1 = true;
        f1Var.V1 = 0;
    }

    public s51 D(Context context) {
        return new s51(this, context);
    }

    public abstract void E(MotionEvent motionEvent, gg.g gVar);

    public final void F(boolean z10) {
        View view = this.f32981n;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.f32982r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32982r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f32982r.setDuration(150L);
        this.f32982r.addListener(new org.telegram.ui.go(25, this, z10));
        this.f32982r.start();
    }

    public abstract void G(String str);

    public final void H(float f10) {
        this.A = f10;
        this.B = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(this.G, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(this.H, this.resourcesProvider), f10, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.B, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.B);
        int i10 = this.B;
        this.navBarColor = i10;
        hh.f1 f1Var = this.d;
        f1Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, this.K, false), org.telegram.ui.ActionBar.g6.w0(null, this.J, false), f10, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, this.M, false), org.telegram.ui.ActionBar.g6.w0(null, this.L, false), f10, 1.0f);
        int childCount = f1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = f1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u3) {
                ((org.telegram.ui.Cells.u3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.b4) {
                ((org.telegram.ui.Cells.b4) childAt).f(this.f32981n.getTag() != null ? this.L : this.M, offsetColor2);
            }
        }
        this.containerView.invalidate();
        f1Var.invalidate();
        this.container.invalidate();
    }

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f10 = i10;
        this.f32978c.setTranslationY(f10);
        this.f32983s.setTranslationY(f10);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (isShowing()) {
            this.d.getViewTreeObserver().addOnPreDrawListener(new bs0(this, i10, 1));
        }
    }

    public void L() {
        hh.f1 f1Var = this.d;
        if (f1Var.getChildCount() <= 0) {
            return;
        }
        f2.o1 o1VarK = f1Var.K(0);
        int top = o1VarK != null ? o1VarK.f5789a.getTop() - AndroidUtilities.dp(8.0f) : 0;
        int i10 = (top <= 0 || o1VarK == null || o1VarK.b() != 0) ? 0 : top;
        if (top < 0 || o1VarK == null || o1VarK.b() != 0) {
            F(true);
            top = i10;
        } else {
            F(false);
        }
        if (this.f32986y != top) {
            this.f32986y = top;
            I(top);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.f32984w.F);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        if (this.f32977b == null) {
            TextView textView = new TextView(getContext());
            this.f32977b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, this.resourcesProvider));
            this.f32977b.setTextSize(1, 20.0f);
            this.f32977b.setTypeface(AndroidUtilities.bold());
            this.f32977b.setLines(1);
            this.f32977b.setMaxLines(1);
            this.f32977b.setSingleLine(true);
            this.f32977b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.f32977b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.f32977b;
            FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f32978c;
            frameLayout.addView(textView2, layoutParamsD);
            ((FrameLayout.LayoutParams) this.f32984w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f32977b.setText(charSequence);
    }

    public void K() {
    }
}
