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
public final class le1 extends Dialog {
    public final gh.b E;
    public final bh.b F;
    public MessageObject G;
    public boolean H;
    public je1 I;
    public kw0 J;
    public org.telegram.ui.Cells.t1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.fk0 P;
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
    public final org.telegram.ui.ActionBar.f6 f38342a;
    public boolean f38343a0;
    public final ie1 f38344b;
    public boolean f38345b0;
    public final ie1 f38346c;
    public zm f38347c0;
    public final ie1 d;
    public ValueAnimator f38348d0;
    public final di.i1 f38349e;
    public ValueAnimator f38350e0;
    public final TextView f38351f;
    public final org.telegram.ui.Components.ub0 h;
    public i0.c f38352n;
    public Bitmap f38353r;
    public BitmapShader f38354s;
    public Paint v;
    public Matrix f38355w;
    public float f38356x;
    public float f38357y;

    public le1(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f38352n = i0.c.f11450e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f38343a0 = false;
        this.f38342a = f6Var;
        ie1 ie1Var = new ie1(this, activity, 0);
        this.f38344b = ie1Var;
        ie1Var.setOnClickListener(new j41(this, 6));
        gh.b bVar = new gh.b();
        this.E = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.d = new ih.k(ie1Var);
        bVar2.f2680e = ie1Var;
        ie1 ie1Var2 = new ie1(this, activity, 1);
        this.f38346c = ie1Var2;
        ie1Var2.setClipToPadding(false);
        ie1Var.addView(ie1Var2, w7.x5.e(-1, -1, 119));
        di.i1 i1Var = new di.i1(this, activity, 8);
        this.f38349e = i1Var;
        i1Var.setAdapter(new hw0(this, activity, 2));
        ie1Var2.addView(i1Var, w7.x5.e(-1, -1, 119));
        ie1 ie1Var3 = new ie1(this, activity, 2);
        this.d = ie1Var3;
        ie1Var2.addView(ie1Var3, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.ub0 ub0Var = new org.telegram.ui.Components.ub0(activity, f6Var);
        this.h = ub0Var;
        ub0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        ub0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        ie1Var2.addView(ub0Var, w7.x5.e(-1, 66, 80));
        ub0Var.setOnTabClick(new t3(i1Var, 22));
        dh.d c10 = bVar2.c(ub0Var, null, false);
        c10.n(fh.b.k(f6Var));
        c10.h.f6849e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ub0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f38351f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ub0Var.getColor());
        org.telegram.messenger.wl.k(R.string.TodoMenuHint, textView, 17);
        ie1Var2.addView(textView, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        iw0 iw0Var = new iw0(this, 6);
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.a0.j(ie1Var, iw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.mr0 mr0Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f38348d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f38350e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f38356x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38348d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final le1 f36039b;

            {
                this.f36039b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        le1 le1Var = this.f36039b;
                        le1Var.f38356x = floatValue;
                        le1Var.f38344b.invalidate();
                        le1Var.f38346c.invalidate();
                        le1Var.e();
                        return;
                    default:
                        le1 le1Var2 = this.f36039b;
                        le1Var2.getClass();
                        le1Var2.f38357y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f38348d0.addListener(new ah.r0(this, z10, mr0Var, 12));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f38348d0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f38348d0.setDuration(j3);
        this.f38348d0.start();
        float f12 = this.f38357y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f38350e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final le1 f36039b;

            {
                this.f36039b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        le1 le1Var = this.f36039b;
                        le1Var.f38356x = floatValue;
                        le1Var.f38344b.invalidate();
                        le1Var.f38346c.invalidate();
                        le1Var.e();
                        return;
                    default:
                        le1 le1Var2 = this.f36039b;
                        le1Var2.getClass();
                        le1Var2.f38357y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f38350e0.addListener(new e50(11, this, z10));
        this.f38350e0.setDuration(((float) j3) * 1.5f);
        this.f38350e0.setInterpolator(prVar);
        this.f38350e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.fk0 fk0Var;
        if (z10 && (fk0Var = this.P) != null && fk0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f711q) {
            this.P.e();
        } else if (this.f38343a0) {
        } else {
            this.f38343a0 = true;
            this.W = false;
            di.i1 i1Var = this.f38349e;
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
            this.f38345b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.mr0(12, this, z11));
            this.f38344b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            ie1 ie1Var = this.f38344b;
            if (ie1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.K;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.c cVar = this.f38352n;
                    this.U = i11 - cVar.f11451a;
                    float f7 = iArr[1] - cVar.f11452b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = ie1Var.getHeight();
                            i0.c cVar2 = this.f38352n;
                            if (height > ((height2 - cVar2.f11452b) - cVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = ie1Var.getHeight();
                                i0.c cVar3 = this.f38352n;
                                this.X = ((((height3 - cVar3.f11452b) - cVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = ie1Var.getHeight();
                        i0.c cVar4 = this.f38352n;
                        int dp = ((height4 - cVar4.f11452b) - cVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f38351f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = ie1Var.getHeight();
                            i0.c cVar5 = this.f38352n;
                            this.Y = ((((height5 - cVar5.f11452b) - cVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = ie1Var.getHeight();
                            i0.c cVar6 = this.f38352n;
                            if (height6 > (((height7 - cVar6.f11452b) - cVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = ie1Var.getHeight();
                                i0.c cVar7 = this.f38352n;
                                this.Y = (((((height8 - cVar7.f11452b) - cVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        di.i1 i1Var = this.f38349e;
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
                ie1 ie1Var = this.f38344b;
                int height2 = ie1Var.getHeight();
                i0.c cVar = this.f38352n;
                if (height > ((height2 - cVar.f11452b) - cVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = ie1Var.getHeight();
                    i0.c cVar2 = this.f38352n;
                    this.X = ((((height3 - cVar2.f11452b) - cVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        kw0 kw0Var = this.J;
        float f14 = this.U;
        if (this.f38345b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f38356x;
        }
        kw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        kw0 kw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f38345b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f38356x;
        }
        kw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        ie1 ie1Var2 = this.d;
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
            this.T = ie1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - ie1Var2.getTop());
            this.S.setAlpha(this.f38356x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f38356x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        je1 je1Var = this.I;
        float f18 = this.U;
        if (this.f38345b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f38356x;
        }
        je1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        je1 je1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f38345b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f38356x;
        }
        je1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = ie1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - ie1Var2.getTop());
            this.Q.setAlpha(this.f38356x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f38356x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f38345b0) {
            this.J.setAlpha(this.f38356x);
            this.I.setAlpha(this.f38356x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - ie1Var2.getTop()));
            this.P.setAlpha(this.f38356x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f38356x);
            }
        }
        TextView textView = this.f38351f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f38356x);
        org.telegram.ui.Components.ub0 ub0Var = this.h;
        ub0Var.setSelectedTab(positionAnimated);
        ub0Var.setAlpha(this.f38356x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ie1 ie1Var = this.f38344b;
        setContentView(ie1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        ie1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(ie1Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.am0.d(new b5(this, 28));
        this.N = true;
        b(true, null);
    }
}
