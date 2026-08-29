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
public final class iv0 extends Dialog {
    public float A;
    public final qg.b B;
    public final lg.a C;
    public MessageObject D;
    public boolean E;
    public gv0 F;
    public hv0 G;
    public org.telegram.ui.Cells.s1 H;
    public float I;
    public float J;
    public boolean K;
    public byte[] L;
    public org.telegram.ui.Components.fk0 M;
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
    public final Context f39341a;
    public pm f39342a0;
    public final org.telegram.ui.ActionBar.c6 f39343b;
    public ValueAnimator f39344b0;
    public final ev0 f39345c;
    public ValueAnimator f39346c0;
    public final ev0 d;
    public final ev0 f39347e;
    public final nh.g1 f39348f;
    public final TextView h;
    public final org.telegram.ui.Components.pb0 f39349n;
    public i0.b f39350r;
    public Bitmap f39351s;
    public BitmapShader v;
    public Paint f39352w;
    public Matrix f39353x;
    public float f39354y;

    public iv0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f39350r = i0.b.f8185e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        this.Y = false;
        this.f39341a = activity;
        this.f39343b = c6Var;
        ev0 ev0Var = new ev0(this, activity, 0);
        this.f39345c = ev0Var;
        ev0Var.setOnClickListener(new t50(this, 23));
        qg.b bVar = new qg.b();
        this.B = bVar;
        lg.a aVar = new lg.a(bVar);
        this.C = aVar;
        aVar.d = new sg.i(ev0Var);
        aVar.f15224e = ev0Var;
        ev0 ev0Var2 = new ev0(this, activity, 1);
        this.d = ev0Var2;
        ev0Var2.setClipToPadding(false);
        ev0Var.addView(ev0Var2, i7.f6.e(-1, -1, 119));
        nh.g1 g1Var = new nh.g1(this, activity, 4);
        this.f39348f = g1Var;
        g1Var.setAdapter(new eg.v(this, activity, 2));
        ev0Var2.addView(g1Var, i7.f6.e(-1, -1, 119));
        ev0 ev0Var3 = new ev0(this, activity, 2);
        this.f39347e = ev0Var3;
        ev0Var2.addView(ev0Var3, i7.f6.e(-1, -1, 119));
        org.telegram.ui.Components.pb0 pb0Var = new org.telegram.ui.Components.pb0(activity, c6Var);
        this.f39349n = pb0Var;
        pb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        pb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        ev0Var2.addView(pb0Var, i7.f6.e(-1, 66, 80));
        pb0Var.setOnTabClick(new x3(g1Var, 14));
        ng.d c3 = aVar.c(pb0Var, null, false);
        c3.n(pg.a.j(c6Var));
        c3.h.f17329e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        pb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(pb0Var.getColor());
        b.i(R.string.PollMenuHint, textView, 17);
        ev0Var2.addView(textView, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        fv0 fv0Var = new fv0(this, 0);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(ev0Var, fv0Var);
    }

    public final void b(boolean z10, wu0 wu0Var) {
        float f9;
        long j10;
        ValueAnimator valueAnimator = this.f39344b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39346c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f39354y;
        float f11 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f39344b0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final iv0 f44655b;

            {
                this.f44655b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        iv0 iv0Var = this.f44655b;
                        iv0Var.f39354y = floatValue;
                        iv0Var.f39345c.invalidate();
                        iv0Var.d.invalidate();
                        gv0 gv0Var = iv0Var.F;
                        if (gv0Var != null) {
                            gv0Var.invalidate();
                        }
                        iv0Var.e();
                        return;
                    default:
                        iv0 iv0Var2 = this.f44655b;
                        iv0Var2.getClass();
                        iv0Var2.A = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39344b0.addListener(new androidx.fragment.app.g(this, z10, wu0Var, 11));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f39344b0;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        valueAnimator3.setInterpolator(jrVar);
        this.f39344b0.setDuration(j10);
        this.f39344b0.start();
        float f12 = this.A;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f39346c0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final iv0 f44655b;

            {
                this.f44655b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        iv0 iv0Var = this.f44655b;
                        iv0Var.f39354y = floatValue;
                        iv0Var.f39345c.invalidate();
                        iv0Var.d.invalidate();
                        gv0 gv0Var = iv0Var.F;
                        if (gv0Var != null) {
                            gv0Var.invalidate();
                        }
                        iv0Var.e();
                        return;
                    default:
                        iv0 iv0Var2 = this.f44655b;
                        iv0Var2.getClass();
                        iv0Var2.A = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39346c0.addListener(new p60(4, this, z10));
        this.f39346c0.setDuration(((float) j10) * 1.5f);
        this.f39346c0.setInterpolator(jrVar);
        this.f39346c0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.fk0 fk0Var;
        if (z10 && (fk0Var = this.M) != null && fk0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().f13695q) {
            this.M.e();
        } else if (this.Y) {
        } else {
            this.Y = true;
            this.U = false;
            nh.g1 g1Var = this.f39348f;
            g1Var.l();
            if (g1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
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
            b(false, new wu0(this, z11));
            this.f39345c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.U) {
            ev0 ev0Var = this.f39345c;
            if (ev0Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.H;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f39350r;
                    this.S = i11 - bVar.f8186a;
                    float f9 = iArr[1] - bVar.f8187b;
                    this.T = f9;
                    if (!this.X) {
                        this.X = true;
                        this.V = f9;
                        if (this.P != null) {
                            float height = f9 + this.H.getHeight() + this.P.getHeight();
                            int height2 = ev0Var.getHeight();
                            i0.b bVar2 = this.f39350r;
                            if (height > ((height2 - bVar2.f8187b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = ev0Var.getHeight();
                                i0.b bVar3 = this.f39350r;
                                this.V = ((((height3 - bVar3.f8187b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                            }
                        }
                        int I2 = this.F.I2(this.L);
                        this.F.H2(I2);
                        float G2 = this.F.G2(I2);
                        float f10 = this.T;
                        this.W = f10;
                        float f11 = (int) G2;
                        int height4 = ev0Var.getHeight();
                        i0.b bVar4 = this.f39350r;
                        int dp = ((height4 - bVar4.f8187b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = ev0Var.getHeight();
                            i0.b bVar5 = this.f39350r;
                            this.W = ((((height5 - bVar5.f8187b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.N != null) {
                            float height6 = this.W + f11 + viewGroup.getHeight();
                            int height7 = ev0Var.getHeight();
                            i0.b bVar6 = this.f39350r;
                            if (height6 > (((height7 - bVar6.f8187b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = ev0Var.getHeight();
                                i0.b bVar7 = this.f39350r;
                                this.W = (((((height8 - bVar7.f8187b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.N.getHeight();
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
        }
    }

    @Override
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        float f9;
        float f10;
        float f11;
        float f12;
        int i10;
        nh.g1 g1Var = this.f39348f;
        float positionAnimated = g1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -g1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(g1Var.getWidth(), 0, positionAnimated);
        if (this.U) {
            ViewGroup viewGroup = this.P;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.T;
                this.V = f13;
                float height = f13 + this.H.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ev0 ev0Var = this.f39345c;
                int height2 = ev0Var.getHeight();
                i0.b bVar = this.f39350r;
                if (height > ((height2 - bVar.f8187b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ev0Var.getHeight();
                    i0.b bVar2 = this.f39350r;
                    this.V = ((((height3 - bVar2.f8187b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        hv0 hv0Var = this.G;
        float f14 = this.S;
        if (this.Z) {
            f9 = 1.0f;
        } else {
            f9 = this.f39354y;
        }
        hv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f9) + lerp2);
        hv0 hv0Var2 = this.G;
        float f15 = this.T;
        float f16 = this.V;
        if (this.Z) {
            f10 = 1.0f;
        } else {
            f10 = this.f39354y;
        }
        hv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.P;
        ev0 ev0Var2 = this.f39347e;
        if (viewGroup2 != null) {
            if (this.E) {
                viewGroup2.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.P.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.G.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.G.getLeft()) - this.P.getLeft());
            }
            this.Q = ev0Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - ev0Var2.getTop());
            this.P.setAlpha(this.f39354y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39354y);
            this.P.setScaleX(lerp3);
            this.P.setScaleY(lerp3);
        }
        gv0 gv0Var = this.F;
        float f18 = this.S;
        if (this.Z) {
            f11 = 1.0f;
        } else {
            f11 = this.f39354y;
        }
        gv0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        gv0 gv0Var2 = this.F;
        float f19 = this.T;
        float f20 = this.W;
        if (this.Z) {
            f12 = 1.0f;
        } else {
            f12 = this.f39354y;
        }
        gv0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.N != null) {
            int I2 = this.F.I2(this.L);
            this.F.H2(I2);
            float G2 = this.F.G2(I2);
            if (this.E) {
                this.N.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.N.getLeft());
            } else {
                ViewGroup viewGroup3 = this.N;
                float f21 = lerp + 0.0f;
                if (this.F.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.F.getLeft()) - this.N.getLeft());
            }
            this.O = ev0Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) G2)) - this.N.getTop()) - ev0Var2.getTop());
            this.N.setAlpha(this.f39354y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39354y);
            this.N.setScaleX(lerp4);
            this.N.setScaleY(lerp4);
        }
        if (this.Z) {
            this.G.setAlpha(this.f39354y);
            this.F.setAlpha(this.f39354y);
        }
        if (this.M != null) {
            float max = lerp2 + Math.max(0.0f, ((this.G.getBoundsLeft() + this.G.getBoundsRight()) / 2.0f) - (this.M.getWidth() * 0.8f));
            this.M.setTranslationX(max);
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - ev0Var2.getTop()));
            this.M.setAlpha(this.f39354y);
            View windowView = this.M.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f39354y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f39354y);
        org.telegram.ui.Components.pb0 pb0Var = this.f39349n;
        pb0Var.setSelectedTab(positionAnimated);
        pb0Var.setAlpha(this.f39354y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ev0 ev0Var = this.f39345c;
        setContentView(ev0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        ev0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ev0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.yl0.d(new b5(this, 15));
        this.K = true;
        b(true, null);
    }
}
