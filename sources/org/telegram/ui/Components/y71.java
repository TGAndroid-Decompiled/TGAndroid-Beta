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
public abstract class y71 extends org.telegram.ui.ActionBar.e3 {
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
    public final i00 R;
    public final boolean S;
    public TextView f32962b;
    public final FrameLayout f32963c;
    public final ai.w0 d;
    public vm0 f32964e;
    public vm0 f32965f;
    public final Drawable h;
    public final View f32966n;
    public AnimatorSet f32967r;
    public final gy0 f32968s;
    public final m10 v;
    public final x71 f32969w;
    public final RectF f32970x;
    public int f32971y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public y71(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.f32970x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.h6.Ii;
        this.J = org.telegram.ui.ActionBar.h6.f20651i6;
        int i11 = org.telegram.ui.ActionBar.h6.f20497a;
        int i12 = org.telegram.ui.ActionBar.h6.f20560d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.h6.G6;
        int i13 = org.telegram.ui.ActionBar.h6.f20946y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.h6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = c6Var;
        L();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        w71 E = E(context);
        this.containerView = E;
        E.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32963c = frameLayout;
        x71 x71Var = new x71(this, context, c6Var);
        this.f32969w = x71Var;
        x71Var.f31365x = true;
        x71Var.e();
        x71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(x71Var, w7.w5.a(48.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 51));
        m10 m10Var = new m10(context, null);
        this.v = m10Var;
        m10Var.setViewType(6);
        m10Var.f28350w = false;
        m10Var.setUseHeaderOffset(true);
        gy0 gy0Var = new gy0(context, m10Var, 1, null);
        this.f32968s = gy0Var;
        gy0Var.addView(m10Var, 0, w7.w5.a(-1.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1, 0));
        String string = LocaleController.getString(R.string.NoResult);
        vh.n nVar = gy0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        ia0 ia0Var = gy0Var.f26561e;
        ia0Var.setText(string2);
        gy0Var.setVisibility(8);
        gy0Var.setAnimateLayoutChange(true);
        gy0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.c6 c6Var2 = gy0Var.f26563n;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, c6Var2));
        ia0Var.setTag(Integer.valueOf(i17));
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i17, c6Var2));
        gy0Var.G = i18;
        this.containerView.addView(gy0Var, w7.w5.a(-1.0f, 0.0f, 62.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, c6Var, 24);
        this.d = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setTag(13);
        w0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        w0Var.setClipToPadding(false);
        w0Var.setHideIfEmpty(false);
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(this.J, c6Var));
        getContext();
        i00 i00Var = new i00(AndroidUtilities.dp(8.0f), 0, w0Var);
        this.R = i00Var;
        i00Var.P = false;
        w0Var.setLayoutManager(i00Var);
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w0Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        w0Var.setOnScrollListener(new qh0(this, 7));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f32966n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.w5.e(-1, 58, 51));
        I(0.0f);
        w0Var.setEmptyView(gy0Var);
        w0Var.W1 = true;
        w0Var.X1 = 0;
    }

    public static int o(y71 y71Var) {
        return y71Var.backgroundPaddingTop;
    }

    public w71 E(Context context) {
        return new w71(this, context);
    }

    public abstract void F(MotionEvent motionEvent, ci.g2 g2Var);

    public final void G(boolean z10) {
        Integer num;
        float f7;
        View view = this.f32966n;
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
            AnimatorSet animatorSet = this.f32967r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32967r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f32967r.setDuration(150L);
            this.f32967r.addListener(new ea(24, this, z10));
            this.f32967r.start();
        }
    }

    public abstract void H(String str);

    public final void I(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.h6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        ai.w0 w0Var = this.d;
        w0Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, this.O, false), org.telegram.ui.ActionBar.h6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, this.Q, false), org.telegram.ui.ActionBar.h6.x0(null, this.P, false), f7, 1.0f);
        int childCount = w0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = w0Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (this.f32966n.getTag() != null) {
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
        this.f32963c.setTranslationY(f7);
        this.f32968s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void K(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new du0(this, i10, 1));
    }

    public void M() {
        int i10;
        int i11;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            s4.d1 K = w0Var.K(0);
            if (K != null) {
                i10 = K.f47897a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f32971y != i10) {
                this.f32971y = i10;
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
        AndroidUtilities.hideKeyboard(this.f32969w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f32962b == null) {
            TextView textView = new TextView(getContext());
            this.f32962b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, this.resourcesProvider));
            this.f32962b.setTextSize(1, 20.0f);
            this.f32962b.setTypeface(AndroidUtilities.bold());
            this.f32962b.setLines(1);
            this.f32962b.setMaxLines(1);
            this.f32962b.setSingleLine(true);
            TextView textView2 = this.f32962b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f32962b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f32962b;
            FrameLayout.LayoutParams a2 = w7.w5.a(36.0f, 16.0f, 0.0f, 0.0f, 0.0f, -1, 51);
            FrameLayout frameLayout = this.f32963c;
            frameLayout.addView(textView3, a2);
            ((FrameLayout.LayoutParams) this.f32969w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f32962b.setText(charSequence);
    }

    public void L() {
    }
}
