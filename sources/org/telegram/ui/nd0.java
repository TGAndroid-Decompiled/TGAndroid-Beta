package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nd0 extends TextView {
    public final int f40701a;

    public nd0(Context context, int i9) {
        super(context);
        this.f40701a = i9;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40701a) {
            case 4:
                if (getPaddingLeft() > 0) {
                    canvas.drawCircle((getPaddingLeft() - AndroidUtilities.dp(2.5f)) / 2.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.5f), getPaint());
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f40701a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(100.0f)), Integer.MIN_VALUE));
                return;
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            case 3:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }
}
