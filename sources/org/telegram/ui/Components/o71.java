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
public abstract class o71 extends org.telegram.ui.ActionBar.f3 {
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
    public final sz R;
    public final boolean S;
    public TextView f29388b;
    public final FrameLayout f29389c;
    public final ai.w0 d;
    public yl0 f29390e;
    public yl0 f29391f;
    public final Drawable h;
    public final View f29392n;
    public AnimatorSet f29393r;
    public final ux0 f29394s;
    public final w00 v;
    public final n71 f29395w;
    public final RectF f29396x;
    public int f29397y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public o71(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.f29396x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.i6.Ii;
        this.J = org.telegram.ui.ActionBar.i6.f20918i6;
        int i11 = org.telegram.ui.ActionBar.i6.f20764a;
        int i12 = org.telegram.ui.ActionBar.i6.f20827d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.i6.G6;
        int i13 = org.telegram.ui.ActionBar.i6.f21214y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.i6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = d6Var;
        I();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        m71 B = B(context);
        this.containerView = B;
        B.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29389c = frameLayout;
        n71 n71Var = new n71(this, context, d6Var);
        this.f29395w = n71Var;
        n71Var.f26298x = true;
        n71Var.e();
        n71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(n71Var, w7.z5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        w00 w00Var = new w00(context, null);
        this.v = w00Var;
        w00Var.setViewType(6);
        w00Var.f32460w = false;
        w00Var.setUseHeaderOffset(true);
        ux0 ux0Var = new ux0(context, w00Var, 1, null);
        this.f29394s = ux0Var;
        ux0Var.addView(w00Var, 0, w7.z5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        vh.n nVar = ux0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        q90 q90Var = ux0Var.f31551e;
        q90Var.setText(string2);
        ux0Var.setVisibility(8);
        ux0Var.setAnimateLayoutChange(true);
        ux0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.d6 d6Var2 = ux0Var.f31553n;
        nVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, d6Var2));
        q90Var.setTag(Integer.valueOf(i17));
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i17, d6Var2));
        ux0Var.G = i18;
        this.containerView.addView(ux0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 24);
        this.d = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setTag(13);
        w0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        w0Var.setClipToPadding(false);
        w0Var.setHideIfEmpty(false);
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(this.J, d6Var));
        getContext();
        sz szVar = new sz(AndroidUtilities.dp(8.0f), 0, w0Var);
        this.R = szVar;
        szVar.P = false;
        w0Var.setLayoutManager(szVar);
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        w0Var.setOnScrollListener(new xb0(this, 9));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f29392n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, 58, 51));
        F(0.0f);
        w0Var.setEmptyView(ux0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
    }

    public static int m(o71 o71Var) {
        return o71Var.backgroundPaddingTop;
    }

    public m71 B(Context context) {
        return new m71(this, context);
    }

    public abstract void C(MotionEvent motionEvent, ci.h2 h2Var);

    public final void D(boolean z10) {
        Integer num;
        float f7;
        View view = this.f29392n;
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
            AnimatorSet animatorSet = this.f29393r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29393r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f29393r.setDuration(150L);
            this.f29393r.addListener(new da(24, this, z10));
            this.f29393r.start();
        }
    }

    public abstract void E(String str);

    public final void F(float f7) {
        int i10;
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.v0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i11 = this.F;
        this.navBarColor = i11;
        ai.w0 w0Var = this.d;
        w0Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, this.O, false), org.telegram.ui.ActionBar.i6.w0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, this.Q, false), org.telegram.ui.ActionBar.i6.w0(null, this.P, false), f7, 1.0f);
        int childCount = w0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = w0Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (this.f29392n.getTag() != null) {
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

    public void G(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f29389c.setTranslationY(f7);
        this.f29394s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void H(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new mt0(this, i10, 1));
    }

    public void J() {
        int i10;
        int i11;
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() > 0) {
            s4.c1 K = w0Var.K(0);
            if (K != null) {
                i10 = K.f46538a.getTop() - AndroidUtilities.dp(8.0f);
            } else {
                i10 = 0;
            }
            if (i10 > 0 && K != null && K.b() == 0) {
                i11 = i10;
            } else {
                i11 = 0;
            }
            if (i10 >= 0 && K != null && K.b() == 0) {
                D(false);
            } else {
                D(true);
                i10 = i11;
            }
            if (this.f29397y != i10) {
                this.f29397y = i10;
                G(i10);
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.f29395w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f29388b == null) {
            TextView textView = new TextView(getContext());
            this.f29388b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20935j5, this.resourcesProvider));
            this.f29388b.setTextSize(1, 20.0f);
            this.f29388b.setTypeface(AndroidUtilities.bold());
            this.f29388b.setLines(1);
            this.f29388b.setMaxLines(1);
            this.f29388b.setSingleLine(true);
            TextView textView2 = this.f29388b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f29388b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f29388b;
            FrameLayout.LayoutParams d = w7.z5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f29389c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f29395w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f29388b.setText(charSequence);
    }

    public void I() {
    }
}
