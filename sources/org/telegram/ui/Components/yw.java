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
public final class yw extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.ls {
    public Paint D;
    public int E;
    public AnimatorSet F;
    public final hy G;
    public int f40804a;
    public int f40805b;
    public final ch0 f40806c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView f40807e;
    public final FrameLayout f40808f;
    public final TextView h;
    public final TextView f40809n;
    public final ug.p0 f40810r;
    public TLRPC.TL_inputStickerSetID f40811s;
    public TLRPC.TL_inputStickerSetID f40812w;
    public uw f40813x;
    public boolean f40814y;

    public yw(hy hyVar, Context context) {
        super(context);
        this.G = hyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28478a;
        ?? imageView = new ImageView(context);
        this.f40806c = imageView;
        imageView.f(2131624314, 24, 24, null);
        int i7 = org.telegram.ui.ActionBar.k6.If;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.SRC_ATOP);
        addView((View) imageView, c8.ha.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var, i7, f6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setOnClickListener(new xw(this, 0));
        TextView textView = new TextView(context);
        this.f40807e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Bf;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, hyVar.z(i10)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, L2, null, f6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.id.M0(2131749445, null));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, c8.ha.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, c8.ha.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40808f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new xw(this, 1));
        addView(frameLayout, c8.ha.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.id.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(hyVar.z(i11), hyVar.z(org.telegram.ui.ActionBar.k6.Ei), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new xw(this, 2));
        frameLayout.addView(textView2, c8.ha.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f40809n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.id.M0(2131744858, null));
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Fi, f6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.z5.d(0, hyVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new xw(this, 3));
        frameLayout.addView(textView3, c8.ha.h(-2.0f, 26.0f, 8388661));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(16.0f), context, f6Var, false);
        this.f40810r = p0Var;
        p0Var.setIcon(2131624314);
        p0Var.b(org.telegram.messenger.id.M0(2131743879, null), new xw(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L3;
            marginLayoutParams.width = L3;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f40808f.addView(this.f40810r, c8.ha.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z9) {
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
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
        uw uwVar = this.f40813x;
        if (uwVar == null) {
            return;
        }
        boolean z16 = uwVar.f38750f;
        hy hyVar = this.G;
        if (!z16 && !hyVar.f34438p1.contains(Long.valueOf(uwVar.f38747b.f26983id))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f40813x.f38749e && !org.telegram.messenger.p10.i(hyVar.f34400c1).q() && !hyVar.U0) {
            i7 = 1;
        } else if (this.f40813x.f38751g) {
            if (z10) {
                i7 = 3;
            } else {
                i7 = 2;
            }
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.E == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            requestLayout();
        }
        this.E = i7;
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
        }
        if (i7 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        ug.p0 p0Var = this.f40810r;
        p0Var.setEnabled(z13);
        if (i7 == 2) {
            z14 = true;
        } else {
            z14 = false;
        }
        TextView textView = this.h;
        textView.setEnabled(z14);
        if (i7 == 3) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView2 = this.f40809n;
        textView2.setEnabled(z15);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        ch0 ch0Var = this.f40806c;
        if (z9) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ch0Var, property, fArr);
            if (i7 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c10] = f23;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ch0Var, property2, fArr2);
            if (i7 == 1) {
                f24 = org.telegram.messenger.g0.L(16.0f);
            } else {
                f24 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c10] = f24;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k5Var, property, fArr3);
            if (i7 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c10] = f25;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p0Var, property2, fArr4);
            if (i7 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f26;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p0Var, property3, fArr5);
            if (i7 == 1) {
                f27 = 1.0f;
            } else {
                f27 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c10] = f27;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, property4, fArr6);
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
            this.F.addListener(new hi.m2(this, i7, 9));
            this.F.setDuration(250L);
            this.F.setInterpolator(new OvershootInterpolator(1.02f));
            this.F.start();
            return;
        }
        if (i7 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ch0Var.setAlpha(f10);
        if (i7 == 1) {
            f11 = 0.0f;
        } else {
            f11 = -org.telegram.messenger.g0.L(16.0f);
        }
        ch0Var.setTranslationX(f11);
        if (i7 == 1) {
            f12 = org.telegram.messenger.g0.L(16.0f);
        } else {
            f12 = 0.0f;
        }
        k5Var.setTranslationX(f12);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        p0Var.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        p0Var.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        p0Var.setScaleY(f15);
        if (i7 == 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        p0Var.setVisibility(i10);
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
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.TL_messages_stickerSet o03;
        hy hyVar = this.G;
        int i11 = hyVar.f34400c1;
        if (i7 == org.telegram.messenger.qs.B0) {
            if (this.f40811s != null && (o03 = org.telegram.messenger.ui.b0(i11).o0(this.f40811s.f26976id)) != null && o03.set != null) {
                org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
                if (f2Var == null) {
                    f2Var = new bi.w4(this, 7);
                }
                ru.J0(f2Var, o03, true, null, new gp(this, 13));
                this.f40811s = null;
            }
            if (this.f40812w != null && (o02 = org.telegram.messenger.ui.b0(i11).o0(this.f40812w.f26976id)) != null && o02.set != null) {
                org.telegram.ui.ActionBar.f2 f2Var2 = hyVar.Y1;
                if (f2Var2 == null) {
                    f2Var2 = new bi.w4(this, 7);
                }
                org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                fq fqVar = new fq(11, this, o02);
                Pattern pattern = ru.M1;
                if (f2Var3.getFragmentView() != null) {
                    org.telegram.messenger.ui.b0(f2Var3.getCurrentAccount()).g2(f2Var3.getFragmentView().getContext(), o02, null, 0, f2Var3, null, true, true, fqVar, false);
                }
                this.f40812w = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.G.f34400c1).n(this, org.telegram.messenger.qs.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f40814y) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setStrokeWidth(1.0f);
                this.D.setColor(this.G.z(org.telegram.ui.ActionBar.k6.f27853d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.D);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(11.0f) + this.f40808f.getWidth();
        TextView textView = this.f40807e;
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
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        if (this.E == 0) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        marginLayoutParams.topMargin = org.telegram.messenger.g0.L(f10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.E == 0) {
            f11 = 32.0f;
        } else {
            f11 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), 1073741824));
    }

    @Override
    public final void updateColors() {
        hy hyVar = this.G;
        try {
            int z9 = hyVar.z(org.telegram.ui.ActionBar.k6.Ci);
            int z10 = hyVar.z(org.telegram.ui.ActionBar.k6.Ei);
            if (z9 == this.f40804a) {
                if (z10 != this.f40805b) {
                }
                invalidate();
            }
            this.f40804a = z9;
            this.f40805b = z10;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z9, false);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z10, true);
                textView.invalidate();
            }
            TextView textView2 = this.f40809n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.k6.H1(textView2.getBackground(), z9 & 452984831, true);
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
