package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
public final class aa extends FrameLayout {
    public TextView f21693a;
    public ImageView f21694b;
    public boolean f21695c;

    public final void a(String str, boolean z10, boolean z11) {
        int i10;
        this.f21693a.setText(str);
        ImageView imageView = this.f21694b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        this.f21695c = z11;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.f21695c) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f) + (this.f21695c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z10) {
        int i10;
        ImageView imageView = this.f21694b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
    }
}
