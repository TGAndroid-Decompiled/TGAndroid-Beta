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
public abstract class g5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean E;
    public final OvershootInterpolator f36304a;
    public final l0 f36305b;
    public final y4 f36306c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final z4 e;
    public final org.telegram.ui.ActionBar.c6 f36307f;
    public final gh.b h;
    public AnimatorSet f36308n;
    public boolean f36309r;
    public h5[] f36310s;
    public final View v;
    public boolean f36311w;
    public String f36312x;
    public d5 f36313y;

    public g5(Context context, org.telegram.ui.ActionBar.c6 c6Var, z4 z4Var) {
        super(context);
        this.f36304a = new OvershootInterpolator(1.02f);
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        new Matrix();
        this.e = z4Var;
        this.f36307f = c6Var;
        bVar2.f2745f = new ih.j(this);
        bVar2.f2746g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.a6.d(-1.0f, -1));
        l0 l0Var = new l0(this, context, 2);
        this.f36305b = l0Var;
        addView(l0Var, w7.a6.d(-1.0f, -1));
        y4 y4Var = new y4(context, c6Var);
        this.f36306c = y4Var;
        bi.a2 a2Var = zf.j0.f50191a;
        y4Var.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(12.0f)));
        y4Var.setElevation(AndroidUtilities.dp(4.0f));
        y4Var.setClipToOutline(true);
        l0Var.addView(y4Var, w7.a6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            y4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            y4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, c6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.d c10 = bVar2.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(fh.b.k(c6Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f6558j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.a6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(b5 b5Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f36310s = b5Var.f34420i;
        if (b5Var.f34417c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y4 y4Var = this.f36306c;
        y4Var.f42027c = z10;
        y4Var.invalidate();
        this.f36312x = b5Var.f34418f;
        d5 d5Var = this.f36313y;
        if (d5Var != null) {
            if (d5Var.f35150g) {
                d5Var.f35150g = false;
                d5Var.f35147b.removeObserver(d5Var.f35146a, d5Var.e);
            }
            this.f36313y = null;
        }
        d5 d5Var2 = b5Var.f34421j;
        if (d5Var2 != null) {
            this.f36313y = d5Var2;
            di.j5 j5Var = new di.j5(1, this, b5Var);
            if (!d5Var2.f35150g) {
                d5Var2.f35150g = true;
                d5Var2.f35149f = j5Var;
                d5Var2.f35147b.addObserver(d5Var2.f35146a, d5Var2.e);
                d5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = b5Var.f34417c;
        String str = b5Var.e;
        ImageLocation imageLocation2 = b5Var.f34415a;
        ImageLocation imageLocation3 = b5Var.f34416b;
        String str2 = b5Var.d;
        BitmapDrawable bitmapDrawable = b5Var.f34419g;
        Object obj = b5Var.h;
        org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) y4Var.d;
        z9Var.getImageReceiver().setCurrentAccount(i10);
        z9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        z9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            h5[] h5VarArr = this.f36310s;
            if (i11 < h5VarArr.length) {
                h5 h5Var = h5VarArr[i11];
                String string = LocaleController.getString(h5Var.f36610a, h5Var.f36611b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f36310s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, h5Var.f36612c, string, false, this.f36307f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new bi.u1(24, this, h5Var));
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
        if (this.f36309r == z10) {
            return;
        }
        this.f36309r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f36304a;
        } else {
            timeInterpolator = org.telegram.ui.Components.es.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g5 f35463b;

            {
                this.f35463b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f35463b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        l0 l0Var = g5Var.f36305b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.s.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        g5Var.f36306c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        g5 g5Var2 = this.f35463b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g5 f35463b;

            {
                this.f35463b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f35463b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        l0 l0Var = g5Var.f36305b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.s.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        g5Var.f36306c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        g5 g5Var2 = this.f35463b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f36308n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36308n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f36308n.playTogether(ofFloat, ofFloat2);
        this.f36308n.addListener(new ah.p0(21, this, z10));
        this.f36308n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y4 y4Var = this.f36306c;
        boolean z10 = y4Var.f42027c;
        RadialProgress2 radialProgress2 = (RadialProgress2) y4Var.e;
        if (z10 && !TextUtils.isEmpty(this.f36312x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f36312x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f36312x)) {
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
        if (i10 != 0 && i11 != 0 && this.f36309r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new tu0(this, 12));
        }
        hh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
