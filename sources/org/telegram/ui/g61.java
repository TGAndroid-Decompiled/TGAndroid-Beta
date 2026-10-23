package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37205a;
    public final TLRPC.Chat f37206b;
    public TLRPC.ChannelParticipantsFilter f37207c;
    public boolean f37208f;
    public boolean h;
    public boolean f37210r;
    public boolean f37211s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37209n = -1;

    public g61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37205a = i10;
        this.f37206b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f37207c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37211s) {
                this.f37211s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f37211s) {
            return;
        }
        this.f37211s = false;
        int i10 = this.f37205a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37209n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37209n, true);
            this.f37209n = -1;
        }
        this.f37208f = false;
    }

    public final void b() {
        int size;
        if (!this.f37208f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37207c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20279q)) {
                this.f37208f = true;
                TLRPC.Chat chat = this.f37206b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37207c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37210r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37205a).sendRequestTyped(tL_channels_getParticipants, new Object(), new g5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20281id;
            TLRPC.Chat chat = this.f37206b;
            if (j10 == chat.f20280id && !ChatObject.isChannel(chat) && this.f37208f) {
                this.f37208f = false;
                b();
            }
        }
    }
}
