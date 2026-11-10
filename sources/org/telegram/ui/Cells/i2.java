package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.id;
public final class i2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.m5 f29318a;
    public final ImageView f29319b;
    public boolean f29320c;
    public int d;

    public i2(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        this.d = i7;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f29318a = m5Var;
        m5Var.setTextSize(16);
        if (id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        m5Var.setGravity(i10);
        int i11 = org.telegram.ui.ActionBar.m6.f28090o6;
        org.telegram.ui.ActionBar.t6.X(m5Var, i11, h6Var);
        m5Var.setTag(Integer.valueOf(i11));
        addView(m5Var);
        ImageView imageView = new ImageView(context);
        this.f29319b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f29320c) {
            canvas.drawLine(org.telegram.messenger.g0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        int L;
        int measuredWidth;
        float f11;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.f29318a;
        int textHeight = ((i12 - i10) - m5Var.getTextHeight()) / 2;
        boolean z10 = id.f23161a0;
        ImageView imageView = this.f29319b;
        if (z10) {
            int measuredWidth2 = getMeasuredWidth() - m5Var.getMeasuredWidth();
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
        m5Var.layout(L, textHeight, m5Var.getMeasuredWidth() + L, m5Var.getMeasuredHeight() + textHeight);
        if (!id.f23161a0) {
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
        this.f29318a.measure(org.telegram.messenger.camera.q.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f29319b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }
}
