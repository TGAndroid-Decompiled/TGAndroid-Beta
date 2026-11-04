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
public abstract class d5 extends FrameLayout implements org.telegram.messenger.cs {
    public static final int G = 0;
    public a5 E;
    public boolean F;
    public final OvershootInterpolator f44551a;
    public final l0 f44552b;
    public final v4 f44553c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final w4 f44554e;
    public final org.telegram.ui.ActionBar.e6 f44555f;
    public final si.b h;
    public AnimatorSet f44556n;
    public boolean f44557r;
    public e5[] f44558s;
    public final View f44559w;
    public boolean f44560x;
    public String f44561y;

    public d5(Context context, org.telegram.ui.ActionBar.e6 e6Var, w4 w4Var) {
        super(context);
        this.f44551a = new OvershootInterpolator(1.02f);
        si.b bVar = new si.b();
        this.h = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        new Matrix();
        this.f44554e = w4Var;
        this.f44555f = e6Var;
        cVar.h = new kh.k(this);
        cVar.f9986i = this;
        View view = new View(context);
        this.f44559w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, b8.mf.c(-1.0f, -1));
        l0 l0Var = new l0(2, context, this);
        this.f44552b = l0Var;
        addView(l0Var, b8.mf.c(-1.0f, -1));
        v4 v4Var = new v4(context, e6Var);
        this.f44553c = v4Var;
        cg.p0 p0Var = cg.t0.f4745a;
        v4Var.setOutlineProvider(new cg.r0(0, org.telegram.messenger.g0.L(12.0f)));
        v4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        v4Var.setClipToOutline(true);
        l0Var.addView(v4Var, b8.mf.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            v4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            v4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232562, 0, context, e6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        gh.g c2 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c2.p(b8.cd.k(e6Var));
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.R.f12302e = true;
        c2.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c2);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(y4 y4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f44558s = y4Var.f52178i;
        if (y4Var.f52174c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v4 v4Var = this.f44553c;
        v4Var.f50376c = z10;
        v4Var.invalidate();
        this.f44561y = y4Var.f52176f;
        a5 a5Var = this.E;
        if (a5Var != null) {
            if (a5Var.f43601g) {
                a5Var.f43601g = false;
                a5Var.f43597b.n(a5Var.f43596a, a5Var.f43599e);
            }
            this.E = null;
        }
        a5 a5Var2 = y4Var.f52179j;
        if (a5Var2 != null) {
            this.E = a5Var2;
            ci.i7 i7Var = new ci.i7(3, this, y4Var);
            if (!a5Var2.f43601g) {
                a5Var2.f43601g = true;
                a5Var2.f43600f = i7Var;
                a5Var2.f43597b.b(a5Var2.f43596a, a5Var2.f43599e);
                a5Var2.a();
            }
        }
        int i3 = org.telegram.messenger.h10.f22829t0;
        org.telegram.messenger.ac acVar = y4Var.f52174c;
        String str = y4Var.f52175e;
        org.telegram.messenger.ac acVar2 = y4Var.f52172a;
        org.telegram.messenger.ac acVar3 = y4Var.f52173b;
        String str2 = y4Var.d;
        BitmapDrawable bitmapDrawable = y4Var.f52177g;
        Object obj = y4Var.h;
        org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) v4Var.d;
        k9Var.getImageReceiver().d = i3;
        k9Var.getImageReceiver().u0(acVar, str, acVar2, null, acVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        k9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            e5[] e5VarArr = this.f44558s;
            if (i10 < e5VarArr.length) {
                e5 e5Var = e5VarArr[i10];
                String M0 = org.telegram.messenger.bd.M0(e5Var.f44895b, e5Var.f44894a);
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 == this.f44558s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, e5Var.f44896c, M0, false, this.f44555f);
                c2.setTag(Integer.valueOf(i10));
                c2.setOnClickListener(new org.telegram.messenger.video.g(9, this, e5Var));
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
        long j10;
        if (this.f44557r == z10) {
            return;
        }
        this.f44557r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f44551a;
        } else {
            timeInterpolator = org.telegram.ui.Components.xq.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final d5 f43926b;

            {
                this.f43926b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        d5 d5Var = this.f43926b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                        l0 l0Var = d5Var.f44552b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = b8.be.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        d5Var.f44553c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
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
                        d5 d5Var2 = this.f43926b;
                        d5Var2.f44559w.setAlpha(floatValue2);
                        d5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final d5 f43926b;

            {
                this.f43926b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        d5 d5Var = this.f43926b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                        l0 l0Var = d5Var.f44552b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a10 = b8.be.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a10);
                        float f11 = 1.0f - floatValue;
                        d5Var.f44553c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
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
                        d5 d5Var2 = this.f43926b;
                        d5Var2.f44559w.setAlpha(floatValue2);
                        d5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f44556n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44556n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f44556n.playTogether(ofFloat, ofFloat2);
        this.f44556n.addListener(new dh.x(20, this, z10));
        this.f44556n.start();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        v4 v4Var = this.f44553c;
        boolean z10 = v4Var.f50376c;
        RadialProgress2 radialProgress2 = (RadialProgress2) v4Var.f50377e;
        if (z10 && !TextUtils.isEmpty(this.f44561y)) {
            if (i3 == org.telegram.messenger.hs.Y1) {
                if (TextUtils.equals((String) objArr[0], this.f44561y)) {
                    radialProgress2.p(true, 1.0f);
                }
            } else if (i3 == org.telegram.messenger.hs.X1 && TextUtils.equals((String) objArr[0], this.f44561y)) {
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
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0).c(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0).c(this, org.telegram.messenger.hs.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0).n(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0).n(this, org.telegram.messenger.hs.X1);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        if (i3 != 0 && i10 != 0 && this.f44557r) {
            this.f44559w.setBackground(null);
            org.telegram.messenger.g0.h3(new xp0(this, 12));
        }
        jh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
