package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;

public final class GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final GroupVoipInviteAlert.SearchAdapter f$0;
    public final String f$1;
    public final int f$2;

    public GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0(GroupVoipInviteAlert.SearchAdapter searchAdapter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = searchAdapter;
        this.f$1 = str;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GroupVoipInviteAlert.SearchAdapter searchAdapter = this.f$0;
                if (searchAdapter.searchRunnable != null) {
                    searchAdapter.searchRunnable = null;
                    AndroidUtilities.runOnUIThread(new GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0(searchAdapter, this.f$1, this.f$2, 1));
                    break;
                }
                break;
            default:
                GroupVoipInviteAlert.SearchAdapter searchAdapter2 = this.f$0;
                String str = this.f$1;
                int i = this.f$2;
                ArrayList arrayList = null;
                searchAdapter2.searchRunnable = null;
                if (!ChatObject.isChannel(GroupVoipInviteAlert.this.currentChat) && GroupVoipInviteAlert.this.info != null) {
                    arrayList = new ArrayList(GroupVoipInviteAlert.this.info.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ArticleViewer$$ExternalSyntheticLambda71(searchAdapter2, str, i, arrayList2, 16));
                } else {
                    searchAdapter2.searchInProgress = false;
                }
                searchAdapter2.searchAdapterHelper.queryServerSearch(str, ChatObject.canAddUsers(GroupVoipInviteAlert.this.currentChat), false, true, false, false, ChatObject.isChannel(GroupVoipInviteAlert.this.currentChat) ? GroupVoipInviteAlert.this.currentChat.id : 0L, false, 2, i, 0L, null);
                break;
        }
    }
}
