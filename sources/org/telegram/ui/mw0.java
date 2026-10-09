package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mw0 extends Dialog {
    public float E;
    public final fh.b F;
    public final ah.c G;
    public MessageObject H;
    public boolean I;
    public kw0 J;
    public lw0 K;
    public org.telegram.ui.Cells.u1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.kl0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f40001a;
    public float f40002a0;
    public final org.telegram.ui.ActionBar.e6 f40003b;
    public boolean f40004b0;
    public final hw0 f40005c;
    public boolean f40006c0;
    public final hw0 d;
    public boolean f40007d0;
    public final hw0 f40008e;
    public wm f40009e0;
    public final ci.h1 f40010f;
    public ValueAnimator f40011f0;
    public ValueAnimator f40012g0;
    public final TextView h;
    public final org.telegram.ui.Components.tc0 f40013n;
    public i0.b f40014r;
    public Bitmap f40015s;
    public BitmapShader v;
    public Paint f40016w;
    public Matrix f40017x;
    public float f40018y;

    public mw0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40014r = i0.b.f11575e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f40006c0 = false;
        this.f40001a = activity;
        this.f40003b = e6Var;
        hw0 hw0Var = new hw0(this, activity, 0);
        this.f40005c = hw0Var;
        hw0Var.setOnClickListener(new m60(this, 21));
        fh.b bVar = new fh.b();
        this.F = bVar;
        ah.c cVar = new ah.c(bVar);
        this.G = cVar;
        cVar.f545f = new hh.j(hw0Var);
        cVar.f546g = hw0Var;
        hw0 hw0Var2 = new hw0(this, activity, 1);
        this.d = hw0Var2;
        hw0Var2.setClipToPadding(false);
        hw0Var.addView(hw0Var2, w7.x5.e(-1, -1, 119));
        ci.h1 h1Var = new ci.h1(this, activity, 5);
        this.f40010f = h1Var;
        h1Var.setAdapter(new iw0(this, activity, 0));
        hw0Var2.addView(h1Var, w7.x5.e(-1, -1, 119));
        hw0 hw0Var3 = new hw0(this, activity, 2);
        this.f40008e = hw0Var3;
        hw0Var2.addView(hw0Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(activity, e6Var);
        this.f40013n = tc0Var;
        tc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        tc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        hw0Var2.addView(tc0Var, w7.x5.e(-1, 66, 80));
        tc0Var.setOnTabClick(new t3(h1Var, 17));
        ch.d c10 = cVar.c(tc0Var, null, false);
        c10.o(eh.b.k(e6Var));
        c10.f4685j.f4668e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tc0Var.getColor());
        org.telegram.messenger.bi.m(R.string.PollMenuHint, textView, 17);
        hw0Var2.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        jw0 jw0Var = new jw0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(hw0Var, jw0Var);
    }

    public final void b(boolean z10, bw0 bw0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f40011f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40012g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40018y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40011f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final mw0 f36745b;

            {
                this.f36745b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        mw0 mw0Var = this.f36745b;
                        mw0Var.f40018y = floatValue;
                        mw0Var.f40005c.invalidate();
                        mw0Var.d.invalidate();
                        kw0 kw0Var = mw0Var.J;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                        }
                        mw0Var.e();
                        return;
                    default:
                        mw0 mw0Var2 = this.f36745b;
                        mw0Var2.getClass();
                        mw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40011f0.addListener(new androidx.fragment.app.g(this, z10, bw0Var, 9));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40011f0;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        valueAnimator3.setInterpolator(hsVar);
        this.f40011f0.setDuration(j3);
        this.f40011f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40012g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final mw0 f36745b;

            {
                this.f36745b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        mw0 mw0Var = this.f36745b;
                        mw0Var.f40018y = floatValue;
                        mw0Var.f40005c.invalidate();
                        mw0Var.d.invalidate();
                        kw0 kw0Var = mw0Var.J;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                        }
                        mw0Var.e();
                        return;
                    default:
                        mw0 mw0Var2 = this.f36745b;
                        mw0Var2.getClass();
                        mw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40012g0.addListener(new f70(4, this, z10));
        this.f40012g0.setDuration(((float) j3) * 1.5f);
        this.f40012g0.setInterpolator(hsVar);
        this.f40012g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.kl0 kl0Var;
        if (z10 && (kl0Var = this.Q) != null && kl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f54461q) {
            this.Q.e();
        } else if (this.f40006c0) {
        } else {
            this.f40006c0 = true;
            this.Y = false;
            ci.h1 h1Var = this.f40010f;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.u1 u1Var2 = this.L;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (u1Var = this.L) != null) {
                u1Var.setVisibility(0);
                org.telegram.ui.Cells.u1 u1Var3 = this.L;
                u1Var3.L7 = null;
                u1Var3.invalidate();
            }
            this.f40007d0 = !z10;
            d();
            b(false, new bw0(this, z11));
            this.f40005c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            hw0 hw0Var = this.f40005c;
            if (hw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.L;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40014r;
                    this.W = i11 - bVar.f11576a;
                    float f7 = iArr[1] - bVar.f11577b;
                    this.X = f7;
                    if (!this.f40004b0) {
                        this.f40004b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = hw0Var.getHeight();
                            i0.b bVar2 = this.f40014r;
                            if (height > ((height2 - bVar2.f11577b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = hw0Var.getHeight();
                                i0.b bVar3 = this.f40014r;
                                this.Z = ((((height3 - bVar3.f11577b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f40002a0 = f10;
                        float f11 = (int) G2;
                        int height4 = hw0Var.getHeight();
                        i0.b bVar4 = this.f40014r;
                        int dp = ((height4 - bVar4.f11577b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = hw0Var.getHeight();
                            i0.b bVar5 = this.f40014r;
                            this.f40002a0 = ((((height5 - bVar5.f11577b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f40002a0 + f11 + viewGroup.getHeight();
                            int height7 = hw0Var.getHeight();
                            i0.b bVar6 = this.f40014r;
                            if (height6 > (((height7 - bVar6.f11577b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = hw0Var.getHeight();
                                i0.b bVar7 = this.f40014r;
                                this.f40002a0 = (((((height8 - bVar7.f11577b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.X = 0.0f;
                    this.W = 0.0f;
                }
                this.Y = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        ci.h1 h1Var = this.f40010f;
        float positionAnimated = h1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.X;
                this.Z = f13;
                float height = f13 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                hw0 hw0Var = this.f40005c;
                int height2 = hw0Var.getHeight();
                i0.b bVar = this.f40014r;
                if (height > ((height2 - bVar.f11577b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = hw0Var.getHeight();
                    i0.b bVar2 = this.f40014r;
                    this.Z = ((((height3 - bVar2.f11577b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        lw0 lw0Var = this.K;
        float f14 = this.W;
        if (this.f40007d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f40018y;
        }
        lw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        lw0 lw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f40007d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40018y;
        }
        lw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        hw0 hw0Var2 = this.f40008e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.K.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = hw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - hw0Var2.getTop());
            this.T.setAlpha(this.f40018y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40018y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        kw0 kw0Var = this.J;
        float f18 = this.W;
        if (this.f40007d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40018y;
        }
        kw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        kw0 kw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f40002a0;
        if (this.f40007d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40018y;
        }
        kw0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.R != null) {
            int I2 = this.J.I2(this.P);
            this.J.H2(I2);
            float G2 = this.J.G2(I2);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f21 = lerp + 0.0f;
                if (this.J.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = hw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - hw0Var2.getTop());
            this.R.setAlpha(this.f40018y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40018y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f40007d0) {
            this.K.setAlpha(this.f40018y);
            this.J.setAlpha(this.f40018y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - hw0Var2.getTop()));
            this.Q.setAlpha(this.f40018y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40018y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40018y);
        org.telegram.ui.Components.tc0 tc0Var = this.f40013n;
        tc0Var.setSelectedTab(positionAnimated);
        tc0Var.setAlpha(this.f40018y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        hw0 hw0Var = this.f40005c;
        setContentView(hw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        hw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(hw0Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.gn0.d(new b5(this, 15));
        this.O = true;
        b(true, null);
    }
}
