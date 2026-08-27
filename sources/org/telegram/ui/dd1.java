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

public final class dd1 extends Dialog {
    public final og.b A;
    public final jg.a B;
    public MessageObject C;
    public boolean D;
    public bd1 E;
    public iv0 F;
    public org.telegram.ui.Cells.s1 G;
    public float H;
    public float I;
    public boolean J;
    public int K;
    public org.telegram.ui.Components.wj0 L;
    public ViewGroup M;
    public float N;
    public ViewGroup O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public boolean X;
    public om Y;
    public ValueAnimator Z;

    public final org.telegram.ui.ActionBar.c6 f37363a;

    public ValueAnimator f37364a0;

    public final ad1 f37365b;

    public final ad1 f37366c;
    public final ad1 d;

    public final lh.h1 f37367e;

    public final TextView f37368f;
    public final org.telegram.ui.Components.eb0 h;

    public i0.c f37369n;

    public Bitmap f37370r;

    public BitmapShader f37371s;
    public Paint v;

    public Matrix f37372w;

    public float f37373x;

    public float f37374y;

    public dd1(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f37369n = i0.c.f10488e;
        this.H = 0.0f;
        this.I = 0.0f;
        this.N = -1.0f;
        this.P = -1.0f;
        this.W = false;
        this.f37363a = c6Var;
        ad1 ad1Var = new ad1(this, activity, 0);
        this.f37365b = ad1Var;
        ad1Var.setOnClickListener(new v21(this, 7));
        og.b bVar = new og.b();
        this.A = bVar;
        jg.a aVar = new jg.a(bVar);
        this.B = aVar;
        aVar.d = new qg.j(ad1Var);
        aVar.f12943e = ad1Var;
        ad1 ad1Var2 = new ad1(this, activity, 1);
        this.f37366c = ad1Var2;
        ad1Var2.setClipToPadding(false);
        ad1Var.addView(ad1Var2, h7.z5.e(-1, -1, 119));
        lh.h1 h1Var = new lh.h1(this, activity, 8);
        this.f37367e = h1Var;
        h1Var.setAdapter(new cg.u(this, activity, 4));
        ad1Var2.addView(h1Var, h7.z5.e(-1, -1, 119));
        ad1 ad1Var3 = new ad1(this, activity, 2);
        this.d = ad1Var3;
        ad1Var2.addView(ad1Var3, h7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.eb0 eb0Var = new org.telegram.ui.Components.eb0(activity, c6Var);
        this.h = eb0Var;
        eb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        eb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        ad1Var2.addView(eb0Var, h7.z5.e(-1, 66, 80));
        eb0Var.setOnTabClick(new x3(h1Var, 22));
        lg.d dVarC = aVar.c(eb0Var, null, false);
        dVarC.n(ng.c.j(c6Var));
        dVarC.h.f15583e = true;
        dVarC.o(AndroidUtilities.dp(8.0f));
        dVarC.p(AndroidUtilities.dp(16.0f));
        eb0Var.setBackground(dVarC);
        TextView textView = new TextView(activity);
        this.f37368f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(eb0Var.getColor());
        org.telegram.messenger.rl.i(R.string.TodoMenuHint, textView, 17);
        ad1Var2.addView(textView, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        gv0 gv0Var = new gv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(ad1Var, gv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.f50 f50Var) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f37364a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f37373x, z10 ? 1.0f : 0.0f);
        this.Z = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final dd1 f43707b;

            {
                this.f43707b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.f43707b;
                        dd1Var.f37373x = fFloatValue;
                        dd1Var.f37365b.invalidate();
                        dd1Var.f37366c.invalidate();
                        dd1Var.e();
                        break;
                    default:
                        dd1 dd1Var2 = this.f43707b;
                        dd1Var2.getClass();
                        dd1Var2.f37374y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.Z.addListener(new androidx.fragment.app.g(this, z10, f50Var, 12));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.Z.setDuration(j10);
        this.Z.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f37374y, z10 ? 1.0f : 0.0f);
        this.f37364a0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final dd1 f43707b;

            {
                this.f43707b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                switch (i11) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.f43707b;
                        dd1Var.f37373x = fFloatValue;
                        dd1Var.f37365b.invalidate();
                        dd1Var.f37366c.invalidate();
                        dd1Var.e();
                        break;
                    default:
                        dd1 dd1Var2 = this.f43707b;
                        dd1Var2.getClass();
                        dd1Var2.f37374y = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f37364a0.addListener(new n40(11, this, z10));
        this.f37364a0.setDuration((long) (j10 * 1.5f));
        this.f37364a0.setInterpolator(erVar);
        this.f37364a0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.wj0 wj0Var;
        if (z10 && (wj0Var = this.L) != null && wj0Var.getReactionsWindow() != null && !this.L.getReactionsWindow().f11282q) {
            this.L.e();
            return;
        }
        if (this.W) {
            return;
        }
        this.W = true;
        this.S = false;
        lh.h1 h1Var = this.f37367e;
        h1Var.l();
        boolean z11 = h1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.s1 s1Var2 = this.G;
            if (s1Var2 != null) {
                s1Var2.setVisibility(4);
                this.G.invalidate();
            }
        } else if (!z10 && (s1Var = this.G) != null) {
            s1Var.setVisibility(0);
            org.telegram.ui.Cells.s1 s1Var3 = this.G;
            s1Var3.G7 = -1;
            s1Var3.invalidate();
        }
        this.X = !z10;
        d();
        b(false, new org.telegram.ui.Components.f50(16, this, z11));
        this.f37365b.invalidate();
    }

    public final void d() {
        if (this.S) {
            return;
        }
        ad1 ad1Var = this.f37365b;
        if (ad1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.G;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.c cVar = this.f37369n;
            this.Q = i10 - cVar.f10489a;
            float f10 = iArr[1] - cVar.f10490b;
            this.R = f10;
            if (!this.V) {
                this.V = true;
                this.T = f10;
                if (this.O != null) {
                    float height = f10 + this.G.getHeight() + this.O.getHeight();
                    int height2 = ad1Var.getHeight();
                    i0.c cVar2 = this.f37369n;
                    if (height > ((height2 - cVar2.f10490b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = ad1Var.getHeight();
                        i0.c cVar3 = this.f37369n;
                        this.T = ((((height3 - cVar3.f10490b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - this.O.getHeight();
                    }
                }
                int iN2 = this.E.N2(this.K);
                this.E.G2(iN2);
                float fF2 = this.E.F2(iN2);
                float f11 = this.R;
                this.U = f11;
                int i11 = (int) fF2;
                float f12 = i11;
                float f13 = f11 + f12;
                int height4 = ad1Var.getHeight();
                i0.c cVar4 = this.f37369n;
                int iDp = ((height4 - cVar4.f10490b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f37368f;
                if (f13 > iDp - textView.getHeight()) {
                    int height5 = ad1Var.getHeight();
                    i0.c cVar5 = this.f37369n;
                    this.U = ((((height5 - cVar5.f10490b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i11;
                }
                ViewGroup viewGroup = this.M;
                if (viewGroup != null) {
                    float height6 = this.U + f12 + viewGroup.getHeight();
                    int height7 = ad1Var.getHeight();
                    i0.c cVar6 = this.f37369n;
                    if (height6 > (((height7 - cVar6.f10490b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = ad1Var.getHeight();
                        i0.c cVar7 = this.f37369n;
                        this.U = (((((height8 - cVar7.f10490b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i11) - this.M.getHeight();
                    }
                }
            }
            e();
        } else {
            this.R = 0.0f;
            this.Q = 0.0f;
        }
        this.S = true;
    }

    @Override
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        lh.h1 h1Var = this.f37367e;
        float positionAnimated = h1Var.getPositionAnimated();
        float fLerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float fLerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.S) {
            ViewGroup viewGroup = this.O;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.R;
                this.T = f10;
                float height = f10 + this.G.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ad1 ad1Var = this.f37365b;
                int height2 = ad1Var.getHeight();
                i0.c cVar = this.f37369n;
                if (height > ((height2 - cVar.f10490b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ad1Var.getHeight();
                    i0.c cVar2 = this.f37369n;
                    this.T = ((((height3 - cVar2.f10490b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.F.setTranslationX(AndroidUtilities.lerp(this.Q, 0.0f, this.X ? 1.0f : this.f37373x) + fLerp2);
        this.F.setTranslationY(AndroidUtilities.lerp(this.R, this.T, this.X ? 1.0f : this.f37373x));
        ViewGroup viewGroup2 = this.O;
        ad1 ad1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.D) {
                viewGroup2.setTranslationX(((this.F.getPollButtonsLeft() + ((fLerp2 + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.O.getLeft());
            } else {
                viewGroup2.setTranslationX((((fLerp2 + 0.0f) + (this.F.y3() ? AndroidUtilities.dp(48.0f) : 0)) + this.F.getLeft()) - this.O.getLeft());
            }
            this.P = ad1Var2.getMeasuredWidth() - (this.O.getX() - fLerp2);
            this.O.setTranslationY(((this.F.getY() + this.F.getHeight()) - this.O.getTop()) - ad1Var2.getTop());
            this.O.setAlpha(this.f37373x);
            float fLerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f37373x);
            this.O.setScaleX(fLerp3);
            this.O.setScaleY(fLerp3);
        }
        this.E.setTranslationX(AndroidUtilities.lerp(this.Q, 0.0f, this.X ? 1.0f : this.f37373x) + fLerp);
        this.E.setTranslationY(AndroidUtilities.lerp(this.R, this.U, this.X ? 1.0f : this.f37373x));
        if (this.M != null) {
            int iN2 = this.E.N2(this.K);
            this.E.G2(iN2);
            float fF2 = this.E.F2(iN2);
            if (this.D) {
                this.M.setTranslationX(((this.E.getPollButtonsLeft() + ((fLerp + 0.0f) + this.E.getLeft())) - AndroidUtilities.dp(8.0f)) - this.M.getLeft());
            } else {
                this.M.setTranslationX((((fLerp + 0.0f) + (this.E.y3() ? AndroidUtilities.dp(48.0f) : 0)) + this.E.getLeft()) - this.M.getLeft());
            }
            this.N = ad1Var2.getMeasuredWidth() - (this.M.getX() - fLerp2);
            this.M.setTranslationY(((this.E.getY() + ((int) fF2)) - this.M.getTop()) - ad1Var2.getTop());
            this.M.setAlpha(this.f37373x);
            float fLerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f37373x);
            this.M.setScaleX(fLerp4);
            this.M.setScaleY(fLerp4);
        }
        if (this.X) {
            this.F.setAlpha(this.f37373x);
            this.E.setAlpha(this.f37373x);
        }
        if (this.L != null) {
            float fMax = fLerp2 + Math.max(0.0f, ((this.F.getBoundsLeft() + this.F.getBoundsRight()) / 2.0f) - (this.L.getWidth() * 0.8f));
            this.L.setTranslationX(fMax);
            this.L.setTranslationY(Math.max(0.0f, ((this.F.getY() - this.L.getHeight()) + AndroidUtilities.dp(22.0f)) - ad1Var2.getTop()));
            this.L.setAlpha(this.f37373x);
            View windowView = this.L.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(fMax);
                windowView.setAlpha(this.f37373x);
            }
        }
        TextView textView = this.f37368f;
        textView.setTranslationX(fLerp);
        textView.setAlpha(this.f37373x);
        org.telegram.ui.Components.eb0 eb0Var = this.h;
        eb0Var.setSelectedTab(positionAnimated);
        eb0Var.setAlpha(this.f37373x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ad1 ad1Var = this.f37365b;
        setContentView(ad1Var, layoutParams);
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
        ad1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ad1Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.ol0.d(new b5(this, 28));
            this.J = true;
            b(true, null);
        }
    }
}
