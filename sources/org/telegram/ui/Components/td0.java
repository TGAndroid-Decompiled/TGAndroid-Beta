package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class td0 extends FrameLayout {
    public TextView f30627a;
    public TextView f30628b;
    public ImageView f30629c;
    public Switch d;
    public boolean e;

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
        int i10;
        if (this.e) {
            if (org.telegram.messenger.dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(70.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.dd.X) {
                i10 = org.telegram.messenger.i0.L(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(13.0f) + this.f30627a.getMeasuredHeight();
        TextView textView = this.f30628b;
        textView.layout(textView.getLeft(), L, textView.getRight(), textView.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f30627a;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        TextView textView2 = this.f30628b;
        measureChildWithMargins(textView2, i10, 0, i11, 0);
        measureChildWithMargins(this.f30629c, i10, 0, i11, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i10, 0, i11, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.m5.b(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), org.telegram.messenger.i0.L(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z10) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z10, true);
        }
    }
}
