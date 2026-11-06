package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgress2;
public abstract class b5 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int F = 0;
    public y4 D;
    public boolean E;
    public final OvershootInterpolator f44182a;
    public final k0 f44183b;
    public final t4 f44184c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 f44185e;
    public final org.telegram.ui.ActionBar.f6 f44186f;
    public final ri.b h;
    public AnimatorSet f44187n;
    public boolean f44188r;
    public c5[] f44189s;
    public final View f44190w;
    public boolean f44191x;
    public String f44192y;

    public b5(Context context, org.telegram.ui.ActionBar.f6 f6Var, u4 u4Var) {
        super(context);
        this.f44182a = new OvershootInterpolator(1.02f);
        ri.b bVar = new ri.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        new Matrix();
        this.f44185e = u4Var;
        this.f44186f = f6Var;
        cVar.h = new jh.k(this);
        cVar.f8708i = this;
        View view = new View(context);
        this.f44190w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, c8.ha.c(-1.0f, -1));
        k0 k0Var = new k0(2, context, this);
        this.f44183b = k0Var;
        addView(k0Var, c8.ha.c(-1.0f, -1));
        t4 t4Var = new t4(context, f6Var);
        this.f44184c = t4Var;
        bg.q0 q0Var = bg.u0.f3380a;
        t4Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(12.0f)));
        t4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        t4Var.setClipToOutline(true);
        k0Var.addView(t4Var, c8.ha.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            t4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232564, 0, context, f6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.p(c8.g0.k(f6Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.Q.f11508e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        this.f44189s = w4Var.f50921i;
        if (w4Var.f50917c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        t4 t4Var = this.f44184c;
        t4Var.f49915c = z9;
        t4Var.invalidate();
        this.f44192y = w4Var.f50919f;
        y4 y4Var = this.D;
        if (y4Var != null) {
            if (y4Var.f52073g) {
                y4Var.f52073g = false;
                y4Var.f52069b.n(y4Var.f52068a, y4Var.f52071e);
            }
            this.D = null;
        }
        y4 y4Var2 = w4Var.f50922j;
        if (y4Var2 != null) {
            this.D = y4Var2;
            bi.h8 h8Var = new bi.h8(3, this, w4Var);
            if (!y4Var2.f52073g) {
                y4Var2.f52073g = true;
                y4Var2.f52072f = h8Var;
                y4Var2.f52069b.b(y4Var2.f52068a, y4Var2.f52071e);
                y4Var2.a();
            }
        }
        int i7 = org.telegram.messenger.p10.f24467s0;
        org.telegram.messenger.hc hcVar = w4Var.f50917c;
        String str = w4Var.f50918e;
        org.telegram.messenger.hc hcVar2 = w4Var.f50915a;
        org.telegram.messenger.hc hcVar3 = w4Var.f50916b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.f50920g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) t4Var.d;
        l9Var.getImageReceiver().d = i7;
        l9Var.getImageReceiver().u0(hcVar, str, hcVar2, null, hcVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        l9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            c5[] c5VarArr = this.f44189s;
            if (i10 < c5VarArr.length) {
                c5 c5Var = c5VarArr[i10];
                String M0 = org.telegram.messenger.hd.M0(c5Var.f44661b, c5Var.f44660a);
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == this.f44189s.length - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.f44662c, M0, false, this.f44186f);
                c10.setTag(Integer.valueOf(i10));
                c10.setOnClickListener(new org.telegram.ui.ActionBar.l1(3, this, c5Var));
                i10++;
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            } else {
                b(true);
                return;
            }
        }
    }

    public final void b(final boolean z9) {
        TimeInterpolator timeInterpolator;
        long j3;
        if (this.f44188r == z9) {
            return;
        }
        this.f44188r = z9;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z9) {
            timeInterpolator = this.f44182a;
        } else {
            timeInterpolator = org.telegram.ui.Components.xq.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f52466b;

            {
                this.f52466b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f52466b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f44183b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.j9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.f44184c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.f52466b;
                        b5Var2.f44190w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f52466b;

            {
                this.f52466b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f52466b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f44183b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.j9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.f44184c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z9) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.f52466b;
                        b5Var2.f44190w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f44187n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44187n = animatorSet2;
        if (z9) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f44187n.playTogether(ofFloat, ofFloat2);
        this.f44187n.addListener(new ch.y(20, this, z9));
        this.f44187n.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t4 t4Var = this.f44184c;
        boolean z9 = t4Var.f49915c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.f49916e;
        if (z9 && !TextUtils.isEmpty(this.f44192y)) {
            if (i7 == org.telegram.messenger.qs.Y1) {
                if (TextUtils.equals((String) objArr[0], this.f44192y)) {
                    radialProgress2.p(true, 1.0f);
                }
            } else if (i7 == org.telegram.messenger.qs.X1 && TextUtils.equals((String) objArr[0], this.f44192y)) {
                radialProgress2.p(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 111) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
            b(false);
            return true;
        } else {
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0).c(this, org.telegram.messenger.qs.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0).n(this, org.telegram.messenger.qs.X1);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 != 0 && i10 != 0 && this.f44188r) {
            this.f44190w.setBackground(null);
            org.telegram.messenger.g0.h3(new gq0(this, 12));
        }
        ih.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
