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
    public org.telegram.ui.Components.qk0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f35752a;
    public float f35753a0;
    public final org.telegram.ui.ActionBar.e6 f35754b;
    public boolean f35755b0;
    public final hw0 f35756c;
    public boolean f35757c0;
    public final hw0 d;
    public boolean f35758d0;
    public final hw0 e;
    public wm f35759e0;
    public final ci.i1 f35760f;
    public ValueAnimator f35761f0;
    public ValueAnimator f35762g0;
    public final TextView h;
    public final org.telegram.ui.Components.cc0 f35763n;
    public i0.b f35764r;
    public Bitmap f35765s;
    public BitmapShader v;
    public Paint f35766w;
    public Matrix f35767x;
    public float f35768y;

    public mw0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, R.style.TransparentDialog);
        this.f35764r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f35757c0 = false;
        this.f35752a = activity;
        this.f35754b = e6Var;
        hw0 hw0Var = new hw0(this, activity, 0);
        this.f35756c = hw0Var;
        hw0Var.setOnClickListener(new k60(this, 22));
        fh.b bVar = new fh.b();
        this.F = bVar;
        ah.c cVar = new ah.c(bVar);
        this.G = cVar;
        cVar.f425f = new hh.k(hw0Var);
        cVar.f426g = hw0Var;
        hw0 hw0Var2 = new hw0(this, activity, 1);
        this.d = hw0Var2;
        hw0Var2.setClipToPadding(false);
        hw0Var.addView(hw0Var2, w7.y5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 5);
        this.f35760f = i1Var;
        i1Var.setAdapter(new iw0(this, activity, 0));
        hw0Var2.addView(i1Var, w7.y5.e(-1, -1, 119));
        hw0 hw0Var3 = new hw0(this, activity, 2);
        this.e = hw0Var3;
        hw0Var2.addView(hw0Var3, w7.y5.e(-1, -1, 119));
        org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(activity, e6Var);
        this.f35763n = cc0Var;
        cc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        cc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        hw0Var2.addView(cc0Var, w7.y5.e(-1, 66, 80));
        cc0Var.setOnTabClick(new s3(i1Var, 14));
        ch.d c10 = cVar.c(cc0Var, null, false);
        c10.o(eh.b.k(e6Var));
        c10.f4288j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        cc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(cc0Var.getColor());
        org.telegram.messenger.wh.k(R.string.PollMenuHint, textView, 17);
        hw0Var2.addView(textView, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        jw0 jw0Var = new jw0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f42096a;
        r0.a0.j(hw0Var, jw0Var);
    }

    public final void b(boolean z10, bw0 bw0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35761f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35762g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35768y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35761f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final mw0 f32810b;

            {
                this.f32810b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        mw0 mw0Var = this.f32810b;
                        mw0Var.f35768y = floatValue;
                        mw0Var.f35756c.invalidate();
                        mw0Var.d.invalidate();
                        kw0 kw0Var = mw0Var.J;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                        }
                        mw0Var.e();
                        return;
                    default:
                        mw0 mw0Var2 = this.f32810b;
                        mw0Var2.getClass();
                        mw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35761f0.addListener(new androidx.fragment.app.g(this, z10, bw0Var, 9));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35761f0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.f35761f0.setDuration(j3);
        this.f35761f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35762g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final mw0 f32810b;

            {
                this.f32810b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        mw0 mw0Var = this.f32810b;
                        mw0Var.f35768y = floatValue;
                        mw0Var.f35756c.invalidate();
                        mw0Var.d.invalidate();
                        kw0 kw0Var = mw0Var.J;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                        }
                        mw0Var.e();
                        return;
                    default:
                        mw0 mw0Var2 = this.f32810b;
                        mw0Var2.getClass();
                        mw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35762g0.addListener(new h70(4, this, z10));
        this.f35762g0.setDuration(((float) j3) * 1.5f);
        this.f35762g0.setInterpolator(qrVar);
        this.f35762g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.qk0 qk0Var;
        if (z10 && (qk0Var = this.Q) != null && qk0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f49239q) {
            this.Q.e();
        } else if (this.f35757c0) {
        } else {
            this.f35757c0 = true;
            this.Y = false;
            ci.i1 i1Var = this.f35760f;
            i1Var.l();
            if (i1Var.getCurrentPosition() == 1) {
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
            this.f35758d0 = !z10;
            d();
            b(false, new bw0(this, z11));
            this.f35756c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            hw0 hw0Var = this.f35756c;
            if (hw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.L;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f35764r;
                    this.W = i11 - bVar.f10591a;
                    float f7 = iArr[1] - bVar.f10592b;
                    this.X = f7;
                    if (!this.f35755b0) {
                        this.f35755b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = hw0Var.getHeight();
                            i0.b bVar2 = this.f35764r;
                            if (height > ((height2 - bVar2.f10592b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = hw0Var.getHeight();
                                i0.b bVar3 = this.f35764r;
                                this.Z = ((((height3 - bVar3.f10592b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f35753a0 = f10;
                        float f11 = (int) G2;
                        int height4 = hw0Var.getHeight();
                        i0.b bVar4 = this.f35764r;
                        int dp = ((height4 - bVar4.f10592b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = hw0Var.getHeight();
                            i0.b bVar5 = this.f35764r;
                            this.f35753a0 = ((((height5 - bVar5.f10592b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f35753a0 + f11 + viewGroup.getHeight();
                            int height7 = hw0Var.getHeight();
                            i0.b bVar6 = this.f35764r;
                            if (height6 > (((height7 - bVar6.f10592b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = hw0Var.getHeight();
                                i0.b bVar7 = this.f35764r;
                                this.f35753a0 = (((((height8 - bVar7.f10592b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        ci.i1 i1Var = this.f35760f;
        float positionAnimated = i1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -i1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(i1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.X;
                this.Z = f13;
                float height = f13 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                hw0 hw0Var = this.f35756c;
                int height2 = hw0Var.getHeight();
                i0.b bVar = this.f35764r;
                if (height > ((height2 - bVar.f10592b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = hw0Var.getHeight();
                    i0.b bVar2 = this.f35764r;
                    this.Z = ((((height3 - bVar2.f10592b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        lw0 lw0Var = this.K;
        float f14 = this.W;
        if (this.f35758d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f35768y;
        }
        lw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        lw0 lw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f35758d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f35768y;
        }
        lw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        hw0 hw0Var2 = this.e;
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
            this.T.setAlpha(this.f35768y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35768y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        kw0 kw0Var = this.J;
        float f18 = this.W;
        if (this.f35758d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f35768y;
        }
        kw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        kw0 kw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f35753a0;
        if (this.f35758d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f35768y;
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
            this.R.setAlpha(this.f35768y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35768y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f35758d0) {
            this.K.setAlpha(this.f35768y);
            this.J.setAlpha(this.f35768y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - hw0Var2.getTop()));
            this.Q.setAlpha(this.f35768y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f35768y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f35768y);
        org.telegram.ui.Components.cc0 cc0Var = this.f35763n;
        cc0Var.setSelectedTab(positionAnimated);
        cc0Var.setAlpha(this.f35768y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        hw0 hw0Var = this.f35756c;
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
        AndroidUtilities.setLightNavigationBar(hw0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.nm0.d(new b5(this, 15));
        this.O = true;
        b(true, null);
    }
}
