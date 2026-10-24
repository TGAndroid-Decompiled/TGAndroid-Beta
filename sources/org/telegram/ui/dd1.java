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
public final class dd1 extends Dialog {
    public final gh.b E;
    public final bh.b F;
    public MessageObject G;
    public boolean H;
    public bd1 I;
    public sv0 J;
    public org.telegram.ui.Cells.t1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.fl0 P;
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
    public final org.telegram.ui.ActionBar.g6 f36588a;
    public boolean f36589a0;
    public final ad1 f36590b;
    public boolean f36591b0;
    public final ad1 f36592c;
    public om f36593c0;
    public final ad1 d;
    public ValueAnimator f36594d0;
    public final ei.h1 e;
    public ValueAnimator f36595e0;
    public final TextView f36596f;
    public final org.telegram.ui.Components.nc0 h;
    public i0.b f36597n;
    public Bitmap f36598r;
    public BitmapShader f36599s;
    public Paint v;
    public Matrix f36600w;
    public float f36601x;
    public float f36602y;

    public dd1(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.f36597n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f36589a0 = false;
        this.f36588a = g6Var;
        ad1 ad1Var = new ad1(this, activity, 0);
        this.f36590b = ad1Var;
        ad1Var.setOnClickListener(new f31(this, 5));
        gh.b bVar = new gh.b();
        this.E = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.f4365f = new ih.k(ad1Var);
        bVar2.f4366g = ad1Var;
        ad1 ad1Var2 = new ad1(this, activity, 1);
        this.f36592c = ad1Var2;
        ad1Var2.setClipToPadding(false);
        ad1Var.addView(ad1Var2, w7.z5.e(-1, -1, 119));
        ei.h1 h1Var = new ei.h1(this, activity, 8);
        this.e = h1Var;
        h1Var.setAdapter(new ai.j5(this, activity, 3));
        ad1Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        ad1 ad1Var3 = new ad1(this, activity, 2);
        this.d = ad1Var3;
        ad1Var2.addView(ad1Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.nc0 nc0Var = new org.telegram.ui.Components.nc0(activity, g6Var);
        this.h = nc0Var;
        nc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        nc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        ad1Var2.addView(nc0Var, w7.z5.e(-1, 66, 80));
        nc0Var.setOnTabClick(new u3(h1Var, 23));
        dh.d c10 = bVar2.c(nc0Var, null, false);
        c10.o(fh.c.k(g6Var));
        c10.v.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        nc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f36596f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(nc0Var.getColor());
        org.telegram.messenger.tl.m(R.string.TodoMenuHint, textView, 17);
        ad1Var2.addView(textView, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        qv0 qv0Var = new qv0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(ad1Var, qv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.z50 z50Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f36594d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f36595e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f36601x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36594d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final dd1 f42992b;

            {
                this.f42992b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.f42992b;
                        dd1Var.f36601x = floatValue;
                        dd1Var.f36590b.invalidate();
                        dd1Var.f36592c.invalidate();
                        dd1Var.e();
                        return;
                    default:
                        dd1 dd1Var2 = this.f42992b;
                        dd1Var2.getClass();
                        dd1Var2.f36602y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36594d0.addListener(new ah.q0(this, z10, z50Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f36594d0;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        valueAnimator3.setInterpolator(zrVar);
        this.f36594d0.setDuration(j10);
        this.f36594d0.start();
        float f12 = this.f36602y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f36595e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final dd1 f42992b;

            {
                this.f42992b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.f42992b;
                        dd1Var.f36601x = floatValue;
                        dd1Var.f36590b.invalidate();
                        dd1Var.f36592c.invalidate();
                        dd1Var.e();
                        return;
                    default:
                        dd1 dd1Var2 = this.f42992b;
                        dd1Var2.getClass();
                        dd1Var2.f36602y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f36595e0.addListener(new o40(11, this, z10));
        this.f36595e0.setDuration(((float) j10) * 1.5f);
        this.f36595e0.setInterpolator(zrVar);
        this.f36595e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.fl0 fl0Var;
        if (z10 && (fl0Var = this.P) != null && fl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f882q) {
            this.P.e();
        } else if (this.f36589a0) {
        } else {
            this.f36589a0 = true;
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
            this.f36591b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.z50(17, this, z11));
            this.f36590b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            ad1 ad1Var = this.f36590b;
            if (ad1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.K;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f36597n;
                    this.U = i11 - bVar.f12315a;
                    float f7 = iArr[1] - bVar.f12316b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = ad1Var.getHeight();
                            i0.b bVar2 = this.f36597n;
                            if (height > ((height2 - bVar2.f12316b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = ad1Var.getHeight();
                                i0.b bVar3 = this.f36597n;
                                this.X = ((((height3 - bVar3.f12316b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int N2 = this.I.N2(this.O);
                        this.I.G2(N2);
                        float F2 = this.I.F2(N2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) F2;
                        int height4 = ad1Var.getHeight();
                        i0.b bVar4 = this.f36597n;
                        int dp = ((height4 - bVar4.f12316b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f36596f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = ad1Var.getHeight();
                            i0.b bVar5 = this.f36597n;
                            this.Y = ((((height5 - bVar5.f12316b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = ad1Var.getHeight();
                            i0.b bVar6 = this.f36597n;
                            if (height6 > (((height7 - bVar6.f12316b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = ad1Var.getHeight();
                                i0.b bVar7 = this.f36597n;
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
                ad1 ad1Var = this.f36590b;
                int height2 = ad1Var.getHeight();
                i0.b bVar = this.f36597n;
                if (height > ((height2 - bVar.f12316b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ad1Var.getHeight();
                    i0.b bVar2 = this.f36597n;
                    this.X = ((((height3 - bVar2.f12316b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        sv0 sv0Var = this.J;
        float f14 = this.U;
        if (this.f36591b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f36601x;
        }
        sv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        sv0 sv0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f36591b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f36601x;
        }
        sv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        ad1 ad1Var2 = this.d;
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
            this.T = ad1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - ad1Var2.getTop());
            this.S.setAlpha(this.f36601x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36601x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        bd1 bd1Var = this.I;
        float f18 = this.U;
        if (this.f36591b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f36601x;
        }
        bd1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        bd1 bd1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f36591b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f36601x;
        }
        bd1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = ad1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) F2)) - this.Q.getTop()) - ad1Var2.getTop());
            this.Q.setAlpha(this.f36601x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f36601x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f36591b0) {
            this.J.setAlpha(this.f36601x);
            this.I.setAlpha(this.f36601x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - ad1Var2.getTop()));
            this.P.setAlpha(this.f36601x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f36601x);
            }
        }
        TextView textView = this.f36596f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f36601x);
        org.telegram.ui.Components.nc0 nc0Var = this.h;
        nc0Var.setSelectedTab(positionAnimated);
        nc0Var.setAlpha(this.f36601x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ad1 ad1Var = this.f36590b;
        setContentView(ad1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        ad1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ad1Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.bn0.d(new f5(this, 28));
        this.N = true;
        b(true, null);
    }
}
