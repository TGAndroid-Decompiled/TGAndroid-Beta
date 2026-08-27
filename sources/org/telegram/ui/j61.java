package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class j61 implements NotificationCenter.NotificationCenterDelegate {

    public final int f39269a;

    public final TLRPC.Chat f39270b;

    public TLRPC.ChannelParticipantsFilter f39271c;

    public boolean f39273f;
    public boolean h;

    public boolean f39275r;

    public boolean f39276s;
    public final ArrayList d = new ArrayList();

    public final ArrayList f39272e = new ArrayList();

    public int f39274n = -1;

    public j61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f39269a = i10;
        this.f39270b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f39271c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f39276s) {
                this.f39276s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f39276s) {
            return;
        }
        this.f39276s = false;
        int i10 = this.f39269a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f39274n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f39274n, true);
            this.f39274n = -1;
        }
        this.f39273f = false;
    }

    public final void b() {
        if (this.f39273f || this.h) {
            return;
        }
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f39271c;
        if ((channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) && TextUtils.isEmpty(channelParticipantsFilter.f22379q)) {
            return;
        }
        this.f39273f = true;
        TLRPC.Chat chat = this.f39270b;
        if (ChatObject.isChannel(chat)) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
            tL_channels_getParticipants.filter = this.f39271c;
            tL_channels_getParticipants.limit = 30;
            tL_channels_getParticipants.offset = this.f39275r ? 0 : this.d.size();
            ConnectionsManager.getInstance(this.f39269a).sendRequestTyped(tL_channels_getParticipants, new org.telegram.messenger.a(), new b5(this, 24));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f22381id;
            TLRPC.Chat chat = this.f39270b;
            if (j10 == chat.f22380id && !ChatObject.isChannel(chat) && this.f39273f) {
                this.f39273f = false;
                b();
            }
        }
    }
}
