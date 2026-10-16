package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a81 implements NotificationCenter.NotificationCenterDelegate {
    public final int f33783a;
    public final TLRPC.Chat f33784b;
    public TLRPC.ChannelParticipantsFilter f33785c;
    public boolean f33786f;
    public boolean h;
    public boolean f33788r;
    public boolean f33789s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f33787n = -1;

    public a81(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f33783a = i10;
        this.f33784b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f33785c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f33789s) {
                this.f33789s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f33789s) {
            return;
        }
        this.f33789s = false;
        int i10 = this.f33783a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f33787n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f33787n, true);
            this.f33787n = -1;
        }
        this.f33786f = false;
    }

    public final void b() {
        int size;
        if (!this.f33786f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f33785c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18915q)) {
                this.f33786f = true;
                TLRPC.Chat chat = this.f33784b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f33785c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f33788r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f33783a).sendRequestTyped(tL_channels_getParticipants, new Object(), new f5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f18917id;
            TLRPC.Chat chat = this.f33784b;
            if (j10 == chat.f18916id && !ChatObject.isChannel(chat) && this.f33786f) {
                this.f33786f = false;
                b();
            }
        }
    }
}
