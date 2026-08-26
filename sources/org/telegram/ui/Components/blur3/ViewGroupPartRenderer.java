package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ListView.RecyclerListViewWithOverlayDraw;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda7;

public final class ViewGroupPartRenderer implements IBlur3Capture {
    public boolean ignoreBlurCap;
    public final ViewGroup listView;
    public final TopicsFragment$$ExternalSyntheticLambda7 listViewDrawChildMethod;
    public final ViewGroup listViewParent;
    public final RectF tmpDrawListViewRectF = new RectF();
    public final PointF tmpDrawListViewPointF = new PointF();
    public final RectF savedPos = new RectF();

    public ViewGroupPartRenderer(ViewGroup viewGroup, ViewGroup viewGroup2, TopicsFragment$$ExternalSyntheticLambda7 topicsFragment$$ExternalSyntheticLambda7) {
        this.listView = viewGroup;
        this.listViewDrawChildMethod = topicsFragment$$ExternalSyntheticLambda7;
        this.listViewParent = viewGroup2;
    }

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        ?? r6;
        long jUptimeMillis = SystemClock.uptimeMillis();
        PointF pointF = this.tmpDrawListViewPointF;
        ?? r3 = this.listView;
        ViewGroup viewGroup = this.listViewParent;
        if (ViewPositionWatcher.computeCoordinatesInParent(r3, viewGroup, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(r3 instanceof IBlur3Capture) || this.ignoreBlurCap) {
                for (int i = 0; i < r3.getChildCount(); i++) {
                    ?? childAt = r3.getChildAt(i);
                    RectF rectF2 = this.tmpDrawListViewRectF;
                    if (ViewPositionWatcher.computeRectInParent(childAt, viewGroup, rectF2) && rectF2.intersect(rectF)) {
                        TopicsFragment$$ExternalSyntheticLambda7 topicsFragment$$ExternalSyntheticLambda7 = this.listViewDrawChildMethod;
                        switch (topicsFragment$$ExternalSyntheticLambda7.$r8$classId) {
                            case 0:
                                ((TopicsFragment.TopicsRecyclerView) topicsFragment$$ExternalSyntheticLambda7.f$0).drawChild(canvas, childAt, jUptimeMillis);
                                continue;
                            case 1:
                                r6 = (UniversalRecyclerView) topicsFragment$$ExternalSyntheticLambda7.f$0;
                                break;
                            case 2:
                                r6 = (EmojiView.EmojiGridView) topicsFragment$$ExternalSyntheticLambda7.f$0;
                                break;
                            case 3:
                                r6 = (RecyclerListView) topicsFragment$$ExternalSyntheticLambda7.f$0;
                                break;
                            case 4:
                                boolean z = childAt instanceof RecyclerListViewWithOverlayDraw.OverlayView;
                                ?? r7 = ((EmojiView) topicsFragment$$ExternalSyntheticLambda7.f$0).stickersGridView;
                                if (z) {
                                    canvas.save();
                                    canvas.translate(childAt.getX(), childAt.getY());
                                    ?? r8 = (StickerEmojiCell) ((RecyclerListViewWithOverlayDraw.OverlayView) childAt);
                                    if (r8.drawInParentView) {
                                        r8.drawInternal(canvas, r7);
                                    }
                                    canvas.restore();
                                }
                                r7.drawChild(canvas, childAt, jUptimeMillis);
                                continue;
                            case 5:
                                r6 = (ShareAlert.AnonymousClass12) topicsFragment$$ExternalSyntheticLambda7.f$0;
                                break;
                            case 6:
                                ((SharedMediaLayout.AnonymousClass19) topicsFragment$$ExternalSyntheticLambda7.f$0).drawChild(canvas, childAt, jUptimeMillis);
                                continue;
                            case 7:
                                r6 = (ProfileGiftsContainer.Page.AnonymousClass1) topicsFragment$$ExternalSyntheticLambda7.f$0;
                                break;
                            default:
                                ProfileActivity profileActivity = (ProfileActivity) topicsFragment$$ExternalSyntheticLambda7.f$0;
                                if (childAt != profileActivity.sharedMediaLayout) {
                                    profileActivity.listView.drawChild(canvas, childAt, jUptimeMillis);
                                    continue;
                                }
                                break;
                        }
                        r6.drawChild(canvas, childAt, jUptimeMillis);
                    }
                }
            } else {
                RectF rectF3 = this.savedPos;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((IBlur3Capture) r3).capture(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }

    @Override
    public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
        PointF pointF = this.tmpDrawListViewPointF;
        ViewGroup viewGroup = this.listViewParent;
        ViewGroup viewGroup2 = this.listView;
        if (!ViewPositionWatcher.computeCoordinatesInParent(viewGroup2, viewGroup, pointF)) {
            blur3HashImpl.unsupported = true;
            return;
        }
        if (!(viewGroup2 instanceof IBlur3Capture) || this.ignoreBlurCap) {
            blur3HashImpl.unsupported = true;
            return;
        }
        blur3HashImpl.addF(pointF.x);
        blur3HashImpl.addF(pointF.y);
        RectF rectF2 = this.savedPos;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((IBlur3Capture) viewGroup2).captureCalculateHash(blur3HashImpl, rectF);
        rectF.set(rectF2);
    }
}
