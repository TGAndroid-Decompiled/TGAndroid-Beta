package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.bd;
public final class i2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f29369a;
    public final ImageView f29370b;
    public boolean f29371c;
    public int d;

    public i2(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        this.d = i3;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29369a = k5Var;
        k5Var.setTextSize(16);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        int i11 = org.telegram.ui.ActionBar.k6.f28081o6;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i11, e6Var);
        k5Var.setTag(Integer.valueOf(i11));
        addView(k5Var);
        ImageView imageView = new ImageView(context);
        this.f29370b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f29371c) {
            canvas.drawLine(org.telegram.messenger.g0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float f10;
        int L;
        int measuredWidth;
        float f11;
        int i13 = i11 - i3;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29369a;
        int textHeight = ((i12 - i10) - k5Var.getTextHeight()) / 2;
        boolean z11 = bd.f21784a0;
        ImageView imageView = this.f29370b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - k5Var.getMeasuredWidth();
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
        k5Var.layout(L, textHeight, k5Var.getMeasuredWidth() + L, k5Var.getMeasuredHeight() + textHeight);
        if (!bd.f21784a0) {
            measuredWidth = (org.telegram.messenger.g0.L(this.d) - imageView.getMeasuredWidth()) / 2;
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(25.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        org.telegram.messenger.g0.L(48.0f);
        this.f29369a.measure(org.telegram.messenger.camera.q.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f29370b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }
}
