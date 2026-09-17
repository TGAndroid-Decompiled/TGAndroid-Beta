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
public final class me1 extends Dialog {
    public final fh.b E;
    public final ah.c F;
    public MessageObject G;
    public boolean H;
    public ke1 I;
    public nw0 J;
    public org.telegram.ui.Cells.t1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.gk0 P;
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
    public final org.telegram.ui.ActionBar.f6 f35773a;
    public boolean f35774a0;
    public final je1 f35775b;
    public boolean f35776b0;
    public final je1 f35777c;
    public ym f35778c0;
    public final je1 d;
    public ValueAnimator f35779d0;
    public final ci.i1 e;
    public ValueAnimator f35780e0;
    public final TextView f35781f;
    public final org.telegram.ui.Components.tb0 h;
    public i0.b f35782n;
    public Bitmap f35783r;
    public BitmapShader f35784s;
    public Paint v;
    public Matrix f35785w;
    public float f35786x;
    public float f35787y;

    public me1(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f35782n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f35774a0 = false;
        this.f35773a = f6Var;
        je1 je1Var = new je1(this, activity, 0);
        this.f35775b = je1Var;
        je1Var.setOnClickListener(new i41(this, 6));
        fh.b bVar = new fh.b();
        this.E = bVar;
        ah.c cVar = new ah.c(bVar);
        this.F = cVar;
        cVar.f425f = new hh.k(je1Var);
        cVar.f426g = je1Var;
        je1 je1Var2 = new je1(this, activity, 1);
        this.f35777c = je1Var2;
        je1Var2.setClipToPadding(false);
        je1Var.addView(je1Var2, w7.x5.e(-1, -1, 119));
        ci.i1 i1Var = new ci.i1(this, activity, 8);
        this.e = i1Var;
        i1Var.setAdapter(new kw0(this, activity, 2));
        je1Var2.addView(i1Var, w7.x5.e(-1, -1, 119));
        je1 je1Var3 = new je1(this, activity, 2);
        this.d = je1Var3;
        je1Var2.addView(je1Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(activity, f6Var);
        this.h = tb0Var;
        tb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        tb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        je1Var2.addView(tb0Var, w7.x5.e(-1, 66, 80));
        tb0Var.setOnTabClick(new s3(i1Var, 22));
        ch.d c10 = cVar.c(tb0Var, null, false);
        c10.o(eh.b.k(f6Var));
        c10.f4288j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tb0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f35781f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tb0Var.getColor());
        org.telegram.messenger.wl.k(R.string.TodoMenuHint, textView, 17);
        je1Var2.addView(textView, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        lw0 lw0Var = new lw0(this, 6);
        WeakHashMap weakHashMap = r0.i0.f41865a;
        r0.a0.j(je1Var, lw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.tr0 tr0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35779d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35780e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35786x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35779d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final me1 f33626b;

            {
                this.f33626b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        me1 me1Var = this.f33626b;
                        me1Var.f35786x = floatValue;
                        me1Var.f35775b.invalidate();
                        me1Var.f35777c.invalidate();
                        me1Var.e();
                        return;
                    default:
                        me1 me1Var2 = this.f33626b;
                        me1Var2.getClass();
                        me1Var2.f35787y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35779d0.addListener(new androidx.fragment.app.g(this, z10, tr0Var, 11));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35779d0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.f35779d0.setDuration(j3);
        this.f35779d0.start();
        float f12 = this.f35787y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35780e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final me1 f33626b;

            {
                this.f33626b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        me1 me1Var = this.f33626b;
                        me1Var.f35786x = floatValue;
                        me1Var.f35775b.invalidate();
                        me1Var.f35777c.invalidate();
                        me1Var.e();
                        return;
                    default:
                        me1 me1Var2 = this.f33626b;
                        me1Var2.getClass();
                        me1Var2.f35787y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f35780e0.addListener(new j70(10, this, z10));
        this.f35780e0.setDuration(((float) j3) * 1.5f);
        this.f35780e0.setInterpolator(qrVar);
        this.f35780e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.gk0 gk0Var;
        if (z10 && (gk0Var = this.P) != null && gk0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f49019q) {
            this.P.e();
        } else if (this.f35774a0) {
        } else {
            this.f35774a0 = true;
            this.W = false;
            ci.i1 i1Var = this.e;
            i1Var.l();
            if (i1Var.getCurrentPosition() == 1) {
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
            this.f35776b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.tr0(11, this, z11));
            this.f35775b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            je1 je1Var = this.f35775b;
            if (je1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.K;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f35782n;
                    this.U = i11 - bVar.f10591a;
                    float f7 = iArr[1] - bVar.f10592b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = je1Var.getHeight();
                            i0.b bVar2 = this.f35782n;
                            if (height > ((height2 - bVar2.f10592b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = je1Var.getHeight();
                                i0.b bVar3 = this.f35782n;
                                this.X = ((((height3 - bVar3.f10592b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = je1Var.getHeight();
                        i0.b bVar4 = this.f35782n;
                        int dp = ((height4 - bVar4.f10592b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f35781f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = je1Var.getHeight();
                            i0.b bVar5 = this.f35782n;
                            this.Y = ((((height5 - bVar5.f10592b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = je1Var.getHeight();
                            i0.b bVar6 = this.f35782n;
                            if (height6 > (((height7 - bVar6.f10592b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = je1Var.getHeight();
                                i0.b bVar7 = this.f35782n;
                                this.Y = (((((height8 - bVar7.f10592b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        ci.i1 i1Var = this.e;
        float positionAnimated = i1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -i1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(i1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.V;
                this.X = f13;
                float height = f13 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                je1 je1Var = this.f35775b;
                int height2 = je1Var.getHeight();
                i0.b bVar = this.f35782n;
                if (height > ((height2 - bVar.f10592b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = je1Var.getHeight();
                    i0.b bVar2 = this.f35782n;
                    this.X = ((((height3 - bVar2.f10592b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        nw0 nw0Var = this.J;
        float f14 = this.U;
        if (this.f35776b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f35786x;
        }
        nw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        nw0 nw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f35776b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f35786x;
        }
        nw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        je1 je1Var2 = this.d;
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
            this.T = je1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - je1Var2.getTop());
            this.S.setAlpha(this.f35786x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35786x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        ke1 ke1Var = this.I;
        float f18 = this.U;
        if (this.f35776b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f35786x;
        }
        ke1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        ke1 ke1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f35776b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f35786x;
        }
        ke1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = je1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - je1Var2.getTop());
            this.Q.setAlpha(this.f35786x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f35786x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f35776b0) {
            this.J.setAlpha(this.f35786x);
            this.I.setAlpha(this.f35786x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - je1Var2.getTop()));
            this.P.setAlpha(this.f35786x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f35786x);
            }
        }
        TextView textView = this.f35781f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f35786x);
        org.telegram.ui.Components.tb0 tb0Var = this.h;
        tb0Var.setSelectedTab(positionAnimated);
        tb0Var.setAlpha(this.f35786x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        je1 je1Var = this.f35775b;
        setContentView(je1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        je1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(je1Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.bm0.d(new b5(this, 28));
        this.N = true;
        b(true, null);
    }
}
