package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class ViewGroupPartRenderer implements IBlur3Capture {
    public boolean ignoreBlurCap;
    private final ViewGroup listView;
    private final DrawChildMethod listViewDrawChildMethod;
    private final ViewGroup listViewParent;
    private final RectF tmpDrawListViewRectF = new RectF();
    private final PointF tmpDrawListViewPointF = new PointF();
    private final RectF savedPos = new RectF();

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
            ViewParent viewParent = this.listView;
            if ((viewParent instanceof IBlur3Capture) && !this.ignoreBlurCap) {
                this.savedPos.set(rectF);
                PointF pointF2 = this.tmpDrawListViewPointF;
                rectF.offset(-pointF2.x, -pointF2.y);
                ((IBlur3Capture) viewParent).capture(canvas, rectF);
                rectF.set(this.savedPos);
            } else {
                for (int i = 0; i < this.listView.getChildCount(); i++) {
                    View childAt = this.listView.getChildAt(i);
                    if (ViewPositionWatcher.computeRectInParent(childAt, this.listViewParent, this.tmpDrawListViewRectF) && this.tmpDrawListViewRectF.intersect(rectF)) {
                        this.listViewDrawChildMethod.drawChild(canvas, childAt, jUptimeMillis);
                    }
                }
            }
            canvas.restore();
        }
    }

    @Override
    public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
        if (!ViewPositionWatcher.computeCoordinatesInParent(this.listView, this.listViewParent, this.tmpDrawListViewPointF)) {
            iBlur3Hash.unsupported();
            return;
        }
        if ((this.listView instanceof IBlur3Capture) && !this.ignoreBlurCap) {
            iBlur3Hash.addF(this.tmpDrawListViewPointF.x);
            iBlur3Hash.addF(this.tmpDrawListViewPointF.y);
            IBlur3Capture iBlur3Capture = (IBlur3Capture) this.listView;
            this.savedPos.set(rectF);
            PointF pointF = this.tmpDrawListViewPointF;
            rectF.offset(-pointF.x, -pointF.y);
            iBlur3Capture.captureCalculateHash(iBlur3Hash, rectF);
            rectF.set(this.savedPos);
            return;
        }
        iBlur3Hash.unsupported();
    }
}
