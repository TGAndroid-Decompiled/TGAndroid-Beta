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
public abstract class d5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean E;
    public final OvershootInterpolator f32506a;
    public final k0 f32507b;
    public final v4 f32508c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final w4 e;
    public final org.telegram.ui.ActionBar.d6 f32509f;
    public final fh.b h;
    public AnimatorSet f32510n;
    public boolean f32511r;
    public e5[] f32512s;
    public final View v;
    public boolean f32513w;
    public String f32514x;
    public a5 f32515y;

    public d5(Context context, org.telegram.ui.ActionBar.d6 d6Var, w4 w4Var) {
        super(context);
        this.f32506a = new OvershootInterpolator(1.02f);
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        new Matrix();
        this.e = w4Var;
        this.f32509f = d6Var;
        cVar.f425f = new hh.k(this);
        cVar.f426g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.x5.c(-1.0f, -1));
        k0 k0Var = new k0(this, context, 2);
        this.f32507b = k0Var;
        addView(k0Var, w7.x5.c(-1.0f, -1));
        v4 v4Var = new v4(context, d6Var);
        this.f32508c = v4Var;
        ai.k2 k2Var = yf.i0.f46786a;
        v4Var.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(12.0f)));
        v4Var.setElevation(AndroidUtilities.dp(4.0f));
        v4Var.setClipToOutline(true);
        k0Var.addView(v4Var, w7.x5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            v4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            v4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, d6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(d6Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f4280j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(y4 y4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f32512s = y4Var.f39722i;
        if (y4Var.f39719c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v4 v4Var = this.f32508c;
        v4Var.f38291c = z10;
        v4Var.invalidate();
        this.f32514x = y4Var.f39720f;
        a5 a5Var = this.f32515y;
        if (a5Var != null) {
            if (a5Var.f31664g) {
                a5Var.f31664g = false;
                a5Var.f31661b.removeObserver(a5Var.f31660a, a5Var.e);
            }
            this.f32515y = null;
        }
        a5 a5Var2 = y4Var.f39723j;
        if (a5Var2 != null) {
            this.f32515y = a5Var2;
            ci.k5 k5Var = new ci.k5(1, this, y4Var);
            if (!a5Var2.f31664g) {
                a5Var2.f31664g = true;
                a5Var2.f31663f = k5Var;
                a5Var2.f31661b.addObserver(a5Var2.f31660a, a5Var2.e);
                a5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = y4Var.f39719c;
        String str = y4Var.e;
        ImageLocation imageLocation2 = y4Var.f39717a;
        ImageLocation imageLocation3 = y4Var.f39718b;
        String str2 = y4Var.d;
        BitmapDrawable bitmapDrawable = y4Var.f39721g;
        Object obj = y4Var.h;
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) v4Var.d;
        w9Var.getImageReceiver().setCurrentAccount(i10);
        w9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        w9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            e5[] e5VarArr = this.f32512s;
            if (i11 < e5VarArr.length) {
                e5 e5Var = e5VarArr[i11];
                String string = LocaleController.getString(e5Var.f32808a, e5Var.f32809b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f32512s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, e5Var.f32810c, string, false, this.f32509f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new ai.f2(24, this, e5Var));
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
        if (this.f32511r == z10) {
            return;
        }
        this.f32511r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f32506a;
        } else {
            timeInterpolator = org.telegram.ui.Components.rr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final d5 f31963b;

            {
                this.f31963b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        d5 d5Var = this.f31963b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                        k0 k0Var = d5Var.f32507b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.p.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        d5Var.f32508c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        d5 d5Var2 = this.f31963b;
                        d5Var2.v.setAlpha(floatValue2);
                        d5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final d5 f31963b;

            {
                this.f31963b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        d5 d5Var = this.f31963b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                        k0 k0Var = d5Var.f32507b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.p.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        d5Var.f32508c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        d5 d5Var2 = this.f31963b;
                        d5Var2.v.setAlpha(floatValue2);
                        d5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f32510n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32510n = animatorSet2;
        if (z10) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f32510n.playTogether(ofFloat, ofFloat2);
        this.f32510n.addListener(new ai.n(20, this, z10));
        this.f32510n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v4 v4Var = this.f32508c;
        boolean z10 = v4Var.f38291c;
        RadialProgress2 radialProgress2 = (RadialProgress2) v4Var.e;
        if (z10 && !TextUtils.isEmpty(this.f32514x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f32514x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f32514x)) {
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
        if (i10 != 0 && i11 != 0 && this.f32511r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new fu0(this, 12));
        }
        gh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
