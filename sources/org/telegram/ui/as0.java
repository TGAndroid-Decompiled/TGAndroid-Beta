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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class as0 extends Dialog {
    public float E;
    public float F;
    public final ui.b G;
    public final dh.c H;
    public org.telegram.messenger.fj I;
    public boolean J;
    public yr0 K;
    public zr0 L;
    public org.telegram.ui.Cells.r1 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public org.telegram.ui.Components.xi0 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Context f45673a;
    public float f45674a0;
    public final org.telegram.ui.ActionBar.h6 f45675b;
    public float f45676b0;
    public final wr0 f45677c;
    public boolean f45678c0;
    public final wr0 d;
    public boolean f45679d0;
    public final wr0 f45680e;
    public boolean f45681e0;
    public final hi.i1 f45682f;
    public ul f45683f0;
    public ValueAnimator f45684g0;
    public final TextView h;
    public ValueAnimator f45685h0;
    public final org.telegram.ui.Components.ua0 f45686n;
    public i0.b f45687r;
    public Bitmap f45688s;
    public BitmapShader f45689w;
    public Paint f45690x;
    public Matrix f45691y;

    public as0(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, 2131755352);
        this.f45687r = i0.b.f15913e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        this.f45679d0 = false;
        this.f45673a = activity;
        this.f45675b = h6Var;
        wr0 wr0Var = new wr0(this, activity, 0);
        this.f45677c = wr0Var;
        wr0Var.setOnClickListener(new j40(this, 23));
        ui.b bVar = new ui.b();
        this.G = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.H = cVar;
        cVar.h = new jh.k(wr0Var);
        cVar.f8406i = wr0Var;
        wr0 wr0Var2 = new wr0(this, activity, 1);
        this.d = wr0Var2;
        wr0Var2.setClipToPadding(false);
        wr0Var.addView(wr0Var2, c8.ma.e(-1, -1, 119));
        hi.i1 i1Var = new hi.i1(5, activity, this);
        this.f45682f = i1Var;
        i1Var.setAdapter(new di.i4(4, activity, this));
        wr0Var2.addView(i1Var, c8.ma.e(-1, -1, 119));
        wr0 wr0Var3 = new wr0(this, activity, 2);
        this.f45680e = wr0Var3;
        wr0Var2.addView(wr0Var3, c8.ma.e(-1, -1, 119));
        org.telegram.ui.Components.ua0 ua0Var = new org.telegram.ui.Components.ua0(activity, h6Var);
        this.f45686n = ua0Var;
        ua0Var.a(0, org.telegram.messenger.gd.N0(2131746974, null));
        ua0Var.a(1, org.telegram.messenger.gd.N0(2131746973, null));
        wr0Var2.addView(ua0Var, c8.ma.e(-1, 66, 80));
        ua0Var.setOnTabClick(new r3(i1Var, 20));
        fh.g c10 = cVar.c(ua0Var, null, false);
        c10.p(c8.i0.l(h6Var));
        c10.R.f11668e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ua0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ua0Var.getColor());
        textView.setText(org.telegram.messenger.gd.N0(2131746975, null));
        textView.setGravity(17);
        wr0Var2.addView(textView, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        xr0 xr0Var = new xr0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56285a;
        r0.a0.i(wr0Var, xr0Var);
    }

    public final void b(boolean z10, qr0 qr0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f45684g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f45685h0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.E;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f45684g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final as0 f51754b;

            {
                this.f51754b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        as0 as0Var = this.f51754b;
                        as0Var.E = floatValue;
                        as0Var.f45677c.invalidate();
                        as0Var.d.invalidate();
                        yr0 yr0Var = as0Var.K;
                        if (yr0Var != null) {
                            yr0Var.invalidate();
                        }
                        as0Var.e();
                        return;
                    default:
                        as0 as0Var2 = this.f51754b;
                        as0Var2.getClass();
                        as0Var2.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f45684g0.addListener(new androidx.fragment.app.g(this, z10, qr0Var, 12));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f45684g0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        valueAnimator3.setInterpolator(nrVar);
        this.f45684g0.setDuration(j3);
        this.f45684g0.start();
        float f13 = this.F;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f45685h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final as0 f51754b;

            {
                this.f51754b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        as0 as0Var = this.f51754b;
                        as0Var.E = floatValue;
                        as0Var.f45677c.invalidate();
                        as0Var.d.invalidate();
                        yr0 yr0Var = as0Var.K;
                        if (yr0Var != null) {
                            yr0Var.invalidate();
                        }
                        as0Var.e();
                        return;
                    default:
                        as0 as0Var2 = this.f51754b;
                        as0Var2.getClass();
                        as0Var2.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f45685h0.addListener(new c30(5, this, z10));
        this.f45685h0.setDuration(((float) j3) * 1.5f);
        this.f45685h0.setInterpolator(nrVar);
        this.f45685h0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Components.xi0 xi0Var;
        if (z10 && (xi0Var = this.R) != null && xi0Var.getReactionsWindow() != null && !this.R.getReactionsWindow().f5337q) {
            this.R.e();
        } else if (this.f45679d0) {
        } else {
            this.f45679d0 = true;
            this.Z = false;
            hi.i1 i1Var = this.f45682f;
            i1Var.g();
            if (i1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.r1 r1Var2 = this.M;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(4);
                    this.M.invalidate();
                }
            } else if (!z10 && (r1Var = this.M) != null) {
                r1Var.setVisibility(0);
                org.telegram.ui.Cells.r1 r1Var3 = this.M;
                r1Var3.f31398d6 = null;
                r1Var3.invalidate();
            }
            this.f45681e0 = !z10;
            d();
            b(false, new qr0(this, z11));
            this.f45677c.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.Z) {
            wr0 wr0Var = this.f45677c;
            if (wr0Var.getWidth() > 0) {
                org.telegram.ui.Cells.r1 r1Var = this.M;
                if (r1Var != null) {
                    int[] iArr = new int[2];
                    r1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f45687r;
                    this.X = i10 - bVar.f15914a;
                    float f10 = iArr[1] - bVar.f15915b;
                    this.Y = f10;
                    if (!this.f45678c0) {
                        this.f45678c0 = true;
                        this.f45674a0 = f10;
                        if (this.U != null) {
                            float height = f10 + this.M.getHeight() + this.U.getHeight();
                            int height2 = wr0Var.getHeight();
                            i0.b bVar2 = this.f45687r;
                            if (height > ((height2 - bVar2.f15915b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = wr0Var.getHeight();
                                i0.b bVar3 = this.f45687r;
                                this.f45674a0 = ((((height3 - bVar3.f15915b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                            }
                        }
                        int W1 = this.K.W1(this.Q);
                        this.K.V1(W1);
                        float U1 = this.K.U1(W1);
                        float f11 = this.Y;
                        this.f45676b0 = f11;
                        float f12 = (int) U1;
                        int height4 = wr0Var.getHeight();
                        i0.b bVar4 = this.f45687r;
                        int L = ((height4 - bVar4.f15915b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = wr0Var.getHeight();
                            i0.b bVar5 = this.f45687r;
                            this.f45676b0 = ((((height5 - bVar5.f15915b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.S != null) {
                            float height6 = this.f45676b0 + f12 + viewGroup.getHeight();
                            int height7 = wr0Var.getHeight();
                            i0.b bVar6 = this.f45687r;
                            if (height6 > (((height7 - bVar6.f15915b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = wr0Var.getHeight();
                                i0.b bVar7 = this.f45687r;
                                this.f45676b0 = (((((height8 - bVar7.f15915b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.S.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.Y = 0.0f;
                    this.X = 0.0f;
                }
                this.Z = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        hi.i1 i1Var = this.f45682f;
        float positionAnimated = i1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -i1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, i1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.Y;
                this.f45674a0 = f14;
                float height = f14 + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                wr0 wr0Var = this.f45677c;
                int height2 = wr0Var.getHeight();
                i0.b bVar = this.f45687r;
                if (height > ((height2 - bVar.f15915b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = wr0Var.getHeight();
                    i0.b bVar2 = this.f45687r;
                    this.f45674a0 = ((((height3 - bVar2.f15915b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        zr0 zr0Var = this.L;
        float f15 = this.X;
        if (this.f45681e0) {
            f10 = 1.0f;
        } else {
            f10 = this.E;
        }
        zr0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        zr0 zr0Var2 = this.L;
        float f16 = this.Y;
        float f17 = this.f45674a0;
        if (this.f45681e0) {
            f11 = 1.0f;
        } else {
            f11 = this.E;
        }
        zr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.U;
        wr0 wr0Var2 = this.f45680e;
        if (viewGroup2 != null) {
            if (this.J) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((W12 + 0.0f) + this.L.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.U.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.L.b3()) {
                    i7 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i7 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i7) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = wr0Var2.getMeasuredWidth() - (this.U.getX() - W12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - wr0Var2.getTop());
            this.U.setAlpha(this.E);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.U.setScaleX(T1);
            this.U.setScaleY(T1);
        }
        yr0 yr0Var = this.K;
        float f19 = this.X;
        if (this.f45681e0) {
            f12 = 1.0f;
        } else {
            f12 = this.E;
        }
        yr0Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        yr0 yr0Var2 = this.K;
        float f20 = this.Y;
        float f21 = this.f45676b0;
        if (this.f45681e0) {
            f13 = 1.0f;
        } else {
            f13 = this.E;
        }
        yr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.S != null) {
            int W13 = this.K.W1(this.Q);
            this.K.V1(W13);
            float U1 = this.K.U1(W13);
            if (this.J) {
                this.S.setTranslationX(((this.K.getPollButtonsLeft() + ((W1 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.S.getLeft());
            } else {
                ViewGroup viewGroup3 = this.S;
                float f22 = W1 + 0.0f;
                if (this.K.b3()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = wr0Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.K.getY() + ((int) U1)) - this.S.getTop()) - wr0Var2.getTop());
            this.S.setAlpha(this.E);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.S.setScaleX(T12);
            this.S.setScaleY(T12);
        }
        if (this.f45681e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = W12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - wr0Var2.getTop()));
            this.R.setAlpha(this.E);
            View windowView = this.R.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.E);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.E);
        org.telegram.ui.Components.ua0 ua0Var = this.f45686n;
        ua0Var.setSelectedTab(positionAnimated);
        ua0Var.setAlpha(this.E);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wr0 wr0Var = this.f45677c;
        setContentView(wr0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        wr0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(wr0Var, !org.telegram.ui.ActionBar.m6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.yk0.d(new a5(this, 16));
        this.P = true;
        b(true, null);
    }
}
