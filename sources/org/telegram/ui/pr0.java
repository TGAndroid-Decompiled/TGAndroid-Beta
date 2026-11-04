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
public final class pr0 extends Dialog {
    public float E;
    public float F;
    public final si.b G;
    public final eh.c H;
    public org.telegram.messenger.zi I;
    public boolean J;
    public nr0 K;
    public or0 L;
    public org.telegram.ui.Cells.q1 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public org.telegram.ui.Components.li0 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Context f48637a;
    public float f48638a0;
    public final org.telegram.ui.ActionBar.e6 f48639b;
    public float f48640b0;
    public final lr0 f48641c;
    public boolean f48642c0;
    public final lr0 d;
    public boolean f48643d0;
    public final lr0 f48644e;
    public boolean f48645e0;
    public final gi.g1 f48646f;
    public pl f48647f0;
    public ValueAnimator f48648g0;
    public final TextView h;
    public ValueAnimator f48649h0;
    public final org.telegram.ui.Components.ba0 f48650n;
    public i0.b f48651r;
    public Bitmap f48652s;
    public BitmapShader f48653w;
    public Paint f48654x;
    public Matrix f48655y;

    public pr0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, 2131755352);
        this.f48651r = i0.b.f14494e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        this.f48643d0 = false;
        this.f48637a = activity;
        this.f48639b = e6Var;
        lr0 lr0Var = new lr0(this, activity, 0);
        this.f48641c = lr0Var;
        lr0Var.setOnClickListener(new b40(this, 23));
        si.b bVar = new si.b();
        this.G = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.H = cVar;
        cVar.h = new kh.k(lr0Var);
        cVar.f9986i = lr0Var;
        lr0 lr0Var2 = new lr0(this, activity, 1);
        this.d = lr0Var2;
        lr0Var2.setClipToPadding(false);
        lr0Var.addView(lr0Var2, b8.mf.e(-1, -1, 119));
        gi.g1 g1Var = new gi.g1(5, activity, this);
        this.f48646f = g1Var;
        g1Var.setAdapter(new ci.o4(4, activity, this));
        lr0Var2.addView(g1Var, b8.mf.e(-1, -1, 119));
        lr0 lr0Var3 = new lr0(this, activity, 2);
        this.f48644e = lr0Var3;
        lr0Var2.addView(lr0Var3, b8.mf.e(-1, -1, 119));
        org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(activity, e6Var);
        this.f48650n = ba0Var;
        ba0Var.a(0, org.telegram.messenger.bd.M0(2131747176, null));
        ba0Var.a(1, org.telegram.messenger.bd.M0(2131747175, null));
        lr0Var2.addView(ba0Var, b8.mf.e(-1, 66, 80));
        ba0Var.setOnTabClick(new s3(g1Var, 18));
        gh.g c2 = cVar.c(ba0Var, null, false);
        c2.p(b8.cd.k(e6Var));
        c2.R.f12302e = true;
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(16.0f));
        ba0Var.setBackground(c2);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ba0Var.getColor());
        textView.setText(org.telegram.messenger.bd.M0(2131747177, null));
        textView.setGravity(17);
        lr0Var2.addView(textView, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        mr0 mr0Var = new mr0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(lr0Var, mr0Var);
    }

    public final void b(boolean z10, gr0 gr0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f48648g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f48649h0;
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
        this.f48648g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final pr0 f45968b;

            {
                this.f45968b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        pr0 pr0Var = this.f45968b;
                        pr0Var.E = floatValue;
                        pr0Var.f48641c.invalidate();
                        pr0Var.d.invalidate();
                        nr0 nr0Var = pr0Var.K;
                        if (nr0Var != null) {
                            nr0Var.invalidate();
                        }
                        pr0Var.e();
                        return;
                    default:
                        pr0 pr0Var2 = this.f45968b;
                        pr0Var2.getClass();
                        pr0Var2.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f48648g0.addListener(new androidx.fragment.app.g(this, z10, gr0Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f48648g0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f48648g0.setDuration(j10);
        this.f48648g0.start();
        float f13 = this.F;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f48649h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final pr0 f45968b;

            {
                this.f45968b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        pr0 pr0Var = this.f45968b;
                        pr0Var.E = floatValue;
                        pr0Var.f48641c.invalidate();
                        pr0Var.d.invalidate();
                        nr0 nr0Var = pr0Var.K;
                        if (nr0Var != null) {
                            nr0Var.invalidate();
                        }
                        pr0Var.e();
                        return;
                    default:
                        pr0 pr0Var2 = this.f45968b;
                        pr0Var2.getClass();
                        pr0Var2.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f48649h0.addListener(new u40(4, this, z10));
        this.f48649h0.setDuration(((float) j10) * 1.5f);
        this.f48649h0.setInterpolator(xqVar);
        this.f48649h0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.li0 li0Var;
        if (z10 && (li0Var = this.R) != null && li0Var.getReactionsWindow() != null && !this.R.getReactionsWindow().f8945q) {
            this.R.e();
        } else if (this.f48643d0) {
        } else {
            this.f48643d0 = true;
            this.Z = false;
            gi.g1 g1Var = this.f48646f;
            g1Var.g();
            if (g1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.q1 q1Var2 = this.M;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(4);
                    this.M.invalidate();
                }
            } else if (!z10 && (q1Var = this.M) != null) {
                q1Var.setVisibility(0);
                org.telegram.ui.Cells.q1 q1Var3 = this.M;
                q1Var3.f29873c6 = null;
                q1Var3.invalidate();
            }
            this.f48645e0 = !z10;
            d();
            b(false, new gr0(this, z11));
            this.f48641c.invalidate();
        }
    }

    public final void d() {
        int i3;
        ViewGroup viewGroup;
        if (!this.Z) {
            lr0 lr0Var = this.f48641c;
            if (lr0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.M;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f48651r;
                    this.X = i10 - bVar.f14495a;
                    float f10 = iArr[1] - bVar.f14496b;
                    this.Y = f10;
                    if (!this.f48642c0) {
                        this.f48642c0 = true;
                        this.f48638a0 = f10;
                        if (this.U != null) {
                            float height = f10 + this.M.getHeight() + this.U.getHeight();
                            int height2 = lr0Var.getHeight();
                            i0.b bVar2 = this.f48651r;
                            if (height > ((height2 - bVar2.f14496b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = lr0Var.getHeight();
                                i0.b bVar3 = this.f48651r;
                                this.f48638a0 = ((((height3 - bVar3.f14496b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                            }
                        }
                        int V1 = this.K.V1(this.Q);
                        this.K.U1(V1);
                        float T1 = this.K.T1(V1);
                        float f11 = this.Y;
                        this.f48640b0 = f11;
                        float f12 = (int) T1;
                        int height4 = lr0Var.getHeight();
                        i0.b bVar4 = this.f48651r;
                        int L = ((height4 - bVar4.f14496b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = lr0Var.getHeight();
                            i0.b bVar5 = this.f48651r;
                            this.f48640b0 = ((((height5 - bVar5.f14496b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i3;
                        }
                        if (this.S != null) {
                            float height6 = this.f48640b0 + f12 + viewGroup.getHeight();
                            int height7 = lr0Var.getHeight();
                            i0.b bVar6 = this.f48651r;
                            if (height6 > (((height7 - bVar6.f14496b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = lr0Var.getHeight();
                                i0.b bVar7 = this.f48651r;
                                this.f48640b0 = (((((height8 - bVar7.f14496b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i3) - this.S.getHeight();
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
        int i3;
        gi.g1 g1Var = this.f48646f;
        float positionAnimated = g1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.Y;
                this.f48638a0 = f14;
                float height = f14 + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                lr0 lr0Var = this.f48641c;
                int height2 = lr0Var.getHeight();
                i0.b bVar = this.f48651r;
                if (height > ((height2 - bVar.f14496b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = lr0Var.getHeight();
                    i0.b bVar2 = this.f48651r;
                    this.f48638a0 = ((((height3 - bVar2.f14496b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        or0 or0Var = this.L;
        float f15 = this.X;
        if (this.f48645e0) {
            f10 = 1.0f;
        } else {
            f10 = this.E;
        }
        or0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        or0 or0Var2 = this.L;
        float f16 = this.Y;
        float f17 = this.f48638a0;
        if (this.f48645e0) {
            f11 = 1.0f;
        } else {
            f11 = this.E;
        }
        or0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.U;
        lr0 lr0Var2 = this.f48644e;
        if (viewGroup2 != null) {
            if (this.J) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((W12 + 0.0f) + this.L.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.U.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.L.X2()) {
                    i3 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i3 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i3) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = lr0Var2.getMeasuredWidth() - (this.U.getX() - W12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - lr0Var2.getTop());
            this.U.setAlpha(this.E);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.U.setScaleX(T1);
            this.U.setScaleY(T1);
        }
        nr0 nr0Var = this.K;
        float f19 = this.X;
        if (this.f48645e0) {
            f12 = 1.0f;
        } else {
            f12 = this.E;
        }
        nr0Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        nr0 nr0Var2 = this.K;
        float f20 = this.Y;
        float f21 = this.f48640b0;
        if (this.f48645e0) {
            f13 = 1.0f;
        } else {
            f13 = this.E;
        }
        nr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.S != null) {
            int V1 = this.K.V1(this.Q);
            this.K.U1(V1);
            float T12 = this.K.T1(V1);
            if (this.J) {
                this.S.setTranslationX(((this.K.getPollButtonsLeft() + ((W1 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.S.getLeft());
            } else {
                ViewGroup viewGroup3 = this.S;
                float f22 = W1 + 0.0f;
                if (this.K.X2()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = lr0Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.K.getY() + ((int) T12)) - this.S.getTop()) - lr0Var2.getTop());
            this.S.setAlpha(this.E);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.S.setScaleX(T13);
            this.S.setScaleY(T13);
        }
        if (this.f48645e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = W12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - lr0Var2.getTop()));
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
        org.telegram.ui.Components.ba0 ba0Var = this.f48650n;
        ba0Var.setSelectedTab(positionAnimated);
        ba0Var.setAlpha(this.E);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        lr0 lr0Var = this.f48641c;
        setContentView(lr0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        lr0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(lr0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.nk0.d(new c5(this, 15));
        this.P = true;
        b(true, null);
    }
}
