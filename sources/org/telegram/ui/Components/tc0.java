package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class tc0 extends FrameLayout {
    public TextView f38389a;
    public TextView f38390b;
    public ImageView f38391c;
    public Switch d;
    public boolean f38392e;

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
        int i3;
        if (this.f38392e) {
            if (org.telegram.messenger.bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(13.0f) + this.f38389a.getMeasuredHeight();
        TextView textView = this.f38390b;
        textView.layout(textView.getLeft(), L, textView.getRight(), textView.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TextView textView = this.f38389a;
        measureChildWithMargins(textView, i3, 0, i10, 0);
        TextView textView2 = this.f38390b;
        measureChildWithMargins(textView2, i3, 0, i10, 0);
        measureChildWithMargins(this.f38391c, i3, 0, i10, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i3, 0, i10, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.k5.b(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), org.telegram.messenger.g0.L(64.0f)) + (this.f38392e ? 1 : 0));
    }

    public void setChecked(boolean z10) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z10, true);
        }
    }
}
