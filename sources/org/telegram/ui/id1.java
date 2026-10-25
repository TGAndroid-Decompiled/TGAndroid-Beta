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
public final class id1 extends Dialog {
    public final hh.b E;
    public final ch.b F;
    public MessageObject G;
    public boolean H;
    public gd1 I;
    public wv0 J;
    public org.telegram.ui.Cells.s1 K;
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
    public final org.telegram.ui.ActionBar.u6 f40212a;
    public boolean f40213a0;
    public final fd1 f40214b;
    public boolean f40215b0;
    public final fd1 f40216c;
    public qm f40217c0;
    public final fd1 d;
    public ValueAnimator f40218d0;
    public final fi.h1 e;
    public ValueAnimator f40219e0;
    public final TextView f40220f;
    public final org.telegram.ui.Components.lc0 h;
    public i0.b f40221n;
    public Bitmap f40222r;
    public BitmapShader f40223s;
    public Paint v;
    public Matrix f40224w;
    public float f40225x;
    public float f40226y;

    public id1(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40221n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f40213a0 = false;
        this.f40212a = u6Var;
        fd1 fd1Var = new fd1(this, activity, 0);
        this.f40214b = fd1Var;
        fd1Var.setOnClickListener(new t21(this, 7));
        hh.b bVar = new hh.b();
        this.E = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.F = bVar2;
        bVar2.f6301f = new jh.k(fd1Var);
        bVar2.f6302g = fd1Var;
        fd1 fd1Var2 = new fd1(this, activity, 1);
        this.f40216c = fd1Var2;
        fd1Var2.setClipToPadding(false);
        fd1Var.addView(fd1Var2, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fi.h1 h1Var = new fi.h1(this, activity, 8);
        this.e = h1Var;
        h1Var.setAdapter(new bi.e5(this, activity, 4));
        fd1Var2.addView(h1Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fd1 fd1Var3 = new fd1(this, activity, 2);
        this.d = fd1Var3;
        fd1Var2.addView(fd1Var3, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0(activity, u6Var);
        this.h = lc0Var;
        lc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        lc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        fd1Var2.addView(lc0Var, org.telegram.ui.Components.gb1.i(-1, 66, 80));
        lc0Var.setOnTabClick(new t3(h1Var, 24));
        eh.d c10 = bVar2.c(lc0Var, null, false);
        c10.v(gh.c.k(u6Var));
        c10.f9966x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        lc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f40220f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(lc0Var.getColor());
        org.telegram.messenger.vh.k(R.string.TodoMenuHint, textView, 17);
        fd1Var2.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        uv0 uv0Var = new uv0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(fd1Var, uv0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.d60 d60Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f40218d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40219e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40225x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40218d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final id1 f38069b;

            {
                this.f38069b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        id1 id1Var = this.f38069b;
                        id1Var.f40225x = floatValue;
                        id1Var.f40214b.invalidate();
                        id1Var.f40216c.invalidate();
                        id1Var.e();
                        return;
                    default:
                        id1 id1Var2 = this.f38069b;
                        id1Var2.getClass();
                        id1Var2.f40226y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40218d0.addListener(new ai.l0(this, z10, d60Var, 14));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40218d0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        valueAnimator3.setInterpolator(dsVar);
        this.f40218d0.setDuration(j10);
        this.f40218d0.start();
        float f12 = this.f40226y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40219e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final id1 f38069b;

            {
                this.f38069b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        id1 id1Var = this.f38069b;
                        id1Var.f40225x = floatValue;
                        id1Var.f40214b.invalidate();
                        id1Var.f40216c.invalidate();
                        id1Var.e();
                        return;
                    default:
                        id1 id1Var2 = this.f38069b;
                        id1Var2.getClass();
                        id1Var2.f40226y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40219e0.addListener(new q40(11, this, z10));
        this.f40219e0.setDuration(((float) j10) * 1.5f);
        this.f40219e0.setInterpolator(dsVar);
        this.f40219e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.fl0 fl0Var;
        if (z10 && (fl0Var = this.P) != null && fl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f4060q) {
            this.P.e();
        } else if (this.f40213a0) {
        } else {
            this.f40213a0 = true;
            this.W = false;
            fi.h1 h1Var = this.e;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.s1 s1Var2 = this.K;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(4);
                    this.K.invalidate();
                }
            } else if (!z10 && (s1Var = this.K) != null) {
                s1Var.setVisibility(0);
                org.telegram.ui.Cells.s1 s1Var3 = this.K;
                s1Var3.K7 = -1;
                s1Var3.invalidate();
            }
            this.f40215b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.d60(18, this, z11));
            this.f40214b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            fd1 fd1Var = this.f40214b;
            if (fd1Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.K;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40221n;
                    this.U = i11 - bVar.f13450a;
                    float f7 = iArr[1] - bVar.f13451b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = fd1Var.getHeight();
                            i0.b bVar2 = this.f40221n;
                            if (height > ((height2 - bVar2.f13451b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = fd1Var.getHeight();
                                i0.b bVar3 = this.f40221n;
                                this.X = ((((height3 - bVar3.f13451b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = fd1Var.getHeight();
                        i0.b bVar4 = this.f40221n;
                        int dp = ((height4 - bVar4.f13451b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f40220f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = fd1Var.getHeight();
                            i0.b bVar5 = this.f40221n;
                            this.Y = ((((height5 - bVar5.f13451b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = fd1Var.getHeight();
                            i0.b bVar6 = this.f40221n;
                            if (height6 > (((height7 - bVar6.f13451b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = fd1Var.getHeight();
                                i0.b bVar7 = this.f40221n;
                                this.Y = (((((height8 - bVar7.f13451b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        fi.h1 h1Var = this.e;
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
                fd1 fd1Var = this.f40214b;
                int height2 = fd1Var.getHeight();
                i0.b bVar = this.f40221n;
                if (height > ((height2 - bVar.f13451b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = fd1Var.getHeight();
                    i0.b bVar2 = this.f40221n;
                    this.X = ((((height3 - bVar2.f13451b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        wv0 wv0Var = this.J;
        float f14 = this.U;
        if (this.f40215b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f40225x;
        }
        wv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        wv0 wv0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f40215b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40225x;
        }
        wv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        fd1 fd1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.J.B3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = fd1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - fd1Var2.getTop());
            this.S.setAlpha(this.f40225x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40225x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        gd1 gd1Var = this.I;
        float f18 = this.U;
        if (this.f40215b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40225x;
        }
        gd1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        gd1 gd1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f40215b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40225x;
        }
        gd1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.Q != null) {
            int O2 = this.I.O2(this.O);
            this.I.H2(O2);
            float G2 = this.I.G2(O2);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((lerp + 0.0f) + this.I.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                ViewGroup viewGroup3 = this.Q;
                float f21 = lerp + 0.0f;
                if (this.I.B3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = fd1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - fd1Var2.getTop());
            this.Q.setAlpha(this.f40225x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40225x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f40215b0) {
            this.J.setAlpha(this.f40225x);
            this.I.setAlpha(this.f40225x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - fd1Var2.getTop()));
            this.P.setAlpha(this.f40225x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40225x);
            }
        }
        TextView textView = this.f40220f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40225x);
        org.telegram.ui.Components.lc0 lc0Var = this.h;
        lc0Var.setSelectedTab(positionAnimated);
        lc0Var.setAlpha(this.f40225x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fd1 fd1Var = this.f40214b;
        setContentView(fd1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        fd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(fd1Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.hn0.d(new e5(this, 28));
        this.N = true;
        b(true, null);
    }
}
