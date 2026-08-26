package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.AlertsCreator;

public final class LaunchActivity$$ExternalSyntheticLambda83 implements Runnable {
    public final int $r8$classId = 0;
    public final LaunchActivity f$0;
    public final Bundle f$1;
    public final byte[] f$10;
    public final BaseFragment f$11;
    public final int f$12;
    public final Long f$2;
    public final Object f$3;
    public final LaunchActivity$$ExternalSyntheticLambda13 f$4;
    public final boolean f$5;
    public final Browser.Progress f$6;
    public final Long f$7;
    public final Integer f$8;
    public final Integer f$9;

    public LaunchActivity$$ExternalSyntheticLambda83(LaunchActivity launchActivity, Bundle bundle, Long l, int[] iArr, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, boolean z, Browser.Progress progress, Long l2, Integer num, Integer num2, byte[] bArr, BaseFragment baseFragment, int i) {
        this.f$0 = launchActivity;
        this.f$1 = bundle;
        this.f$2 = l;
        this.f$3 = iArr;
        this.f$4 = launchActivity$$ExternalSyntheticLambda13;
        this.f$5 = z;
        this.f$6 = progress;
        this.f$7 = l2;
        this.f$8 = num;
        this.f$9 = num2;
        this.f$10 = bArr;
        this.f$11 = baseFragment;
        this.f$12 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                INavigationLayout actionBarLayout = launchActivity.getActionBarLayout();
                Bundle bundle = this.f$1;
                ChatActivity chatActivity = new ChatActivity(bundle);
                actionBarLayout.getClass();
                if (!((ActionBarLayout) actionBarLayout).presentFragment(new INavigationLayout.NavigationParams(chatActivity))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l = this.f$2;
                    tL_inputChannel.channel_id = l.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    ((int[]) this.f$3)[0] = ConnectionsManager.getInstance(launchActivity.currentAccount).sendRequest(tL_channels_getChannels, new LaunchActivity$$ExternalSyntheticLambda128(launchActivity, this.f$4, this.f$5, l, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, bundle));
                }
                break;
            default:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.f$4;
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = (TLObject) this.f$3;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.currentAccount).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l2 = this.f$2;
                        if (chat != null && this.f$5 && ChatObject.isBoostSupported(chat)) {
                            launchActivity2.processBoostDialog(Long.valueOf(-l2.longValue()), null, this.f$6, null);
                        } else if (chat != null && chat.forum) {
                            Long l3 = this.f$7;
                            Integer num = this.f$9;
                            byte[] bArr = this.f$10;
                            if (l3 != null) {
                                launchActivity2.openForumFromLink(-l2.longValue(), this.f$8, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity2.openForumFromLink(-l2.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        Bundle bundle2 = this.f$1;
                        BaseFragment baseFragment = this.f$11;
                        if (baseFragment == null || MessagesController.getInstance(this.f$12).checkCanOpenChat(bundle2, baseFragment)) {
                            INavigationLayout actionBarLayout2 = launchActivity2.getActionBarLayout();
                            ChatActivity chatActivity2 = new ChatActivity(bundle2);
                            actionBarLayout2.getClass();
                            ((ActionBarLayout) actionBarLayout2).presentFragment(new INavigationLayout.NavigationParams(chatActivity2));
                        }
                    }
                }
                launchActivity2.showAlertDialog(AlertsCreator.createNoAccessAlert(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda83(LaunchActivity launchActivity, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, TLObject tLObject, boolean z, Long l, Browser.Progress progress, Long l2, Integer num, Integer num2, byte[] bArr, BaseFragment baseFragment, int i, Bundle bundle) {
        this.f$0 = launchActivity;
        this.f$4 = launchActivity$$ExternalSyntheticLambda13;
        this.f$3 = tLObject;
        this.f$5 = z;
        this.f$2 = l;
        this.f$6 = progress;
        this.f$7 = l2;
        this.f$8 = num;
        this.f$9 = num2;
        this.f$10 = bArr;
        this.f$11 = baseFragment;
        this.f$12 = i;
        this.f$1 = bundle;
    }
}
