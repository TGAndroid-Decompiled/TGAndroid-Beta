package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.JsPromptResult;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichCaptionController;
import org.telegram.ui.iv.RichCommandSuggestions$MenuFactory;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCellHost;
import org.telegram.ui.iv.TableModel;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.MHTML;

public final class TodoItemMenu$$ExternalSyntheticLambda19 implements PollCreateActivity.PollCreateActivityDelegate, MessagesStorage.BooleanCallback, ProfileNotificationsActivity.ProfileNotificationsActivityDelegate, AlertDialog.OnButtonClickListener, OnSuccessListener, RecyclerListView.OnItemLongClickListener, RichCommandSuggestions$MenuFactory, EditTextCaption.EditTextCaptionDelegate, RichInlineButtonEditor.UserPicked {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public TodoItemMenu$$ExternalSyntheticLambda19(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException) {
        TopicsNotifySettingsFragments topicsNotifySettingsFragments = TopicsNotifySettingsFragments.this;
        topicsNotifySettingsFragments.exceptionsTopics.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f$1).id));
        topicsNotifySettingsFragments.updateRows$29();
    }

    @Override
    public void didRemoveException() {
    }

    @Override
    public ItemOptions make(RichEditText richEditText) {
        ChatAttachAlertRichLayout chatAttachAlertRichLayout = (ChatAttachAlertRichLayout) ((PhotoViewer.AnonymousClass14) this.f$0).this$0;
        ItemOptions itemOptions = new ItemOptions(chatAttachAlertRichLayout, (Theme.ResourcesProvider) this.f$1, richEditText, false, false, true);
        chatAttachAlertRichLayout.menu = itemOptions;
        return itemOptions;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 3:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$47((byte[]) this.f$1);
                break;
            case 4:
                VoIPFragment voIPFragment = (VoIPFragment) this.f$0;
                voIPFragment.getClass();
                ((boolean[]) this.f$1)[0] = true;
                voIPFragment.currentState = 17;
                Intent intent = new Intent(voIPFragment.activity, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", voIPFragment.callingUser.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", voIPFragment.currentAccount);
                try {
                    voIPFragment.activity.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
                break;
            case 6:
                ((Consumer) this.f$0).accept(Boolean.TRUE);
                ((boolean[]) this.f$1)[0] = true;
                alertDialog.dismiss();
                break;
            case 7:
                ((ChannelAffiliateProgramsFragment) this.f$0).lambda$createView$6((TL_payments.connectedBotStarRef) this.f$1);
                break;
            case 13:
                ((BookmarksFragment) this.f$0).lambda$deleteSelectedMessages$0((HashSet) this.f$1);
                break;
            case 14:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(botWebViewContainer.currentAccount).getInputUser(botWebViewContainer.botUser);
                ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequest(allowsendmessage, new StarGiftSheet$$ExternalSyntheticLambda7(botWebViewContainer, (String[]) this.f$1, alertDialog, 13));
                break;
            default:
                boolean[] zArr = (boolean[]) this.f$0;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f$1).cancel();
                }
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        return ((ChannelAffiliateProgramsFragment) this.f$0).lambda$createView$8((Context) this.f$1, view, i);
    }

    @Override
    public void onSpansChanged() {
        switch (this.$r8$classId) {
            case 10:
                ((RichCaptionController) this.f$0).persist();
                ((RichCaptionController.Host) this.f$1).onCaptionSpansChanged();
                break;
            default:
                RichTableCell richTableCell = (RichTableCell) this.f$0;
                richTableCell.getClass();
                RichTableCellHost richTableCellHost = (RichTableCellHost) this.f$1;
                TL_iv.pageTableCell pagetablecell = richTableCellHost.cell;
                if (pagetablecell != null) {
                    TableModel.applyStyledText(pagetablecell, richTableCellHost.editText.getText());
                }
                RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
                if (anonymousClass12 != null && richTableCell.currentRow != null) {
                    RichEditorListView.access$3700(RichEditorListView.this);
                    break;
                }
                break;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        FileLog.d("wear-auth: /token delivered to " + ((String) ((MHTML) this.f$0).boundary));
        ((ButtonWithCounterView) this.f$1).setLoading(false);
        WearAuthSheet.currentSession = null;
        BottomSheet bottomSheet = WearAuthSheet.currentSheet;
        if (bottomSheet != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
            WearAuthSheet.currentSheet = null;
        }
    }

    @Override
    public void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        ((RichEditorListView.BlockButtonEdit) this.f$0).apply((String) this.f$1, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public void sendPoll(TLRPC.MessageMedia messageMedia) {
        TodoItemMenu todoItemMenu = (TodoItemMenu) this.f$0;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = todoItemMenu.messageObject.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        todoItemMenu.messageObject.messageOwner.media = messageMedia;
        ((ChatActivity) this.f$1).getSendMessagesHelper().editMessage(todoItemMenu.messageObject, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void run(boolean z) {
        TopicsFragment topicsFragment = TopicsFragment.this;
        NotificationCenter notificationCenter = topicsFragment.getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(topicsFragment, i);
        topicsFragment.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        topicsFragment.finishFragment();
        NotificationCenter notificationCenter2 = topicsFragment.getNotificationCenter();
        int i2 = NotificationCenter.needDeleteDialog;
        TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z));
    }
}
