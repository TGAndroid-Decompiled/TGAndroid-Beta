package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.web.HttpGetFileTask;

public final class LinkManager$$ExternalSyntheticLambda17 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final Object f$0;

    public LinkManager$$ExternalSyntheticLambda17(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = (LinkManager) this.f$0;
                if (linkManager.currentRequestId >= 0) {
                    ConnectionsManager.getInstance(linkManager.currentAccount).cancelRequest(linkManager.currentRequestId, true);
                    linkManager.currentRequestId = -1;
                }
                break;
            case 1:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.postponedScrollIsCanceled = true;
                chatActivity.postponedScrollMessageId = 0;
                chatActivity.nextScrollToMessageId = 0;
                chatActivity.forceNextPinnedMessageId = 0;
                chatActivity.invalidateMessagesVisiblePart();
                chatActivity.showPinnedProgress(false);
                break;
            case 2:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                chatEditActivity.createAfterUpload = false;
                chatEditActivity.progressDialog = null;
                chatEditActivity.donePressed = false;
                break;
            case 3:
                ((ChatLinkActivity) this.f$0).waitingForFullChat = null;
                break;
            case 4:
                ((ChatAttachAlert) this.f$0).lambda$dismiss$70();
                break;
            case 5:
                ((View) this.f$0).setTag(null);
                break;
            case 6:
                ((CropView) this.f$0).hasAspectRatioDialog = false;
                break;
            case 7:
                ((TodoItemMenu$$ExternalSyntheticLambda9) this.f$0).run();
                break;
            case 8:
                ((TodoItemMenu$$ExternalSyntheticLambda2) this.f$0).run();
                break;
            case 9:
                ((HttpGetFileTask) this.f$0).cancel(true);
                break;
            default:
                CommunityUtils.PendingRequests pendingRequests = (CommunityUtils.PendingRequests) this.f$0;
                ConnectionsManager.getInstance(pendingRequests.currentAccount).cancelRequest(pendingRequests.reqId, true);
                pendingRequests.progressDialog = null;
                pendingRequests.reqId = 0;
                break;
        }
    }
}
