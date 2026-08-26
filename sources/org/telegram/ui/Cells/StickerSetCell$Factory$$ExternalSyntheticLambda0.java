package org.telegram.ui.Cells;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda18;

public final class StickerSetCell$Factory$$ExternalSyntheticLambda0 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public StickerSetCell$Factory$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        UniversalRecyclerView universalRecyclerView;
        ItemTouchHelper itemTouchHelper;
        switch (this.$r8$classId) {
            case 0:
                if (motionEvent.getAction() != 0 || (itemTouchHelper = (universalRecyclerView = (UniversalRecyclerView) this.f$0).itemTouchHelper) == null) {
                    return false;
                }
                itemTouchHelper.startDrag(universalRecyclerView.getChildViewHolder((StickerSetCell) this.f$1));
                return false;
            case 1:
                return ((ActionBarPopupWindow) this.f$0).lambda$init$1((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1, view, motionEvent);
            default:
                EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) this.f$0;
                gifPage.getClass();
                return ContentPreviewViewer.getInstance().onTouch(motionEvent, gifPage.listView, 0, (PaintView$$ExternalSyntheticLambda18) this.f$1, gifPage.previewDelegate, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
        }
    }
}
