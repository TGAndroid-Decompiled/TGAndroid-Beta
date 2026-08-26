package org.telegram.ui.iv;

import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.web.BotWebViewContainer;

public final class RichEditor$$ExternalSyntheticLambda57 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public RichEditor$$ExternalSyntheticLambda57(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RichEditor richEditor = (RichEditor) this.f$0;
                AlertsCreator.createScheduleDatePickerDialog(richEditor.getParentActivity(), this.f$1, -1L, 0, new PollItemMenu.AnonymousClass6(richEditor, 12), null, richEditor.getResourceProvider());
                break;
            case 1:
                CommunityUtils.PendingRequests pendingRequests = (CommunityUtils.PendingRequests) this.f$0;
                pendingRequests.doCommitRunnable = null;
                pendingRequests.hiddenJoinRequests.remove(this.f$1);
                pendingRequests.totalCount++;
                pendingRequests.calcUnreadPendingRequests();
                CommunityUtils.PendingRequests.Delegate delegate = pendingRequests.delegate;
                if (delegate != null) {
                    delegate.updateAdapter();
                }
                break;
            case 2:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = (ChatAttachAlertRichLayout) this.f$0;
                AlertsCreator.createScheduleDatePickerDialog(chatAttachAlertRichLayout.parentAlert.baseFragment.getParentActivity(), this.f$1, -1L, 0, new PhotoViewer.AnonymousClass49(chatAttachAlertRichLayout, 16), null, chatAttachAlertRichLayout.resourcesProvider);
                break;
            default:
                BotWebViewContainer.AnonymousClass6 anonymousClass6 = (BotWebViewContainer.AnonymousClass6) this.f$0;
                anonymousClass6.getClass();
                anonymousClass6.presentFragment(ChatActivity.of(this.f$1));
                break;
        }
    }
}
