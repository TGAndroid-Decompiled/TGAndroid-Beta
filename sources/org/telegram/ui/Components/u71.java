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
public abstract class u71 extends org.telegram.ui.ActionBar.f3 {
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
    public final g00 R;
    public final boolean S;
    public TextView f31409b;
    public final FrameLayout f31410c;
    public final ai.w0 d;
    public qm0 f31411e;
    public qm0 f31412f;
    public final Drawable h;
    public final View f31413n;
    public AnimatorSet f31414r;
    public final by0 f31415s;
    public final k10 v;
    public final t71 f31416w;
    public final RectF f31417x;
    public int f31418y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public u71(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f31417x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.i6.Ii;
        this.J = org.telegram.ui.ActionBar.i6.f20892i6;
        int i11 = org.telegram.ui.ActionBar.i6.f20738a;
        int i12 = org.telegram.ui.ActionBar.i6.f20801d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.i6.G6;
        int i13 = org.telegram.ui.ActionBar.i6.f21185y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.i6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = e6Var;
        L();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        s71 E = E(context);
        this.containerView = E;
        E.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31410c = frameLayout;
        t71 t71Var = new t71(this, context, e6Var);
        this.f31416w = t71Var;
        t71Var.f30961x = true;
        t71Var.e();
        t71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(t71Var, w7.x5.a(48.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 51));
        k10 k10Var = new k10(context, null);
        this.v = k10Var;
        k10Var.setViewType(6);
        k10Var.f27857w = false;
        k10Var.setUseHeaderOffset(true);
        by0 by0Var = new by0(context, k10Var, 1, null);
        this.f31415s = by0Var;
        by0Var.addView(k10Var, 0, w7.x5.a(-1.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1, 0));
        String string = LocaleController.getString(R.string.NoResult);
        vh.n nVar = by0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        fa0 fa0Var = by0Var.f25085e;
        fa0Var.setText(string2);
        by0Var.setVisibility(8);
        by0Var.setAnimateLayoutChange(true);
        by0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.e6 e6Var2 = by0Var.f25087n;
        nVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, e6Var2));
        fa0Var.setTag(Integer.valueOf(i17));
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i17, e6Var2));
        by0Var.G = i18;
        this.containerView.addView(by0Var, w7.x5.a(-1.0f, 0.0f, 62.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 24);
        this.d = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setTag(13);
        w0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        w0Var.setClipToPadding(false);
        w0Var.setHideIfEmpty(false);
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(this.J, e6Var));
        getContext();
        g00 g00Var = new g00(AndroidUtilities.dp(8.0f), 0, w0Var);
        this.R = g00Var;
        g00Var.P = false;
        w0Var.setLayoutManager(g00Var);
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        w0Var.setOnScrollListener(new nh0(this, 7));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f31413n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.x5.e(-1, 58, 51));
        I(0.0f);
        w0Var.setEmptyView(by0Var);
        w0Var.W1 = true;
        w0Var.X1 = 0;
    }

    public static int o(u71 u71Var) {
        return u71Var.backgroundPaddingTop;
    }

    public s71 E(Context context) {
        return new s71(this, context);
    }

    public abstract void F(MotionEvent motionEvent, ci.g2 g2Var);

    public final void G(boolean z10) {
        Integer num;
        float f7;
        View view = this.f31413n;
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
            AnimatorSet animatorSet = this.f31414r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31414r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f31414r.setDuration(150L);
            this.f31414r.addListener(new fa(24, this, z10));
            this.f31414r.start();
        }
    }

    public abstract void H(String str);

    public final void I(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.i6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        ai.w0 w0Var = this.d;
        w0Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, this.O, false), org.telegram.ui.ActionBar.i6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, this.Q, false), org.telegram.ui.ActionBar.i6.x0(null, this.P, false), f7, 1.0f);
        int childCount = w0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = w0Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (this.f31413n.getTag() != null) {
                    i10 = this.P;
                } else {
                    i10 = this.Q;
                }
                e4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        w0Var.invalidate();
        this.container.invalidate();
    }

    public void J(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f31410c.setTranslationY(f7);
        this.f31415s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void K(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new yt0(this, i10, 1));
    }

    public void M() {
        int i10;
        int i11;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            s4.d1 K = w0Var.K(0);
            if (K != null) {
                i10 = K.f47702a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f31418y != i10) {
                this.f31418y = i10;
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
        AndroidUtilities.hideKeyboard(this.f31416w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f31409b == null) {
            TextView textView = new TextView(getContext());
            this.f31409b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, this.resourcesProvider));
            this.f31409b.setTextSize(1, 20.0f);
            this.f31409b.setTypeface(AndroidUtilities.bold());
            this.f31409b.setLines(1);
            this.f31409b.setMaxLines(1);
            this.f31409b.setSingleLine(true);
            TextView textView2 = this.f31409b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f31409b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f31409b;
            FrameLayout.LayoutParams a2 = w7.x5.a(36.0f, 16.0f, 0.0f, 0.0f, 0.0f, -1, 51);
            FrameLayout frameLayout = this.f31410c;
            frameLayout.addView(textView3, a2);
            ((FrameLayout.LayoutParams) this.f31416w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f31409b.setText(charSequence);
    }

    public void L() {
    }
}
