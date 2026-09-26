package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34675a;
    public final TLRPC.Chat f34676b;
    public TLRPC.ChannelParticipantsFilter f34677c;
    public boolean f34678f;
    public boolean h;
    public boolean f34680r;
    public boolean f34681s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f34679n = -1;

    public j71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f34675a = i10;
        this.f34676b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f34677c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f34681s) {
                this.f34681s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f34681s) {
            return;
        }
        this.f34681s = false;
        int i10 = this.f34675a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f34679n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34679n, true);
            this.f34679n = -1;
        }
        this.f34678f = false;
    }

    public final void b() {
        int size;
        if (!this.f34678f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f34677c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18334q)) {
                this.f34678f = true;
                TLRPC.Chat chat = this.f34676b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f34677c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f34680r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f34675a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18336id;
            TLRPC.Chat chat = this.f34676b;
            if (j3 == chat.f18335id && !ChatObject.isChannel(chat) && this.f34678f) {
                this.f34678f = false;
                b();
            }
        }
    }
}
