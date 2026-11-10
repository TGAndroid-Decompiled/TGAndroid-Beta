package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
public final class aa extends FrameLayout {
    public TextView f28919a;
    public ImageView f28920b;
    public boolean f28921c;

    public final void a(String str, boolean z9, boolean z10) {
        int i7;
        this.f28919a.setText(str);
        ImageView imageView = this.f28920b;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
        this.f28921c = z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f28921c) {
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f28921c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z9) {
        int i7;
        ImageView imageView = this.f28920b;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
    }
}
