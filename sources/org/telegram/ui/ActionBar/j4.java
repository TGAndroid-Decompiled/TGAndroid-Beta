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
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.d61;
public final class j4 {
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
    public final l4 Q;
    public final Context f29016a;
    public final View f29017b;
    public final PopupWindow f29018c;
    public final int d;
    public final int f29019e;
    public final RelativeLayout f29020f;
    public final d61 f29021g;
    public final i4 h;
    public final FrameLayout f29022i;
    public final View f29023j;
    public final f4 f29024k;
    public final TextView f29025l;
    public final Drawable f29026m;
    public final Drawable f29027n;
    public final AnimatedVectorDrawable f29028o;
    public final AnimatedVectorDrawable f29029p;
    public final ab.v f29030q;
    public final h4 f29031r;
    public final Interpolator f29032s;
    public final Interpolator f29033t;
    public final Interpolator f29034u;
    public final AnimatorSet v;
    public final AnimatorSet f29035w;
    public final AnimatorSet f29036x;
    public final AnimationSet f29037y;
    public final AnimationSet f29038z;

    public j4(l4 l4Var, Context context, View view) {
        float f10;
        int i7;
        int i10;
        int w02;
        int i11;
        this.Q = l4Var;
        new j6.o(this, 20);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.f29017b = view;
        this.f29016a = context;
        h6 h6Var = l4Var.f29196n;
        int i12 = l4Var.f29191i;
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
        dh.c cVar = l4Var.f29197o;
        if (cVar != null) {
            fh.g c10 = cVar.c(relativeLayout, null, true);
            gh.e eVar = new gh.e(h6Var);
            f10 = 1.0f;
            eVar.f13620e = new g0.f(16);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f13621f = N;
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
                i7 = m6.f29420h5;
            } else {
                if (i12 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i12 == 1) {
                    i7 = m6.f29347d6;
                }
                i7 = -1;
            }
            if (i7 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout.setBackground(gradientDrawable);
            if (i7 >= 0) {
                t6.x(relativeLayout, gradientDrawable, i7, h6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout.setClipToOutline(true);
        this.f29020f = relativeLayout;
        hi.y4 y4Var = new hi.y4(relativeLayout.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(y4Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        y4Var.addView(relativeLayout);
        this.f29018c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.f29019e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.f29031r = new h4();
        this.f29032s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f29033t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f29034u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231212).mutate();
        this.f29026m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231210).mutate();
        this.f29027n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231211).mutate();
        this.f29028o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231213).mutate();
        this.f29029p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29022i = frameLayout;
        f4 f4Var = new f4(this, context);
        this.f29024k = f4Var;
        f4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        f4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        f4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        f4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f29025l = textView;
        o10.l(16.0f, 2131753753, 1, textView, null);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f29023j = view2;
        if (i12 == 0) {
            int i13 = m6.f29455j5;
            int w03 = m6.w0(i13, h6Var);
            int i14 = m6.f29439i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = m6.h0(m6.w0(i14, h6Var), 1, -1);
            p6 M = t6.M(i14);
            f4Var.setBackground(h02);
            t6.j(f4Var, h02, null, M, h6Var);
            org.telegram.ui.Cells.y h03 = m6.h0(m6.w0(i14, h6Var), 2, -1);
            p6 M2 = t6.M(i14);
            frameLayout.setBackground(h03);
            t6.j(frameLayout, h03, null, M2, h6Var);
            t6.i(view2, t6.K(0.4f, i13), h6Var);
            w02 = w03;
        } else {
            i10 = L3;
            if (i12 == 2) {
                f4Var.setBackground(m6.h0(553648127, 1, -1));
                frameLayout.setBackground(m6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = m6.w0(m6.G6, h6Var);
                int i15 = m6.f29439i6;
                org.telegram.ui.Cells.y h04 = m6.h0(m6.w0(i15, h6Var), 1, -1);
                p6 M3 = t6.M(i15);
                f4Var.setBackground(h04);
                t6.j(f4Var, h04, null, M3, h6Var);
                org.telegram.ui.Cells.y h05 = m6.h0(m6.w0(i15, h6Var), 2, -1);
                p6 M4 = t6.M(i15);
                frameLayout.setBackground(h05);
                t6.j(frameLayout, h05, null, M4, h6Var);
                t6.h(m6.f29348d7, view2, h6Var);
            }
        }
        mutate2.setTint(w02);
        mutate.setTint(w02);
        animatedVectorDrawable.setTint(w02);
        animatedVectorDrawable2.setTint(w02);
        textView.setTextColor(w02);
        if (i12 != 2) {
            if (i12 == 0) {
                i11 = m6.f29455j5;
            } else {
                i11 = m6.G6;
            }
            t6.U(textView, i11, h6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            t6.x(f4Var, mutate2, i11, h6Var, mode);
            t6.x(f4Var, mutate, i11, h6Var, mode);
            t6.x(f4Var, animatedVectorDrawable, i11, h6Var, mode);
            t6.x(f4Var, animatedVectorDrawable2, i11, h6Var, mode);
        }
        f4Var.setOnClickListener(new a4(this, 2));
        frameLayout.addView(f4Var, na.e(-2, -2, 19));
        frameLayout.addView(textView, na.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, na.a(-1.0f, f10 / org.telegram.messenger.g0.f24009p, 55));
        f4Var.measure(0, 0);
        this.H = new Size(f4Var.getMeasuredWidth(), f4Var.getMeasuredHeight());
        this.f29021g = new d61(9, context, this);
        ?? obj = new Object();
        obj.f1003e = this;
        obj.f1002c = context;
        obj.f1000a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        obj.f1001b = L4;
        LinearLayout b10 = l4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        obj.d = b10;
        this.f29030q = obj;
        final i4 i4Var = new i4(this);
        i4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        i4Var.setDivider(null);
        i4Var.setDividerHeight(0);
        e4 e4Var = new e4(this, context);
        i4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        i4Var.setClipToPadding(false);
        i4Var.setAdapter((ListAdapter) e4Var);
        i4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i16, long j3) {
                j4 j4Var = j4.this;
                j4Var.getClass();
                MenuItem menuItem = (MenuItem) i4Var.getAdapter().getItem(i16);
                l4 l4Var2 = j4Var.Q;
                if (l4Var2.f29192j != null && l4.f29184r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i17 = -j4Var.P;
                    j4Var.P = i17;
                    org.telegram.messenger.g0.E3(i17, view3, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    l4Var2.f29192j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = j4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = i4Var;
        androidx.mediarouter.app.f0 f0Var = new androidx.mediarouter.app.f0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.f29037y = animationSet;
        animationSet.setAnimationListener(f0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f29038z = animationSet2;
        animationSet2.setAnimationListener(f0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f29035w = l4.a(relativeLayout, 150, new g4(this, 0));
        this.f29036x = l4.a(relativeLayout, 0, new g4(this, 1));
    }

    public static void a(j4 j4Var) {
        FrameLayout frameLayout = j4Var.f29022i;
        RelativeLayout relativeLayout = j4Var.f29020f;
        if (j4Var.M) {
            j4Var.f29021g.setY(relativeLayout.getHeight() - j4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            j4Var.h.setY(relativeLayout.getHeight() - j4Var.I.getHeight());
        }
    }

    public static boolean b(j4 j4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = j4Var.f29038z;
        AnimationSet animationSet2 = j4Var.f29037y;
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
        i4 i4Var = this.h;
        int min = Math.min(4, Math.min(max, i4Var.getCount()));
        int count = i4Var.getCount();
        int i11 = this.E;
        if (min < count) {
            i10 = (int) (i11 * 0.5f);
        } else {
            i10 = 0;
        }
        return this.H.getHeight() + (min * i11) + i10;
    }

    public final void d() {
        this.f29020f.clearAnimation();
        this.f29021g.animate().cancel();
        this.h.animate().cancel();
        this.f29028o.stop();
        this.f29029p.stop();
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
        Interpolator interpolator = this.f29033t;
        i4 i4Var = this.h;
        d61 d61Var = this.f29021g;
        h4 h4Var = this.f29031r;
        Interpolator interpolator2 = this.f29032s;
        FrameLayout frameLayout = this.f29022i;
        RelativeLayout relativeLayout = this.f29020f;
        f4 f4Var = this.f29024k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f29029p;
            f4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            c4 c4Var = new c4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            c4 c4Var2 = new c4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            d4 d4Var = new d4(this, x11, (width2 + x11) - f4Var.getWidth(), width2, 0);
            c4Var.setInterpolator(interpolator2);
            c4Var.setDuration(e());
            c4Var2.setInterpolator(h4Var);
            c4Var2.setDuration(e());
            d4Var.setInterpolator(interpolator2);
            d4Var.setDuration(e());
            AnimationSet animationSet = this.f29038z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(c4Var);
            animationSet.addAnimation(c4Var2);
            animationSet.addAnimation(d4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            d61Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f29034u).setDuration(100L).start();
            i4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f29028o;
        f4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        c4 c4Var3 = new c4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        c4 c4Var4 = new c4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        d4 d4Var2 = new d4(this, x13, f4Var.getWidth() + (x13 - width3), width4, 1);
        c4Var3.setInterpolator(h4Var);
        c4Var3.setDuration(e());
        c4Var4.setInterpolator(interpolator2);
        c4Var4.setDuration(e());
        d4Var2.setInterpolator(interpolator2);
        d4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f29037y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(c4Var3);
        animationSet2.addAnimation(c4Var4);
        animationSet2.addAnimation(d4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        d61Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = i4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        i4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f29020f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f29021g);
        if (this.I != null) {
            relativeLayout.addView(this.f29022i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f29017b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f29018c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i7 = rect.top;
        int i10 = rect2.top;
        int i11 = i7 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.f29019e;
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
        RelativeLayout relativeLayout = this.f29020f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y10 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y10);
    }

    public final void k() {
        FrameLayout frameLayout = this.f29022i;
        frameLayout.setEnabled(true);
        i4 i4Var = this.h;
        i4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f29018c;
        f4 f4Var = this.f29024k;
        int i7 = this.d;
        Size size = this.H;
        int i10 = this.f29019e;
        d61 d61Var = this.f29021g;
        RelativeLayout relativeLayout = this.f29020f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            d61Var.setAlpha(0.0f);
            d61Var.setVisibility(4);
            i4Var.setAlpha(1.0f);
            i4Var.setVisibility(0);
            f4Var.setImageDrawable(this.f29026m);
            frameLayout.setContentDescription(hd.N0(2131754838, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i7);
            d61Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            i4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                d61Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                i4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            d61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            i4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        d61Var.setAlpha(1.0f);
        d61Var.setVisibility(0);
        i4Var.setAlpha(0.0f);
        i4Var.setVisibility(4);
        f4Var.setImageDrawable(this.f29027n);
        frameLayout.setContentDescription(hd.N0(2131754838, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i7);
            d61Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            i4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i10) - size3.getHeight());
                d61Var.setY(0.0f);
                frameLayout.setY(0.0f);
                i4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i10);
            d61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            i4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i7);
        relativeLayout.setY(i10);
        d61Var.setX(0.0f);
        d61Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        f4 f4Var = this.f29024k;
        FrameLayout frameLayout = this.f29022i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new a4(this, 0));
            f4Var.setClickable(false);
            f4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        f4Var.setClickable(true);
        f4Var.setOnClickListener(new a4(this, 1));
    }

    public final void o(int i7) {
        if (this.I != null) {
            int c10 = c((i7 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f29020f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f29022i;
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
        PopupWindow popupWindow = this.f29018c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.f29019e * 2) + i7);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f29020f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
