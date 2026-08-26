package org.telegram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessBotButton;
import org.telegram.ui.Business.BusinessBotButton$$ExternalSyntheticLambda1;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ColorPicker$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EditTextEmoji$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.GigagroupConvertAlert;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.MenuToItemOptions;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.PermanentLinkBottomSheet;
import org.telegram.ui.Components.PhotoViewerCoverEditor;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.web.WebActionBar;

public final class ChatActivity$$ExternalSyntheticLambda62 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda62(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Document document;
        ChatAttachAlert.AttachAlertLayout attachAlertLayout;
        boolean zSendPressed;
        ChatAttachAlert.AnonymousClass25 anonymousClass25;
        MessagePreviewView.ToggleButton toggleButton;
        int i = 3;
        int i2 = 2;
        char c = 1;
        char c2 = 1;
        boolean z = false;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$createView$54((boolean[]) this.f$1, (Context) this.f$2);
                break;
            case 1:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                articleViewer.actionBar.showAddress(false);
                AndroidUtilities.hideKeyboard(articleViewer.actionBar.addressEditText);
                String str = (String) this.f$1;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new BulletinFactory(((ArticleViewer.PageLayout) this.f$2).webViewContainer, null).createCopyLinkBulletin(false).show(true);
                break;
            case 2:
                BusinessBotButton businessBotButton = (BusinessBotButton) this.f$1;
                businessBotButton.getClass();
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(((ChatActivity) this.f$0).getLayoutContainer(), (Theme.ResourcesProvider) this.f$2, businessBotButton.menuView);
                itemOptionsMakeOptions.add(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new BusinessBotButton$$ExternalSyntheticLambda1(businessBotButton, c == true ? 1 : 0), true);
                itemOptionsMakeOptions.makeMultiline();
                if (businessBotButton.manageUrl != null) {
                    itemOptionsMakeOptions.add(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new BusinessBotButton$$ExternalSyntheticLambda1(businessBotButton, i2), false);
                }
                itemOptionsMakeOptions.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                itemOptionsMakeOptions.dimAlpha = 0;
                itemOptionsMakeOptions.show();
                break;
            case 3:
                ((ChatbotSheet) this.f$0).lambda$new$4((TL_account.TL_connectedBot) this.f$1, (OAuthSheet$$ExternalSyntheticLambda17) this.f$2);
                break;
            case 4:
                CachedMediaLayout.AnonymousClass1 anonymousClass1 = (CachedMediaLayout.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                Bundle bundle = new Bundle();
                CacheModel.FileInfo fileInfo = ((CachedMediaLayout.ItemInner) this.f$1).file;
                long j = fileInfo.dialogId;
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putInt("message_id", fileInfo.messageId);
                ((BaseFragment) this.f$2).presentFragment(new ChatActivity(bundle));
                CachedMediaLayout.this.delegate.dismiss();
                ActionBarPopupWindow actionBarPopupWindow = anonymousClass1.popupWindow;
                if (actionBarPopupWindow != null) {
                    actionBarPopupWindow.dismiss(true);
                }
                break;
            case 5:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                if (chatActivity.getParentActivity() != null) {
                    int visibility = chatActivity.bottomChannelButtonsLayout.getVisibility();
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f$1;
                    if (visibility != 0 || TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity.chatActivityEnterView;
                        MessageObject messageObject = (MessageObject) this.f$2;
                        anonymousClass39.didPressedBotButton(keyboardInlineButton, messageObject, messageObject, null);
                    }
                }
                break;
            case 6:
                ReactedUsersListView reactedUsersListView = (ReactedUsersListView) this.f$0;
                if (reactedUsersListView == null || reactedUsersListView.isLoaded) {
                    ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1).getSwipeBack().openForeground(((int[]) this.f$2)[0]);
                }
                break;
            case 7:
                ((ChatActivity) this.f$0).pressedReaction((BaseCell) this.f$1, (TLRPC.ReactionCount) this.f$2, 0.0f, 0.0f);
                break;
            case 8:
                ((ChatActivity) this.f$0).lambda$createView$58((ChatActivity.AnonymousClass42) this.f$2, (boolean[]) this.f$1);
                break;
            case 9:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                ChatActivity chatActivity2 = ChatActivity.this;
                chatActivity2.finishPreviewFragment();
                TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
                chat.left = false;
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$2;
                if (chatMessageCell != null && chatMessageCell.channelRecommendationsCell != null) {
                    chatActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(chatMessageCell.channelRecommendationsCell.chatId));
                }
                chatActivity2.getMessagesController().addUserToChat(chat.id, chatActivity2.getUserConfig().getCurrentUser(), 0, null, ChatActivity.this, new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda34(chatMessageCellDelegate, chat, i));
                break;
            case 10:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                chatEditActivity.getClass();
                Integer num = (Integer) view.getTag();
                RadioButtonCell[] radioButtonCellArr = (RadioButtonCell[]) this.f$1;
                radioButtonCellArr[0].radioButton.setChecked(num.intValue() == 0, true);
                radioButtonCellArr[1].radioButton.setChecked(num.intValue() == 1, true);
                chatEditActivity.historyHidden = num.intValue() == 1;
                ((BottomSheet.Builder) this.f$2).bottomSheet.dismissRunnable.run();
                chatEditActivity.updateFields(true, true);
                break;
            case 11:
                PhotoViewer photoViewer = ((ChooseDownloadQualityLayout) this.f$0).callback.f$0;
                photoViewer.getClass();
                ArrayList arrayList = ((VideoPlayer.Quality) this.f$2).uris;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            VideoPlayer.VideoUri videoUri = (VideoPlayer.VideoUri) obj;
                            if (videoUri.isCached()) {
                                document = videoUri.document;
                            }
                        } else {
                            long j2 = Long.MAX_VALUE;
                            VideoPlayer.VideoUri videoUri2 = null;
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                VideoPlayer.VideoUri videoUri3 = (VideoPlayer.VideoUri) arrayList.get(i5);
                                if (videoUri3.size < j2 && VideoPlayer.supportsHardwareDecoder(videoUri3.codec)) {
                                    j2 = videoUri3.size;
                                    videoUri2 = videoUri3;
                                }
                            }
                            document = videoUri2 != null ? videoUri2.document : ((VideoPlayer.VideoUri) arrayList.get(0)).document;
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.currentAccount).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        MessageObject messageObject2 = (MessageObject) this.f$1;
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.parentActivity, AccountInstance.getInstance(photoViewer.currentAccount), arrayList2, new PhotoViewer$$ExternalSyntheticLambda156(photoViewer, z ? 1 : 0));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.parentActivity, 1, null, null, new PhotoViewer$$ExternalSyntheticLambda26(photoViewer, i2));
                    }
                    photoViewer.menuItem.toggleSubMenu(null, null);
                    break;
                }
                break;
            case 12:
                ((AIEditorAlert.AiStyleAlert) this.f$0).lambda$new$3((TL_aicompose.AiComposeTone) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 13:
                SharedConfig.setSecretMapPreviewType(((Integer) ((ArrayList) this.f$0).get(((Integer) view.getTag()).intValue())).intValue());
                ((Runnable) this.f$1).run();
                ((AlertDialog.Builder) this.f$2).alertDialog.dismissRunnable.run();
                break;
            case 14:
                ((boolean[]) this.f$1)[0] = false;
                ((AlertsCreator.ScheduleDatePickerDelegate) this.f$0).didSelectDate(-1, 0, true);
                ((BottomSheet.Builder) this.f$2).bottomSheet.dismissRunnable.run();
                break;
            case 15:
                AlertDialog alertDialog = ((AlertDialog[]) this.f$0)[0];
                if (alertDialog != null) {
                    alertDialog.setOnDismissListener(null);
                }
                ((AlertDialog$$ExternalSyntheticLambda1) this.f$1).run();
                ((AlertsCreator.AccountSelectDelegate) this.f$2).didSelectAccount(((AccountSelectCell) view).getAccountNumber());
                break;
            case 16:
                AudioPlayerAlert.this.showOptions((AudioPlayerCell) this.f$1, (MessageObject) this.f$2);
                break;
            case 17:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                ChatAttachAlert.AnonymousClass25 anonymousClass26 = chatAttachAlert.messageSendPreview;
                long selectedEffect = anonymousClass26 != null ? anonymousClass26.getSelectedEffect() : 0L;
                chatAttachAlert.effectId = selectedEffect;
                ChatAttachAlert.AnonymousClass24 anonymousClass24 = chatAttachAlert.writeButton;
                anonymousClass24.setEffect(selectedEffect);
                chatAttachAlert.forceKeyboardOnDismiss();
                if (chatAttachAlert.currentLimit - chatAttachAlert.codepointCount < 0) {
                    AndroidUtilities.shakeView(chatAttachAlert.captionLimitView);
                    AndroidUtilities.shakeView(chatAttachAlert.topCaptionLimitView);
                    try {
                        anonymousClass24.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    int i6 = chatAttachAlert.currentAccount;
                    if (!MessagesController.getInstance(i6).premiumFeaturesBlocked() && MessagesController.getInstance(i6).captionLengthLimitPremium > chatAttachAlert.codepointCount) {
                        chatAttachAlert.showCaptionLimitBulletin((BaseFragment) this.f$1);
                    }
                    ChatAttachAlert.AnonymousClass25 anonymousClass27 = chatAttachAlert.messageSendPreview;
                    if (anonymousClass27 != null) {
                        anonymousClass27.sent = false;
                        anonymousClass27.dismiss();
                        chatAttachAlert.messageSendPreview = null;
                    }
                } else {
                    if (chatAttachAlert.editingMessageObject == null) {
                        BaseFragment baseFragment = chatAttachAlert.baseFragment;
                        if (baseFragment instanceof ChatActivity) {
                            ChatActivity chatActivity3 = (ChatActivity) baseFragment;
                            if (chatActivity3.isInScheduleMode()) {
                                AlertsCreator.createScheduleDatePickerDialog(chatAttachAlert.getContext(), chatActivity3.getDialogId(), -1L, 0, new LaunchActivity$$ExternalSyntheticLambda112(chatAttachAlert, selectedEffect, i), null, (Theme.ResourcesProvider) this.f$2);
                            } else {
                                attachAlertLayout = chatAttachAlert.currentAttachLayout;
                                if (attachAlertLayout == chatAttachAlert.photoLayout && attachAlertLayout != chatAttachAlert.photoPreviewLayout) {
                                    if (!attachAlertLayout.sendSelectedItems(0, true, 0, chatAttachAlert.isCaptionAbove(), selectedEffect)) {
                                        chatAttachAlert.allowPassConfirmationAlert = true;
                                        chatAttachAlert.lambda$showGiftOfferSheet$15();
                                    }
                                    zSendPressed = false;
                                }
                                anonymousClass25 = chatAttachAlert.messageSendPreview;
                                if (anonymousClass25 != null) {
                                    anonymousClass25.sent = !zSendPressed;
                                    anonymousClass25.dismiss();
                                    chatAttachAlert.messageSendPreview = null;
                                }
                            }
                        } else {
                            attachAlertLayout = chatAttachAlert.currentAttachLayout;
                            zSendPressed = attachAlertLayout == chatAttachAlert.photoLayout ? chatAttachAlert.sendPressed(0, true, 0, chatAttachAlert.isCaptionAbove(), selectedEffect) : chatAttachAlert.sendPressed(0, true, 0, chatAttachAlert.isCaptionAbove(), selectedEffect);
                            anonymousClass25 = chatAttachAlert.messageSendPreview;
                            if (anonymousClass25 != null) {
                                anonymousClass25.sent = !zSendPressed;
                                anonymousClass25.dismiss();
                                chatAttachAlert.messageSendPreview = null;
                            }
                        }
                    } else {
                        attachAlertLayout = chatAttachAlert.currentAttachLayout;
                        if (attachAlertLayout == chatAttachAlert.photoLayout) {
                        }
                        anonymousClass25 = chatAttachAlert.messageSendPreview;
                        if (anonymousClass25 != null) {
                            anonymousClass25.sent = !zSendPressed;
                            anonymousClass25.dismiss();
                            chatAttachAlert.messageSendPreview = null;
                        }
                    }
                    chatAttachAlert.setCaptionAbove(false, false);
                }
                break;
            case 18:
                ChatAttachAlert chatAttachAlert2 = (ChatAttachAlert) this.f$0;
                chatAttachAlert2.setCaptionAbove(!chatAttachAlert2.captionAbove, true);
                MessageObject messageObject3 = (MessageObject) this.f$1;
                TLRPC.Message message = messageObject3.messageOwner;
                boolean z2 = chatAttachAlert2.captionAbove;
                message.invert_media = z2;
                ((MessagePreviewView.ToggleButton) this.f$2).setState(!z2, true);
                ChatAttachAlert.AnonymousClass25 anonymousClass28 = chatAttachAlert2.messageSendPreview;
                MessageObject.GroupedMessages validGroupedMessage$1 = anonymousClass28.getValidGroupedMessage$1(messageObject3);
                if (validGroupedMessage$1 != null) {
                    validGroupedMessage$1.calculate();
                    ArrayList<MessageObject> arrayList3 = validGroupedMessage$1.messages;
                    int size2 = arrayList3.size();
                    while (i3 < size2) {
                        MessageObject messageObject4 = arrayList3.get(i3);
                        i3++;
                        anonymousClass28.changeMessageInternal(messageObject4);
                    }
                } else {
                    anonymousClass28.changeMessageInternal(messageObject3);
                }
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert2.photoLayout;
                if (chatAttachAlertPhotoLayout != null && (toggleButton = chatAttachAlertPhotoLayout.captionItem) != null) {
                    toggleButton.setState(!chatAttachAlert2.captionAbove, true);
                }
                chatAttachAlert2.messageSendPreview.scrollTo(!chatAttachAlert2.captionAbove);
                break;
            case 19:
                ((CreateRtmpStreamBottomSheet.TextDetailCellFactory) this.f$0).getClass();
                AndroidUtilities.addToClipboard(((TextDetailCell) this.f$1).textView.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText((Context) this.f$2, LocaleController.getString(R.string.TextCopied), 0).show();
                }
                break;
            case 20:
                ((EditTextCaption) this.f$0).lambda$showInputDialog$5((WebActionBar.AnonymousClass4) this.f$1, (ChatActivity$$ExternalSyntheticLambda488) this.f$2, view);
                break;
            case 21:
                EditTextEmoji editTextEmoji = (EditTextEmoji) this.f$0;
                EditTextEmoji.AnonymousClass3 anonymousClass3 = editTextEmoji.emojiButton;
                if (anonymousClass3.isEnabled() && anonymousClass3.getAlpha() >= 0.5f) {
                    AdjustPanLayoutHelper adjustPanLayoutHelper = editTextEmoji.adjustPanLayoutHelper;
                    if (adjustPanLayoutHelper == null || !adjustPanLayoutHelper.animationInProgress) {
                        boolean z3 = editTextEmoji.shownFormatButton;
                        EditTextEmoji.AnonymousClass2 anonymousClass2 = editTextEmoji.editText;
                        if (z3) {
                            anonymousClass2.hideActionMode();
                            ItemOptions itemOptions = new ItemOptions((SizeNotifierFrameLayout) this.f$1, (Theme.ResourcesProvider) this.f$2, editTextEmoji.emojiButton, false, false, true);
                            itemOptions.maxHeight = AndroidUtilities.dp(280.0f);
                            anonymousClass2.extendActionMode(null, new MenuToItemOptions(itemOptions, new EditTextEmoji$$ExternalSyntheticLambda2(anonymousClass2, z ? 1 : 0), anonymousClass2.getOnPremiumMenuLockClickListener()));
                            itemOptions.forceTop = true;
                            itemOptions.show();
                        } else if (editTextEmoji.emojiViewVisible) {
                            if (editTextEmoji.emojiExpanded) {
                                editTextEmoji.hidePopup(true);
                                editTextEmoji.emojiExpanded = false;
                                editTextEmoji.onEmojiKeyboardUpdate();
                            }
                            editTextEmoji.openKeyboardInternal();
                        } else {
                            editTextEmoji.showPopup(1);
                            boolean zIsFocused = anonymousClass2.isFocused();
                            editTextEmoji.emojiView.onOpen(anonymousClass2.length() > 0, false);
                            anonymousClass2.requestFocus();
                            if (!zIsFocused) {
                                anonymousClass2.setSelection(anonymousClass2.length());
                            }
                        }
                    }
                    break;
                }
                break;
            case 22:
                GigagroupConvertAlert gigagroupConvertAlert = (GigagroupConvertAlert) this.f$0;
                gigagroupConvertAlert.lambda$showGiftOfferSheet$15();
                AlertDialog.Builder builder = new AlertDialog.Builder((Activity) this.f$1, 0, null);
                String string = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                AlertDialog alertDialog2 = builder.alertDialog;
                alertDialog2.title = string;
                alertDialog2.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                builder.setPositiveButton(LocaleController.getString(R.string.GigagroupConvertAlertConver), new ColorPicker$$ExternalSyntheticLambda6(gigagroupConvertAlert, 28));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                ((BaseFragment) this.f$2).showDialog(alertDialog2);
                break;
            case 23:
                LinkActionView linkActionView = (LinkActionView) this.f$0;
                BottomSheet bottomSheet = (BottomSheet) this.f$1;
                BaseFragment baseFragment2 = (BaseFragment) this.f$2;
                try {
                    if (linkActionView.link != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", linkActionView.link));
                        if (bottomSheet == null || bottomSheet.getContainer() == null) {
                            BulletinFactory.of(baseFragment2).createCopyLinkBulletin(false).show();
                        } else {
                            new BulletinFactory(bottomSheet.getContainer(), null).createCopyLinkBulletin(false).show();
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 24:
                MessagePreviewView.Page page = (MessagePreviewView.Page) this.f$0;
                ChatActivity.AnonymousClass64 anonymousClass64 = page.this$0;
                MessagePreviewParams messagePreviewParams = anonymousClass64.messagePreviewParams;
                boolean z4 = messagePreviewParams.hideCaption;
                boolean z5 = !z4;
                messagePreviewParams.hideCaption = z5;
                if (z4) {
                    if (anonymousClass64.returnSendersNames) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    anonymousClass64.returnSendersNames = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    anonymousClass64.returnSendersNames = true;
                }
                ((MessagePreviewView.ToggleButton) this.f$1).setState(z5, true);
                ((MessagePreviewView.ToggleButton) this.f$2).setState(messagePreviewParams.hideForwardSendersName, true);
                page.updateMessages();
                page.updateSubtitle(true);
                break;
            case 25:
                final PhotoViewer.AnonymousClass67 anonymousClass67 = (PhotoViewer.AnonymousClass67) this.f$0;
                if (anonymousClass67.isColorListShown) {
                    ColorPickerBottomSheet colorPickerBottomSheet = new ColorPickerBottomSheet((Context) this.f$2, anonymousClass67.resourcesProvider);
                    colorPickerBottomSheet.onSetColor(anonymousClass67.colorSwatch.color, 2);
                    final Bitmap bitmap = (Bitmap) this.f$1;
                    colorPickerBottomSheet.pipetteDelegate = new ColorPickerBottomSheet.PipetteDelegate() {
                        public boolean hasPipette;
                        public final Bitmap val$originalBitmap;

                        public AnonymousClass10() {
                            bitmap = bitmap;
                        }

                        @Override
                        public final FrameLayout getContainerView() {
                            return anonymousClass67.pipetteContainerLayout;
                        }

                        @Override
                        public final View getSnapshotDrawingView() {
                            return anonymousClass67;
                        }

                        @Override
                        public final boolean isPipetteAvailable() {
                            return bitmap != null;
                        }

                        @Override
                        public final boolean isPipetteVisible() {
                            return this.hasPipette;
                        }

                        @Override
                        public final void onColorSelected(int i7) {
                            PhotoViewer.AnonymousClass67 anonymousClass68 = anonymousClass67;
                            anonymousClass68.showColorList(false);
                            PersistColorPalette persistColorPalette = anonymousClass68.palette;
                            persistColorPalette.selectColor(i7, true);
                            persistColorPalette.saveColors();
                            anonymousClass68.setNewColor(i7);
                            int currentColorPosition = persistColorPalette.getCurrentColorPosition();
                            AnonymousClass9 anonymousClass9 = anonymousClass68.colorsListView;
                            anonymousClass9.setSelectedColorIndex(currentColorPosition);
                            anonymousClass9.getAdapter().notifyDataSetChanged();
                        }

                        @Override
                        public final void onDrawImageOverCanvas(Canvas canvas) {
                            AnonymousClass2 anonymousClass4 = anonymousClass67.renderView;
                            Matrix matrix = anonymousClass4.getMatrix();
                            canvas.save();
                            canvas.translate(anonymousClass4.getX(), anonymousClass4.getY());
                            canvas.concat(matrix);
                            float width = anonymousClass4.getWidth();
                            Bitmap bitmap2 = bitmap;
                            canvas.scale(width / bitmap2.getWidth(), anonymousClass4.getHeight() / bitmap2.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                        }

                        @Override
                        public final void onStartColorPipette() {
                            this.hasPipette = true;
                        }

                        @Override
                        public final void onStopColorPipette() {
                            this.hasPipette = false;
                        }
                    };
                    colorPickerBottomSheet.colorListener = new LPhotoPaintView$$ExternalSyntheticLambda18(anonymousClass67, c2 == true ? 1 : 0);
                    colorPickerBottomSheet.show();
                } else {
                    Runnable runnable = anonymousClass67.onDoneButtonClickedListener;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            case 26:
                PermanentLinkBottomSheet permanentLinkBottomSheet = (PermanentLinkBottomSheet) this.f$0;
                permanentLinkBottomSheet.getClass();
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.f$1;
                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatFull.id, 0L, 0);
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                manageLinksActivity.info = chatFull;
                manageLinksActivity.invite = tL_chatInviteExported;
                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                manageLinksActivity.loadLinks(true);
                ((GroupCreateActivity) this.f$2).presentFragment(manageLinksActivity);
                permanentLinkBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 27:
                PhotoViewerCoverEditor photoViewerCoverEditor = (PhotoViewerCoverEditor) this.f$0;
                if (photoViewerCoverEditor.gallerySheet == null) {
                    GallerySheet gallerySheet = new GallerySheet((Context) this.f$2, (Theme.ResourcesProvider) this.f$1, LocaleController.getString(R.string.VideoChooseCover), photoViewerCoverEditor.aspectRatio);
                    photoViewerCoverEditor.gallerySheet = gallerySheet;
                    gallerySheet.setOnDismissListener(new PasscodeView$9$$ExternalSyntheticLambda0(photoViewerCoverEditor, 7));
                    photoViewerCoverEditor.gallerySheet.onGalleryListener = photoViewerCoverEditor.onGalleryListener;
                }
                photoViewerCoverEditor.gallerySheet.show();
                break;
            case 28:
                SelectorSearchCell selectorSearchCell = (SelectorSearchCell) this.f$0;
                if (selectorSearchCell.allSpans.contains(view)) {
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
                    if (groupCreateSpan.deleting) {
                        selectorSearchCell.currentDeletingSpan = null;
                        selectorSearchCell.spansContainer.removeSpan(groupCreateSpan);
                        ((HashSet) this.f$1).remove(Long.valueOf(groupCreateSpan.getUid()));
                        ((Runnable) this.f$2).run();
                    } else {
                        GroupCreateSpan groupCreateSpan2 = selectorSearchCell.currentDeletingSpan;
                        if (groupCreateSpan2 != null) {
                            groupCreateSpan2.cancelDeleteAnimation();
                            selectorSearchCell.currentDeletingSpan = null;
                        }
                        selectorSearchCell.currentDeletingSpan = groupCreateSpan;
                        groupCreateSpan.startDeleteAnimation();
                    }
                    break;
                }
                break;
            default:
                TranslateAlert2.HeaderView headerView = (TranslateAlert2.HeaderView) this.f$0;
                headerView.getClass();
                Runnable runnable2 = ((Runnable[]) this.f$1)[0];
                if (runnable2 != null) {
                    runnable2.run();
                }
                TranslateAlert2 translateAlert2 = TranslateAlert2.this;
                String str2 = translateAlert2.toLanguage;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.f$2;
                if (!TextUtils.equals(str2, localeInfo.pluralLangCode)) {
                    TranslateAlert2.PaddedAdapter paddedAdapter = translateAlert2.adapter;
                    View view2 = paddedAdapter.mMainView;
                    if (view2 == translateAlert2.textViewContainer || view2 == translateAlert2.richPreviewView) {
                        translateAlert2.prevToLanguage = translateAlert2.toLanguage;
                    }
                    String str3 = localeInfo.pluralLangCode;
                    translateAlert2.toLanguage = str3;
                    headerView.toLanguageTextView.setText(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str3, null, null)));
                    paddedAdapter.updateMainView(translateAlert2.reqRichMessage != null ? translateAlert2.richLoadingPreviewView : translateAlert2.loadingTextView);
                    TranslateAlert2.setToLanguage(translateAlert2.toLanguage);
                    translateAlert2.translate();
                    break;
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda62(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
    }

    public ChatActivity$$ExternalSyntheticLambda62(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = obj2;
        this.f$2 = obj3;
    }
}
