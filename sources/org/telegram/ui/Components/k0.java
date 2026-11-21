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
public final class k0 extends LinearLayout {
    public final int f36726a = 0;
    public final RectF f36727b;
    public final RectF f36728c;
    public final RectF d;
    public final Paint f36729e;
    public final org.telegram.ui.ActionBar.h6 f36730f;
    public final FrameLayout h;

    public k0(m0 m0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = m0Var;
        this.f36730f = h6Var;
        this.f36727b = new RectF();
        this.f36728c = new RectF();
        this.d = new RectF();
        this.f36729e = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float e10;
        float e11;
        switch (this.f36726a) {
            case 0:
                m0 m0Var = (m0) this.h;
                d6 d6Var = m0Var.f37358s;
                if (d6Var == null) {
                    e10 = 1.0f;
                } else {
                    if (m0Var.h >= 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    e10 = d6Var.e(false, f10);
                }
                d6 d6Var2 = m0Var.f37356n;
                if (d6Var2 == null) {
                    e11 = 0.0f;
                } else {
                    int i7 = m0Var.h;
                    if (i7 < 0) {
                        i7 = m0Var.f37357r;
                    }
                    e11 = d6Var2.e(false, i7);
                }
                double d = e11;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f11 = e11 - floor;
                RectF rectF = this.f36727b;
                if (floor >= 0 && floor < getChildCount()) {
                    View childAt = getChildAt(floor);
                    rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
                RectF rectF2 = this.f36728c;
                if (ceil >= 0 && ceil < getChildCount()) {
                    View childAt2 = getChildAt(ceil);
                    rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                }
                RectF rectF3 = this.d;
                org.telegram.messenger.g0.Z1(rectF, rectF2, f11, rectF3);
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f * e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.f36730f));
                Paint paint = this.f36729e;
                paint.setColor(r12);
                if (e10 > 0.0f) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(m0Var.f37354e), org.telegram.messenger.g0.L(m0Var.f37354e), paint);
                }
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt3 = getChildAt(i10);
                    if (childAt3 instanceof l0) {
                        ((l0) childAt3).b(false, Math.max(0.0f, 1.0f - Math.abs(i10 - e11)) * e10);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.h;
                float e12 = i6Var.f44402f.e(false, i6Var.d);
                double d2 = e12;
                TextView[] textViewArr = i6Var.f44400c;
                int j3 = Utilities.j((int) Math.floor(d2), textViewArr.length, 0);
                int j10 = Utilities.j((int) Math.ceil(d2), textViewArr.length, 0);
                RectF rectF4 = this.f36727b;
                if (j3 >= 0 && j3 < textViewArr.length) {
                    TextView textView = textViewArr[j3];
                    rectF4.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                RectF rectF5 = this.f36728c;
                if (j10 >= 0 && j10 < textViewArr.length) {
                    TextView textView2 = textViewArr[j10];
                    rectF5.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                RectF rectF6 = this.d;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, e12 - j3, rectF6);
                int r13 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.f36730f));
                Paint paint2 = this.f36729e;
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
        switch (this.f36726a) {
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
                    childAt.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
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
                    childAt2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
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

    public k0(org.telegram.ui.Wallet.i6 i6Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = i6Var;
        this.f36730f = h6Var;
        this.f36727b = new RectF();
        this.f36728c = new RectF();
        this.d = new RectF();
        this.f36729e = new Paint(1);
    }
}
