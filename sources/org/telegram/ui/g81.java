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
    public float D;
    public final ri.b E;
    public final dh.c F;
    public org.telegram.messenger.ij G;
    public boolean H;
    public e81 I;
    public yr0 J;
    public org.telegram.ui.Cells.q1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.ii0 P;
    public ViewGroup Q;
    public float R;
    public ViewGroup S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final org.telegram.ui.ActionBar.f6 f45900a;
    public boolean f45901a0;
    public final d81 f45902b;
    public boolean f45903b0;
    public final d81 f45904c;
    public tl f45905c0;
    public final d81 d;
    public ValueAnimator f45906d0;
    public final fi.g1 f45907e;
    public ValueAnimator f45908e0;
    public final TextView f45909f;
    public final org.telegram.ui.Components.ga0 h;
    public i0.b f45910n;
    public Bitmap f45911r;
    public BitmapShader f45912s;
    public Paint f45913w;
    public Matrix f45914x;
    public float f45915y;

    public g81(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, 2131755352);
        this.f45910n = i0.b.f15119e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f45901a0 = false;
        this.f45900a = f6Var;
        d81 d81Var = new d81(this, activity, 0);
        this.f45902b = d81Var;
        d81Var.setOnClickListener(new my0(this, 8));
        ri.b bVar = new ri.b();
        this.E = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.F = cVar;
        cVar.h = new jh.k(d81Var);
        cVar.f8708i = d81Var;
        d81 d81Var2 = new d81(this, activity, 1);
        this.f45904c = d81Var2;
        d81Var2.setClipToPadding(false);
        d81Var.addView(d81Var2, c8.ha.e(-1, -1, 119));
        fi.g1 g1Var = new fi.g1(7, activity, this);
        this.f45907e = g1Var;
        g1Var.setAdapter(new bi.g5(6, activity, this));
        d81Var2.addView(g1Var, c8.ha.e(-1, -1, 119));
        d81 d81Var3 = new d81(this, activity, 2);
        this.d = d81Var3;
        d81Var2.addView(d81Var3, c8.ha.e(-1, -1, 119));
        org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(activity, f6Var);
        this.h = ga0Var;
        ga0Var.a(0, org.telegram.messenger.id.M0(2131744072, null));
        ga0Var.a(1, org.telegram.messenger.id.M0(2131744073, null));
        d81Var2.addView(ga0Var, c8.ha.e(-1, 66, 80));
        ga0Var.setOnTabClick(new r3(g1Var, 25));
        fh.g c10 = cVar.c(ga0Var, null, false);
        c10.p(c8.g0.k(f6Var));
        c10.Q.f11508e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ga0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f45909f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ga0Var.getColor());
        textView.setText(org.telegram.messenger.id.M0(2131744074, null));
        textView.setGravity(17);
        d81Var2.addView(textView, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        wr0 wr0Var = new wr0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f54191a;
        r0.a0.i(d81Var, wr0Var);
    }

    public final void b(boolean z9, org.telegram.ui.Components.tp0 tp0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f45906d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f45908e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f45915y;
        float f12 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f45906d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g81 f44229b;

            {
                this.f44229b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        g81 g81Var = this.f44229b;
                        g81Var.f45915y = floatValue;
                        g81Var.f45902b.invalidate();
                        g81Var.f45904c.invalidate();
                        g81Var.e();
                        return;
                    default:
                        g81 g81Var2 = this.f44229b;
                        g81Var2.getClass();
                        g81Var2.D = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f45906d0.addListener(new ai.g0(this, z9, tp0Var, 14));
        if (!z9) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f45906d0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f45906d0.setDuration(j3);
        this.f45906d0.start();
        float f13 = this.D;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f45908e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final g81 f44229b;

            {
                this.f44229b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        g81 g81Var = this.f44229b;
                        g81Var.f45915y = floatValue;
                        g81Var.f45902b.invalidate();
                        g81Var.f45904c.invalidate();
                        g81Var.e();
                        return;
                    default:
                        g81 g81Var2 = this.f44229b;
                        g81Var2.getClass();
                        g81Var2.D = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f45908e0.addListener(new z40(10, this, z9));
        this.f45908e0.setDuration(((float) j3) * 1.5f);
        this.f45908e0.setInterpolator(xqVar);
        this.f45908e0.start();
    }

    public final void c(boolean z9) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.ii0 ii0Var;
        if (z9 && (ii0Var = this.P) != null && ii0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f6197q) {
            this.P.e();
        } else if (this.f45901a0) {
        } else {
            this.f45901a0 = true;
            this.W = false;
            fi.g1 g1Var = this.f45907e;
            g1Var.l();
            if (g1Var.getCurrentPosition() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 && z10) {
                org.telegram.ui.Cells.q1 q1Var2 = this.K;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(4);
                    this.K.invalidate();
                }
            } else if (!z9 && (q1Var = this.K) != null) {
                q1Var.setVisibility(0);
                org.telegram.ui.Cells.q1 q1Var3 = this.K;
                q1Var3.f29789b6 = -1;
                q1Var3.invalidate();
            }
            this.f45903b0 = !z9;
            d();
            b(false, new org.telegram.ui.Components.tp0(14, this, z10));
            this.f45902b.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.W) {
            d81 d81Var = this.f45902b;
            if (d81Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.K;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f45910n;
                    this.U = i10 - bVar.f15120a;
                    float f10 = iArr[1] - bVar.f15121b;
                    this.V = f10;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f10;
                        if (this.S != null) {
                            float height = f10 + this.K.getHeight() + this.S.getHeight();
                            int height2 = d81Var.getHeight();
                            i0.b bVar2 = this.f45910n;
                            if (height > ((height2 - bVar2.f15121b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = d81Var.getHeight();
                                i0.b bVar3 = this.f45910n;
                                this.X = ((((height3 - bVar3.f15121b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int b22 = this.I.b2(this.O);
                        this.I.U1(b22);
                        float T1 = this.I.T1(b22);
                        float f11 = this.V;
                        this.Y = f11;
                        float f12 = (int) T1;
                        int height4 = d81Var.getHeight();
                        i0.b bVar4 = this.f45910n;
                        int L = ((height4 - bVar4.f15121b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.f45909f;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = d81Var.getHeight();
                            i0.b bVar5 = this.f45910n;
                            this.Y = ((((height5 - bVar5.f15121b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f12 + viewGroup.getHeight();
                            int height7 = d81Var.getHeight();
                            i0.b bVar6 = this.f45910n;
                            if (height6 > (((height7 - bVar6.f15121b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = d81Var.getHeight();
                                i0.b bVar7 = this.f45910n;
                                this.Y = (((((height8 - bVar7.f15121b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.Q.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.V = 0.0f;
                    this.U = 0.0f;
                }
                this.W = true;
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
        fi.g1 g1Var = this.f45907e;
        float positionAnimated = g1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.V;
                this.X = f14;
                float height = f14 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                d81 d81Var = this.f45902b;
                int height2 = d81Var.getHeight();
                i0.b bVar = this.f45910n;
                if (height > ((height2 - bVar.f15121b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = d81Var.getHeight();
                    i0.b bVar2 = this.f45910n;
                    this.X = ((((height3 - bVar2.f15121b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        yr0 yr0Var = this.J;
        float f15 = this.U;
        if (this.f45903b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f45915y;
        }
        yr0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        yr0 yr0Var2 = this.J;
        float f16 = this.V;
        float f17 = this.X;
        if (this.f45903b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f45915y;
        }
        yr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.S;
        d81 d81Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((W12 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.S.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.J.Y2()) {
                    i7 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i7 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i7) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = d81Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - d81Var2.getTop());
            this.S.setAlpha(this.f45915y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f45915y);
            this.S.setScaleX(T1);
            this.S.setScaleY(T1);
        }
        e81 e81Var = this.I;
        float f19 = this.U;
        if (this.f45903b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f45915y;
        }
        e81Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        e81 e81Var2 = this.I;
        float f20 = this.V;
        float f21 = this.Y;
        if (this.f45903b0) {
            f13 = 1.0f;
        } else {
            f13 = this.f45915y;
        }
        e81Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.Q != null) {
            int b22 = this.I.b2(this.O);
            this.I.U1(b22);
            float T12 = this.I.T1(b22);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((W1 + 0.0f) + this.I.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.Q.getLeft());
            } else {
                ViewGroup viewGroup3 = this.Q;
                float f22 = W1 + 0.0f;
                if (this.I.Y2()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = d81Var2.getMeasuredWidth() - (this.Q.getX() - W12);
            this.Q.setTranslationY(((this.I.getY() + ((int) T12)) - this.Q.getTop()) - d81Var2.getTop());
            this.Q.setAlpha(this.f45915y);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f45915y);
            this.Q.setScaleX(T13);
            this.Q.setScaleY(T13);
        }
        if (this.f45903b0) {
            this.J.setAlpha(this.f45915y);
            this.I.setAlpha(this.f45915y);
        }
        if (this.P != null) {
            float max = W12 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - d81Var2.getTop()));
            this.P.setAlpha(this.f45915y);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f45915y);
            }
        }
        TextView textView = this.f45909f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.f45915y);
        org.telegram.ui.Components.ga0 ga0Var = this.h;
        ga0Var.setSelectedTab(positionAnimated);
        ga0Var.setAlpha(this.f45915y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        d81 d81Var = this.f45902b;
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
        org.telegram.messenger.g0.o3(d81Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.jk0.d(new a5(this, 29));
        this.N = true;
        b(true, null);
    }
}
