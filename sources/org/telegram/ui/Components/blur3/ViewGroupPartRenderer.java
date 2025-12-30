package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class ViewGroupPartRenderer implements IBlur3Capture {
    private final ViewGroup listView;
    private final DrawChildMethod listViewDrawChildMethod;
    private final ViewGroup listViewParent;
    private final RectF tmpDrawListViewRectF = new RectF();
    private final PointF tmpDrawListViewPointF = new PointF();

    public interface DrawChildMethod {
        boolean drawChild(Canvas canvas, View view, long j);
    }

    public ViewGroupPartRenderer(ViewGroup viewGroup, ViewGroup viewGroup2, DrawChildMethod drawChildMethod) {
        this.listView = viewGroup;
        this.listViewDrawChildMethod = drawChildMethod;
        this.listViewParent = viewGroup2;
    }

    @Override
    public void capture(Canvas canvas, RectF rectF) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (ViewPositionWatcher.computeCoordinatesInParent(this.listView, this.listViewParent, this.tmpDrawListViewPointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            PointF pointF = this.tmpDrawListViewPointF;
            canvas.translate(pointF.x, pointF.y);
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if (ViewPositionWatcher.computeRectInParent(childAt, this.listViewParent, this.tmpDrawListViewRectF) && this.tmpDrawListViewRectF.intersect(rectF)) {
                    this.listViewDrawChildMethod.drawChild(canvas, childAt, jUptimeMillis);
                }
            }
            canvas.restore();
        }
    }
}
