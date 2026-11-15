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
public final class dx extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is {
    public Paint E;
    public int F;
    public AnimatorSet G;
    public final ly H;
    public int f34072a;
    public int f34073b;
    public final fh0 f34074c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView f34075e;
    public final FrameLayout f34076f;
    public final TextView h;
    public final TextView f34077n;
    public final ug.q0 f34078r;
    public TLRPC.TL_inputStickerSetID f34079s;
    public TLRPC.TL_inputStickerSetID f34080w;
    public zw f34081x;
    public boolean f34082y;

    public dx(ly lyVar, Context context) {
        super(context);
        this.H = lyVar;
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.f29534a;
        ?? imageView = new ImageView(context);
        this.f34074c = imageView;
        imageView.f(2131624315, 24, 24, null);
        int i7 = org.telegram.ui.ActionBar.j6.Lf;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.SRC_ATOP);
        addView((View) imageView, c8.ja.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(15);
        org.telegram.ui.ActionBar.q6.X(j5Var, i7, e6Var);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setOnClickListener(new cx(this, 0));
        TextView textView = new TextView(context);
        this.f34075e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Ef;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.12f, lyVar.z(i10)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(textView, d02, K, null, e6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.hd.M0(2131749444, null));
        j5Var.setEllipsizeByGradient(true);
        addView(j5Var, c8.ja.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, c8.ja.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34076f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new cx(this, 1));
        addView(frameLayout, c8.ja.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.hd.M0(2131754486, null));
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(lyVar.z(i11), lyVar.z(org.telegram.ui.ActionBar.j6.Hi), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new cx(this, 2));
        frameLayout.addView(textView2, c8.ja.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f34077n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.hd.M0(2131744855, null));
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.Ii, e6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.y5.d(0, lyVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new cx(this, 3));
        frameLayout.addView(textView3, c8.ja.h(-2.0f, 26.0f, 8388661));
        ug.q0 q0Var = new ug.q0(org.telegram.messenger.g0.L(16.0f), context, e6Var, false);
        this.f34078r = q0Var;
        q0Var.setIcon(2131624315);
        q0Var.b(org.telegram.messenger.hd.M0(2131743876, null), new cx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            q0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f34076f.addView(this.f34078r, c8.ja.h(-2.0f, 26.0f, 8388661));
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
        zw zwVar = this.f34081x;
        if (zwVar == null) {
            return;
        }
        boolean z17 = zwVar.f42434f;
        ly lyVar = this.H;
        if (!z17 && !lyVar.f36979q1.contains(Long.valueOf(zwVar.f42431b.f28078id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f34081x.f42433e && !org.telegram.messenger.m10.i(lyVar.f36941d1).q() && !lyVar.V0) {
            i7 = 1;
        } else if (this.f34081x.f42435g) {
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
        ug.q0 q0Var = this.f34078r;
        q0Var.setEnabled(z14);
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
        TextView textView2 = this.f34077n;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        fh0 fh0Var = this.f34074c;
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fh0Var, property, fArr);
            if (i7 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c10] = f23;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fh0Var, property2, fArr2);
            if (i7 == 1) {
                f24 = org.telegram.messenger.g0.L(16.0f);
            } else {
                f24 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c10] = f24;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j5Var, property, fArr3);
            if (i7 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c10] = f25;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q0Var, property2, fArr4);
            if (i7 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c10] = f26;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q0Var, property3, fArr5);
            if (i7 == 1) {
                f27 = 1.0f;
            } else {
                f27 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c10] = f27;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(q0Var, property4, fArr6);
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
            this.G.addListener(new ki.j2(this, i7, 9));
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
        fh0Var.setAlpha(f10);
        if (i7 == 1) {
            f11 = 0.0f;
        } else {
            f11 = -org.telegram.messenger.g0.L(16.0f);
        }
        fh0Var.setTranslationX(f11);
        if (i7 == 1) {
            f12 = org.telegram.messenger.g0.L(16.0f);
        } else {
            f12 = 0.0f;
        }
        j5Var.setTranslationX(f12);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        q0Var.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        q0Var.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        q0Var.setScaleY(f15);
        if (i7 == 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        q0Var.setVisibility(i10);
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
        ly lyVar = this.H;
        int i11 = lyVar.f36941d1;
        if (i7 == org.telegram.messenger.ns.B0) {
            if (this.f34079s != null && (o03 = org.telegram.messenger.si.b0(i11).o0(this.f34079s.f28071id)) != null && o03.set != null) {
                org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
                if (e2Var == null) {
                    e2Var = new bi.t6(this, 8);
                }
                wu.J0(e2Var, o03, true, null, new fo(this, 15));
                this.f34079s = null;
            }
            if (this.f34080w != null && (o02 = org.telegram.messenger.si.b0(i11).o0(this.f34080w.f28071id)) != null && o02.set != null) {
                org.telegram.ui.ActionBar.e2 e2Var2 = lyVar.Z1;
                if (e2Var2 == null) {
                    e2Var2 = new bi.t6(this, 8);
                }
                org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                vs vsVar = new vs(5, this, o02);
                Pattern pattern = wu.Q1;
                if (e2Var3.getFragmentView() != null) {
                    org.telegram.messenger.si.b0(e2Var3.getCurrentAccount()).g2(e2Var3.getFragmentView().getContext(), o02, null, 0, e2Var3, null, true, true, vsVar, false);
                }
                this.f34080w = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.H.f36941d1).n(this, org.telegram.messenger.ns.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f34082y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.z(org.telegram.ui.ActionBar.j6.f28850d7));
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
        int L = org.telegram.messenger.g0.L(11.0f) + this.f34076f.getWidth();
        TextView textView = this.f34075e;
        if (textView.getVisibility() == 0) {
            i13 = textView.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        int i14 = L + i13;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setRightPadding(i14);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(org.telegram.messenger.g0.L(4.0f) + j5Var.getTextWidth());
            float L2 = org.telegram.messenger.g0.L(4.0f) + (j5Var.getMaxTextWidth() - i14);
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
        ly lyVar = this.H;
        try {
            int z10 = lyVar.z(org.telegram.ui.ActionBar.j6.Fi);
            int z11 = lyVar.z(org.telegram.ui.ActionBar.j6.Hi);
            if (z10 == this.f34072a) {
                if (z11 != this.f34073b) {
                }
                invalidate();
            }
            this.f34072a = z10;
            this.f34073b = z11;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), z10, false);
                org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), z11, true);
                textView.invalidate();
            }
            TextView textView2 = this.f34077n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.j6.H1(textView2.getBackground(), z10 & 452984831, true);
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
