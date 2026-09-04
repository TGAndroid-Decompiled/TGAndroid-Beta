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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgress2;
public abstract class c5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean E;
    public final OvershootInterpolator f34994a;
    public final j0 f34995b;
    public final u4 f34996c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final v4 f34997e;
    public final org.telegram.ui.ActionBar.f6 f34998f;
    public final gh.b h;
    public AnimatorSet f34999n;
    public boolean f35000r;
    public d5[] f35001s;
    public final View v;
    public boolean f35002w;
    public String f35003x;
    public z4 f35004y;

    public c5(Context context, org.telegram.ui.ActionBar.f6 f6Var, v4 v4Var) {
        super(context);
        this.f34994a = new OvershootInterpolator(1.02f);
        gh.b bVar = new gh.b();
        this.h = bVar;
        new Matrix();
        this.f34997e = v4Var;
        this.f34998f = f6Var;
        ih.k kVar = new ih.k(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.x5.c(-1.0f, -1));
        j0 j0Var = new j0(this, context, 2);
        this.f34995b = j0Var;
        addView(j0Var, w7.x5.c(-1.0f, -1));
        u4 u4Var = new u4(context, f6Var);
        this.f34996c = u4Var;
        bi.z1 z1Var = yf.j0.f50112a;
        u4Var.setOutlineProvider(new yf.i0(0, AndroidUtilities.dp(12.0f)));
        u4Var.setElevation(AndroidUtilities.dp(4.0f));
        u4Var.setClipToOutline(true);
        j0Var.addView(u4Var, w7.x5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            u4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            u4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, f6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.d k10 = bVar.k();
        k10.n(null);
        kVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new ah.i0(1, k10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        k10.n(fh.b.k(f6Var));
        k10.o(AndroidUtilities.dp(8.0f));
        k10.h.f6821e = true;
        k10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(k10);
        j0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(x4 x4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f35001s = x4Var.f42589i;
        if (x4Var.f42585c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u4 u4Var = this.f34996c;
        u4Var.f40922c = z10;
        u4Var.invalidate();
        this.f35003x = x4Var.f42587f;
        z4 z4Var = this.f35004y;
        if (z4Var != null) {
            if (z4Var.f43288g) {
                z4Var.f43288g = false;
                z4Var.f43284b.removeObserver(z4Var.f43283a, z4Var.f43286e);
            }
            this.f35004y = null;
        }
        z4 z4Var2 = x4Var.f42590j;
        if (z4Var2 != null) {
            this.f35004y = z4Var2;
            di.l5 l5Var = new di.l5(1, this, x4Var);
            if (!z4Var2.f43288g) {
                z4Var2.f43288g = true;
                z4Var2.f43287f = l5Var;
                z4Var2.f43284b.addObserver(z4Var2.f43283a, z4Var2.f43286e);
                z4Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = x4Var.f42585c;
        String str = x4Var.f42586e;
        ImageLocation imageLocation2 = x4Var.f42583a;
        ImageLocation imageLocation3 = x4Var.f42584b;
        String str2 = x4Var.d;
        BitmapDrawable bitmapDrawable = x4Var.f42588g;
        Object obj = x4Var.h;
        org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) u4Var.d;
        x9Var.getImageReceiver().setCurrentAccount(i10);
        x9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        x9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            d5[] d5VarArr = this.f35001s;
            if (i11 < d5VarArr.length) {
                d5 d5Var = d5VarArr[i11];
                String string = LocaleController.getString(d5Var.f35658a, d5Var.f35659b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f35001s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, d5Var.f35660c, string, false, this.f34998f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new bi.u1(24, this, d5Var));
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
        long j3;
        if (this.f35000r == z10) {
            return;
        }
        this.f35000r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f34994a;
        } else {
            timeInterpolator = org.telegram.ui.Components.pr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final c5 f34333b;

            {
                this.f34333b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        c5 c5Var = this.f34333b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        j0 j0Var = c5Var.f34995b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.p.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        j0Var.setScaleX(f7);
                        j0Var.setScaleY(f7);
                        j0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.f34996c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        c5 c5Var2 = this.f34333b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final c5 f34333b;

            {
                this.f34333b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        c5 c5Var = this.f34333b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        j0 j0Var = c5Var.f34995b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.p.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        j0Var.setScaleX(f7);
                        j0Var.setScaleY(f7);
                        j0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.f34996c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f10);
                        float f11 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f11);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        c5 c5Var2 = this.f34333b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f34999n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34999n = animatorSet2;
        if (z10) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f34999n.playTogether(ofFloat, ofFloat2);
        this.f34999n.addListener(new ah.q0(21, this, z10));
        this.f34999n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u4 u4Var = this.f34996c;
        boolean z10 = u4Var.f40922c;
        RadialProgress2 radialProgress2 = (RadialProgress2) u4Var.f40923e;
        if (z10 && !TextUtils.isEmpty(this.f35003x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f35003x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f35003x)) {
                radialProgress2.o(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
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
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != 0 && i11 != 0 && this.f35000r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new lu0(this, 12));
        }
        hh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
