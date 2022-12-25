package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.p009ui.ActionBar.Theme;

public class BetterRatingView extends View {
    private Bitmap filledStar;
    private Bitmap hollowStar;
    private OnRatingChangeListener listener;
    private int numStars;
    private Paint paint;
    private int selectedRating;

    public interface OnRatingChangeListener {
        void onRatingChanged(int i);
    }

    public BetterRatingView(Context context) {
        super(context);
        this.paint = new Paint();
        this.numStars = 5;
        this.selectedRating = 0;
        this.filledStar = BitmapFactory.decodeResource(getResources(), C1010R.C1011drawable.ic_rating_star_filled).extractAlpha();
        this.hollowStar = BitmapFactory.decodeResource(getResources(), C1010R.C1011drawable.ic_rating_star).extractAlpha();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension((this.numStars * AndroidUtilities.m35dp(32.0f)) + ((this.numStars - 1) * AndroidUtilities.m35dp(16.0f)), AndroidUtilities.m35dp(32.0f));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 0;
        while (i < this.numStars) {
            this.paint.setColor(Theme.getColor(i < this.selectedRating ? "dialogTextBlue" : "dialogTextHint"));
            canvas.drawBitmap(i < this.selectedRating ? this.filledStar : this.hollowStar, AndroidUtilities.m35dp(48.0f) * i, 0.0f, this.paint);
            i++;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float m35dp = AndroidUtilities.m35dp(-8.0f);
        for (int i2 = 0; i2 < this.numStars; i2++) {
            if (motionEvent.getX() > m35dp && motionEvent.getX() < AndroidUtilities.m35dp(48.0f) + m35dp && this.selectedRating != (i = i2 + 1)) {
                this.selectedRating = i;
                OnRatingChangeListener onRatingChangeListener = this.listener;
                if (onRatingChangeListener != null) {
                    onRatingChangeListener.onRatingChanged(i);
                }
                invalidate();
                return true;
            }
            m35dp += AndroidUtilities.m35dp(48.0f);
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
