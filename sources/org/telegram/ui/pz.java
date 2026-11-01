package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class pz extends FrameLayout {
    public ImageView f40639a;
    public TextView f40640b;
    public int f40641c;
    public boolean d;
    public Boolean e;

    @Override
    public final void onDraw(Canvas canvas) {
        TextView textView = this.f40640b;
        super.onDraw(canvas);
        if (this.d) {
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
