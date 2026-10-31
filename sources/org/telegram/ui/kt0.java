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
public final class kt0 extends Dialog {
    public float D;
    public float E;
    public final hi.b F;
    public final tg.b G;
    public org.telegram.messenger.jj H;
    public boolean I;
    public it0 J;
    public jt0 K;
    public org.telegram.ui.Cells.q1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.mj0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f38934a;
    public float f38935a0;
    public final org.telegram.ui.ActionBar.p6 f38936b;
    public boolean f38937b0;
    public final ht0 f38938c;
    public boolean f38939c0;
    public final ht0 d;
    public boolean f38940d0;
    public final ht0 e;
    public pm f38941e0;
    public final hk f38942f;
    public ValueAnimator f38943f0;
    public ValueAnimator f38944g0;
    public final TextView h;
    public final org.telegram.ui.Components.ya0 f38945n;
    public i0.c f38946r;
    public Bitmap f38947s;
    public BitmapShader f38948w;
    public Paint f38949x;
    public Matrix f38950y;

    public kt0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, 2131755352);
        this.f38946r = i0.c.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f38939c0 = false;
        this.f38934a = activity;
        this.f38936b = p6Var;
        ht0 ht0Var = new ht0(this, activity, 0);
        this.f38938c = ht0Var;
        ht0Var.setOnClickListener(new f50(this, 23));
        hi.b bVar = new hi.b();
        this.F = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.G = bVar2;
        bVar2.f48700f = new zg.h(ht0Var);
        bVar2.f48701g = ht0Var;
        ht0 ht0Var2 = new ht0(this, activity, 1);
        this.d = ht0Var2;
        ht0Var2.setClipToPadding(false);
        ht0Var.addView(ht0Var2, w7.b6.e(-1, -1, 119));
        hk hkVar = new hk(this, activity, 2);
        this.f38942f = hkVar;
        hkVar.setAdapter(new mg.s(this, activity, 3));
        ht0Var2.addView(hkVar, w7.b6.e(-1, -1, 119));
        ht0 ht0Var3 = new ht0(this, activity, 2);
        this.e = ht0Var3;
        ht0Var2.addView(ht0Var3, w7.b6.e(-1, -1, 119));
        org.telegram.ui.Components.ya0 ya0Var = new org.telegram.ui.Components.ya0(activity, p6Var);
        this.f38945n = ya0Var;
        ya0Var.a(0, org.telegram.messenger.cd.L0(2131747183, null));
        ya0Var.a(1, org.telegram.messenger.cd.L0(2131747182, null));
        ht0Var2.addView(ya0Var, w7.b6.e(-1, 66, 80));
        ya0Var.setOnTabClick(new s3(hkVar, 18));
        vg.f c10 = bVar2.c(ya0Var, null, false);
        c10.o(w7.b9.k(p6Var));
        c10.M.e = true;
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(16.0f));
        ya0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ya0Var.getColor());
        textView.setText(org.telegram.messenger.cd.L0(2131747184, null));
        textView.setGravity(17);
        ht0Var2.addView(textView, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        e eVar = new e(this, 29);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(ht0Var, eVar);
    }

    public final void b(boolean z10, bt0 bt0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f38943f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f38944g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.D;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38943f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final kt0 f36548b;

            {
                this.f36548b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        kt0 kt0Var = this.f36548b;
                        kt0Var.D = floatValue;
                        kt0Var.f38938c.invalidate();
                        kt0Var.d.invalidate();
                        it0 it0Var = kt0Var.J;
                        if (it0Var != null) {
                            it0Var.invalidate();
                        }
                        kt0Var.e();
                        return;
                    default:
                        kt0 kt0Var2 = this.f36548b;
                        kt0Var2.getClass();
                        kt0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f38943f0.addListener(new androidx.fragment.app.g(this, z10, bt0Var, 9));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f38943f0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.f38943f0.setDuration(j10);
        this.f38943f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f38944g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final kt0 f36548b;

            {
                this.f36548b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        kt0 kt0Var = this.f36548b;
                        kt0Var.D = floatValue;
                        kt0Var.f38938c.invalidate();
                        kt0Var.d.invalidate();
                        it0 it0Var = kt0Var.J;
                        if (it0Var != null) {
                            it0Var.invalidate();
                        }
                        kt0Var.e();
                        return;
                    default:
                        kt0 kt0Var2 = this.f36548b;
                        kt0Var2.getClass();
                        kt0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f38944g0.addListener(new org.telegram.ui.Components.ha0(20, this, z10));
        this.f38944g0.setDuration(((float) j10) * 1.5f);
        this.f38944g0.setInterpolator(grVar);
        this.f38944g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.mj0 mj0Var;
        if (z10 && (mj0Var = this.Q) != null && mj0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f48288q) {
            this.Q.e();
        } else if (this.f38939c0) {
        } else {
            this.f38939c0 = true;
            this.Y = false;
            hk hkVar = this.f38942f;
            hkVar.l();
            if (hkVar.getCurrentPosition() == 1) {
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
                q1Var3.f22504b6 = null;
                q1Var3.invalidate();
            }
            this.f38940d0 = !z10;
            d();
            b(false, new bt0(this, z11));
            this.f38938c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            ht0 ht0Var = this.f38938c;
            if (ht0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.L;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.c cVar = this.f38946r;
                    this.W = i11 - cVar.f7765a;
                    float f7 = iArr[1] - cVar.f7766b;
                    this.X = f7;
                    if (!this.f38937b0) {
                        this.f38937b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = ht0Var.getHeight();
                            i0.c cVar2 = this.f38946r;
                            if (height > ((height2 - cVar2.f7766b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) {
                                int height3 = ht0Var.getHeight();
                                i0.c cVar3 = this.f38946r;
                                this.Z = ((((height3 - cVar3.f7766b) - cVar3.d) - org.telegram.messenger.i0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int T1 = this.J.T1(this.P);
                        this.J.S1(T1);
                        float R1 = this.J.R1(T1);
                        float f10 = this.X;
                        this.f38935a0 = f10;
                        float f11 = (int) R1;
                        int height4 = ht0Var.getHeight();
                        i0.c cVar4 = this.f38946r;
                        int L = ((height4 - cVar4.f7766b) - cVar4.d) - org.telegram.messenger.i0.L(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > L - textView.getHeight()) {
                            int height5 = ht0Var.getHeight();
                            i0.c cVar5 = this.f38946r;
                            this.f38935a0 = ((((height5 - cVar5.f7766b) - cVar5.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f38935a0 + f11 + viewGroup.getHeight();
                            int height7 = ht0Var.getHeight();
                            i0.c cVar6 = this.f38946r;
                            if (height6 > (((height7 - cVar6.f7766b) - cVar6.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) {
                                int height8 = ht0Var.getHeight();
                                i0.c cVar7 = this.f38946r;
                                this.f38935a0 = (((((height8 - cVar7.f7766b) - cVar7.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        hk hkVar = this.f38942f;
        float positionAnimated = hkVar.getPositionAnimated();
        int i11 = 0;
        float W1 = org.telegram.messenger.i0.W1(positionAnimated, 0, -hkVar.getWidth());
        float W12 = org.telegram.messenger.i0.W1(positionAnimated, hkVar.getWidth(), 0);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.X;
                this.Z = f13;
                float height = f13 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ht0 ht0Var = this.f38938c;
                int height2 = ht0Var.getHeight();
                i0.c cVar = this.f38946r;
                if (height > ((height2 - cVar.f7766b) - cVar.d) - org.telegram.messenger.i0.L(66.0f)) {
                    int height3 = ht0Var.getHeight();
                    i0.c cVar2 = this.f38946r;
                    this.Z = ((((height3 - cVar2.f7766b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        jt0 jt0Var = this.K;
        float f14 = this.W;
        if (this.f38940d0) {
            f7 = 1.0f;
        } else {
            f7 = this.D;
        }
        jt0Var.setTranslationX(org.telegram.messenger.i0.T1(f14, 0.0f, f7) + W12);
        jt0 jt0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f38940d0) {
            f10 = 1.0f;
        } else {
            f10 = this.D;
        }
        jt0Var2.setTranslationY(org.telegram.messenger.i0.T1(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        ht0 ht0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.T.getLeft());
            } else {
                float f17 = W12 + 0.0f;
                if (this.K.V2()) {
                    i10 = org.telegram.messenger.i0.L(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = ht0Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - ht0Var2.getTop());
            this.T.setAlpha(this.D);
            float T1 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.D);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        it0 it0Var = this.J;
        float f18 = this.W;
        if (this.f38940d0) {
            f11 = 1.0f;
        } else {
            f11 = this.D;
        }
        it0Var.setTranslationX(org.telegram.messenger.i0.T1(f18, 0.0f, f11) + W1);
        it0 it0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f38935a0;
        if (this.f38940d0) {
            f12 = 1.0f;
        } else {
            f12 = this.D;
        }
        it0Var2.setTranslationY(org.telegram.messenger.i0.T1(f19, f20, f12));
        if (this.R != null) {
            int T12 = this.J.T1(this.P);
            this.J.S1(T12);
            float R1 = this.J.R1(T12);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f21 = W1 + 0.0f;
                if (this.J.V2()) {
                    i11 = org.telegram.messenger.i0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = ht0Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) R1)) - this.R.getTop()) - ht0Var2.getTop());
            this.R.setAlpha(this.D);
            float T13 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.D);
            this.R.setScaleX(T13);
            this.R.setScaleY(T13);
        }
        if (this.f38940d0) {
            this.K.setAlpha(this.D);
            this.J.setAlpha(this.D);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.i0.L(22.0f)) - ht0Var2.getTop()));
            this.Q.setAlpha(this.D);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.D);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.D);
        org.telegram.ui.Components.ya0 ya0Var = this.f38945n;
        ya0Var.setSelectedTab(positionAnimated);
        ya0Var.setAlpha(this.D);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ht0 ht0Var = this.f38938c;
        setContentView(ht0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        ht0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.i0.n3(ht0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.nl0.d(new z4(this, 15));
        this.O = true;
        b(true, null);
    }
}
