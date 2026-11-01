package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class i4 extends FrameLayout {
    public Drawable f22032a;
    public TextView f22033b;

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.f22032a;
        drawable.setBounds(0, getMeasuredHeight() - org.telegram.messenger.i0.L(3.0f), getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f22033b.setText(str);
    }
}
