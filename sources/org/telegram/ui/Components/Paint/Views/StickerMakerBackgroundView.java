package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class StickerMakerBackgroundView extends View {
    private final Paint backgroundPaint;
    private final Path path;

    public StickerMakerBackgroundView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        this.path = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(10.0f);
        float f = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f;
        float measuredHeight = getMeasuredHeight() - f;
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        float f2 = dp + measuredWidth;
        rectF.set(dp, dp, f2, f2);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        float f3 = measuredWidth / 7.0f;
        this.path.rewind();
        this.path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        canvas.clipPath(this.path);
        int dp2 = AndroidUtilities.dp(10.0f);
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        float f4 = dp2;
        int width = ((int) (rectF.width() / f4)) + 1;
        int height = ((int) (rectF.height() / f4)) + 1;
        for (int i = 0; i < height; i++) {
            canvas.save();
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = i2 % 2;
                if ((i3 == 0 && i % 2 == 0) || (i3 != 0 && i % 2 != 0)) {
                    canvas.drawRect(0.0f, 0.0f, f4, f4, this.backgroundPaint);
                }
                canvas.translate(f4, 0.0f);
            }
            canvas.restore();
            canvas.translate(0.0f, f4);
        }
        canvas.restore();
        canvas.restore();
    }
}
