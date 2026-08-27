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
import android.util.Property;
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
import org.telegram.ui.ra1;

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

    public final Context f23782a;

    public final View f23783b;

    public final PopupWindow f23784c;
    public final int d;

    public final int f23785e;

    public final RelativeLayout f23786f;

    public final ra1 f23787g;
    public final s4 h;

    public final FrameLayout f23788i;

    public final View f23789j;

    public final p4 f23790k;

    public final TextView f23791l;

    public final Drawable f23792m;

    public final Drawable f23793n;

    public final AnimatedVectorDrawable f23794o;

    public final AnimatedVectorDrawable f23795p;

    public final com.google.firebase.messaging.o f23796q;

    public final r4 f23797r;

    public final Interpolator f23798s;

    public final Interpolator f23799t;

    public final Interpolator f23800u;
    public final AnimatorSet v;

    public final AnimatorSet f23801w;

    public final AnimatorSet f23802x;

    public final AnimationSet f23803y;

    public final AnimationSet f23804z;

    public t4(v4 v4Var, Context context, View view) {
        float f10;
        int i10;
        int iV0;
        ?? r16;
        this.Q = v4Var;
        new u2(this, 3);
        this.F = true;
        this.L = new o4(this);
        this.P = -4;
        this.f23783b = view;
        this.f23782a = context;
        c6 c6Var = v4Var.f23914n;
        int i11 = v4Var.f23909i;
        ?? relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iDp = AndroidUtilities.dp(20.0f);
        marginLayoutParams.rightMargin = iDp;
        marginLayoutParams.topMargin = iDp;
        marginLayoutParams.leftMargin = iDp;
        marginLayoutParams.bottomMargin = iDp;
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.setElevation(AndroidUtilities.dp(1.0f));
        relativeLayout.setFocusable(true);
        relativeLayout.setFocusableInTouchMode(true);
        ?? r10 = v4Var.f23915o;
        int i12 = 4;
        if (r10 != 0) {
            lg.d dVarC = r10.c(relativeLayout, null, true);
            mg.d dVar = new mg.d(c6Var);
            f10 = 1.0f;
            dVar.f18050e = new ng.a(i12);
            dVar.d(687865855, 687865855);
            dVar.c(352321535, 352321535);
            float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
            float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
            dVar.f18051f = fDpf2;
            dVar.h = fDpf3;
            dVarC.n(dVar);
            dVarC.p(AndroidUtilities.dp(12.0f));
            relativeLayout.setBackground(dVarC);
        } else {
            f10 = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float fDp = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{fDp, fDp, fDp, fDp, fDp, fDp, fDp, fDp});
            if (i11 == 0) {
                gradientDrawable.setColor(g6.v0(g6.f23124h5, c6Var));
            } else if (i11 == 2) {
                gradientDrawable.setColor(-115203550);
            } else if (i11 == 1) {
                gradientDrawable.setColor(g6.v0(g6.f23053d6, c6Var));
            }
            relativeLayout.setBackground(gradientDrawable);
        }
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout.setClipToOutline(true);
        this.f23786f = relativeLayout;
        ?? m5Var = new lh.m5(relativeLayout.getContext(), 2);
        PopupWindow popupWindow = new PopupWindow((View) m5Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        m5Var.addView(relativeLayout);
        this.f23784c = popupWindow;
        this.d = AndroidUtilities.dp(16.0f);
        this.f23785e = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(8.0f);
        this.f23797r = new r4();
        this.f23798s = AnimationUtils.loadInterpolator(context, 17563661);
        this.f23799t = AnimationUtils.loadInterpolator(context, 17563662);
        this.f23800u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable drawableMutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
        this.f23792m = drawableMutate;
        drawableMutate.setAutoMirrored(true);
        Drawable drawableMutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
        this.f23793n = drawableMutate2;
        drawableMutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
        this.f23794o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
        this.f23795p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23788i = frameLayout;
        p4 p4Var = new p4(this, context);
        this.f23790k = p4Var;
        p4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
        p4Var.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        p4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        p4Var.setImageDrawable(drawableMutate2);
        TextView textView = new TextView(context);
        this.f23791l = textView;
        textView.setText(LocaleController.getString(R.string.Back));
        textView.setTextSize(1, 16.0f);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.f23789j = view2;
        if (i11 == 0) {
            int i13 = g6.f23161j5;
            int iV1 = g6.v0(i13, c6Var);
            int i14 = g6.f23144i6;
            r16 = relativeLayout;
            i10 = iDp2;
            p4Var.setBackground(g6.f0(g6.v0(i14, c6Var), 1, -1));
            frameLayout.setBackground(g6.f0(g6.v0(i14, c6Var), 2, -1));
            view2.setBackgroundColor(g6.l1(0.4f, g6.v0(i13, c6Var)));
            iV0 = iV1;
        } else {
            i10 = iDp2;
            ?? r17 = relativeLayout;
            if (i11 == 2) {
                p4Var.setBackground(g6.f0(553648127, 1, -1));
                frameLayout.setBackground(g6.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                iV0 = -328966;
                r16 = r17;
            } else {
                iV0 = g6.v0(g6.G6, c6Var);
                int i15 = g6.f23144i6;
                p4Var.setBackground(g6.f0(g6.v0(i15, c6Var), 1, -1));
                frameLayout.setBackground(g6.f0(g6.v0(i15, c6Var), 2, -1));
                view2.setBackgroundColor(g6.v0(g6.f23054d7, c6Var));
                r16 = r17;
            }
        }
        drawableMutate2.setTint(iV0);
        drawableMutate.setTint(iV0);
        animatedVectorDrawable.setTint(iV0);
        animatedVectorDrawable2.setTint(iV0);
        textView.setTextColor(iV0);
        p4Var.setOnClickListener(new j4(this, 2));
        frameLayout.addView(p4Var, h7.z5.e(-2, -2, 19));
        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, h7.z5.a(-1.0f, f10 / AndroidUtilities.density, 55));
        p4Var.measure(0, 0);
        this.H = new Size(p4Var.getMeasuredWidth(), p4Var.getMeasuredHeight());
        this.f23787g = new ra1(this, context, 6);
        this.f23796q = new com.google.firebase.messaging.o(this, context, i10);
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
            public final void onItemClick(AdapterView adapterView, View view3, int i16, long j10) {
                t4 t4Var = this.f23611a;
                t4Var.getClass();
                MenuItem menuItem = (MenuItem) s4Var.getAdapter().getItem(i16);
                v4 v4Var2 = t4Var.Q;
                if (v4Var2.f23910j == null || !v4.f23902r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    MenuItem.OnMenuItemClickListener onMenuItemClickListener = t4Var.K;
                    if (onMenuItemClickListener != null) {
                        onMenuItemClickListener.onMenuItemClick(menuItem);
                        return;
                    }
                    return;
                }
                int i17 = -t4Var.P;
                t4Var.P = i17;
                AndroidUtilities.shakeViewSpring(view3, i17);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                v4Var2.f23910j.run();
            }
        });
        this.h = s4Var;
        int i16 = 1;
        d2 d2Var = new d2(this, i16);
        AnimationSet animationSet = new AnimationSet(true);
        this.f23803y = animationSet;
        animationSet.setAnimationListener(d2Var);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f23804z = animationSet2;
        animationSet2.setAnimationListener(d2Var);
        AnimatorSet animatorSet = new AnimatorSet();
        ?? r11 = r16;
        animatorSet.playTogether(ObjectAnimator.ofFloat(r11, (Property<??, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.f23801w = v4.a(r11, 150, new q4(this, 0));
        this.f23802x = v4.a(r11, 0, new q4(this, i16));
    }

    public static void a(t4 t4Var) {
        FrameLayout frameLayout = t4Var.f23788i;
        RelativeLayout relativeLayout = t4Var.f23786f;
        if (t4Var.M) {
            t4Var.f23787g.setY(relativeLayout.getHeight() - t4Var.J.getHeight());
            frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
            t4Var.h.setY(relativeLayout.getHeight() - t4Var.I.getHeight());
        }
    }

    public static boolean b(t4 t4Var) {
        AnimationSet animationSet = t4Var.f23804z;
        AnimationSet animationSet2 = t4Var.f23803y;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
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
        int iMax = Math.max(2, i10);
        s4 s4Var = this.h;
        int iMin = Math.min(4, Math.min(iMax, s4Var.getCount()));
        int count = s4Var.getCount();
        int i11 = this.E;
        return this.H.getHeight() + (iMin * i11) + (iMin < count ? (int) (i11 * 0.5f) : 0);
    }

    public final void d() {
        this.f23786f.clearAnimation();
        this.f23787g.animate().cancel();
        this.h.animate().cancel();
        this.f23794o.stop();
        this.f23795p.stop();
    }

    public final int e() {
        int i10 = this.O;
        if (i10 < 150) {
            return Math.max(200, 0);
        }
        return i10 > 300 ? 300 : 250;
    }

    public final boolean f() {
        return (this.F || this.G) ? false : true;
    }

    public final void g() {
        boolean z10 = this.N;
        Interpolator interpolator = this.f23799t;
        s4 s4Var = this.h;
        ra1 ra1Var = this.f23787g;
        r4 r4Var = this.f23797r;
        Interpolator interpolator2 = this.f23798s;
        FrameLayout frameLayout = this.f23788i;
        RelativeLayout relativeLayout = this.f23786f;
        p4 p4Var = this.f23790k;
        if (z10) {
            AnimatedVectorDrawable animatedVectorDrawable = this.f23795p;
            p4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x8 = relativeLayout.getX();
            l4 l4Var = new l4(this, width, width2, x8, relativeLayout.getWidth() + x8, 3);
            int i10 = 0;
            l4 l4Var2 = new l4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), i10);
            float x10 = frameLayout.getX();
            m4 m4Var = new m4(this, x10, (width2 + x10) - p4Var.getWidth(), width2, i10);
            l4Var.setInterpolator(interpolator2);
            l4Var.setDuration(e());
            l4Var2.setInterpolator(r4Var);
            l4Var2.setDuration(e());
            m4Var.setInterpolator(interpolator2);
            m4Var.setDuration(e());
            AnimationSet animationSet = this.f23804z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(l4Var);
            animationSet.addAnimation(l4Var2);
            animationSet.addAnimation(m4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            ra1Var.animate().alpha(1.0f).withLayer().setInterpolator(this.f23800u).setDuration(100L).start();
            s4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f23794o;
        p4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y10 = relativeLayout.getY();
        float x11 = relativeLayout.getX();
        l4 l4Var3 = new l4(this, width3, width4, x11, x11 + relativeLayout.getWidth(), 1);
        l4 l4Var4 = new l4(this, height, height2, y10, 2);
        float x12 = frameLayout.getX();
        m4 m4Var2 = new m4(this, x12, p4Var.getWidth() + (x12 - width3), width4, 1);
        l4Var3.setInterpolator(r4Var);
        l4Var3.setDuration(e());
        l4Var4.setInterpolator(interpolator2);
        l4Var4.setDuration(e());
        m4Var2.setInterpolator(interpolator2);
        m4Var2.setDuration(e());
        AnimationSet animationSet2 = this.f23803y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(l4Var3);
        animationSet2.addAnimation(l4Var4);
        animationSet2.addAnimation(m4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        ra1Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = s4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        s4Var.setAlpha(1.0f);
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f23786f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.f23787g);
        if (this.I != null) {
            relativeLayout.addView(this.f23788i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.f23783b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int iCenterX = rect.centerX();
        PopupWindow popupWindow = this.f23784c;
        int iMin = Math.min(iCenterX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i10 = rect.top;
        int i11 = rect2.top;
        int i12 = i10 - i11;
        int i13 = rect2.bottom;
        int iMax = rect.bottom;
        int i14 = i13 - iMax;
        int i15 = this.f23785e;
        int i16 = i15 * 2;
        int i17 = this.E;
        int i18 = i17 + i16;
        if (this.I != null) {
            int iC = c(2) + i16;
            int i19 = (rect2.bottom - rect.top) + i18;
            int i20 = (rect.bottom - rect2.top) + i18;
            if (i12 >= iC) {
                o(i12 - i16);
                iMax = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i12 >= i18 && i19 >= iC) {
                o(i19 - i16);
                iMax = rect.top - i18;
                this.M = false;
            } else if (i14 >= iC) {
                o(i14 - i16);
                iMax = rect.bottom;
                this.M = false;
            } else if (i14 < i18 || rect2.height() < iC) {
                o(rect2.height() - i16);
                iMax = rect2.top;
                this.M = false;
            } else {
                o(i20 - i16);
                iMax = (rect.bottom + i18) - popupWindow.getHeight();
                this.M = true;
            }
        } else if (i12 >= i18) {
            iMax = i10 - i18;
        } else if (i14 < i18) {
            iMax = i14 >= i17 ? iMax - i15 : Math.max(i11, i10 - i18);
        }
        View rootView = view.getRootView();
        int[] iArr = this.C;
        rootView.getLocationOnScreen(iArr);
        int i21 = iArr[0];
        int i22 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.B.set(Math.max(0, iMin - (i21 - iArr[0])), Math.max(0, iMax - (i22 - iArr[1])));
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
        RelativeLayout relativeLayout = this.f23786f;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), ((int) relativeLayout.getX()) + width, ((int) relativeLayout.getY()) + height);
    }

    public final void k() {
        FrameLayout frameLayout = this.f23788i;
        frameLayout.setEnabled(true);
        s4 s4Var = this.h;
        s4Var.awakenScrollBars();
        boolean z10 = this.N;
        PopupWindow popupWindow = this.f23784c;
        p4 p4Var = this.f23790k;
        int i10 = this.d;
        Size size = this.H;
        int i11 = this.f23785e;
        ra1 ra1Var = this.f23787g;
        RelativeLayout relativeLayout = this.f23786f;
        if (z10) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            ra1Var.setAlpha(0.0f);
            ra1Var.setVisibility(4);
            s4Var.setAlpha(1.0f);
            s4Var.setVisibility(0);
            p4Var.setImageDrawable(this.f23792m);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i10);
            ra1Var.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            s4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i11);
                ra1Var.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                s4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i11);
            ra1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            s4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        ra1Var.setAlpha(1.0f);
        ra1Var.setVisibility(0);
        s4Var.setAlpha(0.0f);
        s4Var.setVisibility(4);
        p4Var.setImageDrawable(this.f23793n);
        frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.I == null) {
            relativeLayout.setX(i10);
            relativeLayout.setY(i11);
            ra1Var.setX(0.0f);
            ra1Var.setY(0.0f);
            return;
        }
        relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i10);
        ra1Var.setX(0.0f);
        frameLayout.setX(size3.getWidth() - size.getWidth());
        s4Var.setX(size3.getWidth() - this.I.getWidth());
        if (this.M) {
            relativeLayout.setY((this.I.getHeight() + i11) - size3.getHeight());
            ra1Var.setY(0.0f);
            frameLayout.setY(0.0f);
            s4Var.setY(size3.getHeight() - this.I.getHeight());
            return;
        }
        relativeLayout.setY(i11);
        ra1Var.setY(0.0f);
        frameLayout.setY(0.0f);
        s4Var.setY(size.getHeight());
    }

    public final void n() {
        boolean z10 = this.N;
        p4 p4Var = this.f23790k;
        FrameLayout frameLayout = this.f23788i;
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

    public final void o(int i10) {
        if (this.I != null) {
            int iC = c((i10 - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != iC) {
                this.I = new Size(this.I.getWidth(), iC);
            }
            m(this.h, this.I);
            boolean z10 = this.N;
            RelativeLayout relativeLayout = this.f23786f;
            if (z10) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - iC;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.f23788i;
                    frameLayout.setY(frameLayout.getY() - height);
                }
            } else {
                m(relativeLayout, this.J);
            }
            p();
        }
    }

    public final void p() {
        int iMax;
        Size size = this.J;
        int iMax2 = 0;
        if (size != null) {
            iMax2 = Math.max(0, size.getWidth());
            iMax = Math.max(0, this.J.getHeight());
        } else {
            iMax = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            iMax2 = Math.max(iMax2, size2.getWidth());
            iMax = Math.max(iMax, this.I.getHeight());
        }
        int i10 = (this.d * 2) + iMax2;
        PopupWindow popupWindow = this.f23784c;
        popupWindow.setWidth(i10);
        popupWindow.setHeight((this.f23785e * 2) + iMax);
        Size size3 = this.J;
        if (size3 == null || this.I == null) {
            return;
        }
        int width = size3.getWidth() - this.I.getWidth();
        int height = this.I.getHeight() - this.J.getHeight();
        this.O = (int) (Math.sqrt((height * height) + (width * width)) / ((double) this.f23786f.getContext().getResources().getDisplayMetrics().density));
    }
}
