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
public final class fw0 extends Dialog {
    public float E;
    public final fh.b F;
    public final ah.c G;
    public MessageObject H;
    public boolean I;
    public dw0 J;
    public ew0 K;
    public org.telegram.ui.Cells.t1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.gk0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f33371a;
    public float f33372a0;
    public final org.telegram.ui.ActionBar.d6 f33373b;
    public boolean f33374b0;
    public final aw0 f33375c;
    public boolean f33376c0;
    public final aw0 d;
    public boolean f33377d0;
    public final aw0 e;
    public um f33378e0;
    public final ci.i1 f33379f;
    public ValueAnimator f33380f0;
    public ValueAnimator f33381g0;
    public final TextView h;
    public final org.telegram.ui.Components.sb0 f33382n;
    public i0.b f33383r;
    public Bitmap f33384s;
    public BitmapShader v;
    public Paint f33385w;
    public Matrix f33386x;
    public float f33387y;

    public fw0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, R.style.TransparentDialog);
        this.f33383r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f33376c0 = false;
        this.f33371a = activity;
        this.f33373b = d6Var;
        aw0 aw0Var = new aw0(this, activity, 0);
        this.f33375c = aw0Var;
        aw0Var.setOnClickListener(new h60(this, 22));
        fh.b bVar = new fh.b();
        this.F = bVar;
        ah.c cVar = new ah.c(bVar);
        this.G = cVar;
        cVar.f425f = new hh.k(aw0Var);
        cVar.f426g = aw0Var;
        aw0 aw0Var2 = new aw0(this, activity, 1);
        this.d = aw0Var2;
        aw0Var2.setClipToPadding(false);
        aw0Var.addView(aw0Var2, w7.x5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 5);
        this.f33379f = i1Var;
        i1Var.setAdapter(new bw0(this, activity, 0));
        aw0Var2.addView(i1Var, w7.x5.e(-1, -1, 119));
        aw0 aw0Var3 = new aw0(this, activity, 2);
        this.e = aw0Var3;
        aw0Var2.addView(aw0Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(activity, d6Var);
        this.f33382n = sb0Var;
        sb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        sb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        aw0Var2.addView(sb0Var, w7.x5.e(-1, 66, 80));
        sb0Var.setOnTabClick(new t3(i1Var, 17));
        ch.d c10 = cVar.c(sb0Var, null, false);
        c10.o(eh.b.k(d6Var));
        c10.f4280j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        sb0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(sb0Var.getColor());
        org.telegram.messenger.ul.l(R.string.PollMenuHint, textView, 17);
        aw0Var2.addView(textView, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        cw0 cw0Var = new cw0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(aw0Var, cw0Var);
    }

    public final void b(boolean z10, uv0 uv0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f33380f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f33381g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f33387y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f33380f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final fw0 f38485b;

            {
                this.f38485b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        fw0 fw0Var = this.f38485b;
                        fw0Var.f33387y = floatValue;
                        fw0Var.f33375c.invalidate();
                        fw0Var.d.invalidate();
                        dw0 dw0Var = fw0Var.J;
                        if (dw0Var != null) {
                            dw0Var.invalidate();
                        }
                        fw0Var.e();
                        return;
                    default:
                        fw0 fw0Var2 = this.f38485b;
                        fw0Var2.getClass();
                        fw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f33380f0.addListener(new androidx.fragment.app.g(this, z10, uv0Var, 9));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f33380f0;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        valueAnimator3.setInterpolator(rrVar);
        this.f33380f0.setDuration(j3);
        this.f33380f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f33381g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final fw0 f38485b;

            {
                this.f38485b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        fw0 fw0Var = this.f38485b;
                        fw0Var.f33387y = floatValue;
                        fw0Var.f33375c.invalidate();
                        fw0Var.d.invalidate();
                        dw0 dw0Var = fw0Var.J;
                        if (dw0Var != null) {
                            dw0Var.invalidate();
                        }
                        fw0Var.e();
                        return;
                    default:
                        fw0 fw0Var2 = this.f38485b;
                        fw0Var2.getClass();
                        fw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f33381g0.addListener(new e70(4, this, z10));
        this.f33381g0.setDuration(((float) j3) * 1.5f);
        this.f33381g0.setInterpolator(rrVar);
        this.f33381g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.gk0 gk0Var;
        if (z10 && (gk0Var = this.Q) != null && gk0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f48940q) {
            this.Q.e();
        } else if (this.f33376c0) {
        } else {
            this.f33376c0 = true;
            this.Y = false;
            ci.i1 i1Var = this.f33379f;
            i1Var.l();
            if (i1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.t1 t1Var2 = this.L;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (t1Var = this.L) != null) {
                t1Var.setVisibility(0);
                org.telegram.ui.Cells.t1 t1Var3 = this.L;
                t1Var3.L7 = null;
                t1Var3.invalidate();
            }
            this.f33377d0 = !z10;
            d();
            b(false, new uv0(this, z11));
            this.f33375c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            aw0 aw0Var = this.f33375c;
            if (aw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.L;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f33383r;
                    this.W = i11 - bVar.f10576a;
                    float f7 = iArr[1] - bVar.f10577b;
                    this.X = f7;
                    if (!this.f33374b0) {
                        this.f33374b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = aw0Var.getHeight();
                            i0.b bVar2 = this.f33383r;
                            if (height > ((height2 - bVar2.f10577b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = aw0Var.getHeight();
                                i0.b bVar3 = this.f33383r;
                                this.Z = ((((height3 - bVar3.f10577b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f33372a0 = f10;
                        float f11 = (int) G2;
                        int height4 = aw0Var.getHeight();
                        i0.b bVar4 = this.f33383r;
                        int dp = ((height4 - bVar4.f10577b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = aw0Var.getHeight();
                            i0.b bVar5 = this.f33383r;
                            this.f33372a0 = ((((height5 - bVar5.f10577b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f33372a0 + f11 + viewGroup.getHeight();
                            int height7 = aw0Var.getHeight();
                            i0.b bVar6 = this.f33383r;
                            if (height6 > (((height7 - bVar6.f10577b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = aw0Var.getHeight();
                                i0.b bVar7 = this.f33383r;
                                this.f33372a0 = (((((height8 - bVar7.f10577b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        ci.i1 i1Var = this.f33379f;
        float positionAnimated = i1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -i1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(i1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.X;
                this.Z = f13;
                float height = f13 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                aw0 aw0Var = this.f33375c;
                int height2 = aw0Var.getHeight();
                i0.b bVar = this.f33383r;
                if (height > ((height2 - bVar.f10577b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = aw0Var.getHeight();
                    i0.b bVar2 = this.f33383r;
                    this.Z = ((((height3 - bVar2.f10577b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        ew0 ew0Var = this.K;
        float f14 = this.W;
        if (this.f33377d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f33387y;
        }
        ew0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        ew0 ew0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f33377d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f33387y;
        }
        ew0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        aw0 aw0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.K.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = aw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - aw0Var2.getTop());
            this.T.setAlpha(this.f33387y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f33387y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        dw0 dw0Var = this.J;
        float f18 = this.W;
        if (this.f33377d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f33387y;
        }
        dw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        dw0 dw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f33372a0;
        if (this.f33377d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f33387y;
        }
        dw0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.R != null) {
            int I2 = this.J.I2(this.P);
            this.J.H2(I2);
            float G2 = this.J.G2(I2);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f21 = lerp + 0.0f;
                if (this.J.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = aw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - aw0Var2.getTop());
            this.R.setAlpha(this.f33387y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f33387y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f33377d0) {
            this.K.setAlpha(this.f33387y);
            this.J.setAlpha(this.f33387y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - aw0Var2.getTop()));
            this.Q.setAlpha(this.f33387y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f33387y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f33387y);
        org.telegram.ui.Components.sb0 sb0Var = this.f33382n;
        sb0Var.setSelectedTab(positionAnimated);
        sb0Var.setAlpha(this.f33387y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        aw0 aw0Var = this.f33375c;
        setContentView(aw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        aw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(aw0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.bm0.d(new c5(this, 15));
        this.O = true;
        b(true, null);
    }
}
