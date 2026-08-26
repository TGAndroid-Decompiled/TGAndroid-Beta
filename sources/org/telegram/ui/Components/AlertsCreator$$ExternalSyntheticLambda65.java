package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Cells.PollEditTextCell;

public final class AlertsCreator$$ExternalSyntheticLambda65 implements View.OnKeyListener {
    public final int $r8$classId;
    public final Object f$0;

    public AlertsCreator$$ExternalSyntheticLambda65(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return AlertsCreator.lambda$showPopupMenu$244((ActionBarPopupWindow) this.f$0, view, i, keyEvent);
            case 1:
                return ChatAttachAlertPollLayout.ListAdapter.lambda$onCreateViewHolder$5((PollEditTextCell) this.f$0, view, i, keyEvent);
            case 2:
                return ((EmojiColorPickerWindow) this.f$0).lambda$new$1(view, i, keyEvent);
            default:
                return ((PhotoViewerCaptionEnterView) this.f$0).lambda$new$3(view, i, keyEvent);
        }
    }
}
