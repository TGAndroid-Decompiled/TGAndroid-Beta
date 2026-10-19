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
public abstract class h5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int F = 0;
    public boolean E;
    public final OvershootInterpolator f37479a;
    public final m0 f37480b;
    public final z4 f37481c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final a5 e;
    public final org.telegram.ui.ActionBar.d6 f37482f;
    public final gh.b h;
    public AnimatorSet f37483n;
    public boolean f37484r;
    public i5[] f37485s;
    public final View v;
    public boolean f37486w;
    public String f37487x;
    public e5 f37488y;

    public h5(Context context, org.telegram.ui.ActionBar.d6 d6Var, a5 a5Var) {
        super(context);
        this.f37479a = new OvershootInterpolator(1.02f);
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        new Matrix();
        this.e = a5Var;
        this.f37482f = d6Var;
        bVar2.f4358f = new ih.j(this);
        bVar2.f4359g = this;
        View view = new View(context);
        this.v = view;
        view.setOnClickListener(new a(this, 4));
        addView(view, w7.z5.c(-1.0f, -1));
        m0 m0Var = new m0(this, context, 2);
        this.f37480b = m0Var;
        addView(m0Var, w7.z5.c(-1.0f, -1));
        z4 z4Var = new z4(context, d6Var);
        this.f37481c = z4Var;
        ci.o1 o1Var = zf.j0.f51576a;
        z4Var.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(12.0f)));
        z4Var.setElevation(AndroidUtilities.dp(4.0f));
        z4Var.setClipToOutline(true);
        m0Var.addView(z4Var, w7.z5.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            z4Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            z4Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, context, d6Var);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.d c10 = bVar2.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c10.o(fh.c.k(d6Var));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.f8014j.e = true;
        c10.q(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        m0Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(c5 c5Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f37485s = c5Var.f35811i;
        if (c5Var.f35808c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        z4 z4Var = this.f37481c;
        z4Var.f43618c = z10;
        z4Var.invalidate();
        this.f37487x = c5Var.f35809f;
        e5 e5Var = this.f37488y;
        if (e5Var != null) {
            if (e5Var.f36543g) {
                e5Var.f36543g = false;
                e5Var.f36540b.removeObserver(e5Var.f36539a, e5Var.e);
            }
            this.f37488y = null;
        }
        e5 e5Var2 = c5Var.f35812j;
        if (e5Var2 != null) {
            this.f37488y = e5Var2;
            ai.c8 c8Var = new ai.c8(3, this, c5Var);
            if (!e5Var2.f36543g) {
                e5Var2.f36543g = true;
                e5Var2.f36542f = c8Var;
                e5Var2.f36540b.addObserver(e5Var2.f36539a, e5Var2.e);
                e5Var2.a();
            }
        }
        int i10 = UserConfig.selectedAccount;
        ImageLocation imageLocation = c5Var.f35808c;
        String str = c5Var.e;
        ImageLocation imageLocation2 = c5Var.f35806a;
        ImageLocation imageLocation3 = c5Var.f35807b;
        String str2 = c5Var.d;
        BitmapDrawable bitmapDrawable = c5Var.f35810g;
        Object obj = c5Var.h;
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) z4Var.d;
        w9Var.getImageReceiver().setCurrentAccount(i10);
        w9Var.getImageReceiver().setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, bitmapDrawable, 0L, null, obj, 1);
        w9Var.d();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i11 = 0;
        while (true) {
            i5[] i5VarArr = this.f37485s;
            if (i11 < i5VarArr.length) {
                i5 i5Var = i5VarArr[i11];
                String string = LocaleController.getString(i5Var.f37851a, i5Var.f37852b);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == this.f37485s.length - 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout2, i5Var.f37853c, string, false, this.f37482f);
                c10.setTag(Integer.valueOf(i11));
                c10.setOnClickListener(new org.telegram.ui.ActionBar.s1(4, this, i5Var));
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
        if (this.f37484r == z10) {
            return;
        }
        this.f37484r = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            timeInterpolator = this.f37479a;
        } else {
            timeInterpolator = org.telegram.ui.Components.bs.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final h5 f36889b;

            {
                this.f36889b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        h5 h5Var = this.f36889b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.d;
                        m0 m0Var = h5Var.f37480b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.r.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        m0Var.setScaleX(f7);
                        m0Var.setScaleY(f7);
                        m0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        h5Var.f37481c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        h5 h5Var2 = this.f36889b;
                        h5Var2.v.setAlpha(floatValue2);
                        h5Var2.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final h5 f36889b;

            {
                this.f36889b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        h5 h5Var = this.f36889b;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.d;
                        m0 m0Var = h5Var.f37480b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z10) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a2 = w7.r.a(floatValue, 0.0f, 1.0f);
                        float f7 = (0.3f * floatValue) + 0.7f;
                        m0Var.setScaleX(f7);
                        m0Var.setScaleY(f7);
                        m0Var.setAlpha(a2);
                        float f10 = 1.0f - floatValue;
                        h5Var.f37481c.setTranslationY(AndroidUtilities.dp(40.0f) * f10);
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
                        h5 h5Var2 = this.f36889b;
                        h5Var2.v.setAlpha(floatValue2);
                        h5Var2.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.f37483n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f37483n = animatorSet2;
        if (z10) {
            j10 = 190;
        } else {
            j10 = 150;
        }
        animatorSet2.setDuration(j10);
        this.f37483n.playTogether(ofFloat, ofFloat2);
        this.f37483n.addListener(new ah.p0(21, this, z10));
        this.f37483n.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z4 z4Var = this.f37481c;
        boolean z10 = z4Var.f43618c;
        RadialProgress2 radialProgress2 = (RadialProgress2) z4Var.e;
        if (z10 && !TextUtils.isEmpty(this.f37487x)) {
            if (i10 == NotificationCenter.fileLoaded) {
                if (TextUtils.equals((String) objArr[0], this.f37487x)) {
                    radialProgress2.o(1.0f, true);
                }
            } else if (i10 == NotificationCenter.fileLoadProgressChanged && TextUtils.equals((String) objArr[0], this.f37487x)) {
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
        if (i10 != 0 && i11 != 0 && this.f37484r) {
            this.v.setBackground(null);
            AndroidUtilities.runOnUIThread(new st0(this, 12));
        }
        hh.d.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
