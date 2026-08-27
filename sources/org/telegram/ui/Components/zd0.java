package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class zd0 extends FrameLayout {

    public TextView f35225a;

    public TextView f35226b;

    public ImageView f35227c;
    public Switch d;

    public boolean f35228e;

    @Override
    public final void invalidate() {
        super.invalidate();
        Switch r10 = this.d;
        if (r10 != null) {
            r10.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35228e) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int iDp = AndroidUtilities.dp(13.0f) + this.f35225a.getMeasuredHeight();
        TextView textView = this.f35226b;
        textView.layout(textView.getLeft(), iDp, textView.getRight(), textView.getMeasuredHeight() + iDp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.f35225a;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        TextView textView2 = this.f35226b;
        measureChildWithMargins(textView2, i10, 0, i11, 0);
        measureChildWithMargins(this.f35227c, i10, 0, i11, 0);
        Switch r10 = this.d;
        if (r10 != null) {
            measureChildWithMargins(r10, i10, 0, i11, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y1.b(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), AndroidUtilities.dp(64.0f)) + (this.f35228e ? 1 : 0));
    }

    public void setChecked(boolean z10) {
        Switch r10 = this.d;
        if (r10 != null) {
            r10.c(z10, true);
        }
    }
}
