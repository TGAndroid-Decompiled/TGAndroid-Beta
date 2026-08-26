package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticLambda8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda8;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda15;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda124;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda218;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda326;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda121;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda167;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.TopicCreateFragment;

public final class TopicsTabsView$$ExternalSyntheticLambda1 implements FactorAnimator.Target, Utilities.Callback5, Utilities.Callback5Return {
    public final TopicsTabsView f$0;

    public TopicsTabsView$$ExternalSyntheticLambda1(TopicsTabsView topicsTabsView) {
        this.f$0 = topicsTabsView;
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.checkUi_closeButtonVisibility();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        TLRPC.Chat chat;
        final ItemOptions itemOptions;
        final ItemOptions itemOptions2;
        final int i;
        boolean z2;
        final int i2 = 0;
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final TopicsTabsView topicsTabsView = this.f$0;
        if (topicsTabsView.sideTabs.reorderingAllowed || topicsTabsView.topTabs.reorderingAllowed) {
            z = false;
        } else {
            Object obj6 = uItem.object;
            if (obj6 instanceof TLRPC.TL_forumTopic) {
                final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj6;
                int i3 = topicsTabsView.currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i3);
                long j = topicsTabsView.dialogId;
                TLRPC.Chat chat2 = j < 0 ? messagesController.getChat(Long.valueOf(-j)) : null;
                TLRPC.User user = j > 0 ? messagesController.getUser(Long.valueOf(j)) : null;
                ChatActivity chatActivity = topicsTabsView.fragment;
                ItemOptions itemOptions3 = new ItemOptions(chatActivity, view, true, true);
                if (ChatObject.isMonoForum(chat2)) {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                    if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i3, chat2)) {
                        z = false;
                    } else {
                        TLRPC.Chat chat3 = chat2;
                        itemOptions3.add(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new LaunchActivity$$ExternalSyntheticLambda121(topicsTabsView, itemOptions3, peerDialogId, chat2, 26), false);
                        long j2 = chat3.id;
                        if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i3, chat3)) {
                            long j3 = chat3.linked_monoforum_id;
                            if (j3 != 0) {
                                j2 = j3;
                            }
                        }
                        TLRPC.Chat chat4 = MessagesController.getInstance(i3).getChat(Long.valueOf(j2));
                        TLRPC.User user2 = MessagesController.getInstance(i3).getUser(Long.valueOf(peerDialogId));
                        if (user2 == null || !ChatObject.canBlockUsers(chat4)) {
                            itemOptions2 = itemOptions3;
                        } else {
                            itemOptions3.add(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                            ActionBarMenuSubItem last = itemOptions3.getLast();
                            last.setVisibility(8);
                            MessagesController.getInstance(i3).checkIsInChat(true, chat4, user2, new StarGiftSheet$$ExternalSyntheticLambda167(topicsTabsView, last, itemOptions3, j2, user2, chat4));
                            itemOptions2 = itemOptions3;
                        }
                    }
                } else {
                    TLRPC.Chat chat5 = chat2;
                    if (ChatObject.canManageTopics(chat5) || UserObject.isBotForumWithEditableTopics(user)) {
                        boolean z3 = tL_forumTopic.pinned;
                        int i4 = z3 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                        String string = LocaleController.getString(z3 ? R.string.DialogUnpin : R.string.DialogPin);
                        chat = chat5;
                        ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(topicsTabsView, itemOptions3, messagesController, tL_forumTopic, 26);
                        itemOptions = itemOptions3;
                        messagesController = messagesController;
                        tL_forumTopic = tL_forumTopic;
                        itemOptions.add(i4, string, chatUsersActivity$$ExternalSyntheticLambda13, false);
                        if (tL_forumTopic.pinned) {
                            itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new TopicsTabsView$$ExternalSyntheticLambda0(topicsTabsView, 1), false);
                        }
                    } else {
                        chat = chat5;
                        itemOptions = itemOptions3;
                    }
                    if (ChatObject.canManageTopics(chat) || UserObject.isBotForumWithEditableTopics(user)) {
                        itemOptions.add(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable() {
                            @Override
                            public final void run() {
                                AlertDialog alertDialog;
                                TopicsTabsView topicsTabsView2 = topicsTabsView;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                ItemOptions itemOptions4 = itemOptions;
                                switch (i2) {
                                    case 0:
                                        topicsTabsView2.getClass();
                                        itemOptions4.dismiss();
                                        topicsTabsView2.fragment.presentFragment(TopicCreateFragment.create(-topicsTabsView2.dialogId, tL_forumTopic2.id));
                                        break;
                                    case 1:
                                        topicsTabsView2.getClass();
                                        itemOptions4.dismiss();
                                        MessagesController.getInstance(topicsTabsView2.currentAccount).getTopicsController().toggleCloseTopic(-topicsTabsView2.dialogId, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                        break;
                                    default:
                                        TopicsTabsView topicsTabsView3 = topicsTabsView;
                                        topicsTabsView3.getClass();
                                        itemOptions4.dismiss();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                        QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1 = new QrActivity$5$$ExternalSyntheticLambda1(8);
                                        AlertDialog.Builder builder = new AlertDialog.Builder(topicsTabsView3.getContext(), 0, null);
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        AlertDialog alertDialog2 = builder.alertDialog;
                                        alertDialog2.title = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j4 = topicsTabsView3.currentTopicId;
                                        if (hashSet.size() == 1) {
                                            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(topicsTabsView3.currentAccount).getTopicsController().findTopic(-topicsTabsView3.dialogId, ((Integer) arrayList.get(0)).intValue());
                                            int i5 = R.string.DeleteSelectedTopic;
                                            Object[] objArr = {tL_forumTopicFindTopic.title};
                                            alertDialog = alertDialog2;
                                            alertDialog.message = LocaleController.formatString(i5, objArr);
                                        } else {
                                            alertDialog = alertDialog2;
                                            alertDialog.message = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda124(topicsTabsView3, arrayList, j4, hashSet, qrActivity$5$$ExternalSyntheticLambda1));
                                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(7));
                                        alertDialog.show();
                                        TextView textView = (TextView) alertDialog.getButton(-1);
                                        if (textView != null) {
                                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                        break;
                                }
                            }
                        }, false);
                    }
                    long j4 = tL_forumTopic.id;
                    int currentAccount = chatActivity.getCurrentAccount();
                    Theme.ResourcesProvider resourceProvider = chatActivity.getResourceProvider();
                    TLRPC.User user3 = user;
                    long j5 = topicsTabsView.dialogId;
                    ItemOptions itemOptions4 = itemOptions;
                    ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12 chatNotificationsPopupWrapper$$ExternalSyntheticLambda12 = new ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12(itemOptions4, currentAccount, j5, j4, chatActivity, resourceProvider);
                    ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
                    itemOptionsMakeSwipeback.add(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(0, itemOptions), false);
                    itemOptionsMakeSwipeback.add(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new MessagesController$$ExternalSyntheticLambda8(itemOptions4, currentAccount, j5, j4, itemOptionsMakeSwipeback, chatActivity, resourceProvider), false);
                    ActionBarMenuSubItem last2 = itemOptionsMakeSwipeback.getLast();
                    itemOptionsMakeSwipeback.add(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ArticleViewer$$ExternalSyntheticLambda71(itemOptions4, resourceProvider, currentAccount, chatNotificationsPopupWrapper$$ExternalSyntheticLambda12, 14), false);
                    itemOptionsMakeSwipeback.add(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new MediaController$$ExternalSyntheticLambda8(itemOptions4, j5, j4, chatActivity, resourceProvider, 7), false);
                    itemOptions2 = itemOptions4;
                    itemOptionsMakeSwipeback.add(0, "", new StarsIntroActivity$$ExternalSyntheticLambda10(itemOptions4, currentAccount, j5, j4, chatActivity, resourceProvider), false);
                    new MessagesStorage$$ExternalSyntheticLambda15(currentAccount, j5, j4, itemOptionsMakeSwipeback.getLast(), last2).run();
                    boolean zIsDialogMuted = messagesController.isDialogMuted(j, tL_forumTopic.id);
                    itemOptions2.add(zIsDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute, LocaleController.getString(zIsDialogMuted ? R.string.Unmute : R.string.Mute), new ChatActivity$$ExternalSyntheticLambda218(topicsTabsView, messagesController, tL_forumTopic, itemOptions2, itemOptionsMakeSwipeback, 22), false);
                    TLRPC.Chat chat6 = chat;
                    if (!ChatObject.canManageTopic(i3, chat6, tL_forumTopic) || UserObject.isBotForum(user3)) {
                        i = 1;
                        z2 = false;
                    } else {
                        boolean z4 = tL_forumTopic.closed;
                        i = 1;
                        z2 = false;
                        itemOptions2.add(z4 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, LocaleController.getString(z4 ? R.string.RestartTopic : R.string.CloseTopic), new Runnable() {
                            @Override
                            public final void run() {
                                AlertDialog alertDialog;
                                TopicsTabsView topicsTabsView2 = topicsTabsView;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                ItemOptions itemOptions5 = itemOptions2;
                                switch (i) {
                                    case 0:
                                        topicsTabsView2.getClass();
                                        itemOptions5.dismiss();
                                        topicsTabsView2.fragment.presentFragment(TopicCreateFragment.create(-topicsTabsView2.dialogId, tL_forumTopic2.id));
                                        break;
                                    case 1:
                                        topicsTabsView2.getClass();
                                        itemOptions5.dismiss();
                                        MessagesController.getInstance(topicsTabsView2.currentAccount).getTopicsController().toggleCloseTopic(-topicsTabsView2.dialogId, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                        break;
                                    default:
                                        TopicsTabsView topicsTabsView3 = topicsTabsView;
                                        topicsTabsView3.getClass();
                                        itemOptions5.dismiss();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                        QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1 = new QrActivity$5$$ExternalSyntheticLambda1(8);
                                        AlertDialog.Builder builder = new AlertDialog.Builder(topicsTabsView3.getContext(), 0, null);
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        AlertDialog alertDialog2 = builder.alertDialog;
                                        alertDialog2.title = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j6 = topicsTabsView3.currentTopicId;
                                        if (hashSet.size() == 1) {
                                            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(topicsTabsView3.currentAccount).getTopicsController().findTopic(-topicsTabsView3.dialogId, ((Integer) arrayList.get(0)).intValue());
                                            int i5 = R.string.DeleteSelectedTopic;
                                            Object[] objArr = {tL_forumTopicFindTopic.title};
                                            alertDialog = alertDialog2;
                                            alertDialog.message = LocaleController.formatString(i5, objArr);
                                        } else {
                                            alertDialog = alertDialog2;
                                            alertDialog.message = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda124(topicsTabsView3, arrayList, j6, hashSet, qrActivity$5$$ExternalSyntheticLambda1));
                                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(7));
                                        alertDialog.show();
                                        TextView textView = (TextView) alertDialog.getButton(-1);
                                        if (textView != null) {
                                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (ChatObject.canDeleteTopic(i3, chat6, tL_forumTopic)) {
                        final int i5 = 2;
                        itemOptions2.add(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", i), new Runnable() {
                            @Override
                            public final void run() {
                                AlertDialog alertDialog;
                                TopicsTabsView topicsTabsView2 = topicsTabsView;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                ItemOptions itemOptions5 = itemOptions2;
                                switch (i5) {
                                    case 0:
                                        topicsTabsView2.getClass();
                                        itemOptions5.dismiss();
                                        topicsTabsView2.fragment.presentFragment(TopicCreateFragment.create(-topicsTabsView2.dialogId, tL_forumTopic2.id));
                                        break;
                                    case 1:
                                        topicsTabsView2.getClass();
                                        itemOptions5.dismiss();
                                        MessagesController.getInstance(topicsTabsView2.currentAccount).getTopicsController().toggleCloseTopic(-topicsTabsView2.dialogId, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                        break;
                                    default:
                                        TopicsTabsView topicsTabsView3 = topicsTabsView;
                                        topicsTabsView3.getClass();
                                        itemOptions5.dismiss();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                        QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1 = new QrActivity$5$$ExternalSyntheticLambda1(8);
                                        AlertDialog.Builder builder = new AlertDialog.Builder(topicsTabsView3.getContext(), 0, null);
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        AlertDialog alertDialog2 = builder.alertDialog;
                                        alertDialog2.title = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j6 = topicsTabsView3.currentTopicId;
                                        if (hashSet.size() == 1) {
                                            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(topicsTabsView3.currentAccount).getTopicsController().findTopic(-topicsTabsView3.dialogId, ((Integer) arrayList.get(0)).intValue());
                                            int i6 = R.string.DeleteSelectedTopic;
                                            Object[] objArr = {tL_forumTopicFindTopic.title};
                                            alertDialog = alertDialog2;
                                            alertDialog.message = LocaleController.formatString(i6, objArr);
                                        } else {
                                            alertDialog = alertDialog2;
                                            alertDialog.message = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda124(topicsTabsView3, arrayList, j6, hashSet, qrActivity$5$$ExternalSyntheticLambda1));
                                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(7));
                                        alertDialog.show();
                                        TextView textView = (TextView) alertDialog.getButton(-1);
                                        if (textView != null) {
                                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                        break;
                                }
                            }
                        }, z2);
                    }
                }
                if (view instanceof TopicsTabsView.HorizontalTabView) {
                    itemOptions2.setScrimViewBackground(new DialogsActivity.AnonymousClass11.AnonymousClass1(topicsTabsView));
                    itemOptions2.translate(AndroidUtilities.dp(16.0f), 0.0f);
                } else {
                    int iDp = AndroidUtilities.dp(5.0f);
                    int iDp2 = AndroidUtilities.dp(5.0f);
                    int color = Theme.getColor(Theme.key_windowBackgroundWhite, topicsTabsView.resourcesProvider);
                    float f = 0;
                    float f2 = iDp;
                    float f3 = iDp2;
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f, f}, null, null));
                    shapeDrawable.getPaint().setColor(color);
                    itemOptions2.setScrimViewBackground(shapeDrawable);
                }
                itemOptions2.show();
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        TopicsTabsView topicsTabsView = this.f$0;
        if (topicsTabsView.mono) {
            Utilities.Callback2 callback2 = topicsTabsView.onDialogSelected;
            if (callback2 != null) {
                callback2.run(Long.valueOf(uItem.longValue), Boolean.FALSE);
                return;
            }
            return;
        }
        if (uItem.longValue == -2) {
            Runnable runnable = topicsTabsView.onTopicCreated;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback3 = topicsTabsView.onTopicSelected;
        if (callback3 != null) {
            callback3.run(Integer.valueOf(uItem.id), Boolean.FALSE);
        }
    }
}
