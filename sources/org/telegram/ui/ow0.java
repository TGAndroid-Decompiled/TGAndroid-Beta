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
    public final eh.b F;
    public final zg.a G;
    public MessageObject H;
    public boolean I;
    public mw0 J;
    public nw0 K;
    public org.telegram.ui.Cells.t1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.pk0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f35623a;
    public float f35624a0;
    public final org.telegram.ui.ActionBar.f6 f35625b;
    public boolean f35626b0;
    public final jw0 f35627c;
    public boolean f35628c0;
    public final jw0 d;
    public boolean f35629d0;
    public final jw0 e;
    public an f35630e0;
    public final bi.p1 f35631f;
    public ValueAnimator f35632f0;
    public ValueAnimator f35633g0;
    public final TextView h;
    public final org.telegram.ui.Components.cc0 f35634n;
    public i0.c f35635r;
    public Bitmap f35636s;
    public BitmapShader v;
    public Paint f35637w;
    public Matrix f35638x;
    public float f35639y;

    public ow0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f35635r = i0.c.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f35628c0 = false;
        this.f35623a = activity;
        this.f35625b = f6Var;
        jw0 jw0Var = new jw0(this, activity, 0);
        this.f35627c = jw0Var;
        jw0Var.setOnClickListener(new l60(this, 22));
        eh.b bVar = new eh.b();
        this.F = bVar;
        zg.a aVar = new zg.a(bVar);
        this.G = aVar;
        aVar.d = new gh.k(jw0Var);
        aVar.e = jw0Var;
        jw0 jw0Var2 = new jw0(this, activity, 1);
        this.d = jw0Var2;
        jw0Var2.setClipToPadding(false);
        jw0Var.addView(jw0Var2, w7.a6.e(-1, -1, 119));
        bi.p1 p1Var = new bi.p1(this, activity, 5);
        this.f35631f = p1Var;
        p1Var.setAdapter(new kw0(this, activity, 0));
        jw0Var2.addView(p1Var, w7.a6.e(-1, -1, 119));
        jw0 jw0Var3 = new jw0(this, activity, 2);
        this.e = jw0Var3;
        jw0Var2.addView(jw0Var3, w7.a6.e(-1, -1, 119));
        org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(activity, f6Var);
        this.f35634n = cc0Var;
        cc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        cc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        jw0Var2.addView(cc0Var, w7.a6.e(-1, 66, 80));
        cc0Var.setOnTabClick(new u3(p1Var, 14));
        bh.d c10 = aVar.c(cc0Var, null, false);
        c10.n(dh.c.k(f6Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        cc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(cc0Var.getColor());
        org.telegram.messenger.em.k(R.string.PollMenuHint, textView, 17);
        jw0Var2.addView(textView, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        lw0 lw0Var = new lw0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(jw0Var, lw0Var);
    }

    public final void b(boolean z10, cw0 cw0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35632f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35633g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35639y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35632f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ow0 f31987b;

            {
                this.f31987b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.f31987b;
                        ow0Var.f35639y = floatValue;
                        ow0Var.f35627c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        return;
                    default:
                        ow0 ow0Var2 = this.f31987b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35632f0.addListener(new androidx.fragment.app.g(this, z10, cw0Var, 9));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35632f0;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        valueAnimator3.setInterpolator(wrVar);
        this.f35632f0.setDuration(j3);
        this.f35632f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35633g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ow0 f31987b;

            {
                this.f31987b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ow0 ow0Var = this.f31987b;
                        ow0Var.f35639y = floatValue;
                        ow0Var.f35627c.invalidate();
                        ow0Var.d.invalidate();
                        mw0 mw0Var = ow0Var.J;
                        if (mw0Var != null) {
                            mw0Var.invalidate();
                        }
                        ow0Var.e();
                        return;
                    default:
                        ow0 ow0Var2 = this.f31987b;
                        ow0Var2.getClass();
                        ow0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35633g0.addListener(new iw0(0, this, z10));
        this.f35633g0.setDuration(((float) j3) * 1.5f);
        this.f35633g0.setInterpolator(wrVar);
        this.f35633g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z10 && (pk0Var = this.Q) != null && pk0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f46963q) {
            this.Q.e();
        } else if (this.f35628c0) {
        } else {
            this.f35628c0 = true;
            this.Y = false;
            bi.p1 p1Var = this.f35631f;
            p1Var.l();
            if (p1Var.getCurrentPosition() == 1) {
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
            this.f35629d0 = !z10;
            d();
            b(false, new cw0(this, z11));
            this.f35627c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            jw0 jw0Var = this.f35627c;
            if (jw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.L;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.c cVar = this.f35635r;
                    this.W = i11 - cVar.f10074a;
                    float f7 = iArr[1] - cVar.f10075b;
                    this.X = f7;
                    if (!this.f35626b0) {
                        this.f35626b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = jw0Var.getHeight();
                            i0.c cVar2 = this.f35635r;
                            if (height > ((height2 - cVar2.f10075b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = jw0Var.getHeight();
                                i0.c cVar3 = this.f35635r;
                                this.Z = ((((height3 - cVar3.f10075b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f35624a0 = f10;
                        float f11 = (int) G2;
                        int height4 = jw0Var.getHeight();
                        i0.c cVar4 = this.f35635r;
                        int dp = ((height4 - cVar4.f10075b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = jw0Var.getHeight();
                            i0.c cVar5 = this.f35635r;
                            this.f35624a0 = ((((height5 - cVar5.f10075b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f35624a0 + f11 + viewGroup.getHeight();
                            int height7 = jw0Var.getHeight();
                            i0.c cVar6 = this.f35635r;
                            if (height6 > (((height7 - cVar6.f10075b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = jw0Var.getHeight();
                                i0.c cVar7 = this.f35635r;
                                this.f35624a0 = (((((height8 - cVar7.f10075b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        bi.p1 p1Var = this.f35631f;
        float positionAnimated = p1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -p1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(p1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.X;
                this.Z = f13;
                float height = f13 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                jw0 jw0Var = this.f35627c;
                int height2 = jw0Var.getHeight();
                i0.c cVar = this.f35635r;
                if (height > ((height2 - cVar.f10075b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = jw0Var.getHeight();
                    i0.c cVar2 = this.f35635r;
                    this.Z = ((((height3 - cVar2.f10075b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        nw0 nw0Var = this.K;
        float f14 = this.W;
        if (this.f35629d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f35639y;
        }
        nw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        nw0 nw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f35629d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f35639y;
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
            this.T.setAlpha(this.f35639y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35639y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        mw0 mw0Var = this.J;
        float f18 = this.W;
        if (this.f35629d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f35639y;
        }
        mw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        mw0 mw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f35624a0;
        if (this.f35629d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f35639y;
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
            this.R.setAlpha(this.f35639y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35639y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f35629d0) {
            this.K.setAlpha(this.f35639y);
            this.J.setAlpha(this.f35639y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - jw0Var2.getTop()));
            this.Q.setAlpha(this.f35639y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f35639y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f35639y);
        org.telegram.ui.Components.cc0 cc0Var = this.f35634n;
        cc0Var.setSelectedTab(positionAnimated);
        cc0Var.setAlpha(this.f35639y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jw0 jw0Var = this.f35627c;
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
        org.telegram.ui.Components.km0.d(new b5(this, 15));
        this.O = true;
        b(true, null);
    }
}
