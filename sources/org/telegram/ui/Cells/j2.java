package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
public final class j2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f30954a;
    public final ImageView f30955b;
    public boolean f30956c;
    public int d;

    public j2(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i10;
        this.d = i7;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f30954a = n5Var;
        n5Var.setTextSize(16);
        if (gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n5Var.setGravity(i10);
        int i11 = org.telegram.ui.ActionBar.n6.f29651o6;
        org.telegram.ui.ActionBar.u6.X(n5Var, i11, i6Var);
        n5Var.setTag(Integer.valueOf(i11));
        addView(n5Var);
        ImageView imageView = new ImageView(context);
        this.f30955b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30956c) {
            canvas.drawLine(org.telegram.messenger.g0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        int L;
        int measuredWidth;
        float f11;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.f30954a;
        int textHeight = ((i12 - i10) - n5Var.getTextHeight()) / 2;
        boolean z11 = gd.f24314a0;
        ImageView imageView = this.f30955b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - n5Var.getMeasuredWidth();
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
        n5Var.layout(L, textHeight, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight);
        if (!gd.f24314a0) {
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
        this.f30954a.measure(m10.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30955b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }
}
