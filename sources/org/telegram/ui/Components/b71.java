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
public abstract class b71 extends org.telegram.ui.ActionBar.h3 {
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
    public final wz R;
    public final boolean S;
    public TextView f21744b;
    public final FrameLayout f21745c;
    public final bi.y1 d;
    public ul0 e;
    public ul0 f21746f;
    public final Drawable h;
    public final View f21747n;
    public AnimatorSet f21748r;
    public final jx0 f21749s;
    public final a10 v;
    public final a71 f21750w;
    public final RectF f21751x;
    public int f21752y;

    static {
        new org.telegram.ui.Cells.u8("colorProgress", 10);
    }

    public b71(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f21751x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.j6.Ii;
        this.J = org.telegram.ui.ActionBar.j6.f18017i6;
        int i11 = org.telegram.ui.ActionBar.j6.f17865a;
        int i12 = org.telegram.ui.ActionBar.j6.f17928d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.j6.G6;
        int i13 = org.telegram.ui.ActionBar.j6.f18306y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.j6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = f6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        z61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21745c = frameLayout;
        a71 a71Var = new a71(this, context, f6Var);
        this.f21750w = a71Var;
        a71Var.f24575x = true;
        a71Var.e();
        a71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(a71Var, w7.a6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        a10 a10Var = new a10(context, null);
        this.v = a10Var;
        a10Var.setViewType(6);
        a10Var.f21345w = false;
        a10Var.setUseHeaderOffset(true);
        jx0 jx0Var = new jx0(context, a10Var, 1, null);
        this.f21749s = jx0Var;
        jx0Var.addView(a10Var, 0, w7.a6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        uh.o oVar = jx0Var.d;
        oVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        m90 m90Var = jx0Var.e;
        m90Var.setText(string2);
        jx0Var.setVisibility(8);
        jx0Var.setAnimateLayoutChange(true);
        jx0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        oVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f6 f6Var2 = jx0Var.f24513n;
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        m90Var.setTag(Integer.valueOf(i17));
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var2));
        jx0Var.G = i18;
        this.containerView.addView(jx0Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.y1 y1Var = new bi.y1(this, context, f6Var, 23);
        this.d = y1Var;
        y1Var.setOverScrollMode(2);
        y1Var.setTag(13);
        y1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        y1Var.setClipToPadding(false);
        y1Var.setHideIfEmpty(false);
        y1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.J, f6Var));
        getContext();
        wz wzVar = new wz(AndroidUtilities.dp(8.0f), 0, y1Var);
        this.R = wzVar;
        wzVar.P = false;
        y1Var.setLayoutManager(wzVar);
        y1Var.setHorizontalScrollBarEnabled(false);
        y1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(y1Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        y1Var.setOnScrollListener(new al0(this, 5));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f21747n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.a6.e(-1, 58, 51));
        H(0.0f);
        y1Var.setEmptyView(jx0Var);
        y1Var.Y1 = true;
        y1Var.Z1 = 0;
    }

    public static int m(b71 b71Var) {
        return b71Var.backgroundPaddingTop;
    }

    public z61 C(Context context) {
        return new z61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, bi.t2 t2Var);

    public final void E(boolean z10) {
        Integer num;
        float f7;
        View view = this.f21747n;
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
            AnimatorSet animatorSet = this.f21748r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21748r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f21748r.setDuration(150L);
            this.f21748r.addListener(new yo(20, this, z10));
            this.f21748r.start();
        }
    }

    public abstract void F(String str);

    public final void H(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        bi.y1 y1Var = this.d;
        y1Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.O, false), org.telegram.ui.ActionBar.j6.w0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false), org.telegram.ui.ActionBar.j6.w0(null, this.P, false), f7, 1.0f);
        int childCount = y1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = y1Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (this.f21747n.getTag() != null) {
                    i10 = this.P;
                } else {
                    i10 = this.Q;
                }
                d4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        y1Var.invalidate();
        this.container.invalidate();
    }

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f21745c.setTranslationY(f7);
        this.f21749s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new dt0(this, i10, 1));
    }

    public void L() {
        int i10;
        int i11;
        bi.y1 y1Var = this.d;
        if (y1Var.getChildCount() > 0) {
            s4.c1 K = y1Var.K(0);
            if (K != null) {
                i10 = K.f41610a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f21752y != i10) {
                this.f21752y = i10;
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
        AndroidUtilities.hideKeyboard(this.f21750w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f21744b == null) {
            TextView textView = new TextView(getContext());
            this.f21744b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, this.resourcesProvider));
            this.f21744b.setTextSize(1, 20.0f);
            this.f21744b.setTypeface(AndroidUtilities.bold());
            this.f21744b.setLines(1);
            this.f21744b.setMaxLines(1);
            this.f21744b.setSingleLine(true);
            TextView textView2 = this.f21744b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f21744b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f21744b;
            FrameLayout.LayoutParams d = w7.a6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f21745c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f21750w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f21744b.setText(charSequence);
    }

    public void K() {
    }
}
