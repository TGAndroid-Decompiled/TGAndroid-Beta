package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.LongSparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class TopicsFragment$$ExternalSyntheticLambda17 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;

    public TopicsFragment$$ExternalSyntheticLambda17(KeyEvent.Callback callback, Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$3 = i;
        this.f$2 = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                TopicsFragment topicsFragment = (TopicsFragment) this.f$0;
                MessagesController messagesController = topicsFragment.getMessagesController();
                long j = -topicsFragment.chatId;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f$1;
                if (!messagesController.isDialogMuted(j, tL_forumTopic.id)) {
                    ((ActionBarPopupWindow.ActionBarPopupWindowLayout[]) this.f$2)[0].getSwipeBack().openForeground(this.f$3);
                } else {
                    topicsFragment.getNotificationsController().muteDialog(j, tL_forumTopic.id, false);
                    topicsFragment.finishPreviewFragment();
                    if (BulletinFactory.canShowBulletin(topicsFragment)) {
                        BulletinFactory.createMuteBulletin(topicsFragment, 4, 0, topicsFragment.getResourceProvider()).show();
                    }
                }
                break;
            case 1:
                ((ChannelAdminLogActivity) this.f$0).lambda$createMenu$13(this.f$3, (ArrayList) this.f$1, (Integer) this.f$2);
                break;
            case 2:
                int iIntValue = ((Integer) view.getTag()).intValue();
                int[] iArr = (int[]) this.f$0;
                iArr[0] = iIntValue;
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i = this.f$3;
                if (i == 1) {
                    editorEdit.putInt("popupAll", iArr[0]);
                } else if (i == 0) {
                    editorEdit.putInt("popupGroup", iArr[0]);
                } else {
                    editorEdit.putInt("popupChannel", iArr[0]);
                }
                editorEdit.commit();
                ((AlertDialog.Builder) this.f$1).alertDialog.dismissRunnable.run();
                ((NotificationsCustomSettingsActivity$$ExternalSyntheticLambda8) this.f$2).run();
                break;
            case 3:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                groupCallActivity.getClass();
                ArrayList arrayList = (ArrayList) this.f$1;
                int size = arrayList.size();
                int i2 = this.f$3;
                if (i2 < size) {
                    LongSparseArray longSparseArray = groupCallActivity.call.participants;
                    TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f$2;
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) longSparseArray.get(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    groupCallActivity.processSelectedOption(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i2)).intValue());
                    GroupCallActivity.AnonymousClass63 anonymousClass63 = groupCallActivity.scrimPopupWindow;
                    if (anonymousClass63 != null) {
                        anonymousClass63.dismiss();
                        break;
                    } else if (((Integer) arrayList.get(i2)).intValue() != 9 && ((Integer) arrayList.get(i2)).intValue() != 10 && ((Integer) arrayList.get(i2)).intValue() != 11) {
                        groupCallActivity.dismissAvatarPreview(true);
                        break;
                    }
                }
                break;
            case 4:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                if (!buttonWithCounterView.loading) {
                    buttonWithCounterView.setLoading(true);
                    Context context = (Context) this.f$1;
                    BottomSheet bottomSheet = (BottomSheet) this.f$2;
                    int i3 = this.f$3;
                    PasskeysController.create(context, i3, new ArticleViewer$$ExternalSyntheticLambda57(buttonWithCounterView, context, bottomSheet, i3, 4));
                    break;
                }
                break;
            case 5:
                String str = (String) this.f$2;
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                ((ActionBarPopupWindow) ((AtomicReference) this.f$1).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f$3 == profileActivity.bizHoursRow) {
                        BulletinFactory.of(profileActivity).createCopyBulletin(LocaleController.getString(R.string.BusinessHoursCopied)).show();
                    } else {
                        BulletinFactory.of(profileActivity).createCopyBulletin(LocaleController.getString(R.string.BusinessLocationCopied)).show();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                ((StealthModeAlert) this.f$0).lambda$new$3((TLRPC.User) this.f$1, this.f$3, (Theme.ResourcesProvider) this.f$2);
                break;
        }
    }

    public TopicsFragment$$ExternalSyntheticLambda17(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = i;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public TopicsFragment$$ExternalSyntheticLambda17(BaseFragment baseFragment, Object obj, Serializable serializable, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseFragment;
        this.f$1 = obj;
        this.f$2 = serializable;
        this.f$3 = i;
    }
}
