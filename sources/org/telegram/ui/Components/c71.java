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
public abstract class c71 extends org.telegram.ui.ActionBar.f3 {
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
    public final pz R;
    public final boolean S;
    public TextView f23184b;
    public final FrameLayout f23185c;
    public final ai.w0 d;
    public ul0 e;
    public ul0 f23186f;
    public final Drawable h;
    public final View f23187n;
    public AnimatorSet f23188r;
    public final jx0 f23189s;
    public final t00 v;
    public final b71 f23190w;
    public final RectF f23191x;
    public int f23192y;

    static {
        new org.telegram.ui.Cells.u8("colorProgress", 10);
    }

    public c71(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f23191x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.j6.Ii;
        this.J = org.telegram.ui.ActionBar.j6.f19184i6;
        int i11 = org.telegram.ui.ActionBar.j6.f19031a;
        int i12 = org.telegram.ui.ActionBar.j6.f19094d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.j6.G6;
        int i13 = org.telegram.ui.ActionBar.j6.f19477y6;
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
        a71 B = B(context);
        this.containerView = B;
        B.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23185c = frameLayout;
        b71 b71Var = new b71(this, context, f6Var);
        this.f23190w = b71Var;
        b71Var.f22859x = true;
        b71Var.e();
        b71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(b71Var, w7.y5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        t00 t00Var = new t00(context, null);
        this.v = t00Var;
        t00Var.setViewType(6);
        t00Var.f28252w = false;
        t00Var.setUseHeaderOffset(true);
        jx0 jx0Var = new jx0(context, t00Var, 1, null);
        this.f23189s = jx0Var;
        jx0Var.addView(t00Var, 0, w7.y5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        vh.o oVar = jx0Var.d;
        oVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        k90 k90Var = jx0Var.e;
        k90Var.setText(string2);
        jx0Var.setVisibility(8);
        jx0Var.setAnimateLayoutChange(true);
        jx0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        oVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f6 f6Var2 = jx0Var.f25552n;
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        k90Var.setTag(Integer.valueOf(i17));
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var2));
        jx0Var.G = i18;
        this.containerView.addView(jx0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, f6Var, 24);
        this.d = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setTag(13);
        w0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        w0Var.setClipToPadding(false);
        w0Var.setHideIfEmpty(false);
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.J, f6Var));
        getContext();
        pz pzVar = new pz(AndroidUtilities.dp(8.0f), 0, w0Var);
        this.R = pzVar;
        pzVar.P = false;
        w0Var.setLayoutManager(pzVar);
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        w0Var.setOnScrollListener(new sb0(this, 9));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f23187n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.y5.e(-1, 58, 51));
        H(0.0f);
        w0Var.setEmptyView(jx0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
    }

    public static int m(c71 c71Var) {
        return c71Var.backgroundPaddingTop;
    }

    public a71 B(Context context) {
        return new a71(this, context);
    }

    public abstract void E(MotionEvent motionEvent, ci.h2 h2Var);

    public final void F(boolean z10) {
        Integer num;
        float f7;
        View view = this.f23187n;
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
            AnimatorSet animatorSet = this.f23188r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23188r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f23188r.setDuration(150L);
            this.f23188r.addListener(new ba(24, this, z10));
            this.f23188r.start();
        }
    }

    public abstract void G(String str);

    public final void H(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        ai.w0 w0Var = this.d;
        w0Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.O, false), org.telegram.ui.ActionBar.j6.w0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false), org.telegram.ui.ActionBar.j6.w0(null, this.P, false), f7, 1.0f);
        int childCount = w0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = w0Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.y3) {
                ((org.telegram.ui.Cells.y3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                if (this.f23187n.getTag() != null) {
                    i10 = this.P;
                } else {
                    i10 = this.Q;
                }
                f4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        w0Var.invalidate();
        this.container.invalidate();
    }

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f23185c.setTranslationY(f7);
        this.f23189s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new ft0(this, i10, 1));
    }

    public void L() {
        int i10;
        int i11;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            s4.c1 L = w0Var.L(0);
            if (L != null) {
                i10 = L.f42974a.getTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (i10 > 0 && L != null && L.b() == 0) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            if (i10 >= 0 && L != null && L.b() == 0) {
                F(false);
            } else {
                F(true);
                i10 = i11;
            }
            if (this.f23192y != i10) {
                this.f23192y = i10;
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
        AndroidUtilities.hideKeyboard(this.f23190w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f23184b == null) {
            TextView textView = new TextView(getContext());
            this.f23184b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19201j5, this.resourcesProvider));
            this.f23184b.setTextSize(1, 20.0f);
            this.f23184b.setTypeface(AndroidUtilities.bold());
            this.f23184b.setLines(1);
            this.f23184b.setMaxLines(1);
            this.f23184b.setSingleLine(true);
            TextView textView2 = this.f23184b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f23184b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f23184b;
            FrameLayout.LayoutParams d = w7.y5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f23185c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f23190w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f23184b.setText(charSequence);
    }

    public void K() {
    }
}
