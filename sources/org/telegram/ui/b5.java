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
    public final OvershootInterpolator f43918a;
    public final k0 f43919b;
    public final t4 f43920c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 f43921e;
    public final org.telegram.ui.ActionBar.h6 f43922f;
    public final ri.b h;
    public AnimatorSet f43923n;
    public boolean f43924r;
    public c5[] f43925s;
    public final View f43926w;
    public boolean f43927x;
    public String f43928y;

    public b5(Context context, org.telegram.ui.ActionBar.h6 h6Var, u4 u4Var) {
        super(context);
        this.f43918a = new OvershootInterpolator(1.02f);
        ri.b bVar = new ri.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        new Matrix();
        this.f43921e = u4Var;
        this.f43922f = h6Var;
        cVar.h = new jh.k(this);
        cVar.f8711i = this;
        View view = new View(context);
        this.f43926w = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, c8.ha.c(-1.0f, -1));
        k0 k0Var = new k0(2, context, this);
        this.f43919b = k0Var;
        addView(k0Var, c8.ha.c(-1.0f, -1));
        t4 t4Var = new t4(context, h6Var);
        this.f43920c = t4Var;
        bg.q0 q0Var = bg.u0.f3380a;
        t4Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(12.0f)));
        t4Var.setElevation(org.telegram.messenger.g0.L(4.0f));
        t4Var.setClipToOutline(true);
        k0Var.addView(t4Var, c8.ha.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            t4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232564, 0, context, h6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.p(c8.g0.k(h6Var));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.Q.f11513e = true;
        c10.r(org.telegram.messenger.g0.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        this.f43925s = w4Var.f50899i;
        if (w4Var.f50895c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        t4 t4Var = this.f43920c;
        t4Var.f50107c = z9;
        t4Var.invalidate();
        this.f43928y = w4Var.f50897f;
        y4 y4Var = this.D;
        if (y4Var != null) {
            if (y4Var.f51890g) {
                y4Var.f51890g = false;
                y4Var.f51886b.n(y4Var.f51885a, y4Var.f51888e);
            }
            this.D = null;
        }
        y4 y4Var2 = w4Var.f50900j;
        if (y4Var2 != null) {
            this.D = y4Var2;
            bi.h8 h8Var = new bi.h8(3, this, w4Var);
            if (!y4Var2.f51890g) {
                y4Var2.f51890g = true;
                y4Var2.f51889f = h8Var;
                y4Var2.f51886b.b(y4Var2.f51885a, y4Var2.f51888e);
                y4Var2.a();
            }
        }
        int i7 = org.telegram.messenger.p10.f24474s0;
        org.telegram.messenger.hc hcVar = w4Var.f50895c;
        String str = w4Var.f50896e;
        org.telegram.messenger.hc hcVar2 = w4Var.f50893a;
        org.telegram.messenger.hc hcVar3 = w4Var.f50894b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.f50898g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) t4Var.d;
        k9Var.getImageReceiver().d = i7;
        k9Var.getImageReceiver().u0(hcVar, str, hcVar2, null, hcVar3, str2, bitmapDrawable, 0L, null, obj, 1);
        k9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            c5[] c5VarArr = this.f43925s;
            if (i10 < c5VarArr.length) {
                c5 c5Var = c5VarArr[i10];
                String M0 = org.telegram.messenger.id.M0(c5Var.f44241b, c5Var.f44240a);
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == this.f43925s.length - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.f44242c, M0, false, this.f43922f);
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
        if (this.f43924r == z9) {
            return;
        }
        this.f43924r = z9;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z9) {
            timeInterpolator = this.f43918a;
        } else {
            timeInterpolator = org.telegram.ui.Components.wq.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f52208b;

            {
                this.f52208b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f52208b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f43919b;
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
                        b5Var.f43920c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
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
                        b5 b5Var2 = this.f52208b;
                        b5Var2.f43926w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f52208b;

            {
                this.f52208b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f52208b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        k0 k0Var = b5Var.f43919b;
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
                        b5Var.f43920c.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f11);
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
                        b5 b5Var2 = this.f52208b;
                        b5Var2.f43926w.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f43923n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f43923n = animatorSet2;
        if (z9) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f43923n.playTogether(ofFloat, ofFloat2);
        this.f43923n.addListener(new ch.y(20, this, z9));
        this.f43923n.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t4 t4Var = this.f43920c;
        boolean z9 = t4Var.f50107c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.f50108e;
        if (z9 && !TextUtils.isEmpty(this.f43928y)) {
            if (i7 == org.telegram.messenger.qs.Y1) {
                if (TextUtils.equals((String) objArr[0], this.f43928y)) {
                    radialProgress2.p(true, 1.0f);
                }
            } else if (i7 == org.telegram.messenger.qs.X1 && TextUtils.equals((String) objArr[0], this.f43928y)) {
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
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24474s0).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24474s0).c(this, org.telegram.messenger.qs.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24474s0).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24474s0).n(this, org.telegram.messenger.qs.X1);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 != 0 && i10 != 0 && this.f43924r) {
            this.f43926w.setBackground(null);
            org.telegram.messenger.g0.h3(new jq0(this, 12));
        }
        ih.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
