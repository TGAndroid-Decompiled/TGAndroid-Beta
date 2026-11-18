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
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.d61;
public final class k4 {
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
    public final m4 Q;
    public final Context f29122a;
    public final View f29123b;
    public final PopupWindow f29124c;
    public final int d;
    public final int f29125e;
    public final RelativeLayout f29126f;
    public final d61 f29127g;
    public final j4 h;
    public final FrameLayout f29128i;
    public final View f29129j;
    public final g4 f29130k;
    public final TextView f29131l;
    public final Drawable f29132m;
    public final Drawable f29133n;
    public final AnimatedVectorDrawable f29134o;
    public final AnimatedVectorDrawable f29135p;
    public final ab.v f29136q;
    public final i4 f29137r;
    public final Interpolator f29138s;
    public final Interpolator f29139t;
    public final Interpolator f29140u;
    public final AnimatorSet v;
    public final AnimatorSet f29141w;
    public final AnimatorSet f29142x;
    public final AnimationSet f29143y;
    public final AnimationSet f29144z;

    public k4(m4 m4Var, Context context, View view) {
        float f10;
        int i7;
        int i10;
        int w02;
        int i11;
        this.Q = m4Var;
        new j6.o(this, 20);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.f29123b = view;
        this.f29122a = context;
        i6 i6Var = m4Var.f29245n;
        int i12 = m4Var.f29240i;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = org.telegram.messenger.g0.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.setElevation(org.telegram.messenger.g0.L(1.0f));
        relativeLayout.setFocusable(true);
        relativeLayout.setFocusableInTouchMode(true);
        dh.c cVar = m4Var.f29246o;
        if (cVar != null) {
            fh.g c10 = cVar.c(relativeLayout, null, true);
            gh.e eVar = new gh.e(i6Var);
            f10 = 1.0f;
            eVar.f13625e = new g0.e(16);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f13626f = N;
            eVar.h = N2;
            c10.p(eVar);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            relativeLayout.setBackground(c10);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i12 == 0) {
                i7 = n6.f29467h5;
            } else {
                if (i12 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i12 == 1) {
                    i7 = n6.f29394d6;
                }
                i7 = -1;
            }
            if (i7 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout.setBackground(gradientDrawable);
            if (i7 >= 0) {
                u6.x(relativeLayout, gradientDrawable, i7, i6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout.setClipToOutline(true);
        this.f29126f = relativeLayout;
        hi.x4 x4Var = new hi.x4(relativeLayout.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(x4Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        x4Var.addView(relativeLayout);
        this.f29124c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.f29125e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.f29137r = new i4();
        this.f29138s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f29139t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f29140u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231212).mutate();
        this.f29132m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231210).mutate();
        this.f29133n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231211).mutate();
        this.f29134o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231213).mutate();
        this.f29135p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29128i = frameLayout;
        g4 g4Var = new g4(this, context);
        this.f29130k = g4Var;
        g4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        g4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        g4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        g4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f29131l = textView;
        n10.l(16.0f, 2131753754, 1, textView, null);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f29129j = view2;
        if (i12 == 0) {
            int i13 = n6.f29502j5;
            int w03 = n6.w0(i13, i6Var);
            int i14 = n6.f29486i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = n6.h0(n6.w0(i14, i6Var), 1, -1);
            q6 M = u6.M(i14);
            g4Var.setBackground(h02);
            u6.j(g4Var, h02, null, M, i6Var);
            org.telegram.ui.Cells.y h03 = n6.h0(n6.w0(i14, i6Var), 2, -1);
            q6 M2 = u6.M(i14);
            frameLayout.setBackground(h03);
            u6.j(frameLayout, h03, null, M2, i6Var);
            u6.i(view2, u6.K(0.4f, i13), i6Var);
            w02 = w03;
        } else {
            i10 = L3;
            if (i12 == 2) {
                g4Var.setBackground(n6.h0(553648127, 1, -1));
                frameLayout.setBackground(n6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = n6.w0(n6.G6, i6Var);
                int i15 = n6.f29486i6;
                org.telegram.ui.Cells.y h04 = n6.h0(n6.w0(i15, i6Var), 1, -1);
                q6 M3 = u6.M(i15);
                g4Var.setBackground(h04);
                u6.j(g4Var, h04, null, M3, i6Var);
                org.telegram.ui.Cells.y h05 = n6.h0(n6.w0(i15, i6Var), 2, -1);
                q6 M4 = u6.M(i15);
                frameLayout.setBackground(h05);
                u6.j(frameLayout, h05, null, M4, i6Var);
                u6.h(n6.f29395d7, view2, i6Var);
            }
        }
        mutate2.setTint(w02);
        mutate.setTint(w02);
        animatedVectorDrawable.setTint(w02);
        animatedVectorDrawable2.setTint(w02);
        textView.setTextColor(w02);
        if (i12 != 2) {
            if (i12 == 0) {
                i11 = n6.f29502j5;
            } else {
                i11 = n6.G6;
            }
            u6.U(textView, i11, i6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            u6.x(g4Var, mutate2, i11, i6Var, mode);
            u6.x(g4Var, mutate, i11, i6Var, mode);
            u6.x(g4Var, animatedVectorDrawable, i11, i6Var, mode);
            u6.x(g4Var, animatedVectorDrawable2, i11, i6Var, mode);
        }
        g4Var.setOnClickListener(new b4(this, 2));
        frameLayout.addView(g4Var, ma.e(-2, -2, 19));
        frameLayout.addView(textView, ma.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, ma.a(-1.0f, f10 / org.telegram.messenger.g0.f24117p, 55));
        g4Var.measure(0, 0);
        this.H = new Size(g4Var.getMeasuredWidth(), g4Var.getMeasuredHeight());
        this.f29127g = new d61(9, context, this);
        ?? obj = new Object();
        obj.f1003e = this;
        obj.f1002c = context;
        obj.f1000a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        obj.f1001b = L4;
        LinearLayout b10 = m4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        obj.d = b10;
        this.f29136q = obj;
        final j4 j4Var = new j4(this);
        j4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        j4Var.setDivider(null);
        j4Var.setDividerHeight(0);
        f4 f4Var = new f4(this, context);
        j4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        j4Var.setClipToPadding(false);
        j4Var.setAdapter((ListAdapter) f4Var);
        j4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i16, long j3) {
                k4 k4Var = k4.this;
                k4Var.getClass();
                MenuItem menuItem = (MenuItem) j4Var.getAdapter().getItem(i16);
                m4 m4Var2 = k4Var.Q;
                if (m4Var2.f29241j != null && m4.f29233r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i17 = -k4Var.P;
                    k4Var.P = i17;
                    org.telegram.messenger.g0.E3(i17, view3, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    m4Var2.f29241j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = k4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = j4Var;
        androidx.mediarouter.app.f0 f0Var = new androidx.mediarouter.app.f0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.f29143y = animationSet;
        animationSet.setAnimationListener(f0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f29144z = animationSet2;
        animationSet2.setAnimationListener(f0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f29141w = m4.a(relativeLayout, 150, new h4(this, 0));
        this.f29142x = m4.a(relativeLayout, 0, new h4(this, 1));
    }

    public static void a(k4 k4Var) {
        FrameLayout frameLayout = k4Var.f29128i;
        RelativeLayout relativeLayout = k4Var.f29126f;
        if (k4Var.M) {
            k4Var.f29127g.setY(relativeLayout.getHeight() - k4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            k4Var.h.setY(relativeLayout.getHeight() - k4Var.I.getHeight());
        }
    }

    public static boolean b(k4 k4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = k4Var.f29144z;
        AnimationSet animationSet2 = k4Var.f29143y;
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

    public static void l(View view, int i7, int i10) {
        view.setMinimumWidth(i7);
        view.setMinimumHeight(i10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i7;
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int c(int i7) {
        int i10;
        int max = Math.max(2, i7);
        j4 j4Var = this.h;
        int min = Math.min(4, Math.min(max, j4Var.getCount()));
        int count = j4Var.getCount();
        int i11 = this.E;
        if (min < count) {
            i10 = (int) (i11 * 0.5f);
        } else {
            i10 = 0;
        }
        return this.H.getHeight() + (min * i11) + i10;
    }

    public final void d() {
        this.f29126f.clearAnimation();
        this.f29127g.animate().cancel();
        this.h.animate().cancel();
        this.f29134o.stop();
        this.f29135p.stop();
    }

    public final int e() {
        int i7 = this.O;
        if (i7 < 150) {
            return Math.max(200, 0);
        }
        if (i7 > 300) {
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
        Interpolator interpolator = this.f29139t;
        j4 j4Var = this.h;
        d61 d61Var = this.f29127g;
        i4 i4Var = this.f29137r;
        Interpolator interpolator2 = this.f29138s;
        FrameLayout frameLayout = this.f29128i;
        RelativeLayout relativeLayout = this.f29126f;
        g4 g4Var = this.f29130k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f29135p;
            g4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            d4 d4Var = new d4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            d4 d4Var2 = new d4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            e4 e4Var = new e4(this, x11, (width2 + x11) - g4Var.getWidth(), width2, 0);
            d4Var.setInterpolator(interpolator2);
            d4Var.setDuration(e());
            d4Var2.setInterpolator(i4Var);
            d4Var2.setDuration(e());
            e4Var.setInterpolator(interpolator2);
            e4Var.setDuration(e());
            AnimationSet animationSet = this.f29144z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(d4Var);
            animationSet.addAnimation(d4Var2);
            animationSet.addAnimation(e4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            d61Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f29140u).setDuration(100L).start();
            j4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f29134o;
        g4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        d4 d4Var3 = new d4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        d4 d4Var4 = new d4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        e4 e4Var2 = new e4(this, x13, g4Var.getWidth() + (x13 - width3), width4, 1);
        d4Var3.setInterpolator(i4Var);
        d4Var3.setDuration(e());
        d4Var4.setInterpolator(interpolator2);
        d4Var4.setDuration(e());
        e4Var2.setInterpolator(interpolator2);
        e4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f29143y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(d4Var3);
        animationSet2.addAnimation(d4Var4);
        animationSet2.addAnimation(e4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        d61Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = j4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        j4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f29126f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f29127g);
        if (this.I != null) {
            relativeLayout.addView(this.f29128i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f29123b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f29124c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i7 = rect.top;
        int i10 = rect2.top;
        int i11 = i7 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.f29125e;
        int i16 = i15 * 2;
        int i17 = this.E;
        int i18 = i17 + i16;
        if (this.I != null) {
            int c10 = c(2) + i16;
            int i19 = (rect2.bottom - rect.top) + i18;
            int i20 = (rect.bottom - rect2.top) + i18;
            if (i11 >= c10) {
                o(i11 - i16);
                i13 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i11 >= i18 && i19 >= c10) {
                o(i19 - i16);
                i13 = rect.top - i18;
                this.M = false;
            } else if (i14 >= c10) {
                o(i14 - i16);
                i13 = rect.bottom;
                this.M = false;
            } else if (i14 >= i18 && rect2.height() >= c10) {
                o(i20 - i16);
                i13 = (rect.bottom + i18) - popupWindow.getHeight();
                this.M = true;
            } else {
                o(rect2.height() - i16);
                i13 = rect2.top;
                this.M = false;
            }
        } else if (i11 >= i18) {
            i13 = i7 - i18;
        } else if (i14 < i18) {
            if (i14 >= i17) {
                i13 -= i15;
            } else {
                i13 = Math.max(i10, i7 - i18);
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
        RelativeLayout relativeLayout = this.f29126f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y10 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y10);
    }

    public final void k() {
        FrameLayout frameLayout = this.f29128i;
        frameLayout.setEnabled(true);
        j4 j4Var = this.h;
        j4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f29124c;
        g4 g4Var = this.f29130k;
        int i7 = this.d;
        Size size = this.H;
        int i10 = this.f29125e;
        d61 d61Var = this.f29127g;
        RelativeLayout relativeLayout = this.f29126f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            d61Var.setAlpha(0.0f);
            d61Var.setVisibility(4);
            j4Var.setAlpha(1.0f);
            j4Var.setVisibility(0);
            g4Var.setImageDrawable(this.f29132m);
            frameLayout.setContentDescription(gd.M0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i7);
            d61Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            j4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                d61Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                j4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            d61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            j4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        d61Var.setAlpha(1.0f);
        d61Var.setVisibility(0);
        j4Var.setAlpha(0.0f);
        j4Var.setVisibility(4);
        g4Var.setImageDrawable(this.f29133n);
        frameLayout.setContentDescription(gd.M0(2131754839, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i7);
            d61Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            j4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i10) - size3.getHeight());
                d61Var.setY(0.0f);
                frameLayout.setY(0.0f);
                j4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i10);
            d61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            j4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i7);
        relativeLayout.setY(i10);
        d61Var.setX(0.0f);
        d61Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        g4 g4Var = this.f29130k;
        FrameLayout frameLayout = this.f29128i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new b4(this, 0));
            g4Var.setClickable(false);
            g4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        g4Var.setClickable(true);
        g4Var.setOnClickListener(new b4(this, 1));
    }

    public final void o(int i7) {
        if (this.I != null) {
            int c10 = c((i7 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f29126f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f29128i;
                    frameLayout.setY(frameLayout.getY() - height);
                }
            } else {
                m(relativeLayout, this.J);
            }
            p();
        }
    }

    public final void p() {
        int i7;
        Size size = this.J;
        int i10 = 0;
        if (size != null) {
            i10 = Math.max(0, size.getWidth());
            i7 = Math.max(0, this.J.getHeight());
        } else {
            i7 = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i10 = Math.max(i10, size2.getWidth());
            i7 = Math.max(i7, this.I.getHeight());
        }
        int i11 = (this.d * 2) + i10;
        PopupWindow popupWindow = this.f29124c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.f29125e * 2) + i7);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f29126f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
