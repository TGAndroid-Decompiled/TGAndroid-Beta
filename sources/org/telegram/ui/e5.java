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
public abstract class e5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean E;
    public final OvershootInterpolator f33123a;
    public final l0 f33124b;
    public final w4 f33125c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final x4 e;
    public final org.telegram.ui.ActionBar.e6 f33126f;
    public final fh.b h;
    public AnimatorSet f33127n;
    public boolean f33128r;
    public f5[] f33129s;
    public final View v;
    public boolean f33130w;
    public String f33131x;
    public b5 f33132y;

    public e5(Context context, org.telegram.ui.ActionBar.e6 e6Var, x4 x4Var) {
        super(context);
        this.f33123a = new OvershootInterpolator(1.02f);
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        new Matrix();
        this.e = x4Var;
        this.f33126f = e6Var;
        cVar.f425f = new hh.k(this);
        cVar.f426g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.y5.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 2);
        this.f33124b = l0Var;
        addView(l0Var, w7.y5.c(-1.0f, -1));
        w4 w4Var = new w4(context, e6Var);
        this.f33125c = w4Var;
        ai.k2 k2Var = yf.j0.f47162a;
        w4Var.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(12.0f)));
        w4Var.setElevation(AndroidUtilities.dp(4.0f));
        w4Var.setClipToOutline(true);
        l0Var.addView(w4Var, w7.y5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            w4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            w4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, e6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.u(eh.b.k(e6Var));
        c10.v(AndroidUtilities.dp(8.0f));
        c10.f4282j.e = true;
        c10.w(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.y5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(z4 z4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f33129s = z4Var.f40398i;
        if (z4Var.f40395c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w4 w4Var = this.f33125c;
        w4Var.f38808c = z10;
        w4Var.invalidate();
        this.f33131x = z4Var.f40396f;
        b5 b5Var = this.f33132y;
        if (b5Var != null) {
            if (b5Var.f32241g) {
                b5Var.f32241g = false;
                b5Var.f32238b.removeObserver(b5Var.f32237a, b5Var.e);
            }
            this.f33132y = null;
        }
        b5 b5Var2 = z4Var.f40399j;
        if (b5Var2 != null) {
            this.f33132y = b5Var2;
            ci.k5 k5Var = new ci.k5(1, this, z4Var);
            if (!b5Var2.f32241g) {
                b5Var2.f32241g = true;
                b5Var2.f32240f = k5Var;
                b5Var2.f32238b.addObserver(b5Var2.f32237a, b5Var2.e);
                b5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = z4Var.f40395c;
        String str = z4Var.e;
        ImageLocation imageLocation2 = z4Var.f40393a;
        ImageLocation imageLocation3 = z4Var.f40394b;
        String str2 = z4Var.d;
        BitmapDrawable bitmapDrawable = z4Var.f40397g;
        Object obj = z4Var.h;
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) w4Var.d;
        w9Var.getImageReceiver().setCurrentAccount(i10);
        w9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        w9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            f5[] f5VarArr = this.f33129s;
            if (i11 < f5VarArr.length) {
                f5 f5Var = f5VarArr[i11];
                String string = LocaleController.getString(f5Var.f33425a, f5Var.f33426b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f33129s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, f5Var.f33427c, string, false, this.f33126f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new ai.f2(24, this, f5Var));
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
        if (this.f33128r == z10) {
            return;
        }
        this.f33128r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f33123a;
        } else {
            timeInterpolator = org.telegram.ui.Components.sr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e5 f32523b;

            {
                this.f32523b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f32523b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.f33124b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.q.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        e5Var.f33125c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        e5 e5Var2 = this.f32523b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e5 f32523b;

            {
                this.f32523b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f32523b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.f33124b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.q.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f7);
                        l0Var.setScaleY(f7);
                        l0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        e5Var.f33125c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        e5 e5Var2 = this.f32523b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f33127n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33127n = animatorSet2;
        if (z10) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f33127n.playTogether(ofFloat, ofFloat2);
        this.f33127n.addListener(new ai.n(20, this, z10));
        this.f33127n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w4 w4Var = this.f33125c;
        boolean z10 = w4Var.f38808c;
        RadialProgress2 radialProgress2 = (RadialProgress2) w4Var.e;
        if (z10 && !TextUtils.isEmpty(this.f33131x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f33131x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f33131x)) {
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
        if (i10 != 0 && i11 != 0 && this.f33128r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new hu0(this, 12));
        }
        gh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
