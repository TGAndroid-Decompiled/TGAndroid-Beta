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
public abstract class a5 extends FrameLayout implements org.telegram.messenger.vs {
    public static final int F = 0;
    public x4 D;
    public boolean E;
    public final OvershootInterpolator f35563a;
    public final l0 f35564b;
    public final ig.s f35565c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final t4 e;
    public final org.telegram.ui.ActionBar.p6 f35566f;
    public final hi.b h;
    public AnimatorSet f35567n;
    public boolean f35568r;
    public b5[] f35569s;
    public final View f35570w;
    public boolean f35571x;
    public String f35572y;

    public a5(Context context, org.telegram.ui.ActionBar.p6 p6Var, t4 t4Var) {
        super(context);
        this.f35563a = new OvershootInterpolator(1.02f);
        hi.b bVar = new hi.b();
        this.h = bVar;
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        new Matrix();
        this.e = t4Var;
        this.f35566f = p6Var;
        bVar2.h = new zg.h(this);
        bVar2.f48713i = this;
        View view = new View(context);
        this.f35570w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.b6.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 2);
        this.f35564b = l0Var;
        addView(l0Var, w7.b6.c(-1.0f, -1));
        ig.s sVar = new ig.s(context, p6Var);
        this.f35565c = sVar;
        bi.d2 d2Var = rf.e0.f46537a;
        sVar.setOutlineProvider(new rf.c0(0, org.telegram.messenger.i0.L(12.0f)));
        sVar.setElevation(org.telegram.messenger.i0.L(4.0f));
        sVar.setClipToOutline(true);
        l0Var.addView(sVar, w7.b6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            sVar.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            sVar.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232561, 0, context, p6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        vg.f c10 = bVar2.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(w7.b9.k(p6Var));
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.P.e = true;
        c10.q(org.telegram.messenger.i0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(v4 v4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f35569s = v4Var.f42409i;
        if (v4Var.f42406c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ig.s sVar = this.f35565c;
        sVar.f8443b = z10;
        sVar.invalidate();
        this.f35572y = v4Var.f42407f;
        x4 x4Var = this.D;
        if (x4Var != null) {
            if (x4Var.f43226g) {
                x4Var.f43226g = false;
                x4Var.f43223b.n(x4Var.f43222a, x4Var.e);
            }
            this.D = null;
        }
        x4 x4Var2 = v4Var.f42410j;
        if (x4Var2 != null) {
            this.D = x4Var2;
            mg.f0 f0Var = new mg.f0(2, this, v4Var);
            if (!x4Var2.f43226g) {
                x4Var2.f43226g = true;
                x4Var2.f43225f = f0Var;
                x4Var2.f43223b.b(x4Var2.f43222a, x4Var2.e);
                x4Var2.a();
            }
        }
        int i10 = org.telegram.messenger.e20.f15506s0;
        org.telegram.messenger.jc jcVar = v4Var.f42406c;
        String str = v4Var.e;
        org.telegram.messenger.jc jcVar2 = v4Var.f42404a;
        org.telegram.messenger.jc jcVar3 = v4Var.f42405b;
        String str2 = v4Var.d;
        BitmapDrawable bitmapDrawable = v4Var.f42408g;
        Object obj = v4Var.h;
        org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) sVar.d;
        g9Var.getImageReceiver().d = i10;
        g9Var.getImageReceiver().u0(jcVar, str, jcVar2, null, jcVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        g9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            b5[] b5VarArr = this.f35569s;
            if (i11 < b5VarArr.length) {
                b5 b5Var = b5VarArr[i11];
                String L0 = org.telegram.messenger.dd.L0(b5Var.f35945b, b5Var.f35944a);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f35569s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, b5Var.f35946c, L0, false, this.f35566f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new ag.t0(25, this, b5Var));
                i11++;
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            } else {
                b(true);
                return;
            }
        }
    }

    public final void b(final boolean z10) {
        TimeInterpolator timeInterpolator;
        long j10;
        if (this.f35568r == z10) {
            return;
        }
        this.f35568r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f35563a;
        } else {
            timeInterpolator = org.telegram.ui.Components.gr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final a5 f43556b;

            {
                this.f43556b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        a5 a5Var = this.f43556b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var.d;
                        l0 l0Var = a5Var.f35564b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.u.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        a5Var.f35565c.setTranslationY(org.telegram.messenger.i0.L(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.i0.L(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        a5 a5Var2 = this.f43556b;
                        a5Var2.f35570w.setAlpha(floatValue2);
                        a5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final a5 f43556b;

            {
                this.f43556b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        a5 a5Var = this.f43556b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var.d;
                        l0 l0Var = a5Var.f35564b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.u.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        a5Var.f35565c.setTranslationY(org.telegram.messenger.i0.L(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.i0.L(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        a5 a5Var2 = this.f43556b;
                        a5Var2.f35570w.setAlpha(floatValue2);
                        a5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f35567n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f35567n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f35567n.playTogether(ofFloat, ofFloat2);
        this.f35567n.addListener(new eg.m(6, this, z10));
        this.f35567n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ig.s sVar = this.f35565c;
        boolean z10 = sVar.f8443b;
        RadialProgress2 radialProgress2 = (RadialProgress2) sVar.e;
        if (z10 && !TextUtils.isEmpty(this.f35572y)) {
            if (i10 == org.telegram.messenger.at.Y1) {
                if (TextUtils.equals((String) objArr[0], this.f35572y)) {
                    radialProgress2.p(true, 1.0f);
                }
            } else if (i10 == org.telegram.messenger.at.X1 && TextUtils.equals((String) objArr[0], this.f35572y)) {
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
        org.telegram.messenger.at.f(org.telegram.messenger.e20.f15506s0).c(this, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at.f(org.telegram.messenger.e20.f15506s0).c(this, org.telegram.messenger.at.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(org.telegram.messenger.e20.f15506s0).n(this, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at.f(org.telegram.messenger.e20.f15506s0).n(this, org.telegram.messenger.at.X1);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != 0 && i11 != 0 && this.f35568r) {
            this.f35570w.setBackground(null);
            org.telegram.messenger.i0.g3(new qr0(this, 12));
        }
        yg.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
