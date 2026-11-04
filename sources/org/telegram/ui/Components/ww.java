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
public final class ww extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs {
    public Paint E;
    public int F;
    public AnimatorSet G;
    public final ey H;
    public int f40156a;
    public int f40157b;
    public final fh0 f40158c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView f40159e;
    public final FrameLayout f40160f;
    public final TextView h;
    public final TextView f40161n;
    public final vg.o0 f40162r;
    public TLRPC.TL_inputStickerSetID f40163s;
    public TLRPC.TL_inputStickerSetID f40164w;
    public sw f40165x;
    public boolean f40166y;

    public ww(ey eyVar, Context context) {
        super(context);
        this.H = eyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        ?? imageView = new ImageView(context);
        this.f40158c = imageView;
        imageView.f(2131624314, 24, 24, null);
        int i3 = org.telegram.ui.ActionBar.k6.If;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.SRC_ATOP);
        addView((View) imageView, b8.mf.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var, i3, e6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setOnClickListener(new vw(this, 0));
        TextView textView = new TextView(context);
        this.f40159e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Bf;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, eyVar.z(i10)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, L2, null, e6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.bd.M0(2131749452, null));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, b8.mf.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, b8.mf.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40160f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new vw(this, 1));
        addView(frameLayout, b8.mf.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.bd.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(eyVar.z(i11), eyVar.z(org.telegram.ui.ActionBar.k6.Ei), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new vw(this, 2));
        frameLayout.addView(textView2, b8.mf.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f40161n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.bd.M0(2131744865, null));
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Fi, e6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.y5.d(0, eyVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new vw(this, 3));
        frameLayout.addView(textView3, b8.mf.h(-2.0f, 26.0f, 8388661));
        vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(16.0f), context, e6Var, false);
        this.f40162r = o0Var;
        o0Var.setIcon(2131624314);
        o0Var.b(org.telegram.messenger.bd.M0(2131743886, null), new vw(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L3;
            marginLayoutParams.width = L3;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) o0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            o0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f40160f.addView(this.f40162r, b8.mf.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        boolean z11;
        int i3;
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
        char c2;
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
        sw swVar = this.f40165x;
        if (swVar == null) {
            return;
        }
        boolean z17 = swVar.f38128f;
        ey eyVar = this.H;
        if (!z17 && !eyVar.f33568q1.contains(Long.valueOf(swVar.f38125b.f27028id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f40165x.f38127e && !org.telegram.messenger.h10.i(eyVar.f33529d1).q() && !eyVar.V0) {
            i3 = 1;
        } else if (this.f40165x.f38129g) {
            if (z11) {
                i3 = 3;
            } else {
                i3 = 2;
            }
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
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
        this.F = i3;
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
        }
        if (i3 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        vg.o0 o0Var = this.f40162r;
        o0Var.setEnabled(z14);
        if (i3 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView = this.h;
        textView.setEnabled(z15);
        if (i3 == 3) {
            z16 = true;
        } else {
            z16 = false;
        }
        TextView textView2 = this.f40161n;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        fh0 fh0Var = this.f40158c;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            if (i3 == 1) {
                f22 = 0.0f;
                c2 = 0;
            } else {
                c2 = 0;
                f22 = -org.telegram.messenger.g0.L(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c2] = f22;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fh0Var, property, fArr);
            if (i3 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c2] = f23;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fh0Var, property2, fArr2);
            if (i3 == 1) {
                f24 = org.telegram.messenger.g0.L(16.0f);
            } else {
                f24 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c2] = f24;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k5Var, property, fArr3);
            if (i3 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c2] = f25;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o0Var, property2, fArr4);
            if (i3 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c2] = f26;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o0Var, property3, fArr5);
            if (i3 == 1) {
                f27 = 1.0f;
            } else {
                f27 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c2] = f27;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(o0Var, property4, fArr6);
            if (i3 == 2) {
                f28 = 1.0f;
            } else {
                f28 = 0.0f;
            }
            float[] fArr7 = new float[1];
            fArr7[c2] = f28;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, fArr7);
            if (i3 == 2) {
                f29 = 1.0f;
            } else {
                f29 = 0.6f;
            }
            float[] fArr8 = new float[1];
            fArr8[c2] = f29;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, fArr8);
            if (i3 == 2) {
                f30 = 1.0f;
            } else {
                f30 = 0.6f;
            }
            float[] fArr9 = new float[1];
            fArr9[c2] = f30;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, fArr9);
            if (i3 == 3) {
                f31 = 1.0f;
            } else {
                f31 = 0.0f;
            }
            float[] fArr10 = new float[1];
            fArr10[c2] = f31;
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, fArr10);
            if (i3 == 3) {
                f32 = 1.0f;
            } else {
                f32 = 0.6f;
            }
            float[] fArr11 = new float[1];
            fArr11[c2] = f32;
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, fArr11);
            if (i3 == 3) {
                f33 = 1.0f;
            } else {
                f33 = 0.6f;
            }
            float[] fArr12 = new float[1];
            fArr12[c2] = f33;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, property4, fArr12);
            Animator[] animatorArr = new Animator[12];
            animatorArr[c2] = ofFloat;
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
            this.G.addListener(new ii.m2(this, i3, 9));
            this.G.setDuration(250L);
            this.G.setInterpolator(new OvershootInterpolator(1.02f));
            this.G.start();
            return;
        }
        if (i3 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        fh0Var.setAlpha(f10);
        if (i3 == 1) {
            f11 = 0.0f;
        } else {
            f11 = -org.telegram.messenger.g0.L(16.0f);
        }
        fh0Var.setTranslationX(f11);
        if (i3 == 1) {
            f12 = org.telegram.messenger.g0.L(16.0f);
        } else {
            f12 = 0.0f;
        }
        k5Var.setTranslationX(f12);
        if (i3 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        o0Var.setAlpha(f13);
        if (i3 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        o0Var.setScaleX(f14);
        if (i3 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        o0Var.setScaleY(f15);
        if (i3 == 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        o0Var.setVisibility(i10);
        if (i3 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        textView.setAlpha(f16);
        if (i3 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.6f;
        }
        textView.setScaleX(f17);
        if (i3 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.6f;
        }
        textView.setScaleY(f18);
        if (i3 == 2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (i3 == 3) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        textView2.setAlpha(f19);
        if (i3 == 3) {
            f20 = 1.0f;
        } else {
            f20 = 0.6f;
        }
        textView2.setScaleX(f20);
        if (i3 == 3) {
            f21 = 1.0f;
        } else {
            f21 = 0.6f;
        }
        textView2.setScaleY(f21);
        if (i3 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView2.setVisibility(i12);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.TL_messages_stickerSet o03;
        ey eyVar = this.H;
        int i11 = eyVar.f33529d1;
        if (i3 == org.telegram.messenger.hs.B0) {
            if (this.f40163s != null && (o03 = org.telegram.messenger.li.b0(i11).o0(this.f40163s.f27021id)) != null && o03.set != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
                if (d2Var == null) {
                    d2Var = new ai.c7(this, 8);
                }
                pu.J0(d2Var, o03, true, null, new gp(this, 13));
                this.f40163s = null;
            }
            if (this.f40164w != null && (o02 = org.telegram.messenger.li.b0(i11).o0(this.f40164w.f27021id)) != null && o02.set != null) {
                org.telegram.ui.ActionBar.d2 d2Var2 = eyVar.Z1;
                if (d2Var2 == null) {
                    d2Var2 = new ai.c7(this, 8);
                }
                org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                cl clVar = new cl(16, this, o02);
                Pattern pattern = pu.N1;
                if (d2Var3.getFragmentView() != null) {
                    org.telegram.messenger.li.b0(d2Var3.getCurrentAccount()).g2(d2Var3.getFragmentView().getContext(), o02, null, 0, d2Var3, null, true, true, clVar, false);
                }
                this.f40164w = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.H.f33529d1).n(this, org.telegram.messenger.hs.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f40166y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.z(org.telegram.ui.ActionBar.k6.f27879d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.E);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(11.0f) + this.f40160f.getWidth();
        TextView textView = this.f40159e;
        if (textView.getVisibility() == 0) {
            i13 = textView.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        int i14 = L + i13;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setRightPadding(i14);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(org.telegram.messenger.g0.L(4.0f) + k5Var.getTextWidth());
            float L2 = org.telegram.messenger.g0.L(4.0f) + (k5Var.getMaxTextWidth() - i14);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        float f11;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        if (this.F == 0) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.F == 0) {
            f11 = 32.0f;
        } else {
            f11 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
    }

    @Override
    public final void updateColors() {
        ey eyVar = this.H;
        try {
            int z10 = eyVar.z(org.telegram.ui.ActionBar.k6.Ci);
            int z11 = eyVar.z(org.telegram.ui.ActionBar.k6.Ei);
            if (z10 == this.f40156a) {
                if (z11 != this.f40157b) {
                }
                invalidate();
            }
            this.f40156a = z10;
            this.f40157b = z11;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z10, false);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z11, true);
                textView.invalidate();
            }
            TextView textView2 = this.f40161n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.k6.H1(textView2.getBackground(), z10 & 452984831, true);
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
