package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda16 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final View f$0;

    public ChatRightsEditActivity$$ExternalSyntheticLambda16(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ChatRightsEditActivity.lambda$createView$4((DatePicker) this.f$0, dialogInterface);
                break;
            default:
                FilterChatlistActivity.ListAdapter.AnonymousClass1.lambda$editname$8((EditTextBoldCursor) this.f$0, dialogInterface);
                break;
        }
    }
}
