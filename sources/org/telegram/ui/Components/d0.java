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
public final class d0 extends LinearLayout {
    public final int f25302a = 0;
    public final RectF f25303b;
    public final RectF f25304c;
    public final RectF d;
    public final Paint e;
    public final org.telegram.ui.ActionBar.p6 f25305f;
    public final FrameLayout h;

    public d0(f0 f0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = f0Var;
        this.f25305f = p6Var;
        this.f25303b = new RectF();
        this.f25304c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f0 f0Var;
        float e;
        switch (this.f25302a) {
            case 0:
                t5 t5Var = ((f0) this.h).h;
                if (t5Var == null) {
                    e = 0.0f;
                } else {
                    e = t5Var.e(false, f0Var.f25984f);
                }
                double d = e;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f7 = e - floor;
                RectF rectF = this.f25303b;
                if (floor >= 0 && floor < getChildCount()) {
                    View childAt = getChildAt(floor);
                    rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
                RectF rectF2 = this.f25304c;
                if (ceil >= 0 && ceil < getChildCount()) {
                    View childAt2 = getChildAt(ceil);
                    rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                }
                RectF rectF3 = this.d;
                org.telegram.messenger.i0.Z1(rectF, rectF2, f7, rectF3);
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f25305f));
                Paint paint = this.e;
                paint.setColor(r12);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(f0Var.d), org.telegram.messenger.i0.L(f0Var.d), paint);
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt3 = getChildAt(i10);
                    if (childAt3 instanceof e0) {
                        ((e0) childAt3).a(false, Math.max(0.0f, 1.0f - Math.abs(i10 - e)));
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                org.telegram.ui.Wallet.v5 v5Var = (org.telegram.ui.Wallet.v5) this.h;
                float e7 = v5Var.f35316f.e(false, v5Var.d);
                double d10 = e7;
                TextView[] textViewArr = v5Var.f35315c;
                int j10 = Utilities.j((int) Math.floor(d10), textViewArr.length, 0);
                int j11 = Utilities.j((int) Math.ceil(d10), textViewArr.length, 0);
                RectF rectF4 = this.f25303b;
                if (j10 >= 0 && j10 < textViewArr.length) {
                    TextView textView = textViewArr[j10];
                    rectF4.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                RectF rectF5 = this.f25304c;
                if (j11 >= 0 && j11 < textViewArr.length) {
                    TextView textView2 = textViewArr[j11];
                    rectF5.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                RectF rectF6 = this.d;
                org.telegram.messenger.i0.Z1(rectF4, rectF5, e7 - j10, rectF6);
                int r13 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f25305f));
                Paint paint2 = this.e;
                paint2.setColor(r13);
                canvas.drawRoundRect(rectF6, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint2);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int size;
        int i12;
        int i13;
        int measuredHeight;
        switch (this.f25302a) {
            case 0:
                boolean z11 = true;
                if (getOrientation() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    size = View.MeasureSpec.getSize(i10);
                } else {
                    size = View.MeasureSpec.getSize(i11);
                }
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    childAt.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                    if (z10) {
                        i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    } else {
                        i12 = i10;
                    }
                    if (!z10) {
                        i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    } else {
                        i13 = i11;
                    }
                    childAt.measure(i12, i13);
                    if (z10) {
                        measuredHeight = childAt.getMeasuredWidth();
                    } else {
                        measuredHeight = childAt.getMeasuredHeight();
                    }
                    i15 = Math.max(i15, measuredHeight);
                    i14 += measuredHeight;
                }
                z11 = (i14 > size || i15 >= size / getChildCount()) ? false : false;
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    View childAt2 = getChildAt(i17);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    childAt2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
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
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public d0(org.telegram.ui.Wallet.v5 v5Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = v5Var;
        this.f25305f = p6Var;
        this.f25303b = new RectF();
        this.f25304c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }
}
