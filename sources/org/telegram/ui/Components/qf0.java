package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class qf0 extends FrameLayout {
    public TextView f30199a;
    public TextView f30200b;
    public ImageView f30201c;
    public Switch d;
    public boolean f30202e;

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
        if (this.f30202e) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(13.0f) + this.f30199a.getMeasuredHeight();
        TextView textView = this.f30200b;
        textView.layout(textView.getLeft(), dp, textView.getRight(), textView.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f30199a;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        TextView textView2 = this.f30200b;
        measureChildWithMargins(textView2, i10, 0, i11, 0);
        measureChildWithMargins(this.f30201c, i10, 0, i11, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i10, 0, i11, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.q.y(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), AndroidUtilities.dp(64.0f)) + (this.f30202e ? 1 : 0));
    }

    public void setChecked(boolean z10) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z10, true);
        }
    }
}
