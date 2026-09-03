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
    public static final int C = 0;
    public boolean B;
    public final OvershootInterpolator f34317a;
    public final n0 f34318b;
    public final y4 f34319c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final z4 e;
    public final org.telegram.ui.ActionBar.f6 f34320f;
    public final sg.b h;
    public AnimatorSet f34321n;
    public boolean f34322r;
    public h5[] f34323s;
    public final View v;
    public boolean f34324w;
    public String f34325x;
    public d5 f34326y;

    public g5(Context context, org.telegram.ui.ActionBar.f6 f6Var, z4 z4Var) {
        super(context);
        this.f34317a = new OvershootInterpolator(1.02f);
        sg.b bVar = new sg.b();
        this.h = bVar;
        new Matrix();
        this.e = z4Var;
        this.f34320f = f6Var;
        ug.i iVar = new ug.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, k7.b6.c(-1.0f, -1));
        n0 n0Var = new n0(this, context, 2);
        this.f34318b = n0Var;
        addView(n0Var, k7.b6.c(-1.0f, -1));
        y4 y4Var = new y4(context, f6Var);
        this.f34319c = y4Var;
        gg.j1 j1Var = kf.r0.f10496a;
        y4Var.setOutlineProvider(new kf.q0(0, AndroidUtilities.dp(12.0f)));
        y4Var.setElevation(AndroidUtilities.dp(4.0f));
        y4Var.setClipToOutline(true);
        n0Var.addView(y4Var, k7.b6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            y4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            y4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, f6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        pg.b k10 = bVar.k();
        k10.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new mg.w(1, k10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        k10.n(rg.b.k(f6Var));
        k10.o(AndroidUtilities.dp(8.0f));
        k10.h.e = true;
        k10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(k10);
        n0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(b5 b5Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        this.f34323s = b5Var.f32737i;
        if (b5Var.f32734c != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        y4 y4Var = this.f34319c;
        y4Var.f40136c = z4;
        y4Var.invalidate();
        this.f34325x = b5Var.f32735f;
        d5 d5Var = this.f34326y;
        if (d5Var != null) {
            if (d5Var.f33327g) {
                d5Var.f33327g = false;
                d5Var.f33324b.removeObserver(d5Var.f33323a, d5Var.e);
            }
            this.f34326y = null;
        }
        d5 d5Var2 = b5Var.f32738j;
        if (d5Var2 != null) {
            this.f34326y = d5Var2;
            gg.m0 m0Var = new gg.m0(4, this, b5Var);
            if (!d5Var2.f33327g) {
                d5Var2.f33327g = true;
                d5Var2.f33326f = m0Var;
                d5Var2.f33324b.addObserver(d5Var2.f33323a, d5Var2.e);
                d5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = b5Var.f32734c;
        String str = b5Var.e;
        ImageLocation imageLocation2 = b5Var.f32732a;
        ImageLocation imageLocation3 = b5Var.f32733b;
        String str2 = b5Var.d;
        BitmapDrawable bitmapDrawable = b5Var.f32736g;
        Object obj = b5Var.h;
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) y4Var.d;
        p9Var.getImageReceiver().setCurrentAccount(i10);
        p9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        p9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            h5[] h5VarArr = this.f34323s;
            if (i11 < h5VarArr.length) {
                h5 h5Var = h5VarArr[i11];
                String string = LocaleController.getString(h5Var.f34577a, h5Var.f34578b);
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 == this.f34323s.length - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout2, h5Var.f34579c, string, false, this.f34320f);
                c3.setTag(Integer.valueOf(i11));
                c3.setOnClickListener(new org.telegram.messenger.video.g(9, this, h5Var));
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
        if (this.f34322r == z4) {
            return;
        }
        this.f34322r = z4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z4) {
            timeInterpolator = this.f34317a;
        } else {
            timeInterpolator = org.telegram.ui.Components.mr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g5 f33610b;

            {
                this.f33610b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f33610b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        n0 n0Var = g5Var.f34318b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        n0Var.setScaleX(f10);
                        n0Var.setScaleY(f10);
                        n0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        g5Var.f34319c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
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
                        g5 g5Var2 = this.f33610b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g5 f33610b;

            {
                this.f33610b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.f33610b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                        n0 n0Var = g5Var.f34318b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        n0Var.setScaleX(f10);
                        n0Var.setScaleY(f10);
                        n0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        g5Var.f34319c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
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
                        g5 g5Var2 = this.f33610b;
                        g5Var2.v.setAlpha(floatValue2);
                        g5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f34321n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34321n = animatorSet2;
        if (z4) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f34321n.playTogether(ofFloat, ofFloat2);
        this.f34321n.addListener(new dg.w2(12, this, z4));
        this.f34321n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y4 y4Var = this.f34319c;
        boolean z4 = y4Var.f40136c;
        RadialProgress2 radialProgress2 = (RadialProgress2) y4Var.e;
        if (z4 && !TextUtils.isEmpty(this.f34325x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f34325x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f34325x)) {
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
        if (i10 != 0 && i11 != 0 && this.f34322r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new yt0(this, 12));
        }
        tg.c.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
