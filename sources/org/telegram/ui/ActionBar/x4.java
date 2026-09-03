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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ob1;
public final class x4 {
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
    public final s4 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final z4 Q;
    public final Context f22425a;
    public final View f22426b;
    public final PopupWindow f22427c;
    public final int d;
    public final int f22428e;
    public final RelativeLayout f22429f;
    public final ob1 f22430g;
    public final w4 h;
    public final FrameLayout f22431i;
    public final View f22432j;
    public final t4 f22433k;
    public final TextView f22434l;
    public final Drawable f22435m;
    public final Drawable f22436n;
    public final AnimatedVectorDrawable f22437o;
    public final AnimatedVectorDrawable f22438p;
    public final com.google.firebase.messaging.n f22439q;
    public final v4 f22440r;
    public final Interpolator f22441s;
    public final Interpolator f22442t;
    public final Interpolator f22443u;
    public final AnimatorSet v;
    public final AnimatorSet f22444w;
    public final AnimatorSet f22445x;
    public final AnimationSet f22446y;
    public final AnimationSet f22447z;

    public x4(z4 z4Var, Context context, View view) {
        float f10;
        int i10;
        RelativeLayout relativeLayout;
        int v02;
        this.Q = z4Var;
        new x2(this, 3);
        this.F = true;
        this.L = new s4(this);
        this.P = -4;
        this.f22426b = view;
        this.f22425a = context;
        g6 g6Var = z4Var.f22503n;
        int i11 = z4Var.f22498i;
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
        og.a aVar = z4Var.f22504o;
        if (aVar != null) {
            qg.b c3 = aVar.c(relativeLayout2, null, true);
            rg.d dVar = new rg.d(g6Var);
            f10 = 1.0f;
            dVar.f46842e = new s0.b(23);
            dVar.d(687865855, 687865855);
            dVar.c(352321535, 352321535);
            float dpf2 = AndroidUtilities.dpf2(0.6666667f);
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            dVar.f46843f = dpf2;
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
                gradientDrawable.setColor(k6.v0(k6.f21733h5, g6Var));
            } else if (i11 == 2) {
                gradientDrawable.setColor(-115203550);
            } else if (i11 == 1) {
                gradientDrawable.setColor(k6.v0(k6.f21661d6, g6Var));
            }
            relativeLayout2.setBackground(gradientDrawable);
        }
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout2.setClipToOutline(true);
        this.f22429f = relativeLayout2;
        eg.i0 i0Var = new eg.i0(relativeLayout2.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow(i0Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i0Var.addView(relativeLayout2);
        this.f22427c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.f22428e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int dp3 = AndroidUtilities.dp(8.0f);
        this.f22440r = new v4();
        this.f22441s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f22442t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f22443u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
        this.f22435m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
        this.f22436n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
        this.f22437o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
        this.f22438p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22431i = frameLayout;
        t4 t4Var = new t4(this, context);
        this.f22433k = t4Var;
        t4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        t4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        t4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        t4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.f22434l = textView;
        textView.setText(LocaleController.getString(R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f22432j = view2;
        if (i11 == 0) {
            int i12 = k6.f21768j5;
            int v03 = k6.v0(i12, g6Var);
            int i13 = k6.f21752i6;
            relativeLayout = relativeLayout2;
            i10 = dp3;
            t4Var.setBackground(k6.f0(k6.v0(i13, g6Var), 1, -1));
            frameLayout.setBackground(k6.f0(k6.v0(i13, g6Var), 2, -1));
            view2.setBackgroundColor(k6.l1(0.4f, k6.v0(i12, g6Var)));
            v02 = v03;
        } else {
            i10 = dp3;
            relativeLayout = relativeLayout2;
            if (i11 == 2) {
                t4Var.setBackground(k6.f0(553648127, 1, -1));
                frameLayout.setBackground(k6.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v02 = -328966;
            } else {
                v02 = k6.v0(k6.G6, g6Var);
                int i14 = k6.f21752i6;
                t4Var.setBackground(k6.f0(k6.v0(i14, g6Var), 1, -1));
                frameLayout.setBackground(k6.f0(k6.v0(i14, g6Var), 2, -1));
                view2.setBackgroundColor(k6.v0(k6.f21662d7, g6Var));
            }
        }
        mutate2.setTint(v02);
        mutate.setTint(v02);
        animatedVectorDrawable.setTint(v02);
        animatedVectorDrawable2.setTint(v02);
        textView.setTextColor(v02);
        t4Var.setOnClickListener(new n4(this, 2));
        frameLayout.addView(t4Var, k7.c6.e(-2, -2, 19));
        frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, k7.c6.a(-1.0f, f10 / AndroidUtilities.density, 55));
        t4Var.measure(0, 0);
        this.H = new Size(t4Var.getMeasuredWidth(), t4Var.getMeasuredHeight());
        this.f22430g = new ob1(this, context, 5);
        ?? obj = new Object();
        obj.f4074e = this;
        obj.f4073c = context;
        obj.f4071a = i10;
        int dp4 = AndroidUtilities.dp(18.0f);
        obj.f4072b = dp4;
        LinearLayout b10 = z4.b(this.Q, context, null, true, false, false);
        b10.setPadding(dp4, 0, dp4, 0);
        obj.d = b10;
        this.f22439q = obj;
        final w4 w4Var = new w4(this);
        w4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        w4Var.setDivider(null);
        w4Var.setDividerHeight(0);
        r4 r4Var = new r4(this, context);
        w4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
        w4Var.setClipToPadding(false);
        w4Var.setAdapter((ListAdapter) r4Var);
        w4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i15, long j10) {
                x4 x4Var = x4.this;
                x4Var.getClass();
                MenuItem menuItem = (MenuItem) w4Var.getAdapter().getItem(i15);
                z4 z4Var2 = x4Var.Q;
                if (z4Var2.f22499j != null && z4.f22491r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i16 = -x4Var.P;
                    x4Var.P = i16;
                    AndroidUtilities.shakeViewSpring(view3, i16);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    z4Var2.f22499j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = x4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = w4Var;
        f2 f2Var = new f2(this, 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.f22446y = animationSet;
        animationSet.setAnimationListener(f2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f22447z = animationSet2;
        animationSet2.setAnimationListener(f2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout3 = relativeLayout;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout3, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f22444w = z4.a(relativeLayout3, 150, new u4(this, 0));
        this.f22445x = z4.a(relativeLayout3, 0, new u4(this, 1));
    }

    public static void a(x4 x4Var) {
        FrameLayout frameLayout = x4Var.f22431i;
        RelativeLayout relativeLayout = x4Var.f22429f;
        if (x4Var.M) {
            x4Var.f22430g.setY(relativeLayout.getHeight() - x4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            x4Var.h.setY(relativeLayout.getHeight() - x4Var.I.getHeight());
        }
    }

    public static boolean b(x4 x4Var) {
        boolean z4;
        boolean z10;
        AnimationSet animationSet = x4Var.f22447z;
        AnimationSet animationSet2 = x4Var.f22446y;
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
        w4 w4Var = this.h;
        int min = Math.min(4, Math.min(max, w4Var.getCount()));
        int count = w4Var.getCount();
        int i12 = this.E;
        if (min < count) {
            i11 = (int) (i12 * 0.5f);
        } else {
            i11 = 0;
        }
        return this.H.getHeight() + (min * i12) + i11;
    }

    public final void d() {
        this.f22429f.clearAnimation();
        this.f22430g.animate().cancel();
        this.h.animate().cancel();
        this.f22437o.stop();
        this.f22438p.stop();
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
        Interpolator interpolator = this.f22442t;
        w4 w4Var = this.h;
        ob1 ob1Var = this.f22430g;
        v4 v4Var = this.f22440r;
        Interpolator interpolator2 = this.f22441s;
        FrameLayout frameLayout = this.f22431i;
        RelativeLayout relativeLayout = this.f22429f;
        t4 t4Var = this.f22433k;
        if (z4) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f22438p;
            t4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x10 = relativeLayout.getX();
            p4 p4Var = new p4(this, width, width2, x10, relativeLayout.getWidth() + x10, 3);
            p4 p4Var2 = new p4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), 0);
            float x11 = frameLayout.getX();
            q4 q4Var = new q4(this, x11, (width2 + x11) - t4Var.getWidth(), width2, 0);
            p4Var.setInterpolator(interpolator2);
            p4Var.setDuration(e());
            p4Var2.setInterpolator(v4Var);
            p4Var2.setDuration(e());
            q4Var.setInterpolator(interpolator2);
            q4Var.setDuration(e());
            AnimationSet animationSet = this.f22447z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(p4Var);
            animationSet.addAnimation(p4Var2);
            animationSet.addAnimation(q4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            ob1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f22443u).setDuration(100L).start();
            w4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f22437o;
        t4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x12 = relativeLayout.getX();
        p4 p4Var3 = new p4(this, width3, width4, x12, x12 + relativeLayout.getWidth(), 1);
        p4 p4Var4 = new p4(this, height, height2, y10, 2);
        float x13 = frameLayout.getX();
        q4 q4Var2 = new q4(this, x13, t4Var.getWidth() + (x13 - width3), width4, 1);
        p4Var3.setInterpolator(v4Var);
        p4Var3.setDuration(e());
        p4Var4.setInterpolator(interpolator2);
        p4Var4.setDuration(e());
        q4Var2.setInterpolator(interpolator2);
        q4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f22446y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(p4Var3);
        animationSet2.addAnimation(p4Var4);
        animationSet2.addAnimation(q4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        ob1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = w4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        w4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f22429f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f22430g);
        if (this.I != null) {
            relativeLayout.addView(this.f22431i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f22426b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.f22427c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i10 = rect.top;
        int i11 = rect2.top;
        int i12 = i10 - i11;
        int i13 = rect2.bottom;
        int i14 = rect.bottom;
        int i15 = i13 - i14;
        int i16 = this.f22428e;
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
        RelativeLayout relativeLayout = this.f22429f;
        int x10 = ((int) relativeLayout.getX()) + width;
        int y10 = ((int) relativeLayout.getY()) + height;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), x10, y10);
    }

    public final void k() {
        FrameLayout frameLayout = this.f22431i;
        frameLayout.setEnabled(true);
        w4 w4Var = this.h;
        w4Var.awakenScrollBars();
        boolean z4 = this.N;
        PopupWindow popupWindow = this.f22427c;
        t4 t4Var = this.f22433k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.f22428e;
        ob1 ob1Var = this.f22430g;
        RelativeLayout relativeLayout = this.f22429f;
        if (z4) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            ob1Var.setAlpha(0.0f);
            ob1Var.setVisibility(4);
            w4Var.setAlpha(1.0f);
            w4Var.setVisibility(0);
            t4Var.setImageDrawable(this.f22435m);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i10);
            ob1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            w4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                ob1Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                w4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            ob1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            w4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        ob1Var.setAlpha(1.0f);
        ob1Var.setVisibility(0);
        w4Var.setAlpha(0.0f);
        w4Var.setVisibility(4);
        t4Var.setImageDrawable(this.f22436n);
        frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i10);
            ob1Var.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            w4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i11) - size3.getHeight());
                ob1Var.setY(0.0f);
                frameLayout.setY(0.0f);
                w4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i11);
            ob1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            w4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i10);
        relativeLayout.setY(i11);
        ob1Var.setX(0.0f);
        ob1Var.setY(0.0f);
    }

    public final void n() {
        boolean z4 = this.N;
        t4 t4Var = this.f22433k;
        FrameLayout frameLayout = this.f22431i;
        if (z4) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new n4(this, 0));
            t4Var.setClickable(false);
            t4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        t4Var.setClickable(true);
        t4Var.setOnClickListener(new n4(this, 1));
    }

    public final void o(int i10) {
        if (this.I != null) {
            int c3 = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != c3) {
                this.I = new Size(this.I.getWidth(), c3);
            }
            m(this.h, this.I);
            boolean z4 = this.N;
            RelativeLayout relativeLayout = this.f22429f;
            if (z4) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - c3;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f22431i;
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
        PopupWindow popupWindow = this.f22427c;
        popupWindow.setWidth(i12);
        popupWindow.setHeight((this.f22428e * 2) + i10);
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f22429f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
