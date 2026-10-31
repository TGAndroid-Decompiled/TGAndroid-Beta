package org.telegram.ui.Components;

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
public final class mx extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.us {
    public Paint D;
    public int E;
    public AnimatorSet F;
    public final vy G;
    public int f28617a;
    public int f28618b;
    public final ei0 f28619c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final TextView e;
    public final FrameLayout f28620f;
    public final TextView h;
    public final TextView f28621n;
    public final kg.x0 f28622r;
    public TLRPC.TL_inputStickerSetID f28623s;
    public TLRPC.TL_inputStickerSetID f28624w;
    public ix f28625x;
    public boolean f28626y;

    public mx(vy vyVar, Context context) {
        super(context);
        this.G = vyVar;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.f20157a;
        ?? imageView = new ImageView(context);
        this.f28619c = imageView;
        imageView.f(2131624312, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.t6.If;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_ATOP);
        addView((View) imageView, w7.b6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTextSize(15);
        org.telegram.ui.ActionBar.a7.Y(u5Var, i10, p6Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setOnClickListener(new lx(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Bf;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.12f, vyVar.A(i11)));
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i11);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(textView, d02, L2, null, p6Var);
        textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.5f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.5f));
        textView.setText(org.telegram.messenger.cd.L0(2131749453, null));
        u5Var.setEllipsizeByGradient(true);
        addView(u5Var, w7.b6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, w7.b6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28620f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new lx(this, 1));
        addView(frameLayout, w7.b6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(org.telegram.messenger.cd.L0(2131754486, null));
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.d(vyVar.A(i12), vyVar.A(org.telegram.ui.ActionBar.t6.Ei), 16.0f));
        textView2.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new lx(this, 2));
        frameLayout.addView(textView2, w7.b6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.f28621n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setText(org.telegram.messenger.cd.L0(2131744873, null));
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Fi, p6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.d(0, vyVar.A(i12) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.i0.L(4.0f));
        textView3.setOnClickListener(new lx(this, 3));
        frameLayout.addView(textView3, w7.b6.h(-2.0f, 26.0f, 8388661));
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(16.0f), context, p6Var, false);
        this.f28622r = x0Var;
        x0Var.setIcon(2131624312);
        x0Var.b(org.telegram.messenger.cd.L0(2131743901, null), new lx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
            int L3 = org.telegram.messenger.i0.L(20.0f);
            marginLayoutParams.height = L3;
            marginLayoutParams.width = L3;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.i0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.i0.L(-0.5f);
            x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f28620f.addView(this.f28622r, w7.b6.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        int i12;
        float f18;
        float f19;
        float f20;
        float f21;
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
        ix ixVar = this.f28625x;
        if (ixVar == null) {
            return;
        }
        boolean z17 = ixVar.f27115f;
        vy vyVar = this.G;
        if (!z17 && !vyVar.f31904p1.contains(Long.valueOf(ixVar.f27113b.f19820id))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f28625x.e && !org.telegram.messenger.d20.i(vyVar.f31865c1).q() && !vyVar.U0) {
            i10 = 1;
        } else if (this.f28625x.f27116g) {
            if (z11) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.E == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            requestLayout();
        }
        this.E = i10;
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
        }
        if (i10 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        kg.x0 x0Var = this.f28622r;
        x0Var.setEnabled(z14);
        if (i10 == 2) {
            z15 = true;
        } else {
            z15 = false;
        }
        TextView textView = this.h;
        textView.setEnabled(z15);
        if (i10 == 3) {
            z16 = true;
        } else {
            z16 = false;
        }
        TextView textView2 = this.f28621n;
        textView2.setEnabled(z16);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        ei0 ei0Var = this.f28619c;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            if (i10 == 1) {
                f22 = 0.0f;
                f21 = 16.0f;
            } else {
                f21 = 16.0f;
                f22 = -org.telegram.messenger.i0.L(16.0f);
            }
            float[] fArr = {f22};
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ei0Var, property, fArr);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ei0Var, property2, f23);
            if (i10 == 1) {
                f24 = org.telegram.messenger.i0.L(f21);
            } else {
                f24 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(u5Var, property, f24);
            if (i10 == 1) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(x0Var, property2, f25);
            if (i10 == 1) {
                f26 = 1.0f;
            } else {
                f26 = 0.6f;
            }
            float[] fArr2 = {f26};
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x0Var, property3, fArr2);
            if (i10 == 1) {
                f27 = 1.0f;
            } else {
                f27 = 0.6f;
            }
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(x0Var, property4, f27);
            if (i10 == 2) {
                f28 = 1.0f;
            } else {
                f28 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, f28);
            if (i10 == 2) {
                f29 = 1.0f;
            } else {
                f29 = 0.6f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, f29);
            if (i10 == 2) {
                f30 = 1.0f;
            } else {
                f30 = 0.6f;
            }
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, f30);
            if (i10 == 3) {
                f31 = 1.0f;
            } else {
                f31 = 0.0f;
            }
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, f31);
            if (i10 == 3) {
                f32 = 1.0f;
            } else {
                f32 = 0.6f;
            }
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, f32);
            if (i10 == 3) {
                f33 = 1.0f;
            } else {
                f33 = 0.6f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11, ObjectAnimator.ofFloat(textView2, property4, f33));
            this.F.addListener(new bi.d5(this, i10, 8));
            this.F.setDuration(250L);
            this.F.setInterpolator(new OvershootInterpolator(1.02f));
            this.F.start();
            return;
        }
        int i13 = 8;
        if (i10 == 1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ei0Var.setAlpha(f7);
        if (i10 == 1) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.i0.L(16.0f);
        }
        ei0Var.setTranslationX(f10);
        if (i10 == 1) {
            f11 = org.telegram.messenger.i0.L(16.0f);
        } else {
            f11 = 0.0f;
        }
        u5Var.setTranslationX(f11);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        x0Var.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        x0Var.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        x0Var.setScaleY(f14);
        if (i10 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        x0Var.setVisibility(i11);
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        textView.setAlpha(f15);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.6f;
        }
        textView.setScaleX(f16);
        if (i10 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.6f;
        }
        textView.setScaleY(f17);
        if (i10 == 2) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 3) {
            f18 = 1.0f;
        } else {
            f18 = 0.0f;
        }
        textView2.setAlpha(f18);
        if (i10 == 3) {
            f19 = 1.0f;
        } else {
            f19 = 0.6f;
        }
        textView2.setScaleX(f19);
        if (i10 == 3) {
            f20 = 1.0f;
        } else {
            f20 = 0.6f;
        }
        textView2.setScaleY(f20);
        if (i10 == 3) {
            i13 = 0;
        }
        textView2.setVisibility(i13);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.TL_messages_stickerSet o03;
        vy vyVar = this.G;
        int i12 = vyVar.f31865c1;
        if (i10 == org.telegram.messenger.zs.B0) {
            if (this.f28623s != null && (o03 = org.telegram.messenger.ui.b0(i12).o0(this.f28623s.f19813id)) != null && o03.set != null) {
                org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
                if (k2Var == null) {
                    k2Var = new kg.q1(this, 4);
                }
                cv.J0(k2Var, o03, true, null, new ho(this, 15));
                this.f28623s = null;
            }
            if (this.f28624w != null && (o02 = org.telegram.messenger.ui.b0(i12).o0(this.f28624w.f19813id)) != null && o02.set != null) {
                org.telegram.ui.ActionBar.k2 k2Var2 = vyVar.Y1;
                if (k2Var2 == null) {
                    k2Var2 = new kg.q1(this, 4);
                }
                org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                at atVar = new at(5, this, o02);
                Pattern pattern = cv.M1;
                if (k2Var3.getFragmentView() != null) {
                    org.telegram.messenger.ui.b0(k2Var3.getCurrentAccount()).g2(k2Var3.getFragmentView().getContext(), o02, null, 0, k2Var3, null, true, true, atVar, false);
                }
                this.f28624w = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.G.f31865c1).n(this, org.telegram.messenger.zs.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f28626y) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setStrokeWidth(1.0f);
                this.D.setColor(this.G.A(org.telegram.ui.ActionBar.t6.f20930d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.D);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(11.0f) + this.f28620f.getWidth();
        TextView textView = this.e;
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i15 = L + i14;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.setRightPadding(i15);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(org.telegram.messenger.i0.L(4.0f) + u5Var.getTextWidth());
            float L2 = org.telegram.messenger.i0.L(4.0f) + (u5Var.getMaxTextWidth() - i15);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        if (this.E == 0) {
            f7 = 10.0f;
        } else {
            f7 = 15.0f;
        }
        marginLayoutParams.topMargin = org.telegram.messenger.i0.L(f7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.E == 0) {
            f10 = 32.0f;
        } else {
            f10 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), 1073741824));
    }

    @Override
    public final void updateColors() {
        vy vyVar = this.G;
        try {
            int A = vyVar.A(org.telegram.ui.ActionBar.t6.Ci);
            int A2 = vyVar.A(org.telegram.ui.ActionBar.t6.Ei);
            if (A == this.f28617a) {
                if (A2 != this.f28618b) {
                }
                invalidate();
            }
            this.f28617a = A;
            this.f28618b = A2;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), A, false);
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), A2, true);
                textView.invalidate();
            }
            TextView textView2 = this.f28621n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.t6.H1(textView2.getBackground(), A & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
