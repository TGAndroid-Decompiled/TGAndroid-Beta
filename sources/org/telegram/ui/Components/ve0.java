package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ve0 extends FrameLayout {
    public TextView f29067a;
    public TextView f29068b;
    public ImageView f29069c;
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
        float dp;
        int i10;
        if (this.e) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f19216k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(13.0f) + this.f29067a.getMeasuredHeight();
        TextView textView = this.f29068b;
        textView.layout(textView.getLeft(), dp, textView.getRight(), textView.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f29067a;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        TextView textView2 = this.f29068b;
        measureChildWithMargins(textView2, i10, 0, i11, 0);
        measureChildWithMargins(this.f29069c, i10, 0, i11, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i10, 0, i11, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.l0.y(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), AndroidUtilities.dp(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z10) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z10, true);
        }
    }
}
