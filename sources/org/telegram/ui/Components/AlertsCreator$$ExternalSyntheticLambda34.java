package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda34 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public AlertsCreator$$ExternalSyntheticLambda34(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$showBanGroupCreatorFromCommunityConfirmAlert$33((AlertDialog[]) this.f$0, (MessagesStorage.LongCallback) this.f$1, this.f$2, view);
                break;
            case 1:
                AlertsCreator.lambda$showBanGroupCreatorFromCommunityJoinedChatsAlert$31((AlertDialog[]) this.f$0, (MessagesStorage.LongCallback) this.f$1, this.f$2, view);
                break;
            default:
                ((InviteMembersBottomSheet) this.f$0).lambda$new$2((Context) this.f$1, this.f$2, view);
                break;
        }
    }
}
