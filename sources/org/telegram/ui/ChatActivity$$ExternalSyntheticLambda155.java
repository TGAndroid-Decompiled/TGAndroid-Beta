package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.web.BotWebViewContainer;

public final class ChatActivity$$ExternalSyntheticLambda155 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda155(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    @Override
    public final void run(Object obj) {
        final TLRPC.UserFull userFull;
        switch (this.$r8$classId) {
            case 0:
                final TLRPC.User user = (TLRPC.User) obj;
                final ChatActivity chatActivity = (ChatActivity) this.f$0;
                if (user != null) {
                    userFull = chatActivity.getMessagesController().getUserFull(user.id);
                } else {
                    chatActivity.getClass();
                    userFull = null;
                }
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$1;
                ItemOptions itemOptions = new ItemOptions(chatActivity, chatMessageCell, true, true);
                ScrimOptions scrimOptions = new ScrimOptions(chatActivity.getParentActivity(), chatActivity.themeDelegate);
                itemOptions.dismissListener = new ChatActivity$$ExternalSyntheticLambda112(scrimOptions, 1);
                String str = (String) this.f$2;
                ArticleViewer$$ExternalSyntheticLambda33 articleViewer$$ExternalSyntheticLambda33 = new ArticleViewer$$ExternalSyntheticLambda33(chatActivity, user, str, 2);
                ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
                itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(0, itemOptions), false);
                itemOptionsMakeSwipeback.addGap();
                itemOptionsMakeSwipeback.add(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new ChatActivity$$ExternalSyntheticLambda102(chatActivity, itemOptions, str, 16), false);
                itemOptionsMakeSwipeback.add(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new ChatActivity$$ExternalSyntheticLambda174(articleViewer$$ExternalSyntheticLambda33, 10), false);
                if (((TLRPC.TL_contact) this.f$3) == null && (user == null || !chatActivity.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    itemOptions.add(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new PhotoViewer$$ExternalSyntheticLambda133(itemOptions, itemOptionsMakeSwipeback, 2), false);
                    itemOptions.addGap();
                }
                if (user == null) {
                    itemOptions.add(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new ChatActivity$$ExternalSyntheticLambda114(chatActivity, str, 8), false);
                    itemOptions.add(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ChatActivity$$ExternalSyntheticLambda114(chatActivity, str, 9), false);
                    itemOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ChatActivity$$ExternalSyntheticLambda114(chatActivity, str, 10), false);
                    itemOptions.addGap();
                    itemOptions.addText(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    itemOptions.add(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new ChatActivity$$ExternalSyntheticLambda333(chatActivity, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i = 0;
                        itemOptions.add(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                switch (i) {
                                    case 0:
                                        ChatActivity chatActivity2 = chatActivity;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            chatActivity2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        VoIPHelper.startCall(user, false, z, chatActivity2.getParentActivity(), userFull2, chatActivity2.getAccountInstance());
                                        break;
                                    default:
                                        ChatActivity chatActivity3 = chatActivity;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            chatActivity3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        VoIPHelper.startCall(user, true, z2, chatActivity3.getParentActivity(), userFull3, chatActivity3.getAccountInstance());
                                        break;
                                }
                            }
                        }, false);
                        final int i2 = 1;
                        itemOptions.add(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z;
                                boolean z2;
                                switch (i2) {
                                    case 0:
                                        ChatActivity chatActivity2 = chatActivity;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            chatActivity2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        VoIPHelper.startCall(user, false, z, chatActivity2.getParentActivity(), userFull2, chatActivity2.getAccountInstance());
                                        break;
                                    default:
                                        ChatActivity chatActivity3 = chatActivity;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            chatActivity3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        VoIPHelper.startCall(user, true, z2, chatActivity3.getParentActivity(), userFull3, chatActivity3.getAccountInstance());
                                        break;
                                }
                            }
                        }, false);
                    }
                    itemOptions.add(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ChatActivity$$ExternalSyntheticLambda114(chatActivity, str, 6), false);
                    itemOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ChatActivity$$ExternalSyntheticLambda114(chatActivity, str, 7), false);
                    itemOptions.addGap();
                    itemOptions.addProfile(user, LocaleController.getString(R.string.ViewProfile), new ChatActivity$$ExternalSyntheticLambda102(chatActivity, scrimOptions, user, 15));
                }
                scrimOptions.setItemOptions(itemOptions);
                CharacterStyle characterStyle = (CharacterStyle) this.f$4;
                if (characterStyle instanceof URLSpanReplacement) {
                    String url = ((URLSpanReplacement) characterStyle).getURL();
                    if (url == null) {
                        url = "";
                    }
                    String strTrim = url.trim();
                    if (strTrim.startsWith("tel:")) {
                        strTrim = strTrim.substring(4);
                    }
                    if (strTrim.length() > 204) {
                        strTrim = strTrim.substring(0, 204) + "…";
                    }
                    SpannableString spannableString = new SpannableString(strTrim);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    scrimOptions.setScrim(chatMessageCell, characterStyle, spannableString, false);
                } else {
                    scrimOptions.setScrim(chatMessageCell, characterStyle, null, false);
                }
                chatActivity.showDialog(scrimOptions);
                break;
            case 1:
                ChannelAdminLogActivity channelAdminLogActivity = (ChannelAdminLogActivity) this.f$0;
                channelAdminLogActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) channelAdminLogActivity, obj, this.f$1, this.f$2, this.f$3, this.f$4, 4));
                break;
            case 2:
                Long l = (Long) obj;
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                int i3 = chatActivity2.chatMode;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.f$1;
                String str2 = (String) this.f$2;
                Object obj2 = this.f$3;
                if (i3 == 1) {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivity2.getParentActivity(), chatActivity2.dialog_id, -1L, 0, new ArticleViewer$$ExternalSyntheticLambda54((Object) chatActivity2, (Object) tL_document, str2, obj2, 3), null, chatActivity2.themeDelegate);
                } else {
                    chatActivity2.getSendMessagesHelper().sendSticker(tL_document, str2, chatActivity2.dialog_id, chatActivity2.replyingMessageObject, chatActivity2.threadMessageObject, null, chatActivity2.replyingQuote, (MessageObject.SendAnimationData) this.f$4, true, 0, 0, false, obj2, chatActivity2.getMessageChatSendParams(), l.longValue(), chatActivity2.getSendMonoForumPeerId(), chatActivity2.messageSuggestionParams);
                }
                chatActivity2.hideFieldPanel(false);
                chatActivity2.chatActivityEnterView.addStickerToRecent(tL_document);
                chatActivity2.chatActivityEnterView.setFieldText("");
                break;
            case 3:
                EmojiView.EmojiSearchAdapter emojiSearchAdapter = EmojiView.EmojiSearchAdapter.this;
                if (((String) this.f$2).equals(emojiSearchAdapter.lastSearchEmojiString)) {
                    EmojiView emojiView = EmojiView.this;
                    int i4 = 0;
                    emojiView.emojiSearchField.showProgress$1(false);
                    emojiSearchAdapter.searchWas = true;
                    RecyclerView.Adapter adapter = emojiView.emojiGridView.getAdapter();
                    EmojiView.EmojiSearchAdapter emojiSearchAdapter2 = emojiView.emojiSearchAdapter;
                    if (adapter != emojiSearchAdapter2) {
                        emojiView.emojiGridView.setAdapter(emojiSearchAdapter2);
                    }
                    ArrayList arrayList = emojiSearchAdapter.result;
                    arrayList.clear();
                    arrayList.addAll(emojiSearchAdapter.resultPre);
                    ArrayList arrayList2 = emojiSearchAdapter.resultGlobal;
                    arrayList2.clear();
                    arrayList2.addAll((ArrayList) this.f$1);
                    ArrayList arrayList3 = emojiSearchAdapter.packs;
                    arrayList3.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    ArrayList arrayList4 = (ArrayList) this.f$3;
                    int size = arrayList4.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj3 = arrayList4.get(i5);
                        i5++;
                        EmojiView.EmojiPackInfo emojiPackInfo = (EmojiView.EmojiPackInfo) obj3;
                        if (longSparseIntArray.indexOfKey(emojiPackInfo.set.id) < 0) {
                            longSparseIntArray.append(emojiPackInfo.set.id, 1);
                            arrayList3.add(emojiPackInfo);
                        }
                    }
                    ArrayList arrayList5 = (ArrayList) this.f$4;
                    int size2 = arrayList5.size();
                    while (i4 < size2) {
                        Object obj4 = arrayList5.get(i4);
                        i4++;
                        EmojiView.EmojiPackInfo emojiPackInfo2 = (EmojiView.EmojiPackInfo) obj4;
                        if (longSparseIntArray.indexOfKey(emojiPackInfo2.set.id) < 0) {
                            longSparseIntArray.append(emojiPackInfo2.set.id, 1);
                            arrayList3.add(emojiPackInfo2);
                        }
                    }
                    emojiSearchAdapter.notifyDataSetChanged();
                    break;
                }
                break;
            case 4:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.getClass();
                ((AlertDialog) this.f$1).dismiss();
                MessagesController messagesController = dialogsActivity.getMessagesController();
                Long l2 = (Long) this.f$2;
                messagesController.loadChannelParticipants(l2);
                DialogsActivity.DialogsActivityDelegate dialogsActivityDelegate = dialogsActivity.delegate;
                dialogsActivity.removeSelfFromStack();
                ((ChannelCreateActivity) this.f$3).removeSelfFromStack();
                ((BaseFragment) this.f$4).finishFragment();
                if (dialogsActivityDelegate != null) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(MessagesStorage.TopicKey.of(-l2.longValue(), 0L));
                    dialogsActivityDelegate.didSelectDialogs(dialogsActivity, arrayList6, null, false, dialogsActivity.notify, dialogsActivity.scheduleDate, dialogsActivity.scheduleRepeatPeriod, null);
                }
                break;
            case 5:
                ((StarGiftSheet) this.f$0).lambda$addAttributeRow$44((TL_stars.StarGift) this.f$1, (TL_stars.StarGiftAttribute) this.f$2, (ButtonSpan.TextViewButtons[]) this.f$3, (boolean[]) this.f$4, (ArrayList) obj);
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(botWebViewContainer, (File) obj, (AlertDialog) this.f$1, (String) this.f$2, (String) this.f$3, (String) this.f$4, 22));
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda155(EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass5, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.$r8$classId = 3;
        this.f$0 = anonymousClass5;
        this.f$2 = str;
        this.f$1 = arrayList;
        this.f$3 = arrayList2;
        this.f$4 = arrayList3;
    }
}
