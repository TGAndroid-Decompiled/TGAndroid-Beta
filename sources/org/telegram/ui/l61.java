package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41151a;
    public final TLRPC.Chat f41152b;
    public TLRPC.ChannelParticipantsFilter f41153c;
    public boolean f41154f;
    public boolean h;
    public boolean f41156r;
    public boolean f41157s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f41155n = -1;

    public l61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f41151a = i10;
        this.f41152b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f41153c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f41157s) {
                this.f41157s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f41157s) {
            return;
        }
        this.f41157s = false;
        int i10 = this.f41151a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f41155n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41155n, true);
            this.f41155n = -1;
        }
        this.f41154f = false;
    }

    public final void b() {
        int size;
        if (!this.f41154f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f41153c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f22026q)) {
                this.f41154f = true;
                TLRPC.Chat chat = this.f41152b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f41153c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f41156r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f41151a).sendRequestTyped(tL_channels_getParticipants, new Object(), new e5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f22028id;
            TLRPC.Chat chat = this.f41152b;
            if (j10 == chat.f22027id && !ChatObject.isChannel(chat) && this.f41154f) {
                this.f41154f = false;
                b();
            }
        }
    }
}
