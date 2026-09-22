package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f36783a;
    public final TLRPC.Chat f36784b;
    public TLRPC.ChannelParticipantsFilter f36785c;
    public boolean f36786f;
    public boolean h;
    public boolean f36788r;
    public boolean f36789s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f36787n = -1;

    public q71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f36783a = i10;
        this.f36784b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f36785c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f36789s) {
                this.f36789s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f36789s) {
            return;
        }
        this.f36789s = false;
        int i10 = this.f36783a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f36787n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f36787n, true);
            this.f36787n = -1;
        }
        this.f36786f = false;
    }

    public final void b() {
        int size;
        if (!this.f36786f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f36785c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18108q)) {
                this.f36786f = true;
                TLRPC.Chat chat = this.f36784b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f36785c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f36788r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f36783a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18110id;
            TLRPC.Chat chat = this.f36784b;
            if (j3 == chat.f18109id && !ChatObject.isChannel(chat) && this.f36786f) {
                this.f36786f = false;
                b();
            }
        }
    }
}
