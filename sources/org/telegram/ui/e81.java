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
public final class e81 extends Dialog {
    public float E;
    public final ui.b F;
    public final dh.c G;
    public org.telegram.messenger.gj H;
    public boolean I;
    public c81 J;
    public wr0 K;
    public org.telegram.ui.Cells.q1 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public org.telegram.ui.Components.mi0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final org.telegram.ui.ActionBar.e6 f46620a;
    public boolean f46621a0;
    public final b81 f46622b;
    public boolean f46623b0;
    public final b81 f46624c;
    public boolean f46625c0;
    public final b81 d;
    public tl f46626d0;
    public final hi.i1 f46627e;
    public ValueAnimator f46628e0;
    public final TextView f46629f;
    public ValueAnimator f46630f0;
    public final org.telegram.ui.Components.ia0 h;
    public i0.c f46631n;
    public Bitmap f46632r;
    public BitmapShader f46633s;
    public Paint f46634w;
    public Matrix f46635x;
    public float f46636y;

    public e81(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, 2131755352);
        this.f46631n = i0.c.f15573e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f46623b0 = false;
        this.f46620a = e6Var;
        b81 b81Var = new b81(this, activity, 0);
        this.f46622b = b81Var;
        b81Var.setOnClickListener(new ky0(this, 8));
        ui.b bVar = new ui.b();
        this.F = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(b81Var);
        cVar.f8098i = b81Var;
        b81 b81Var2 = new b81(this, activity, 1);
        this.f46624c = b81Var2;
        b81Var2.setClipToPadding(false);
        b81Var.addView(b81Var2, c8.ja.e(-1, -1, 119));
        hi.i1 i1Var = new hi.i1(7, activity, this);
        this.f46627e = i1Var;
        i1Var.setAdapter(new di.f4(6, activity, this));
        b81Var2.addView(i1Var, c8.ja.e(-1, -1, 119));
        b81 b81Var3 = new b81(this, activity, 2);
        this.d = b81Var3;
        b81Var2.addView(b81Var3, c8.ja.e(-1, -1, 119));
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(activity, e6Var);
        this.h = ia0Var;
        ia0Var.a(0, org.telegram.messenger.hd.M0(2131744069, null));
        ia0Var.a(1, org.telegram.messenger.hd.M0(2131744070, null));
        b81Var2.addView(ia0Var, c8.ja.e(-1, 66, 80));
        ia0Var.setOnTabClick(new r3(i1Var, 25));
        fh.g c10 = cVar.c(ia0Var, null, false);
        c10.p(c8.g0.k(e6Var));
        c10.R.f11322e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ia0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f46629f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ia0Var.getColor());
        textView.setText(org.telegram.messenger.hd.M0(2131744071, null));
        textView.setGravity(17);
        b81Var2.addView(textView, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ur0 ur0Var = new ur0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(b81Var, ur0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.fp0 fp0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f46628e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f46630f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f46636y;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f46628e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e81 f53870b;

            {
                this.f53870b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        e81 e81Var = this.f53870b;
                        e81Var.f46636y = floatValue;
                        e81Var.f46622b.invalidate();
                        e81Var.f46624c.invalidate();
                        e81Var.e();
                        return;
                    default:
                        e81 e81Var2 = this.f53870b;
                        e81Var2.getClass();
                        e81Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f46628e0.addListener(new androidx.fragment.app.g(this, z10, fp0Var, 14));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f46628e0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.f46628e0.setDuration(j3);
        this.f46628e0.start();
        float f13 = this.E;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f46630f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final e81 f53870b;

            {
                this.f53870b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        e81 e81Var = this.f53870b;
                        e81Var.f46636y = floatValue;
                        e81Var.f46622b.invalidate();
                        e81Var.f46624c.invalidate();
                        e81Var.e();
                        return;
                    default:
                        e81 e81Var2 = this.f53870b;
                        e81Var2.getClass();
                        e81Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f46630f0.addListener(new z20(11, this, z10));
        this.f46630f0.setDuration(((float) j3) * 1.5f);
        this.f46630f0.setInterpolator(erVar);
        this.f46630f0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.mi0 mi0Var;
        if (z10 && (mi0Var = this.Q) != null && mi0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f5025q) {
            this.Q.e();
        } else if (this.f46623b0) {
        } else {
            this.f46623b0 = true;
            this.X = false;
            hi.i1 i1Var = this.f46627e;
            i1Var.g();
            if (i1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.q1 q1Var2 = this.L;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (q1Var = this.L) != null) {
                q1Var.setVisibility(0);
                org.telegram.ui.Cells.q1 q1Var3 = this.L;
                q1Var3.f30935c6 = -1;
                q1Var3.invalidate();
            }
            this.f46625c0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.fp0(15, this, z11));
            this.f46622b.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.X) {
            b81 b81Var = this.f46622b;
            if (b81Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.L;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.c cVar = this.f46631n;
                    this.V = i10 - cVar.f15574a;
                    float f10 = iArr[1] - cVar.f15575b;
                    this.W = f10;
                    if (!this.f46621a0) {
                        this.f46621a0 = true;
                        this.Y = f10;
                        if (this.T != null) {
                            float height = f10 + this.L.getHeight() + this.T.getHeight();
                            int height2 = b81Var.getHeight();
                            i0.c cVar2 = this.f46631n;
                            if (height > ((height2 - cVar2.f15575b) - cVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = b81Var.getHeight();
                                i0.c cVar3 = this.f46631n;
                                this.Y = ((((height3 - cVar3.f15575b) - cVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int c22 = this.J.c2(this.P);
                        this.J.V1(c22);
                        float U1 = this.J.U1(c22);
                        float f11 = this.W;
                        this.Z = f11;
                        float f12 = (int) U1;
                        int height4 = b81Var.getHeight();
                        i0.c cVar4 = this.f46631n;
                        int L = ((height4 - cVar4.f15575b) - cVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.f46629f;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = b81Var.getHeight();
                            i0.c cVar5 = this.f46631n;
                            this.Z = ((((height5 - cVar5.f15575b) - cVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.R != null) {
                            float height6 = this.Z + f12 + viewGroup.getHeight();
                            int height7 = b81Var.getHeight();
                            i0.c cVar6 = this.f46631n;
                            if (height6 > (((height7 - cVar6.f15575b) - cVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = b81Var.getHeight();
                                i0.c cVar7 = this.f46631n;
                                this.Z = (((((height8 - cVar7.f15575b) - cVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.R.getHeight();
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
        hi.i1 i1Var = this.f46627e;
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
                b81 b81Var = this.f46622b;
                int height2 = b81Var.getHeight();
                i0.c cVar = this.f46631n;
                if (height > ((height2 - cVar.f15575b) - cVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = b81Var.getHeight();
                    i0.c cVar2 = this.f46631n;
                    this.Y = ((((height3 - cVar2.f15575b) - cVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        wr0 wr0Var = this.K;
        float f15 = this.V;
        if (this.f46625c0) {
            f10 = 1.0f;
        } else {
            f10 = this.f46636y;
        }
        wr0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        wr0 wr0Var2 = this.K;
        float f16 = this.W;
        float f17 = this.Y;
        if (this.f46625c0) {
            f11 = 1.0f;
        } else {
            f11 = this.f46636y;
        }
        wr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.T;
        b81 b81Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.T.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.K.Z2()) {
                    i7 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i7 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i7) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = b81Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - b81Var2.getTop());
            this.T.setAlpha(this.f46636y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f46636y);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        c81 c81Var = this.J;
        float f19 = this.V;
        if (this.f46625c0) {
            f12 = 1.0f;
        } else {
            f12 = this.f46636y;
        }
        c81Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        c81 c81Var2 = this.J;
        float f20 = this.W;
        float f21 = this.Z;
        if (this.f46625c0) {
            f13 = 1.0f;
        } else {
            f13 = this.f46636y;
        }
        c81Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.R != null) {
            int c22 = this.J.c2(this.P);
            this.J.V1(c22);
            float U1 = this.J.U1(c22);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f22 = W1 + 0.0f;
                if (this.J.Z2()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = b81Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) U1)) - this.R.getTop()) - b81Var2.getTop());
            this.R.setAlpha(this.f46636y);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f46636y);
            this.R.setScaleX(T12);
            this.R.setScaleY(T12);
        }
        if (this.f46625c0) {
            this.K.setAlpha(this.f46636y);
            this.J.setAlpha(this.f46636y);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - b81Var2.getTop()));
            this.Q.setAlpha(this.f46636y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f46636y);
            }
        }
        TextView textView = this.f46629f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.f46636y);
        org.telegram.ui.Components.ia0 ia0Var = this.h;
        ia0Var.setSelectedTab(positionAnimated);
        ia0Var.setAlpha(this.f46636y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        b81 b81Var = this.f46622b;
        setContentView(b81Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        b81Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(b81Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.ok0.d(new a5(this, 29));
        this.O = true;
        b(true, null);
    }
}
