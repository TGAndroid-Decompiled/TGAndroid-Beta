package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;

public final class SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout.GroupUsersSearchAdapter f$0;
    public final String f$1;

    public SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1(SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = groupUsersSearchAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter = this.f$0;
                groupUsersSearchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1(groupUsersSearchAdapter, this.f$1, 1));
                break;
            default:
                SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter2 = this.f$0;
                String str = this.f$1;
                ArrayList arrayList = null;
                groupUsersSearchAdapter2.searchRunnable = null;
                if (!ChatObject.isChannel(groupUsersSearchAdapter2.currentChat) && SharedMediaLayout.this.info != null) {
                    arrayList = new ArrayList(SharedMediaLayout.this.info.participants.participants);
                }
                groupUsersSearchAdapter2.searchCount = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new IntroActivity$$ExternalSyntheticLambda5((Object) groupUsersSearchAdapter2, str, (Object) arrayList, 1));
                } else {
                    groupUsersSearchAdapter2.searchCount = 1;
                }
                groupUsersSearchAdapter2.searchAdapterHelper.queryServerSearch(str, false, false, true, false, false, ChatObject.isChannel(groupUsersSearchAdapter2.currentChat) ? groupUsersSearchAdapter2.currentChat.id : 0L, false, 2, 1, 0L, null);
                break;
        }
    }
}
