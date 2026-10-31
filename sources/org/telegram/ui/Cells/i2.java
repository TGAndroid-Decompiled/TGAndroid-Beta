package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
public final class i2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 f22025a;
    public final ImageView f22026b;
    public boolean f22027c;
    public int d;

    public i2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        this.d = i10;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f22025a = u5Var;
        u5Var.setTextSize(16);
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        u5Var.setGravity(i11);
        int i12 = org.telegram.ui.ActionBar.t6.f21134o6;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i12, p6Var);
        u5Var.setTag(Integer.valueOf(i12));
        addView(u5Var);
        ImageView imageView = new ImageView(context);
        this.f22026b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22027c) {
            canvas.drawLine(org.telegram.messenger.i0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.i0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        int L;
        int measuredWidth;
        float f10;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f22025a;
        int textHeight = ((i13 - i11) - u5Var.getTextHeight()) / 2;
        boolean z11 = cd.X;
        ImageView imageView = this.f22026b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - u5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f10 = this.d;
            } else {
                f10 = 25.0f;
            }
            L = measuredWidth2 - org.telegram.messenger.i0.L(f10);
        } else {
            if (imageView.getVisibility() == 0) {
                f7 = this.d;
            } else {
                f7 = 25.0f;
            }
            L = org.telegram.messenger.i0.L(f7);
        }
        u5Var.layout(L, textHeight, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight);
        if (!cd.X) {
            measuredWidth = (org.telegram.messenger.i0.L(this.d) - imageView.getMeasuredWidth()) / 2;
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(25.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        org.telegram.messenger.i0.L(48.0f);
        this.f22025a.measure(z20.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        this.f22026b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.i0.L(50.0f));
    }
}
