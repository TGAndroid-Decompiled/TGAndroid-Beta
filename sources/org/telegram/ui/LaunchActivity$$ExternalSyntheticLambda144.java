package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.AlertsCreator;

public final class LaunchActivity$$ExternalSyntheticLambda144 implements Runnable {
    public final int $r8$classId = 1;
    public final LaunchActivity f$0;
    public final Object f$1;
    public final Integer f$2;
    public final Object f$3;
    public final byte[] f$4;
    public final long f$5;
    public final Object f$6;
    public final String f$7;
    public final int f$8;
    public final int f$9;

    public LaunchActivity$$ExternalSyntheticLambda144(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i, Integer num, String str, int i2, long j, ArticleViewer.AnonymousClass13 anonymousClass13, BaseFragment baseFragment) {
        this.f$0 = launchActivity;
        this.f$1 = bundle;
        this.f$4 = bArr;
        this.f$8 = i;
        this.f$2 = num;
        this.f$7 = str;
        this.f$9 = i2;
        this.f$5 = j;
        this.f$3 = anonymousClass13;
        this.f$6 = baseFragment;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        int i = 0;
        Object obj = this.f$6;
        Object obj2 = this.f$3;
        Object obj3 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    while (true) {
                        if (i >= arrayList.size()) {
                            message = null;
                        } else if (arrayList.get(i) == null || arrayList.get(i).id != this.f$2.intValue()) {
                            i++;
                        } else {
                            message = arrayList.get(i);
                        }
                    }
                } else {
                    message = null;
                }
                long j = this.f$5;
                Runnable runnable = (Runnable) obj;
                if (message == null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    HashSet hashSet = TopicsFragment.settingsPreloaded;
                    launchActivity.presentFragment(TopicsFragment.getTopicsOrChat(MessagesController.getInstance(launchActivity.currentAccount), MessagesStorage.getInstance(launchActivity.currentAccount), bundle));
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    int i2 = launchActivity.currentAccount;
                    Integer numValueOf = Integer.valueOf(message.id);
                    int i3 = launchActivity.currentAccount;
                    launchActivity.runCommentRequest(i2, null, numValueOf, null, Long.valueOf(MessageObject.getTopicId(i3, message, MessagesController.getInstance(i3).isForum(message))), (Integer) obj2, this.f$4, MessagesController.getInstance(launchActivity.currentAccount).getChat(Long.valueOf(-j)), runnable, this.f$7, this.f$8, this.f$9);
                }
                break;
            default:
                final LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                final Bundle bundle2 = (Bundle) obj3;
                final ChatActivity chatActivity = new ChatActivity(bundle2);
                final byte[] bArr = this.f$4;
                final int i4 = this.f$8;
                final Integer num = this.f$2;
                final String str = this.f$7;
                final int i5 = this.f$9;
                if (bArr != null) {
                    chatActivity.highlightPollOptionId = bArr;
                    chatActivity.highlightMessageId = i4;
                } else if (num != null) {
                    chatActivity.highlightTaskId = num;
                    chatActivity.highlightMessageId = i4;
                } else {
                    chatActivity.setHighlightQuote(i4, i5, str);
                }
                INavigationLayout actionBarLayout = AndroidUtilities.isTablet() ? launchActivity2.rightActionBarLayout : launchActivity2.getActionBarLayout();
                actionBarLayout.getClass();
                final ArticleViewer.AnonymousClass13 anonymousClass13 = (ArticleViewer.AnonymousClass13) obj2;
                if (!((ActionBarLayout) actionBarLayout).presentFragment(new INavigationLayout.NavigationParams(chatActivity))) {
                    final long j2 = this.f$5;
                    if (j2 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j2;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        final BaseFragment baseFragment = (BaseFragment) obj;
                        anonymousClass13.onCancelListener = new LaunchActivity$$ExternalSyntheticLambda8(launchActivity2, ConnectionsManager.getInstance(launchActivity2.currentAccount).sendRequest(tL_channels_getChannels, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                final LaunchActivity launchActivity3 = launchActivity2;
                                launchActivity3.getClass();
                                final ArticleViewer.AnonymousClass13 anonymousClass14 = anonymousClass13;
                                final Bundle bundle3 = bundle2;
                                final ChatActivity chatActivity2 = chatActivity;
                                final String str2 = str;
                                final int i6 = i5;
                                final long j3 = j2;
                                final int i7 = i4;
                                final Integer num2 = num;
                                final byte[] bArr2 = bArr;
                                final BaseFragment baseFragment2 = baseFragment;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        LaunchActivity launchActivity4 = launchActivity3;
                                        launchActivity4.getClass();
                                        anonymousClass14.end(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                MessagesController.getInstance(launchActivity4.currentAccount).putChats(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i8 = i7;
                                                if (chat != null && chat.forum) {
                                                    launchActivity4.openForumFromLink(-j3, Integer.valueOf(i8), null, num2, bArr2, null, 0, -1);
                                                }
                                                Bundle bundle4 = bundle3;
                                                BaseFragment baseFragment3 = baseFragment2;
                                                if (baseFragment3 == null || MessagesController.getInstance(launchActivity4.currentAccount).checkCanOpenChat(bundle4, baseFragment3)) {
                                                    ChatActivity chatActivity3 = new ChatActivity(bundle4);
                                                    chatActivity2.setHighlightQuote(i8, i6, str2);
                                                    INavigationLayout actionBarLayout2 = launchActivity4.getActionBarLayout();
                                                    actionBarLayout2.getClass();
                                                    ((ActionBarLayout) actionBarLayout2).presentFragment(new INavigationLayout.NavigationParams(chatActivity3));
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity4.showAlertDialog(AlertsCreator.createNoAccessAlert(launchActivity4, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                                    }
                                });
                            }
                        }), 1);
                    }
                }
                anonymousClass13.end(false);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda144(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j, Runnable runnable, String str, int i, int i2) {
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = num;
        this.f$3 = num2;
        this.f$4 = bArr;
        this.f$5 = j;
        this.f$6 = runnable;
        this.f$7 = str;
        this.f$8 = i;
        this.f$9 = i2;
    }
}
