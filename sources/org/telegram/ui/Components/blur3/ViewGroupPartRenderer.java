package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public final class ViewGroupPartRenderer implements IBlur3Capture {
    public boolean ignoreBlurCap;
    public final ViewGroup listView;
    public final DrawChildMethod listViewDrawChildMethod;
    public final ViewGroup listViewParent;
    public final RectF tmpDrawListViewRectF = new RectF();
    public final PointF tmpDrawListViewPointF = new PointF();
    public final RectF savedPos = new RectF();

    public interface DrawChildMethod {
        boolean drawChild(Canvas canvas, View view, long j);
    }

    public ViewGroupPartRenderer(ViewGroup viewGroup, ViewGroup viewGroup2, DrawChildMethod drawChildMethod) {
        this.listView = viewGroup;
        this.listViewDrawChildMethod = drawChildMethod;
        this.listViewParent = viewGroup2;
    }

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        PointF pointF = this.tmpDrawListViewPointF;
        ViewGroup viewGroup = this.listView;
        ViewGroup viewGroup2 = this.listViewParent;
        if (ViewPositionWatcher.computeCoordinatesInParent(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof IBlur3Capture) || this.ignoreBlurCap) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    RectF rectF2 = this.tmpDrawListViewRectF;
                    if (ViewPositionWatcher.computeRectInParent(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        this.listViewDrawChildMethod.drawChild(canvas, childAt, jUptimeMillis);
                    }
                }
            } else {
                RectF rectF3 = this.savedPos;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((IBlur3Capture) viewGroup).capture(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }

    @Override
    public final void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
        PointF pointF = this.tmpDrawListViewPointF;
        ViewGroup viewGroup = this.listViewParent;
        ViewGroup viewGroup2 = this.listView;
        if (!ViewPositionWatcher.computeCoordinatesInParent(viewGroup2, viewGroup, pointF)) {
            ((Blur3HashImpl) iBlur3Hash).unsupported = true;
            return;
        }
        if (!(viewGroup2 instanceof IBlur3Capture) || this.ignoreBlurCap) {
            ((Blur3HashImpl) iBlur3Hash).unsupported = true;
            return;
        }
        Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
        blur3HashImpl.addF(pointF.x);
        blur3HashImpl.addF(pointF.y);
        RectF rectF2 = this.savedPos;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((IBlur3Capture) viewGroup2).captureCalculateHash(blur3HashImpl, rectF);
        rectF.set(rectF2);
    }
}
