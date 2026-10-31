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
import org.telegram.messenger.cd;
import org.telegram.ui.u71;
public final class q4 {
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
    public final s4 Q;
    public final Context f20681a;
    public final View f20682b;
    public final PopupWindow f20683c;
    public final int d;
    public final int e;
    public final RelativeLayout f20684f;
    public final u71 f20685g;
    public final o4 h;
    public final FrameLayout f20686i;
    public final View f20687j;
    public final l4 f20688k;
    public final TextView f20689l;
    public final Drawable f20690m;
    public final Drawable f20691n;
    public final AnimatedVectorDrawable f20692o;
    public final AnimatedVectorDrawable f20693p;
    public final p4 f20694q;
    public final n4 f20695r;
    public final Interpolator f20696s;
    public final Interpolator f20697t;
    public final Interpolator f20698u;
    public final AnimatorSet v;
    public final AnimatorSet f20699w;
    public final AnimatorSet f20700x;
    public final AnimationSet f20701y;
    public final AnimationSet f20702z;

    public q4(s4 s4Var, Context context, View view) {
        float f7;
        int i10;
        int i11;
        RelativeLayout relativeLayout;
        int w02;
        int i12;
        this.Q = s4Var;
        new mg.c2(this, 15);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.f20682b = view;
        this.f20681a = context;
        p6 p6Var = s4Var.f20785n;
        int i13 = s4Var.f20780i;
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = org.telegram.messenger.i0.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout2.setLayoutParams(marginLayoutParams);
        relativeLayout2.setElevation(org.telegram.messenger.i0.L(1.0f));
        relativeLayout2.setFocusable(true);
        relativeLayout2.setFocusableInTouchMode(true);
        tg.b bVar = s4Var.f20786o;
        if (bVar != null) {
            vg.f c10 = bVar.c(relativeLayout2, null, true);
            wg.d dVar = new wg.d(p6Var);
            f7 = 1.0f;
            dVar.e = new xg.a(4);
            dVar.f(687865855, 687865855);
            dVar.e(352321535, 352321535);
            float N = org.telegram.messenger.i0.N(0.6666667f);
            float N2 = org.telegram.messenger.i0.N(0.6666667f);
            dVar.f52848f = N;
            dVar.h = N2;
            c10.o(dVar);
            c10.q(org.telegram.messenger.i0.L(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f7 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = org.telegram.messenger.i0.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i13 == 0) {
                i10 = t6.f21001h5;
            } else {
                if (i13 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i13 == 1) {
                    i10 = t6.f20929d6;
                }
                i10 = -1;
            }
            if (i10 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i10 >= 0) {
                a7.y(relativeLayout2, gradientDrawable, i10, p6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f20684f = relativeLayout2;
        jg.d0 d0Var = new jg.d0(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(d0Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        d0Var.addView(relativeLayout2);
        this.f20683c = popupWindow;
        this.d = org.telegram.messenger.i0.L(16.0f);
        this.e = org.telegram.messenger.i0.L(8.0f);
        this.E = org.telegram.messenger.i0.L(48.0f);
        int L3 = org.telegram.messenger.i0.L(8.0f);
        this.f20695r = new n4();
        this.f20696s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f20697t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f20698u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231213).mutate();
        this.f20690m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231211).mutate();
        this.f20691n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231212).mutate();
        this.f20692o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231214).mutate();
        this.f20693p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20686i = frameLayout;
        l4 l4Var = new l4(this, context);
        this.f20688k = l4Var;
        l4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(48.0f)));
        l4Var.setPaddingRelative(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        l4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        l4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f20689l = textView;
        textView.setText(cd.L0(2131753756, null));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f20687j = view2;
        if (i13 == 0) {
            int i14 = t6.f21037j5;
            w02 = t6.w0(i14, p6Var);
            relativeLayout = relativeLayout2;
            int i15 = t6.f21020i6;
            i11 = L3;
            org.telegram.ui.Cells.y h02 = t6.h0(t6.w0(i15, p6Var), 1, -1);
            w6 N3 = a7.N(i15);
            l4Var.setBackground(h02);
            a7.k(l4Var, h02, null, N3, p6Var);
            org.telegram.ui.Cells.y h03 = t6.h0(t6.w0(i15, p6Var), 2, -1);
            w6 N4 = a7.N(i15);
            frameLayout.setBackground(h03);
            a7.k(frameLayout, h03, null, N4, p6Var);
            a7.j(view2, a7.L(0.4f, i14), p6Var);
        } else {
            i11 = L3;
            relativeLayout = relativeLayout2;
            if (i13 == 2) {
                l4Var.setBackground(t6.h0(553648127, 1, -1));
                frameLayout.setBackground(t6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = t6.w0(t6.G6, p6Var);
                int i16 = t6.f21020i6;
                org.telegram.ui.Cells.y h04 = t6.h0(t6.w0(i16, p6Var), 1, -1);
                w6 N5 = a7.N(i16);
                l4Var.setBackground(h04);
                a7.k(l4Var, h04, null, N5, p6Var);
                org.telegram.ui.Cells.y h05 = t6.h0(t6.w0(i16, p6Var), 2, -1);
                w6 N6 = a7.N(i16);
                frameLayout.setBackground(h05);
                a7.k(frameLayout, h05, null, N6, p6Var);
                a7.i(t6.f20930d7, view2, p6Var);
            }
        }
        int i17 = w02;
        mutate2.setTint(i17);
        mutate.setTint(i17);
        animatedVectorDrawable.setTint(i17);
        animatedVectorDrawable2.setTint(i17);
        textView.setTextColor(i17);
        if (i13 != 2) {
            if (i13 == 0) {
                i12 = t6.f21037j5;
            } else {
                i12 = t6.G6;
            }
            a7.V(textView, i12, p6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            a7.y(l4Var, mutate2, i12, p6Var, mode);
            a7.y(l4Var, mutate, i12, p6Var, mode);
            a7.y(l4Var, animatedVectorDrawable, i12, p6Var, mode);
            a7.y(l4Var, animatedVectorDrawable2, i12, p6Var, mode);
        }
        l4Var.setOnClickListener(new g4(this, 2));
        frameLayout.addView(l4Var, w7.b6.e(-2, -2, 19));
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, w7.b6.a(-1.0f, f7 / org.telegram.messenger.i0.f16025p, 55));
        l4Var.measure(0, 0);
        this.H = new Size(l4Var.getMeasuredWidth(), l4Var.getMeasuredHeight());
        this.f20685g = new u71(this, context, 5);
        ?? obj = new Object();
        obj.e = this;
        obj.d = context;
        obj.f20651a = i11;
        int L4 = org.telegram.messenger.i0.L(18.0f);
        obj.f20652b = L4;
        LinearLayout b10 = s4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        obj.f20653c = b10;
        this.f20694q = obj;
        final o4 o4Var = new o4(this);
        o4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        o4Var.setDivider(null);
        o4Var.setDividerHeight(0);
        k4 k4Var = new k4(this, context);
        o4Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(2.0f));
        o4Var.setClipToPadding(false);
        o4Var.setAdapter((ListAdapter) k4Var);
        o4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i18, long j10) {
                q4 q4Var = q4.this;
                q4Var.getClass();
                MenuItem menuItem = (MenuItem) o4Var.getAdapter().getItem(i18);
                s4 s4Var2 = q4Var.Q;
                if (s4Var2.f20781j != null && s4.f20774r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i19 = -q4Var.P;
                    q4Var.P = i19;
                    org.telegram.messenger.i0.F3(i19, view3, null);
                    org.telegram.messenger.t2.APP_ERROR.a();
                    s4Var2.f20781j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = q4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = o4Var;
        androidx.mediarouter.app.g0 g0Var = new androidx.mediarouter.app.g0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.f20701y = animationSet;
        animationSet.setAnimationListener(g0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f20702z = animationSet2;
        animationSet2.setAnimationListener(g0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f20699w = s4.a(relativeLayout3, 150, new m4(this, 0));
        this.f20700x = s4.a(relativeLayout3, 0, new m4(this, 1));
    }

    public static void a(q4 q4Var) {
        FrameLayout frameLayout = q4Var.f20686i;
        RelativeLayout relativeLayout = q4Var.f20684f;
        if (q4Var.M) {
            q4Var.f20685g.setY(relativeLayout.getHeight() - q4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            q4Var.h.setY(relativeLayout.getHeight() - q4Var.I.getHeight());
        }
    }

    public static boolean b(q4 q4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = q4Var.f20702z;
        AnimationSet animationSet2 = q4Var.f20701y;
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

    public static void l(View view, int i10, int i11) {
        view.setMinimumWidth(i10);
        view.setMinimumHeight(i11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int c(int i10) {
        int i11;
        int max = Math.max(2, i10);
        o4 o4Var = this.h;
        int min = Math.min(4, Math.min(max, o4Var.getCount()));
        int count = o4Var.getCount();
        int i12 = this.E;
        if (min < count) {
            i11 = (int) (i12 * 0.5f);
        } else {
            i11 = 0;
        }
        return this.H.getHeight() + (min * i12) + i11;
    }

    public final void d() {
        this.f20684f.clearAnimation();
        this.f20685g.animate().cancel();
        this.h.animate().cancel();
        this.f20692o.stop();
        this.f20693p.stop();
    }

    public final int e() {
        int i10 = this.O;
        if (i10 < 150) {
            return Math.max(200, 0);
        }
        if (i10 > 300) {
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
        Interpolator interpolator = this.f20697t;
        o4 o4Var = this.h;
        u71 u71Var = this.f20685g;
        n4 n4Var = this.f20695r;
        Interpolator interpolator2 = this.f20696s;
        FrameLayout frameLayout = this.f20686i;
        RelativeLayout relativeLayout = this.f20684f;
        l4 l4Var = this.f20688k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f20693p;
            l4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            i4 i4Var = new i4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            i4 i4Var2 = new i4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            j4 j4Var = new j4(this, x11, (width2 + x11) - l4Var.getWidth(), width2, 0);
            i4Var.setInterpolator(interpolator2);
            i4Var.setDuration(e());
            i4Var2.setInterpolator(n4Var);
            i4Var2.setDuration(e());
            j4Var.setInterpolator(interpolator2);
            j4Var.setDuration(e());
            AnimationSet animationSet = this.f20702z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(i4Var);
            animationSet.addAnimation(i4Var2);
            animationSet.addAnimation(j4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            u71Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f20698u).setDuration(100L).start();
            o4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f20692o;
        l4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y3 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        i4 i4Var3 = new i4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        i4 i4Var4 = new i4(this, height, height2, y3, 2);
        float x13 = frameLayout.getX();
        j4 j4Var2 = new j4(this, x13, l4Var.getWidth() + (x13 - width3), width4, 1);
        i4Var3.setInterpolator(n4Var);
        i4Var3.setDuration(e());
        i4Var4.setInterpolator(interpolator2);
        i4Var4.setDuration(e());
        j4Var2.setInterpolator(interpolator2);
        j4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f20701y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(i4Var3);
        animationSet2.addAnimation(i4Var4);
        animationSet2.addAnimation(j4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        u71Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = o4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        o4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f20684f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f20685g);
        if (this.I != null) {
            relativeLayout.addView(this.f20686i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f20682b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f20683c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i10 = rect.top;
        int i11 = rect2.top;
        int i12 = i10 - i11;
        int i13 = rect2.bottom;
        int i14 = rect.bottom;
        int i15 = i13 - i14;
        int i16 = this.e;
        int i17 = i16 * 2;
        int i18 = this.E;
        int i19 = i18 + i17;
        if (this.I != null) {
            int c10 = c(2) + i17;
            int i20 = (rect2.bottom - rect.top) + i19;
            int i21 = (rect.bottom - rect2.top) + i19;
            if (i12 >= c10) {
                o(i12 - i17);
                i14 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i12 >= i19 && i20 >= c10) {
                o(i20 - i17);
                i14 = rect.top - i19;
                this.M = false;
            } else if (i15 >= c10) {
                o(i15 - i17);
                i14 = rect.bottom;
                this.M = false;
            } else if (i15 >= i19 && rect2.height() >= c10) {
                o(i21 - i17);
                i14 = (rect.bottom + i19) - popupWindow.getHeight();
                this.M = true;
            } else {
                o(rect2.height() - i17);
                i14 = rect2.top;
                this.M = false;
            }
        } else if (i12 >= i19) {
            i14 = i10 - i19;
        } else if (i15 < i19) {
            if (i15 >= i18) {
                i14 -= i16;
            } else {
                i14 = Math.max(i11, i10 - i19);
            }
        }
        View rootView = view.getRootView();
        int[] iArr = this.C;
        rootView.getLocationOnScreen(iArr);
        int i22 = iArr[0];
        int i23 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.B.set(Math.max(0, min - (i22 - iArr[0])), Math.max(0, i14 - (i23 - iArr[1])));
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
        RelativeLayout relativeLayout = this.f20684f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y3 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y3);
    }

    public final void k() {
        FrameLayout frameLayout = this.f20686i;
        frameLayout.setEnabled(true);
        o4 o4Var = this.h;
        o4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f20683c;
        l4 l4Var = this.f20688k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.e;
        u71 u71Var = this.f20685g;
        RelativeLayout relativeLayout = this.f20684f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            u71Var.setAlpha(0.0f);
            u71Var.setVisibility(4);
            o4Var.setAlpha(1.0f);
            o4Var.setVisibility(0);
            l4Var.setImageDrawable(this.f20690m);
            frameLayout.setContentDescription(cd.L0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i10);
            u71Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            o4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                u71Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                o4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            u71Var.setY(0.0f);
            frameLayout.setY(0.0f);
            o4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        u71Var.setAlpha(1.0f);
        u71Var.setVisibility(0);
        o4Var.setAlpha(0.0f);
        o4Var.setVisibility(4);
        l4Var.setImageDrawable(this.f20691n);
        frameLayout.setContentDescription(cd.L0(2131754839, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i10);
            u71Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            o4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i11) - size3.getHeight());
                u71Var.setY(0.0f);
                frameLayout.setY(0.0f);
                o4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i11);
            u71Var.setY(0.0f);
            frameLayout.setY(0.0f);
            o4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i10);
        relativeLayout.setY(i11);
        u71Var.setX(0.0f);
        u71Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        l4 l4Var = this.f20688k;
        FrameLayout frameLayout = this.f20686i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new g4(this, 0));
            l4Var.setClickable(false);
            l4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        l4Var.setClickable(true);
        l4Var.setOnClickListener(new g4(this, 1));
    }

    public final void o(int i10) {
        if (this.I != null) {
            int c10 = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f20684f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f20686i;
                    frameLayout.setY(frameLayout.getY() - height);
                }
            } else {
                m(relativeLayout, this.J);
            }
            p();
        }
    }

    public final void p() {
        int i10;
        Size size = this.J;
        int i11 = 0;
        if (size != null) {
            i11 = Math.max(0, size.getWidth());
            i10 = Math.max(0, this.J.getHeight());
        } else {
            i10 = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i11 = Math.max(i11, size2.getWidth());
            i10 = Math.max(i10, this.I.getHeight());
        }
        int i12 = (this.d * 2) + i11;
        PopupWindow popupWindow = this.f20683c;
        popupWindow.setWidth(i12);
        popupWindow.setHeight((this.e * 2) + i10);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f20684f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
