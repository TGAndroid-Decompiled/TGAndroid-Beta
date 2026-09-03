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
    public final OvershootInterpolator f36360a;
    public final l0 f36361b;
    public final w4 f36362c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final x4 f36363e;
    public final org.telegram.ui.ActionBar.g6 f36364f;
    public final tg.b h;
    public AnimatorSet f36365n;
    public boolean f36366r;
    public f5[] f36367s;
    public final View v;
    public boolean f36368w;
    public String f36369x;
    public b5 f36370y;

    public e5(Context context, org.telegram.ui.ActionBar.g6 g6Var, x4 x4Var) {
        super(context);
        this.f36360a = new OvershootInterpolator(1.02f);
        tg.b bVar = new tg.b();
        this.h = bVar;
        new Matrix();
        this.f36363e = x4Var;
        this.f36364f = g6Var;
        vg.i iVar = new vg.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, k7.c6.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 2);
        this.f36361b = l0Var;
        addView(l0Var, k7.c6.c(-1.0f, -1));
        w4 w4Var = new w4(context, g6Var);
        this.f36362c = w4Var;
        hg.j1 j1Var = lf.q0.f12504a;
        w4Var.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(12.0f)));
        w4Var.setElevation(AndroidUtilities.dp(4.0f));
        w4Var.setClipToOutline(true);
        l0Var.addView(w4Var, k7.c6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            w4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            w4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, g6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        qg.b k10 = bVar.k();
        k10.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new ng.w(2, k10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        k10.n(sg.b.k(g6Var));
        k10.o(AndroidUtilities.dp(8.0f));
        k10.h.f44870e = true;
        k10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(k10);
        l0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.c6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(z4 z4Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        this.f36367s = z4Var.f43795i;
        if (z4Var.f43791c != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        w4 w4Var = this.f36362c;
        w4Var.f42275c = z4;
        w4Var.invalidate();
        this.f36369x = z4Var.f43793f;
        b5 b5Var = this.f36370y;
        if (b5Var != null) {
            if (b5Var.f35356g) {
                b5Var.f35356g = false;
                b5Var.f35352b.removeObserver(b5Var.f35351a, b5Var.f35354e);
            }
            this.f36370y = null;
        }
        b5 b5Var2 = z4Var.f43796j;
        if (b5Var2 != null) {
            this.f36370y = b5Var2;
            hg.m0 m0Var = new hg.m0(4, this, z4Var);
            if (!b5Var2.f35356g) {
                b5Var2.f35356g = true;
                b5Var2.f35355f = m0Var;
                b5Var2.f35352b.addObserver(b5Var2.f35351a, b5Var2.f35354e);
                b5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = z4Var.f43791c;
        String str = z4Var.f43792e;
        ImageLocation imageLocation2 = z4Var.f43789a;
        ImageLocation imageLocation3 = z4Var.f43790b;
        String str2 = z4Var.d;
        BitmapDrawable bitmapDrawable = z4Var.f43794g;
        Object obj = z4Var.h;
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) w4Var.d;
        p9Var.getImageReceiver().setCurrentAccount(i10);
        p9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        p9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            f5[] f5VarArr = this.f36367s;
            if (i11 < f5VarArr.length) {
                f5 f5Var = f5VarArr[i11];
                String string = LocaleController.getString(f5Var.f36661a, f5Var.f36662b);
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 == this.f36367s.length - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(z10, z11, actionBarPopupWindow$ActionBarPopupWindowLayout2, f5Var.f36663c, string, false, this.f36364f);
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
        if (this.f36366r == z4) {
            return;
        }
        this.f36366r = z4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z4) {
            timeInterpolator = this.f36360a;
        } else {
            timeInterpolator = org.telegram.ui.Components.pr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e5 f35689b;

            {
                this.f35689b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f35689b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.f36361b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.o.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        e5Var.f36362c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
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
                        e5 e5Var2 = this.f35689b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e5 f35689b;

            {
                this.f35689b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.f35689b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                        l0 l0Var = e5Var.f36361b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z4) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = k7.o.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        l0Var.setScaleX(f10);
                        l0Var.setScaleY(f10);
                        l0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        e5Var.f36362c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
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
                        e5 e5Var2 = this.f35689b;
                        e5Var2.v.setAlpha(floatValue2);
                        e5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f36365n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36365n = animatorSet2;
        if (z4) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f36365n.playTogether(ofFloat, ofFloat2);
        this.f36365n.addListener(new eg.u2(10, this, z4));
        this.f36365n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w4 w4Var = this.f36362c;
        boolean z4 = w4Var.f42275c;
        RadialProgress2 radialProgress2 = (RadialProgress2) w4Var.f42276e;
        if (z4 && !TextUtils.isEmpty(this.f36369x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f36369x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f36369x)) {
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
        if (i10 != 0 && i11 != 0 && this.f36366r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new yt0(this, 12));
        }
        ug.c.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
