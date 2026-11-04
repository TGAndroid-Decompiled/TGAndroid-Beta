package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.bd;
public final class aa extends FrameLayout {
    public TextView f28960a;
    public ImageView f28961b;
    public boolean f28962c;

    public final void a(String str, boolean z10, boolean z11) {
        int i3;
        this.f28960a.setText(str);
        ImageView imageView = this.f28961b;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        imageView.setVisibility(i3);
        this.f28962c = z11;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.f28962c) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f28962c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z10) {
        int i3;
        ImageView imageView = this.f28961b;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        imageView.setVisibility(i3);
    }
}
