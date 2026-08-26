package org.telegram.ui;

import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.LiveCommentsView;

public final class LaunchActivity$$ExternalSyntheticLambda37 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final Object f$3;

    public LaunchActivity$$ExternalSyntheticLambda37(int i, long j, long j2, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                TopicsController topicsController = MessagesController.getInstance(launchActivity.currentAccount).getTopicsController();
                long j = this.f$1;
                long j2 = this.f$2;
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j, j2);
                StringBuilder sbM = AacUtil.m(j, "LaunchActivity openForum after load ", " ");
                sbM.append(j2);
                sbM.append(" TL_forumTopic ");
                sbM.append(tL_forumTopicFindTopic);
                FileLog.d(sbM.toString());
                if (launchActivity.actionBarLayout != null) {
                    MessagesStorage.TopicKey topicKeyOf = MessagesStorage.TopicKey.of(-j, j2);
                    ChatActivity chatActivity = (ChatActivity) this.f$3;
                    ForumUtilities.applyTopic(chatActivity, topicKeyOf);
                    INavigationLayout actionBarLayout = launchActivity.getActionBarLayout();
                    actionBarLayout.getClass();
                    ((ActionBarLayout) actionBarLayout).presentFragment(new INavigationLayout.NavigationParams(chatActivity));
                }
                break;
            case 1:
                ((FileUploadOperation) this.f$0).lambda$checkNewDataAvailable$4((Float) this.f$3, this.f$1, this.f$2);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$loadPinnedMessages$163(this.f$1, this.f$2, (ArrayList) this.f$3);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$saveDraftReplyMessage$192(this.f$1, this.f$2, (TLRPC.Message) this.f$3);
                break;
            case 4:
                ((MessagesStorage) this.f$0).lambda$loadPendingTasks$21(this.f$1, (TLRPC.InputPeer) this.f$3, this.f$2);
                break;
            case 5:
                ((MessagesStorage) this.f$0).lambda$loadPendingTasks$29(this.f$1, this.f$2, (TLRPC.TL_messages_deleteScheduledMessages) this.f$3);
                break;
            case 6:
                ((MessagesStorage) this.f$0).lambda$getUnreadMention$156(this.f$1, this.f$2, (MessagesStorage.IntCallback) this.f$3);
                break;
            case 7:
                ((NotificationsSettingsFacade) this.f$0).lambda$applyDialogNotificationsSettings$1(this.f$1, this.f$2, (TLRPC.PeerNotifySettings) this.f$3);
                break;
            case 8:
                ((GroupCallMessagesController) this.f$0).lambda$processUpdate$3(this.f$1, this.f$2, (byte[]) this.f$3);
                break;
            case 9:
                ((ChatNotificationsPopupWrapper) this.f$0).update(this.f$1, this.f$2, (HashSet) this.f$3);
                break;
            case 10:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                if (dialogsActivity.delegate == null) {
                    dialogsActivity.finishFragment();
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(this.f$1, this.f$2));
                    dialogsActivity.delegate.didSelectDialogs(dialogsActivity, arrayList, null, false, dialogsActivity.notify, dialogsActivity.scheduleDate, dialogsActivity.scheduleRepeatPeriod, (TopicsFragment) this.f$3);
                    if (dialogsActivity.resetDelegate) {
                        dialogsActivity.delegate = null;
                    }
                }
                break;
            case 11:
                ((StarGiftSheet) this.f$0).lambda$doTransfer$164(this.f$1, this.f$2, (Utilities.Callback) this.f$3);
                break;
            default:
                ((LiveCommentsView) this.f$0).send(this.f$1, (TLRPC.TL_textWithEntities) this.f$3, this.f$2);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda37(Object obj, long j, TLObject tLObject, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$3 = tLObject;
        this.f$2 = j2;
    }

    public LaunchActivity$$ExternalSyntheticLambda37(FileUploadOperation fileUploadOperation, Float f, long j, long j2) {
        this.$r8$classId = 1;
        this.f$0 = fileUploadOperation;
        this.f$3 = f;
        this.f$1 = j;
        this.f$2 = j2;
    }
}
