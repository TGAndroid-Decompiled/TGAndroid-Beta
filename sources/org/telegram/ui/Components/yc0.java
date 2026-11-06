package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class yc0 extends FrameLayout {
    public TextView f40610a;
    public TextView f40611b;
    public ImageView f40612c;
    public Switch d;
    public boolean f40613e;

    @Override
    public final void invalidate() {
        super.invalidate();
        Switch r02 = this.d;
        if (r02 != null) {
            r02.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f40613e) {
            if (org.telegram.messenger.hd.f22871a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f22871a0) {
                i7 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(13.0f) + this.f40610a.getMeasuredHeight();
        TextView textView = this.f40611b;
        textView.layout(textView.getLeft(), L, textView.getRight(), textView.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView = this.f40610a;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        TextView textView2 = this.f40611b;
        measureChildWithMargins(textView2, i7, 0, i10, 0);
        measureChildWithMargins(this.f40612c, i7, 0, i10, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i7, 0, i10, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), org.telegram.messenger.g0.L(64.0f)) + (this.f40613e ? 1 : 0));
    }

    public void setChecked(boolean z9) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z9, true);
        }
    }
}
