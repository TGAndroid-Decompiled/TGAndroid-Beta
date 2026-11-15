package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
public final class i2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f30428a;
    public final ImageView f30429b;
    public boolean f30430c;
    public int d;

    public i2(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        this.d = i7;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30428a = j5Var;
        j5Var.setTextSize(16);
        if (hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        int i11 = org.telegram.ui.ActionBar.j6.f29049o6;
        org.telegram.ui.ActionBar.q6.X(j5Var, i11, e6Var);
        j5Var.setTag(Integer.valueOf(i11));
        addView(j5Var);
        ImageView imageView = new ImageView(context);
        this.f30429b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30430c) {
            canvas.drawLine(org.telegram.messenger.g0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        int L;
        int measuredWidth;
        float f11;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.j5 j5Var = this.f30428a;
        int textHeight = ((i12 - i10) - j5Var.getTextHeight()) / 2;
        boolean z11 = hd.f24104a0;
        ImageView imageView = this.f30429b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - j5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f11 = this.d;
            } else {
                f11 = 25.0f;
            }
            L = measuredWidth2 - org.telegram.messenger.g0.L(f11);
        } else {
            if (imageView.getVisibility() == 0) {
                f10 = this.d;
            } else {
                f10 = 25.0f;
            }
            L = org.telegram.messenger.g0.L(f10);
        }
        j5Var.layout(L, textHeight, j5Var.getMeasuredWidth() + L, j5Var.getMeasuredHeight() + textHeight);
        if (!hd.f24104a0) {
            measuredWidth = (org.telegram.messenger.g0.L(this.d) - imageView.getMeasuredWidth()) / 2;
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(25.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.g0.L(48.0f);
        this.f30428a.measure(i20.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30429b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }
}
