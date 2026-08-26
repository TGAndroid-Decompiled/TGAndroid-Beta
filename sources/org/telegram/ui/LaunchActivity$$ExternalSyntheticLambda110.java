package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;

public final class LaunchActivity$$ExternalSyntheticLambda110 implements AlertDialog.OnButtonClickListener, DialogsActivity.DialogsActivityDelegate {
    public final KeyEvent.Callback f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public LaunchActivity$$ExternalSyntheticLambda110(QuickRepliesActivity.AnonymousClass3 anonymousClass3, GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23, int i, QuickRepliesController.QuickReply quickReply, TextView textView, Utilities.Callback callback) {
        this.f$0 = anonymousClass3;
        this.f$2 = giftSheet$$ExternalSyntheticLambda23;
        this.f$1 = i;
        this.f$3 = quickReply;
        this.f$4 = textView;
        this.f$5 = callback;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.f$0;
        launchActivity.getClass();
        final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(launchActivity.currentAccount).getChat(Long.valueOf(-j));
        final TLRPC.User user = (TLRPC.User) this.f$2;
        final int i3 = this.f$1;
        final String str = (String) this.f$4;
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController messagesController = MessagesController.getInstance(i3);
            final DialogsActivity dialogsActivity2 = (DialogsActivity) this.f$5;
            final String str2 = (String) this.f$3;
            messagesController.checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    LaunchActivity launchActivity2 = launchActivity;
                    launchActivity2.getClass();
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda162(launchActivity2, str2, tL_chatAdminRights2, z3, str, i3, chat, dialogsActivity2, user, j, str3));
                }
            });
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity, 0, null);
        int i4 = R.string.AddBot;
        String string = LocaleController.getString(i4);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(i4), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog2, int i5) {
                LaunchActivity launchActivity2 = launchActivity;
                launchActivity2.getClass();
                Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
                long j2 = -j;
                bundleM.putLong("chat_id", j2);
                ChatActivity chatActivity = new ChatActivity(bundleM);
                int i6 = i3;
                NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                MessagesController.getInstance(i6).addUserToChat(j2, user, 0, str, chatActivity, null);
                ((ActionBarLayout) launchActivity2.getActionBarLayout()).presentFragment$1(chatActivity, true, false);
            }
        });
        builder.show();
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        QuickRepliesActivity.AnonymousClass3 anonymousClass3 = (QuickRepliesActivity.AnonymousClass3) this.f$0;
        String string = anonymousClass3.getText().toString();
        int length = string.length();
        GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = (GiftSheet$$ExternalSyntheticLambda23) this.f$2;
        if (length <= 0 || string.length() > 32) {
            AndroidUtilities.shakeView(anonymousClass3);
            giftSheet$$ExternalSyntheticLambda23.run(Boolean.FALSE);
            return;
        }
        QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.f$1);
        QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) this.f$3;
        int i2 = quickReply == null ? -1 : quickReply.id;
        QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController.findReply(string);
        if (quickReplyFindReply == null || quickReplyFindReply.id == i2) {
            ((Utilities.Callback) this.f$5).run(string);
            alertDialog.dismiss();
        } else {
            AndroidUtilities.shakeView(anonymousClass3);
            ((TextView) this.f$4).setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            giftSheet$$ExternalSyntheticLambda23.run(Boolean.TRUE);
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda110(LaunchActivity launchActivity, int i, TLRPC.User user, String str, String str2, DialogsActivity dialogsActivity) {
        this.f$0 = launchActivity;
        this.f$1 = i;
        this.f$2 = user;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = dialogsActivity;
    }
}
