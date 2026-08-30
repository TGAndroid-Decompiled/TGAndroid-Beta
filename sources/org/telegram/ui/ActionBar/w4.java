package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
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
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.hb1;
public final class w4 {
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
    public final r4 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final y4 Q;
    public final Context f20696a;
    public final View f20697b;
    public final PopupWindow f20698c;
    public final int d;
    public final int e;
    public final RelativeLayout f20699f;
    public final hb1 f20700g;
    public final v4 h;
    public final FrameLayout f20701i;
    public final View f20702j;
    public final s4 f20703k;
    public final TextView f20704l;
    public final Drawable f20705m;
    public final Drawable f20706n;
    public final AnimatedVectorDrawable f20707o;
    public final AnimatedVectorDrawable f20708p;
    public final com.google.firebase.messaging.n f20709q;
    public final u4 f20710r;
    public final Interpolator f20711s;
    public final Interpolator f20712t;
    public final Interpolator f20713u;
    public final AnimatorSet v;
    public final AnimatorSet f20714w;
    public final AnimatorSet f20715x;
    public final AnimationSet f20716y;
    public final AnimationSet f20717z;

    public w4(y4 y4Var, Context context, View view) {
        float f10;
        int i10;
        RelativeLayout relativeLayout;
        int v02;
        this.Q = y4Var;
        new w2(this, 3);
        this.F = true;
        this.L = new r4(this);
        this.P = -4;
        this.f20697b = view;
        this.f20696a = context;
        f6 f6Var = y4Var.f20767n;
        int i11 = y4Var.f20762i;
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
        ng.a aVar = y4Var.f20768o;
        if (aVar != null) {
            pg.b c3 = aVar.c(relativeLayout2, null, true);
            qg.d dVar = new qg.d(f6Var);
            dVar.e = new rg.a(1);
            dVar.d(687865855, 687865855);
            dVar.c(352321535, 352321535);
            f10 = 1.0f;
            float dpf2 = AndroidUtilities.dpf2(0.6666667f);
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            dVar.f43063f = dpf2;
            dVar.h = dpf22;
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            relativeLayout2.setBackground(c3);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float dp2 = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{dp2, dp2, dp2, dp2, dp2, dp2, dp2, dp2});
            if (i11 == 0) {
                gradientDrawable.setColor(j6.v0(j6.f19977h5, f6Var));
            } else if (i11 == 2) {
                gradientDrawable.setColor(-115203550);
            } else if (i11 == 1) {
                gradientDrawable.setColor(j6.v0(j6.f19906d6, f6Var));
            }
            relativeLayout2.setBackground(gradientDrawable);
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f20699f = relativeLayout2;
        dg.k0 k0Var = new dg.k0(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(k0Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        k0Var.addView(relativeLayout2);
        this.f20698c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        this.f20710r = new u4();
        this.f20711s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f20712t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f20713u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
        this.f20705m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
        this.f20706n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
        this.f20707o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
        this.f20708p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20701i = frameLayout;
        s4 s4Var = new s4(this, context);
        this.f20703k = s4Var;
        s4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        s4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        s4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        s4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f20704l = textView;
        textView.setText(LocaleController.getString(R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f20702j = view2;
        if (i11 == 0) {
            int i12 = j6.f20012j5;
            int v03 = j6.v0(i12, f6Var);
            int i13 = j6.f19996i6;
            relativeLayout = relativeLayout2;
            i10 = dp3;
            s4Var.setBackground(j6.f0(j6.v0(i13, f6Var), 1, -1));
            frameLayout.setBackground(j6.f0(j6.v0(i13, f6Var), 2, -1));
            view2.setBackgroundColor(j6.l1(0.4f, j6.v0(i12, f6Var)));
            v02 = v03;
        } else {
            i10 = dp3;
            relativeLayout = relativeLayout2;
            if (i11 == 2) {
                s4Var.setBackground(j6.f0(553648127, 1, -1));
                frameLayout.setBackground(j6.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v02 = -328966;
            } else {
                v02 = j6.v0(j6.G6, f6Var);
                int i14 = j6.f19996i6;
                s4Var.setBackground(j6.f0(j6.v0(i14, f6Var), 1, -1));
                frameLayout.setBackground(j6.f0(j6.v0(i14, f6Var), 2, -1));
                view2.setBackgroundColor(j6.v0(j6.f19907d7, f6Var));
            }
        }
        mutate2.setTint(v02);
        mutate.setTint(v02);
        animatedVectorDrawable.setTint(v02);
        animatedVectorDrawable2.setTint(v02);
        textView.setTextColor(v02);
        s4Var.setOnClickListener(new m4(this, 2));
        frameLayout.addView(s4Var, k7.b6.e(-2, -2, 19));
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, k7.b6.a(-1.0f, f10 / AndroidUtilities.density, 55));
        s4Var.measure(0, 0);
        this.H = new Size(s4Var.getMeasuredWidth(), s4Var.getMeasuredHeight());
        this.f20700g = new hb1(this, context, 5);
        this.f20709q = new com.google.firebase.messaging.n(this, context, i10);
        final v4 v4Var = new v4(this);
        v4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v4Var.setDivider(null);
        v4Var.setDividerHeight(0);
        q4 q4Var = new q4(this, context);
        v4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
        v4Var.setClipToPadding(false);
        v4Var.setAdapter((ListAdapter) q4Var);
        v4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i15, long j10) {
                w4 w4Var = w4.this;
                w4Var.getClass();
                MenuItem menuItem = (MenuItem) v4Var.getAdapter().getItem(i15);
                y4 y4Var2 = w4Var.Q;
                if (y4Var2.f20763j != null && y4.f20756r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i16 = -w4Var.P;
                    w4Var.P = i16;
                    AndroidUtilities.shakeViewSpring(view3, i16);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    y4Var2.f20763j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = w4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = v4Var;
        f2 f2Var = new f2(this, 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.f20716y = animationSet;
        animationSet.setAnimationListener(f2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f20717z = animationSet2;
        animationSet2.setAnimationListener(f2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f20714w = y4.a(relativeLayout3, 150, new t4(this, 0));
        this.f20715x = y4.a(relativeLayout3, 0, new t4(this, 1));
    }

    public static void a(w4 w4Var) {
        FrameLayout frameLayout = w4Var.f20701i;
        RelativeLayout relativeLayout = w4Var.f20699f;
        if (w4Var.M) {
            w4Var.f20700g.setY(relativeLayout.getHeight() - w4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            w4Var.h.setY(relativeLayout.getHeight() - w4Var.I.getHeight());
        }
    }

    public static boolean b(w4 w4Var) {
        boolean z4;
        boolean z10;
        AnimationSet animationSet = w4Var.f20717z;
        AnimationSet animationSet2 = w4Var.f20716y;
        if (animationSet2.hasStarted() && !animationSet2.hasEnded()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (animationSet.hasStarted() && !animationSet.hasEnded()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z4 && !z10) {
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
        v4 v4Var = this.h;
        int min = Math.min(4, Math.min(max, v4Var.getCount()));
        int count = v4Var.getCount();
        int i12 = this.E;
        if (min < count) {
            i11 = (int) (i12 * 0.5f);
        } else {
            i11 = 0;
        }
        return this.H.getHeight() + (min * i12) + i11;
    }

    public final void d() {
        this.f20699f.clearAnimation();
        this.f20700g.animate().cancel();
        this.h.animate().cancel();
        this.f20707o.stop();
        this.f20708p.stop();
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
        boolean z4 = this.N;
        Interpolator interpolator = this.f20712t;
        v4 v4Var = this.h;
        hb1 hb1Var = this.f20700g;
        u4 u4Var = this.f20710r;
        Interpolator interpolator2 = this.f20711s;
        FrameLayout frameLayout = this.f20701i;
        RelativeLayout relativeLayout = this.f20699f;
        s4 s4Var = this.f20703k;
        if (z4) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f20708p;
            s4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            o4 o4Var = new o4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            o4 o4Var2 = new o4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            p4 p4Var = new p4(this, x11, (width2 + x11) - s4Var.getWidth(), width2, 0);
            o4Var.setInterpolator(interpolator2);
            o4Var.setDuration(e());
            o4Var2.setInterpolator(u4Var);
            o4Var2.setDuration(e());
            p4Var.setInterpolator(interpolator2);
            p4Var.setDuration(e());
            AnimationSet animationSet = this.f20717z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(o4Var);
            animationSet.addAnimation(o4Var2);
            animationSet.addAnimation(p4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            hb1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f20713u).setDuration(100L).start();
            v4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f20707o;
        s4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        o4 o4Var3 = new o4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        o4 o4Var4 = new o4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        p4 p4Var2 = new p4(this, x13, s4Var.getWidth() + (x13 - width3), width4, 1);
        o4Var3.setInterpolator(u4Var);
        o4Var3.setDuration(e());
        o4Var4.setInterpolator(interpolator2);
        o4Var4.setDuration(e());
        p4Var2.setInterpolator(interpolator2);
        p4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f20716y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(o4Var3);
        animationSet2.addAnimation(o4Var4);
        animationSet2.addAnimation(p4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        hb1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = v4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        v4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f20699f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f20700g);
        if (this.I != null) {
            relativeLayout.addView(this.f20701i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f20697b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f20698c;
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
            int c3 = c(2) + i17;
            int i20 = (rect2.bottom - rect.top) + i19;
            int i21 = (rect.bottom - rect2.top) + i19;
            if (i12 >= c3) {
                o(i12 - i17);
                i14 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i12 >= i19 && i20 >= c3) {
                o(i20 - i17);
                i14 = rect.top - i19;
                this.M = false;
            } else if (i15 >= c3) {
                o(i15 - i17);
                i14 = rect.bottom;
                this.M = false;
            } else if (i15 >= i19 && rect2.height() >= c3) {
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
        RelativeLayout relativeLayout = this.f20699f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y10 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y10);
    }

    public final void k() {
        FrameLayout frameLayout = this.f20701i;
        frameLayout.setEnabled(true);
        v4 v4Var = this.h;
        v4Var.awakenScrollBars();
        boolean z4 = this.N;
        PopupWindow popupWindow = this.f20698c;
        s4 s4Var = this.f20703k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.e;
        hb1 hb1Var = this.f20700g;
        RelativeLayout relativeLayout = this.f20699f;
        if (z4) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            hb1Var.setAlpha(0.0f);
            hb1Var.setVisibility(4);
            v4Var.setAlpha(1.0f);
            v4Var.setVisibility(0);
            s4Var.setImageDrawable(this.f20705m);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i10);
            hb1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            v4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                hb1Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                v4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            hb1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            v4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        hb1Var.setAlpha(1.0f);
        hb1Var.setVisibility(0);
        v4Var.setAlpha(0.0f);
        v4Var.setVisibility(4);
        s4Var.setImageDrawable(this.f20706n);
        frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i10);
            hb1Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            v4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i11) - size3.getHeight());
                hb1Var.setY(0.0f);
                frameLayout.setY(0.0f);
                v4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i11);
            hb1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            v4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i10);
        relativeLayout.setY(i11);
        hb1Var.setX(0.0f);
        hb1Var.setY(0.0f);
    }

    public final void n() {
        boolean z4 = this.N;
        s4 s4Var = this.f20703k;
        FrameLayout frameLayout = this.f20701i;
        if (z4) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new m4(this, 0));
            s4Var.setClickable(false);
            s4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        s4Var.setClickable(true);
        s4Var.setOnClickListener(new m4(this, 1));
    }

    public final void o(int i10) {
        if (this.I != null) {
            int c3 = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c3) {
                this.I = new Size(this.I.getWidth(), c3);
            }
            m(this.h, this.I);
            boolean z4 = this.N;
            RelativeLayout relativeLayout = this.f20699f;
            if (z4) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c3;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f20701i;
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
        PopupWindow popupWindow = this.f20698c;
        popupWindow.setWidth(i12);
        popupWindow.setHeight((this.e * 2) + i10);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f20699f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
