package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class ix extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs {
    public Paint E;
    public int F;
    public AnimatorSet G;
    public final qy H;
    public int f36180a;
    public int f36181b;
    public final qh0 f36182c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView f36183e;
    public final FrameLayout f36184f;
    public final TextView h;
    public final TextView f36185n;
    public final ug.r0 f36186r;
    public TLRPC.TL_inputStickerSetID f36187s;
    public TLRPC.TL_inputStickerSetID f36188w;
    public ex f36189x;
    public boolean f36190y;

    public ix(qy qyVar, Context context) {
        super(context);
        this.H = qyVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30163a;
        ?? imageView = new ImageView(context);
        this.f36182c = imageView;
        imageView.f(2131624315, 24, 24, null);
        int i7 = org.telegram.ui.ActionBar.n6.Lf;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.SRC_ATOP);
        addView((View) imageView, c8.na.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, i6Var);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setOnClickListener(new hx(this, 0));
        TextView textView = new TextView(context);
        this.f36183e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Ef;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, qyVar.z(i10)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.gd.N0(2131749251, null));
        n5Var.setEllipsizeByGradient(true);
        addView(n5Var, c8.na.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, c8.na.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36184f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new hx(this, 1));
        addView(frameLayout, c8.na.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.gd.N0(2131754483, null));
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        textView2.setBackground(org.telegram.ui.ActionBar.b6.d(qyVar.z(i11), qyVar.z(org.telegram.ui.ActionBar.n6.Hi), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new hx(this, 2));
        frameLayout.addView(textView2, c8.na.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f36185n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.gd.N0(2131744614, null));
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ii, i6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.b6.d(0, qyVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new hx(this, 3));
        frameLayout.addView(textView3, c8.na.h(-2.0f, 26.0f, 8388661));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(16.0f), context, i6Var, false);
        this.f36186r = r0Var;
        r0Var.setIcon(2131624315);
        r0Var.b(org.telegram.messenger.gd.N0(2131743629, null), new hx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            r0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f36184f.addView(this.f36186r, c8.na.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        boolean z11;
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        int i11;
        float f19;
        float f20;
        float f21;
        int i12;
        char c10;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        ex exVar = this.f36189x;
        if (exVar == null) {
            return;
        }
        boolean z17 = exVar.f34859f;
        qy qyVar = this.H;
        if (!z17 && !qyVar.f39085q1.contains(Long.valueOf(exVar.f34856b.f28519id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f36189x.f34858e && !org.telegram.messenger.i10.i(qyVar.f39047d1).q() && !qyVar.V0) {
            i7 = 1;
        } else if (this.f36189x.f34860g) {
            if (z11) {
                i7 = 3;
            } else {
                i7 = 2;
            }
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.F == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            requestLayout();
        }
        this.F = i7;
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
        }
        if (i7 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        ug.r0 r0Var = this.f36186r;
        r0Var.setEnabled(z14);
        if (i7 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView = this.h;
        textView.setEnabled(z15);
        if (i7 == 3) {
            z16 = true;
        } else {
            z16 = false;
        }
        TextView textView2 = this.f36185n;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        qh0 qh0Var = this.f36182c;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            if (i7 == 1) {
                f22 = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                f22 = -org.telegram.messenger.g0.L(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c10] = f22;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qh0Var, property, fArr);
            if (i7 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c10] = f23;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qh0Var, property2, fArr2);
            if (i7 == 1) {
                f24 = org.telegram.messenger.g0.L(16.0f);
            } else {
                f24 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c10] = f24;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n5Var, property, fArr3);
            if (i7 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c10] = f25;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r0Var, property2, fArr4);
            if (i7 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f26;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r0Var, property3, fArr5);
            if (i7 == 1) {
                f27 = 1.0f;
            } else {
                f27 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c10] = f27;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r0Var, property4, fArr6);
            if (i7 == 2) {
                f28 = 1.0f;
            } else {
                f28 = 0.0f;
            }
            float[] fArr7 = new float[1];
            fArr7[c10] = f28;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, fArr7);
            if (i7 == 2) {
                f29 = 1.0f;
            } else {
                f29 = 0.6f;
            }
            float[] fArr8 = new float[1];
            fArr8[c10] = f29;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, fArr8);
            if (i7 == 2) {
                f30 = 1.0f;
            } else {
                f30 = 0.6f;
            }
            float[] fArr9 = new float[1];
            fArr9[c10] = f30;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, fArr9);
            if (i7 == 3) {
                f31 = 1.0f;
            } else {
                f31 = 0.0f;
            }
            float[] fArr10 = new float[1];
            fArr10[c10] = f31;
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, fArr10);
            if (i7 == 3) {
                f32 = 1.0f;
            } else {
                f32 = 0.6f;
            }
            float[] fArr11 = new float[1];
            fArr11[c10] = f32;
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, fArr11);
            if (i7 == 3) {
                f33 = 1.0f;
            } else {
                f33 = 0.6f;
            }
            float[] fArr12 = new float[1];
            fArr12[c10] = f33;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, property4, fArr12);
            Animator[] animatorArr = new Animator[12];
            animatorArr[c10] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofFloat8;
            animatorArr[8] = ofFloat9;
            animatorArr[9] = ofFloat10;
            animatorArr[10] = ofFloat11;
            animatorArr[11] = ofFloat12;
            animatorSet2.playTogether(animatorArr);
            this.G.addListener(new ki.e2(this, i7, 9));
            this.G.setDuration(250L);
            this.G.setInterpolator(new OvershootInterpolator(1.02f));
            this.G.start();
            return;
        }
        if (i7 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        qh0Var.setAlpha(f10);
        if (i7 == 1) {
            f11 = 0.0f;
        } else {
            f11 = -org.telegram.messenger.g0.L(16.0f);
        }
        qh0Var.setTranslationX(f11);
        if (i7 == 1) {
            f12 = org.telegram.messenger.g0.L(16.0f);
        } else {
            f12 = 0.0f;
        }
        n5Var.setTranslationX(f12);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        r0Var.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        r0Var.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        r0Var.setScaleY(f15);
        if (i7 == 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        r0Var.setVisibility(i10);
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        textView.setAlpha(f16);
        if (i7 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.6f;
        }
        textView.setScaleX(f17);
        if (i7 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.6f;
        }
        textView.setScaleY(f18);
        if (i7 == 2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (i7 == 3) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        textView2.setAlpha(f19);
        if (i7 == 3) {
            f20 = 1.0f;
        } else {
            f20 = 0.6f;
        }
        textView2.setScaleX(f20);
        if (i7 == 3) {
            f21 = 1.0f;
        } else {
            f21 = 0.6f;
        }
        textView2.setScaleY(f21);
        if (i7 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView2.setVisibility(i12);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet q02;
        TLRPC.TL_messages_stickerSet q03;
        qy qyVar = this.H;
        int i11 = qyVar.f39047d1;
        if (i7 == org.telegram.messenger.ks.B0) {
            if (this.f36187s != null && (q03 = org.telegram.messenger.ri.d0(i11).q0(this.f36187s.f28512id)) != null && q03.set != null) {
                org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
                if (g2Var == null) {
                    g2Var = new bi.e9(this, 8);
                }
                bv.K0(g2Var, q03, true, null, new lo(this, 15));
                this.f36187s = null;
            }
            if (this.f36188w != null && (q02 = org.telegram.messenger.ri.d0(i11).q0(this.f36188w.f28512id)) != null && q02.set != null) {
                org.telegram.ui.ActionBar.g2 g2Var2 = qyVar.Z1;
                if (g2Var2 == null) {
                    g2Var2 = new bi.e9(this, 8);
                }
                org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                bt btVar = new bt(5, this, q02);
                Pattern pattern = bv.Q1;
                if (g2Var3.getFragmentView() != null) {
                    org.telegram.messenger.ri.d0(g2Var3.getCurrentAccount()).l2(g2Var3.getFragmentView().getContext(), q02, null, 0, g2Var3, null, true, true, btVar, false);
                }
                this.f36188w = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.H.f39047d1).n(this, org.telegram.messenger.ks.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f36190y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.z(org.telegram.ui.ActionBar.n6.f29452d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.E);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(11.0f) + this.f36184f.getWidth();
        TextView textView = this.f36183e;
        if (textView.getVisibility() == 0) {
            i13 = textView.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        int i14 = L + i13;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setRightPadding(i14);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(org.telegram.messenger.g0.L(4.0f) + n5Var.getTextWidth());
            float L2 = org.telegram.messenger.g0.L(4.0f) + (n5Var.getMaxTextWidth() - i14);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        if (this.F == 0) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.F == 0) {
            f11 = 32.0f;
        } else {
            f11 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
    }

    @Override
    public final void updateColors() {
        qy qyVar = this.H;
        try {
            int z10 = qyVar.z(org.telegram.ui.ActionBar.n6.Fi);
            int z11 = qyVar.z(org.telegram.ui.ActionBar.n6.Hi);
            if (z10 == this.f36180a) {
                if (z11 != this.f36181b) {
                }
                invalidate();
            }
            this.f36180a = z10;
            this.f36181b = z11;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), z10, false);
                org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), z11, true);
                textView.invalidate();
            }
            TextView textView2 = this.f36185n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.n6.H1(textView2.getBackground(), z10 & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
