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
    public static final int C = 0;
    public boolean B;
    public final OvershootInterpolator f33888a;
    public final l0 f33889b;
    public final w4 f33890c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final x4 e;
    public final org.telegram.ui.ActionBar.f6 f33891f;
    public final sg.b h;
    public AnimatorSet f33892n;
    public boolean f33893r;
    public f5[] f33894s;
    public final View v;
    public boolean f33895w;
    public String f33896x;
    public b5 f33897y;

    public e5(Context context, org.telegram.ui.ActionBar.f6 f6Var, x4 x4Var) {
        super(context);
        this.f33888a = new OvershootInterpolator(1.02f);
        sg.b bVar = new sg.b();
        this.h = bVar;
        new Matrix();
        this.e = x4Var;
        this.f33891f = f6Var;
        ug.i iVar = new ug.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, k7.b6.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 2);
        this.f33889b = l0Var;
        addView(l0Var, k7.b6.c(-1.0f, -1));
        w4 w4Var = new w4(context, f6Var);
        this.f33890c = w4Var;
        gg.j1 j1Var = lf.q0.f12053a;
        w4Var.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(12.0f)));
        w4Var.setElevation(AndroidUtilities.dp(4.0f));
        w4Var.setClipToOutline(true);
        l0Var.addView(w4Var, k7.b6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            w4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            w4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, f6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        pg.b k10 = bVar.k();
        k10.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new mg.w(1, k10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        k10.n(rg.b.j(f6Var));
        k10.o(AndroidUtilities.dp(8.0f));
        k10.h.e = true;
        k10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(k10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(z4 z4Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        this.f33894s = z4Var.f40668i;
        if (z4Var.f40665c != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        w4 w4Var = this.f33890c;
        w4Var.f39324c = z4;
        w4Var.invalidate();
        this.f33896x = z4Var.f40666f;
        b5 b5Var = this.f33897y;
        if (b5Var != null) {
            if (b5Var.f32794g) {
                b5Var.f32794g = false;
                b5Var.f32791b.removeObserver(b5Var.f32790a, b5Var.e);
            }
            this.f33897y = null;
        }
        b5 b5Var2 = z4Var.f40669j;
        if (b5Var2 != null) {
            this.f33897y = b5Var2;
            gg.m0 m0Var = new gg.m0(4, this, z4Var);
            if (!b5Var2.f32794g) {
                b5Var2.f32794g = true;
                b5Var2.f32793f = m0Var;
                b5Var2.f32791b.addObserver(b5Var2.f32790a, b5Var2.e);
                b5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = z4Var.f40665c;
        String str = z4Var.e;
        ImageLocation imageLocation2 = z4Var.f40663a;
        ImageLocation imageLocation3 = z4Var.f40664b;
        String str2 = z4Var.d;
        BitmapDrawable bitmapDrawable = z4Var.f40667g;
        Object obj = z4Var.h;
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) w4Var.d;
        p9Var.getImageReceiver().setCurrentAccount(i10);
        p9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        p9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            f5[] f5VarArr = this.f33894s;
            if (i11 < f5VarArr.length) {
                f5 f5Var = f5VarArr[i11];
                String string = LocaleController.getString(f5Var.f34164a, f5Var.f34165b);
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 == this.f33894s.length - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout2, f5Var.f34166c, string, false, this.f33891f);
                c3.setTag(Integer.valueOf(i11));
                c3.setOnClickListener(new org.telegram.messenger.video.g(9, this, f5Var));
                i11++;
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            } else {
                b(true);
                return;
            }
        }
    }

    public final void b(final boolean z4) {
        TimeInterpolator timeInterpolator;
        long j10;
        if (this.f33893r == z4) {
            return;
        }
        this.f33893r = z4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z4) {
            timeInterpolator = this.f33888a;
        } else {
            timeInterpolator = org.telegram.ui.Components.nr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e5 f33094b;

            {
                this.f33094b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f33094b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.f33889b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        e5Var.f33890c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        e5 e5Var2 = this.f33094b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e5 f33094b;

            {
                this.f33094b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f33094b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.f33889b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        e5Var.f33890c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        e5 e5Var2 = this.f33094b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f33892n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33892n = animatorSet2;
        if (z4) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f33892n.playTogether(ofFloat, ofFloat2);
        this.f33892n.addListener(new dg.w2(12, this, z4));
        this.f33892n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w4 w4Var = this.f33890c;
        boolean z4 = w4Var.f39324c;
        RadialProgress2 radialProgress2 = (RadialProgress2) w4Var.e;
        if (z4 && !TextUtils.isEmpty(this.f33896x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f33896x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f33896x)) {
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
        if (i10 != 0 && i11 != 0 && this.f33893r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new rt0(this, 12));
        }
        tg.c.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
