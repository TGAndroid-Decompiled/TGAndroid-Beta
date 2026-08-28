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
    public final ng.b A;
    public final ig.a B;
    public MessageObject C;
    public boolean D;
    public bd1 E;
    public hv0 F;
    public org.telegram.ui.Cells.t1 G;
    public float H;
    public float I;
    public boolean J;
    public int K;
    public org.telegram.ui.Components.uj0 L;
    public ViewGroup M;
    public float N;
    public ViewGroup O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public boolean X;
    public nm Y;
    public ValueAnimator Z;
    public final org.telegram.ui.ActionBar.b6 f37503a;
    public ValueAnimator f37504a0;
    public final ad1 f37505b;
    public final ad1 f37506c;
    public final ad1 d;
    public final kh.j1 f37507e;
    public final TextView f37508f;
    public final org.telegram.ui.Components.ab0 h;
    public i0.b f37509n;
    public Bitmap f37510r;
    public BitmapShader f37511s;
    public Paint v;
    public Matrix f37512w;
    public float f37513x;
    public float f37514y;

    public dd1(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, R.style.TransparentDialog);
        this.f37509n = i0.b.f10847e;
        this.H = 0.0f;
        this.I = 0.0f;
        this.N = -1.0f;
        this.P = -1.0f;
        this.W = false;
        this.f37503a = b6Var;
        ad1 ad1Var = new ad1(this, activity, 0);
        this.f37505b = ad1Var;
        ad1Var.setOnClickListener(new w21(this, 7));
        ng.b bVar = new ng.b();
        this.A = bVar;
        ig.a aVar = new ig.a(bVar);
        this.B = aVar;
        aVar.d = new pg.i(ad1Var);
        aVar.f11131e = ad1Var;
        ad1 ad1Var2 = new ad1(this, activity, 1);
        this.f37506c = ad1Var2;
        ad1Var2.setClipToPadding(false);
        ad1Var.addView(ad1Var2, g7.e6.e(-1, -1, 119));
        kh.j1 j1Var = new kh.j1(this, activity, 8);
        this.f37507e = j1Var;
        j1Var.setAdapter(new bg.x(this, activity, 4));
        ad1Var2.addView(j1Var, g7.e6.e(-1, -1, 119));
        ad1 ad1Var3 = new ad1(this, activity, 2);
        this.d = ad1Var3;
        ad1Var2.addView(ad1Var3, g7.e6.e(-1, -1, 119));
        org.telegram.ui.Components.ab0 ab0Var = new org.telegram.ui.Components.ab0(activity, b6Var);
        this.h = ab0Var;
        ab0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        ab0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        ad1Var2.addView(ab0Var, g7.e6.e(-1, 66, 80));
        ab0Var.setOnTabClick(new w3(j1Var, 22));
        kg.d c10 = aVar.c(ab0Var, null, false);
        c10.n(mg.c.j(b6Var));
        c10.h.f14805e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ab0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f37508f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ab0Var.getColor());
        org.telegram.messenger.ll.l(R.string.TodoMenuHint, textView, 17);
        ad1Var2.addView(textView, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        fv0 fv0Var = new fv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(ad1Var, fv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.a50 a50Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f37504a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f37513x;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final dd1 f43730b;

            {
                this.f43730b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.f43730b;
                        dd1Var.f37513x = floatValue;
                        dd1Var.f37505b.invalidate();
                        dd1Var.f37506c.invalidate();
                        dd1Var.e();
                        return;
                    default:
                        dd1 dd1Var2 = this.f43730b;
                        dd1Var2.getClass();
                        dd1Var2.f37514y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.Z.addListener(new androidx.fragment.app.g(this, z10, a50Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.Z.setDuration(j10);
        this.Z.start();
        float f13 = this.f37514y;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f37504a0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final dd1 f43730b;

            {
                this.f43730b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        dd1 dd1Var = this.f43730b;
                        dd1Var.f37513x = floatValue;
                        dd1Var.f37505b.invalidate();
                        dd1Var.f37506c.invalidate();
                        dd1Var.e();
                        return;
                    default:
                        dd1 dd1Var2 = this.f43730b;
                        dd1Var2.getClass();
                        dd1Var2.f37514y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f37504a0.addListener(new n60(10, this, z10));
        this.f37504a0.setDuration(((float) j10) * 1.5f);
        this.f37504a0.setInterpolator(grVar);
        this.f37504a0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.uj0 uj0Var;
        if (z10 && (uj0Var = this.L) != null && uj0Var.getReactionsWindow() != null && !this.L.getReactionsWindow().f10588q) {
            this.L.e();
        } else if (this.W) {
        } else {
            this.W = true;
            this.S = false;
            kh.j1 j1Var = this.f37507e;
            j1Var.l();
            if (j1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.t1 t1Var2 = this.G;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(4);
                    this.G.invalidate();
                }
            } else if (!z10 && (t1Var = this.G) != null) {
                t1Var.setVisibility(0);
                org.telegram.ui.Cells.t1 t1Var3 = this.G;
                t1Var3.G7 = -1;
                t1Var3.invalidate();
            }
            this.X = !z10;
            d();
            b(false, new org.telegram.ui.Components.a50(16, this, z11));
            this.f37505b.invalidate();
        }
    }

    public final void d() {
        int i9;
        ViewGroup viewGroup;
        if (!this.S) {
            ad1 ad1Var = this.f37505b;
            if (ad1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.G;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f37509n;
                    this.Q = i10 - bVar.f10848a;
                    float f10 = iArr[1] - bVar.f10849b;
                    this.R = f10;
                    if (!this.V) {
                        this.V = true;
                        this.T = f10;
                        if (this.O != null) {
                            float height = f10 + this.G.getHeight() + this.O.getHeight();
                            int height2 = ad1Var.getHeight();
                            i0.b bVar2 = this.f37509n;
                            if (height > ((height2 - bVar2.f10849b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = ad1Var.getHeight();
                                i0.b bVar3 = this.f37509n;
                                this.T = ((((height3 - bVar3.f10849b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - this.O.getHeight();
                            }
                        }
                        int O2 = this.E.O2(this.K);
                        this.E.H2(O2);
                        float G2 = this.E.G2(O2);
                        float f11 = this.R;
                        this.U = f11;
                        float f12 = (int) G2;
                        int height4 = ad1Var.getHeight();
                        i0.b bVar4 = this.f37509n;
                        int dp = ((height4 - bVar4.f10849b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f37508f;
                        if (f11 + f12 > dp - textView.getHeight()) {
                            int height5 = ad1Var.getHeight();
                            i0.b bVar5 = this.f37509n;
                            this.U = ((((height5 - bVar5.f10849b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i9;
                        }
                        if (this.M != null) {
                            float height6 = this.U + f12 + viewGroup.getHeight();
                            int height7 = ad1Var.getHeight();
                            i0.b bVar6 = this.f37509n;
                            if (height6 > (((height7 - bVar6.f10849b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = ad1Var.getHeight();
                                i0.b bVar7 = this.f37509n;
                                this.U = (((((height8 - bVar7.f10849b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i9) - this.M.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.R = 0.0f;
                    this.Q = 0.0f;
                }
                this.S = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        kh.j1 j1Var = this.f37507e;
        float positionAnimated = j1Var.getPositionAnimated();
        int i10 = 0;
        float lerp = AndroidUtilities.lerp(0, -j1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(j1Var.getWidth(), 0, positionAnimated);
        if (this.S) {
            ViewGroup viewGroup = this.O;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.R;
                this.T = f14;
                float height = f14 + this.G.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ad1 ad1Var = this.f37505b;
                int height2 = ad1Var.getHeight();
                i0.b bVar = this.f37509n;
                if (height > ((height2 - bVar.f10849b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ad1Var.getHeight();
                    i0.b bVar2 = this.f37509n;
                    this.T = ((((height3 - bVar2.f10849b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        hv0 hv0Var = this.F;
        float f15 = this.Q;
        if (this.X) {
            f10 = 1.0f;
        } else {
            f10 = this.f37513x;
        }
        hv0Var.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, f10) + lerp2);
        hv0 hv0Var2 = this.F;
        float f16 = this.R;
        float f17 = this.T;
        if (this.X) {
            f11 = 1.0f;
        } else {
            f11 = this.f37513x;
        }
        hv0Var2.setTranslationY(AndroidUtilities.lerp(f16, f17, f11));
        ViewGroup viewGroup2 = this.O;
        ad1 ad1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.D) {
                viewGroup2.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.O.getLeft());
            } else {
                float f18 = lerp2 + 0.0f;
                if (this.F.z3()) {
                    i9 = AndroidUtilities.dp(48.0f);
                } else {
                    i9 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i9) + this.F.getLeft()) - this.O.getLeft());
            }
            this.P = ad1Var2.getMeasuredWidth() - (this.O.getX() - lerp2);
            this.O.setTranslationY(((this.F.getY() + this.F.getHeight()) - this.O.getTop()) - ad1Var2.getTop());
            this.O.setAlpha(this.f37513x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f37513x);
            this.O.setScaleX(lerp3);
            this.O.setScaleY(lerp3);
        }
        bd1 bd1Var = this.E;
        float f19 = this.Q;
        if (this.X) {
            f12 = 1.0f;
        } else {
            f12 = this.f37513x;
        }
        bd1Var.setTranslationX(AndroidUtilities.lerp(f19, 0.0f, f12) + lerp);
        bd1 bd1Var2 = this.E;
        float f20 = this.R;
        float f21 = this.U;
        if (this.X) {
            f13 = 1.0f;
        } else {
            f13 = this.f37513x;
        }
        bd1Var2.setTranslationY(AndroidUtilities.lerp(f20, f21, f13));
        if (this.M != null) {
            int O2 = this.E.O2(this.K);
            this.E.H2(O2);
            float G2 = this.E.G2(O2);
            if (this.D) {
                this.M.setTranslationX(((this.E.getPollButtonsLeft() + ((lerp + 0.0f) + this.E.getLeft())) - AndroidUtilities.dp(8.0f)) - this.M.getLeft());
            } else {
                ViewGroup viewGroup3 = this.M;
                float f22 = lerp + 0.0f;
                if (this.E.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.E.getLeft()) - this.M.getLeft());
            }
            this.N = ad1Var2.getMeasuredWidth() - (this.M.getX() - lerp2);
            this.M.setTranslationY(((this.E.getY() + ((int) G2)) - this.M.getTop()) - ad1Var2.getTop());
            this.M.setAlpha(this.f37513x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f37513x);
            this.M.setScaleX(lerp4);
            this.M.setScaleY(lerp4);
        }
        if (this.X) {
            this.F.setAlpha(this.f37513x);
            this.E.setAlpha(this.f37513x);
        }
        if (this.L != null) {
            float max = lerp2 + Math.max(0.0f, ((this.F.getBoundsLeft() + this.F.getBoundsRight()) / 2.0f) - (this.L.getWidth() * 0.8f));
            this.L.setTranslationX(max);
            this.L.setTranslationY(Math.max(0.0f, ((this.F.getY() - this.L.getHeight()) + AndroidUtilities.dp(22.0f)) - ad1Var2.getTop()));
            this.L.setAlpha(this.f37513x);
            View windowView = this.L.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f37513x);
            }
        }
        TextView textView = this.f37508f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f37513x);
        org.telegram.ui.Components.ab0 ab0Var = this.h;
        ab0Var.setSelectedTab(positionAnimated);
        ab0Var.setAlpha(this.f37513x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ad1 ad1Var = this.f37505b;
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
        AndroidUtilities.setLightNavigationBar(ad1Var, !org.telegram.ui.ActionBar.f6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.ll0.d(new a5(this, 28));
        this.J = true;
        b(true, null);
    }
}
