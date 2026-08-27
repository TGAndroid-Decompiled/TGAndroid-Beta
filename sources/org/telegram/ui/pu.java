package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class pu extends View {

    public Path f41429a;

    public Paint f41430b;

    public boolean f41431c;

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f41429a, this.f41430b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(13.0f), 1073741824));
        setTop(this.f41431c);
    }

    public void setTop(boolean z10) {
        Path path = this.f41429a;
        path.rewind();
        this.f41431c = z10;
        if (!z10) {
            float fDp = AndroidUtilities.dp(8.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, ((-getMeasuredHeight()) * 2) - AndroidUtilities.dp(4.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
            path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
            return;
        }
        float fDp2 = AndroidUtilities.dp(14.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, AndroidUtilities.dp(4.0f), getMeasuredWidth(), (getMeasuredHeight() * 2) + AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF2, fDp2, fDp2, Path.Direction.CW);
    }
}
