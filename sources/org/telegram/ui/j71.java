package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34676a;
    public final TLRPC.Chat f34677b;
    public TLRPC.ChannelParticipantsFilter f34678c;
    public boolean f34679f;
    public boolean h;
    public boolean f34681r;
    public boolean f34682s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f34680n = -1;

    public j71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f34676a = i10;
        this.f34677b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f34678c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f34682s) {
                this.f34682s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f34682s) {
            return;
        }
        this.f34682s = false;
        int i10 = this.f34676a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f34680n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34680n, true);
            this.f34680n = -1;
        }
        this.f34679f = false;
    }

    public final void b() {
        int size;
        if (!this.f34679f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f34678c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18334q)) {
                this.f34679f = true;
                TLRPC.Chat chat = this.f34677b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f34678c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f34681r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f34676a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18336id;
            TLRPC.Chat chat = this.f34677b;
            if (j3 == chat.f18335id && !ChatObject.isChannel(chat) && this.f34679f) {
                this.f34679f = false;
                b();
            }
        }
    }
}
