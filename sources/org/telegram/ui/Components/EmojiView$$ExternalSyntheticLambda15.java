package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public final class EmojiView$$ExternalSyntheticLambda15 implements ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate, ViewPositionWatcher.OnChangedListener, ViewGroupPartRenderer.DrawChildMethod, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final EmojiView f$0;

    public EmojiView$$ExternalSyntheticLambda15(EmojiView emojiView, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiView;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return this.f$0.lambda$new$20(canvas, view, j);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$new$2(view, i);
    }

    @Override
    public void onPageSelected(int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$12(i);
                break;
            default:
                this.f$0.lambda$new$8(i);
                break;
        }
    }

    @Override
    public void onPositionChanged(View view, RectF rectF) {
        this.f$0.lambda$new$16(view, rectF);
    }
}
