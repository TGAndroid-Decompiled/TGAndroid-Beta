package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f38832a;
    public final TLRPC.Chat f38833b;
    public TLRPC.ChannelParticipantsFilter f38834c;
    public boolean f38835f;
    public boolean h;
    public boolean f38837r;
    public boolean f38838s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f38836n = -1;

    public k61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f38832a = i10;
        this.f38833b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f38834c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f38838s) {
                this.f38838s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f38838s) {
            return;
        }
        this.f38838s = false;
        int i10 = this.f38832a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f38836n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f38836n, true);
            this.f38836n = -1;
        }
        this.f38835f = false;
    }

    public final void b() {
        int size;
        if (!this.f38835f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f38834c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20342q)) {
                this.f38835f = true;
                TLRPC.Chat chat = this.f38833b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f38834c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f38837r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f38832a).sendRequestTyped(tL_channels_getParticipants, new Object(), new f5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20344id;
            TLRPC.Chat chat = this.f38833b;
            if (j10 == chat.f20343id && !ChatObject.isChannel(chat) && this.f38835f) {
                this.f38835f = false;
                b();
            }
        }
    }
}
