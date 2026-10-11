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
public final class le1 extends Dialog {
    public final fh.b E;
    public final ah.c F;
    public MessageObject G;
    public boolean H;
    public je1 I;
    public kw0 J;
    public org.telegram.ui.Cells.u1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.ml0 P;
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
    public final org.telegram.ui.ActionBar.d6 f39632a;
    public boolean f39633a0;
    public final ie1 f39634b;
    public boolean f39635b0;
    public final ie1 f39636c;
    public wm f39637c0;
    public final ie1 d;
    public ValueAnimator f39638d0;
    public final ci.h1 f39639e;
    public ValueAnimator f39640e0;
    public final TextView f39641f;
    public final org.telegram.ui.Components.uc0 h;
    public i0.b f39642n;
    public Bitmap f39643r;
    public BitmapShader f39644s;
    public Paint v;
    public Matrix f39645w;
    public float f39646x;
    public float f39647y;

    public le1(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, R.style.TransparentDialog);
        this.f39642n = i0.b.f11574e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f39633a0 = false;
        this.f39632a = d6Var;
        ie1 ie1Var = new ie1(this, activity, 0);
        this.f39634b = ie1Var;
        ie1Var.setOnClickListener(new o41(this, 5));
        fh.b bVar = new fh.b();
        this.E = bVar;
        ah.c cVar = new ah.c(bVar);
        this.F = cVar;
        cVar.f545f = new hh.j(ie1Var);
        cVar.f546g = ie1Var;
        ie1 ie1Var2 = new ie1(this, activity, 1);
        this.f39636c = ie1Var2;
        ie1Var2.setClipToPadding(false);
        ie1Var.addView(ie1Var2, w7.x5.e(-1, -1, 119));
        ci.h1 h1Var = new ci.h1(this, activity, 8);
        this.f39639e = h1Var;
        h1Var.setAdapter(new hw0(this, activity, 2));
        ie1Var2.addView(h1Var, w7.x5.e(-1, -1, 119));
        ie1 ie1Var3 = new ie1(this, activity, 2);
        this.d = ie1Var3;
        ie1Var2.addView(ie1Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(activity, d6Var);
        this.h = uc0Var;
        uc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        uc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        ie1Var2.addView(uc0Var, w7.x5.e(-1, 66, 80));
        uc0Var.setOnTabClick(new s3(h1Var, 25));
        ch.d c10 = cVar.c(uc0Var, null, false);
        c10.o(eh.b.k(d6Var));
        c10.f4684j.f4667e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        uc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f39641f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(uc0Var.getColor());
        org.telegram.messenger.ai.m(R.string.TodoMenuHint, textView, 17);
        ie1Var2.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        iw0 iw0Var = new iw0(this, 6);
        WeakHashMap weakHashMap = r0.i0.f46856a;
        r0.a0.i(ie1Var, iw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.fs0 fs0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f39638d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39640e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f39646x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39638d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final le1 f37290b;

            {
                this.f37290b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        le1 le1Var = this.f37290b;
                        le1Var.f39646x = floatValue;
                        le1Var.f39634b.invalidate();
                        le1Var.f39636c.invalidate();
                        le1Var.e();
                        return;
                    default:
                        le1 le1Var2 = this.f37290b;
                        le1Var2.getClass();
                        le1Var2.f39647y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39638d0.addListener(new androidx.fragment.app.g(this, z10, fs0Var, 11));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f39638d0;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        valueAnimator3.setInterpolator(isVar);
        this.f39638d0.setDuration(j3);
        this.f39638d0.start();
        float f12 = this.f39647y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f39640e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final le1 f37290b;

            {
                this.f37290b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        le1 le1Var = this.f37290b;
                        le1Var.f39646x = floatValue;
                        le1Var.f39634b.invalidate();
                        le1Var.f39636c.invalidate();
                        le1Var.e();
                        return;
                    default:
                        le1 le1Var2 = this.f37290b;
                        le1Var2.getClass();
                        le1Var2.f39647y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39640e0.addListener(new f70(10, this, z10));
        this.f39640e0.setDuration(((float) j3) * 1.5f);
        this.f39640e0.setInterpolator(isVar);
        this.f39640e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.ml0 ml0Var;
        if (z10 && (ml0Var = this.P) != null && ml0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f54550q) {
            this.P.e();
        } else if (this.f39633a0) {
        } else {
            this.f39633a0 = true;
            this.W = false;
            ci.h1 h1Var = this.f39639e;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
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
            this.f39635b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.fs0(13, this, z11));
            this.f39634b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            ie1 ie1Var = this.f39634b;
            if (ie1Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.K;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f39642n;
                    this.U = i11 - bVar.f11575a;
                    float f7 = iArr[1] - bVar.f11576b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = ie1Var.getHeight();
                            i0.b bVar2 = this.f39642n;
                            if (height > ((height2 - bVar2.f11576b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = ie1Var.getHeight();
                                i0.b bVar3 = this.f39642n;
                                this.X = ((((height3 - bVar3.f11576b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = ie1Var.getHeight();
                        i0.b bVar4 = this.f39642n;
                        int dp = ((height4 - bVar4.f11576b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f39641f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = ie1Var.getHeight();
                            i0.b bVar5 = this.f39642n;
                            this.Y = ((((height5 - bVar5.f11576b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = ie1Var.getHeight();
                            i0.b bVar6 = this.f39642n;
                            if (height6 > (((height7 - bVar6.f11576b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = ie1Var.getHeight();
                                i0.b bVar7 = this.f39642n;
                                this.Y = (((((height8 - bVar7.f11576b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        ci.h1 h1Var = this.f39639e;
        float positionAnimated = h1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.V;
                this.X = f13;
                float height = f13 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ie1 ie1Var = this.f39634b;
                int height2 = ie1Var.getHeight();
                i0.b bVar = this.f39642n;
                if (height > ((height2 - bVar.f11576b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ie1Var.getHeight();
                    i0.b bVar2 = this.f39642n;
                    this.X = ((((height3 - bVar2.f11576b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        kw0 kw0Var = this.J;
        float f14 = this.U;
        if (this.f39635b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f39646x;
        }
        kw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        kw0 kw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f39635b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f39646x;
        }
        kw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        ie1 ie1Var2 = this.d;
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
            this.T = ie1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - ie1Var2.getTop());
            this.S.setAlpha(this.f39646x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39646x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        je1 je1Var = this.I;
        float f18 = this.U;
        if (this.f39635b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f39646x;
        }
        je1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        je1 je1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f39635b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f39646x;
        }
        je1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = ie1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - ie1Var2.getTop());
            this.Q.setAlpha(this.f39646x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39646x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f39635b0) {
            this.J.setAlpha(this.f39646x);
            this.I.setAlpha(this.f39646x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - ie1Var2.getTop()));
            this.P.setAlpha(this.f39646x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f39646x);
            }
        }
        TextView textView = this.f39641f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f39646x);
        org.telegram.ui.Components.uc0 uc0Var = this.h;
        uc0Var.setSelectedTab(positionAnimated);
        uc0Var.setAlpha(this.f39646x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ie1 ie1Var = this.f39634b;
        setContentView(ie1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        ie1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ie1Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.in0.d(new a5(this, 28));
        this.N = true;
        b(true, null);
    }
}
