package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;

public final class GroupCallActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda8(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.checkInsets$2();
                break;
            case 1:
                GroupCallActivity groupCallActivity = this.f$0;
                if (groupCallActivity.isRtmpStream() && AndroidUtilities.checkInlinePermissions(groupCallActivity.parentActivity) && !RTMPStreamPipOverlay.instance.isVisible) {
                    groupCallActivity.lambda$showGiftOfferSheet$15();
                    AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda8(groupCallActivity, 5), 100L);
                    break;
                }
                break;
            case 2:
                GroupCallActivity groupCallActivity2 = this.f$0;
                if (groupCallActivity2.call != null && groupCallActivity2.scheduled && VoIPService.getSharedInstance() != null) {
                    try {
                        groupCallActivity2.muteButton.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    groupCallActivity2.updateMuteButton(1, true);
                    AndroidUtilities.runOnUIThread(groupCallActivity2.unmuteRunnable, 80L);
                    groupCallActivity2.scheduled = false;
                    groupCallActivity2.pressed = true;
                    break;
                }
                break;
            case 3:
                GroupCallActivity groupCallActivity3 = this.f$0;
                int i = groupCallActivity3.currentCallState;
                if (i == 1 || i == 2 || i == 6 || i == 5) {
                    groupCallActivity3.updateState(true, false);
                }
                break;
            case 4:
                GroupCallActivity groupCallActivity4 = this.f$0;
                if (groupCallActivity4.call != null) {
                    int currentTime = groupCallActivity4.accountInstance.getConnectionsManager().getCurrentTime();
                    ChatObject.Call call = groupCallActivity4.call;
                    int i2 = currentTime - call.call.record_start_date;
                    boolean z = call.recording;
                    ActionBarMenuSubItem actionBarMenuSubItem = groupCallActivity4.recordItem;
                    if (z) {
                        actionBarMenuSubItem.setSubtext(AndroidUtilities.formatDuration(i2, false));
                    } else {
                        actionBarMenuSubItem.setSubtext(null);
                    }
                }
                AndroidUtilities.runOnUIThread(groupCallActivity4.updateCallRecordRunnable, 1000L);
                break;
            case 5:
                RTMPStreamPipOverlay.instance.showInternal(this.f$0.parentActivity);
                break;
            case 6:
                this.f$0.openShareConferenceLink();
                break;
            case 7:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 8:
                GroupCallActivity.AnonymousClass55 anonymousClass55 = this.f$0.shareAlert;
                if (anonymousClass55 != null) {
                    anonymousClass55.show();
                }
                break;
            case 9:
                this.f$0.accountInstance.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                GroupCallActivity groupCallActivity5 = this.f$0;
                groupCallActivity5.pendingCommentsEnabled = null;
                groupCallActivity5.updateButtonsVisibility(true);
                break;
        }
    }
}
