package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41994a;
    public final TLRPC.Chat f41995b;
    public TLRPC.ChannelParticipantsFilter f41996c;
    public boolean f41997f;
    public boolean h;
    public boolean f41999r;
    public boolean f42000s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f41998n = -1;

    public o61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f41994a = i10;
        this.f41995b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f41996c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f42000s) {
                this.f42000s = true;
                NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (!this.f42000s) {
            return;
        }
        this.f42000s = false;
        int i10 = this.f41994a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f41998n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41998n, true);
            this.f41998n = -1;
        }
        this.f41997f = false;
    }

    public final void b() {
        int size;
        if (!this.f41997f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f41996c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f22027q)) {
                this.f41997f = true;
                TLRPC.Chat chat = this.f41995b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f41996c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f41999r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f41994a).sendRequestTyped(tL_channels_getParticipants, new Object(), new e5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f22029id;
            TLRPC.Chat chat = this.f41995b;
            if (j10 == chat.f22028id && !ChatObject.isChannel(chat) && this.f41997f) {
                this.f41997f = false;
                b();
            }
        }
    }
}
