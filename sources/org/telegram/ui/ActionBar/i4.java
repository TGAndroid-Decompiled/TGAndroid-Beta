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
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.ui.c61;
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
    public final Context f27563a;
    public final View f27564b;
    public final PopupWindow f27565c;
    public final int d;
    public final int f27566e;
    public final RelativeLayout f27567f;
    public final c61 f27568g;
    public final h4 h;
    public final FrameLayout f27569i;
    public final View f27570j;
    public final e4 f27571k;
    public final TextView f27572l;
    public final Drawable f27573m;
    public final Drawable f27574n;
    public final AnimatedVectorDrawable f27575o;
    public final AnimatedVectorDrawable f27576p;
    public final ab.v f27577q;
    public final g4 f27578r;
    public final Interpolator f27579s;
    public final Interpolator f27580t;
    public final Interpolator f27581u;
    public final AnimatorSet v;
    public final AnimatorSet f27582w;
    public final AnimatorSet f27583x;
    public final AnimationSet f27584y;
    public final AnimationSet f27585z;

    public i4(k4 k4Var, Context context, View view) {
        float f10;
        int i7;
        int i10;
        RelativeLayout relativeLayout;
        int w02;
        int i11;
        this.Q = k4Var;
        new m.f3(this, 17);
        this.F = true;
        this.L = new androidx.mediarouter.app.w(this, 8);
        this.P = -4;
        this.f27564b = view;
        this.f27563a = context;
        f6 f6Var = k4Var.f27746n;
        int i12 = k4Var.f27741i;
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
        dh.c cVar = k4Var.f27747o;
        if (cVar != null) {
            fh.g c10 = cVar.c(relativeLayout2, null, true);
            gh.e eVar = new gh.e(f6Var);
            f10 = 1.0f;
            eVar.f13971e = new g2.c(13);
            eVar.f(687865855, 687865855);
            eVar.e(352321535, 352321535);
            float N = org.telegram.messenger.g0.N(0.6666667f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f13972f = N;
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
                i7 = k6.f27921h5;
            } else {
                if (i12 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i12 == 1) {
                    i7 = k6.f27848d6;
                }
                i7 = -1;
            }
            if (i7 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i7 >= 0) {
                r6.y(relativeLayout2, gradientDrawable, i7, f6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f27567f = relativeLayout2;
        fi.a5 a5Var = new fi.a5(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(a5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        a5Var.addView(relativeLayout2);
        this.f27565c = popupWindow;
        this.d = org.telegram.messenger.g0.L(16.0f);
        this.f27566e = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(48.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        this.f27578r = new g4();
        this.f27579s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f27580t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f27581u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231212).mutate();
        this.f27573m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231210).mutate();
        this.f27574n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231211).mutate();
        this.f27575o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231213).mutate();
        this.f27576p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27569i = frameLayout;
        e4 e4Var = new e4(this, context);
        this.f27571k = e4Var;
        e4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(48.0f)));
        e4Var.setPaddingRelative(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        e4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f27572l = textView;
        textView.setText(hd.M0(2131753756, null));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f27570j = view2;
        if (i12 == 0) {
            int i13 = k6.f27956j5;
            w02 = k6.w0(i13, f6Var);
            relativeLayout = relativeLayout2;
            int i14 = k6.f27940i6;
            i10 = L3;
            org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i14, f6Var), 1, -1);
            n6 N3 = r6.N(i14);
            e4Var.setBackground(h02);
            r6.k(e4Var, h02, null, N3, f6Var);
            org.telegram.ui.Cells.y h03 = k6.h0(k6.w0(i14, f6Var), 2, -1);
            n6 N4 = r6.N(i14);
            frameLayout.setBackground(h03);
            r6.k(frameLayout, h03, null, N4, f6Var);
            r6.j(view2, r6.L(0.4f, i13), f6Var);
        } else {
            i10 = L3;
            relativeLayout = relativeLayout2;
            if (i12 == 2) {
                e4Var.setBackground(k6.h0(553648127, 1, -1));
                frameLayout.setBackground(k6.h0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = k6.w0(k6.G6, f6Var);
                int i15 = k6.f27940i6;
                org.telegram.ui.Cells.y h04 = k6.h0(k6.w0(i15, f6Var), 1, -1);
                n6 N5 = r6.N(i15);
                e4Var.setBackground(h04);
                r6.k(e4Var, h04, null, N5, f6Var);
                org.telegram.ui.Cells.y h05 = k6.h0(k6.w0(i15, f6Var), 2, -1);
                n6 N6 = r6.N(i15);
                frameLayout.setBackground(h05);
                r6.k(frameLayout, h05, null, N6, f6Var);
                r6.i(k6.f27849d7, view2, f6Var);
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
                i11 = k6.f27956j5;
            } else {
                i11 = k6.G6;
            }
            r6.V(textView, i11, f6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            r6.y(e4Var, mutate2, i11, f6Var, mode);
            r6.y(e4Var, mutate, i11, f6Var, mode);
            r6.y(e4Var, animatedVectorDrawable, i11, f6Var, mode);
            r6.y(e4Var, animatedVectorDrawable2, i11, f6Var, mode);
        }
        e4Var.setOnClickListener(new z3(this, 2));
        frameLayout.addView(e4Var, ha.e(-2, -2, 19));
        frameLayout.addView(textView, ha.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, ha.a(-1.0f, f10 / org.telegram.messenger.g0.f22536p, 55));
        e4Var.measure(0, 0);
        this.H = new Size(e4Var.getMeasuredWidth(), e4Var.getMeasuredHeight());
        this.f27568g = new c61(9, context, this);
        ?? obj = new Object();
        obj.f1005e = this;
        obj.f1004c = context;
        obj.f1002a = i10;
        int L4 = org.telegram.messenger.g0.L(18.0f);
        obj.f1003b = L4;
        LinearLayout b10 = k4.b(this.Q, context, null, true, false, false);
        b10.setPadding(L4, 0, L4, 0);
        obj.d = b10;
        this.f27577q = obj;
        final h4 h4Var = new h4(this);
        h4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        h4Var.setDivider(null);
        h4Var.setDividerHeight(0);
        d4 d4Var = new d4(this, context);
        h4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(2.0f));
        h4Var.setClipToPadding(false);
        h4Var.setAdapter((ListAdapter) d4Var);
        h4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i17, long j3) {
                i4 i4Var = i4.this;
                i4Var.getClass();
                MenuItem menuItem = (MenuItem) h4Var.getAdapter().getItem(i17);
                k4 k4Var2 = i4Var.Q;
                if (k4Var2.f27742j != null && k4.f27734r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i18 = -i4Var.P;
                    i4Var.P = i18;
                    org.telegram.messenger.g0.G3(i18, view3, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    k4Var2.f27742j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = i4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = h4Var;
        androidx.mediarouter.app.f0 f0Var = new androidx.mediarouter.app.f0(this, 2);
        AnimationSet animationSet = new AnimationSet(true);
        this.f27584y = animationSet;
        animationSet.setAnimationListener(f0Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f27585z = animationSet2;
        animationSet2.setAnimationListener(f0Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f27582w = k4.a(relativeLayout3, 150, new f4(this, 0));
        this.f27583x = k4.a(relativeLayout3, 0, new f4(this, 1));
    }

    public static void a(i4 i4Var) {
        FrameLayout frameLayout = i4Var.f27569i;
        RelativeLayout relativeLayout = i4Var.f27567f;
        if (i4Var.M) {
            i4Var.f27568g.setY(relativeLayout.getHeight() - i4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            i4Var.h.setY(relativeLayout.getHeight() - i4Var.I.getHeight());
        }
    }

    public static boolean b(i4 i4Var) {
        boolean z9;
        boolean z10;
        AnimationSet animationSet = i4Var.f27585z;
        AnimationSet animationSet2 = i4Var.f27584y;
        if (animationSet2.hasStarted() && !animationSet2.hasEnded()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (animationSet.hasStarted() && !animationSet.hasEnded()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9 && !z10) {
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
        h4 h4Var = this.h;
        int min = Math.min(4, Math.min(max, h4Var.getCount()));
        int count = h4Var.getCount();
        int i11 = this.E;
        if (min < count) {
            i10 = (int) (i11 * 0.5f);
        } else {
            i10 = 0;
        }
        return this.H.getHeight() + (min * i11) + i10;
    }

    public final void d() {
        this.f27567f.clearAnimation();
        this.f27568g.animate().cancel();
        this.h.animate().cancel();
        this.f27575o.stop();
        this.f27576p.stop();
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
        boolean z9 = this.N;
        Interpolator interpolator = this.f27580t;
        h4 h4Var = this.h;
        c61 c61Var = this.f27568g;
        g4 g4Var = this.f27578r;
        Interpolator interpolator2 = this.f27579s;
        FrameLayout frameLayout = this.f27569i;
        RelativeLayout relativeLayout = this.f27567f;
        e4 e4Var = this.f27571k;
        if (z9) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f27576p;
            e4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            b4 b4Var = new b4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            b4 b4Var2 = new b4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            c4 c4Var = new c4(this, x11, (width2 + x11) - e4Var.getWidth(), width2, 0);
            b4Var.setInterpolator(interpolator2);
            b4Var.setDuration(e());
            b4Var2.setInterpolator(g4Var);
            b4Var2.setDuration(e());
            c4Var.setInterpolator(interpolator2);
            c4Var.setDuration(e());
            AnimationSet animationSet = this.f27585z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(b4Var);
            animationSet.addAnimation(b4Var2);
            animationSet.addAnimation(c4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            c61Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f27581u).setDuration(100L).start();
            h4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f27575o;
        e4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        b4 b4Var3 = new b4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        b4 b4Var4 = new b4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        c4 c4Var2 = new c4(this, x13, e4Var.getWidth() + (x13 - width3), width4, 1);
        b4Var3.setInterpolator(g4Var);
        b4Var3.setDuration(e());
        b4Var4.setInterpolator(interpolator2);
        b4Var4.setDuration(e());
        c4Var2.setInterpolator(interpolator2);
        c4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f27584y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(b4Var3);
        animationSet2.addAnimation(b4Var4);
        animationSet2.addAnimation(c4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        c61Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = h4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        h4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f27567f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f27568g);
        if (this.I != null) {
            relativeLayout.addView(this.f27569i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f27564b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f27565c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i7 = rect.top;
        int i10 = rect2.top;
        int i11 = i7 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.f27566e;
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
        RelativeLayout relativeLayout = this.f27567f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y10 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y10);
    }

    public final void k() {
        FrameLayout frameLayout = this.f27569i;
        frameLayout.setEnabled(true);
        h4 h4Var = this.h;
        h4Var.awakenScrollBars();
        boolean z9 = this.N;
        PopupWindow popupWindow = this.f27565c;
        e4 e4Var = this.f27571k;
        int i7 = this.d;
        Size size = this.H;
        int i10 = this.f27566e;
        c61 c61Var = this.f27568g;
        RelativeLayout relativeLayout = this.f27567f;
        if (z9) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            c61Var.setAlpha(0.0f);
            c61Var.setVisibility(4);
            h4Var.setAlpha(1.0f);
            h4Var.setVisibility(0);
            e4Var.setImageDrawable(this.f27573m);
            frameLayout.setContentDescription(hd.M0(2131754839, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i7);
            c61Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            h4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                c61Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                h4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            c61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            h4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        c61Var.setAlpha(1.0f);
        c61Var.setVisibility(0);
        h4Var.setAlpha(0.0f);
        h4Var.setVisibility(4);
        e4Var.setImageDrawable(this.f27574n);
        frameLayout.setContentDescription(hd.M0(2131754839, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i7);
            c61Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            h4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i10) - size3.getHeight());
                c61Var.setY(0.0f);
                frameLayout.setY(0.0f);
                h4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i10);
            c61Var.setY(0.0f);
            frameLayout.setY(0.0f);
            h4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i7);
        relativeLayout.setY(i10);
        c61Var.setX(0.0f);
        c61Var.setY(0.0f);
    }

    public final void n() {
        boolean z9 = this.N;
        e4 e4Var = this.f27571k;
        FrameLayout frameLayout = this.f27569i;
        if (z9) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new z3(this, 0));
            e4Var.setClickable(false);
            e4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        e4Var.setClickable(true);
        e4Var.setOnClickListener(new z3(this, 1));
    }

    public final void o(int i7) {
        if (this.I != null) {
            int c10 = c((i7 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z9 = this.N;
            RelativeLayout relativeLayout = this.f27567f;
            if (z9) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f27569i;
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
        PopupWindow popupWindow = this.f27565c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.f27566e * 2) + i7);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f27567f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
