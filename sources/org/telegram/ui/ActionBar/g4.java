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
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.z51;
public final class g4 {
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
    public final i4 Q;
    public final Context f28562a;
    public final View f28563b;
    public final PopupWindow f28564c;
    public final int d;
    public final int f28565e;
    public final RelativeLayout f28566f;
    public final z51 f28567g;
    public final f4 h;
    public final FrameLayout f28568i;
    public final View f28569j;
    public final c4 f28570k;
    public final TextView f28571l;
    public final Drawable f28572m;
    public final Drawable f28573n;
    public final AnimatedVectorDrawable f28574o;
    public final AnimatedVectorDrawable f28575p;
    public final ab.v f28576q;
    public final e4 f28577r;
    public final Interpolator f28578s;
    public final Interpolator f28579t;
    public final Interpolator f28580u;
    public final AnimatorSet v;
    public final AnimatorSet f28581w;
    public final AnimatorSet f28582x;
    public final AnimationSet f28583y;
    public final AnimationSet f28584z;

    public g4(i4 i4Var, Context context, View view) {
        float f10;
        int i7;
        int i10;
        RelativeLayout relativeLayout;
        int w02;
        int i11;
        this.Q = i4Var;
        new j6.o(this, 20);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.f28563b = view;
        this.f28562a = context;
        e6 e6Var = i4Var.f28696n;
        int i12 = i4Var.f28691i;
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
        dh.c cVar = i4Var.f28697o;
        if (cVar != null) {
            fh.g c10 = cVar.c(relativeLayout2, null, true);
            gh.e eVar = new gh.e(e6Var);
            f10 = 1.0f;
            eVar.f13313e = new g0.e(15);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f13314f = N;
            eVar.h = N2;
            c10.p(eVar);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i12 == 0) {
                i7 = j6.f28922h5;
            } else {
                if (i12 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i12 == 1) {
                    i7 = j6.f28849d6;
                }
                i7 = -1;
            }
            if (i7 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i7 >= 0) {
                q6.x(relativeLayout2, gradientDrawable, i7, e6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f28566f = relativeLayout2;
        hi.y4 y4Var = new hi.y4(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(y4Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        y4Var.addView(relativeLayout2);
        this.f28564c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.f28565e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.f28577r = new e4();
        this.f28578s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f28579t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f28580u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231212).mutate();
        this.f28572m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231210).mutate();
        this.f28573n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231211).mutate();
        this.f28574o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231213).mutate();
        this.f28575p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28568i = frameLayout;
        c4 c4Var = new c4(this, context);
        this.f28570k = c4Var;
        c4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        c4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        c4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f28571l = textView;
        textView.setText(hd.M0(2131753756, null));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f28569j = view2;
        if (i12 == 0) {
            int i13 = j6.f28957j5;
            w02 = j6.w0(i13, e6Var);
            relativeLayout = relativeLayout2;
            int i14 = j6.f28941i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = j6.h0(j6.w0(i14, e6Var), 1, -1);
            m6 M = q6.M(i14);
            c4Var.setBackground(h02);
            q6.j(c4Var, h02, null, M, e6Var);
            org.telegram.ui.Cells.y h03 = j6.h0(j6.w0(i14, e6Var), 2, -1);
            m6 M2 = q6.M(i14);
            frameLayout.setBackground(h03);
            q6.j(frameLayout, h03, null, M2, e6Var);
            q6.i(view2, q6.K(0.4f, i13), e6Var);
        } else {
            i10 = L3;
            relativeLayout = relativeLayout2;
            if (i12 == 2) {
                c4Var.setBackground(j6.h0(553648127, 1, -1));
                frameLayout.setBackground(j6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = j6.w0(j6.G6, e6Var);
                int i15 = j6.f28941i6;
                org.telegram.ui.Cells.y h04 = j6.h0(j6.w0(i15, e6Var), 1, -1);
                m6 M3 = q6.M(i15);
                c4Var.setBackground(h04);
                q6.j(c4Var, h04, null, M3, e6Var);
                org.telegram.ui.Cells.y h05 = j6.h0(j6.w0(i15, e6Var), 2, -1);
                m6 M4 = q6.M(i15);
                frameLayout.setBackground(h05);
                q6.j(frameLayout, h05, null, M4, e6Var);
                q6.h(j6.f28850d7, view2, e6Var);
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
                i11 = j6.f28957j5;
            } else {
                i11 = j6.G6;
            }
            q6.U(textView, i11, e6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            q6.x(c4Var, mutate2, i11, e6Var, mode);
            q6.x(c4Var, mutate, i11, e6Var, mode);
            q6.x(c4Var, animatedVectorDrawable, i11, e6Var, mode);
            q6.x(c4Var, animatedVectorDrawable2, i11, e6Var, mode);
        }
        c4Var.setOnClickListener(new x3(this, 2));
        frameLayout.addView(c4Var, ja.e(-2, -2, 19));
        frameLayout.addView(textView, ja.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, ja.a(-1.0f, f10 / org.telegram.messenger.g0.f23610p, 55));
        c4Var.measure(0, 0);
        this.H = new Size(c4Var.getMeasuredWidth(), c4Var.getMeasuredHeight());
        this.f28567g = new z51(10, context, this);
        ?? obj = new Object();
        obj.f1004e = this;
        obj.f1003c = context;
        obj.f1001a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        obj.f1002b = L4;
        LinearLayout b10 = i4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        obj.d = b10;
        this.f28576q = obj;
        final f4 f4Var = new f4(this);
        f4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        f4Var.setDivider(null);
        f4Var.setDividerHeight(0);
        b4 b4Var = new b4(this, context);
        f4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        f4Var.setClipToPadding(false);
        f4Var.setAdapter((ListAdapter) b4Var);
        f4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i17, long j3) {
                g4 g4Var = g4.this;
                g4Var.getClass();
                MenuItem menuItem = (MenuItem) f4Var.getAdapter().getItem(i17);
                i4 i4Var2 = g4Var.Q;
                if (i4Var2.f28692j != null && i4.f28684r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i18 = -g4Var.P;
                    g4Var.P = i18;
                    org.telegram.messenger.g0.F3(i18, view3, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    i4Var2.f28692j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = g4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = f4Var;
        androidx.mediarouter.app.f0 f0Var = new androidx.mediarouter.app.f0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.f28583y = animationSet;
        animationSet.setAnimationListener(f0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f28584z = animationSet2;
        animationSet2.setAnimationListener(f0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f28581w = i4.a(relativeLayout3, 150, new d4(this, 0));
        this.f28582x = i4.a(relativeLayout3, 0, new d4(this, 1));
    }

    public static void a(g4 g4Var) {
        FrameLayout frameLayout = g4Var.f28568i;
        RelativeLayout relativeLayout = g4Var.f28566f;
        if (g4Var.M) {
            g4Var.f28567g.setY(relativeLayout.getHeight() - g4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            g4Var.h.setY(relativeLayout.getHeight() - g4Var.I.getHeight());
        }
    }

    public static boolean b(g4 g4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = g4Var.f28584z;
        AnimationSet animationSet2 = g4Var.f28583y;
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
        f4 f4Var = this.h;
        int min = Math.min(4, Math.min(max, f4Var.getCount()));
        int count = f4Var.getCount();
        int i11 = this.E;
        if (min < count) {
            i10 = (int) (i11 * 0.5f);
        } else {
            i10 = 0;
        }
        return this.H.getHeight() + (min * i11) + i10;
    }

    public final void d() {
        this.f28566f.clearAnimation();
        this.f28567g.animate().cancel();
        this.h.animate().cancel();
        this.f28574o.stop();
        this.f28575p.stop();
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
        Interpolator interpolator = this.f28579t;
        f4 f4Var = this.h;
        z51 z51Var = this.f28567g;
        e4 e4Var = this.f28577r;
        Interpolator interpolator2 = this.f28578s;
        FrameLayout frameLayout = this.f28568i;
        RelativeLayout relativeLayout = this.f28566f;
        c4 c4Var = this.f28570k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f28575p;
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
            z3Var2.setInterpolator(e4Var);
            z3Var2.setDuration(e());
            a4Var.setInterpolator(interpolator2);
            a4Var.setDuration(e());
            AnimationSet animationSet = this.f28584z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(z3Var);
            animationSet.addAnimation(z3Var2);
            animationSet.addAnimation(a4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            z51Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f28580u).setDuration(100L).start();
            f4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f28574o;
        c4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        z3 z3Var3 = new z3(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        z3 z3Var4 = new z3(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        a4 a4Var2 = new a4(this, x13, c4Var.getWidth() + (x13 - width3), width4, 1);
        z3Var3.setInterpolator(e4Var);
        z3Var3.setDuration(e());
        z3Var4.setInterpolator(interpolator2);
        z3Var4.setDuration(e());
        a4Var2.setInterpolator(interpolator2);
        a4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f28583y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(z3Var3);
        animationSet2.addAnimation(z3Var4);
        animationSet2.addAnimation(a4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        z51Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = f4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        f4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f28566f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f28567g);
        if (this.I != null) {
            relativeLayout.addView(this.f28568i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f28563b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f28564c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i7 = rect.top;
        int i10 = rect2.top;
        int i11 = i7 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.f28565e;
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
        RelativeLayout relativeLayout = this.f28566f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y10 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y10);
    }

    public final void k() {
        FrameLayout frameLayout = this.f28568i;
        frameLayout.setEnabled(true);
        f4 f4Var = this.h;
        f4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f28564c;
        c4 c4Var = this.f28570k;
        int i7 = this.d;
        Size size = this.H;
        int i10 = this.f28565e;
        z51 z51Var = this.f28567g;
        RelativeLayout relativeLayout = this.f28566f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            z51Var.setAlpha(0.0f);
            z51Var.setVisibility(4);
            f4Var.setAlpha(1.0f);
            f4Var.setVisibility(0);
            c4Var.setImageDrawable(this.f28572m);
            frameLayout.setContentDescription(hd.M0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i7);
            z51Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            f4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                z51Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                f4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            z51Var.setY(0.0f);
            frameLayout.setY(0.0f);
            f4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        z51Var.setAlpha(1.0f);
        z51Var.setVisibility(0);
        f4Var.setAlpha(0.0f);
        f4Var.setVisibility(4);
        c4Var.setImageDrawable(this.f28573n);
        frameLayout.setContentDescription(hd.M0(2131754839, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i7);
            z51Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            f4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i10) - size3.getHeight());
                z51Var.setY(0.0f);
                frameLayout.setY(0.0f);
                f4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i10);
            z51Var.setY(0.0f);
            frameLayout.setY(0.0f);
            f4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i7);
        relativeLayout.setY(i10);
        z51Var.setX(0.0f);
        z51Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        c4 c4Var = this.f28570k;
        FrameLayout frameLayout = this.f28568i;
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

    public final void o(int i7) {
        if (this.I != null) {
            int c10 = c((i7 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f28566f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f28568i;
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
        PopupWindow popupWindow = this.f28564c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.f28565e * 2) + i7);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f28566f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
