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
    public final OvershootInterpolator f37445a;
    public final l0 f37446b;
    public final y4 f37447c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final z4 e;
    public final org.telegram.ui.ActionBar.g6 f37448f;
    public final gh.b h;
    public AnimatorSet f37449n;
    public boolean f37450r;
    public h5[] f37451s;
    public final View v;
    public boolean f37452w;
    public String f37453x;
    public d5 f37454y;

    public g5(Context context, org.telegram.ui.ActionBar.g6 g6Var, z4 z4Var) {
        super(context);
        this.f37445a = new OvershootInterpolator(1.02f);
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        new Matrix();
        this.e = z4Var;
        this.f37448f = g6Var;
        bVar2.f4365f = new ih.k(this);
        bVar2.f4366g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.z5.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 2);
        this.f37446b = l0Var;
        addView(l0Var, w7.z5.c(-1.0f, -1));
        y4 y4Var = new y4(context, g6Var);
        this.f37447c = y4Var;
        ci.n1 n1Var = zf.j0.f52046a;
        y4Var.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(12.0f)));
        y4Var.setElevation(AndroidUtilities.dp(4.0f));
        y4Var.setClipToOutline(true);
        l0Var.addView(y4Var, w7.z5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            y4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            y4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, g6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.d c10 = bVar2.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(fh.c.k(g6Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.v.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(b5 b5Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f37451s = b5Var.f35925i;
        if (b5Var.f35922c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y4 y4Var = this.f37447c;
        y4Var.f43746c = z10;
        y4Var.invalidate();
        this.f37453x = b5Var.f35923f;
        d5 d5Var = this.f37454y;
        if (d5Var != null) {
            if (d5Var.f36471g) {
                d5Var.f36471g = false;
                d5Var.f36468b.removeObserver(d5Var.f36467a, d5Var.e);
            }
            this.f37454y = null;
        }
        d5 d5Var2 = b5Var.f35926j;
        if (d5Var2 != null) {
            this.f37454y = d5Var2;
            ai.c8 c8Var = new ai.c8(3, this, b5Var);
            if (!d5Var2.f36471g) {
                d5Var2.f36471g = true;
                d5Var2.f36470f = c8Var;
                d5Var2.f36468b.addObserver(d5Var2.f36467a, d5Var2.e);
                d5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = b5Var.f35922c;
        String str = b5Var.e;
        ImageLocation imageLocation2 = b5Var.f35920a;
        ImageLocation imageLocation3 = b5Var.f35921b;
        String str2 = b5Var.d;
        BitmapDrawable bitmapDrawable = b5Var.f35924g;
        Object obj = b5Var.h;
        org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) y4Var.d;
        u9Var.getImageReceiver().setCurrentAccount(i10);
        u9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        u9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            h5[] h5VarArr = this.f37451s;
            if (i11 < h5VarArr.length) {
                h5 h5Var = h5VarArr[i11];
                String string = LocaleController.getString(h5Var.f37746a, h5Var.f37747b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f37451s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, h5Var.f37748c, string, false, this.f37448f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new org.telegram.ui.ActionBar.s1(4, this, h5Var));
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
        if (this.f37450r == z10) {
            return;
        }
        this.f37450r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f37445a;
        } else {
            timeInterpolator = org.telegram.ui.Components.zr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g5 f36806b;

            {
                this.f36806b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f36806b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        l0 l0Var = g5Var.f37446b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.r.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        g5Var.f37447c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        g5 g5Var2 = this.f36806b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g5 f36806b;

            {
                this.f36806b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f36806b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        l0 l0Var = g5Var.f37446b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.r.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        g5Var.f37447c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        g5 g5Var2 = this.f36806b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f37449n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f37449n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f37449n.playTogether(ofFloat, ofFloat2);
        this.f37449n.addListener(new ah.p0(21, this, z10));
        this.f37449n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y4 y4Var = this.f37447c;
        boolean z10 = y4Var.f43746c;
        RadialProgress2 radialProgress2 = (RadialProgress2) y4Var.e;
        if (z10 && !TextUtils.isEmpty(this.f37453x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f37453x)) {
                    radialProgress2.p(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f37453x)) {
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
        if (i10 != 0 && i11 != 0 && this.f37450r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new ut0(this, 12));
        }
        hh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
