package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda123 implements AlertDialog.OnButtonClickListener, AlertsCreator.ScheduleDatePickerDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;

    public ChatActivity$$ExternalSyntheticLambda123(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        ((ChatActivity) this.f$0).lambda$didLongPressFormattedDate$420((ArrayList) this.f$1, this.f$2, (ScrimOptions) this.f$3, z, i, i2);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$6(this.f$2, (DialogsActivity) this.f$1, (TLRPC.User) this.f$3, alertDialog, i);
                break;
            default:
                GroupCallActivity.lambda$onLeaveClick$68((ChatObject.Call) this.f$0, (CheckBoxCell[]) this.f$1, this.f$2, (Runnable) this.f$3, alertDialog, i);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda123(ProfileActivity.AnonymousClass6 anonymousClass6, long j, DialogsActivity dialogsActivity, TLRPC.User user) {
        this.$r8$classId = 1;
        this.f$0 = anonymousClass6;
        this.f$2 = j;
        this.f$1 = dialogsActivity;
        this.f$3 = user;
    }
}
