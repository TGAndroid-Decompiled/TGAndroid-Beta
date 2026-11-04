package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class my extends FrameLayout {
    public ImageView f47821a;
    public TextView f47822b;
    public int f47823c;
    public boolean d;
    public Boolean f47824e;

    @Override
    public final void onDraw(Canvas canvas) {
        TextView textView = this.f47822b;
        super.onDraw(canvas);
        if (this.d) {
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
