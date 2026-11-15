package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class a0 extends LinearLayout {
    public final int f32798a = 0;
    public final RectF f32799b;
    public final RectF f32800c;
    public final RectF d;
    public final Paint f32801e;
    public final org.telegram.ui.ActionBar.e6 f32802f;
    public final FrameLayout h;

    public a0(c0 c0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = c0Var;
        this.f32802f = e6Var;
        this.f32799b = new RectF();
        this.f32800c = new RectF();
        this.d = new RectF();
        this.f32801e = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c0 c0Var;
        float e10;
        switch (this.f32798a) {
            case 0:
                u5 u5Var = ((c0) this.h).h;
                if (u5Var == null) {
                    e10 = 0.0f;
                } else {
                    e10 = u5Var.e(false, c0Var.f33444f);
                }
                double d = e10;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f10 = e10 - floor;
                RectF rectF = this.f32799b;
                if (floor >= 0 && floor < getChildCount()) {
                    View childAt = getChildAt(floor);
                    rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
                RectF rectF2 = this.f32800c;
                if (ceil >= 0 && ceil < getChildCount()) {
                    View childAt2 = getChildAt(ceil);
                    rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                }
                RectF rectF3 = this.d;
                org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f32802f));
                Paint paint = this.f32801e;
                paint.setColor(r12);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(c0Var.d), org.telegram.messenger.g0.L(c0Var.d), paint);
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt3 = getChildAt(i7);
                    if (childAt3 instanceof b0) {
                        ((b0) childAt3).a(false, Math.max(0.0f, 1.0f - Math.abs(i7 - e10)));
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                org.telegram.ui.Wallet.t5 t5Var = (org.telegram.ui.Wallet.t5) this.h;
                float e11 = t5Var.f44520f.e(false, t5Var.d);
                double d2 = e11;
                TextView[] textViewArr = t5Var.f44518c;
                int j3 = Utilities.j((int) Math.floor(d2), textViewArr.length, 0);
                int j10 = Utilities.j((int) Math.ceil(d2), textViewArr.length, 0);
                RectF rectF4 = this.f32799b;
                if (j3 >= 0 && j3 < textViewArr.length) {
                    TextView textView = textViewArr[j3];
                    rectF4.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                RectF rectF5 = this.f32800c;
                if (j10 >= 0 && j10 < textViewArr.length) {
                    TextView textView2 = textViewArr[j10];
                    rectF5.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                RectF rectF6 = this.d;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, e11 - j3, rectF6);
                int r13 = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f32802f));
                Paint paint2 = this.f32801e;
                paint2.setColor(r13);
                canvas.drawRoundRect(rectF6, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint2);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        boolean z10;
        int size;
        int i11;
        int i12;
        int measuredHeight;
        switch (this.f32798a) {
            case 0:
                boolean z11 = true;
                if (getOrientation() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    size = View.MeasureSpec.getSize(i7);
                } else {
                    size = View.MeasureSpec.getSize(i10);
                }
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    childAt.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                    if (z10) {
                        i11 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    } else {
                        i11 = i7;
                    }
                    if (!z10) {
                        i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    } else {
                        i12 = i10;
                    }
                    childAt.measure(i11, i12);
                    if (z10) {
                        measuredHeight = childAt.getMeasuredWidth();
                    } else {
                        measuredHeight = childAt.getMeasuredHeight();
                    }
                    i14 = Math.max(i14, measuredHeight);
                    i13 += measuredHeight;
                }
                z11 = (i13 > size || i14 >= size / getChildCount()) ? false : false;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt2 = getChildAt(i16);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    childAt2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                    if (z11) {
                        if (z10) {
                            layoutParams.width = 0;
                        } else {
                            layoutParams.height = 0;
                        }
                        layoutParams.weight = 1.0f;
                    } else {
                        if (z10) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.height = -2;
                        }
                        layoutParams.weight = 0.0f;
                    }
                }
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public a0(org.telegram.ui.Wallet.t5 t5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = t5Var;
        this.f32802f = e6Var;
        this.f32799b = new RectF();
        this.f32800c = new RectF();
        this.d = new RectF();
        this.f32801e = new Paint(1);
    }
}
