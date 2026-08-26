package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.telegram.messenger.AndroidUtilities;

public class ChevronView extends View {
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_RIGHT = 0;
    private int direction;
    private Paint paint;
    private Path path;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
    }

    public ChevronView(Context context, int i) {
        super(context);
        this.paint = new Paint(1);
        this.path = new Path();
        this.paint.setStrokeWidth(AndroidUtilities.dp(1.75f));
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.direction = i;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float strokeWidth = this.paint.getStrokeWidth();
        this.path.rewind();
        int i = this.direction;
        if (i == 0) {
            this.path.moveTo(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth);
            this.path.lineTo((getWidth() - strokeWidth) - getPaddingRight(), getHeight() / 2.0f);
            this.path.lineTo(getPaddingLeft() + strokeWidth, (getHeight() - strokeWidth) - getPaddingBottom());
        } else if (i == 1) {
            this.path.moveTo((getWidth() - strokeWidth) - getPaddingRight(), getPaddingTop() + strokeWidth);
            this.path.lineTo(getPaddingLeft() + strokeWidth, getHeight() / 2.0f);
            this.path.lineTo((getWidth() - strokeWidth) - getPaddingBottom(), (getHeight() - strokeWidth) - getPaddingBottom());
        }
        canvas.drawPath(this.path, this.paint);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }
}
