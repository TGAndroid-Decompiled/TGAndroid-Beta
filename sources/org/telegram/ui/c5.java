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
    public static final int F = 0;
    public boolean E;
    public final OvershootInterpolator f31531a;
    public final k0 f31532b;
    public final u4 f31533c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final v4 e;
    public final org.telegram.ui.ActionBar.f6 f31534f;
    public final eh.b h;
    public AnimatorSet f31535n;
    public boolean f31536r;
    public d5[] f31537s;
    public final View v;
    public boolean f31538w;
    public String f31539x;
    public z4 f31540y;

    public c5(Context context, org.telegram.ui.ActionBar.f6 f6Var, v4 v4Var) {
        super(context);
        this.f31531a = new OvershootInterpolator(1.02f);
        eh.b bVar = new eh.b();
        this.h = bVar;
        new Matrix();
        this.e = v4Var;
        this.f31534f = f6Var;
        gh.k kVar = new gh.k(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.a6.c(-1.0f, -1));
        k0 k0Var = new k0(this, context, 2);
        this.f31532b = k0Var;
        addView(k0Var, w7.a6.c(-1.0f, -1));
        u4 u4Var = new u4(context, f6Var);
        this.f31533c = u4Var;
        bi.g gVar = xf.k0.f45156a;
        u4Var.setOutlineProvider(new xf.j0(0, AndroidUtilities.dp(12.0f)));
        u4Var.setElevation(AndroidUtilities.dp(4.0f));
        u4Var.setClipToOutline(true);
        k0Var.addView(u4Var, w7.a6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            u4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            u4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, f6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        bh.d k10 = bVar.k();
        k10.n(null);
        kVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new sg.f0(14, k10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        k10.n(dh.c.k(f6Var));
        k10.o(AndroidUtilities.dp(8.0f));
        k10.h.e = true;
        k10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(k10);
        k0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.a6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(x4 x4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f31537s = x4Var.f38578i;
        if (x4Var.f38575c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u4 u4Var = this.f31533c;
        u4Var.f37105c = z10;
        u4Var.invalidate();
        this.f31539x = x4Var.f38576f;
        z4 z4Var = this.f31540y;
        if (z4Var != null) {
            if (z4Var.f39209g) {
                z4Var.f39209g = false;
                z4Var.f39206b.removeObserver(z4Var.f39205a, z4Var.e);
            }
            this.f31540y = null;
        }
        z4 z4Var2 = x4Var.f38579j;
        if (z4Var2 != null) {
            this.f31540y = z4Var2;
            bi.h6 h6Var = new bi.h6(1, this, x4Var);
            if (!z4Var2.f39209g) {
                z4Var2.f39209g = true;
                z4Var2.f39208f = h6Var;
                z4Var2.f39206b.addObserver(z4Var2.f39205a, z4Var2.e);
                z4Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = x4Var.f38575c;
        String str = x4Var.e;
        ImageLocation imageLocation2 = x4Var.f38573a;
        ImageLocation imageLocation3 = x4Var.f38574b;
        String str2 = x4Var.d;
        BitmapDrawable bitmapDrawable = x4Var.f38577g;
        Object obj = x4Var.h;
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) u4Var.d;
        w9Var.getImageReceiver().setCurrentAccount(i10);
        w9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        w9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            d5[] d5VarArr = this.f31537s;
            if (i11 < d5VarArr.length) {
                d5 d5Var = d5VarArr[i11];
                String string = LocaleController.getString(d5Var.f31829a, d5Var.f31830b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f31537s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, d5Var.f31831c, string, false, this.f31534f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new bi.n3(21, this, d5Var));
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
        if (this.f31536r == z10) {
            return;
        }
        this.f31536r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f31531a;
        } else {
            timeInterpolator = org.telegram.ui.Components.wr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final c5 f30801b;

            {
                this.f30801b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        c5 c5Var = this.f30801b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        k0 k0Var = c5Var.f31532b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.q.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.f31533c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        c5 c5Var2 = this.f30801b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final c5 f30801b;

            {
                this.f30801b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        c5 c5Var = this.f30801b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        k0 k0Var = c5Var.f31532b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.q.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        k0Var.setScaleX(f7);
                        k0Var.setScaleY(f7);
                        k0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        c5Var.f31533c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        c5 c5Var2 = this.f30801b;
                        c5Var2.v.setAlpha(floatValue2);
                        c5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f31535n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31535n = animatorSet2;
        if (z10) {
            j3 = 190;
        } else {
            j3 = 150;
        }
        animatorSet2.setDuration(j3);
        this.f31535n.playTogether(ofFloat, ofFloat2);
        this.f31535n.addListener(new ai.e(16, this, z10));
        this.f31535n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u4 u4Var = this.f31533c;
        boolean z10 = u4Var.f37105c;
        RadialProgress2 radialProgress2 = (RadialProgress2) u4Var.e;
        if (z10 && !TextUtils.isEmpty(this.f31539x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f31539x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f31539x)) {
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
        if (i10 != 0 && i11 != 0 && this.f31536r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new mu0(this, 12));
        }
        fh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
