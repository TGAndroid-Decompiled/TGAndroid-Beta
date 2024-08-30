package org.telegram.ui.Components.spoilers;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.GestureDetectorCompat;
import java.util.Iterator;
import java.util.List;

public class SpoilersClickDetector {
    private GestureDetectorCompat gestureDetector;
    private int horizontalPadding;
    private boolean trackingTap;
    private int verticalPadding;

    public interface OnSpoilerClickedListener {
        void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2);
    }

    public SpoilersClickDetector(View view, List list, OnSpoilerClickedListener onSpoilerClickedListener) {
        this(view, list, true, onSpoilerClickedListener);
    }

    public SpoilersClickDetector(final View view, final List list, final boolean z, final OnSpoilerClickedListener onSpoilerClickedListener) {
        this.gestureDetector = new GestureDetectorCompat(view.getContext(), new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                int x = (int) motionEvent.getX();
                int y = ((int) motionEvent.getY()) + view.getScrollY();
                if (z) {
                    x -= view.getPaddingLeft();
                    y -= view.getPaddingTop();
                }
                int i = x - SpoilersClickDetector.this.horizontalPadding;
                int i2 = y - SpoilersClickDetector.this.verticalPadding;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((SpoilerEffect) it.next()).getBounds().contains(i, i2)) {
                        SpoilersClickDetector.this.trackingTap = true;
                        return true;
                    }
                }
                return false;
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (SpoilersClickDetector.this.trackingTap) {
                    view.playSoundEffect(0);
                    SpoilersClickDetector.this.trackingTap = false;
                    int x = (int) motionEvent.getX();
                    int y = ((int) motionEvent.getY()) + view.getScrollY();
                    if (z) {
                        x -= view.getPaddingLeft();
                        y -= view.getPaddingTop();
                    }
                    int i = x - SpoilersClickDetector.this.horizontalPadding;
                    int i2 = y - SpoilersClickDetector.this.verticalPadding;
                    for (SpoilerEffect spoilerEffect : list) {
                        if (spoilerEffect.getBounds().contains(i, i2)) {
                            onSpoilerClickedListener.onSpoilerClicked(spoilerEffect, i, i2);
                            return true;
                        }
                    }
                }
                return false;
            }
        });
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    public void setAdditionalOffsets(int i, int i2) {
        this.horizontalPadding = i;
        this.verticalPadding = i2;
    }
}
