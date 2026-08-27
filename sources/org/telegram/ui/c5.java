package org.telegram.ui;

import android.animation.AnimatorSet;
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

    public final OvershootInterpolator f36948a;

    public final n0 f36949b;

    public final u4 f36950c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;

    public final v4 f36951e;

    public final org.telegram.ui.ActionBar.c6 f36952f;
    public final og.b h;

    public AnimatorSet f36953n;

    public boolean f36954r;

    public d5[] f36955s;
    public final View v;

    public boolean f36956w;

    public String f36957x;

    public z4 f36958y;

    public c5(Context context, org.telegram.ui.ActionBar.c6 c6Var, v4 v4Var) {
        super(context);
        this.f36948a = new OvershootInterpolator(1.02f);
        og.b bVar = new og.b();
        this.h = bVar;
        new Matrix();
        this.f36951e = v4Var;
        this.f36952f = c6Var;
        qg.j jVar = new qg.j(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, h7.z5.c(-1.0f, -1));
        n0 n0Var = new n0(this, context, 2);
        this.f36949b = n0Var;
        addView(n0Var, h7.z5.c(-1.0f, -1));
        u4 u4Var = new u4(context, c6Var);
        this.f36950c = u4Var;
        float fDp = AndroidUtilities.dp(12.0f);
        cg.l1 l1Var = gf.r0.f7054a;
        u4Var.setOutlineProvider(new gf.q0(0, fDp));
        u4Var.setElevation(AndroidUtilities.dp(4.0f));
        u4Var.setClipToOutline(true);
        n0Var.addView(u4Var, h7.z5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            u4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            u4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, c6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        lg.d dVarW = bVar.w();
        dVarW.n(null);
        jVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new ag.h0(29, dVarW, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        dVarW.n(ng.c.j(c6Var));
        dVarW.o(AndroidUtilities.dp(8.0f));
        dVarW.h.f15583e = true;
        dVarW.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(dVarW);
        n0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(x4 x4Var) {
        this.f36955s = x4Var.f44279i;
        boolean z10 = x4Var.f44275c != null;
        u4 u4Var = this.f36950c;
        u4Var.f43106c = z10;
        u4Var.invalidate();
        this.f36957x = x4Var.f44277f;
        z4 z4Var = this.f36958y;
        if (z4Var != null) {
            if (z4Var.f45022g) {
                z4Var.f45022g = false;
                z4Var.f45018b.removeObserver(z4Var.f45017a, z4Var.f45020e);
            }
            this.f36958y = null;
        }
        z4 z4Var2 = x4Var.f44280j;
        if (z4Var2 != null) {
            this.f36958y = z4Var2;
            cg.n0 n0Var = new cg.n0(5, this, x4Var);
            if (!z4Var2.f45022g) {
                z4Var2.f45022g = true;
                z4Var2.f45021f = n0Var;
                z4Var2.f45018b.addObserver(z4Var2.f45017a, z4Var2.f45020e);
                z4Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = x4Var.f44275c;
        String str = x4Var.f44276e;
        ImageLocation imageLocation2 = x4Var.f44273a;
        ImageLocation imageLocation3 = x4Var.f44274b;
        String str2 = x4Var.d;
        BitmapDrawable bitmapDrawable = x4Var.f44278g;
        Object obj = x4Var.h;
        org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) u4Var.d;
        n9Var.getImageReceiver().setCurrentAccount(i10);
        n9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        n9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            d5[] d5VarArr = this.f36955s;
            if (i11 >= d5VarArr.length) {
                b(true);
                return;
            }
            d5 d5Var = d5VarArr[i11];
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(i11 == 0, i11 == this.f36955s.length - 1, actionBarPopupWindow$ActionBarPopupWindowLayout2, d5Var.f37264c, LocaleController.getString(d5Var.f37262a, d5Var.f37263b), false, this.f36952f);
            f1VarC.setTag(Integer.valueOf(i11));
            f1VarC.setOnClickListener(new nh.x1(12, this, d5Var));
            i11++;
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        }
    }

    public final void b(final boolean z10) {
        if (this.f36954r == z10) {
            return;
        }
        this.f36954r = z10;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(z10 ? this.f36948a : org.telegram.ui.Components.er.h);
        final int i10 = 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final c5 f36375b;

            {
                this.f36375b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        c5 c5Var = this.f36375b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        n0 n0Var = c5Var.f36949b;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            fFloatValue = 1.0f - fFloatValue;
                        }
                        float fA = h7.n.a(fFloatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * fFloatValue) + 0.7f;
                        n0Var.setScaleX(f10);
                        n0Var.setScaleY(f10);
                        n0Var.setAlpha(fA);
                        float f11 = 1.0f - fFloatValue;
                        c5Var.f36950c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (fFloatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            fFloatValue2 = 1.0f - fFloatValue2;
                        }
                        c5 c5Var2 = this.f36375b;
                        c5Var2.v.setAlpha(fFloatValue2);
                        c5Var2.invalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i11 = 1;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final c5 f36375b;

            {
                this.f36375b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c5 c5Var = this.f36375b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                        n0 n0Var = c5Var.f36949b;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            fFloatValue = 1.0f - fFloatValue;
                        }
                        float fA = h7.n.a(fFloatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * fFloatValue) + 0.7f;
                        n0Var.setScaleX(f10);
                        n0Var.setScaleY(f10);
                        n0Var.setAlpha(fA);
                        float f11 = 1.0f - fFloatValue;
                        c5Var.f36950c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (fFloatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            fFloatValue2 = 1.0f - fFloatValue2;
                        }
                        c5 c5Var2 = this.f36375b;
                        c5Var2.v.setAlpha(fFloatValue2);
                        c5Var2.invalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet = this.f36953n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36953n = animatorSet2;
        animatorSet2.setDuration(z10 ? 190L : 150L);
        this.f36953n.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f36953n.addListener(new ag.x(21, this, z10));
        this.f36953n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u4 u4Var = this.f36950c;
        boolean z10 = u4Var.f43106c;
        RadialProgress2 radialProgress2 = (RadialProgress2) u4Var.f43107e;
        if (!z10 || TextUtils.isEmpty(this.f36957x)) {
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            if (TextUtils.equals((String) objArr[0], this.f36957x)) {
                radialProgress2.o(1.0f, true);
            }
        } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f36957x)) {
            radialProgress2.o(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
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
        }
        if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b(false);
        return true;
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
        if (i10 != 0 && i11 != 0 && this.f36954r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new lt0(this, 12));
        }
        pg.c.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
