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
public abstract class f5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean E;
    public final OvershootInterpolator f39166a;
    public final k0 f39167b;
    public final x4 f39168c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final y4 e;
    public final org.telegram.ui.ActionBar.u6 f39169f;
    public final hh.b h;
    public AnimatorSet f39170n;
    public boolean f39171r;
    public g5[] f39172s;
    public final View v;
    public boolean f39173w;
    public String f39174x;
    public c5 f39175y;

    public f5(Context context, org.telegram.ui.ActionBar.u6 u6Var, y4 y4Var) {
        super(context);
        this.f39166a = new OvershootInterpolator(1.02f);
        hh.b bVar = new hh.b();
        this.h = bVar;
        ch.b bVar2 = new ch.b(bVar);
        new Matrix();
        this.e = y4Var;
        this.f39169f = u6Var;
        bVar2.f6301f = new jh.k(this);
        bVar2.f6302g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        k0 k0Var = new k0(this, context, 2);
        this.f39167b = k0Var;
        addView(k0Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        x4 x4Var = new x4(context, u6Var);
        this.f39168c = x4Var;
        ag.v0 v0Var = ag.z0.f1400a;
        x4Var.setOutlineProvider(new ag.x0(0, AndroidUtilities.dp(12.0f)));
        x4Var.setElevation(AndroidUtilities.dp(4.0f));
        x4Var.setClipToOutline(true);
        k0Var.addView(x4Var, org.telegram.ui.Components.kb1.i(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            x4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            x4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, u6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        eh.d c10 = bVar2.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.v(gh.c.k(u6Var));
        c10.w(AndroidUtilities.dp(8.0f));
        c10.f9965x.e = true;
        c10.x(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.Components.kb1.l(-2.0f, -2.0f, 8388611));
    }

    public final void a(a5 a5Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f39172s = a5Var.f37692i;
        if (a5Var.f37689c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x4 x4Var = this.f39168c;
        x4Var.f45471c = z10;
        x4Var.invalidate();
        this.f39174x = a5Var.f37690f;
        c5 c5Var = this.f39175y;
        if (c5Var != null) {
            if (c5Var.f38175g) {
                c5Var.f38175g = false;
                c5Var.f38172b.removeObserver(c5Var.f38171a, c5Var.e);
            }
            this.f39175y = null;
        }
        c5 c5Var2 = a5Var.f37693j;
        if (c5Var2 != null) {
            this.f39175y = c5Var2;
            bi.y7 y7Var = new bi.y7(3, this, a5Var);
            if (!c5Var2.f38175g) {
                c5Var2.f38175g = true;
                c5Var2.f38174f = y7Var;
                c5Var2.f38172b.addObserver(c5Var2.f38171a, c5Var2.e);
                c5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = a5Var.f37689c;
        String str = a5Var.e;
        ImageLocation imageLocation2 = a5Var.f37687a;
        ImageLocation imageLocation3 = a5Var.f37688b;
        String str2 = a5Var.d;
        BitmapDrawable bitmapDrawable = a5Var.f37691g;
        Object obj = a5Var.h;
        org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) x4Var.d;
        y9Var.getImageReceiver().setCurrentAccount(i10);
        y9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        y9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            g5[] g5VarArr = this.f39172s;
            if (i11 < g5VarArr.length) {
                g5 g5Var = g5VarArr[i11];
                String string = LocaleController.getString(g5Var.f39504a, g5Var.f39505b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f39172s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, g5Var.f39506c, string, false, this.f39169f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new org.telegram.ui.ActionBar.u1(4, this, g5Var));
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
        if (this.f39171r == z10) {
            return;
        }
        this.f39171r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f39166a;
        } else {
            timeInterpolator = org.telegram.ui.Components.ds.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final f5 f38515b;

            {
                this.f38515b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        f5 f5Var = this.f38515b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.d;
                        k0 k0Var = f5Var.f39167b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = a8.ee.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        f5Var.f39168c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        f5 f5Var2 = this.f38515b;
                        f5Var2.v.setAlpha(floatValue2);
                        f5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final f5 f38515b;

            {
                this.f38515b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        f5 f5Var = this.f38515b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.d;
                        k0 k0Var = f5Var.f39167b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = a8.ee.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        f5Var.f39168c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        f5 f5Var2 = this.f38515b;
                        f5Var2.v.setAlpha(floatValue2);
                        f5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f39170n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39170n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f39170n.playTogether(ofFloat, ofFloat2);
        this.f39170n.addListener(new bh.f0(21, this, z10));
        this.f39170n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x4 x4Var = this.f39168c;
        boolean z10 = x4Var.f45471c;
        RadialProgress2 radialProgress2 = (RadialProgress2) x4Var.e;
        if (z10 && !TextUtils.isEmpty(this.f39174x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f39174x)) {
                    radialProgress2.p(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f39174x)) {
                radialProgress2.p(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
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
        NotificationCenter.getInstance(UserConfig.selectedAccount).addWeakObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(UserConfig.selectedAccount).addWeakObserver(this, NotificationCenter.fileLoadProgressChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != 0 && i11 != 0 && this.f39171r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new bu0(this, 12));
        }
        ih.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
