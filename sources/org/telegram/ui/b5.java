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
public abstract class b5 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int G = 0;
    public y4 E;
    public boolean F;
    public final OvershootInterpolator f45912a;
    public final k0 f45913b;
    public final t4 f45914c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 f45915e;
    public final org.telegram.ui.ActionBar.i6 f45916f;
    public final ui.b h;
    public AnimatorSet f45917n;
    public boolean f45918r;
    public c5[] f45919s;
    public final View f45920w;
    public boolean f45921x;
    public String f45922y;

    public b5(Context context, org.telegram.ui.ActionBar.i6 i6Var, u4 u4Var) {
        super(context);
        this.f45912a = new OvershootInterpolator(1.02f);
        ui.b bVar = new ui.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        new Matrix();
        this.f45915e = u4Var;
        this.f45916f = i6Var;
        cVar.h = new jh.k(this);
        cVar.f8371i = this;
        View view = new View(context);
        this.f45920w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, c8.na.c(-1.0f, -1));
        k0 k0Var = new k0(2, context, this);
        this.f45913b = k0Var;
        addView(k0Var, c8.na.c(-1.0f, -1));
        t4 t4Var = new t4(context, i6Var);
        this.f45914c = t4Var;
        bg.q0 q0Var = bg.u0.f3313a;
        t4Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(12.0f)));
        t4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        t4Var.setClipToOutline(true);
        k0Var.addView(t4Var, c8.na.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            t4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 0, context, i6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.p(c8.j0.l(i6Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.f11633e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.na.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f45919s = w4Var.f53108i;
        if (w4Var.f53104c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t4 t4Var = this.f45914c;
        t4Var.f52237c = z10;
        t4Var.invalidate();
        this.f45922y = w4Var.f53106f;
        y4 y4Var = this.E;
        if (y4Var != null) {
            if (y4Var.f54189g) {
                y4Var.f54189g = false;
                y4Var.f54185b.n(y4Var.f54184a, y4Var.f54187e);
            }
            this.E = null;
        }
        y4 y4Var2 = w4Var.f53109j;
        if (y4Var2 != null) {
            this.E = y4Var2;
            di.d7 d7Var = new di.d7(3, this, w4Var);
            if (!y4Var2.f54189g) {
                y4Var2.f54189g = true;
                y4Var2.f54188f = d7Var;
                y4Var2.f54185b.b(y4Var2.f54184a, y4Var2.f54187e);
                y4Var2.a();
            }
        }
        int i7 = org.telegram.messenger.i10.f24637t0;
        org.telegram.messenger.fc fcVar = w4Var.f53104c;
        String str = w4Var.f53105e;
        org.telegram.messenger.fc fcVar2 = w4Var.f53102a;
        org.telegram.messenger.fc fcVar3 = w4Var.f53103b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.f53107g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) t4Var.d;
        p9Var.getImageReceiver().d = i7;
        p9Var.getImageReceiver().v0(fcVar, str, fcVar2, null, fcVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        p9Var.e();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            c5[] c5VarArr = this.f45919s;
            if (i10 < c5VarArr.length) {
                c5 c5Var = c5VarArr[i10];
                String N0 = org.telegram.messenger.gd.N0(c5Var.f46714b, c5Var.f46713a);
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 == this.f45919s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.f46715c, N0, false, this.f45916f);
                c10.setTag(Integer.valueOf(i10));
                c10.setOnClickListener(new oi.i1(5, this, c5Var));
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
        if (this.f45918r == z10) {
            return;
        }
        this.f45918r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f45912a;
        } else {
            timeInterpolator = org.telegram.ui.Components.kr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f54519b;

            {
                this.f54519b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f54519b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f45913b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.m9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.f45914c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
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
                        b5 b5Var2 = this.f54519b;
                        b5Var2.f45920w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f54519b;

            {
                this.f54519b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f54519b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f45913b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = c8.m9.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f10);
                        k0Var.setScaleY(f10);
                        k0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        b5Var.f45914c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
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
                        b5 b5Var2 = this.f54519b;
                        b5Var2.f45920w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f45917n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45917n = animatorSet2;
        if (z10) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f45917n.playTogether(ofFloat, ofFloat2);
        this.f45917n.addListener(new bi.j7(21, this, z10));
        this.f45917n.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t4 t4Var = this.f45914c;
        boolean z10 = t4Var.f52237c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.f52238e;
        if (z10 && !TextUtils.isEmpty(this.f45922y)) {
            if (i7 == org.telegram.messenger.ks.Y1) {
                if (TextUtils.equals((String) objArr[0], this.f45922y)) {
                    radialProgress2.p(true, 1.0f);
                }
            } else if (i7 == org.telegram.messenger.ks.X1 && TextUtils.equals((String) objArr[0], this.f45922y)) {
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
        org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0).c(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0).c(this, org.telegram.messenger.ks.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0).n(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0).n(this, org.telegram.messenger.ks.X1);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 != 0 && i10 != 0 && this.f45918r) {
            this.f45920w.setBackground(null);
            org.telegram.messenger.g0.g3(new hq0(this, 12));
        }
        ih.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
