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
public abstract class o61 extends org.telegram.ui.ActionBar.f3 {
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
    public TextView f28975b;
    public final FrameLayout f28976c;
    public final bi.o0 d;
    public kl0 f28977e;
    public kl0 f28978f;
    public final Drawable h;
    public final View f28979n;
    public AnimatorSet f28980r;
    public final xw0 f28981s;
    public final t00 v;
    public final n61 f28982w;
    public final RectF f28983x;
    public int f28984y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public o61(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f28983x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.j6.Ii;
        this.J = org.telegram.ui.ActionBar.j6.f20753i6;
        int i11 = org.telegram.ui.ActionBar.j6.f20600a;
        int i12 = org.telegram.ui.ActionBar.j6.f20663d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.j6.G6;
        int i13 = org.telegram.ui.ActionBar.j6.f21042y6;
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
        m61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28976c = frameLayout;
        n61 n61Var = new n61(this, context, f6Var);
        this.f28982w = n61Var;
        n61Var.f24525x = true;
        n61Var.d();
        n61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(n61Var, w7.x5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        t00 t00Var = new t00(context, null);
        this.v = t00Var;
        t00Var.setViewType(6);
        t00Var.f30465w = false;
        t00Var.setUseHeaderOffset(true);
        xw0 xw0Var = new xw0(context, t00Var, 1, null);
        this.f28981s = xw0Var;
        xw0Var.addView(t00Var, 0, w7.x5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        wh.p pVar = xw0Var.d;
        pVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        d90 d90Var = xw0Var.f32755e;
        d90Var.setText(string2);
        xw0Var.setVisibility(8);
        xw0Var.setAnimateLayoutChange(true);
        xw0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        pVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f6 f6Var2 = xw0Var.f32757n;
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        d90Var.setTag(Integer.valueOf(i17));
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var2));
        xw0Var.G = i18;
        this.containerView.addView(xw0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.o0 o0Var = new bi.o0(this, context, f6Var, 24);
        this.d = o0Var;
        o0Var.setOverScrollMode(2);
        o0Var.setTag(13);
        o0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        o0Var.setClipToPadding(false);
        o0Var.setHideIfEmpty(false);
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.J, f6Var));
        getContext();
        pz pzVar = new pz(AndroidUtilities.dp(8.0f), 0, o0Var);
        this.R = pzVar;
        pzVar.P = false;
        o0Var.setLayoutManager(pzVar);
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(o0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        o0Var.setOnScrollListener(new lb0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f28979n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.x5.e(-1, 58, 51));
        H(0.0f);
        o0Var.setEmptyView(xw0Var);
        o0Var.Y1 = true;
        o0Var.Z1 = 0;
    }

    public static int m(o61 o61Var) {
        return o61Var.backgroundPaddingTop;
    }

    public m61 C(Context context) {
        return new m61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, di.h2 h2Var);

    public final void F(boolean z10) {
        Integer num;
        float f7;
        View view = this.f28979n;
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
            AnimatorSet animatorSet = this.f28980r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28980r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f28980r.setDuration(150L);
            this.f28980r.addListener(new org.telegram.ui.to(25, this, z10));
            this.f28980r.start();
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
        bi.o0 o0Var = this.d;
        o0Var.setGlowColor(i11);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.O, false), org.telegram.ui.ActionBar.j6.w0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false), org.telegram.ui.ActionBar.j6.w0(null, this.P, false), f7, 1.0f);
        int childCount = o0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = o0Var.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (this.f28979n.getTag() != null) {
                    i10 = this.P;
                } else {
                    i10 = this.Q;
                }
                d4Var.f(i10, offsetColor2);
            }
        }
        this.containerView.invalidate();
        o0Var.invalidate();
        this.container.invalidate();
    }

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.f28976c.setTranslationY(f7);
        this.f28981s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new ts0(this, i10, 1));
    }

    public void L() {
        int i10;
        int i11;
        bi.o0 o0Var = this.d;
        if (o0Var.getChildCount() > 0) {
            s4.c1 K = o0Var.K(0);
            if (K != null) {
                i10 = K.f45738a.getTop() - AndroidUtilities.dp(8.0f);
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
            if (this.f28984y != i10) {
                this.f28984y = i10;
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
        AndroidUtilities.hideKeyboard(this.f28982w.J);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i10;
        if (this.f28975b == null) {
            TextView textView = new TextView(getContext());
            this.f28975b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, this.resourcesProvider));
            this.f28975b.setTextSize(1, 20.0f);
            this.f28975b.setTypeface(AndroidUtilities.bold());
            this.f28975b.setLines(1);
            this.f28975b.setMaxLines(1);
            this.f28975b.setSingleLine(true);
            TextView textView2 = this.f28975b;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView2.setGravity(i10 | 16);
            this.f28975b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f28975b;
            FrameLayout.LayoutParams d = w7.x5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f28976c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f28982w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f28975b.setText(charSequence);
    }

    public void K() {
    }
}
