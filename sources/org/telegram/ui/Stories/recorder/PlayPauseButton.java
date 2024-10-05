package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.PlayPauseDrawable;

public class PlayPauseButton extends View {
    private final Paint circlePaint;
    public final PlayPauseDrawable drawable;

    public PlayPauseButton(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.circlePaint = paint;
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(10);
        this.drawable = playPauseDrawable;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        playPauseDrawable.setCallback(this);
        playPauseDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.circlePaint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), this.circlePaint);
        this.drawable.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        canvas.save();
        canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
        this.drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.drawable || super.verifyDrawable(drawable);
    }
}
