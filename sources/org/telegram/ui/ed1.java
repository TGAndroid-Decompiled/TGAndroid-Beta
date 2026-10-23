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
public final class ed1 extends Dialog {
    public final gh.b E;
    public final bh.b F;
    public MessageObject G;
    public boolean H;
    public cd1 I;
    public tv0 J;
    public org.telegram.ui.Cells.t1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.gl0 P;
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
    public final org.telegram.ui.ActionBar.g6 f36926a;
    public boolean f36927a0;
    public final bd1 f36928b;
    public boolean f36929b0;
    public final bd1 f36930c;
    public om f36931c0;
    public final bd1 d;
    public ValueAnimator f36932d0;
    public final ei.h1 e;
    public ValueAnimator f36933e0;
    public final TextView f36934f;
    public final org.telegram.ui.Components.pc0 h;
    public i0.b f36935n;
    public Bitmap f36936r;
    public BitmapShader f36937s;
    public Paint v;
    public Matrix f36938w;
    public float f36939x;
    public float f36940y;

    public ed1(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.f36935n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f36927a0 = false;
        this.f36926a = g6Var;
        bd1 bd1Var = new bd1(this, activity, 0);
        this.f36928b = bd1Var;
        bd1Var.setOnClickListener(new g31(this, 5));
        gh.b bVar = new gh.b();
        this.E = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.f4365f = new ih.k(bd1Var);
        bVar2.f4366g = bd1Var;
        bd1 bd1Var2 = new bd1(this, activity, 1);
        this.f36930c = bd1Var2;
        bd1Var2.setClipToPadding(false);
        bd1Var.addView(bd1Var2, w7.z5.e(-1, -1, 119));
        ei.h1 h1Var = new ei.h1(this, activity, 8);
        this.e = h1Var;
        h1Var.setAdapter(new ai.j5(this, activity, 3));
        bd1Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        bd1 bd1Var3 = new bd1(this, activity, 2);
        this.d = bd1Var3;
        bd1Var2.addView(bd1Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.pc0 pc0Var = new org.telegram.ui.Components.pc0(activity, g6Var);
        this.h = pc0Var;
        pc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        pc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        bd1Var2.addView(pc0Var, w7.z5.e(-1, 66, 80));
        pc0Var.setOnTabClick(new u3(h1Var, 23));
        dh.d c10 = bVar2.c(pc0Var, null, false);
        c10.o(fh.c.k(g6Var));
        c10.v.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        pc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f36934f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(pc0Var.getColor());
        org.telegram.messenger.sl.m(R.string.TodoMenuHint, textView, 17);
        bd1Var2.addView(textView, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        rv0 rv0Var = new rv0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(bd1Var, rv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.b60 b60Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f36932d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f36933e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f36939x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36932d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ed1 f43571b;

            {
                this.f43571b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ed1 ed1Var = this.f43571b;
                        ed1Var.f36939x = floatValue;
                        ed1Var.f36928b.invalidate();
                        ed1Var.f36930c.invalidate();
                        ed1Var.e();
                        return;
                    default:
                        ed1 ed1Var2 = this.f43571b;
                        ed1Var2.getClass();
                        ed1Var2.f36940y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36932d0.addListener(new ah.q0(this, z10, b60Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f36932d0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        valueAnimator3.setInterpolator(bsVar);
        this.f36932d0.setDuration(j10);
        this.f36932d0.start();
        float f12 = this.f36940y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f36933e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ed1 f43571b;

            {
                this.f43571b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ed1 ed1Var = this.f43571b;
                        ed1Var.f36939x = floatValue;
                        ed1Var.f36928b.invalidate();
                        ed1Var.f36930c.invalidate();
                        ed1Var.e();
                        return;
                    default:
                        ed1 ed1Var2 = this.f43571b;
                        ed1Var2.getClass();
                        ed1Var2.f36940y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36933e0.addListener(new o40(11, this, z10));
        this.f36933e0.setDuration(((float) j10) * 1.5f);
        this.f36933e0.setInterpolator(bsVar);
        this.f36933e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.P) != null && gl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f882q) {
            this.P.e();
        } else if (this.f36927a0) {
        } else {
            this.f36927a0 = true;
            this.W = false;
            ei.h1 h1Var = this.e;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.t1 t1Var2 = this.K;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(4);
                    this.K.invalidate();
                }
            } else if (!z10 && (t1Var = this.K) != null) {
                t1Var.setVisibility(0);
                org.telegram.ui.Cells.t1 t1Var3 = this.K;
                t1Var3.K7 = -1;
                t1Var3.invalidate();
            }
            this.f36929b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.b60(16, this, z11));
            this.f36928b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            bd1 bd1Var = this.f36928b;
            if (bd1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.K;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f36935n;
                    this.U = i11 - bVar.f12315a;
                    float f7 = iArr[1] - bVar.f12316b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = bd1Var.getHeight();
                            i0.b bVar2 = this.f36935n;
                            if (height > ((height2 - bVar2.f12316b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = bd1Var.getHeight();
                                i0.b bVar3 = this.f36935n;
                                this.X = ((((height3 - bVar3.f12316b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int N2 = this.I.N2(this.O);
                        this.I.G2(N2);
                        float F2 = this.I.F2(N2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) F2;
                        int height4 = bd1Var.getHeight();
                        i0.b bVar4 = this.f36935n;
                        int dp = ((height4 - bVar4.f12316b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f36934f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = bd1Var.getHeight();
                            i0.b bVar5 = this.f36935n;
                            this.Y = ((((height5 - bVar5.f12316b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = bd1Var.getHeight();
                            i0.b bVar6 = this.f36935n;
                            if (height6 > (((height7 - bVar6.f12316b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = bd1Var.getHeight();
                                i0.b bVar7 = this.f36935n;
                                this.Y = (((((height8 - bVar7.f12316b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
                bd1 bd1Var = this.f36928b;
                int height2 = bd1Var.getHeight();
                i0.b bVar = this.f36935n;
                if (height > ((height2 - bVar.f12316b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = bd1Var.getHeight();
                    i0.b bVar2 = this.f36935n;
                    this.X = ((((height3 - bVar2.f12316b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        tv0 tv0Var = this.J;
        float f14 = this.U;
        if (this.f36929b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f36939x;
        }
        tv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        tv0 tv0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f36929b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f36939x;
        }
        tv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        bd1 bd1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.J.y3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = bd1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - bd1Var2.getTop());
            this.S.setAlpha(this.f36939x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36939x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        cd1 cd1Var = this.I;
        float f18 = this.U;
        if (this.f36929b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f36939x;
        }
        cd1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        cd1 cd1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f36929b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f36939x;
        }
        cd1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.Q != null) {
            int N2 = this.I.N2(this.O);
            this.I.G2(N2);
            float F2 = this.I.F2(N2);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((lerp + 0.0f) + this.I.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                ViewGroup viewGroup3 = this.Q;
                float f21 = lerp + 0.0f;
                if (this.I.y3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = bd1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) F2)) - this.Q.getTop()) - bd1Var2.getTop());
            this.Q.setAlpha(this.f36939x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36939x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f36929b0) {
            this.J.setAlpha(this.f36939x);
            this.I.setAlpha(this.f36939x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - bd1Var2.getTop()));
            this.P.setAlpha(this.f36939x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f36939x);
            }
        }
        TextView textView = this.f36934f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f36939x);
        org.telegram.ui.Components.pc0 pc0Var = this.h;
        pc0Var.setSelectedTab(positionAnimated);
        pc0Var.setAlpha(this.f36939x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bd1 bd1Var = this.f36928b;
        setContentView(bd1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        bd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(bd1Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.cn0.d(new f5(this, 28));
        this.N = true;
        b(true, null);
    }
}
