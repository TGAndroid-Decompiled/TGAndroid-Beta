package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b8.mf;
import gi.i8;
import org.telegram.messenger.bd;
import org.telegram.ui.s51;
public final class i4 {
    public final Rect A = new Rect();
    public final Point B = new Point();
    public final int[] C = new int[2];
    public final Region D = new Region();
    public final int E;
    public boolean F;
    public boolean G;
    public final Size H;
    public Size I;
    public Size J;
    public MenuItem.OnMenuItemClickListener K;
    public final androidx.mediarouter.app.w L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final k4 Q;
    public final Context f27608a;
    public final View f27609b;
    public final PopupWindow f27610c;
    public final int d;
    public final int f27611e;
    public final RelativeLayout f27612f;
    public final s51 f27613g;
    public final g4 h;
    public final FrameLayout f27614i;
    public final View f27615j;
    public final c4 f27616k;
    public final TextView f27617l;
    public final Drawable f27618m;
    public final Drawable f27619n;
    public final AnimatedVectorDrawable f27620o;
    public final AnimatedVectorDrawable f27621p;
    public final h4 f27622q;
    public final f4 f27623r;
    public final Interpolator f27624s;
    public final Interpolator f27625t;
    public final Interpolator f27626u;
    public final AnimatorSet v;
    public final AnimatorSet f27627w;
    public final AnimatorSet f27628x;
    public final AnimationSet f27629y;
    public final AnimationSet f27630z;

    public i4(k4 k4Var, Context context, View view) {
        float f10;
        int i3;
        int i10;
        RelativeLayout relativeLayout;
        int w02;
        int i11;
        this.Q = k4Var;
        new mi.b0(this, 16);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.f27609b = view;
        this.f27608a = context;
        e6 e6Var = k4Var.f27778n;
        int i12 = k4Var.f27773i;
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = org.telegram.messenger.g0.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout2.setLayoutParams(marginLayoutParams);
        relativeLayout2.setElevation(org.telegram.messenger.g0.L(1.0f));
        relativeLayout2.setFocusable(true);
        relativeLayout2.setFocusableInTouchMode(true);
        eh.c cVar = k4Var.f27779o;
        if (cVar != null) {
            gh.g c2 = cVar.c(relativeLayout2, null, true);
            hh.e eVar = new hh.e(e6Var);
            f10 = 1.0f;
            eVar.f14417e = new i8(13);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f14418f = N;
            eVar.h = N2;
            c2.p(eVar);
            c2.r(org.telegram.messenger.g0.L(12.0f));
            relativeLayout2.setBackground(c2);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i12 == 0) {
                i3 = k6.f27954h5;
            } else {
                if (i12 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i12 == 1) {
                    i3 = k6.f27878d6;
                }
                i3 = -1;
            }
            if (i3 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i3 >= 0) {
                r6.y(relativeLayout2, gradientDrawable, i3, e6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f27612f = relativeLayout2;
        gi.y4 y4Var = new gi.y4(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(y4Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        y4Var.addView(relativeLayout2);
        this.f27610c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.f27611e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.f27623r = new f4();
        this.f27624s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f27625t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f27626u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231212).mutate();
        this.f27618m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231210).mutate();
        this.f27619n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231211).mutate();
        this.f27620o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231213).mutate();
        this.f27621p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27614i = frameLayout;
        c4 c4Var = new c4(this, context);
        this.f27616k = c4Var;
        c4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        c4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        c4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f27617l = textView;
        textView.setText(bd.M0(2131753756, null));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f27615j = view2;
        if (i12 == 0) {
            int i13 = k6.f27988j5;
            w02 = k6.w0(i13, e6Var);
            relativeLayout = relativeLayout2;
            int i14 = k6.f27972i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i14, e6Var), 1, -1);
            n6 N3 = r6.N(i14);
            c4Var.setBackground(h02);
            r6.k(c4Var, h02, null, N3, e6Var);
            org.telegram.ui.Cells.y h03 = k6.h0(k6.w0(i14, e6Var), 2, -1);
            n6 N4 = r6.N(i14);
            frameLayout.setBackground(h03);
            r6.k(frameLayout, h03, null, N4, e6Var);
            r6.j(view2, r6.L(0.4f, i13), e6Var);
        } else {
            i10 = L3;
            relativeLayout = relativeLayout2;
            if (i12 == 2) {
                c4Var.setBackground(k6.h0(553648127, 1, -1));
                frameLayout.setBackground(k6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = k6.w0(k6.G6, e6Var);
                int i15 = k6.f27972i6;
                org.telegram.ui.Cells.y h04 = k6.h0(k6.w0(i15, e6Var), 1, -1);
                n6 N5 = r6.N(i15);
                c4Var.setBackground(h04);
                r6.k(c4Var, h04, null, N5, e6Var);
                org.telegram.ui.Cells.y h05 = k6.h0(k6.w0(i15, e6Var), 2, -1);
                n6 N6 = r6.N(i15);
                frameLayout.setBackground(h05);
                r6.k(frameLayout, h05, null, N6, e6Var);
                r6.i(k6.f27879d7, view2, e6Var);
            }
        }
        int i16 = w02;
        mutate2.setTint(i16);
        mutate.setTint(i16);
        animatedVectorDrawable.setTint(i16);
        animatedVectorDrawable2.setTint(i16);
        textView.setTextColor(i16);
        if (i12 != 2) {
            if (i12 == 0) {
                i11 = k6.f27988j5;
            } else {
                i11 = k6.G6;
            }
            r6.V(textView, i11, e6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            r6.y(c4Var, mutate2, i11, e6Var, mode);
            r6.y(c4Var, mutate, i11, e6Var, mode);
            r6.y(c4Var, animatedVectorDrawable, i11, e6Var, mode);
            r6.y(c4Var, animatedVectorDrawable2, i11, e6Var, mode);
        }
        c4Var.setOnClickListener(new x3(this, 2));
        frameLayout.addView(c4Var, mf.e(-2, -2, 19));
        frameLayout.addView(textView, mf.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, mf.a(-1.0f, f10 / org.telegram.messenger.g0.f22607p, 55));
        c4Var.measure(0, 0);
        this.H = new Size(c4Var.getMeasuredWidth(), c4Var.getMeasuredHeight());
        this.f27613g = new s51(10, context, this);
        ?? obj = new Object();
        obj.f27576e = this;
        obj.d = context;
        obj.f27573a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        obj.f27574b = L4;
        LinearLayout b10 = k4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        obj.f27575c = b10;
        this.f27622q = obj;
        final g4 g4Var = new g4(this);
        g4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        g4Var.setDivider(null);
        g4Var.setDividerHeight(0);
        b4 b4Var = new b4(this, context);
        g4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        g4Var.setClipToPadding(false);
        g4Var.setAdapter((ListAdapter) b4Var);
        g4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i17, long j10) {
                i4 i4Var = i4.this;
                i4Var.getClass();
                MenuItem menuItem = (MenuItem) g4Var.getAdapter().getItem(i17);
                k4 k4Var2 = i4Var.Q;
                if (k4Var2.f27774j != null && k4.f27766r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i18 = -i4Var.P;
                    i4Var.P = i18;
                    org.telegram.messenger.g0.G3(i18, view3, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    k4Var2.f27774j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = i4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = g4Var;
        androidx.mediarouter.app.g0 g0Var = new androidx.mediarouter.app.g0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.f27629y = animationSet;
        animationSet.setAnimationListener(g0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f27630z = animationSet2;
        animationSet2.setAnimationListener(g0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f27627w = k4.a(relativeLayout3, 150, new e4(this, 0));
        this.f27628x = k4.a(relativeLayout3, 0, new e4(this, 1));
    }

    public static void a(i4 i4Var) {
        FrameLayout frameLayout = i4Var.f27614i;
        RelativeLayout relativeLayout = i4Var.f27612f;
        if (i4Var.M) {
            i4Var.f27613g.setY(relativeLayout.getHeight() - i4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            i4Var.h.setY(relativeLayout.getHeight() - i4Var.I.getHeight());
        }
    }

    public static boolean b(i4 i4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = i4Var.f27630z;
        AnimationSet animationSet2 = i4Var.f27629y;
        if (animationSet2.hasStarted() && !animationSet2.hasEnded()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (animationSet.hasStarted() && !animationSet.hasEnded()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    public static void l(View view, int i3, int i10) {
        view.setMinimumWidth(i3);
        view.setMinimumHeight(i10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i3;
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int c(int i3) {
        int i10;
        int max = Math.max(2, i3);
        g4 g4Var = this.h;
        int min = Math.min(4, Math.min(max, g4Var.getCount()));
        int count = g4Var.getCount();
        int i11 = this.E;
        if (min < count) {
            i10 = (int) (i11 * 0.5f);
        } else {
            i10 = 0;
        }
        return this.H.getHeight() + (min * i11) + i10;
    }

    public final void d() {
        this.f27612f.clearAnimation();
        this.f27613g.animate().cancel();
        this.h.animate().cancel();
        this.f27620o.stop();
        this.f27621p.stop();
    }

    public final int e() {
        int i3 = this.O;
        if (i3 < 150) {
            return Math.max(200, 0);
        }
        if (i3 > 300) {
            return 300;
        }
        return 250;
    }

    public final boolean f() {
        if (!this.F && !this.G) {
            return true;
        }
        return false;
    }

    public final void g() {
        boolean z10 = this.N;
        Interpolator interpolator = this.f27625t;
        g4 g4Var = this.h;
        s51 s51Var = this.f27613g;
        f4 f4Var = this.f27623r;
        Interpolator interpolator2 = this.f27624s;
        FrameLayout frameLayout = this.f27614i;
        RelativeLayout relativeLayout = this.f27612f;
        c4 c4Var = this.f27616k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f27621p;
            c4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            z3 z3Var = new z3(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            z3 z3Var2 = new z3(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            a4 a4Var = new a4(this, x11, (width2 + x11) - c4Var.getWidth(), width2, 0);
            z3Var.setInterpolator(interpolator2);
            z3Var.setDuration(e());
            z3Var2.setInterpolator(f4Var);
            z3Var2.setDuration(e());
            a4Var.setInterpolator(interpolator2);
            a4Var.setDuration(e());
            AnimationSet animationSet = this.f27630z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(z3Var);
            animationSet.addAnimation(z3Var2);
            animationSet.addAnimation(a4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            s51Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f27626u).setDuration(100L).start();
            g4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f27620o;
        c4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y9 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        z3 z3Var3 = new z3(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        z3 z3Var4 = new z3(this, height, height2, y9, 2);
        float x13 = frameLayout.getX();
        a4 a4Var2 = new a4(this, x13, c4Var.getWidth() + (x13 - width3), width4, 1);
        z3Var3.setInterpolator(f4Var);
        z3Var3.setDuration(e());
        z3Var4.setInterpolator(interpolator2);
        z3Var4.setDuration(e());
        a4Var2.setInterpolator(interpolator2);
        a4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f27629y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(z3Var3);
        animationSet2.addAnimation(z3Var4);
        animationSet2.addAnimation(a4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        s51Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = g4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        g4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f27612f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f27613g);
        if (this.I != null) {
            relativeLayout.addView(this.f27614i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f27609b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f27610c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i3 = rect.top;
        int i10 = rect2.top;
        int i11 = i3 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.f27611e;
        int i16 = i15 * 2;
        int i17 = this.E;
        int i18 = i17 + i16;
        if (this.I != null) {
            int c2 = c(2) + i16;
            int i19 = (rect2.bottom - rect.top) + i18;
            int i20 = (rect.bottom - rect2.top) + i18;
            if (i11 >= c2) {
                o(i11 - i16);
                i13 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i11 >= i18 && i19 >= c2) {
                o(i19 - i16);
                i13 = rect.top - i18;
                this.M = false;
            } else if (i14 >= c2) {
                o(i14 - i16);
                i13 = rect.bottom;
                this.M = false;
            } else if (i14 >= i18 && rect2.height() >= c2) {
                o(i20 - i16);
                i13 = (rect.bottom + i18) - popupWindow.getHeight();
                this.M = true;
            } else {
                o(rect2.height() - i16);
                i13 = rect2.top;
                this.M = false;
            }
        } else if (i11 >= i18) {
            i13 = i3 - i18;
        } else if (i14 < i18) {
            if (i14 >= i17) {
                i13 -= i15;
            } else {
                i13 = Math.max(i10, i3 - i18);
            }
        }
        View rootView = view.getRootView();
        int[] iArr = this.C;
        rootView.getLocationOnScreen(iArr);
        int i21 = iArr[0];
        int i22 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.B.set(Math.max(0, min - (i21 - iArr[0])), Math.max(0, i13 - (i22 - iArr[1])));
    }

    public final void j() {
        int width;
        int height;
        if (this.N) {
            width = this.I.getWidth();
            height = this.I.getHeight();
        } else {
            width = this.J.getWidth();
            height = this.J.getHeight();
        }
        RelativeLayout relativeLayout = this.f27612f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y9 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y9);
    }

    public final void k() {
        FrameLayout frameLayout = this.f27614i;
        frameLayout.setEnabled(true);
        g4 g4Var = this.h;
        g4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f27610c;
        c4 c4Var = this.f27616k;
        int i3 = this.d;
        Size size = this.H;
        int i10 = this.f27611e;
        s51 s51Var = this.f27613g;
        RelativeLayout relativeLayout = this.f27612f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            s51Var.setAlpha(0.0f);
            s51Var.setVisibility(4);
            g4Var.setAlpha(1.0f);
            g4Var.setVisibility(0);
            c4Var.setImageDrawable(this.f27618m);
            frameLayout.setContentDescription(bd.M0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i3);
            s51Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            g4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                s51Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                g4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            s51Var.setY(0.0f);
            frameLayout.setY(0.0f);
            g4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        s51Var.setAlpha(1.0f);
        s51Var.setVisibility(0);
        g4Var.setAlpha(0.0f);
        g4Var.setVisibility(4);
        c4Var.setImageDrawable(this.f27619n);
        frameLayout.setContentDescription(bd.M0(2131754839, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i3);
            s51Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            g4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i10) - size3.getHeight());
                s51Var.setY(0.0f);
                frameLayout.setY(0.0f);
                g4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i10);
            s51Var.setY(0.0f);
            frameLayout.setY(0.0f);
            g4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i3);
        relativeLayout.setY(i10);
        s51Var.setX(0.0f);
        s51Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        c4 c4Var = this.f27616k;
        FrameLayout frameLayout = this.f27614i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new x3(this, 0));
            c4Var.setClickable(false);
            c4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        c4Var.setClickable(true);
        c4Var.setOnClickListener(new x3(this, 1));
    }

    public final void o(int i3) {
        if (this.I != null) {
            int c2 = c((i3 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c2) {
                this.I = new Size(this.I.getWidth(), c2);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f27612f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c2;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f27614i;
                    frameLayout.setY(frameLayout.getY() - height);
                }
            } else {
                m(relativeLayout, this.J);
            }
            p();
        }
    }

    public final void p() {
        int i3;
        Size size = this.J;
        int i10 = 0;
        if (size != null) {
            i10 = Math.max(0, size.getWidth());
            i3 = Math.max(0, this.J.getHeight());
        } else {
            i3 = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i10 = Math.max(i10, size2.getWidth());
            i3 = Math.max(i3, this.I.getHeight());
        }
        int i11 = (this.d * 2) + i10;
        PopupWindow popupWindow = this.f27610c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.f27611e * 2) + i3);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f27612f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
