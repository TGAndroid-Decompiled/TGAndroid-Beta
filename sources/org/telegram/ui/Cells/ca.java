package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
public final class ca extends FrameLayout {
    public TextView f30491a;
    public ImageView f30492b;
    public boolean f30493c;

    public final void a(String str, boolean z10, boolean z11) {
        int i7;
        this.f30491a.setText(str);
        ImageView imageView = this.f30492b;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        this.f30493c = z11;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f30493c) {
            if (gd.f24213a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24213a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f30493c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z10) {
        int i7;
        ImageView imageView = this.f30492b;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
    }
}
