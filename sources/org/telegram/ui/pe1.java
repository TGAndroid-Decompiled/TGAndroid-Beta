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
public final class pe1 extends Dialog {
    public final eh.b E;
    public final zg.a F;
    public MessageObject G;
    public boolean H;
    public ne1 I;
    public nw0 J;
    public org.telegram.ui.Cells.t1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.pk0 P;
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
    public final org.telegram.ui.ActionBar.f6 f35808a;
    public boolean f35809a0;
    public final me1 f35810b;
    public boolean f35811b0;
    public final me1 f35812c;
    public an f35813c0;
    public final me1 d;
    public ValueAnimator f35814d0;
    public final bi.p1 e;
    public ValueAnimator f35815e0;
    public final TextView f35816f;
    public final org.telegram.ui.Components.cc0 h;
    public i0.c f35817n;
    public Bitmap f35818r;
    public BitmapShader f35819s;
    public Paint v;
    public Matrix f35820w;
    public float f35821x;
    public float f35822y;

    public pe1(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f35817n = i0.c.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f35809a0 = false;
        this.f35808a = f6Var;
        me1 me1Var = new me1(this, activity, 0);
        this.f35810b = me1Var;
        me1Var.setOnClickListener(new m41(this, 6));
        eh.b bVar = new eh.b();
        this.E = bVar;
        zg.a aVar = new zg.a(bVar);
        this.F = aVar;
        aVar.d = new gh.k(me1Var);
        aVar.e = me1Var;
        me1 me1Var2 = new me1(this, activity, 1);
        this.f35812c = me1Var2;
        me1Var2.setClipToPadding(false);
        me1Var.addView(me1Var2, w7.a6.e(-1, -1, 119));
        bi.p1 p1Var = new bi.p1(this, activity, 8);
        this.e = p1Var;
        p1Var.setAdapter(new kw0(this, activity, 2));
        me1Var2.addView(p1Var, w7.a6.e(-1, -1, 119));
        me1 me1Var3 = new me1(this, activity, 2);
        this.d = me1Var3;
        me1Var2.addView(me1Var3, w7.a6.e(-1, -1, 119));
        org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(activity, f6Var);
        this.h = cc0Var;
        cc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        cc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        me1Var2.addView(cc0Var, w7.a6.e(-1, 66, 80));
        cc0Var.setOnTabClick(new u3(p1Var, 22));
        bh.d c10 = aVar.c(cc0Var, null, false);
        c10.n(dh.c.k(f6Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        cc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f35816f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(cc0Var.getColor());
        org.telegram.messenger.em.k(R.string.TodoMenuHint, textView, 17);
        me1Var2.addView(textView, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        lw0 lw0Var = new lw0(this, 6);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(me1Var, lw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.bs0 bs0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35814d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35815e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35821x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35814d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final pe1 f33661b;

            {
                this.f33661b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        pe1 pe1Var = this.f33661b;
                        pe1Var.f35821x = floatValue;
                        pe1Var.f35810b.invalidate();
                        pe1Var.f35812c.invalidate();
                        pe1Var.e();
                        return;
                    default:
                        pe1 pe1Var2 = this.f33661b;
                        pe1Var2.getClass();
                        pe1Var2.f35822y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35814d0.addListener(new androidx.fragment.app.g(this, z10, bs0Var, 11));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35814d0;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        valueAnimator3.setInterpolator(wrVar);
        this.f35814d0.setDuration(j3);
        this.f35814d0.start();
        float f12 = this.f35822y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35815e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final pe1 f33661b;

            {
                this.f33661b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        pe1 pe1Var = this.f33661b;
                        pe1Var.f35821x = floatValue;
                        pe1Var.f35810b.invalidate();
                        pe1Var.f35812c.invalidate();
                        pe1Var.e();
                        return;
                    default:
                        pe1 pe1Var2 = this.f33661b;
                        pe1Var2.getClass();
                        pe1Var2.f35822y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35815e0.addListener(new iw0(6, this, z10));
        this.f35815e0.setDuration(((float) j3) * 1.5f);
        this.f35815e0.setInterpolator(wrVar);
        this.f35815e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z10 && (pk0Var = this.P) != null && pk0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f46963q) {
            this.P.e();
        } else if (this.f35809a0) {
        } else {
            this.f35809a0 = true;
            this.W = false;
            bi.p1 p1Var = this.e;
            p1Var.l();
            if (p1Var.getCurrentPosition() == 1) {
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
            this.f35811b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.bs0(11, this, z11));
            this.f35810b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            me1 me1Var = this.f35810b;
            if (me1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.K;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.c cVar = this.f35817n;
                    this.U = i11 - cVar.f10074a;
                    float f7 = iArr[1] - cVar.f10075b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = me1Var.getHeight();
                            i0.c cVar2 = this.f35817n;
                            if (height > ((height2 - cVar2.f10075b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = me1Var.getHeight();
                                i0.c cVar3 = this.f35817n;
                                this.X = ((((height3 - cVar3.f10075b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = me1Var.getHeight();
                        i0.c cVar4 = this.f35817n;
                        int dp = ((height4 - cVar4.f10075b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f35816f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = me1Var.getHeight();
                            i0.c cVar5 = this.f35817n;
                            this.Y = ((((height5 - cVar5.f10075b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = me1Var.getHeight();
                            i0.c cVar6 = this.f35817n;
                            if (height6 > (((height7 - cVar6.f10075b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = me1Var.getHeight();
                                i0.c cVar7 = this.f35817n;
                                this.Y = (((((height8 - cVar7.f10075b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        bi.p1 p1Var = this.e;
        float positionAnimated = p1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -p1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(p1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.V;
                this.X = f13;
                float height = f13 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                me1 me1Var = this.f35810b;
                int height2 = me1Var.getHeight();
                i0.c cVar = this.f35817n;
                if (height > ((height2 - cVar.f10075b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = me1Var.getHeight();
                    i0.c cVar2 = this.f35817n;
                    this.X = ((((height3 - cVar2.f10075b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        nw0 nw0Var = this.J;
        float f14 = this.U;
        if (this.f35811b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f35821x;
        }
        nw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        nw0 nw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f35811b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f35821x;
        }
        nw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        me1 me1Var2 = this.d;
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
            this.T = me1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - me1Var2.getTop());
            this.S.setAlpha(this.f35821x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35821x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        ne1 ne1Var = this.I;
        float f18 = this.U;
        if (this.f35811b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f35821x;
        }
        ne1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        ne1 ne1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f35811b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f35821x;
        }
        ne1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = me1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - me1Var2.getTop());
            this.Q.setAlpha(this.f35821x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35821x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f35811b0) {
            this.J.setAlpha(this.f35821x);
            this.I.setAlpha(this.f35821x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - me1Var2.getTop()));
            this.P.setAlpha(this.f35821x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f35821x);
            }
        }
        TextView textView = this.f35816f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f35821x);
        org.telegram.ui.Components.cc0 cc0Var = this.h;
        cc0Var.setSelectedTab(positionAnimated);
        cc0Var.setAlpha(this.f35821x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        me1 me1Var = this.f35810b;
        setContentView(me1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        me1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(me1Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.km0.d(new b5(this, 28));
        this.N = true;
        b(true, null);
    }
}
