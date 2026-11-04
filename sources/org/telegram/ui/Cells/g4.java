package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class g4 extends FrameLayout {
    public Drawable f29258a;
    public TextView f29259b;

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.f29258a;
        drawable.setBounds(0, getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f29259b.setText(str);
    }
}
