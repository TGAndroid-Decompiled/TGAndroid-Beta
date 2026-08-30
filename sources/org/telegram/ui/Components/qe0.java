package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class qe0 extends FrameLayout {
    public TextView f28120a;
    public TextView f28121b;
    public ImageView f28122c;
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(13.0f) + this.f28120a.getMeasuredHeight();
        TextView textView = this.f28121b;
        textView.layout(textView.getLeft(), dp, textView.getRight(), textView.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f28120a;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        TextView textView2 = this.f28121b;
        measureChildWithMargins(textView2, i10, 0, i11, 0);
        measureChildWithMargins(this.f28122c, i10, 0, i11, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i10, 0, i11, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), AndroidUtilities.dp(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z4) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z4, true);
        }
    }
}
