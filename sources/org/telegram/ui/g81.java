package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
public final class g81 extends Dialog {
    public float E;
    public final ui.b F;
    public final dh.c G;
    public org.telegram.messenger.fj H;
    public boolean I;
    public e81 J;
    public yr0 K;
    public org.telegram.ui.Cells.r1 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public org.telegram.ui.Components.xi0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final org.telegram.ui.ActionBar.i6 f48170a;
    public boolean f48171a0;
    public final d81 f48172b;
    public boolean f48173b0;
    public final d81 f48174c;
    public boolean f48175c0;
    public final d81 d;
    public ul f48176d0;
    public final hi.q1 f48177e;
    public ValueAnimator f48178e0;
    public final TextView f48179f;
    public ValueAnimator f48180f0;
    public final org.telegram.ui.Components.ra0 h;
    public i0.b f48181n;
    public Bitmap f48182r;
    public BitmapShader f48183s;
    public Paint f48184w;
    public Matrix f48185x;
    public float f48186y;

    public g81(Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, 2131755352);
        this.f48181n = i0.b.f15977e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f48173b0 = false;
        this.f48170a = i6Var;
        d81 d81Var = new d81(this, activity, 0);
        this.f48172b = d81Var;
        d81Var.setOnClickListener(new ny0(this, 8));
        ui.b bVar = new ui.b();
        this.F = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(d81Var);
        cVar.f8371i = d81Var;
        d81 d81Var2 = new d81(this, activity, 1);
        this.f48174c = d81Var2;
        d81Var2.setClipToPadding(false);
        d81Var.addView(d81Var2, c8.na.e(-1, -1, 119));
        hi.q1 q1Var = new hi.q1(7, activity, this);
        this.f48177e = q1Var;
        q1Var.setAdapter(new di.i4(6, activity, this));
        d81Var2.addView(q1Var, c8.na.e(-1, -1, 119));
        d81 d81Var3 = new d81(this, activity, 2);
        this.d = d81Var3;
        d81Var2.addView(d81Var3, c8.na.e(-1, -1, 119));
        org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0(activity, i6Var);
        this.h = ra0Var;
        ra0Var.a(0, org.telegram.messenger.gd.N0(2131743824, null));
        ra0Var.a(1, org.telegram.messenger.gd.N0(2131743825, null));
        d81Var2.addView(ra0Var, c8.na.e(-1, 66, 80));
        ra0Var.setOnTabClick(new r3(q1Var, 26));
        fh.g c10 = cVar.c(ra0Var, null, false);
        c10.p(c8.j0.l(i6Var));
        c10.R.f11633e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ra0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f48179f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ra0Var.getColor());
        textView.setText(org.telegram.messenger.gd.N0(2131743826, null));
        textView.setGravity(17);
        d81Var2.addView(textView, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        wr0 wr0Var = new wr0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(d81Var, wr0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.qp0 qp0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f48178e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f48180f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f48186y;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f48178e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g81 f45985b;

            {
                this.f45985b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        g81 g81Var = this.f45985b;
                        g81Var.f48186y = floatValue;
                        g81Var.f48172b.invalidate();
                        g81Var.f48174c.invalidate();
                        g81Var.e();
                        return;
                    default:
                        g81 g81Var2 = this.f45985b;
                        g81Var2.getClass();
                        g81Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f48178e0.addListener(new androidx.fragment.app.g(this, z10, qp0Var, 14));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f48178e0;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        valueAnimator3.setInterpolator(krVar);
        this.f48178e0.setDuration(j3);
        this.f48178e0.start();
        float f13 = this.E;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f48180f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g81 f45985b;

            {
                this.f45985b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        g81 g81Var = this.f45985b;
                        g81Var.f48186y = floatValue;
                        g81Var.f48172b.invalidate();
                        g81Var.f48174c.invalidate();
                        g81Var.e();
                        return;
                    default:
                        g81 g81Var2 = this.f45985b;
                        g81Var2.getClass();
                        g81Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f48180f0.addListener(new b30(11, this, z10));
        this.f48180f0.setDuration(((float) j3) * 1.5f);
        this.f48180f0.setInterpolator(krVar);
        this.f48180f0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Components.xi0 xi0Var;
        if (z10 && (xi0Var = this.Q) != null && xi0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f5303q) {
            this.Q.e();
        } else if (this.f48173b0) {
        } else {
            this.f48173b0 = true;
            this.X = false;
            hi.q1 q1Var = this.f48177e;
            q1Var.g();
            if (q1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.r1 r1Var2 = this.L;
                if (r1Var2 != null) {
                    r1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (r1Var = this.L) != null) {
                r1Var.setVisibility(0);
                org.telegram.ui.Cells.r1 r1Var3 = this.L;
                r1Var3.f31438c6 = -1;
                r1Var3.invalidate();
            }
            this.f48175c0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.qp0(15, this, z11));
            this.f48172b.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.X) {
            d81 d81Var = this.f48172b;
            if (d81Var.getWidth() > 0) {
                org.telegram.ui.Cells.r1 r1Var = this.L;
                if (r1Var != null) {
                    int[] iArr = new int[2];
                    r1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f48181n;
                    this.V = i10 - bVar.f15978a;
                    float f10 = iArr[1] - bVar.f15979b;
                    this.W = f10;
                    if (!this.f48171a0) {
                        this.f48171a0 = true;
                        this.Y = f10;
                        if (this.T != null) {
                            float height = f10 + this.L.getHeight() + this.T.getHeight();
                            int height2 = d81Var.getHeight();
                            i0.b bVar2 = this.f48181n;
                            if (height > ((height2 - bVar2.f15979b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = d81Var.getHeight();
                                i0.b bVar3 = this.f48181n;
                                this.Y = ((((height3 - bVar3.f15979b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int c22 = this.J.c2(this.P);
                        this.J.V1(c22);
                        float U1 = this.J.U1(c22);
                        float f11 = this.W;
                        this.Z = f11;
                        float f12 = (int) U1;
                        int height4 = d81Var.getHeight();
                        i0.b bVar4 = this.f48181n;
                        int L = ((height4 - bVar4.f15979b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.f48179f;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = d81Var.getHeight();
                            i0.b bVar5 = this.f48181n;
                            this.Z = ((((height5 - bVar5.f15979b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.R != null) {
                            float height6 = this.Z + f12 + viewGroup.getHeight();
                            int height7 = d81Var.getHeight();
                            i0.b bVar6 = this.f48181n;
                            if (height6 > (((height7 - bVar6.f15979b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = d81Var.getHeight();
                                i0.b bVar7 = this.f48181n;
                                this.Z = (((((height8 - bVar7.f15979b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.R.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.W = 0.0f;
                    this.V = 0.0f;
                }
                this.X = true;
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
        hi.q1 q1Var = this.f48177e;
        float positionAnimated = q1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -q1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, q1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.W;
                this.Y = f14;
                float height = f14 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                d81 d81Var = this.f48172b;
                int height2 = d81Var.getHeight();
                i0.b bVar = this.f48181n;
                if (height > ((height2 - bVar.f15979b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = d81Var.getHeight();
                    i0.b bVar2 = this.f48181n;
                    this.Y = ((((height3 - bVar2.f15979b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        yr0 yr0Var = this.K;
        float f15 = this.V;
        if (this.f48175c0) {
            f10 = 1.0f;
        } else {
            f10 = this.f48186y;
        }
        yr0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        yr0 yr0Var2 = this.K;
        float f16 = this.W;
        float f17 = this.Y;
        if (this.f48175c0) {
            f11 = 1.0f;
        } else {
            f11 = this.f48186y;
        }
        yr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.T;
        d81 d81Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.T.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.K.b3()) {
                    i7 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i7 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i7) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = d81Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - d81Var2.getTop());
            this.T.setAlpha(this.f48186y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f48186y);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        e81 e81Var = this.J;
        float f19 = this.V;
        if (this.f48175c0) {
            f12 = 1.0f;
        } else {
            f12 = this.f48186y;
        }
        e81Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        e81 e81Var2 = this.J;
        float f20 = this.W;
        float f21 = this.Z;
        if (this.f48175c0) {
            f13 = 1.0f;
        } else {
            f13 = this.f48186y;
        }
        e81Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.R != null) {
            int c22 = this.J.c2(this.P);
            this.J.V1(c22);
            float U1 = this.J.U1(c22);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f22 = W1 + 0.0f;
                if (this.J.b3()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = d81Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) U1)) - this.R.getTop()) - d81Var2.getTop());
            this.R.setAlpha(this.f48186y);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f48186y);
            this.R.setScaleX(T12);
            this.R.setScaleY(T12);
        }
        if (this.f48175c0) {
            this.K.setAlpha(this.f48186y);
            this.J.setAlpha(this.f48186y);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - d81Var2.getTop()));
            this.Q.setAlpha(this.f48186y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f48186y);
            }
        }
        TextView textView = this.f48179f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.f48186y);
        org.telegram.ui.Components.ra0 ra0Var = this.h;
        ra0Var.setSelectedTab(positionAnimated);
        ra0Var.setAlpha(this.f48186y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        d81 d81Var = this.f48172b;
        setContentView(d81Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        d81Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(d81Var, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.yk0.d(new a5(this, 29));
        this.O = true;
        b(true, null);
    }
}
