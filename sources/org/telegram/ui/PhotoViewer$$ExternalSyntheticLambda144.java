package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PhotoViewer$$ExternalSyntheticLambda144 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public PhotoViewer$$ExternalSyntheticLambda144(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = j;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$27((String) this.f$1, (MediaController.PhotoEntry) this.f$2, this.f$3);
                break;
            case 1:
                ((LaunchActivity.AnonymousClass14) this.f$0).lambda$onMessagesLoaded$2((String) this.f$1, this.f$3, (BaseFragment) this.f$2);
                break;
            case 2:
                ((DialogsActivity) this.f$0).lambda$showChatPreview$99((MessagesController.DialogFilter) this.f$1, (TLRPC.Dialog) this.f$2, this.f$3);
                break;
            case 3:
                ((GroupCallActivity) this.f$0).lambda$inviteUserToCall$61(this.f$3, (AlertDialog[]) this.f$1, (TLRPC.User) this.f$2);
                break;
            default:
                LaunchActivity.lambda$openStories$182((TLObject) this.f$0, (MessagesController) this.f$1, this.f$3, (Runnable) this.f$2);
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda144(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
    }

    public PhotoViewer$$ExternalSyntheticLambda144(GroupCallActivity groupCallActivity, long j, AlertDialog[] alertDialogArr, TLRPC.User user) {
        this.$r8$classId = 3;
        this.f$0 = groupCallActivity;
        this.f$3 = j;
        this.f$1 = alertDialogArr;
        this.f$2 = user;
    }
}
