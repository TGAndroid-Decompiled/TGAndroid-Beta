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
public final class j0 extends LinearLayout {
    public final int f36210a = 0;
    public final RectF f36211b;
    public final RectF f36212c;
    public final RectF d;
    public final Paint f36213e;
    public final org.telegram.ui.ActionBar.i6 f36214f;
    public final FrameLayout h;

    public j0(l0 l0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = l0Var;
        this.f36214f = i6Var;
        this.f36211b = new RectF();
        this.f36212c = new RectF();
        this.d = new RectF();
        this.f36213e = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float e10;
        float e11;
        switch (this.f36210a) {
            case 0:
                l0 l0Var = (l0) this.h;
                c6 c6Var = l0Var.f36963s;
                if (c6Var == null) {
                    e10 = 1.0f;
                } else {
                    if (l0Var.h >= 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    e10 = c6Var.e(false, f10);
                }
                c6 c6Var2 = l0Var.f36961n;
                if (c6Var2 == null) {
                    e11 = 0.0f;
                } else {
                    int i7 = l0Var.h;
                    if (i7 < 0) {
                        i7 = l0Var.f36962r;
                    }
                    e11 = c6Var2.e(false, i7);
                }
                double d = e11;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f11 = e11 - floor;
                RectF rectF = this.f36211b;
                if (floor >= 0 && floor < getChildCount()) {
                    View childAt = getChildAt(floor);
                    rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
                RectF rectF2 = this.f36212c;
                if (ceil >= 0 && ceil < getChildCount()) {
                    View childAt2 = getChildAt(ceil);
                    rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                }
                RectF rectF3 = this.d;
                org.telegram.messenger.g0.Z1(rectF, rectF2, f11, rectF3);
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f * e10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f36214f));
                Paint paint = this.f36213e;
                paint.setColor(r12);
                if (e10 > 0.0f) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(l0Var.f36959e), org.telegram.messenger.g0.L(l0Var.f36959e), paint);
                }
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt3 = getChildAt(i10);
                    if (childAt3 instanceof k0) {
                        ((k0) childAt3).b(false, Math.max(0.0f, 1.0f - Math.abs(i10 - e11)) * e10);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                org.telegram.ui.Wallet.j6 j6Var = (org.telegram.ui.Wallet.j6) this.h;
                float e12 = j6Var.f44534f.e(false, j6Var.d);
                double d2 = e12;
                TextView[] textViewArr = j6Var.f44532c;
                int j3 = Utilities.j((int) Math.floor(d2), textViewArr.length, 0);
                int j10 = Utilities.j((int) Math.ceil(d2), textViewArr.length, 0);
                RectF rectF4 = this.f36211b;
                if (j3 >= 0 && j3 < textViewArr.length) {
                    TextView textView = textViewArr[j3];
                    rectF4.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                RectF rectF5 = this.f36212c;
                if (j10 >= 0 && j10 < textViewArr.length) {
                    TextView textView2 = textViewArr[j10];
                    rectF5.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                RectF rectF6 = this.d;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, e12 - j3, rectF6);
                int r13 = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f36214f));
                Paint paint2 = this.f36213e;
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
        switch (this.f36210a) {
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

    public j0(org.telegram.ui.Wallet.j6 j6Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = j6Var;
        this.f36214f = i6Var;
        this.f36211b = new RectF();
        this.f36212c = new RectF();
        this.d = new RectF();
        this.f36213e = new Paint(1);
    }
}
