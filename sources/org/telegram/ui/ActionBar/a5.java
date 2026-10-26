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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.xa1;
public final class a5 {
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
    public final v4 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final c5 Q;
    public final Context f22397a;
    public final View f22398b;
    public final PopupWindow f22399c;
    public final int d;
    public final int e;
    public final RelativeLayout f22400f;
    public final xa1 f22401g;
    public final z4 h;
    public final FrameLayout f22402i;
    public final View f22403j;
    public final w4 f22404k;
    public final TextView f22405l;
    public final Drawable f22406m;
    public final Drawable f22407n;
    public final AnimatedVectorDrawable f22408o;
    public final AnimatedVectorDrawable f22409p;
    public final com.google.firebase.messaging.m f22410q;
    public final y4 f22411r;
    public final Interpolator f22412s;
    public final Interpolator f22413t;
    public final Interpolator f22414u;
    public final AnimatorSet v;
    public final AnimatorSet f22415w;
    public final AnimatorSet f22416x;
    public final AnimationSet f22417y;
    public final AnimationSet f22418z;

    public a5(c5 c5Var, Context context, View view) {
        float f7;
        float f10;
        int i10;
        int i11;
        RelativeLayout relativeLayout;
        int w02;
        int i12;
        this.Q = c5Var;
        new z2(this, 3);
        this.F = true;
        this.L = new v4(this);
        this.P = -4;
        this.f22398b = view;
        this.f22397a = context;
        u6 u6Var = c5Var.f22515n;
        int i13 = c5Var.f22510i;
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
        ch.b bVar = c5Var.f22516o;
        if (bVar != null) {
            eh.d c10 = bVar.c(relativeLayout2, null, true);
            fh.e eVar = new fh.e(u6Var);
            f7 = 1.0f;
            eVar.e = new gh.a(2);
            eVar.d(687865855, 687865855);
            eVar.c(352321535, 352321535);
            float dpf2 = AndroidUtilities.dpf2(0.6666667f);
            f10 = 12.0f;
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            eVar.f10484f = dpf2;
            eVar.h = dpf22;
            c10.v(eVar);
            c10.x(AndroidUtilities.dp(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f7 = 1.0f;
            f10 = 12.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float dp2 = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{dp2, dp2, dp2, dp2, dp2, dp2, dp2, dp2});
            if (i13 == 0) {
                i10 = y6.f23427h5;
            } else {
                if (i13 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i13 == 1) {
                    i10 = y6.f23356d6;
                }
                i10 = -1;
            }
            if (i10 >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout2.setBackground(gradientDrawable);
            if (i10 >= 0) {
                f7.y(relativeLayout2, gradientDrawable, i10, u6Var, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f22400f = relativeLayout2;
        fi.l5 l5Var = new fi.l5(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(l5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        l5Var.addView(relativeLayout2);
        this.f22399c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        this.f22411r = new y4();
        this.f22412s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f22413t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f22414u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
        this.f22406m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
        this.f22407n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
        this.f22408o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
        this.f22409p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22402i = frameLayout;
        w4 w4Var = new w4(this, context);
        this.f22404k = w4Var;
        w4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        w4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(f10));
        w4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        w4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f22405l = textView;
        textView.setText(LocaleController.getString(R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f22403j = view2;
        if (i13 == 0) {
            int i14 = y6.f23464j5;
            w02 = y6.w0(i14, u6Var);
            relativeLayout = relativeLayout2;
            int i15 = y6.f23448i6;
            i11 = dp3;
            org.telegram.ui.Cells.y g02 = y6.g0(y6.w0(i15, u6Var), 1, -1);
            b7 N = f7.N(i15);
            w4Var.setBackground(g02);
            f7.k(w4Var, g02, null, N, u6Var);
            org.telegram.ui.Cells.y g03 = y6.g0(y6.w0(i15, u6Var), 2, -1);
            b7 N2 = f7.N(i15);
            frameLayout.setBackground(g03);
            f7.k(frameLayout, g03, null, N2, u6Var);
            f7.j(view2, f7.L(0.4f, i14), u6Var);
        } else {
            i11 = dp3;
            relativeLayout = relativeLayout2;
            if (i13 == 2) {
                w4Var.setBackground(y6.g0(553648127, 1, -1));
                frameLayout.setBackground(y6.g0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                w02 = -328966;
            } else {
                w02 = y6.w0(y6.G6, u6Var);
                int i16 = y6.f23448i6;
                org.telegram.ui.Cells.y g04 = y6.g0(y6.w0(i16, u6Var), 1, -1);
                b7 N3 = f7.N(i16);
                w4Var.setBackground(g04);
                f7.k(w4Var, g04, null, N3, u6Var);
                org.telegram.ui.Cells.y g05 = y6.g0(y6.w0(i16, u6Var), 2, -1);
                b7 N4 = f7.N(i16);
                frameLayout.setBackground(g05);
                f7.k(frameLayout, g05, null, N4, u6Var);
                f7.i(y6.f23357d7, view2, u6Var);
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
                i12 = y6.f23464j5;
            } else {
                i12 = y6.G6;
            }
            f7.V(textView, i12, u6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            f7.y(w4Var, mutate2, i12, u6Var, mode);
            f7.y(w4Var, mutate, i12, u6Var, mode);
            f7.y(w4Var, animatedVectorDrawable, i12, u6Var, mode);
            f7.y(w4Var, animatedVectorDrawable2, i12, u6Var, mode);
        }
        w4Var.setOnClickListener(new q4(this, 2));
        frameLayout.addView(w4Var, gb1.i(-2, -2, 19));
        frameLayout.addView(textView, gb1.h(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, gb1.e(-1.0f, f7 / AndroidUtilities.density, 55));
        w4Var.measure(0, 0);
        this.H = new Size(w4Var.getMeasuredWidth(), w4Var.getMeasuredHeight());
        this.f22401g = new xa1(this, context, 7);
        ?? obj = new Object();
        obj.e = this;
        obj.f7753c = context;
        obj.f7751a = i11;
        int dp4 = AndroidUtilities.dp(18.0f);
        obj.f7752b = dp4;
        LinearLayout b10 = c5.b(this.Q, context, null, true, false, false);
        b10.setPadding(dp4, 0, dp4, 0);
        obj.d = b10;
        this.f22410q = obj;
        final z4 z4Var = new z4(this);
        z4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        z4Var.setDivider(null);
        z4Var.setDividerHeight(0);
        u4 u4Var = new u4(this, context);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
        z4Var.setClipToPadding(false);
        z4Var.setAdapter((ListAdapter) u4Var);
        z4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i18, long j10) {
                a5 a5Var = a5.this;
                a5Var.getClass();
                MenuItem menuItem = (MenuItem) z4Var.getAdapter().getItem(i18);
                c5 c5Var2 = a5Var.Q;
                if (c5Var2.f22511j != null && c5.f22504r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i19 = -a5Var.P;
                    a5Var.P = i19;
                    AndroidUtilities.shakeViewSpring(view3, i19);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    c5Var2.f22511j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = a5Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = z4Var;
        g2 g2Var = new g2(this, 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.f22417y = animationSet;
        animationSet.setAnimationListener(g2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f22418z = animationSet2;
        animationSet2.setAnimationListener(g2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f22415w = c5.a(relativeLayout3, 150, new x4(this, 0));
        this.f22416x = c5.a(relativeLayout3, 0, new x4(this, 1));
    }

    public static void a(a5 a5Var) {
        FrameLayout frameLayout = a5Var.f22402i;
        RelativeLayout relativeLayout = a5Var.f22400f;
        if (a5Var.M) {
            a5Var.f22401g.setY(relativeLayout.getHeight() - a5Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            a5Var.h.setY(relativeLayout.getHeight() - a5Var.I.getHeight());
        }
    }

    public static boolean b(a5 a5Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = a5Var.f22418z;
        AnimationSet animationSet2 = a5Var.f22417y;
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
        z4 z4Var = this.h;
        int min = Math.min(4, Math.min(max, z4Var.getCount()));
        int count = z4Var.getCount();
        int i12 = this.E;
        if (min < count) {
            i11 = (int) (i12 * 0.5f);
        } else {
            i11 = 0;
        }
        return this.H.getHeight() + (min * i12) + i11;
    }

    public final void d() {
        this.f22400f.clearAnimation();
        this.f22401g.animate().cancel();
        this.h.animate().cancel();
        this.f22408o.stop();
        this.f22409p.stop();
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
        Interpolator interpolator = this.f22413t;
        z4 z4Var = this.h;
        xa1 xa1Var = this.f22401g;
        y4 y4Var = this.f22411r;
        Interpolator interpolator2 = this.f22412s;
        FrameLayout frameLayout = this.f22402i;
        RelativeLayout relativeLayout = this.f22400f;
        w4 w4Var = this.f22404k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f22409p;
            w4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x9 = relativeLayout.getX();
            s4 s4Var = new s4(this, width, width2, x9, relativeLayout.getWidth() + x9, 3);
            s4 s4Var2 = new s4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x10 = frameLayout.getX();
            t4 t4Var = new t4(this, x10, (width2 + x10) - w4Var.getWidth(), width2, 0);
            s4Var.setInterpolator(interpolator2);
            s4Var.setDuration(e());
            s4Var2.setInterpolator(y4Var);
            s4Var2.setDuration(e());
            t4Var.setInterpolator(interpolator2);
            t4Var.setDuration(e());
            AnimationSet animationSet = this.f22418z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(s4Var);
            animationSet.addAnimation(s4Var2);
            animationSet.addAnimation(t4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            xa1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f22414u).setDuration(100L).start();
            z4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f22408o;
        w4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y3 = relativeLayout.getY();
        float x11 = relativeLayout.getX();
        s4 s4Var3 = new s4(this, width3, width4, x11, x11 + relativeLayout.getWidth(), 1);
        s4 s4Var4 = new s4(this, height, height2, y3, 2);
        float x12 = frameLayout.getX();
        t4 t4Var2 = new t4(this, x12, w4Var.getWidth() + (x12 - width3), width4, 1);
        s4Var3.setInterpolator(y4Var);
        s4Var3.setDuration(e());
        s4Var4.setInterpolator(interpolator2);
        s4Var4.setDuration(e());
        t4Var2.setInterpolator(interpolator2);
        t4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f22417y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(s4Var3);
        animationSet2.addAnimation(s4Var4);
        animationSet2.addAnimation(t4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        xa1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = z4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        z4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f22400f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f22401g);
        if (this.I != null) {
            relativeLayout.addView(this.f22402i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f22398b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f22399c;
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
        RelativeLayout relativeLayout = this.f22400f;
        int x9 = ((int) relativeLayout.getX()) + width;
        int y3 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x9, y3);
    }

    public final void k() {
        FrameLayout frameLayout = this.f22402i;
        frameLayout.setEnabled(true);
        z4 z4Var = this.h;
        z4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f22399c;
        w4 w4Var = this.f22404k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.e;
        xa1 xa1Var = this.f22401g;
        RelativeLayout relativeLayout = this.f22400f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            xa1Var.setAlpha(0.0f);
            xa1Var.setVisibility(4);
            z4Var.setAlpha(1.0f);
            z4Var.setVisibility(0);
            w4Var.setImageDrawable(this.f22406m);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i10);
            xa1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            z4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                xa1Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                z4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            xa1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            z4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        xa1Var.setAlpha(1.0f);
        xa1Var.setVisibility(0);
        z4Var.setAlpha(0.0f);
        z4Var.setVisibility(4);
        w4Var.setImageDrawable(this.f22407n);
        frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i10);
            xa1Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            z4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i11) - size3.getHeight());
                xa1Var.setY(0.0f);
                frameLayout.setY(0.0f);
                z4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i11);
            xa1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            z4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i10);
        relativeLayout.setY(i11);
        xa1Var.setX(0.0f);
        xa1Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        w4 w4Var = this.f22404k;
        FrameLayout frameLayout = this.f22402i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new q4(this, 0));
            w4Var.setClickable(false);
            w4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        w4Var.setClickable(true);
        w4Var.setOnClickListener(new q4(this, 1));
    }

    public final void o(int i10) {
        if (this.I != null) {
            int c10 = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f22400f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f22402i;
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
        PopupWindow popupWindow = this.f22399c;
        popupWindow.setWidth(i12);
        popupWindow.setHeight((this.e * 2) + i10);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f22400f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
