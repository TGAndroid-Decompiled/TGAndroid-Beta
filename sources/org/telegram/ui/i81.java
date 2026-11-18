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
public final class i81 extends Dialog {
    public float E;
    public final ui.b F;
    public final dh.c G;
    public org.telegram.messenger.fj H;
    public boolean I;
    public g81 J;
    public zr0 K;
    public org.telegram.ui.Cells.r1 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public org.telegram.ui.Components.vi0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final org.telegram.ui.ActionBar.i6 f48634a;
    public boolean f48635a0;
    public final f81 f48636b;
    public boolean f48637b0;
    public final f81 f48638c;
    public boolean f48639c0;
    public final f81 d;
    public ul f48640d0;
    public final hi.i1 f48641e;
    public ValueAnimator f48642e0;
    public final TextView f48643f;
    public ValueAnimator f48644f0;
    public final org.telegram.ui.Components.sa0 h;
    public i0.b f48645n;
    public Bitmap f48646r;
    public BitmapShader f48647s;
    public Paint f48648w;
    public Matrix f48649x;
    public float f48650y;

    public i81(Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, 2131755352);
        this.f48645n = i0.b.f15888e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f48637b0 = false;
        this.f48634a = i6Var;
        f81 f81Var = new f81(this, activity, 0);
        this.f48636b = f81Var;
        f81Var.setOnClickListener(new oy0(this, 8));
        ui.b bVar = new ui.b();
        this.F = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(f81Var);
        cVar.f8377i = f81Var;
        f81 f81Var2 = new f81(this, activity, 1);
        this.f48638c = f81Var2;
        f81Var2.setClipToPadding(false);
        f81Var.addView(f81Var2, c8.ma.e(-1, -1, 119));
        hi.i1 i1Var = new hi.i1(7, activity, this);
        this.f48641e = i1Var;
        i1Var.setAdapter(new di.i4(6, activity, this));
        f81Var2.addView(i1Var, c8.ma.e(-1, -1, 119));
        f81 f81Var3 = new f81(this, activity, 2);
        this.d = f81Var3;
        f81Var2.addView(f81Var3, c8.ma.e(-1, -1, 119));
        org.telegram.ui.Components.sa0 sa0Var = new org.telegram.ui.Components.sa0(activity, i6Var);
        this.h = sa0Var;
        sa0Var.a(0, org.telegram.messenger.gd.M0(2131743834, null));
        sa0Var.a(1, org.telegram.messenger.gd.M0(2131743835, null));
        f81Var2.addView(sa0Var, c8.ma.e(-1, 66, 80));
        sa0Var.setOnTabClick(new r3(i1Var, 26));
        fh.g c10 = cVar.c(sa0Var, null, false);
        c10.p(c8.i0.l(i6Var));
        c10.R.f11639e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        sa0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f48643f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(sa0Var.getColor());
        textView.setText(org.telegram.messenger.gd.M0(2131743836, null));
        textView.setGravity(17);
        f81Var2.addView(textView, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        xr0 xr0Var = new xr0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(f81Var, xr0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.pp0 pp0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f48642e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f48644f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f48650y;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f48642e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final i81 f46843b;

            {
                this.f46843b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        i81 i81Var = this.f46843b;
                        i81Var.f48650y = floatValue;
                        i81Var.f48636b.invalidate();
                        i81Var.f48638c.invalidate();
                        i81Var.e();
                        return;
                    default:
                        i81 i81Var2 = this.f46843b;
                        i81Var2.getClass();
                        i81Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f48642e0.addListener(new androidx.fragment.app.g(this, z10, pp0Var, 14));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f48642e0;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        valueAnimator3.setInterpolator(lrVar);
        this.f48642e0.setDuration(j3);
        this.f48642e0.start();
        float f13 = this.E;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f48644f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final i81 f46843b;

            {
                this.f46843b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        i81 i81Var = this.f46843b;
                        i81Var.f48650y = floatValue;
                        i81Var.f48636b.invalidate();
                        i81Var.f48638c.invalidate();
                        i81Var.e();
                        return;
                    default:
                        i81 i81Var2 = this.f46843b;
                        i81Var2.getClass();
                        i81Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f48644f0.addListener(new c30(11, this, z10));
        this.f48644f0.setDuration(((float) j3) * 1.5f);
        this.f48644f0.setInterpolator(lrVar);
        this.f48644f0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Components.vi0 vi0Var;
        if (z10 && (vi0Var = this.Q) != null && vi0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f5308q) {
            this.Q.e();
        } else if (this.f48637b0) {
        } else {
            this.f48637b0 = true;
            this.X = false;
            hi.i1 i1Var = this.f48641e;
            i1Var.g();
            if (i1Var.getCurrentPosition() == 1) {
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
                r1Var3.f31357c6 = -1;
                r1Var3.invalidate();
            }
            this.f48639c0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.pp0(15, this, z11));
            this.f48636b.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.X) {
            f81 f81Var = this.f48636b;
            if (f81Var.getWidth() > 0) {
                org.telegram.ui.Cells.r1 r1Var = this.L;
                if (r1Var != null) {
                    int[] iArr = new int[2];
                    r1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f48645n;
                    this.V = i10 - bVar.f15889a;
                    float f10 = iArr[1] - bVar.f15890b;
                    this.W = f10;
                    if (!this.f48635a0) {
                        this.f48635a0 = true;
                        this.Y = f10;
                        if (this.T != null) {
                            float height = f10 + this.L.getHeight() + this.T.getHeight();
                            int height2 = f81Var.getHeight();
                            i0.b bVar2 = this.f48645n;
                            if (height > ((height2 - bVar2.f15890b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = f81Var.getHeight();
                                i0.b bVar3 = this.f48645n;
                                this.Y = ((((height3 - bVar3.f15890b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int c22 = this.J.c2(this.P);
                        this.J.V1(c22);
                        float U1 = this.J.U1(c22);
                        float f11 = this.W;
                        this.Z = f11;
                        float f12 = (int) U1;
                        int height4 = f81Var.getHeight();
                        i0.b bVar4 = this.f48645n;
                        int L = ((height4 - bVar4.f15890b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.f48643f;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = f81Var.getHeight();
                            i0.b bVar5 = this.f48645n;
                            this.Z = ((((height5 - bVar5.f15890b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.R != null) {
                            float height6 = this.Z + f12 + viewGroup.getHeight();
                            int height7 = f81Var.getHeight();
                            i0.b bVar6 = this.f48645n;
                            if (height6 > (((height7 - bVar6.f15890b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = f81Var.getHeight();
                                i0.b bVar7 = this.f48645n;
                                this.Z = (((((height8 - bVar7.f15890b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.R.getHeight();
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
        hi.i1 i1Var = this.f48641e;
        float positionAnimated = i1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -i1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, i1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.W;
                this.Y = f14;
                float height = f14 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                f81 f81Var = this.f48636b;
                int height2 = f81Var.getHeight();
                i0.b bVar = this.f48645n;
                if (height > ((height2 - bVar.f15890b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = f81Var.getHeight();
                    i0.b bVar2 = this.f48645n;
                    this.Y = ((((height3 - bVar2.f15890b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        zr0 zr0Var = this.K;
        float f15 = this.V;
        if (this.f48639c0) {
            f10 = 1.0f;
        } else {
            f10 = this.f48650y;
        }
        zr0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        zr0 zr0Var2 = this.K;
        float f16 = this.W;
        float f17 = this.Y;
        if (this.f48639c0) {
            f11 = 1.0f;
        } else {
            f11 = this.f48650y;
        }
        zr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.T;
        f81 f81Var2 = this.d;
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
            this.U = f81Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - f81Var2.getTop());
            this.T.setAlpha(this.f48650y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f48650y);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        g81 g81Var = this.J;
        float f19 = this.V;
        if (this.f48639c0) {
            f12 = 1.0f;
        } else {
            f12 = this.f48650y;
        }
        g81Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        g81 g81Var2 = this.J;
        float f20 = this.W;
        float f21 = this.Z;
        if (this.f48639c0) {
            f13 = 1.0f;
        } else {
            f13 = this.f48650y;
        }
        g81Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
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
            this.S = f81Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) U1)) - this.R.getTop()) - f81Var2.getTop());
            this.R.setAlpha(this.f48650y);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f48650y);
            this.R.setScaleX(T12);
            this.R.setScaleY(T12);
        }
        if (this.f48639c0) {
            this.K.setAlpha(this.f48650y);
            this.J.setAlpha(this.f48650y);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - f81Var2.getTop()));
            this.Q.setAlpha(this.f48650y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f48650y);
            }
        }
        TextView textView = this.f48643f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.f48650y);
        org.telegram.ui.Components.sa0 sa0Var = this.h;
        sa0Var.setSelectedTab(positionAnimated);
        sa0Var.setAlpha(this.f48650y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        f81 f81Var = this.f48636b;
        setContentView(f81Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        f81Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(f81Var, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.wk0.d(new a5(this, 29));
        this.O = true;
        b(true, null);
    }
}
