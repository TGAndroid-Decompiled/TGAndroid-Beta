package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f38189a;
    public final TLRPC.Chat f38190b;
    public TLRPC.ChannelParticipantsFilter f38191c;
    public boolean f38193f;
    public boolean h;
    public boolean f38195r;
    public boolean f38196s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f38192e = new ArrayList();
    public int f38194n = -1;

    public l71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f38189a = i10;
        this.f38190b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f38191c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f38196s) {
                this.f38196s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f38196s) {
            return;
        }
        this.f38196s = false;
        int i10 = this.f38189a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f38194n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f38194n, true);
            this.f38194n = -1;
        }
        this.f38193f = false;
    }

    public final void b() {
        int size;
        if (!this.f38193f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f38191c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20041q)) {
                this.f38193f = true;
                TLRPC.Chat chat = this.f38190b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f38191c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f38195r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f38189a).sendRequestTyped(tL_channels_getParticipants, new Object(), new c5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f20043id;
            TLRPC.Chat chat = this.f38190b;
            if (j3 == chat.f20042id && !ChatObject.isChannel(chat) && this.f38193f) {
                this.f38193f = false;
                b();
            }
        }
    }
}
