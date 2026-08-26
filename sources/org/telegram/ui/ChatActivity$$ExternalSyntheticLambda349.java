package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.PollEditTextCell;

public final class ChatActivity$$ExternalSyntheticLambda349 implements View.OnKeyListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda349(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ((ChatActivity) this.f$0).lambda$pollAddOptionModeStart$479(view, i, keyEvent);
            case 1:
                return PollCreateActivity.ListAdapter.lambda$onCreateViewHolder$1((PollEditTextCell) this.f$0, view, i, keyEvent);
            default:
                return ((PassportActivity) this.f$0).lambda$createPhoneInterface$31(view, i, keyEvent);
        }
    }
}
