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
public abstract class r71 extends org.telegram.ui.ActionBar.e3 {
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
    public final b00 R;
    public final boolean S;
    public TextView f28458b;
    public final FrameLayout f28459c;
    public final bi.o0 d;
    public lm0 e;
    public lm0 f28460f;
    public final Drawable h;
    public final View f28461n;
    public AnimatorSet f28462r;
    public final wx0 f28463s;
    public final f10 v;
    public final q71 f28464w;
    public final RectF f28465x;
    public int f28466y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public r71(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.f28465x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.g6.Ii;
        this.J = org.telegram.ui.ActionBar.g6.f19690i6;
        int i11 = org.telegram.ui.ActionBar.g6.f19536a;
        int i12 = org.telegram.ui.ActionBar.g6.f19601d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.g6.G6;
        int i13 = org.telegram.ui.ActionBar.g6.f19988y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.g6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = c6Var;
        L();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        p71 E = E(context);
        this.containerView = E;
        E.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28459c = frameLayout;
        q71 q71Var = new q71(this, context, c6Var);
        this.f28464w = q71Var;
        q71Var.f27513x = true;
        q71Var.d();
        q71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(q71Var, w7.z5.a(48.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 51));
        f10 f10Var = new f10(context, null);
        this.v = f10Var;
        f10Var.setViewType(6);
        f10Var.f24549w = false;
        f10Var.setUseHeaderOffset(true);
        wx0 wx0Var = new wx0(context, f10Var, 1, null);
        this.f28463s = wx0Var;
        wx0Var.addView(f10Var, 0, w7.z5.a(-1.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1, 0));
        String string = LocaleController.getString(R.string.NoResult);
        wh.n nVar = wx0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        da0 da0Var = wx0Var.e;
        da0Var.setText(string2);
        wx0Var.setVisibility(8);
        wx0Var.setAnimateLayoutChange(true);
        wx0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.c6 c6Var2 = wx0Var.f30691n;
        nVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, c6Var2));
        da0Var.setTag(Integer.valueOf(i17));
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i17, c6Var2));
        wx0Var.G = i18;
        this.containerView.addView(wx0Var, w7.z5.a(-1.0f, 0.0f, 62.0f, 0.0f, 0.0f, -1, 51));
        bi.o0 o0Var = new bi.o0(this, context, c6Var, 24);
        this.d = o0Var;
        o0Var.setOverScrollMode(2);
        o0Var.setTag(13);
        o0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        o0Var.setClipToPadding(false);
        o0Var.setHideIfEmpty(false);
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(this.J, c6Var));
        getContext();
        b00 b00Var = new b00(AndroidUtilities.dp(8.0f), 0, o0Var);
        this.R = b00Var;
        b00Var.P = false;
        o0Var.setLayoutManager(b00Var);
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(o0Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        o0Var.setOnScrollListener(new kc0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f28461n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, 58, 51));
        I(0.0f);
        o0Var.setEmptyView(wx0Var);
        o0Var.W1 = true;
        o0Var.X1 = 0;
    }

    public static int n(r71 r71Var) {
        return r71Var.backgroundPaddingTop;
    }

    public p71 E(Context context) {
        return new p71(this, context);
    }

    public abstract void F(MotionEvent motionEvent, di.g2 g2Var);

    public final void G(boolean z10) {
        Integer num;
        float f7;
        View view = this.f28461n;
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
            AnimatorSet animatorSet = this.f28462r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28462r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f28462r.setDuration(150L);
            this.f28462r.addListener(new org.telegram.ui.vo(25, this, z10));
            this.f28462r.start();
        }
    }

    public abstract void H(String str);

    public final void I(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.g6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        bi.o0 o0Var = this.d;
        o0Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, this.O, false), org.telegram.ui.ActionBar.g6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, this.Q, false), org.telegram.ui.ActionBar.g6.x0(null, this.P, false), f7, 1.0f);
        int childCount = o0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = o0Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (this.f28461n.getTag() != null) {
                    i10 = this.P;
                } else {
                    i10 = this.Q;
                }
                e4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        o0Var.invalidate();
        this.container.invalidate();
    }

    public void J(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f28459c.setTranslationY(f7);
        this.f28463s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void K(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new tt0(this, i10, 1));
    }

    public void M() {
        int i10;
        int i11;
        bi.o0 o0Var = this.d;
        if (o0Var.getChildCount() > 0) {
            s4.b1 K = o0Var.K(0);
            if (K != null) {
                i10 = K.f44838a.getTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (i10 > 0 && K != null && K.b() == 0) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            if (i10 >= 0 && K != null && K.b() == 0) {
                G(false);
            } else {
                G(true);
                i10 = i11;
            }
            if (this.f28466y != i10) {
                this.f28466y = i10;
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
        AndroidUtilities.hideKeyboard(this.f28464w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f28458b == null) {
            TextView textView = new TextView(getContext());
            this.f28458b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, this.resourcesProvider));
            this.f28458b.setTextSize(1, 20.0f);
            this.f28458b.setTypeface(AndroidUtilities.bold());
            this.f28458b.setLines(1);
            this.f28458b.setMaxLines(1);
            this.f28458b.setSingleLine(true);
            TextView textView2 = this.f28458b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f28458b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f28458b;
            FrameLayout.LayoutParams a2 = w7.z5.a(36.0f, 16.0f, 0.0f, 0.0f, 0.0f, -1, 51);
            FrameLayout frameLayout = this.f28459c;
            frameLayout.addView(textView3, a2);
            ((FrameLayout.LayoutParams) this.f28464w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f28458b.setText(charSequence);
    }

    public void L() {
    }
}
