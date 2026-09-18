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
public final class ow0 extends Dialog {
    public float E;
    public final fh.b F;
    public final ah.c G;
    public MessageObject H;
    public boolean I;
    public mw0 J;
    public nw0 K;
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
    public final Context f36440a;
    public float f36441a0;
    public final org.telegram.ui.ActionBar.f6 f36442b;
    public boolean f36443b0;
    public final jw0 f36444c;
    public boolean f36445c0;
    public final jw0 d;
    public boolean f36446d0;
    public final jw0 e;
    public ym f36447e0;
    public final ci.i1 f36448f;
    public ValueAnimator f36449f0;
    public ValueAnimator f36450g0;
    public final TextView h;
    public final org.telegram.ui.Components.tb0 f36451n;
    public i0.b f36452r;
    public Bitmap f36453s;
    public BitmapShader v;
    public Paint f36454w;
    public Matrix f36455x;
    public float f36456y;

    public ow0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f36452r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f36445c0 = false;
        this.f36440a = activity;
        this.f36442b = f6Var;
        jw0 jw0Var = new jw0(this, activity, 0);
        this.f36444c = jw0Var;
        jw0Var.setOnClickListener(new m60(this, 22));
        fh.b bVar = new fh.b();
        this.F = bVar;
        ah.c cVar = new ah.c(bVar);
        this.G = cVar;
        cVar.f425f = new hh.k(jw0Var);
        cVar.f426g = jw0Var;
        jw0 jw0Var2 = new jw0(this, activity, 1);
        this.d = jw0Var2;
        jw0Var2.setClipToPadding(false);
        jw0Var.addView(jw0Var2, w7.x5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 5);
        this.f36448f = i1Var;
        i1Var.setAdapter(new kw0(this, activity, 0));
        jw0Var2.addView(i1Var, w7.x5.e(-1, -1, 119));
        jw0 jw0Var3 = new jw0(this, activity, 2);
        this.e = jw0Var3;
        jw0Var2.addView(jw0Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(activity, f6Var);
        this.f36451n = tb0Var;
        tb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        tb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        jw0Var2.addView(tb0Var, w7.x5.e(-1, 66, 80));
        tb0Var.setOnTabClick(new s3(i1Var, 14));
        ch.d c10 = cVar.c(tb0Var, null, false);
        c10.o(eh.b.k(f6Var));
        c10.f4288j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tb0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tb0Var.getColor());
        org.telegram.messenger.wl.k(R.string.PollMenuHint, textView, 17);
        jw0Var2.addView(textView, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        lw0 lw0Var = new lw0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41870a;
        r0.a0.j(jw0Var, lw0Var);
    }

    public final void b(boolean z10, dw0 dw0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f36449f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f36450g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f36456y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36449f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ow0 f33490b;

            {
                this.f33490b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.f33490b;
                        ow0Var.f36456y = floatValue;
                        ow0Var.f36444c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        return;
                    default:
                        ow0 ow0Var2 = this.f33490b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36449f0.addListener(new androidx.fragment.app.g(this, z10, dw0Var, 9));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f36449f0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.f36449f0.setDuration(j3);
        this.f36449f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f36450g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ow0 f33490b;

            {
                this.f33490b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.f33490b;
                        ow0Var.f36456y = floatValue;
                        ow0Var.f36444c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        return;
                    default:
                        ow0 ow0Var2 = this.f33490b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36450g0.addListener(new j70(4, this, z10));
        this.f36450g0.setDuration(((float) j3) * 1.5f);
        this.f36450g0.setInterpolator(qrVar);
        this.f36450g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.gk0 gk0Var;
        if (z10 && (gk0Var = this.Q) != null && gk0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f49024q) {
            this.Q.e();
        } else if (this.f36445c0) {
        } else {
            this.f36445c0 = true;
            this.Y = false;
            ci.i1 i1Var = this.f36448f;
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
            this.f36446d0 = !z10;
            d();
            b(false, new dw0(this, z11));
            this.f36444c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            jw0 jw0Var = this.f36444c;
            if (jw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.L;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f36452r;
                    this.W = i11 - bVar.f10591a;
                    float f7 = iArr[1] - bVar.f10592b;
                    this.X = f7;
                    if (!this.f36443b0) {
                        this.f36443b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = jw0Var.getHeight();
                            i0.b bVar2 = this.f36452r;
                            if (height > ((height2 - bVar2.f10592b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = jw0Var.getHeight();
                                i0.b bVar3 = this.f36452r;
                                this.Z = ((((height3 - bVar3.f10592b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f36441a0 = f10;
                        float f11 = (int) G2;
                        int height4 = jw0Var.getHeight();
                        i0.b bVar4 = this.f36452r;
                        int dp = ((height4 - bVar4.f10592b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = jw0Var.getHeight();
                            i0.b bVar5 = this.f36452r;
                            this.f36441a0 = ((((height5 - bVar5.f10592b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f36441a0 + f11 + viewGroup.getHeight();
                            int height7 = jw0Var.getHeight();
                            i0.b bVar6 = this.f36452r;
                            if (height6 > (((height7 - bVar6.f10592b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = jw0Var.getHeight();
                                i0.b bVar7 = this.f36452r;
                                this.f36441a0 = (((((height8 - bVar7.f10592b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        ci.i1 i1Var = this.f36448f;
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
                jw0 jw0Var = this.f36444c;
                int height2 = jw0Var.getHeight();
                i0.b bVar = this.f36452r;
                if (height > ((height2 - bVar.f10592b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = jw0Var.getHeight();
                    i0.b bVar2 = this.f36452r;
                    this.Z = ((((height3 - bVar2.f10592b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        nw0 nw0Var = this.K;
        float f14 = this.W;
        if (this.f36446d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f36456y;
        }
        nw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        nw0 nw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f36446d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f36456y;
        }
        nw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        jw0 jw0Var2 = this.e;
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
            this.U = jw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - jw0Var2.getTop());
            this.T.setAlpha(this.f36456y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36456y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        mw0 mw0Var = this.J;
        float f18 = this.W;
        if (this.f36446d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f36456y;
        }
        mw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        mw0 mw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f36441a0;
        if (this.f36446d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f36456y;
        }
        mw0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.S = jw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - jw0Var2.getTop());
            this.R.setAlpha(this.f36456y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36456y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f36446d0) {
            this.K.setAlpha(this.f36456y);
            this.J.setAlpha(this.f36456y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - jw0Var2.getTop()));
            this.Q.setAlpha(this.f36456y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f36456y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f36456y);
        org.telegram.ui.Components.tb0 tb0Var = this.f36451n;
        tb0Var.setSelectedTab(positionAnimated);
        tb0Var.setAlpha(this.f36456y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jw0 jw0Var = this.f36444c;
        setContentView(jw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        jw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(jw0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.bm0.d(new b5(this, 15));
        this.O = true;
        b(true, null);
    }
}
