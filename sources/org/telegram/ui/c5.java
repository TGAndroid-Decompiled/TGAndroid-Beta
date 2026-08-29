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
    public static final int B = 0;
    public boolean A;
    public final OvershootInterpolator f36991a;
    public final n0 f36992b;
    public final u4 f36993c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final v4 f36994e;
    public final org.telegram.ui.ActionBar.c6 f36995f;
    public final qg.b h;
    public AnimatorSet f36996n;
    public boolean f36997r;
    public d5[] f36998s;
    public final View v;
    public boolean f36999w;
    public String f37000x;
    public z4 f37001y;

    public c5(Context context, org.telegram.ui.ActionBar.c6 c6Var, v4 v4Var) {
        super(context);
        this.f36991a = new OvershootInterpolator(1.02f);
        qg.b bVar = new qg.b();
        this.h = bVar;
        new Matrix();
        this.f36994e = v4Var;
        this.f36995f = c6Var;
        sg.i iVar = new sg.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, i7.f6.c(-1.0f, -1));
        n0 n0Var = new n0(this, context, 2);
        this.f36992b = n0Var;
        addView(n0Var, i7.f6.c(-1.0f, -1));
        u4 u4Var = new u4(context, c6Var);
        this.f36993c = u4Var;
        eg.k1 k1Var = jf.q0.f11668a;
        u4Var.setOutlineProvider(new jf.p0(0, AndroidUtilities.dp(12.0f)));
        u4Var.setElevation(AndroidUtilities.dp(4.0f));
        u4Var.setClipToOutline(true);
        n0Var.addView(u4Var, i7.f6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            u4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            u4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, c6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ng.d v = bVar.v();
        v.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new kg.w(1, v, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        v.n(pg.a.j(c6Var));
        v.o(AndroidUtilities.dp(8.0f));
        v.h.f17329e = true;
        v.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(v);
        n0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(x4 x4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f36998s = x4Var.f44459i;
        if (x4Var.f44455c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u4 u4Var = this.f36993c;
        u4Var.f43175c = z10;
        u4Var.invalidate();
        this.f37000x = x4Var.f44457f;
        z4 z4Var = this.f37001y;
        if (z4Var != null) {
            if (z4Var.f45068g) {
                z4Var.f45068g = false;
                z4Var.f45064b.removeObserver(z4Var.f45063a, z4Var.f45066e);
            }
            this.f37001y = null;
        }
        z4 z4Var2 = x4Var.f44460j;
        if (z4Var2 != null) {
            this.f37001y = z4Var2;
            eg.n0 n0Var = new eg.n0(5, this, x4Var);
            if (!z4Var2.f45068g) {
                z4Var2.f45068g = true;
                z4Var2.f45067f = n0Var;
                z4Var2.f45064b.addObserver(z4Var2.f45063a, z4Var2.f45066e);
                z4Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = x4Var.f44455c;
        String str = x4Var.f44456e;
        ImageLocation imageLocation2 = x4Var.f44453a;
        ImageLocation imageLocation3 = x4Var.f44454b;
        String str2 = x4Var.d;
        BitmapDrawable bitmapDrawable = x4Var.f44458g;
        Object obj = x4Var.h;
        org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) u4Var.d;
        t9Var.getImageReceiver().setCurrentAccount(i10);
        t9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        t9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            d5[] d5VarArr = this.f36998s;
            if (i11 < d5VarArr.length) {
                d5 d5Var = d5VarArr[i11];
                String string = LocaleController.getString(d5Var.f37296a, d5Var.f37297b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f36998s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, d5Var.f37298c, string, false, this.f36995f);
                c3.setTag(Integer.valueOf(i11));
                c3.setOnClickListener(new nh.r7(12, this, d5Var));
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
        if (this.f36997r == z10) {
            return;
        }
        this.f36997r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f36991a;
        } else {
            timeInterpolator = org.telegram.ui.Components.jr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final c5 f36426b;

            {
                this.f36426b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        c5 c5Var = this.f36426b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        n0 n0Var = c5Var.f36992b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = i7.w.a(floatValue, 0.0f, 1.0f);
                        float f9 = (0.3f * floatValue) + 0.7f;
                        n0Var.setScaleX(f9);
                        n0Var.setScaleY(f9);
                        n0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.f36993c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        c5 c5Var2 = this.f36426b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final c5 f36426b;

            {
                this.f36426b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        c5 c5Var = this.f36426b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        n0 n0Var = c5Var.f36992b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = i7.w.a(floatValue, 0.0f, 1.0f);
                        float f9 = (0.3f * floatValue) + 0.7f;
                        n0Var.setScaleX(f9);
                        n0Var.setScaleY(f9);
                        n0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.f36993c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        c5 c5Var2 = this.f36426b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f36996n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36996n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f36996n.playTogether(ofFloat, ofFloat2);
        this.f36996n.addListener(new bg.z2(20, this, z10));
        this.f36996n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u4 u4Var = this.f36993c;
        boolean z10 = u4Var.f43175c;
        RadialProgress2 radialProgress2 = (RadialProgress2) u4Var.f43176e;
        if (z10 && !TextUtils.isEmpty(this.f37000x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f37000x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f37000x)) {
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
        if (i10 != 0 && i11 != 0 && this.f36997r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new it0(this, 12));
        }
        rg.c.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
