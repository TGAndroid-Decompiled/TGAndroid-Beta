package org.telegram.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.EditText;
import androidx.core.util.Consumer;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.ReactedUsersListView;

public final class ChatActivity$$ExternalSyntheticLambda189 implements AlertsCreator.ScheduleDatePickerDelegate, LanguageDetector.ExceptionCallback, ReactedUsersListView.OnProfileSelectedListener, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, AlertDialog.OnButtonClickListener, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, PhotoAttachPhotoCell.PhotoAttachPhotoCellDelegate, ImageReceiver.ImageReceiverDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda189(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public void didEnterPassword(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ChatRightsEditActivity) this.f$0).initTransfer((TwoStepVerificationActivity) this.f$1, tL_inputCheckPasswordSRP);
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f$1, chatActivity.dialog_id, chatActivity.replyingMessageObject, chatActivity.threadMessageObject, null, false, null, null, null, z, i, 0, null, false));
                chatActivity.chatActivityEnterView.setFieldText("");
                chatActivity.hideFieldPanel(false);
                break;
            case 4:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                if (!z) {
                    chatMessageCellDelegate.getClass();
                } else {
                    MessagesController messagesController = ChatActivity.this.getMessagesController();
                    MessageObject messageObject = (MessageObject) this.f$1;
                    messagesController.approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.id, i);
                }
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of((String) this.f$1, chatActivityEnterView.dialog_id, chatActivityEnterView.replyingMessageObject, chatActivityEnterView.getThreadMessage(), null, false, null, null, null, z, i, i2, null, false);
                ChatActivity chatActivity2 = chatActivityEnterView.parentFragment;
                sendMessageParamsOf.sendMessageChatArguments = chatActivity2 != null ? chatActivity2.getMessageChatSendParams() : null;
                sendMessageParamsOf.effect_id = chatActivityEnterView.effectId;
                SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount).sendMessage(sendMessageParamsOf);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.botCommandsMenuContainer.dismiss();
                chatActivityEnterView.effectId = 0L;
                chatActivityEnterView.sendButton.setEffect(0L);
                break;
            case 25:
                ((ChatActivityEnterView.ChatActivityEditTextCaption) this.f$0).send((InputContentInfoCompat) this.f$1, z, i, i2);
                break;
            default:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                chatAttachAlertLocationLayout.delegate.didSelectLocation(((ChatAttachAlertLocationLayout.VenueLocation) this.f$1).venue, chatAttachAlertLocationLayout.locationType, z, i, 0L);
                chatAttachAlertLocationLayout.parentAlert.dismiss(true);
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        MediaController.PhotoEntry photoEntry;
        ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell = (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell) this.f$0;
        mediaCell.getClass();
        if (z && !z2 && (photoEntry = (MediaController.PhotoEntry) this.f$1) != null && photoEntry.hasSpoiler && mediaCell.blurredImage.getBitmap() == null) {
            if (mediaCell.blurredImage.getBitmap() != null && !mediaCell.blurredImage.getBitmap().isRecycled()) {
                mediaCell.blurredImage.getBitmap().recycle();
                mediaCell.blurredImage.setImageBitmap((Bitmap) null);
            }
            mediaCell.blurredImage.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onCheckClick(PhotoAttachPhotoCell photoAttachPhotoCell) {
        TLRPC.Chat chat;
        ChatAttachAlertPhotoLayout.PhotoAttachAdapter photoAttachAdapter = (ChatAttachAlertPhotoLayout.PhotoAttachAdapter) this.f$0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
        if (chatAttachAlertPhotoLayout.mediaEnabled) {
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.isPollAttach) {
                return;
            }
            int iIntValue = ((Integer) photoAttachPhotoCell.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = photoAttachPhotoCell.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.checkSendMediaEnabled(photoEntry)) {
                return;
            }
            HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
            int size = map.size() + 1;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (size > (((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).chatMode == 5) ? baseFragment.getMessagesController().config.quickReplyMessagesLimit.get() - ((ChatActivity) baseFragment).messages.size() : Integer.MAX_VALUE)) {
                new BulletinFactory(chatAttachAlert.sizeNotifierFrameLayout, chatAttachAlertPhotoLayout.resourcesProvider).createErrorBulletin(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", baseFragment.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).show();
                return;
            }
            boolean zContainsKey = map.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z = !zContainsKey;
            if (!zContainsKey && chatAttachAlert.maxSelectedPhotos >= 0 && map.size() >= chatAttachAlert.maxSelectedPhotos) {
                if (!chatAttachAlert.allowOrder || !(baseFragment instanceof ChatActivity) || (chat = ((ChatActivity) baseFragment).currentChat) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.alertOnlyOnce == 2) {
                    return;
                }
                AlertsCreator.createSimpleAlert(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.resourcesProvider).show();
                if (chatAttachAlertPhotoLayout.alertOnlyOnce == 1) {
                    chatAttachAlertPhotoLayout.alertOnlyOnce = 2;
                    return;
                }
                return;
            }
            int size2 = !zContainsKey ? ChatAttachAlertPhotoLayout.selectedPhotosOrder.size() : -1;
            if ((baseFragment instanceof ChatActivity) && chatAttachAlert.allowOrder) {
                photoAttachPhotoCell.setChecked(size2, z, true);
            } else {
                photoAttachPhotoCell.setChecked(-1, z, true);
            }
            chatAttachAlertPhotoLayout.addToSelectedPhotos(photoEntry, iIntValue);
            ChatAttachAlertPhotoLayout.PhotoAttachAdapter photoAttachAdapter2 = chatAttachAlertPhotoLayout.cameraAttachAdapter;
            if (photoAttachAdapter == photoAttachAdapter2) {
                ChatAttachAlertPhotoLayout.PhotoAttachAdapter photoAttachAdapter3 = chatAttachAlertPhotoLayout.adapter;
                if (photoAttachAdapter3.needCamera && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                    iIntValue++;
                }
                if (photoAttachAdapter3.hasCameraSpaceRow && iIntValue >= chatAttachAlertPhotoLayout.itemsPerRow) {
                    iIntValue++;
                }
                photoAttachAdapter3.notifyItemChanged(iIntValue);
            } else {
                photoAttachAdapter2.notifyItemChanged(iIntValue);
            }
            chatAttachAlert.updateCountButton(zContainsKey ? 2 : 1);
            boolean z2 = photoEntry.hasSpoiler;
            PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) this.f$1;
            photoAttachPhotoCell2.setHasSpoiler(z2);
            photoAttachPhotoCell2.setHighQuality(photoEntry.isHighQuality());
            photoAttachPhotoCell2.setStarsPrice(photoEntry.starsAmount, map.size() > 1);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        int i2;
        switch (this.$r8$classId) {
            case 7:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) this.f$0;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f$1);
                tL_channels_updateUsername.username = "";
                chatEditTypeActivity.getConnectionsManager().sendRequest(tL_channels_updateUsername, new ChatEditTypeActivity$$ExternalSyntheticLambda0(chatEditTypeActivity, 0), 64);
                break;
            case 8:
            case 9:
            case 10:
            default:
                boolean[] zArr = (boolean[]) this.f$1;
                boolean z = zArr[0];
                boolean z2 = zArr[1];
                DialogsActivity$$ExternalSyntheticLambda89 dialogsActivity$$ExternalSyntheticLambda89 = (DialogsActivity$$ExternalSyntheticLambda89) this.f$0;
                DialogsActivity dialogsActivity = (DialogsActivity) dialogsActivity$$ExternalSyntheticLambda89.f$0;
                dialogsActivity.getClass();
                ArrayList arrayList = (ArrayList) dialogsActivity$$ExternalSyntheticLambda89.f$1;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Long l = (Long) arrayList.get(i3);
                    long jLongValue = l.longValue();
                    if (z) {
                        dialogsActivity.getMessagesController().reportSpam(jLongValue, dialogsActivity.getMessagesController().getUser(l), null, null, false);
                    }
                    if (z2) {
                        dialogsActivity.getMessagesController().deleteDialog(jLongValue, 0, true);
                    }
                    dialogsActivity.getMessagesController().blockPeer(jLongValue);
                }
                dialogsActivity.hideActionMode$1(false);
                break;
            case 11:
                ((AIEditorAlert) this.f$0).lambda$new$6((TL_aicompose.TL_aiComposeTone) this.f$1, alertDialog);
                break;
            case 12:
                alertDialog.dismiss();
                ((ArticleViewer$$ExternalSyntheticLambda21) this.f$0).run(((EditText) this.f$1).getText().toString());
                break;
            case 13:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f$0;
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (languageFromDict == null) {
                    languageFromDict = new LocaleController.LocaleInfo();
                    languageFromDict.name = tL_langPackLanguage.native_name;
                    languageFromDict.nameEnglish = tL_langPackLanguage.name;
                    languageFromDict.shortName = tL_langPackLanguage.lang_code;
                    languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
                    languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
                    languageFromDict.isRtl = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        languageFromDict.pathToFile = "remote";
                    } else {
                        languageFromDict.pathToFile = "unofficial";
                    }
                }
                LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
                LaunchActivity launchActivity = (LaunchActivity) this.f$1;
                ActionBarLayout actionBarLayout = launchActivity.layersActionBarLayout;
                if (actionBarLayout != null) {
                    actionBarLayout.rebuildAllFragmentViews(true, true);
                } else {
                    launchActivity.actionBarLayout.rebuildAllFragmentViews(true, true);
                }
                break;
            case 14:
                ((AtomicBoolean) this.f$0).set(true);
                ((Consumer) this.f$1).accept(Boolean.FALSE);
                break;
            case 15:
                int i4 = ((int[]) this.f$0)[0];
                if (i4 == 0) {
                    i2 = 900;
                } else if (i4 == 1) {
                    i2 = 3600;
                } else {
                    i2 = i4 == 2 ? 28800 : Integer.MAX_VALUE;
                }
                ((MessagesStorage.IntCallback) this.f$1).run(i2);
                break;
            case 16:
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                editorEdit.remove("color_" + ((String) this.f$1));
                editorEdit.commit();
                Runnable runnable = (Runnable) this.f$0;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 17:
                AlertsCreator.AnonymousClass3 anonymousClass3 = (AlertsCreator.AnonymousClass3) this.f$0;
                String strTrim = anonymousClass3.getText().toString().trim();
                if (TextUtils.isEmpty(strTrim) ? false : AlertsCreator.URL_PATTERN.matcher(strTrim.trim()).matches()) {
                    ((Utilities.Callback) this.f$1).run(strTrim);
                    alertDialog.dismiss();
                } else {
                    AndroidUtilities.shakeView(anonymousClass3);
                }
                break;
            case 18:
                String str = (String) this.f$1;
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(baseFragment.getCurrentAccount()).getInviteText(1));
                    baseFragment.getParentActivity().startActivityForResult(intent, 500);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 19:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f$0;
                int i5 = encryptedChat.ttl;
                int value = ((NumberPicker) this.f$1).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i5 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                }
                break;
            case 20:
                ((VoIPFragment$$ExternalSyntheticLambda37) this.f$0).run(((boolean[]) this.f$1)[0]);
                break;
            case 21:
                ((Utilities.Callback) this.f$0).run(Boolean.valueOf(((boolean[]) this.f$1)[0]));
                break;
            case 22:
                ((MessagesStorage.BooleanCallback) this.f$0).run(((boolean[]) this.f$1)[0]);
                break;
        }
    }

    @Override
    public void onComplete(Object obj) {
        Pair pair = (Pair) obj;
        ChatActivity.ThemeDelegate themeDelegate = (ChatActivity.ThemeDelegate) this.f$0;
        themeDelegate.getClass();
        if (pair == null) {
            return;
        }
        long jLongValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        EmojiThemes emojiThemes = themeDelegate.chatTheme;
        if (emojiThemes != null) {
            if (jLongValue != ((EmojiThemes.ThemeItem) emojiThemes.items.get(themeDelegate.isDark ? 1 : 0)).getThemeId() || bitmap == null) {
                return;
            }
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) this.f$1;
            motionBackgroundDrawable.patternGiftBitmap = bitmap;
            motionBackgroundDrawable.invalidateParent();
        }
    }

    @Override
    public void onError(Throwable th) {
        ResultCallback.CC.$default$onError(this, th);
    }

    @Override
    public void onProfileSelected(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        ChatActivity.AnonymousClass106 anonymousClass106 = (ChatActivity.AnonymousClass106) this.f$0;
        anonymousClass106.getClass();
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("report_reaction_message_id", ((MessageObject) this.f$1).getId());
        ChatActivity chatActivity = ChatActivity.this;
        bundle.putLong("report_reaction_from_dialog_id", chatActivity.dialog_id);
        chatActivity.presentFragment(new ProfileActivity(bundle, null));
        chatActivity.closeMenu(true);
    }

    @Override
    public void run(long j) {
        switch (this.$r8$classId) {
            case 6:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                chatEditActivity.getClass();
                ((AlertDialog) this.f$1).dismiss();
                chatEditActivity.donePressed = false;
                if (j != 0) {
                    chatEditActivity.chatId = j;
                    TLRPC.Chat chat = chatEditActivity.getMessagesController().getChat(Long.valueOf(j));
                    chatEditActivity.currentChat = chat;
                    TLRPC.ChatFull chatFull = chatEditActivity.info;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z = chat.forum_tabs != chatEditActivity.forumTabs;
                    chatEditActivity.getMessagesController().toggleChannelForum(chatEditActivity.chatId, chatEditActivity.forum, chatEditActivity.forumTabs);
                    TLRPC.Chat chat2 = chatEditActivity.currentChat;
                    chat2.forum = chatEditActivity.forum;
                    chat2.forum_tabs = chatEditActivity.forumTabs;
                    if (z) {
                        chatEditActivity.updatePastFragmentsOnTabs();
                    }
                    break;
                }
                break;
            case 7:
            default:
                ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (ChatLinkActivity.ListAdapter.AnonymousClass1) this.f$0;
                if (j == 0) {
                    anonymousClass1.getClass();
                } else {
                    ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                    if (chatLinkActivity.isChannel) {
                        chatLinkActivity.chats.set(0, chatLinkActivity.getMessagesController().getChat(Long.valueOf(j)));
                    } else {
                        chatLinkActivity.currentChatId = j;
                        chatLinkActivity.currentChat = chatLinkActivity.getMessagesController().getChat(Long.valueOf(j));
                    }
                    ((Runnable) this.f$1).run();
                }
                break;
            case 8:
                ChatLinkActivity chatLinkActivity2 = (ChatLinkActivity) this.f$0;
                if (j == 0) {
                    chatLinkActivity2.getClass();
                } else {
                    chatLinkActivity2.getMessagesController().toggleChannelInvitesHistory(j, false);
                    chatLinkActivity2.linkChat(chatLinkActivity2.getMessagesController().getChat(Long.valueOf(j)), (GroupCreateFinalActivity) this.f$1);
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda189(String str, int i, Object obj) {
        this.$r8$classId = i;
        this.f$1 = str;
        this.f$0 = obj;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        ResultCallback.CC.$default$onError(this, tL_error);
    }

    @Override
    public void run(Exception exc) {
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f$0).set(false);
        AtomicReference atomicReference = (AtomicReference) this.f$1;
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void run(boolean z) {
        ChatActivity.AnonymousClass16 anonymousClass16 = (ChatActivity.AnonymousClass16) this.f$0;
        anonymousClass16.getClass();
        long j = ((TLRPC.User) this.f$1).id;
        ChatActivity chatActivity = ChatActivity.this;
        long j2 = chatActivity.threadMessageId;
        if (j != j2) {
            return;
        }
        chatActivity.performHistoryClear(j2, false);
    }
}
