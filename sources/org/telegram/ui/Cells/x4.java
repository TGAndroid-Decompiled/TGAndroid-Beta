package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.bd;
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f30954a;
    public final org.telegram.ui.ActionBar.k5 f30955b;
    public final ImageView f30956c;
    public boolean d;
    public int f30957e;

    public x4(Context context) {
        super(context);
        int i3;
        this.f30957e = 0;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f30954a = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(16);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        k5Var.setGravity(i3);
        addView(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f30955b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.I6, null);
        k5Var2.setTextSize(16);
        k5Var2.setGravity(bd.f21784a0 ? 3 : 5);
        addView(k5Var2);
        ImageView imageView = new ImageView(context);
        this.f30956c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28043m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i3, int i10) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f30954a;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, null);
        k5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f30956c;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, null, mode);
        imageView.setTag(Integer.valueOf(i3));
    }

    public final void b(int i3, int i10, String str, boolean z10) {
        this.f30954a.l(str, false);
        this.f30955b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.f30956c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i3);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.f30954a;
    }

    public org.telegram.ui.ActionBar.k5 getValueTextView() {
        return this.f30955b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i3 = this.f30957e;
            if (i3 != 0) {
                org.telegram.ui.ActionBar.k6.f28020l0.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            }
            float L = org.telegram.messenger.g0.L(71.0f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.f30957e != 0) {
                paint = org.telegram.ui.ActionBar.k6.f28020l0;
            } else {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            canvas.drawLine(L, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int L;
        int measuredWidth;
        int i14 = i12 - i10;
        int i15 = i11 - i3;
        org.telegram.ui.ActionBar.k5 k5Var = this.f30955b;
        int textHeight = (i14 - k5Var.getTextHeight()) / 2;
        if (bd.f21784a0) {
            i13 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i13 = 0;
        }
        k5Var.layout(i13, textHeight, k5Var.getMeasuredWidth() + i13, k5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f30954a;
        int textHeight2 = (i14 - k5Var2.getTextHeight()) / 2;
        if (!bd.f21784a0) {
            L = org.telegram.messenger.g0.L(71.0f);
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        k5Var2.layout(L, textHeight2, k5Var2.getMeasuredWidth() + L, k5Var2.getMeasuredHeight() + textHeight2);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        boolean z11 = bd.f21784a0;
        ImageView imageView = this.f30956c;
        if (!z11) {
            measuredWidth = org.telegram.messenger.g0.L(21.0f);
        } else {
            measuredWidth = (i15 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(21.0f);
        }
        imageView.layout(measuredWidth, L2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + L2);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(48.0f);
        this.f30955b.measure(org.telegram.messenger.camera.q.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30954a.measure(org.telegram.messenger.camera.q.c(95.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30956c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i3) {
        this.f30957e = i3;
    }

    public void setTextColor(int i3) {
        this.f30954a.setTextColor(i3);
    }
}
