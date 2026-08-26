package org.telegram.ui.Components.spoilers;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.billingclient.api.zzcv;
import java.util.Iterator;
import java.util.List;

public final class SpoilersClickDetector {
    public final zzcv gestureDetector;
    public int horizontalPadding;
    public boolean trackingTap;
    public int verticalPadding;

    public interface OnSpoilerClickedListener {
        void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2);
    }

    public SpoilersClickDetector(final View view, final List list, final OnSpoilerClickedListener onSpoilerClickedListener) {
        this.gestureDetector = new zzcv(view.getContext(), new GestureDetector.SimpleOnGestureListener() {
            @Override
            public final boolean onDown(MotionEvent motionEvent) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                View view2 = view;
                int scrollY = view2.getScrollY() + y;
                int paddingLeft = x - view2.getPaddingLeft();
                int paddingTop = scrollY - view2.getPaddingTop();
                SpoilersClickDetector spoilersClickDetector = SpoilersClickDetector.this;
                int i = paddingLeft - spoilersClickDetector.horizontalPadding;
                int i2 = paddingTop - spoilersClickDetector.verticalPadding;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((SpoilerEffect) it.next()).getBounds().contains(i, i2)) {
                        spoilersClickDetector.trackingTap = true;
                        return true;
                    }
                }
                return false;
            }

            @Override
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                SpoilersClickDetector spoilersClickDetector = SpoilersClickDetector.this;
                if (spoilersClickDetector.trackingTap) {
                    View view2 = view;
                    view2.playSoundEffect(0);
                    spoilersClickDetector.trackingTap = false;
                    int x = (int) motionEvent.getX();
                    int scrollY = view2.getScrollY() + ((int) motionEvent.getY());
                    int paddingLeft = x - view2.getPaddingLeft();
                    int paddingTop = scrollY - view2.getPaddingTop();
                    int i = paddingLeft - spoilersClickDetector.horizontalPadding;
                    int i2 = paddingTop - spoilersClickDetector.verticalPadding;
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
}
