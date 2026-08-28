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
import org.telegram.ui.ta1;
public final class t4 {
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
    public final o4 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final v4 Q;
    public final Context f23770a;
    public final View f23771b;
    public final PopupWindow f23772c;
    public final int d;
    public final int f23773e;
    public final RelativeLayout f23774f;
    public final ta1 f23775g;
    public final s4 h;
    public final FrameLayout f23776i;
    public final View f23777j;
    public final p4 f23778k;
    public final TextView f23779l;
    public final Drawable f23780m;
    public final Drawable f23781n;
    public final AnimatedVectorDrawable f23782o;
    public final AnimatedVectorDrawable f23783p;
    public final com.google.firebase.messaging.o f23784q;
    public final r4 f23785r;
    public final Interpolator f23786s;
    public final Interpolator f23787t;
    public final Interpolator f23788u;
    public final AnimatorSet v;
    public final AnimatorSet f23789w;
    public final AnimatorSet f23790x;
    public final AnimationSet f23791y;
    public final AnimationSet f23792z;

    public t4(v4 v4Var, Context context, View view) {
        float f10;
        int i9;
        RelativeLayout relativeLayout;
        int v02;
        this.Q = v4Var;
        new v2(this, 3);
        this.F = true;
        this.L = new o4(this);
        this.P = -4;
        this.f23771b = view;
        this.f23770a = context;
        b6 b6Var = v4Var.f23884n;
        int i10 = v4Var.f23879i;
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
        ig.a aVar = v4Var.f23885o;
        if (aVar != null) {
            kg.d c10 = aVar.c(relativeLayout2, null, true);
            lg.d dVar = new lg.d(b6Var);
            f10 = 1.0f;
            dVar.f16866e = new i3.i(27);
            dVar.d(687865855, 687865855);
            dVar.c(352321535, 352321535);
            float dpf2 = AndroidUtilities.dpf2(0.6666667f);
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            dVar.f16867f = dpf2;
            dVar.h = dpf22;
            c10.n(dVar);
            c10.p(AndroidUtilities.dp(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float dp2 = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{dp2, dp2, dp2, dp2, dp2, dp2, dp2, dp2});
            if (i10 == 0) {
                gradientDrawable.setColor(f6.v0(f6.f23072h5, b6Var));
            } else if (i10 == 2) {
                gradientDrawable.setColor(-115203550);
            } else if (i10 == 1) {
                gradientDrawable.setColor(f6.v0(f6.f23001d6, b6Var));
            }
            relativeLayout2.setBackground(gradientDrawable);
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f23774f = relativeLayout2;
        kh.n5 n5Var = new kh.n5(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(n5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        n5Var.addView(relativeLayout2);
        this.f23772c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.f23773e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        this.f23785r = new r4();
        this.f23786s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f23787t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f23788u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
        this.f23780m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
        this.f23781n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
        this.f23782o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
        this.f23783p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23776i = frameLayout;
        p4 p4Var = new p4(this, context);
        this.f23778k = p4Var;
        p4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        p4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        p4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        p4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f23779l = textView;
        textView.setText(LocaleController.getString(R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f23777j = view2;
        if (i10 == 0) {
            int i11 = f6.f23108j5;
            int v03 = f6.v0(i11, b6Var);
            int i12 = f6.f23092i6;
            relativeLayout = relativeLayout2;
            i9 = dp3;
            p4Var.setBackground(f6.f0(f6.v0(i12, b6Var), 1, -1));
            frameLayout.setBackground(f6.f0(f6.v0(i12, b6Var), 2, -1));
            view2.setBackgroundColor(f6.l1(0.4f, f6.v0(i11, b6Var)));
            v02 = v03;
        } else {
            i9 = dp3;
            relativeLayout = relativeLayout2;
            if (i10 == 2) {
                p4Var.setBackground(f6.f0(553648127, 1, -1));
                frameLayout.setBackground(f6.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v02 = -328966;
            } else {
                v02 = f6.v0(f6.G6, b6Var);
                int i13 = f6.f23092i6;
                p4Var.setBackground(f6.f0(f6.v0(i13, b6Var), 1, -1));
                frameLayout.setBackground(f6.f0(f6.v0(i13, b6Var), 2, -1));
                view2.setBackgroundColor(f6.v0(f6.f23002d7, b6Var));
            }
        }
        mutate2.setTint(v02);
        mutate.setTint(v02);
        animatedVectorDrawable.setTint(v02);
        animatedVectorDrawable2.setTint(v02);
        textView.setTextColor(v02);
        p4Var.setOnClickListener(new j4(this, 2));
        frameLayout.addView(p4Var, g7.e6.e(-2, -2, 19));
        frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, g7.e6.a(-1.0f, f10 / AndroidUtilities.density, 55));
        p4Var.measure(0, 0);
        this.H = new Size(p4Var.getMeasuredWidth(), p4Var.getMeasuredHeight());
        this.f23775g = new ta1(this, context, 5);
        this.f23784q = new com.google.firebase.messaging.o(this, context, i9);
        final s4 s4Var = new s4(this);
        s4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        s4Var.setDivider(null);
        s4Var.setDividerHeight(0);
        n4 n4Var = new n4(this, context);
        s4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
        s4Var.setClipToPadding(false);
        s4Var.setAdapter((ListAdapter) n4Var);
        s4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i14, long j10) {
                t4 t4Var = t4.this;
                t4Var.getClass();
                MenuItem menuItem = (MenuItem) s4Var.getAdapter().getItem(i14);
                v4 v4Var2 = t4Var.Q;
                if (v4Var2.f23880j != null && v4.f23872r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i15 = -t4Var.P;
                    t4Var.P = i15;
                    AndroidUtilities.shakeViewSpring(view3, i15);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    v4Var2.f23880j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = t4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = s4Var;
        e2 e2Var = new e2(this, 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.f23791y = animationSet;
        animationSet.setAnimationListener(e2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f23792z = animationSet2;
        animationSet2.setAnimationListener(e2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f23789w = v4.a(relativeLayout3, 150, new q4(this, 0));
        this.f23790x = v4.a(relativeLayout3, 0, new q4(this, 1));
    }

    public static void a(t4 t4Var) {
        FrameLayout frameLayout = t4Var.f23776i;
        RelativeLayout relativeLayout = t4Var.f23774f;
        if (t4Var.M) {
            t4Var.f23775g.setY(relativeLayout.getHeight() - t4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            t4Var.h.setY(relativeLayout.getHeight() - t4Var.I.getHeight());
        }
    }

    public static boolean b(t4 t4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = t4Var.f23792z;
        AnimationSet animationSet2 = t4Var.f23791y;
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

    public static void l(View view, int i9, int i10) {
        view.setMinimumWidth(i9);
        view.setMinimumHeight(i10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int c(int i9) {
        int i10;
        int max = Math.max(2, i9);
        s4 s4Var = this.h;
        int min = Math.min(4, Math.min(max, s4Var.getCount()));
        int count = s4Var.getCount();
        int i11 = this.E;
        if (min < count) {
            i10 = (int) (i11 * 0.5f);
        } else {
            i10 = 0;
        }
        return this.H.getHeight() + (min * i11) + i10;
    }

    public final void d() {
        this.f23774f.clearAnimation();
        this.f23775g.animate().cancel();
        this.h.animate().cancel();
        this.f23782o.stop();
        this.f23783p.stop();
    }

    public final int e() {
        int i9 = this.O;
        if (i9 < 150) {
            return Math.max(200, 0);
        }
        if (i9 > 300) {
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
        Interpolator interpolator = this.f23787t;
        s4 s4Var = this.h;
        ta1 ta1Var = this.f23775g;
        r4 r4Var = this.f23785r;
        Interpolator interpolator2 = this.f23786s;
        FrameLayout frameLayout = this.f23776i;
        RelativeLayout relativeLayout = this.f23774f;
        p4 p4Var = this.f23778k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f23783p;
            p4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            l4 l4Var = new l4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            l4 l4Var2 = new l4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            m4 m4Var = new m4(this, x11, (width2 + x11) - p4Var.getWidth(), width2, 0);
            l4Var.setInterpolator(interpolator2);
            l4Var.setDuration(e());
            l4Var2.setInterpolator(r4Var);
            l4Var2.setDuration(e());
            m4Var.setInterpolator(interpolator2);
            m4Var.setDuration(e());
            AnimationSet animationSet = this.f23792z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(l4Var);
            animationSet.addAnimation(l4Var2);
            animationSet.addAnimation(m4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            ta1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f23788u).setDuration(100L).start();
            s4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f23782o;
        p4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        l4 l4Var3 = new l4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        l4 l4Var4 = new l4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        m4 m4Var2 = new m4(this, x13, p4Var.getWidth() + (x13 - width3), width4, 1);
        l4Var3.setInterpolator(r4Var);
        l4Var3.setDuration(e());
        l4Var4.setInterpolator(interpolator2);
        l4Var4.setDuration(e());
        m4Var2.setInterpolator(interpolator2);
        m4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f23791y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(l4Var3);
        animationSet2.addAnimation(l4Var4);
        animationSet2.addAnimation(m4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        ta1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = s4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        s4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f23774f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f23775g);
        if (this.I != null) {
            relativeLayout.addView(this.f23776i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f23771b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f23772c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i9 = rect.top;
        int i10 = rect2.top;
        int i11 = i9 - i10;
        int i12 = rect2.bottom;
        int i13 = rect.bottom;
        int i14 = i12 - i13;
        int i15 = this.f23773e;
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
            i13 = i9 - i18;
        } else if (i14 < i18) {
            if (i14 >= i17) {
                i13 -= i15;
            } else {
                i13 = Math.max(i10, i9 - i18);
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
        RelativeLayout relativeLayout = this.f23774f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y10 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y10);
    }

    public final void k() {
        FrameLayout frameLayout = this.f23776i;
        frameLayout.setEnabled(true);
        s4 s4Var = this.h;
        s4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f23772c;
        p4 p4Var = this.f23778k;
        int i9 = this.d;
        Size size = this.H;
        int i10 = this.f23773e;
        ta1 ta1Var = this.f23775g;
        RelativeLayout relativeLayout = this.f23774f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            ta1Var.setAlpha(0.0f);
            ta1Var.setVisibility(4);
            s4Var.setAlpha(1.0f);
            s4Var.setVisibility(0);
            p4Var.setImageDrawable(this.f23780m);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i9);
            ta1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            s4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i10);
                ta1Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                s4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i10);
            ta1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            s4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        ta1Var.setAlpha(1.0f);
        ta1Var.setVisibility(0);
        s4Var.setAlpha(0.0f);
        s4Var.setVisibility(4);
        p4Var.setImageDrawable(this.f23781n);
        frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i9);
            ta1Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            s4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i10) - size3.getHeight());
                ta1Var.setY(0.0f);
                frameLayout.setY(0.0f);
                s4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i10);
            ta1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            s4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i9);
        relativeLayout.setY(i10);
        ta1Var.setX(0.0f);
        ta1Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        p4 p4Var = this.f23778k;
        FrameLayout frameLayout = this.f23776i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new j4(this, 0));
            p4Var.setClickable(false);
            p4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        p4Var.setClickable(true);
        p4Var.setOnClickListener(new j4(this, 1));
    }

    public final void o(int i9) {
        if (this.I != null) {
            int c10 = c((i9 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f23774f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f23776i;
                    frameLayout.setY(frameLayout.getY() - height);
                }
            } else {
                m(relativeLayout, this.J);
            }
            p();
        }
    }

    public final void p() {
        int i9;
        Size size = this.J;
        int i10 = 0;
        if (size != null) {
            i10 = Math.max(0, size.getWidth());
            i9 = Math.max(0, this.J.getHeight());
        } else {
            i9 = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i10 = Math.max(i10, size2.getWidth());
            i9 = Math.max(i9, this.I.getHeight());
        }
        int i11 = (this.d * 2) + i10;
        PopupWindow popupWindow = this.f23772c;
        popupWindow.setWidth(i11);
        popupWindow.setHeight((this.f23773e * 2) + i9);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f23774f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
