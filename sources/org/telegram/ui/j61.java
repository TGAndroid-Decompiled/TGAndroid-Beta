package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f38475a;
    public final TLRPC.Chat f38476b;
    public TLRPC.ChannelParticipantsFilter f38477c;
    public boolean f38478f;
    public boolean h;
    public boolean f38480r;
    public boolean f38481s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f38479n = -1;

    public j61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f38475a = i10;
        this.f38476b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f38477c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f38481s) {
                this.f38481s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f38481s) {
            return;
        }
        this.f38481s = false;
        int i10 = this.f38475a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f38479n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f38479n, true);
            this.f38479n = -1;
        }
        this.f38478f = false;
    }

    public final void b() {
        int size;
        if (!this.f38478f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f38477c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20343q)) {
                this.f38478f = true;
                TLRPC.Chat chat = this.f38476b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f38477c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f38480r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f38475a).sendRequestTyped(tL_channels_getParticipants, new Object(), new f5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20345id;
            TLRPC.Chat chat = this.f38476b;
            if (j10 == chat.f20344id && !ChatObject.isChannel(chat) && this.f38478f) {
                this.f38478f = false;
                b();
            }
        }
    }
}
