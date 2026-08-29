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
public final class fd1 extends Dialog {
    public final qg.b A;
    public final lg.a B;
    public MessageObject C;
    public boolean D;
    public dd1 E;
    public hv0 F;
    public org.telegram.ui.Cells.s1 G;
    public float H;
    public float I;
    public boolean J;
    public int K;
    public org.telegram.ui.Components.fk0 L;
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
    public pm Y;
    public ValueAnimator Z;
    public final org.telegram.ui.ActionBar.c6 f38108a;
    public ValueAnimator f38109a0;
    public final cd1 f38110b;
    public final cd1 f38111c;
    public final cd1 d;
    public final nh.g1 f38112e;
    public final TextView f38113f;
    public final org.telegram.ui.Components.pb0 h;
    public i0.b f38114n;
    public Bitmap f38115r;
    public BitmapShader f38116s;
    public Paint v;
    public Matrix f38117w;
    public float f38118x;
    public float f38119y;

    public fd1(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f38114n = i0.b.f8185e;
        this.H = 0.0f;
        this.I = 0.0f;
        this.N = -1.0f;
        this.P = -1.0f;
        this.W = false;
        this.f38108a = c6Var;
        cd1 cd1Var = new cd1(this, activity, 0);
        this.f38110b = cd1Var;
        cd1Var.setOnClickListener(new w21(this, 7));
        qg.b bVar = new qg.b();
        this.A = bVar;
        lg.a aVar = new lg.a(bVar);
        this.B = aVar;
        aVar.d = new sg.i(cd1Var);
        aVar.f15224e = cd1Var;
        cd1 cd1Var2 = new cd1(this, activity, 1);
        this.f38111c = cd1Var2;
        cd1Var2.setClipToPadding(false);
        cd1Var.addView(cd1Var2, i7.f6.e(-1, -1, 119));
        nh.g1 g1Var = new nh.g1(this, activity, 7);
        this.f38112e = g1Var;
        g1Var.setAdapter(new eg.v(this, activity, 4));
        cd1Var2.addView(g1Var, i7.f6.e(-1, -1, 119));
        cd1 cd1Var3 = new cd1(this, activity, 2);
        this.d = cd1Var3;
        cd1Var2.addView(cd1Var3, i7.f6.e(-1, -1, 119));
        org.telegram.ui.Components.pb0 pb0Var = new org.telegram.ui.Components.pb0(activity, c6Var);
        this.h = pb0Var;
        pb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        pb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        cd1Var2.addView(pb0Var, i7.f6.e(-1, 66, 80));
        pb0Var.setOnTabClick(new x3(g1Var, 22));
        ng.d c3 = aVar.c(pb0Var, null, false);
        c3.n(pg.a.j(c6Var));
        c3.h.f17329e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        pb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.f38113f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(pb0Var.getColor());
        b.i(R.string.TodoMenuHint, textView, 17);
        cd1Var2.addView(textView, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        fv0 fv0Var = new fv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(cd1Var, fv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.p90 p90Var) {
        float f9;
        long j10;
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f38109a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f38118x;
        float f11 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final fd1 f44839b;

            {
                this.f44839b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        fd1 fd1Var = this.f44839b;
                        fd1Var.f38118x = floatValue;
                        fd1Var.f38110b.invalidate();
                        fd1Var.f38111c.invalidate();
                        fd1Var.e();
                        return;
                    default:
                        fd1 fd1Var2 = this.f44839b;
                        fd1Var2.getClass();
                        fd1Var2.f38119y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.Z.addListener(new androidx.fragment.app.g(this, z10, p90Var, 13));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        valueAnimator3.setInterpolator(jrVar);
        this.Z.setDuration(j10);
        this.Z.start();
        float f12 = this.f38119y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f38109a0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final fd1 f44839b;

            {
                this.f44839b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        fd1 fd1Var = this.f44839b;
                        fd1Var.f38118x = floatValue;
                        fd1Var.f38110b.invalidate();
                        fd1Var.f38111c.invalidate();
                        fd1Var.e();
                        return;
                    default:
                        fd1 fd1Var2 = this.f44839b;
                        fd1Var2.getClass();
                        fd1Var2.f38119y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f38109a0.addListener(new p60(10, this, z10));
        this.f38109a0.setDuration(((float) j10) * 1.5f);
        this.f38109a0.setInterpolator(jrVar);
        this.f38109a0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.fk0 fk0Var;
        if (z10 && (fk0Var = this.L) != null && fk0Var.getReactionsWindow() != null && !this.L.getReactionsWindow().f13695q) {
            this.L.e();
        } else if (this.W) {
        } else {
            this.W = true;
            this.S = false;
            nh.g1 g1Var = this.f38112e;
            g1Var.l();
            if (g1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.s1 s1Var2 = this.G;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(4);
                    this.G.invalidate();
                }
            } else if (!z10 && (s1Var = this.G) != null) {
                s1Var.setVisibility(0);
                org.telegram.ui.Cells.s1 s1Var3 = this.G;
                s1Var3.G7 = -1;
                s1Var3.invalidate();
            }
            this.X = !z10;
            d();
            b(false, new org.telegram.ui.Components.p90(15, this, z11));
            this.f38110b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.S) {
            cd1 cd1Var = this.f38110b;
            if (cd1Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.G;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f38114n;
                    this.Q = i11 - bVar.f8186a;
                    float f9 = iArr[1] - bVar.f8187b;
                    this.R = f9;
                    if (!this.V) {
                        this.V = true;
                        this.T = f9;
                        if (this.O != null) {
                            float height = f9 + this.G.getHeight() + this.O.getHeight();
                            int height2 = cd1Var.getHeight();
                            i0.b bVar2 = this.f38114n;
                            if (height > ((height2 - bVar2.f8187b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = cd1Var.getHeight();
                                i0.b bVar3 = this.f38114n;
                                this.T = ((((height3 - bVar3.f8187b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - this.O.getHeight();
                            }
                        }
                        int O2 = this.E.O2(this.K);
                        this.E.H2(O2);
                        float G2 = this.E.G2(O2);
                        float f10 = this.R;
                        this.U = f10;
                        float f11 = (int) G2;
                        int height4 = cd1Var.getHeight();
                        i0.b bVar4 = this.f38114n;
                        int dp = ((height4 - bVar4.f8187b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f38113f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = cd1Var.getHeight();
                            i0.b bVar5 = this.f38114n;
                            this.U = ((((height5 - bVar5.f8187b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.M != null) {
                            float height6 = this.U + f11 + viewGroup.getHeight();
                            int height7 = cd1Var.getHeight();
                            i0.b bVar6 = this.f38114n;
                            if (height6 > (((height7 - bVar6.f8187b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = cd1Var.getHeight();
                                i0.b bVar7 = this.f38114n;
                                this.U = (((((height8 - bVar7.f8187b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.M.getHeight();
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
        float f9;
        float f10;
        float f11;
        float f12;
        int i10;
        nh.g1 g1Var = this.f38112e;
        float positionAnimated = g1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -g1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(g1Var.getWidth(), 0, positionAnimated);
        if (this.S) {
            ViewGroup viewGroup = this.O;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.R;
                this.T = f13;
                float height = f13 + this.G.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                cd1 cd1Var = this.f38110b;
                int height2 = cd1Var.getHeight();
                i0.b bVar = this.f38114n;
                if (height > ((height2 - bVar.f8187b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = cd1Var.getHeight();
                    i0.b bVar2 = this.f38114n;
                    this.T = ((((height3 - bVar2.f8187b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.G.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        hv0 hv0Var = this.F;
        float f14 = this.Q;
        if (this.X) {
            f9 = 1.0f;
        } else {
            f9 = this.f38118x;
        }
        hv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f9) + lerp2);
        hv0 hv0Var2 = this.F;
        float f15 = this.R;
        float f16 = this.T;
        if (this.X) {
            f10 = 1.0f;
        } else {
            f10 = this.f38118x;
        }
        hv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.O;
        cd1 cd1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.D) {
                viewGroup2.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.O.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.F.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.F.getLeft()) - this.O.getLeft());
            }
            this.P = cd1Var2.getMeasuredWidth() - (this.O.getX() - lerp2);
            this.O.setTranslationY(((this.F.getY() + this.F.getHeight()) - this.O.getTop()) - cd1Var2.getTop());
            this.O.setAlpha(this.f38118x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f38118x);
            this.O.setScaleX(lerp3);
            this.O.setScaleY(lerp3);
        }
        dd1 dd1Var = this.E;
        float f18 = this.Q;
        if (this.X) {
            f11 = 1.0f;
        } else {
            f11 = this.f38118x;
        }
        dd1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        dd1 dd1Var2 = this.E;
        float f19 = this.R;
        float f20 = this.U;
        if (this.X) {
            f12 = 1.0f;
        } else {
            f12 = this.f38118x;
        }
        dd1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.M != null) {
            int O2 = this.E.O2(this.K);
            this.E.H2(O2);
            float G2 = this.E.G2(O2);
            if (this.D) {
                this.M.setTranslationX(((this.E.getPollButtonsLeft() + ((lerp + 0.0f) + this.E.getLeft())) - AndroidUtilities.dp(8.0f)) - this.M.getLeft());
            } else {
                ViewGroup viewGroup3 = this.M;
                float f21 = lerp + 0.0f;
                if (this.E.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.E.getLeft()) - this.M.getLeft());
            }
            this.N = cd1Var2.getMeasuredWidth() - (this.M.getX() - lerp2);
            this.M.setTranslationY(((this.E.getY() + ((int) G2)) - this.M.getTop()) - cd1Var2.getTop());
            this.M.setAlpha(this.f38118x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f38118x);
            this.M.setScaleX(lerp4);
            this.M.setScaleY(lerp4);
        }
        if (this.X) {
            this.F.setAlpha(this.f38118x);
            this.E.setAlpha(this.f38118x);
        }
        if (this.L != null) {
            float max = lerp2 + Math.max(0.0f, ((this.F.getBoundsLeft() + this.F.getBoundsRight()) / 2.0f) - (this.L.getWidth() * 0.8f));
            this.L.setTranslationX(max);
            this.L.setTranslationY(Math.max(0.0f, ((this.F.getY() - this.L.getHeight()) + AndroidUtilities.dp(22.0f)) - cd1Var2.getTop()));
            this.L.setAlpha(this.f38118x);
            View windowView = this.L.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f38118x);
            }
        }
        TextView textView = this.f38113f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f38118x);
        org.telegram.ui.Components.pb0 pb0Var = this.h;
        pb0Var.setSelectedTab(positionAnimated);
        pb0Var.setAlpha(this.f38118x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        cd1 cd1Var = this.f38110b;
        setContentView(cd1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        cd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(cd1Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.yl0.d(new b5(this, 28));
        this.J = true;
        b(true, null);
    }
}
