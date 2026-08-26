package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public final class BetterRatingView extends View {
    public final Bitmap filledStar;
    public final Bitmap hollowStar;
    public OnRatingChangeListener listener;
    public final int numStars;
    public final Paint paint;
    public int selectedRating;

    public interface OnRatingChangeListener {
    }

    public BetterRatingView(Activity activity) {
        super(activity);
        this.paint = new Paint();
        this.numStars = 5;
        this.selectedRating = 0;
        this.filledStar = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rating_star_filled).extractAlpha();
        this.hollowStar = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rating_star).extractAlpha();
    }

    public int getRating() {
        return this.selectedRating;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i = 0;
        while (i < this.numStars) {
            Paint paint = this.paint;
            paint.setColor(Theme.getColor(null, i < this.selectedRating ? Theme.key_dialogTextBlue : Theme.key_dialogTextHint, false));
            canvas.drawBitmap(i < this.selectedRating ? this.filledStar : this.hollowStar, AndroidUtilities.dp(48.0f) * i, 0.0f, paint);
            i++;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iDp = AndroidUtilities.dp(32.0f);
        int i3 = this.numStars;
        setMeasuredDimension(RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(i3 - 1, 16.0f, iDp * i3), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float fDp = AndroidUtilities.dp(-8.0f);
        for (int i2 = 0; i2 < this.numStars; i2++) {
            if (motionEvent.getX() > fDp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + fDp && this.selectedRating != (i = i2 + 1)) {
                this.selectedRating = i;
                OnRatingChangeListener onRatingChangeListener = this.listener;
                if (onRatingChangeListener != null) {
                    RadialProgress2$$ExternalSyntheticLambda0 radialProgress2$$ExternalSyntheticLambda0 = (RadialProgress2$$ExternalSyntheticLambda0) onRatingChangeListener;
                    boolean z = i > 0;
                    View view = radialProgress2$$ExternalSyntheticLambda0.f$0;
                    view.setEnabled(z);
                    ((TextView) view).setText(LocaleController.getString(i < 4 ? R.string.Next : R.string.Send).toUpperCase());
                }
                invalidate();
                return true;
            }
            fDp += AndroidUtilities.dp(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(OnRatingChangeListener onRatingChangeListener) {
        this.listener = onRatingChangeListener;
    }
}
