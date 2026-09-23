package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34053a;
    public final TLRPC.Chat f34054b;
    public TLRPC.ChannelParticipantsFilter f34055c;
    public boolean f34056f;
    public boolean h;
    public boolean f34058r;
    public boolean f34059s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f34057n = -1;

    public i71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f34053a = i10;
        this.f34054b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f34055c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f34059s) {
                this.f34059s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f34059s) {
            return;
        }
        this.f34059s = false;
        int i10 = this.f34053a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f34057n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34057n, true);
            this.f34057n = -1;
        }
        this.f34056f = false;
    }

    public final void b() {
        int size;
        if (!this.f34056f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f34055c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18082q)) {
                this.f34056f = true;
                TLRPC.Chat chat = this.f34054b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f34055c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f34058r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f34053a).sendRequestTyped(tL_channels_getParticipants, new Object(), new c5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18084id;
            TLRPC.Chat chat = this.f34054b;
            if (j3 == chat.f18083id && !ChatObject.isChannel(chat) && this.f34056f) {
                this.f34056f = false;
                b();
            }
        }
    }
}
