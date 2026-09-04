package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends FrameLayout {
    public Drawable f21854a;
    public TextView f21855b;

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.f21854a;
        drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f21855b.setText(str);
    }
}
