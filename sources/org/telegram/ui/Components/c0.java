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
public final class c0 extends LinearLayout {
    public final int f32400a = 0;
    public final RectF f32401b;
    public final RectF f32402c;
    public final RectF d;
    public final Paint f32403e;
    public final org.telegram.ui.ActionBar.h6 f32404f;
    public final FrameLayout h;

    public c0(e0 e0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = e0Var;
        this.f32404f = h6Var;
        this.f32401b = new RectF();
        this.f32402c = new RectF();
        this.d = new RectF();
        this.f32403e = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e0 e0Var;
        float e10;
        switch (this.f32400a) {
            case 0:
                v5 v5Var = ((e0) this.h).h;
                if (v5Var == null) {
                    e10 = 0.0f;
                } else {
                    e10 = v5Var.e(false, e0Var.f33116f);
                }
                double d = e10;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f10 = e10 - floor;
                RectF rectF = this.f32401b;
                if (floor >= 0 && floor < getChildCount()) {
                    View childAt = getChildAt(floor);
                    rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
                RectF rectF2 = this.f32402c;
                if (ceil >= 0 && ceil < getChildCount()) {
                    View childAt2 = getChildAt(ceil);
                    rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                }
                RectF rectF3 = this.d;
                org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.f32404f));
                Paint paint = this.f32403e;
                paint.setColor(r12);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(e0Var.d), org.telegram.messenger.g0.L(e0Var.d), paint);
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt3 = getChildAt(i7);
                    if (childAt3 instanceof d0) {
                        ((d0) childAt3).a(false, Math.max(0.0f, 1.0f - Math.abs(i7 - e10)));
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                org.telegram.ui.Wallet.u5 u5Var = (org.telegram.ui.Wallet.u5) this.h;
                float e11 = u5Var.f43227f.e(false, u5Var.d);
                double d2 = e11;
                TextView[] textViewArr = u5Var.f43225c;
                int j3 = Utilities.j((int) Math.floor(d2), textViewArr.length, 0);
                int j10 = Utilities.j((int) Math.ceil(d2), textViewArr.length, 0);
                RectF rectF4 = this.f32401b;
                if (j3 >= 0 && j3 < textViewArr.length) {
                    TextView textView = textViewArr[j3];
                    rectF4.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                RectF rectF5 = this.f32402c;
                if (j10 >= 0 && j10 < textViewArr.length) {
                    TextView textView2 = textViewArr[j10];
                    rectF5.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                RectF rectF6 = this.d;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, e11 - j3, rectF6);
                int r13 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.f32404f));
                Paint paint2 = this.f32403e;
                paint2.setColor(r13);
                canvas.drawRoundRect(rectF6, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint2);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        boolean z9;
        int size;
        int i11;
        int i12;
        int measuredHeight;
        switch (this.f32400a) {
            case 0:
                boolean z10 = true;
                if (getOrientation() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    size = View.MeasureSpec.getSize(i7);
                } else {
                    size = View.MeasureSpec.getSize(i10);
                }
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    childAt.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                    if (z9) {
                        i11 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    } else {
                        i11 = i7;
                    }
                    if (!z9) {
                        i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    } else {
                        i12 = i10;
                    }
                    childAt.measure(i11, i12);
                    if (z9) {
                        measuredHeight = childAt.getMeasuredWidth();
                    } else {
                        measuredHeight = childAt.getMeasuredHeight();
                    }
                    i14 = Math.max(i14, measuredHeight);
                    i13 += measuredHeight;
                }
                z10 = (i13 > size || i14 >= size / getChildCount()) ? false : false;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt2 = getChildAt(i16);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    childAt2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                    if (z10) {
                        if (z9) {
                            layoutParams.width = 0;
                        } else {
                            layoutParams.height = 0;
                        }
                        layoutParams.weight = 1.0f;
                    } else {
                        if (z9) {
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

    public c0(org.telegram.ui.Wallet.u5 u5Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = u5Var;
        this.f32404f = h6Var;
        this.f32401b = new RectF();
        this.f32402c = new RectF();
        this.d = new RectF();
        this.f32403e = new Paint(1);
    }
}
