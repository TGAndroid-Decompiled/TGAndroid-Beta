package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatActivity$$ExternalSyntheticLambda142 implements MessagesStorage.BooleanCallback, AlertDialog.OnButtonClickListener, UsersSelectActivity.FilterUsersActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatActivity$$ExternalSyntheticLambda142(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public void didSelectChats(ArrayList arrayList, int i) {
        ((FilterCreateActivity) this.f$0).lambda$selectChatsFor$18(this.f$1, arrayList, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$checkRecordLocked$361(this.f$1, alertDialog, i);
                break;
            case 1:
            default:
                ((CacheControlActivity) this.f$0).lambda$clearDatabase$24(this.f$1, alertDialog, i);
                break;
            case 2:
                ((GroupCallActivity.AnonymousClass6) this.f$0).lambda$onItemClick$2(this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void run(boolean z) {
        ((ChatActivity.AnonymousClass16.AnonymousClass1) this.f$0).lambda$run$0(this.f$1, z);
    }
}
