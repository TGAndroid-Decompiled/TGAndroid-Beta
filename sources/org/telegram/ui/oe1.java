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
public final class oe1 extends Dialog {
    public final fh.b E;
    public final ah.c F;
    public MessageObject G;
    public boolean H;
    public me1 I;
    public nw0 J;
    public org.telegram.ui.Cells.u1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.nl0 P;
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
    public final org.telegram.ui.ActionBar.c6 f40684a;
    public boolean f40685a0;
    public final le1 f40686b;
    public boolean f40687b0;
    public final le1 f40688c;
    public an f40689c0;
    public final le1 d;
    public ValueAnimator f40690d0;
    public final ci.h1 f40691e;
    public ValueAnimator f40692e0;
    public final TextView f40693f;
    public final org.telegram.ui.Components.xc0 h;
    public i0.b f40694n;
    public Bitmap f40695r;
    public BitmapShader f40696s;
    public Paint v;
    public Matrix f40697w;
    public float f40698x;
    public float f40699y;

    public oe1(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40694n = i0.b.f11573e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f40685a0 = false;
        this.f40684a = c6Var;
        le1 le1Var = new le1(this, activity, 0);
        this.f40686b = le1Var;
        le1Var.setOnClickListener(new r41(this, 5));
        fh.b bVar = new fh.b();
        this.E = bVar;
        ah.c cVar = new ah.c(bVar);
        this.F = cVar;
        cVar.f547f = new hh.j(le1Var);
        cVar.f548g = le1Var;
        le1 le1Var2 = new le1(this, activity, 1);
        this.f40688c = le1Var2;
        le1Var2.setClipToPadding(false);
        le1Var.addView(le1Var2, w7.w5.e(-1, -1, 119));
        ci.h1 h1Var = new ci.h1(this, activity, 8);
        this.f40691e = h1Var;
        h1Var.setAdapter(new kw0(this, activity, 2));
        le1Var2.addView(h1Var, w7.w5.e(-1, -1, 119));
        le1 le1Var3 = new le1(this, activity, 2);
        this.d = le1Var3;
        le1Var2.addView(le1Var3, w7.w5.e(-1, -1, 119));
        org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(activity, c6Var);
        this.h = xc0Var;
        xc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        xc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        le1Var2.addView(xc0Var, w7.w5.e(-1, 66, 80));
        xc0Var.setOnTabClick(new t3(h1Var, 25));
        ch.d c10 = cVar.c(xc0Var, null, false);
        c10.o(eh.b.k(c6Var));
        c10.f4683j.f4666e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        xc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f40693f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(xc0Var.getColor());
        org.telegram.messenger.am.m(R.string.TodoMenuHint, textView, 17);
        le1Var2.addView(textView, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        lw0 lw0Var = new lw0(this, 6);
        WeakHashMap weakHashMap = r0.i0.f46981a;
        r0.a0.i(le1Var, lw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.js0 js0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f40690d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40692e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40698x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40690d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final oe1 f38347b;

            {
                this.f38347b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        oe1 oe1Var = this.f38347b;
                        oe1Var.f40698x = floatValue;
                        oe1Var.f40686b.invalidate();
                        oe1Var.f40688c.invalidate();
                        oe1Var.e();
                        return;
                    default:
                        oe1 oe1Var2 = this.f38347b;
                        oe1Var2.getClass();
                        oe1Var2.f40699y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40690d0.addListener(new androidx.fragment.app.g(this, z10, js0Var, 11));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40690d0;
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        valueAnimator3.setInterpolator(jsVar);
        this.f40690d0.setDuration(j3);
        this.f40690d0.start();
        float f12 = this.f40699y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40692e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final oe1 f38347b;

            {
                this.f38347b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        oe1 oe1Var = this.f38347b;
                        oe1Var.f40698x = floatValue;
                        oe1Var.f40686b.invalidate();
                        oe1Var.f40688c.invalidate();
                        oe1Var.e();
                        return;
                    default:
                        oe1 oe1Var2 = this.f38347b;
                        oe1Var2.getClass();
                        oe1Var2.f40699y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40692e0.addListener(new h70(10, this, z10));
        this.f40692e0.setDuration(((float) j3) * 1.5f);
        this.f40692e0.setInterpolator(jsVar);
        this.f40692e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.nl0 nl0Var;
        if (z10 && (nl0Var = this.P) != null && nl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f54687q) {
            this.P.e();
        } else if (this.f40685a0) {
        } else {
            this.f40685a0 = true;
            this.W = false;
            ci.h1 h1Var = this.f40691e;
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
            this.f40687b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.js0(13, this, z11));
            this.f40686b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            le1 le1Var = this.f40686b;
            if (le1Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.K;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40694n;
                    this.U = i11 - bVar.f11574a;
                    float f7 = iArr[1] - bVar.f11575b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = le1Var.getHeight();
                            i0.b bVar2 = this.f40694n;
                            if (height > ((height2 - bVar2.f11575b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = le1Var.getHeight();
                                i0.b bVar3 = this.f40694n;
                                this.X = ((((height3 - bVar3.f11575b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = le1Var.getHeight();
                        i0.b bVar4 = this.f40694n;
                        int dp = ((height4 - bVar4.f11575b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f40693f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = le1Var.getHeight();
                            i0.b bVar5 = this.f40694n;
                            this.Y = ((((height5 - bVar5.f11575b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = le1Var.getHeight();
                            i0.b bVar6 = this.f40694n;
                            if (height6 > (((height7 - bVar6.f11575b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = le1Var.getHeight();
                                i0.b bVar7 = this.f40694n;
                                this.Y = (((((height8 - bVar7.f11575b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        ci.h1 h1Var = this.f40691e;
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
                le1 le1Var = this.f40686b;
                int height2 = le1Var.getHeight();
                i0.b bVar = this.f40694n;
                if (height > ((height2 - bVar.f11575b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = le1Var.getHeight();
                    i0.b bVar2 = this.f40694n;
                    this.X = ((((height3 - bVar2.f11575b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        nw0 nw0Var = this.J;
        float f14 = this.U;
        if (this.f40687b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f40698x;
        }
        nw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        nw0 nw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f40687b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40698x;
        }
        nw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        le1 le1Var2 = this.d;
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
            this.T = le1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - le1Var2.getTop());
            this.S.setAlpha(this.f40698x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40698x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        me1 me1Var = this.I;
        float f18 = this.U;
        if (this.f40687b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40698x;
        }
        me1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        me1 me1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f40687b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40698x;
        }
        me1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = le1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - le1Var2.getTop());
            this.Q.setAlpha(this.f40698x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40698x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f40687b0) {
            this.J.setAlpha(this.f40698x);
            this.I.setAlpha(this.f40698x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - le1Var2.getTop()));
            this.P.setAlpha(this.f40698x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40698x);
            }
        }
        TextView textView = this.f40693f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40698x);
        org.telegram.ui.Components.xc0 xc0Var = this.h;
        xc0Var.setSelectedTab(positionAnimated);
        xc0Var.setAlpha(this.f40698x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        le1 le1Var = this.f40686b;
        setContentView(le1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        le1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(le1Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.mn0.d(new e5(this, 28));
        this.N = true;
        b(true, null);
    }
}
