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
public final class bs0 extends Dialog {
    public float E;
    public float F;
    public final ui.b G;
    public final dh.c H;
    public org.telegram.messenger.gj I;
    public boolean J;
    public zr0 K;
    public as0 L;
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
    public final Context f46277a;
    public float f46278a0;
    public final org.telegram.ui.ActionBar.h6 f46279b;
    public float f46280b0;
    public final xr0 f46281c;
    public boolean f46282c0;
    public final xr0 d;
    public boolean f46283d0;
    public final xr0 f46284e;
    public boolean f46285e0;
    public final hi.h1 f46286f;
    public ul f46287f0;
    public ValueAnimator f46288g0;
    public final TextView h;
    public ValueAnimator f46289h0;
    public final org.telegram.ui.Components.ua0 f46290n;
    public i0.b f46291r;
    public Bitmap f46292s;
    public BitmapShader f46293w;
    public Paint f46294x;
    public Matrix f46295y;

    public bs0(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, 2131755352);
        this.f46291r = i0.b.f15882e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        this.f46283d0 = false;
        this.f46277a = activity;
        this.f46279b = h6Var;
        xr0 xr0Var = new xr0(this, activity, 0);
        this.f46281c = xr0Var;
        xr0Var.setOnClickListener(new j40(this, 23));
        ui.b bVar = new ui.b();
        this.G = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.H = cVar;
        cVar.h = new jh.k(xr0Var);
        cVar.f8372i = xr0Var;
        xr0 xr0Var2 = new xr0(this, activity, 1);
        this.d = xr0Var2;
        xr0Var2.setClipToPadding(false);
        xr0Var.addView(xr0Var2, c8.na.e(-1, -1, 119));
        hi.h1 h1Var = new hi.h1(5, activity, this);
        this.f46286f = h1Var;
        h1Var.setAdapter(new di.i4(4, activity, this));
        xr0Var2.addView(h1Var, c8.na.e(-1, -1, 119));
        xr0 xr0Var3 = new xr0(this, activity, 2);
        this.f46284e = xr0Var3;
        xr0Var2.addView(xr0Var3, c8.na.e(-1, -1, 119));
        org.telegram.ui.Components.ua0 ua0Var = new org.telegram.ui.Components.ua0(activity, h6Var);
        this.f46290n = ua0Var;
        ua0Var.a(0, org.telegram.messenger.hd.N0(2131746974, null));
        ua0Var.a(1, org.telegram.messenger.hd.N0(2131746973, null));
        xr0Var2.addView(ua0Var, c8.na.e(-1, 66, 80));
        ua0Var.setOnTabClick(new r3(h1Var, 20));
        fh.g c10 = cVar.c(ua0Var, null, false);
        c10.p(c8.j0.l(h6Var));
        c10.R.f11634e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ua0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ua0Var.getColor());
        textView.setText(org.telegram.messenger.hd.N0(2131746975, null));
        textView.setGravity(17);
        xr0Var2.addView(textView, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        yr0 yr0Var = new yr0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56254a;
        r0.a0.i(xr0Var, yr0Var);
    }

    public final void b(boolean z10, rr0 rr0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f46288g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f46289h0;
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
        this.f46288g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final bs0 f52076b;

            {
                this.f52076b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        bs0 bs0Var = this.f52076b;
                        bs0Var.E = floatValue;
                        bs0Var.f46281c.invalidate();
                        bs0Var.d.invalidate();
                        zr0 zr0Var = bs0Var.K;
                        if (zr0Var != null) {
                            zr0Var.invalidate();
                        }
                        bs0Var.e();
                        return;
                    default:
                        bs0 bs0Var2 = this.f52076b;
                        bs0Var2.getClass();
                        bs0Var2.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f46288g0.addListener(new androidx.fragment.app.g(this, z10, rr0Var, 12));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f46288g0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        valueAnimator3.setInterpolator(nrVar);
        this.f46288g0.setDuration(j3);
        this.f46288g0.start();
        float f13 = this.F;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f46289h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final bs0 f52076b;

            {
                this.f52076b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        bs0 bs0Var = this.f52076b;
                        bs0Var.E = floatValue;
                        bs0Var.f46281c.invalidate();
                        bs0Var.d.invalidate();
                        zr0 zr0Var = bs0Var.K;
                        if (zr0Var != null) {
                            zr0Var.invalidate();
                        }
                        bs0Var.e();
                        return;
                    default:
                        bs0 bs0Var2 = this.f52076b;
                        bs0Var2.getClass();
                        bs0Var2.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f46289h0.addListener(new c30(5, this, z10));
        this.f46289h0.setDuration(((float) j3) * 1.5f);
        this.f46289h0.setInterpolator(nrVar);
        this.f46289h0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Components.xi0 xi0Var;
        if (z10 && (xi0Var = this.R) != null && xi0Var.getReactionsWindow() != null && !this.R.getReactionsWindow().f5303q) {
            this.R.e();
        } else if (this.f46283d0) {
        } else {
            this.f46283d0 = true;
            this.Z = false;
            hi.h1 h1Var = this.f46286f;
            h1Var.g();
            if (h1Var.getCurrentPosition() == 1) {
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
                r1Var3.f31367d6 = null;
                r1Var3.invalidate();
            }
            this.f46285e0 = !z10;
            d();
            b(false, new rr0(this, z11));
            this.f46281c.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.Z) {
            xr0 xr0Var = this.f46281c;
            if (xr0Var.getWidth() > 0) {
                org.telegram.ui.Cells.r1 r1Var = this.M;
                if (r1Var != null) {
                    int[] iArr = new int[2];
                    r1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f46291r;
                    this.X = i10 - bVar.f15883a;
                    float f10 = iArr[1] - bVar.f15884b;
                    this.Y = f10;
                    if (!this.f46282c0) {
                        this.f46282c0 = true;
                        this.f46278a0 = f10;
                        if (this.U != null) {
                            float height = f10 + this.M.getHeight() + this.U.getHeight();
                            int height2 = xr0Var.getHeight();
                            i0.b bVar2 = this.f46291r;
                            if (height > ((height2 - bVar2.f15884b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = xr0Var.getHeight();
                                i0.b bVar3 = this.f46291r;
                                this.f46278a0 = ((((height3 - bVar3.f15884b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                            }
                        }
                        int W1 = this.K.W1(this.Q);
                        this.K.V1(W1);
                        float U1 = this.K.U1(W1);
                        float f11 = this.Y;
                        this.f46280b0 = f11;
                        float f12 = (int) U1;
                        int height4 = xr0Var.getHeight();
                        i0.b bVar4 = this.f46291r;
                        int L = ((height4 - bVar4.f15884b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = xr0Var.getHeight();
                            i0.b bVar5 = this.f46291r;
                            this.f46280b0 = ((((height5 - bVar5.f15884b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.S != null) {
                            float height6 = this.f46280b0 + f12 + viewGroup.getHeight();
                            int height7 = xr0Var.getHeight();
                            i0.b bVar6 = this.f46291r;
                            if (height6 > (((height7 - bVar6.f15884b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = xr0Var.getHeight();
                                i0.b bVar7 = this.f46291r;
                                this.f46280b0 = (((((height8 - bVar7.f15884b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.S.getHeight();
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
        hi.h1 h1Var = this.f46286f;
        float positionAnimated = h1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -h1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, h1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.Y;
                this.f46278a0 = f14;
                float height = f14 + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                xr0 xr0Var = this.f46281c;
                int height2 = xr0Var.getHeight();
                i0.b bVar = this.f46291r;
                if (height > ((height2 - bVar.f15884b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = xr0Var.getHeight();
                    i0.b bVar2 = this.f46291r;
                    this.f46278a0 = ((((height3 - bVar2.f15884b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        as0 as0Var = this.L;
        float f15 = this.X;
        if (this.f46285e0) {
            f10 = 1.0f;
        } else {
            f10 = this.E;
        }
        as0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        as0 as0Var2 = this.L;
        float f16 = this.Y;
        float f17 = this.f46278a0;
        if (this.f46285e0) {
            f11 = 1.0f;
        } else {
            f11 = this.E;
        }
        as0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.U;
        xr0 xr0Var2 = this.f46284e;
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
            this.V = xr0Var2.getMeasuredWidth() - (this.U.getX() - W12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - xr0Var2.getTop());
            this.U.setAlpha(this.E);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.U.setScaleX(T1);
            this.U.setScaleY(T1);
        }
        zr0 zr0Var = this.K;
        float f19 = this.X;
        if (this.f46285e0) {
            f12 = 1.0f;
        } else {
            f12 = this.E;
        }
        zr0Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        zr0 zr0Var2 = this.K;
        float f20 = this.Y;
        float f21 = this.f46280b0;
        if (this.f46285e0) {
            f13 = 1.0f;
        } else {
            f13 = this.E;
        }
        zr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
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
            this.T = xr0Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.K.getY() + ((int) U1)) - this.S.getTop()) - xr0Var2.getTop());
            this.S.setAlpha(this.E);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.S.setScaleX(T12);
            this.S.setScaleY(T12);
        }
        if (this.f46285e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = W12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - xr0Var2.getTop()));
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
        org.telegram.ui.Components.ua0 ua0Var = this.f46290n;
        ua0Var.setSelectedTab(positionAnimated);
        ua0Var.setAlpha(this.E);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        xr0 xr0Var = this.f46281c;
        setContentView(xr0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        xr0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(xr0Var, !org.telegram.ui.ActionBar.m6.I.q());
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
