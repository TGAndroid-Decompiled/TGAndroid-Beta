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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ge1 extends Dialog {
    public final fh.b E;
    public final ah.c F;
    public MessageObject G;
    public boolean H;
    public ee1 I;
    public fw0 J;
    public org.telegram.ui.Cells.u1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.sk0 P;
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
    public final org.telegram.ui.ActionBar.d6 f36604a;
    public boolean f36605a0;
    public final de1 f36606b;
    public boolean f36607b0;
    public final de1 f36608c;
    public um f36609c0;
    public final de1 d;
    public ValueAnimator f36610d0;
    public final ci.i1 f36611e;
    public ValueAnimator f36612e0;
    public final TextView f36613f;
    public final org.telegram.ui.Components.gc0 h;
    public i0.b f36614n;
    public Bitmap f36615r;
    public BitmapShader f36616s;
    public Paint v;
    public Matrix f36617w;
    public float f36618x;
    public float f36619y;

    public ge1(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, R.style.TransparentDialog);
        this.f36614n = i0.b.f11524e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f36605a0 = false;
        this.f36604a = d6Var;
        de1 de1Var = new de1(this, activity, 0);
        this.f36606b = de1Var;
        de1Var.setOnClickListener(new a41(this, 6));
        fh.b bVar = new fh.b();
        this.E = bVar;
        ah.c cVar = new ah.c(bVar);
        this.F = cVar;
        cVar.f459f = new hh.k(de1Var);
        cVar.f460g = de1Var;
        de1 de1Var2 = new de1(this, activity, 1);
        this.f36608c = de1Var2;
        de1Var2.setClipToPadding(false);
        de1Var.addView(de1Var2, w7.z5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 7);
        this.f36611e = i1Var;
        i1Var.setAdapter(new cw0(this, activity, 2));
        de1Var2.addView(i1Var, w7.z5.e(-1, -1, 119));
        de1 de1Var3 = new de1(this, activity, 2);
        this.d = de1Var3;
        de1Var2.addView(de1Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.gc0 gc0Var = new org.telegram.ui.Components.gc0(activity, d6Var);
        this.h = gc0Var;
        gc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        gc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        de1Var2.addView(gc0Var, w7.z5.e(-1, 66, 80));
        gc0Var.setOnTabClick(new t3(i1Var, 25));
        ch.d c10 = cVar.c(gc0Var, null, false);
        c10.x(eh.b.k(d6Var));
        c10.f4632l.f4616e = true;
        c10.y(AndroidUtilities.dp(8.0f));
        c10.z(AndroidUtilities.dp(16.0f));
        gc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f36613f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(gc0Var.getColor());
        org.telegram.messenger.ok.l(R.string.TodoMenuHint, textView, 17);
        de1Var2.addView(textView, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        dw0 dw0Var = new dw0(this, 6);
        WeakHashMap weakHashMap = r0.i0.f45595a;
        r0.a0.j(de1Var, dw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.es0 es0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f36610d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f36612e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f36618x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36610d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ge1 f43755b;

            {
                this.f43755b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ge1 ge1Var = this.f43755b;
                        ge1Var.f36618x = floatValue;
                        ge1Var.f36606b.invalidate();
                        ge1Var.f36608c.invalidate();
                        ge1Var.e();
                        return;
                    default:
                        ge1 ge1Var2 = this.f43755b;
                        ge1Var2.getClass();
                        ge1Var2.f36619y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36610d0.addListener(new androidx.fragment.app.g(this, z10, es0Var, 11));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f36610d0;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        valueAnimator3.setInterpolator(trVar);
        this.f36610d0.setDuration(j3);
        this.f36610d0.start();
        float f12 = this.f36619y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f36612e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ge1 f43755b;

            {
                this.f43755b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ge1 ge1Var = this.f43755b;
                        ge1Var.f36618x = floatValue;
                        ge1Var.f36606b.invalidate();
                        ge1Var.f36608c.invalidate();
                        ge1Var.e();
                        return;
                    default:
                        ge1 ge1Var2 = this.f43755b;
                        ge1Var2.getClass();
                        ge1Var2.f36619y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36612e0.addListener(new g70(10, this, z10));
        this.f36612e0.setDuration(((float) j3) * 1.5f);
        this.f36612e0.setInterpolator(trVar);
        this.f36612e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.sk0 sk0Var;
        if (z10 && (sk0Var = this.P) != null && sk0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f53330q) {
            this.P.e();
        } else if (this.f36605a0) {
        } else {
            this.f36605a0 = true;
            this.W = false;
            ci.i1 i1Var = this.f36611e;
            i1Var.l();
            if (i1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.u1 u1Var2 = this.K;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(4);
                    this.K.invalidate();
                }
            } else if (!z10 && (u1Var = this.K) != null) {
                u1Var.setVisibility(0);
                org.telegram.ui.Cells.u1 u1Var3 = this.K;
                u1Var3.K7 = -1;
                u1Var3.invalidate();
            }
            this.f36607b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.es0(12, this, z11));
            this.f36606b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            de1 de1Var = this.f36606b;
            if (de1Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.K;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f36614n;
                    this.U = i11 - bVar.f11525a;
                    float f7 = iArr[1] - bVar.f11526b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = de1Var.getHeight();
                            i0.b bVar2 = this.f36614n;
                            if (height > ((height2 - bVar2.f11526b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = de1Var.getHeight();
                                i0.b bVar3 = this.f36614n;
                                this.X = ((((height3 - bVar3.f11526b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = de1Var.getHeight();
                        i0.b bVar4 = this.f36614n;
                        int dp = ((height4 - bVar4.f11526b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f36613f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = de1Var.getHeight();
                            i0.b bVar5 = this.f36614n;
                            this.Y = ((((height5 - bVar5.f11526b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = de1Var.getHeight();
                            i0.b bVar6 = this.f36614n;
                            if (height6 > (((height7 - bVar6.f11526b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = de1Var.getHeight();
                                i0.b bVar7 = this.f36614n;
                                this.Y = (((((height8 - bVar7.f11526b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        ci.i1 i1Var = this.f36611e;
        float positionAnimated = i1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -i1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(i1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.V;
                this.X = f13;
                float height = f13 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                de1 de1Var = this.f36606b;
                int height2 = de1Var.getHeight();
                i0.b bVar = this.f36614n;
                if (height > ((height2 - bVar.f11526b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = de1Var.getHeight();
                    i0.b bVar2 = this.f36614n;
                    this.X = ((((height3 - bVar2.f11526b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        fw0 fw0Var = this.J;
        float f14 = this.U;
        if (this.f36607b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f36618x;
        }
        fw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        fw0 fw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f36607b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f36618x;
        }
        fw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        de1 de1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.J.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = de1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - de1Var2.getTop());
            this.S.setAlpha(this.f36618x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36618x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        ee1 ee1Var = this.I;
        float f18 = this.U;
        if (this.f36607b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f36618x;
        }
        ee1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        ee1 ee1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f36607b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f36618x;
        }
        ee1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.Q != null) {
            int O2 = this.I.O2(this.O);
            this.I.H2(O2);
            float G2 = this.I.G2(O2);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((lerp + 0.0f) + this.I.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                ViewGroup viewGroup3 = this.Q;
                float f21 = lerp + 0.0f;
                if (this.I.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = de1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - de1Var2.getTop());
            this.Q.setAlpha(this.f36618x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36618x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f36607b0) {
            this.J.setAlpha(this.f36618x);
            this.I.setAlpha(this.f36618x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - de1Var2.getTop()));
            this.P.setAlpha(this.f36618x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f36618x);
            }
        }
        TextView textView = this.f36613f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f36618x);
        org.telegram.ui.Components.gc0 gc0Var = this.h;
        gc0Var.setSelectedTab(positionAnimated);
        gc0Var.setAlpha(this.f36618x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        de1 de1Var = this.f36606b;
        setContentView(de1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        de1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(de1Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.sm0.d(new c5(this, 28));
        this.N = true;
        b(true, null);
    }
}
