package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;

public class EntitiesContainerView extends FrameLayout {
    private boolean cancelled;
    private EntitiesContainerViewDelegate delegate;
    public boolean drawForThumb;
    private boolean hasTransformed;
    private float px;
    private float py;

    public interface EntitiesContainerViewDelegate {
        void onEntityDeselect();

        EntityView onSelectedEntityRequest();
    }

    public EntitiesContainerView(Context context, EntitiesContainerViewDelegate entitiesContainerViewDelegate) {
        super(context);
        this.delegate = entitiesContainerViewDelegate;
    }

    public int entitiesCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof EntityView) {
                i++;
            }
        }
        return i;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        EntitiesContainerViewDelegate entitiesContainerViewDelegate;
        EntityView onSelectedEntityRequest = this.delegate.onSelectedEntityRequest();
        if (onSelectedEntityRequest == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.hasTransformed = false;
                onSelectedEntityRequest.hasPanned = false;
                onSelectedEntityRequest.hasReleased = false;
                this.px = motionEvent.getX();
                this.py = motionEvent.getY();
                this.cancelled = false;
            } else if (!this.cancelled && actionMasked == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.hasTransformed || MathUtils.distance(x, y, this.px, this.py) > AndroidUtilities.touchSlop) {
                    this.hasTransformed = true;
                    onSelectedEntityRequest.hasPanned = true;
                    onSelectedEntityRequest.pan(x - this.px, y - this.py);
                    this.px = x;
                    this.py = y;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                onSelectedEntityRequest.hasPanned = false;
                onSelectedEntityRequest.hasReleased = true;
                if (!this.hasTransformed && (entitiesContainerViewDelegate = this.delegate) != null) {
                    entitiesContainerViewDelegate.onEntityDeselect();
                }
                invalidate();
                return false;
            }
        } else {
            onSelectedEntityRequest.hasPanned = false;
            onSelectedEntityRequest.hasReleased = true;
            this.hasTransformed = false;
            this.cancelled = true;
            invalidate();
        }
        return true;
    }

    @Override
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view instanceof TextPaintView) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (this.drawForThumb && (view instanceof ReactionWidgetEntityView)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }
}
