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
public abstract class s51 extends org.telegram.ui.ActionBar.f3 {
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
    public final bz N;
    public final boolean O;
    public TextView f32369b;
    public final FrameLayout f32370c;
    public final gh.f1 d;
    public vk0 f32371e;
    public vk0 f32372f;
    public final Drawable h;
    public final View f32373n;
    public AnimatorSet f32374r;
    public final gw0 f32375s;
    public final e00 v;
    public final r51 f32376w;
    public final RectF f32377x;
    public int f32378y;

    static {
        new ch.g("colorProgress", 12);
    }

    public s51(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        this.f32377x = new RectF();
        this.C = true;
        this.D = true;
        this.E = org.telegram.ui.ActionBar.f6.Ii;
        this.F = org.telegram.ui.ActionBar.f6.f23092i6;
        int i10 = org.telegram.ui.ActionBar.f6.f22941a;
        int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
        this.G = i11;
        this.H = i11;
        this.I = org.telegram.ui.ActionBar.f6.G6;
        int i12 = org.telegram.ui.ActionBar.f6.f23369y6;
        this.J = i12;
        this.K = i12;
        int i13 = org.telegram.ui.ActionBar.f6.Q5;
        this.L = i13;
        this.M = i13;
        this.O = true;
        this.resourcesProvider = b6Var;
        J();
        setDimBehindAlpha(75);
        this.currentAccount = i9;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        q51 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32370c = frameLayout;
        r51 r51Var = new r51(this, context, b6Var);
        this.f32376w = r51Var;
        r51Var.f30667x = true;
        r51Var.d();
        r51Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(r51Var, g7.e6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        e00 e00Var = new e00(context, null);
        this.v = e00Var;
        e00Var.setViewType(6);
        e00Var.f27885w = false;
        e00Var.setUseHeaderOffset(true);
        gw0 gw0Var = new gw0(context, e00Var, 1, null);
        this.f32375s = gw0Var;
        gw0Var.addView(e00Var, 0, g7.e6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        dh.u uVar = gw0Var.d;
        uVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        l80 l80Var = gw0Var.f28885e;
        l80Var.setText(string2);
        gw0Var.setVisibility(8);
        gw0Var.setAnimateLayoutChange(true);
        gw0Var.e(true, false);
        int i15 = this.I;
        int i16 = this.J;
        int i17 = this.G;
        uVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.b6 b6Var2 = gw0Var.f28887n;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var2));
        l80Var.setTag(Integer.valueOf(i16));
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i16, b6Var2));
        gw0Var.C = i17;
        this.containerView.addView(gw0Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 24);
        this.d = f1Var;
        f1Var.setOverScrollMode(2);
        f1Var.setTag(13);
        f1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        f1Var.setClipToPadding(false);
        f1Var.setHideIfEmpty(false);
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(this.F, b6Var));
        getContext();
        bz bzVar = new bz(AndroidUtilities.dp(8.0f), 0, f1Var);
        this.N = bzVar;
        bzVar.P = false;
        f1Var.setLayoutManager(bzVar);
        f1Var.setHorizontalScrollBarEnabled(false);
        f1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(f1Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f1Var.setOnScrollListener(new kn(this, 14));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.f32373n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, g7.e6.e(-1, 58, 51));
        G(0.0f);
        f1Var.setEmptyView(gw0Var);
        f1Var.U1 = true;
        f1Var.V1 = 0;
    }

    public static int m(s51 s51Var) {
        return s51Var.backgroundPaddingTop;
    }

    public q51 C(Context context) {
        return new q51(this, context);
    }

    public abstract void D(MotionEvent motionEvent, fg.g gVar);

    public final void E(boolean z10) {
        Integer num;
        float f10;
        View view = this.f32373n;
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
            AnimatorSet animatorSet = this.f32374r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32374r = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f32374r.setDuration(150L);
            this.f32374r.addListener(new u9(24, this, z10));
            this.f32374r.start();
        }
    }

    public abstract void F(String str);

    public final void G(float f10) {
        int i9;
        this.A = f10;
        this.B = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(this.G, this.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(this.H, this.resourcesProvider), f10, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.B, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.B);
        int i10 = this.B;
        this.navBarColor = i10;
        gh.f1 f1Var = this.d;
        f1Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, this.K, false), org.telegram.ui.ActionBar.f6.w0(null, this.J, false), f10, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, this.M, false), org.telegram.ui.ActionBar.f6.w0(null, this.L, false), f10, 1.0f);
        int childCount = f1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = f1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (this.f32373n.getTag() != null) {
                    i9 = this.L;
                } else {
                    i9 = this.M;
                }
                e4Var.f(i9, offsetColor2);
            }
        }
        this.containerView.invalidate();
        f1Var.invalidate();
        this.container.invalidate();
    }

    public void H(int i9) {
        this.d.setTopGlowOffset(i9);
        float f10 = i9;
        this.f32370c.setTranslationY(f10);
        this.f32375s.setTranslationY(f10);
        this.containerView.invalidate();
    }

    public final void I(int i9) {
        if (!isShowing()) {
            return;
        }
        this.d.getViewTreeObserver().addOnPreDrawListener(new as0(this, i9, 1));
    }

    public void K() {
        int i9;
        int i10;
        gh.f1 f1Var = this.d;
        if (f1Var.getChildCount() > 0) {
            f2.q1 K = f1Var.K(0);
            if (K != null) {
                i9 = K.f5501a.getTop() - AndroidUtilities.dp(8.0f);
            } else {
                i9 = 0;
            }
            if (i9 > 0 && K != null && K.b() == 0) {
                i10 = i9;
            } else {
                i10 = 0;
            }
            if (i9 >= 0 && K != null && K.b() == 0) {
                E(false);
            } else {
                E(true);
                i9 = i10;
            }
            if (this.f32378y != i9) {
                this.f32378y = i9;
                H(i9);
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.f32376w.F);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i9;
        if (this.f32369b == null) {
            TextView textView = new TextView(getContext());
            this.f32369b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, this.resourcesProvider));
            this.f32369b.setTextSize(1, 20.0f);
            this.f32369b.setTypeface(AndroidUtilities.bold());
            this.f32369b.setLines(1);
            this.f32369b.setMaxLines(1);
            this.f32369b.setSingleLine(true);
            TextView textView2 = this.f32369b;
            if (LocaleController.isRTL) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            textView2.setGravity(i9 | 16);
            this.f32369b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.f32369b;
            FrameLayout.LayoutParams d = g7.e6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.f32370c;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.f32376w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.f32369b.setText(charSequence);
    }

    public void J() {
    }
}
