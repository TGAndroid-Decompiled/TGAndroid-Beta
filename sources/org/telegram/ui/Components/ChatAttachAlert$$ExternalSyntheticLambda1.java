package org.telegram.ui.Components;

import android.text.Editable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import me.vkryl.android.animator.ReplaceAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.Components.poll.PollSendParams;

public final class ChatAttachAlert$$ExternalSyntheticLambda1 implements ChatAttachAlertLocationLayout.LocationActivityDelegate, ReplaceAnimator.Callback, RecyclerListView.OnItemLongClickListener, AlertDialog.OnButtonClickListener, BlurredBackgroundProviderBuilder.ColorProvider, ActionBarMenuItem.ActionBarMenuItemDelegate, ChatAttachAlertPollLayout.PollCreateActivityDelegate, AlertsCreator.ScheduleDatePickerDelegate, AndroidUtilities.IntColorCallback, ChatAttachAlertAudioLayout.AudioSelectDelegate {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda1(ChatAttachAlert chatAttachAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
    }

    @Override
    public void didSelectAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        ChatAttachAlert chatAttachAlert = this.f$0;
        ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate = chatAttachAlert.audioSelectDelegate;
        if (audioSelectDelegate != null) {
            audioSelectDelegate.didSelectAudio(arrayList, editable, z, i, i2, j, z2, j2);
            return;
        }
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        if (baseFragment == null || !(baseFragment instanceof ChatActivity)) {
            ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
            if (chatAttachViewDelegate != null) {
                chatAttachViewDelegate.sendAudio(arrayList, editable, z, i, i2, j, z2, j2);
                return;
            }
            return;
        }
        ChatActivity chatActivity = (ChatActivity) baseFragment;
        if (chatActivity.checkSlowModeAlert()) {
            chatActivity.fillEditingMediaWithCaption(editable, null);
            SendMessagesHelper.prepareSendingAudioDocuments(chatActivity.getAccountInstance(), arrayList, editable != null ? editable : null, chatActivity.dialog_id, chatActivity.replyingMessageObject, chatActivity.threadMessageObject, null, z, i, i2, chatActivity.editingMessageObject, chatActivity.getMessageChatSendParams(), j, z2, j2);
            chatActivity.afterMessageSend();
        }
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        boolean zSendPressed;
        switch (this.$r8$classId) {
            case 11:
                ChatAttachAlert chatAttachAlert = this.f$0;
                ChatAttachAlert.AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout == chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
                    chatAttachAlert.sendPressed(i, z, 0, chatAttachAlert.isCaptionAbove(), chatAttachAlert.effectId);
                } else if (!attachAlertLayout.sendSelectedItems(i, z, i2, chatAttachAlert.isCaptionAbove(), 0L)) {
                    chatAttachAlert.allowPassConfirmationAlert = true;
                    chatAttachAlert.lambda$showGiftOfferSheet$15();
                }
                break;
            default:
                ChatAttachAlert chatAttachAlert2 = this.f$0;
                ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatAttachAlert2.messageSendPreview;
                long selectedEffect = anonymousClass25 != null ? anonymousClass25.getSelectedEffect() : 0L;
                chatAttachAlert2.effectId = selectedEffect;
                chatAttachAlert2.writeButton.setEffect(selectedEffect);
                ChatAttachAlert.AttachAlertLayout attachAlertLayout2 = chatAttachAlert2.currentAttachLayout;
                if (attachAlertLayout2 == chatAttachAlert2.photoLayout || attachAlertLayout2 == chatAttachAlert2.photoPreviewLayout) {
                    zSendPressed = chatAttachAlert2.sendPressed(i, z, i2, chatAttachAlert2.isCaptionAbove(), selectedEffect);
                } else {
                    if (!attachAlertLayout2.sendSelectedItems(i, z, i2, chatAttachAlert2.isCaptionAbove(), selectedEffect)) {
                        chatAttachAlert2.lambda$showGiftOfferSheet$15();
                    }
                    zSendPressed = false;
                }
                ChatAttachAlert.AnonymousClass25 anonymousClass26 = chatAttachAlert2.messageSendPreview;
                if (anonymousClass26 != null) {
                    anonymousClass26.sent = !zSendPressed;
                    anonymousClass26.dismiss();
                    chatAttachAlert2.messageSendPreview = null;
                }
                break;
        }
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0.baseFragment).didSelectLocation(messageMedia, i, z, i2, 0L);
                break;
            case 9:
                ((ChatActivity) this.f$0.baseFragment).didSelectLocation(messageMedia, i, z, i2, j);
                break;
            default:
                ((ChatActivity) this.f$0.baseFragment).didSelectLocation(messageMedia, i, z, i2, j);
                break;
        }
    }

    @Override
    public int getColor(Theme.ResourcesProvider resourcesProvider, boolean z) {
        switch (this.$r8$classId) {
            case 4:
                ChatAttachAlert chatAttachAlert = this.f$0;
                float f = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int color = Theme.getColor(z ? Theme.key_windowBackgroundGray : Theme.key_dialogBackgroundGray, resourcesProvider);
                int color2 = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
                return chatAttachAlert.hasOverridenWebviewBackgroundColor ? ColorUtils.blendARGB(0.75f, color2, chatAttachAlert.overridenWebviewBackgroundColor) : BlurredBackgroundProviderImpl.solveSrcColor(f, color, color2);
            case 5:
                if (this.f$0.hasOverridenWebviewBackgroundColor) {
                    return 0;
                }
                return z ? 687865855 : -1;
            case 6:
                if (this.f$0.hasOverridenWebviewBackgroundColor) {
                    return 0;
                }
                return z ? 352321535 : -1;
            default:
                ChatAttachAlert chatAttachAlert2 = this.f$0;
                if (chatAttachAlert2.hasOverridenWebviewBackgroundColor) {
                    if (AndroidUtilities.computePerceivedBrightness(chatAttachAlert2.overridenWebviewBackgroundColor) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ChatAttachAlert chatAttachAlert = this.f$0;
        chatAttachAlert.allowPassConfirmationAlert = true;
        chatAttachAlert.lambda$showGiftOfferSheet$15();
    }

    @Override
    public void onForceApplyChanges() {
    }

    @Override
    public void onItemChanged$1(ReplaceAnimator replaceAnimator) {
        this.f$0.onCurrentLayoutAnimatorChanged$1();
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    @Override
    public void run(int i) {
        this.f$0.lambda$dismiss$72(i);
    }

    @Override
    public void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j) {
        String string;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        ChatAttachAlert chatAttachAlert = this.f$0;
        switch (this.$r8$classId) {
            case 10:
                ChatActivity chatActivity = (ChatActivity) chatAttachAlert.baseFragment;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (chatActivity.checkSlowModeAlert()) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, chatActivity.dialog_id, chatActivity.replyingMessageObject, chatActivity.threadMessageObject, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z, i, 0);
                    sendMessageParamsOf.todo = tL_messageMediaToDo;
                    sendMessageParamsOf.sendMessageChatArguments = chatActivity.getMessageChatSendParams();
                    sendMessageParamsOf.payStars = j;
                    sendMessageParamsOf.monoForumPeer = chatActivity.getSendMonoForumPeerId();
                    sendMessageParamsOf.suggestionParams = chatActivity.messageSuggestionParams;
                    chatActivity.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                    chatActivity.afterMessageSend();
                }
                break;
            default:
                ChatActivity chatActivity2 = (ChatActivity) chatAttachAlert.baseFragment;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (chatActivity2.checkSlowModeAlert()) {
                    long jNextLong = Utilities.random.nextLong();
                    if (charSequence != null) {
                        CharSequence[] charSequenceArr = {charSequence};
                        ArrayList<TLRPC.MessageEntity> entities = chatActivity2.getMediaDataController().getEntities(charSequenceArr, true);
                        string = charSequenceArr[0].toString();
                        arrayList2 = entities;
                    } else {
                        string = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(chatActivity2.getAccountInstance(), new PollSendParams(pollAttachedMediaPack, tL_messageMediaPoll, jNextLong, string, arrayList2, arrayList), chatActivity2.dialog_id, chatActivity2.replyingMessageObject, chatActivity2.threadMessageObject, null, chatActivity2.replyingQuote, z, i, chatActivity2.getMessageChatSendParams(), j, chatActivity2.getSendMonoForumPeerId(), chatActivity2.messageSuggestionParams);
                    chatActivity2.afterMessageSend();
                }
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        TLRPC.User user;
        ChatAttachAlert chatAttachAlert = this.f$0;
        if (!(view instanceof ChatAttachAlert.AttachBotButton)) {
            return false;
        }
        ChatAttachAlert.AttachBotButton attachBotButton = (ChatAttachAlert.AttachBotButton) view;
        if (chatAttachAlert.destroyed || (user = attachBotButton.currentUser) == null) {
            return false;
        }
        chatAttachAlert.onLongClickBotButton(attachBotButton.attachMenuBot, user);
        return true;
    }
}
