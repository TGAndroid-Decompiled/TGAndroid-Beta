package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;

public abstract class EntitiesContainerView extends FrameLayout {
    public boolean cancelled;
    public final EntitiesContainerViewDelegate delegate;
    public boolean drawForThumb;
    public boolean hasTransformed;
    public float px;
    public float py;

    public interface EntitiesContainerViewDelegate {
        void onEntityDeselect();

        EntityView onSelectedEntityRequest();
    }

    public EntitiesContainerView(Context context, EntitiesContainerViewDelegate entitiesContainerViewDelegate) {
        super(context);
        this.delegate = entitiesContainerViewDelegate;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.drawForThumb && (view instanceof ReactionWidgetEntityView)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (!(view instanceof TextPaintView)) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        EntitiesContainerViewDelegate entitiesContainerViewDelegate = this.delegate;
        EntityView entityViewOnSelectedEntityRequest = entitiesContainerViewDelegate.onSelectedEntityRequest();
        if (entityViewOnSelectedEntityRequest == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            entityViewOnSelectedEntityRequest.hasPanned = false;
            entityViewOnSelectedEntityRequest.hasReleased = true;
            this.hasTransformed = false;
            this.cancelled = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.hasTransformed = false;
            entityViewOnSelectedEntityRequest.hasPanned = false;
            entityViewOnSelectedEntityRequest.hasReleased = false;
            this.px = motionEvent.getX();
            this.py = motionEvent.getY();
            this.cancelled = false;
            return true;
        }
        if (!this.cancelled && actionMasked == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.hasTransformed || MathUtils.distance(x, y, this.px, this.py) > AndroidUtilities.touchSlop) {
                this.hasTransformed = true;
                entityViewOnSelectedEntityRequest.hasPanned = true;
                entityViewOnSelectedEntityRequest.pan(x - this.px, y - this.py);
                this.px = x;
                this.py = y;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            entityViewOnSelectedEntityRequest.hasPanned = false;
            entityViewOnSelectedEntityRequest.hasReleased = true;
            if (!this.hasTransformed) {
                entitiesContainerViewDelegate.onEntityDeselect();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
