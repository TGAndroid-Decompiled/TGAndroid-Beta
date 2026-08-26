package org.telegram.ui;

import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.INavigationLayout;

public final class LaunchActivity$$ExternalSyntheticLambda162 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Serializable f$10;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final int f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;
    public final long f$9;

    public LaunchActivity$$ExternalSyntheticLambda162(MediaDataController mediaDataController, Timer.Task task, LongSparseArray longSparseArray, AtomicInteger atomicInteger, Runnable runnable, int i, Timer timer, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3, boolean z, long j) {
        this.f$0 = mediaDataController;
        this.f$1 = task;
        this.f$4 = longSparseArray;
        this.f$10 = atomicInteger;
        this.f$2 = runnable;
        this.f$5 = i;
        this.f$6 = timer;
        this.f$7 = longSparseArray2;
        this.f$8 = longSparseArray3;
        this.f$3 = z;
        this.f$9 = j;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        Object obj = this.f$6;
        Object obj2 = this.f$2;
        Object obj3 = this.f$4;
        Object obj4 = this.f$1;
        Object obj5 = this.f$8;
        Object obj6 = this.f$7;
        Serializable serializable = this.f$10;
        Object obj7 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                launchActivity.getClass();
                String str = (String) obj4;
                if (str != null) {
                    String[] strArrSplit = str.split("\\+| ");
                    tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                    for (String str2 : strArrSplit) {
                        str2.getClass();
                        switch (str2) {
                            case "ban_users":
                            case "restrict_members":
                                tL_chatAdminRights.ban_users = true;
                                break;
                            case "anonymous":
                                tL_chatAdminRights.anonymous = true;
                                break;
                            case "change_info":
                                tL_chatAdminRights.change_info = true;
                                break;
                            case "delete_messages":
                                tL_chatAdminRights.delete_messages = true;
                                break;
                            case "edit_messages":
                                tL_chatAdminRights.edit_messages = true;
                                break;
                            case "manage_call":
                            case "manage_video_chats":
                                tL_chatAdminRights.manage_call = true;
                                break;
                            case "manage_chat":
                            case "other":
                                tL_chatAdminRights.other = true;
                                break;
                            case "manage_topics":
                            case "manage_topic":
                                tL_chatAdminRights.manage_topics = true;
                                break;
                            case "promote_members":
                            case "add_admins":
                                tL_chatAdminRights.add_admins = true;
                                break;
                            case "invite_users":
                                tL_chatAdminRights.invite_users = true;
                                break;
                            case "post_messages":
                                tL_chatAdminRights.post_messages = true;
                                break;
                            case "pin_messages":
                                tL_chatAdminRights.pin_messages = true;
                                break;
                        }
                    }
                } else {
                    tL_chatAdminRights = null;
                }
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = (TLRPC.TL_chatAdminRights) obj2;
                if (tL_chatAdminRights == null && tL_chatAdminRights3 == null) {
                    tL_chatAdminRights2 = null;
                } else if (tL_chatAdminRights == null) {
                    tL_chatAdminRights2 = tL_chatAdminRights3;
                } else if (tL_chatAdminRights3 == null) {
                    tL_chatAdminRights2 = tL_chatAdminRights;
                } else {
                    tL_chatAdminRights3.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights3.change_info;
                    tL_chatAdminRights3.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights3.post_messages;
                    tL_chatAdminRights3.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights3.edit_messages;
                    tL_chatAdminRights3.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights3.add_admins;
                    tL_chatAdminRights3.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights3.delete_messages;
                    tL_chatAdminRights3.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights3.ban_users;
                    tL_chatAdminRights3.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights3.invite_users;
                    tL_chatAdminRights3.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights3.pin_messages;
                    tL_chatAdminRights3.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights3.manage_call;
                    tL_chatAdminRights3.anonymous = tL_chatAdminRights.anonymous || tL_chatAdminRights3.anonymous;
                    tL_chatAdminRights3.other = tL_chatAdminRights.other || tL_chatAdminRights3.other;
                    tL_chatAdminRights2 = tL_chatAdminRights3;
                }
                final DialogsActivity dialogsActivity = (DialogsActivity) obj6;
                TLRPC.User user = (TLRPC.User) obj5;
                boolean z = this.f$3;
                String str3 = (String) obj3;
                final int i = this.f$5;
                if (z && tL_chatAdminRights == null && !TextUtils.isEmpty(str3)) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    MessagesController.getInstance(launchActivity.currentAccount).addUserToChat(chat.id, user, 0, str3, dialogsActivity, true, new OAuthSheet$$ExternalSyntheticLambda2(launchActivity, i, chat, dialogsActivity, 4), null);
                } else {
                    ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(user.id, -this.f$9, tL_chatAdminRights2, null, null, (String) serializable, 2, true, !z, str3);
                    chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                        public final int val$intentAccount;

                        public AnonymousClass13() {
                            i = i;
                        }

                        @Override
                        public final void didChangeOwner(TLRPC.User user2) {
                        }

                        @Override
                        public final void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights4, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str4) {
                            dialogsActivity.removeSelfFromStack();
                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                        }
                    };
                    INavigationLayout actionBarLayout = launchActivity.getActionBarLayout();
                    actionBarLayout.getClass();
                    INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(chatRightsEditActivity);
                    navigationParams.removeLast = false;
                    ((ActionBarLayout) actionBarLayout).presentFragment(navigationParams);
                }
                break;
            default:
                ((MediaDataController) obj7).lambda$loadReplyMessagesForMessages$177((Timer.Task) obj4, (LongSparseArray) obj3, (AtomicInteger) serializable, (Runnable) obj2, this.f$5, (Timer) obj, (LongSparseArray) obj6, (LongSparseArray) obj5, this.f$3, this.f$9);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda162(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z, String str2, int i, TLRPC.Chat chat, DialogsActivity dialogsActivity, TLRPC.User user, long j, String str3) {
        this.f$0 = launchActivity;
        this.f$1 = str;
        this.f$2 = tL_chatAdminRights;
        this.f$3 = z;
        this.f$4 = str2;
        this.f$5 = i;
        this.f$6 = chat;
        this.f$7 = dialogsActivity;
        this.f$8 = user;
        this.f$9 = j;
        this.f$10 = str3;
    }
}
