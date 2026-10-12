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
    public final OvershootInterpolator f37628a;
    public final k0 f37629b;
    public final x4 f37630c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final y4 f37631e;
    public final org.telegram.ui.ActionBar.c6 f37632f;
    public final fh.b h;
    public AnimatorSet f37633n;
    public boolean f37634r;
    public g5[] f37635s;
    public final View v;
    public boolean f37636w;
    public String f37637x;
    public c5 f37638y;

    public f5(Context context, org.telegram.ui.ActionBar.c6 c6Var, y4 y4Var) {
        super(context);
        this.f37628a = new OvershootInterpolator(1.02f);
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        new Matrix();
        this.f37631e = y4Var;
        this.f37632f = c6Var;
        cVar.f547f = new hh.j(this);
        cVar.f548g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.w5.d(-1.0f, -1));
        k0 k0Var = new k0(this, context, 2);
        this.f37629b = k0Var;
        addView(k0Var, w7.w5.d(-1.0f, -1));
        x4 x4Var = new x4(context, c6Var);
        this.f37630c = x4Var;
        ai.l2 l2Var = yf.i0.f52403a;
        x4Var.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(12.0f)));
        x4Var.setElevation(AndroidUtilities.dp(4.0f));
        x4Var.setClipToOutline(true);
        k0Var.addView(x4Var, w7.w5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            x4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            x4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, c6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(eh.b.k(c6Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f4683j.f4666e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.w5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(a5 a5Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f37635s = a5Var.f35705i;
        if (a5Var.f35701c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x4 x4Var = this.f37630c;
        x4Var.f43753c = z10;
        x4Var.invalidate();
        this.f37637x = a5Var.f35703f;
        c5 c5Var = this.f37638y;
        if (c5Var != null) {
            if (c5Var.f36329g) {
                c5Var.f36329g = false;
                c5Var.f36325b.removeObserver(c5Var.f36324a, c5Var.f36327e);
            }
            this.f37638y = null;
        }
        c5 c5Var2 = a5Var.f35706j;
        if (c5Var2 != null) {
            this.f37638y = c5Var2;
            ci.j5 j5Var = new ci.j5(1, this, a5Var);
            if (!c5Var2.f36329g) {
                c5Var2.f36329g = true;
                c5Var2.f36328f = j5Var;
                c5Var2.f36325b.addObserver(c5Var2.f36324a, c5Var2.f36327e);
                c5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = a5Var.f35701c;
        String str = a5Var.f35702e;
        ImageLocation imageLocation2 = a5Var.f35699a;
        ImageLocation imageLocation3 = a5Var.f35700b;
        String str2 = a5Var.d;
        BitmapDrawable bitmapDrawable = a5Var.f35704g;
        Object obj = a5Var.h;
        org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) x4Var.d;
        y9Var.getImageReceiver().setCurrentAccount(i10);
        y9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        y9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            g5[] g5VarArr = this.f37635s;
            if (i11 < g5VarArr.length) {
                g5 g5Var = g5VarArr[i11];
                String string = LocaleController.getString(g5Var.f37932a, g5Var.f37933b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f37635s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, g5Var.f37934c, string, false, this.f37632f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new ai.f2(24, this, g5Var));
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
        if (this.f37634r == z10) {
            return;
        }
        this.f37634r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f37628a;
        } else {
            timeInterpolator = org.telegram.ui.Components.js.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final f5 f36649b;

            {
                this.f36649b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        f5 f5Var = this.f36649b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.d;
                        k0 k0Var = f5Var.f37629b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.n.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        f5Var.f37630c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        f5 f5Var2 = this.f36649b;
                        f5Var2.v.setAlpha(floatValue2);
                        f5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final f5 f36649b;

            {
                this.f36649b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        f5 f5Var = this.f36649b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.d;
                        k0 k0Var = f5Var.f37629b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.n.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        f5Var.f37630c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        f5 f5Var2 = this.f36649b;
                        f5Var2.v.setAlpha(floatValue2);
                        f5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f37633n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f37633n = animatorSet2;
        if (z10) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f37633n.playTogether(ofFloat, ofFloat2);
        this.f37633n.addListener(new ai.n(20, this, z10));
        this.f37633n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x4 x4Var = this.f37630c;
        boolean z10 = x4Var.f43753c;
        RadialProgress2 radialProgress2 = (RadialProgress2) x4Var.f43754e;
        if (z10 && !TextUtils.isEmpty(this.f37637x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f37637x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f37637x)) {
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
        if (i10 != 0 && i11 != 0 && this.f37634r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new pu0(this, 12));
        }
        gh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
