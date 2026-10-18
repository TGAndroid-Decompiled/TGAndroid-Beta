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
public final class ad1 extends Dialog {
    public final gh.b E;
    public final bh.b F;
    public MessageObject G;
    public boolean H;
    public yc1 I;
    public rv0 J;
    public org.telegram.ui.Cells.u1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.cl0 P;
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
    public final org.telegram.ui.ActionBar.d6 f35368a;
    public boolean f35369a0;
    public final xc1 f35370b;
    public boolean f35371b0;
    public final xc1 f35372c;
    public pm f35373c0;
    public final xc1 d;
    public ValueAnimator f35374d0;
    public final ei.h1 e;
    public ValueAnimator f35375e0;
    public final TextView f35376f;
    public final org.telegram.ui.Components.mc0 h;
    public i0.b f35377n;
    public Bitmap f35378r;
    public BitmapShader f35379s;
    public Paint v;
    public Matrix f35380w;
    public float f35381x;
    public float f35382y;

    public ad1(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, R.style.TransparentDialog);
        this.f35377n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f35369a0 = false;
        this.f35368a = d6Var;
        xc1 xc1Var = new xc1(this, activity, 0);
        this.f35370b = xc1Var;
        xc1Var.setOnClickListener(new i31(this, 4));
        gh.b bVar = new gh.b();
        this.E = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.f4362f = new ih.j(xc1Var);
        bVar2.f4363g = xc1Var;
        xc1 xc1Var2 = new xc1(this, activity, 1);
        this.f35372c = xc1Var2;
        xc1Var2.setClipToPadding(false);
        xc1Var.addView(xc1Var2, w7.z5.e(-1, -1, 119));
        ei.h1 h1Var = new ei.h1(this, activity, 8);
        this.e = h1Var;
        h1Var.setAdapter(new ai.i5(this, activity, 3));
        xc1Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        xc1 xc1Var3 = new xc1(this, activity, 2);
        this.d = xc1Var3;
        xc1Var2.addView(xc1Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(activity, d6Var);
        this.h = mc0Var;
        mc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        mc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        xc1Var2.addView(mc0Var, w7.z5.e(-1, 66, 80));
        mc0Var.setOnTabClick(new v3(h1Var, 23));
        dh.d c10 = bVar2.c(mc0Var, null, false);
        c10.o(fh.c.k(d6Var));
        c10.f8015j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        mc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f35376f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(mc0Var.getColor());
        org.telegram.messenger.lk.m(R.string.TodoMenuHint, textView, 17);
        xc1Var2.addView(textView, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        mo0 mo0Var = new mo0(this, 7);
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.a0.i(xc1Var, mo0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.b60 b60Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f35374d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35375e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35381x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35374d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ad1 f41647b;

            {
                this.f41647b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ad1 ad1Var = this.f41647b;
                        ad1Var.f35381x = floatValue;
                        ad1Var.f35370b.invalidate();
                        ad1Var.f35372c.invalidate();
                        ad1Var.e();
                        return;
                    default:
                        ad1 ad1Var2 = this.f41647b;
                        ad1Var2.getClass();
                        ad1Var2.f35382y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35374d0.addListener(new ah.q0(this, z10, b60Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35374d0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        valueAnimator3.setInterpolator(bsVar);
        this.f35374d0.setDuration(j10);
        this.f35374d0.start();
        float f12 = this.f35382y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35375e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ad1 f41647b;

            {
                this.f41647b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ad1 ad1Var = this.f41647b;
                        ad1Var.f35381x = floatValue;
                        ad1Var.f35370b.invalidate();
                        ad1Var.f35372c.invalidate();
                        ad1Var.e();
                        return;
                    default:
                        ad1 ad1Var2 = this.f41647b;
                        ad1Var2.getClass();
                        ad1Var2.f35382y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35375e0.addListener(new n40(11, this, z10));
        this.f35375e0.setDuration(((float) j10) * 1.5f);
        this.f35375e0.setInterpolator(bsVar);
        this.f35375e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.cl0 cl0Var;
        if (z10 && (cl0Var = this.P) != null && cl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f883q) {
            this.P.e();
        } else if (this.f35369a0) {
        } else {
            this.f35369a0 = true;
            this.W = false;
            ei.h1 h1Var = this.e;
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
            this.f35371b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.b60(16, this, z11));
            this.f35370b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            xc1 xc1Var = this.f35370b;
            if (xc1Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.K;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f35377n;
                    this.U = i11 - bVar.f12284a;
                    float f7 = iArr[1] - bVar.f12285b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = xc1Var.getHeight();
                            i0.b bVar2 = this.f35377n;
                            if (height > ((height2 - bVar2.f12285b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = xc1Var.getHeight();
                                i0.b bVar3 = this.f35377n;
                                this.X = ((((height3 - bVar3.f12285b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = xc1Var.getHeight();
                        i0.b bVar4 = this.f35377n;
                        int dp = ((height4 - bVar4.f12285b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f35376f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = xc1Var.getHeight();
                            i0.b bVar5 = this.f35377n;
                            this.Y = ((((height5 - bVar5.f12285b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = xc1Var.getHeight();
                            i0.b bVar6 = this.f35377n;
                            if (height6 > (((height7 - bVar6.f12285b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = xc1Var.getHeight();
                                i0.b bVar7 = this.f35377n;
                                this.Y = (((((height8 - bVar7.f12285b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        ei.h1 h1Var = this.e;
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
                xc1 xc1Var = this.f35370b;
                int height2 = xc1Var.getHeight();
                i0.b bVar = this.f35377n;
                if (height > ((height2 - bVar.f12285b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = xc1Var.getHeight();
                    i0.b bVar2 = this.f35377n;
                    this.X = ((((height3 - bVar2.f12285b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        rv0 rv0Var = this.J;
        float f14 = this.U;
        if (this.f35371b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f35381x;
        }
        rv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        rv0 rv0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f35371b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f35381x;
        }
        rv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        xc1 xc1Var2 = this.d;
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
            this.T = xc1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - xc1Var2.getTop());
            this.S.setAlpha(this.f35381x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35381x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        yc1 yc1Var = this.I;
        float f18 = this.U;
        if (this.f35371b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f35381x;
        }
        yc1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        yc1 yc1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f35371b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f35381x;
        }
        yc1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = xc1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - xc1Var2.getTop());
            this.Q.setAlpha(this.f35381x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35381x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f35371b0) {
            this.J.setAlpha(this.f35381x);
            this.I.setAlpha(this.f35381x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - xc1Var2.getTop()));
            this.P.setAlpha(this.f35381x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f35381x);
            }
        }
        TextView textView = this.f35376f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f35381x);
        org.telegram.ui.Components.mc0 mc0Var = this.h;
        mc0Var.setSelectedTab(positionAnimated);
        mc0Var.setAlpha(this.f35381x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        xc1 xc1Var = this.f35370b;
        setContentView(xc1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        xc1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(xc1Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.ym0.d(new g5(this, 28));
        this.N = true;
        b(true, null);
    }
}
