package org.telegram.ui.Components.ListView;

import android.graphics.Canvas;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.RecyclerListView;

public abstract class RecyclerListViewWithOverlayDraw extends RecyclerListView {
    public boolean invalidated;

    public interface OverlayView {
        float getX();

        float getY();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.invalidated = false;
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof OverlayView) {
                OverlayView overlayView = (OverlayView) getChildAt(i);
                canvas.save();
                canvas.translate(overlayView.getX(), overlayView.getY());
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) overlayView;
                if (stickerEmojiCell.drawInParentView) {
                    stickerEmojiCell.drawInternal(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.invalidated) {
            return;
        }
        super.invalidate();
        this.invalidated = true;
    }
}
