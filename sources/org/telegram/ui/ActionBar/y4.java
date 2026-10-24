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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ua1;
public final class y4 {
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
    public final t4 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final a5 Q;
    public final Context f21992a;
    public final View f21993b;
    public final PopupWindow f21994c;
    public final int d;
    public final int e;
    public final RelativeLayout f21995f;
    public final ua1 f21996g;
    public final x4 h;
    public final FrameLayout f21997i;
    public final View f21998j;
    public final u4 f21999k;
    public final TextView f22000l;
    public final Drawable f22001m;
    public final Drawable f22002n;
    public final AnimatedVectorDrawable f22003o;
    public final AnimatedVectorDrawable f22004p;
    public final com.google.firebase.messaging.n f22005q;
    public final w4 f22006r;
    public final Interpolator f22007s;
    public final Interpolator f22008t;
    public final Interpolator f22009u;
    public final AnimatorSet v;
    public final AnimatorSet f22010w;
    public final AnimatorSet f22011x;
    public final AnimationSet f22012y;
    public final AnimationSet f22013z;

    public y4(a5 a5Var, Context context, View view) {
        float f7;
        float f10;
        int i10;
        int i11;
        RelativeLayout relativeLayout;
        int w02;
        int i12;
        this.Q = a5Var;
        new w2(this, 3);
        this.F = true;
        this.L = new t4(this);
        this.P = -4;
        this.f21993b = view;
        this.f21992a = context;
        g6 g6Var = a5Var.f20702n;
        int i13 = a5Var.f20697i;
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int dp = AndroidUtilities.dp(20.0f);
        marginLayoutParams.rightMargin = dp;
        marginLayoutParams.topMargin = dp;
        marginLayoutParams.leftMargin = dp;
        marginLayoutParams.bottomMargin = dp;
        relativeLayout2.setLayoutParams(marginLayoutParams);
        relativeLayout2.setElevation(AndroidUtilities.dp(1.0f));
        relativeLayout2.setFocusable(true);
        relativeLayout2.setFocusableInTouchMode(true);
        bh.b bVar = a5Var.f20703o;
        if (bVar != null) {
            dh.d c10 = bVar.c(relativeLayout2, null, true);
            eh.e eVar = new eh.e(g6Var);
            f7 = 1.0f;
            f10 = 12.0f;
            eVar.e = new c3.m(24);
            eVar.d(687865855, 687865855);
            eVar.c(352321535, 352321535);
            float dpf2 = AndroidUtilities.dpf2(0.6666667f);
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            eVar.f8668f = dpf2;
            eVar.h = dpf22;
            c10.o(eVar);
            c10.q(AndroidUtilities.dp(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f7 = 1.0f;
            f10 = 12.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float dp2 = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{dp2, dp2, dp2, dp2, dp2, dp2, dp2, dp2});
            if (i13 == 0) {
                i10 = k6.f21255h5;
            } else {
                if (i13 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i13 == 1) {
                    i10 = k6.f21184d6;
                }
                i10 = -1;
            }
            if (i10 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i10 >= 0) {
                r6.z(relativeLayout2, gradientDrawable, i10, g6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f21995f = relativeLayout2;
        ei.m5 m5Var = new ei.m5(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(m5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        m5Var.addView(relativeLayout2);
        this.f21994c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        this.f22006r = new w4();
        this.f22007s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f22008t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f22009u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
        this.f22001m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
        this.f22002n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
        this.f22003o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
        this.f22004p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21997i = frameLayout;
        u4 u4Var = new u4(this, context);
        this.f21999k = u4Var;
        u4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        u4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
        u4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        u4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f22000l = textView;
        textView.setText(LocaleController.getString(R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f21998j = view2;
        if (i13 == 0) {
            int i14 = k6.f21290j5;
            w02 = k6.w0(i14, g6Var);
            relativeLayout = relativeLayout2;
            int i15 = k6.f21273i6;
            i11 = dp3;
            org.telegram.ui.Cells.y g02 = k6.g0(k6.w0(i15, g6Var), 1, -1);
            n6 O = r6.O(i15);
            u4Var.setBackground(g02);
            r6.k(u4Var, g02, null, O, g6Var);
            org.telegram.ui.Cells.y g03 = k6.g0(k6.w0(i15, g6Var), 2, -1);
            n6 O2 = r6.O(i15);
            frameLayout.setBackground(g03);
            r6.k(frameLayout, g03, null, O2, g6Var);
            r6.j(view2, r6.M(0.4f, i14), g6Var);
        } else {
            i11 = dp3;
            relativeLayout = relativeLayout2;
            if (i13 == 2) {
                u4Var.setBackground(k6.g0(553648127, 1, -1));
                frameLayout.setBackground(k6.g0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = k6.w0(k6.G6, g6Var);
                int i16 = k6.f21273i6;
                org.telegram.ui.Cells.y g04 = k6.g0(k6.w0(i16, g6Var), 1, -1);
                n6 O3 = r6.O(i16);
                u4Var.setBackground(g04);
                r6.k(u4Var, g04, null, O3, g6Var);
                org.telegram.ui.Cells.y g05 = k6.g0(k6.w0(i16, g6Var), 2, -1);
                n6 O4 = r6.O(i16);
                frameLayout.setBackground(g05);
                r6.k(frameLayout, g05, null, O4, g6Var);
                r6.i(k6.f21185d7, view2, g6Var);
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
                i12 = k6.f21290j5;
            } else {
                i12 = k6.G6;
            }
            r6.W(textView, i12, g6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            r6.z(u4Var, mutate2, i12, g6Var, mode);
            r6.z(u4Var, mutate, i12, g6Var, mode);
            r6.z(u4Var, animatedVectorDrawable, i12, g6Var, mode);
            r6.z(u4Var, animatedVectorDrawable2, i12, g6Var, mode);
        }
        u4Var.setOnClickListener(new o4(this, 2));
        frameLayout.addView(u4Var, w7.z5.e(-2, -2, 19));
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, w7.z5.a(-1.0f, f7 / AndroidUtilities.density, 55));
        u4Var.measure(0, 0);
        this.H = new Size(u4Var.getMeasuredWidth(), u4Var.getMeasuredHeight());
        this.f21996g = new ua1(this, context, 6);
        ?? obj = new Object();
        obj.e = this;
        obj.f7666c = context;
        obj.f7664a = i11;
        int dp4 = AndroidUtilities.dp(18.0f);
        obj.f7665b = dp4;
        LinearLayout b10 = a5.b(this.Q, context, null, true, false, false);
        b10.setPadding(dp4, 0, dp4, 0);
        obj.d = b10;
        this.f22005q = obj;
        final x4 x4Var = new x4(this);
        x4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        x4Var.setDivider(null);
        x4Var.setDividerHeight(0);
        s4 s4Var = new s4(this, context);
        x4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
        x4Var.setClipToPadding(false);
        x4Var.setAdapter((ListAdapter) s4Var);
        x4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i18, long j10) {
                y4 y4Var = y4.this;
                y4Var.getClass();
                MenuItem menuItem = (MenuItem) x4Var.getAdapter().getItem(i18);
                a5 a5Var2 = y4Var.Q;
                if (a5Var2.f20698j != null && a5.f20691r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i19 = -y4Var.P;
                    y4Var.P = i19;
                    AndroidUtilities.shakeViewSpring(view3, i19);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    a5Var2.f20698j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = y4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = x4Var;
        e2 e2Var = new e2(this, 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.f22012y = animationSet;
        animationSet.setAnimationListener(e2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f22013z = animationSet2;
        animationSet2.setAnimationListener(e2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f22010w = a5.a(relativeLayout3, 150, new v4(this, 0));
        this.f22011x = a5.a(relativeLayout3, 0, new v4(this, 1));
    }

    public static void a(y4 y4Var) {
        FrameLayout frameLayout = y4Var.f21997i;
        RelativeLayout relativeLayout = y4Var.f21995f;
        if (y4Var.M) {
            y4Var.f21996g.setY(relativeLayout.getHeight() - y4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            y4Var.h.setY(relativeLayout.getHeight() - y4Var.I.getHeight());
        }
    }

    public static boolean b(y4 y4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = y4Var.f22013z;
        AnimationSet animationSet2 = y4Var.f22012y;
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
        x4 x4Var = this.h;
        int min = Math.min(4, Math.min(max, x4Var.getCount()));
        int count = x4Var.getCount();
        int i12 = this.E;
        if (min < count) {
            i11 = (int) (i12 * 0.5f);
        } else {
            i11 = 0;
        }
        return this.H.getHeight() + (min * i12) + i11;
    }

    public final void d() {
        this.f21995f.clearAnimation();
        this.f21996g.animate().cancel();
        this.h.animate().cancel();
        this.f22003o.stop();
        this.f22004p.stop();
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
        Interpolator interpolator = this.f22008t;
        x4 x4Var = this.h;
        ua1 ua1Var = this.f21996g;
        w4 w4Var = this.f22006r;
        Interpolator interpolator2 = this.f22007s;
        FrameLayout frameLayout = this.f21997i;
        RelativeLayout relativeLayout = this.f21995f;
        u4 u4Var = this.f21999k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f22004p;
            u4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            q4 q4Var = new q4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            q4 q4Var2 = new q4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            r4 r4Var = new r4(this, x11, (width2 + x11) - u4Var.getWidth(), width2, 0);
            q4Var.setInterpolator(interpolator2);
            q4Var.setDuration(e());
            q4Var2.setInterpolator(w4Var);
            q4Var2.setDuration(e());
            r4Var.setInterpolator(interpolator2);
            r4Var.setDuration(e());
            AnimationSet animationSet = this.f22013z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(q4Var);
            animationSet.addAnimation(q4Var2);
            animationSet.addAnimation(r4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            ua1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f22009u).setDuration(100L).start();
            x4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f22003o;
        u4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y3 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        q4 q4Var3 = new q4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        q4 q4Var4 = new q4(this, height, height2, y3, 2);
        float x13 = frameLayout.getX();
        r4 r4Var2 = new r4(this, x13, u4Var.getWidth() + (x13 - width3), width4, 1);
        q4Var3.setInterpolator(w4Var);
        q4Var3.setDuration(e());
        q4Var4.setInterpolator(interpolator2);
        q4Var4.setDuration(e());
        r4Var2.setInterpolator(interpolator2);
        r4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f22012y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(q4Var3);
        animationSet2.addAnimation(q4Var4);
        animationSet2.addAnimation(r4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        ua1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = x4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        x4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f21995f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f21996g);
        if (this.I != null) {
            relativeLayout.addView(this.f21997i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f21993b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f21994c;
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
        RelativeLayout relativeLayout = this.f21995f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y3 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y3);
    }

    public final void k() {
        FrameLayout frameLayout = this.f21997i;
        frameLayout.setEnabled(true);
        x4 x4Var = this.h;
        x4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f21994c;
        u4 u4Var = this.f21999k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.e;
        ua1 ua1Var = this.f21996g;
        RelativeLayout relativeLayout = this.f21995f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            ua1Var.setAlpha(0.0f);
            ua1Var.setVisibility(4);
            x4Var.setAlpha(1.0f);
            x4Var.setVisibility(0);
            u4Var.setImageDrawable(this.f22001m);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i10);
            ua1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            x4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                ua1Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                x4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            ua1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            x4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        ua1Var.setAlpha(1.0f);
        ua1Var.setVisibility(0);
        x4Var.setAlpha(0.0f);
        x4Var.setVisibility(4);
        u4Var.setImageDrawable(this.f22002n);
        frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i10);
            ua1Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            x4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i11) - size3.getHeight());
                ua1Var.setY(0.0f);
                frameLayout.setY(0.0f);
                x4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i11);
            ua1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            x4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i10);
        relativeLayout.setY(i11);
        ua1Var.setX(0.0f);
        ua1Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        u4 u4Var = this.f21999k;
        FrameLayout frameLayout = this.f21997i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new o4(this, 0));
            u4Var.setClickable(false);
            u4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        u4Var.setClickable(true);
        u4Var.setOnClickListener(new o4(this, 1));
    }

    public final void o(int i10) {
        if (this.I != null) {
            int c10 = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f21995f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f21997i;
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
        PopupWindow popupWindow = this.f21994c;
        popupWindow.setWidth(i12);
        popupWindow.setHeight((this.e * 2) + i10);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f21995f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
