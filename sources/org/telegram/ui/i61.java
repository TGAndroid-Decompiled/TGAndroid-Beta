package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37737a;
    public final TLRPC.Chat f37738b;
    public TLRPC.ChannelParticipantsFilter f37739c;
    public boolean f37740f;
    public boolean h;
    public boolean f37742r;
    public boolean f37743s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37741n = -1;

    public i61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37737a = i10;
        this.f37738b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f37739c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37743s) {
                this.f37743s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f37743s) {
            return;
        }
        this.f37743s = false;
        int i10 = this.f37737a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37741n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37741n, true);
            this.f37741n = -1;
        }
        this.f37740f = false;
    }

    public final void b() {
        int size;
        if (!this.f37740f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37739c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20271q)) {
                this.f37740f = true;
                TLRPC.Chat chat = this.f37738b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37739c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37742r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37737a).sendRequestTyped(tL_channels_getParticipants, new Object(), new g5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20273id;
            TLRPC.Chat chat = this.f37738b;
            if (j10 == chat.f20272id && !ChatObject.isChannel(chat) && this.f37740f) {
                this.f37740f = false;
                b();
            }
        }
    }
}
