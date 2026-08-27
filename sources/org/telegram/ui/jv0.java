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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class jv0 extends Dialog {
    public float A;
    public final og.b B;
    public final jg.a C;
    public MessageObject D;
    public boolean E;
    public hv0 F;
    public iv0 G;
    public org.telegram.ui.Cells.s1 H;
    public float I;
    public float J;
    public boolean K;
    public byte[] L;
    public org.telegram.ui.Components.wj0 M;
    public ViewGroup N;
    public float O;
    public ViewGroup P;
    public float Q;
    public boolean R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    public final Context f39513a;

    public om f39514a0;

    public final org.telegram.ui.ActionBar.c6 f39515b;

    public ValueAnimator f39516b0;

    public final fv0 f39517c;

    public ValueAnimator f39518c0;
    public final fv0 d;

    public final fv0 f39519e;

    public final lh.h1 f39520f;
    public final TextView h;

    public final org.telegram.ui.Components.eb0 f39521n;

    public i0.c f39522r;

    public Bitmap f39523s;
    public BitmapShader v;

    public Paint f39524w;

    public Matrix f39525x;

    public float f39526y;

    public jv0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f39522r = i0.c.f10488e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        int i10 = 0;
        this.Y = false;
        this.f39513a = activity;
        this.f39515b = c6Var;
        fv0 fv0Var = new fv0(this, activity, i10);
        this.f39517c = fv0Var;
        fv0Var.setOnClickListener(new u50(this, 23));
        og.b bVar = new og.b();
        this.B = bVar;
        jg.a aVar = new jg.a(bVar);
        this.C = aVar;
        aVar.d = new qg.j(fv0Var);
        aVar.f12943e = fv0Var;
        fv0 fv0Var2 = new fv0(this, activity, 1);
        this.d = fv0Var2;
        fv0Var2.setClipToPadding(false);
        fv0Var.addView(fv0Var2, h7.z5.e(-1, -1, 119));
        lh.h1 h1Var = new lh.h1(this, activity, 5);
        this.f39520f = h1Var;
        int i11 = 2;
        h1Var.setAdapter(new cg.u(this, activity, i11));
        fv0Var2.addView(h1Var, h7.z5.e(-1, -1, 119));
        fv0 fv0Var3 = new fv0(this, activity, i11);
        this.f39519e = fv0Var3;
        fv0Var2.addView(fv0Var3, h7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.eb0 eb0Var = new org.telegram.ui.Components.eb0(activity, c6Var);
        this.f39521n = eb0Var;
        eb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        eb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        fv0Var2.addView(eb0Var, h7.z5.e(-1, 66, 80));
        eb0Var.setOnTabClick(new x3(h1Var, 14));
        lg.d dVarC = aVar.c(eb0Var, null, false);
        dVarC.n(ng.c.j(c6Var));
        dVarC.h.f15583e = true;
        dVarC.o(AndroidUtilities.dp(8.0f));
        dVarC.p(AndroidUtilities.dp(16.0f));
        eb0Var.setBackground(dVarC);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(eb0Var.getColor());
        org.telegram.messenger.rl.i(R.string.PollMenuHint, textView, 17);
        fv0Var2.addView(textView, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        gv0 gv0Var = new gv0(this, i10);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(fv0Var, gv0Var);
    }

    public final void b(boolean z10, zu0 zu0Var) {
        ValueAnimator valueAnimator = this.f39516b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39518c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39526y, z10 ? 1.0f : 0.0f);
        this.f39516b0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final jv0 f36641b;

            {
                this.f36641b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        jv0 jv0Var = this.f36641b;
                        jv0Var.f39526y = fFloatValue;
                        jv0Var.f39517c.invalidate();
                        jv0Var.d.invalidate();
                        hv0 hv0Var = jv0Var.F;
                        if (hv0Var != null) {
                            hv0Var.invalidate();
                        }
                        jv0Var.e();
                        break;
                    default:
                        jv0 jv0Var2 = this.f36641b;
                        jv0Var2.getClass();
                        jv0Var2.A = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f39516b0.addListener(new androidx.fragment.app.g(this, z10, zu0Var, 10));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.f39516b0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.f39516b0.setDuration(j10);
        this.f39516b0.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
        this.f39518c0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final jv0 f36641b;

            {
                this.f36641b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                switch (i11) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        jv0 jv0Var = this.f36641b;
                        jv0Var.f39526y = fFloatValue;
                        jv0Var.f39517c.invalidate();
                        jv0Var.d.invalidate();
                        hv0 hv0Var = jv0Var.F;
                        if (hv0Var != null) {
                            hv0Var.invalidate();
                        }
                        jv0Var.e();
                        break;
                    default:
                        jv0 jv0Var2 = this.f36641b;
                        jv0Var2.getClass();
                        jv0Var2.A = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f39518c0.addListener(new n40(5, this, z10));
        this.f39518c0.setDuration((long) (j10 * 1.5f));
        this.f39518c0.setInterpolator(erVar);
        this.f39518c0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.wj0 wj0Var;
        if (z10 && (wj0Var = this.M) != null && wj0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().f11282q) {
            this.M.e();
            return;
        }
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.U = false;
        lh.h1 h1Var = this.f39520f;
        h1Var.l();
        boolean z11 = h1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.s1 s1Var2 = this.H;
            if (s1Var2 != null) {
                s1Var2.setVisibility(4);
                this.H.invalidate();
            }
        } else if (!z10 && (s1Var = this.H) != null) {
            s1Var.setVisibility(0);
            org.telegram.ui.Cells.s1 s1Var3 = this.H;
            s1Var3.H7 = null;
            s1Var3.invalidate();
        }
        this.Z = !z10;
        d();
        b(false, new zu0(this, z11));
        this.f39517c.invalidate();
    }

    public final void d() {
        if (this.U) {
            return;
        }
        fv0 fv0Var = this.f39517c;
        if (fv0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.H;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.c cVar = this.f39522r;
            this.S = i10 - cVar.f10489a;
            float f10 = iArr[1] - cVar.f10490b;
            this.T = f10;
            if (!this.X) {
                this.X = true;
                this.V = f10;
                if (this.P != null) {
                    float height = f10 + this.H.getHeight() + this.P.getHeight();
                    int height2 = fv0Var.getHeight();
                    i0.c cVar2 = this.f39522r;
                    if (height > ((height2 - cVar2.f10490b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = fv0Var.getHeight();
                        i0.c cVar3 = this.f39522r;
                        this.V = ((((height3 - cVar3.f10490b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                    }
                }
                int iH2 = this.F.H2(this.L);
                this.F.G2(iH2);
                float fF2 = this.F.F2(iH2);
                float f11 = this.T;
                this.W = f11;
                int i11 = (int) fF2;
                float f12 = i11;
                float f13 = f11 + f12;
                int height4 = fv0Var.getHeight();
                i0.c cVar4 = this.f39522r;
                int iDp = ((height4 - cVar4.f10490b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f13 > iDp - textView.getHeight()) {
                    int height5 = fv0Var.getHeight();
                    i0.c cVar5 = this.f39522r;
                    this.W = ((((height5 - cVar5.f10490b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i11;
                }
                ViewGroup viewGroup = this.N;
                if (viewGroup != null) {
                    float height6 = this.W + f12 + viewGroup.getHeight();
                    int height7 = fv0Var.getHeight();
                    i0.c cVar6 = this.f39522r;
                    if (height6 > (((height7 - cVar6.f10490b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = fv0Var.getHeight();
                        i0.c cVar7 = this.f39522r;
                        this.W = (((((height8 - cVar7.f10490b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i11) - this.N.getHeight();
                    }
                }
            }
            e();
        } else {
            this.T = 0.0f;
            this.S = 0.0f;
        }
        this.U = true;
    }

    @Override
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        lh.h1 h1Var = this.f39520f;
        float positionAnimated = h1Var.getPositionAnimated();
        float fLerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float fLerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.U) {
            ViewGroup viewGroup = this.P;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.T;
                this.V = f10;
                float height = f10 + this.H.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                fv0 fv0Var = this.f39517c;
                int height2 = fv0Var.getHeight();
                i0.c cVar = this.f39522r;
                if (height > ((height2 - cVar.f10490b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = fv0Var.getHeight();
                    i0.c cVar2 = this.f39522r;
                    this.V = ((((height3 - cVar2.f10490b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.G.setTranslationX(AndroidUtilities.lerp(this.S, 0.0f, this.Z ? 1.0f : this.f39526y) + fLerp2);
        this.G.setTranslationY(AndroidUtilities.lerp(this.T, this.V, this.Z ? 1.0f : this.f39526y));
        ViewGroup viewGroup2 = this.P;
        fv0 fv0Var2 = this.f39519e;
        if (viewGroup2 != null) {
            if (this.E) {
                viewGroup2.setTranslationX(((this.G.getPollButtonsLeft() + ((fLerp2 + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.P.getLeft());
            } else {
                viewGroup2.setTranslationX((((fLerp2 + 0.0f) + (this.G.y3() ? AndroidUtilities.dp(48.0f) : 0)) + this.G.getLeft()) - this.P.getLeft());
            }
            this.Q = fv0Var2.getMeasuredWidth() - (this.P.getX() - fLerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - fv0Var2.getTop());
            this.P.setAlpha(this.f39526y);
            float fLerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39526y);
            this.P.setScaleX(fLerp3);
            this.P.setScaleY(fLerp3);
        }
        this.F.setTranslationX(AndroidUtilities.lerp(this.S, 0.0f, this.Z ? 1.0f : this.f39526y) + fLerp);
        this.F.setTranslationY(AndroidUtilities.lerp(this.T, this.W, this.Z ? 1.0f : this.f39526y));
        if (this.N != null) {
            int iH2 = this.F.H2(this.L);
            this.F.G2(iH2);
            float fF2 = this.F.F2(iH2);
            if (this.E) {
                this.N.setTranslationX(((this.F.getPollButtonsLeft() + ((fLerp + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.N.getLeft());
            } else {
                this.N.setTranslationX((((fLerp + 0.0f) + (this.F.y3() ? AndroidUtilities.dp(48.0f) : 0)) + this.F.getLeft()) - this.N.getLeft());
            }
            this.O = fv0Var2.getMeasuredWidth() - (this.N.getX() - fLerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) fF2)) - this.N.getTop()) - fv0Var2.getTop());
            this.N.setAlpha(this.f39526y);
            float fLerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39526y);
            this.N.setScaleX(fLerp4);
            this.N.setScaleY(fLerp4);
        }
        if (this.Z) {
            this.G.setAlpha(this.f39526y);
            this.F.setAlpha(this.f39526y);
        }
        if (this.M != null) {
            float fMax = fLerp2 + Math.max(0.0f, ((this.G.getBoundsLeft() + this.G.getBoundsRight()) / 2.0f) - (this.M.getWidth() * 0.8f));
            this.M.setTranslationX(fMax);
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - fv0Var2.getTop()));
            this.M.setAlpha(this.f39526y);
            View windowView = this.M.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(fMax);
                windowView.setAlpha(this.f39526y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(fLerp);
        textView.setAlpha(this.f39526y);
        org.telegram.ui.Components.eb0 eb0Var = this.f39521n;
        eb0Var.setSelectedTab(positionAnimated);
        eb0Var.setAlpha(this.f39526y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fv0 fv0Var = this.f39517c;
        setContentView(fv0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i10 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        fv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(fv0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.ol0.d(new b5(this, 15));
            this.K = true;
            b(true, null);
        }
    }
}
