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
public abstract class b5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int B = 0;
    public boolean A;
    public final OvershootInterpolator f36634a;
    public final m0 f36635b;
    public final t4 f36636c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final u4 f36637e;
    public final org.telegram.ui.ActionBar.b6 f36638f;
    public final ng.b h;
    public AnimatorSet f36639n;
    public boolean f36640r;
    public c5[] f36641s;
    public final View v;
    public boolean f36642w;
    public String f36643x;
    public y4 f36644y;

    public b5(Context context, org.telegram.ui.ActionBar.b6 b6Var, u4 u4Var) {
        super(context);
        this.f36634a = new OvershootInterpolator(1.02f);
        ng.b bVar = new ng.b();
        this.h = bVar;
        new Matrix();
        this.f36637e = u4Var;
        this.f36638f = b6Var;
        pg.i iVar = new pg.i(this);
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, g7.e6.c(-1.0f, -1));
        m0 m0Var = new m0(this, context, 2);
        this.f36635b = m0Var;
        addView(m0Var, g7.e6.c(-1.0f, -1));
        t4 t4Var = new t4(context, b6Var);
        this.f36636c = t4Var;
        bg.q1 q1Var = ff.r0.f6254a;
        t4Var.setOutlineProvider(new ff.q0(0, AndroidUtilities.dp(12.0f)));
        t4Var.setElevation(AndroidUtilities.dp(4.0f));
        t4Var.setClipToOutline(true);
        m0Var.addView(t4Var, g7.e6.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            t4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            t4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, b6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        kg.d y10 = bVar.y();
        y10.n(null);
        iVar.d(actionBarPopupWindow$ActionBarPopupWindowLayout, this, new b5.d(28, y10, actionBarPopupWindow$ActionBarPopupWindowLayout), false);
        y10.n(mg.c.j(b6Var));
        y10.o(AndroidUtilities.dp(8.0f));
        y10.h.f14805e = true;
        y10.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(y10);
        m0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, g7.e6.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(w4 w4Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f36641s = w4Var.f43661i;
        if (w4Var.f43657c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t4 t4Var = this.f36636c;
        t4Var.f42849c = z10;
        t4Var.invalidate();
        this.f36643x = w4Var.f43659f;
        y4 y4Var = this.f36644y;
        if (y4Var != null) {
            if (y4Var.f44716g) {
                y4Var.f44716g = false;
                y4Var.f44712b.removeObserver(y4Var.f44711a, y4Var.f44714e);
            }
            this.f36644y = null;
        }
        y4 y4Var2 = w4Var.f43662j;
        if (y4Var2 != null) {
            this.f36644y = y4Var2;
            bg.r0 r0Var = new bg.r0(5, this, w4Var);
            if (!y4Var2.f44716g) {
                y4Var2.f44716g = true;
                y4Var2.f44715f = r0Var;
                y4Var2.f44712b.addObserver(y4Var2.f44711a, y4Var2.f44714e);
                y4Var2.a();
            }
        }
        int i9 = UserConfig.selectedAccount;
        ImageLocation imageLocation = w4Var.f43657c;
        String str = w4Var.f43658e;
        ImageLocation imageLocation2 = w4Var.f43655a;
        ImageLocation imageLocation3 = w4Var.f43656b;
        String str2 = w4Var.d;
        BitmapDrawable bitmapDrawable = w4Var.f43660g;
        Object obj = w4Var.h;
        org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) t4Var.d;
        o9Var.getImageReceiver().setCurrentAccount(i9);
        o9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        o9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i10 = 0;
        while (true) {
            c5[] c5VarArr = this.f36641s;
            if (i10 < c5VarArr.length) {
                c5 c5Var = c5VarArr[i10];
                String string = LocaleController.getString(c5Var.f37067a, c5Var.f37068b);
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 == this.f36641s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, c5Var.f37069c, string, false, this.f36638f);
                c10.setTag(Integer.valueOf(i10));
                c10.setOnClickListener(new mh.k3(11, this, c5Var));
                i10++;
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
        if (this.f36640r == z10) {
            return;
        }
        this.f36640r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f36634a;
        } else {
            timeInterpolator = org.telegram.ui.Components.gr.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f45020b;

            {
                this.f45020b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f45020b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        m0 m0Var = b5Var.f36635b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = g7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        m0Var.setScaleX(f10);
                        m0Var.setScaleY(f10);
                        m0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        b5Var.f36636c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.f45020b;
                        b5Var2.v.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final b5 f45020b;

            {
                this.f45020b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f45020b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                        m0 m0Var = b5Var.f36635b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = g7.n.a(floatValue, 0.0f, 1.0f);
                        float f10 = (0.3f * floatValue) + 0.7f;
                        m0Var.setScaleX(f10);
                        m0Var.setScaleY(f10);
                        m0Var.setAlpha(a2);
                        float f11 = 1.0f - floatValue;
                        b5Var.f36636c.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                        float f12 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f12);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f12);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        b5 b5Var2 = this.f45020b;
                        b5Var2.v.setAlpha(floatValue2);
                        b5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f36639n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36639n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f36639n.playTogether(ofFloat, ofFloat2);
        this.f36639n.addListener(new hg.b0(20, this, z10));
        this.f36639n.start();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        t4 t4Var = this.f36636c;
        boolean z10 = t4Var.f42849c;
        RadialProgress2 radialProgress2 = (RadialProgress2) t4Var.f42850e;
        if (z10 && !TextUtils.isEmpty(this.f36643x)) {
            if (i9 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f36643x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i9 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f36643x)) {
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        if (i9 != 0 && i10 != 0 && this.f36640r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new kt0(this, 12));
        }
        og.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
