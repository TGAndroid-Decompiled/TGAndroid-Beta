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
public abstract class n61 extends org.telegram.ui.ActionBar.f3 {
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
    public final qz R;
    public final boolean S;
    public TextView f26354b;
    public final FrameLayout f26355c;
    public final ai.w0 d;
    public ll0 e;
    public ll0 f26356f;
    public final Drawable h;
    public final View f26357n;
    public AnimatorSet f26358r;
    public final xw0 f26359s;
    public final u00 v;
    public final m61 f26360w;
    public final RectF f26361x;
    public int f26362y;

    static {
        new org.telegram.ui.Cells.u8("colorProgress", 10);
    }

    public n61(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.f26361x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.h6.Ii;
        this.J = org.telegram.ui.ActionBar.h6.f18878i6;
        int i11 = org.telegram.ui.ActionBar.h6.f18726a;
        int i12 = org.telegram.ui.ActionBar.h6.f18789d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.h6.G6;
        int i13 = org.telegram.ui.ActionBar.h6.f19170y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.h6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = d6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        l61 B = B(context);
        this.containerView = B;
        B.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26355c = frameLayout;
        m61 m61Var = new m61(this, context, d6Var);
        this.f26360w = m61Var;
        m61Var.f22893x = true;
        m61Var.e();
        m61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(m61Var, w7.x5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        u00 u00Var = new u00(context, null);
        this.v = u00Var;
        u00Var.setViewType(6);
        u00Var.f28353w = false;
        u00Var.setUseHeaderOffset(true);
        xw0 xw0Var = new xw0(context, u00Var, 1, null);
        this.f26359s = xw0Var;
        xw0Var.addView(u00Var, 0, w7.x5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        vh.o oVar = xw0Var.d;
        oVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        d90 d90Var = xw0Var.e;
        d90Var.setText(string2);
        xw0Var.setVisibility(8);
        xw0Var.setAnimateLayoutChange(true);
        xw0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        oVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.d6 d6Var2 = xw0Var.f30081n;
        oVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i16, d6Var2));
        d90Var.setTag(Integer.valueOf(i17));
        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i17, d6Var2));
        xw0Var.G = i18;
        this.containerView.addView(xw0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 24);
        this.d = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setTag(13);
        w0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        w0Var.setClipToPadding(false);
        w0Var.setHideIfEmpty(false);
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(this.J, d6Var));
        getContext();
        qz qzVar = new qz(AndroidUtilities.dp(8.0f), 0, w0Var);
        this.R = qzVar;
        qzVar.P = false;
        w0Var.setLayoutManager(qzVar);
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        w0Var.setOnScrollListener(new kg0(this, 7));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f26357n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.x5.e(-1, 58, 51));
        H(0.0f);
        w0Var.setEmptyView(xw0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
    }

    public static int m(n61 n61Var) {
        return n61Var.backgroundPaddingTop;
    }

    public l61 B(Context context) {
        return new l61(this, context);
    }

    public abstract void E(MotionEvent motionEvent, ci.h2 h2Var);

    public final void F(boolean z10) {
        Integer num;
        float f7;
        View view = this.f26357n;
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
            AnimatorSet animatorSet = this.f26358r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26358r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f26358r.setDuration(150L);
            this.f26358r.addListener(new ca(24, this, z10));
            this.f26358r.start();
        }
    }

    public abstract void G(String str);

    public final void H(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.v0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.h6.v0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        ai.w0 w0Var = this.d;
        w0Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, this.O, false), org.telegram.ui.ActionBar.h6.w0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, this.Q, false), org.telegram.ui.ActionBar.h6.w0(null, this.P, false), f7, 1.0f);
        int childCount = w0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = w0Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (this.f26357n.getTag() != null) {
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

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f26355c.setTranslationY(f7);
        this.f26359s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new us0(this, i10, 1));
    }

    public void L() {
        int i10;
        int i11;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            s4.c1 K = w0Var.K(0);
            if (K != null) {
                i10 = K.f42627a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f26362y != i10) {
                this.f26362y = i10;
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
        AndroidUtilities.hideKeyboard(this.f26360w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f26354b == null) {
            TextView textView = new TextView(getContext());
            this.f26354b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18895j5, this.resourcesProvider));
            this.f26354b.setTextSize(1, 20.0f);
            this.f26354b.setTypeface(AndroidUtilities.bold());
            this.f26354b.setLines(1);
            this.f26354b.setMaxLines(1);
            this.f26354b.setSingleLine(true);
            TextView textView2 = this.f26354b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f26354b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f26354b;
            FrameLayout.LayoutParams d = w7.x5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f26355c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f26360w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f26354b.setText(charSequence);
    }

    public void K() {
    }
}
