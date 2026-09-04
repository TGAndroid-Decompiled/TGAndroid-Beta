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
public final class lw0 extends Dialog {
    public float E;
    public final gh.b F;
    public final bh.b G;
    public MessageObject H;
    public boolean I;
    public jw0 J;
    public kw0 K;
    public org.telegram.ui.Cells.t1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.fk0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f38490a;
    public float f38491a0;
    public final org.telegram.ui.ActionBar.f6 f38492b;
    public boolean f38493b0;
    public final gw0 f38494c;
    public boolean f38495c0;
    public final gw0 d;
    public boolean f38496d0;
    public final gw0 f38497e;
    public zm f38498e0;
    public final di.i1 f38499f;
    public ValueAnimator f38500f0;
    public ValueAnimator f38501g0;
    public final TextView h;
    public final org.telegram.ui.Components.ub0 f38502n;
    public i0.c f38503r;
    public Bitmap f38504s;
    public BitmapShader v;
    public Paint f38505w;
    public Matrix f38506x;
    public float f38507y;

    public lw0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f38503r = i0.c.f11424e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f38495c0 = false;
        this.f38490a = activity;
        this.f38492b = f6Var;
        gw0 gw0Var = new gw0(this, activity, 0);
        this.f38494c = gw0Var;
        gw0Var.setOnClickListener(new l60(this, 22));
        gh.b bVar = new gh.b();
        this.F = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.G = bVar2;
        bVar2.d = new ih.k(gw0Var);
        bVar2.f2653e = gw0Var;
        gw0 gw0Var2 = new gw0(this, activity, 1);
        this.d = gw0Var2;
        gw0Var2.setClipToPadding(false);
        gw0Var.addView(gw0Var2, w7.x5.e(-1, -1, 119));
        di.i1 i1Var = new di.i1(this, activity, 5);
        this.f38499f = i1Var;
        i1Var.setAdapter(new hw0(this, activity, 0));
        gw0Var2.addView(i1Var, w7.x5.e(-1, -1, 119));
        gw0 gw0Var3 = new gw0(this, activity, 2);
        this.f38497e = gw0Var3;
        gw0Var2.addView(gw0Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.ub0 ub0Var = new org.telegram.ui.Components.ub0(activity, f6Var);
        this.f38502n = ub0Var;
        ub0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        ub0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        gw0Var2.addView(ub0Var, w7.x5.e(-1, 66, 80));
        ub0Var.setOnTabClick(new t3(i1Var, 14));
        dh.d c10 = bVar2.c(ub0Var, null, false);
        c10.n(fh.b.k(f6Var));
        c10.h.f6821e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ub0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ub0Var.getColor());
        org.telegram.messenger.wl.k(R.string.PollMenuHint, textView, 17);
        gw0Var2.addView(textView, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        iw0 iw0Var = new iw0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(gw0Var, iw0Var);
    }

    public final void b(boolean z10, aw0 aw0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f38500f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f38501g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f38507y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38500f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final lw0 f34938b;

            {
                this.f34938b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        lw0 lw0Var = this.f34938b;
                        lw0Var.f38507y = floatValue;
                        lw0Var.f38494c.invalidate();
                        lw0Var.d.invalidate();
                        jw0 jw0Var = lw0Var.J;
                        if (jw0Var != null) {
                            jw0Var.invalidate();
                        }
                        lw0Var.e();
                        return;
                    default:
                        lw0 lw0Var2 = this.f34938b;
                        lw0Var2.getClass();
                        lw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f38500f0.addListener(new ah.r0(this, z10, aw0Var, 10));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f38500f0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f38500f0.setDuration(j3);
        this.f38500f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f38501g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final lw0 f34938b;

            {
                this.f34938b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        lw0 lw0Var = this.f34938b;
                        lw0Var.f38507y = floatValue;
                        lw0Var.f38494c.invalidate();
                        lw0Var.d.invalidate();
                        jw0 jw0Var = lw0Var.J;
                        if (jw0Var != null) {
                            jw0Var.invalidate();
                        }
                        lw0Var.e();
                        return;
                    default:
                        lw0 lw0Var2 = this.f34938b;
                        lw0Var2.getClass();
                        lw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f38501g0.addListener(new e50(5, this, z10));
        this.f38501g0.setDuration(((float) j3) * 1.5f);
        this.f38501g0.setInterpolator(prVar);
        this.f38501g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.fk0 fk0Var;
        if (z10 && (fk0Var = this.Q) != null && fk0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f699q) {
            this.Q.e();
        } else if (this.f38495c0) {
        } else {
            this.f38495c0 = true;
            this.Y = false;
            di.i1 i1Var = this.f38499f;
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
            this.f38496d0 = !z10;
            d();
            b(false, new aw0(this, z11));
            this.f38494c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            gw0 gw0Var = this.f38494c;
            if (gw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.L;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.c cVar = this.f38503r;
                    this.W = i11 - cVar.f11425a;
                    float f7 = iArr[1] - cVar.f11426b;
                    this.X = f7;
                    if (!this.f38493b0) {
                        this.f38493b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = gw0Var.getHeight();
                            i0.c cVar2 = this.f38503r;
                            if (height > ((height2 - cVar2.f11426b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = gw0Var.getHeight();
                                i0.c cVar3 = this.f38503r;
                                this.Z = ((((height3 - cVar3.f11426b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f38491a0 = f10;
                        float f11 = (int) G2;
                        int height4 = gw0Var.getHeight();
                        i0.c cVar4 = this.f38503r;
                        int dp = ((height4 - cVar4.f11426b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = gw0Var.getHeight();
                            i0.c cVar5 = this.f38503r;
                            this.f38491a0 = ((((height5 - cVar5.f11426b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f38491a0 + f11 + viewGroup.getHeight();
                            int height7 = gw0Var.getHeight();
                            i0.c cVar6 = this.f38503r;
                            if (height6 > (((height7 - cVar6.f11426b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = gw0Var.getHeight();
                                i0.c cVar7 = this.f38503r;
                                this.f38491a0 = (((((height8 - cVar7.f11426b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        di.i1 i1Var = this.f38499f;
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
                gw0 gw0Var = this.f38494c;
                int height2 = gw0Var.getHeight();
                i0.c cVar = this.f38503r;
                if (height > ((height2 - cVar.f11426b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = gw0Var.getHeight();
                    i0.c cVar2 = this.f38503r;
                    this.Z = ((((height3 - cVar2.f11426b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        kw0 kw0Var = this.K;
        float f14 = this.W;
        if (this.f38496d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f38507y;
        }
        kw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        kw0 kw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f38496d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f38507y;
        }
        kw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        gw0 gw0Var2 = this.f38497e;
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
            this.U = gw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - gw0Var2.getTop());
            this.T.setAlpha(this.f38507y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f38507y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        jw0 jw0Var = this.J;
        float f18 = this.W;
        if (this.f38496d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f38507y;
        }
        jw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        jw0 jw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f38491a0;
        if (this.f38496d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f38507y;
        }
        jw0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.S = gw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - gw0Var2.getTop());
            this.R.setAlpha(this.f38507y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f38507y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f38496d0) {
            this.K.setAlpha(this.f38507y);
            this.J.setAlpha(this.f38507y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - gw0Var2.getTop()));
            this.Q.setAlpha(this.f38507y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f38507y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f38507y);
        org.telegram.ui.Components.ub0 ub0Var = this.f38502n;
        ub0Var.setSelectedTab(positionAnimated);
        ub0Var.setAlpha(this.f38507y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        gw0 gw0Var = this.f38494c;
        setContentView(gw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        gw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(gw0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.am0.d(new b5(this, 15));
        this.O = true;
        b(true, null);
    }
}
