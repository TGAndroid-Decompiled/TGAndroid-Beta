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
public abstract class b5 extends FrameLayout implements org.telegram.messenger.is {
    public static final int G = 0;
    public y4 E;
    public boolean F;
    public final OvershootInterpolator f45584a;
    public final k0 f45585b;
    public final t4 f45586c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 f45587e;
    public final org.telegram.ui.ActionBar.e6 f45588f;
    public final ui.b h;
    public AnimatorSet f45589n;
    public boolean f45590r;
    public c5[] f45591s;
    public final View f45592w;
    public boolean f45593x;
    public String f45594y;

    public b5(Context context, org.telegram.ui.ActionBar.e6 e6Var, u4 u4Var) {
        super(context);
        this.f45584a = new OvershootInterpolator(1.02f);
        ui.b bVar = new ui.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        new Matrix();
        this.f45587e = u4Var;
        this.f45588f = e6Var;
        cVar.h = new jh.k(this);
        cVar.f8095i = this;
        View view = new View(context);
        this.f45592w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, c8.ja.c(-1.0f, -1));
        k0 k0Var = new k0(2, context, this);
        this.f45585b = k0Var;
        addView(k0Var, c8.ja.c(-1.0f, -1));
        t4 t4Var = new t4(context, e6Var);
        this.f45586c = t4Var;
        bg.p0 p0Var = bg.t0.f3332a;
        t4Var.setOutlineProvider(new bg.r0(0, org.telegram.messenger.g0.L(12.0f)));
        t4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        t4Var.setClipToOutline(true);
        k0Var.addView(t4Var, c8.ja.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            t4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 0, context, e6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.p(c8.g0.k(e6Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.f11322e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ja.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f45591s = w4Var.f52396i;
        if (w4Var.f52392c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t4 t4Var = this.f45586c;
        t4Var.f51349c = z10;
        t4Var.invalidate();
        this.f45594y = w4Var.f52394f;
        y4 y4Var = this.E;
        if (y4Var != null) {
            if (y4Var.f53409g) {
                y4Var.f53409g = false;
                y4Var.f53405b.n(y4Var.f53404a, y4Var.f53407e);
            }
            this.E = null;
        }
        y4 y4Var2 = w4Var.f52397j;
        if (y4Var2 != null) {
            this.E = y4Var2;
            di.a7 a7Var = new di.a7(3, this, w4Var);
            if (!y4Var2.f53409g) {
                y4Var2.f53409g = true;
                y4Var2.f53408f = a7Var;
                y4Var2.f53405b.b(y4Var2.f53404a, y4Var2.f53407e);
                y4Var2.a();
            }
        }
        int i7 = org.telegram.messenger.m10.f24934t0;
        org.telegram.messenger.gc gcVar = w4Var.f52392c;
        String str = w4Var.f52393e;
        org.telegram.messenger.gc gcVar2 = w4Var.f52390a;
        org.telegram.messenger.gc gcVar3 = w4Var.f52391b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.f52395g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) t4Var.d;
        i9Var.getImageReceiver().d = i7;
        i9Var.getImageReceiver().u0(gcVar, str, gcVar2, null, gcVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        i9Var.e();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            c5[] c5VarArr = this.f45591s;
            if (i10 < c5VarArr.length) {
                c5 c5Var = c5VarArr[i10];
                String M0 = org.telegram.messenger.hd.M0(c5Var.f46015b, c5Var.f46014a);
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 == this.f45591s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.f46016c, M0, false, this.f45588f);
                c10.setTag(Integer.valueOf(i10));
                c10.setOnClickListener(new org.telegram.messenger.video.e(10, this, c5Var));
                i10++;
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            } else {
                b(true);
                return;
            }
        }
    }

    public final void b(final boolean z10) {
        TimeInterpolator timeInterpolator;
        long j3;
        if (this.f45590r == z10) {
            return;
        }
        this.f45590r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f45584a;
        } else {
            timeInterpolator = org.telegram.ui.Components.er.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f53839b;

            {
                this.f53839b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f53839b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f45585b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.i9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.f45586c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.f53839b;
                        b5Var2.f45592w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f53839b;

            {
                this.f53839b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f53839b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f45585b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.i9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.f45586c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.f53839b;
                        b5Var2.f45592w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f45589n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45589n = animatorSet2;
        if (z10) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f45589n.playTogether(ofFloat, ofFloat2);
        this.f45589n.addListener(new bi.v4(21, this, z10));
        this.f45589n.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t4 t4Var = this.f45586c;
        boolean z10 = t4Var.f51349c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.f51350e;
        if (z10 && !TextUtils.isEmpty(this.f45594y)) {
            if (i7 == org.telegram.messenger.ns.Y1) {
                if (TextUtils.equals((String) objArr[0], this.f45594y)) {
                    radialProgress2.p(true, 1.0f);
                }
            } else if (i7 == org.telegram.messenger.ns.X1 && TextUtils.equals((String) objArr[0], this.f45594y)) {
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
        org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24934t0).c(this, org.telegram.messenger.ns.Y1);
        org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24934t0).c(this, org.telegram.messenger.ns.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24934t0).n(this, org.telegram.messenger.ns.Y1);
        org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24934t0).n(this, org.telegram.messenger.ns.X1);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 != 0 && i10 != 0 && this.f45590r) {
            this.f45592w.setBackground(null);
            org.telegram.messenger.g0.h3(new fq0(this, 12));
        }
        ih.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
