package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AudioPlayerCell;

public final class AlertsCreator$$ExternalSyntheticLambda66 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public AlertsCreator$$ExternalSyntheticLambda66(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return AlertsCreator.lambda$showPopupMenu$245((ActionBarPopupWindow) this.f$0, (Rect) this.f$1, view, motionEvent);
            case 1:
                return ((AudioPlayerAlert.ListAdapter) this.f$0).lambda$onBindViewHolder$3((AudioPlayerCell) this.f$1, view, motionEvent);
            case 2:
                return ((EmojiPacksAlert) this.f$0).lambda$new$3((EmojiPacksAlert$$ExternalSyntheticLambda8) this.f$1, view, motionEvent);
            case 3:
                return ((StickerMasksAlert) this.f$0).lambda$new$0((Theme.ResourcesProvider) this.f$1, view, motionEvent);
            default:
                return ((SuggestEmojiView) this.f$0).lambda$createListView$2((StarAppsSheet$$ExternalSyntheticLambda0) this.f$1, view, motionEvent);
        }
    }
}
