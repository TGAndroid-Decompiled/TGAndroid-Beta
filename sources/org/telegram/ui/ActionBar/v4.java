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
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import di.w9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.cc1;
public final class v4 {
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
    public final q4 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final x4 Q;
    public final Context f21438a;
    public final View f21439b;
    public final PopupWindow f21440c;
    public final int d;
    public final int f21441e;
    public final RelativeLayout f21442f;
    public final cc1 f21443g;
    public final u4 h;
    public final FrameLayout f21444i;
    public final View f21445j;
    public final r4 f21446k;
    public final TextView f21447l;
    public final Drawable f21448m;
    public final Drawable f21449n;
    public final AnimatedVectorDrawable f21450o;
    public final AnimatedVectorDrawable f21451p;
    public final com.google.firebase.messaging.p f21452q;
    public final t4 f21453r;
    public final Interpolator f21454s;
    public final Interpolator f21455t;
    public final Interpolator f21456u;
    public final AnimatorSet v;
    public final AnimatorSet f21457w;
    public final AnimatorSet f21458x;
    public final AnimationSet f21459y;
    public final AnimationSet f21460z;

    public v4(x4 x4Var, Context context, View view) {
        float f7;
        int i10;
        RelativeLayout relativeLayout;
        int v02;
        this.Q = x4Var;
        new v2(this, 3);
        this.F = true;
        this.L = new q4(this);
        this.P = -4;
        this.f21439b = view;
        this.f21438a = context;
        f6 f6Var = x4Var.f21545n;
        int i11 = x4Var.f21540i;
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
        bh.b bVar = x4Var.f21546o;
        if (bVar != null) {
            dh.d c10 = bVar.c(relativeLayout2, null, true);
            eh.e eVar = new eh.e(f6Var);
            f7 = 1.0f;
            eVar.f9141e = new w9(7);
            eVar.d(687865855, 687865855);
            eVar.c(352321535, 352321535);
            float dpf2 = AndroidUtilities.dpf2(0.6666667f);
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            eVar.f9142f = dpf2;
            eVar.h = dpf22;
            c10.n(eVar);
            c10.p(AndroidUtilities.dp(12.0f));
            relativeLayout2.setBackground(c10);
        } else {
            f7 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float dp2 = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{dp2, dp2, dp2, dp2, dp2, dp2, dp2, dp2});
            if (i11 == 0) {
                gradientDrawable.setColor(j6.v0(j6.f20761h5, f6Var));
            } else if (i11 == 2) {
                gradientDrawable.setColor(-115203550);
            } else if (i11 == 1) {
                gradientDrawable.setColor(j6.v0(j6.f20690d6, f6Var));
            }
            relativeLayout2.setBackground(gradientDrawable);
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f21442f = relativeLayout2;
        di.x5 x5Var = new di.x5(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(x5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        x5Var.addView(relativeLayout2);
        this.f21440c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.f21441e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        this.f21453r = new t4();
        this.f21454s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f21455t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f21456u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
        this.f21448m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
        this.f21449n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
        this.f21450o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
        this.f21451p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21444i = frameLayout;
        r4 r4Var = new r4(this, context);
        this.f21446k = r4Var;
        r4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        r4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        r4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        r4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f21447l = textView;
        textView.setText(LocaleController.getString(R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f21445j = view2;
        if (i11 == 0) {
            int i12 = j6.f20797j5;
            int v03 = j6.v0(i12, f6Var);
            int i13 = j6.f20780i6;
            relativeLayout = relativeLayout2;
            i10 = dp3;
            r4Var.setBackground(j6.f0(j6.v0(i13, f6Var), 1, -1));
            frameLayout.setBackground(j6.f0(j6.v0(i13, f6Var), 2, -1));
            view2.setBackgroundColor(j6.l1(0.4f, j6.v0(i12, f6Var)));
            v02 = v03;
        } else {
            i10 = dp3;
            relativeLayout = relativeLayout2;
            if (i11 == 2) {
                r4Var.setBackground(j6.f0(553648127, 1, -1));
                frameLayout.setBackground(j6.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v02 = -328966;
            } else {
                v02 = j6.v0(j6.G6, f6Var);
                int i14 = j6.f20780i6;
                r4Var.setBackground(j6.f0(j6.v0(i14, f6Var), 1, -1));
                frameLayout.setBackground(j6.f0(j6.v0(i14, f6Var), 2, -1));
                view2.setBackgroundColor(j6.v0(j6.f20691d7, f6Var));
            }
        }
        mutate2.setTint(v02);
        mutate.setTint(v02);
        animatedVectorDrawable.setTint(v02);
        animatedVectorDrawable2.setTint(v02);
        textView.setTextColor(v02);
        r4Var.setOnClickListener(new l4(this, 2));
        frameLayout.addView(r4Var, w7.x5.e(-2, -2, 19));
        frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, w7.x5.a(-1.0f, f7 / AndroidUtilities.density, 55));
        r4Var.measure(0, 0);
        this.H = new Size(r4Var.getMeasuredWidth(), r4Var.getMeasuredHeight());
        this.f21443g = new cc1(this, context, 4);
        ?? obj = new Object();
        obj.f6412e = this;
        obj.f6411c = context;
        obj.f6409a = i10;
        int dp4 = AndroidUtilities.dp(18.0f);
        obj.f6410b = dp4;
        LinearLayout b10 = x4.b(this.Q, context, null, true, false, false);
        b10.setPadding(dp4, 0, dp4, 0);
        obj.d = b10;
        this.f21452q = obj;
        final u4 u4Var = new u4(this);
        u4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        u4Var.setDivider(null);
        u4Var.setDividerHeight(0);
        p4 p4Var = new p4(this, context);
        u4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
        u4Var.setClipToPadding(false);
        u4Var.setAdapter((ListAdapter) p4Var);
        u4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i15, long j3) {
                v4 v4Var = v4.this;
                v4Var.getClass();
                MenuItem menuItem = (MenuItem) u4Var.getAdapter().getItem(i15);
                x4 x4Var2 = v4Var.Q;
                if (x4Var2.f21541j != null && x4.f21533r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i16 = -v4Var.P;
                    v4Var.P = i16;
                    AndroidUtilities.shakeViewSpring(view3, i16);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    x4Var2.f21541j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = v4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = u4Var;
        d2 d2Var = new d2(this, 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.f21459y = animationSet;
        animationSet.setAnimationListener(d2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f21460z = animationSet2;
        animationSet2.setAnimationListener(d2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f21457w = x4.a(relativeLayout3, 150, new s4(this, 0));
        this.f21458x = x4.a(relativeLayout3, 0, new s4(this, 1));
    }

    public static void a(v4 v4Var) {
        FrameLayout frameLayout = v4Var.f21444i;
        RelativeLayout relativeLayout = v4Var.f21442f;
        if (v4Var.M) {
            v4Var.f21443g.setY(relativeLayout.getHeight() - v4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            v4Var.h.setY(relativeLayout.getHeight() - v4Var.I.getHeight());
        }
    }

    public static boolean b(v4 v4Var) {
        boolean z10;
        boolean z11;
        AnimationSet animationSet = v4Var.f21460z;
        AnimationSet animationSet2 = v4Var.f21459y;
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
        u4 u4Var = this.h;
        int min = Math.min(4, Math.min(max, u4Var.getCount()));
        int count = u4Var.getCount();
        int i12 = this.E;
        if (min < count) {
            i11 = (int) (i12 * 0.5f);
        } else {
            i11 = 0;
        }
        return this.H.getHeight() + (min * i12) + i11;
    }

    public final void d() {
        this.f21442f.clearAnimation();
        this.f21443g.animate().cancel();
        this.h.animate().cancel();
        this.f21450o.stop();
        this.f21451p.stop();
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
        Interpolator interpolator = this.f21455t;
        u4 u4Var = this.h;
        cc1 cc1Var = this.f21443g;
        t4 t4Var = this.f21453r;
        Interpolator interpolator2 = this.f21454s;
        FrameLayout frameLayout = this.f21444i;
        RelativeLayout relativeLayout = this.f21442f;
        r4 r4Var = this.f21446k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f21451p;
            r4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            n4 n4Var = new n4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            n4 n4Var2 = new n4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            o4 o4Var = new o4(this, x11, (width2 + x11) - r4Var.getWidth(), width2, 0);
            n4Var.setInterpolator(interpolator2);
            n4Var.setDuration(e());
            n4Var2.setInterpolator(t4Var);
            n4Var2.setDuration(e());
            o4Var.setInterpolator(interpolator2);
            o4Var.setDuration(e());
            AnimationSet animationSet = this.f21460z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(n4Var);
            animationSet.addAnimation(n4Var2);
            animationSet.addAnimation(o4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            cc1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f21456u).setDuration(100L).start();
            u4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f21450o;
        r4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y3 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        n4 n4Var3 = new n4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        n4 n4Var4 = new n4(this, height, height2, y3, 2);
        float x13 = frameLayout.getX();
        o4 o4Var2 = new o4(this, x13, r4Var.getWidth() + (x13 - width3), width4, 1);
        n4Var3.setInterpolator(t4Var);
        n4Var3.setDuration(e());
        n4Var4.setInterpolator(interpolator2);
        n4Var4.setDuration(e());
        o4Var2.setInterpolator(interpolator2);
        o4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f21459y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(n4Var3);
        animationSet2.addAnimation(n4Var4);
        animationSet2.addAnimation(o4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        cc1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = u4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        u4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f21442f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f21443g);
        if (this.I != null) {
            relativeLayout.addView(this.f21444i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f21439b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f21440c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i10 = rect.top;
        int i11 = rect2.top;
        int i12 = i10 - i11;
        int i13 = rect2.bottom;
        int i14 = rect.bottom;
        int i15 = i13 - i14;
        int i16 = this.f21441e;
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
        RelativeLayout relativeLayout = this.f21442f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y3 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y3);
    }

    public final void k() {
        FrameLayout frameLayout = this.f21444i;
        frameLayout.setEnabled(true);
        u4 u4Var = this.h;
        u4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f21440c;
        r4 r4Var = this.f21446k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.f21441e;
        cc1 cc1Var = this.f21443g;
        RelativeLayout relativeLayout = this.f21442f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            cc1Var.setAlpha(0.0f);
            cc1Var.setVisibility(4);
            u4Var.setAlpha(1.0f);
            u4Var.setVisibility(0);
            r4Var.setImageDrawable(this.f21448m);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i10);
            cc1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            u4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                cc1Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                u4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            cc1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            u4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        cc1Var.setAlpha(1.0f);
        cc1Var.setVisibility(0);
        u4Var.setAlpha(0.0f);
        u4Var.setVisibility(4);
        r4Var.setImageDrawable(this.f21449n);
        frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i10);
            cc1Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            u4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i11) - size3.getHeight());
                cc1Var.setY(0.0f);
                frameLayout.setY(0.0f);
                u4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i11);
            cc1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            u4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i10);
        relativeLayout.setY(i11);
        cc1Var.setX(0.0f);
        cc1Var.setY(0.0f);
    }

    public final void n() {
        boolean z10 = this.N;
        r4 r4Var = this.f21446k;
        FrameLayout frameLayout = this.f21444i;
        if (z10) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new l4(this, 0));
            r4Var.setClickable(false);
            r4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        r4Var.setClickable(true);
        r4Var.setOnClickListener(new l4(this, 1));
    }

    public final void o(int i10) {
        if (this.I != null) {
            int c10 = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c10) {
                this.I = new Size(this.I.getWidth(), c10);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f21442f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c10;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f21444i;
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
        PopupWindow popupWindow = this.f21440c;
        popupWindow.setWidth(i12);
        popupWindow.setHeight((this.f21441e * 2) + i10);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f21442f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
