package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.p009ui.ActionBar.Theme;

public class BetterRatingView extends View {
    private OnRatingChangeListener listener;
    private Paint paint = new Paint();
    private int numStars = 5;
    private int selectedRating = 0;
    private Bitmap filledStar = BitmapFactory.decodeResource(getResources(), C0890R.C0891drawable.ic_rating_star_filled).extractAlpha();
    private Bitmap hollowStar = BitmapFactory.decodeResource(getResources(), C0890R.C0891drawable.ic_rating_star).extractAlpha();

    public interface OnRatingChangeListener {
        void onRatingChanged(int i);
    }

    public BetterRatingView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension((this.numStars * AndroidUtilities.m34dp(32.0f)) + ((this.numStars - 1) * AndroidUtilities.m34dp(16.0f)), AndroidUtilities.m34dp(32.0f));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 0;
        while (i < this.numStars) {
            this.paint.setColor(Theme.getColor(i < this.selectedRating ? "dialogTextBlue" : "dialogTextHint"));
            canvas.drawBitmap(i < this.selectedRating ? this.filledStar : this.hollowStar, AndroidUtilities.m34dp(48.0f) * i, 0.0f, this.paint);
            i++;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float dp = AndroidUtilities.m34dp(-8.0f);
        for (int i2 = 0; i2 < this.numStars; i2++) {
            if (motionEvent.getX() <= dp || motionEvent.getX() >= AndroidUtilities.m34dp(48.0f) + dp || this.selectedRating == (i = i2 + 1)) {
                dp += AndroidUtilities.m34dp(48.0f);
            } else {
                this.selectedRating = i;
                OnRatingChangeListener onRatingChangeListener = this.listener;
                if (onRatingChangeListener != null) {
                    onRatingChangeListener.onRatingChanged(i);
                }
                invalidate();
                return true;
            }
        }
        return true;
    }

    public int getRating() {
        return this.selectedRating;
    }

    public void setOnRatingChangeListener(OnRatingChangeListener onRatingChangeListener) {
        this.listener = onRatingChangeListener;
    }
}
