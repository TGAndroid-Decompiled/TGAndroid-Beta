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
    public org.telegram.ui.Cells.u1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.nl0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f40788a;
    public float f40789a0;
    public final org.telegram.ui.ActionBar.c6 f40790b;
    public boolean f40791b0;
    public final jw0 f40792c;
    public boolean f40793c0;
    public final jw0 d;
    public boolean f40794d0;
    public final jw0 f40795e;
    public an f40796e0;
    public final ci.h1 f40797f;
    public ValueAnimator f40798f0;
    public ValueAnimator f40799g0;
    public final TextView h;
    public final org.telegram.ui.Components.xc0 f40800n;
    public i0.b f40801r;
    public Bitmap f40802s;
    public BitmapShader v;
    public Paint f40803w;
    public Matrix f40804x;
    public float f40805y;

    public ow0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40801r = i0.b.f11573e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f40793c0 = false;
        this.f40788a = activity;
        this.f40790b = c6Var;
        jw0 jw0Var = new jw0(this, activity, 0);
        this.f40792c = jw0Var;
        jw0Var.setOnClickListener(new o60(this, 21));
        fh.b bVar = new fh.b();
        this.F = bVar;
        ah.c cVar = new ah.c(bVar);
        this.G = cVar;
        cVar.f547f = new hh.j(jw0Var);
        cVar.f548g = jw0Var;
        jw0 jw0Var2 = new jw0(this, activity, 1);
        this.d = jw0Var2;
        jw0Var2.setClipToPadding(false);
        jw0Var.addView(jw0Var2, w7.w5.e(-1, -1, 119));
        ci.h1 h1Var = new ci.h1(this, activity, 5);
        this.f40797f = h1Var;
        h1Var.setAdapter(new kw0(this, activity, 0));
        jw0Var2.addView(h1Var, w7.w5.e(-1, -1, 119));
        jw0 jw0Var3 = new jw0(this, activity, 2);
        this.f40795e = jw0Var3;
        jw0Var2.addView(jw0Var3, w7.w5.e(-1, -1, 119));
        org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(activity, c6Var);
        this.f40800n = xc0Var;
        xc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        xc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        jw0Var2.addView(xc0Var, w7.w5.e(-1, 66, 80));
        xc0Var.setOnTabClick(new t3(h1Var, 17));
        ch.d c10 = cVar.c(xc0Var, null, false);
        c10.o(eh.b.k(c6Var));
        c10.f4683j.f4666e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        xc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(xc0Var.getColor());
        org.telegram.messenger.am.m(R.string.PollMenuHint, textView, 17);
        jw0Var2.addView(textView, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        lw0 lw0Var = new lw0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.a0.i(jw0Var, lw0Var);
    }

    public final void b(boolean z10, dw0 dw0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f40798f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40799g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40805y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40798f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ow0 f37564b;

            {
                this.f37564b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.f37564b;
                        ow0Var.f40805y = floatValue;
                        ow0Var.f40792c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        return;
                    default:
                        ow0 ow0Var2 = this.f37564b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40798f0.addListener(new androidx.fragment.app.g(this, z10, dw0Var, 9));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40798f0;
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        valueAnimator3.setInterpolator(jsVar);
        this.f40798f0.setDuration(j3);
        this.f40798f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40799g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ow0 f37564b;

            {
                this.f37564b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.f37564b;
                        ow0Var.f40805y = floatValue;
                        ow0Var.f40792c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        return;
                    default:
                        ow0 ow0Var2 = this.f37564b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40799g0.addListener(new h70(4, this, z10));
        this.f40799g0.setDuration(((float) j3) * 1.5f);
        this.f40799g0.setInterpolator(jsVar);
        this.f40799g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.nl0 nl0Var;
        if (z10 && (nl0Var = this.Q) != null && nl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f54695q) {
            this.Q.e();
        } else if (this.f40793c0) {
        } else {
            this.f40793c0 = true;
            this.Y = false;
            ci.h1 h1Var = this.f40797f;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.u1 u1Var2 = this.L;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (u1Var = this.L) != null) {
                u1Var.setVisibility(0);
                org.telegram.ui.Cells.u1 u1Var3 = this.L;
                u1Var3.L7 = null;
                u1Var3.invalidate();
            }
            this.f40794d0 = !z10;
            d();
            b(false, new dw0(this, z11));
            this.f40792c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            jw0 jw0Var = this.f40792c;
            if (jw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.L;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40801r;
                    this.W = i11 - bVar.f11574a;
                    float f7 = iArr[1] - bVar.f11575b;
                    this.X = f7;
                    if (!this.f40791b0) {
                        this.f40791b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = jw0Var.getHeight();
                            i0.b bVar2 = this.f40801r;
                            if (height > ((height2 - bVar2.f11575b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = jw0Var.getHeight();
                                i0.b bVar3 = this.f40801r;
                                this.Z = ((((height3 - bVar3.f11575b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f40789a0 = f10;
                        float f11 = (int) G2;
                        int height4 = jw0Var.getHeight();
                        i0.b bVar4 = this.f40801r;
                        int dp = ((height4 - bVar4.f11575b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = jw0Var.getHeight();
                            i0.b bVar5 = this.f40801r;
                            this.f40789a0 = ((((height5 - bVar5.f11575b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f40789a0 + f11 + viewGroup.getHeight();
                            int height7 = jw0Var.getHeight();
                            i0.b bVar6 = this.f40801r;
                            if (height6 > (((height7 - bVar6.f11575b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = jw0Var.getHeight();
                                i0.b bVar7 = this.f40801r;
                                this.f40789a0 = (((((height8 - bVar7.f11575b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        ci.h1 h1Var = this.f40797f;
        float positionAnimated = h1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.X;
                this.Z = f13;
                float height = f13 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                jw0 jw0Var = this.f40792c;
                int height2 = jw0Var.getHeight();
                i0.b bVar = this.f40801r;
                if (height > ((height2 - bVar.f11575b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = jw0Var.getHeight();
                    i0.b bVar2 = this.f40801r;
                    this.Z = ((((height3 - bVar2.f11575b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        nw0 nw0Var = this.K;
        float f14 = this.W;
        if (this.f40794d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f40805y;
        }
        nw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        nw0 nw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f40794d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40805y;
        }
        nw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        jw0 jw0Var2 = this.f40795e;
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
            this.T.setAlpha(this.f40805y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40805y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        mw0 mw0Var = this.J;
        float f18 = this.W;
        if (this.f40794d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40805y;
        }
        mw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        mw0 mw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f40789a0;
        if (this.f40794d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40805y;
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
            this.R.setAlpha(this.f40805y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40805y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f40794d0) {
            this.K.setAlpha(this.f40805y);
            this.J.setAlpha(this.f40805y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - jw0Var2.getTop()));
            this.Q.setAlpha(this.f40805y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40805y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40805y);
        org.telegram.ui.Components.xc0 xc0Var = this.f40800n;
        xc0Var.setSelectedTab(positionAnimated);
        xc0Var.setAlpha(this.f40805y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jw0 jw0Var = this.f40792c;
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
        AndroidUtilities.setLightNavigationBar(jw0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.mn0.d(new e5(this, 15));
        this.O = true;
        b(true, null);
    }
}
