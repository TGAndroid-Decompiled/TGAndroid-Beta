package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b21 implements org.telegram.messenger.fs {
    public final int f45747a;
    public final TLRPC.Chat f45748b;
    public TLRPC.ChannelParticipantsFilter f45749c;
    public boolean f45751f;
    public boolean h;
    public boolean f45753r;
    public boolean f45754s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f45750e = new ArrayList();
    public int f45752n = -1;

    public b21(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f45747a = i7;
        this.f45748b = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i7).P0(j3);
        this.f45749c = channelParticipantsFilter;
        if (P0 == null) {
            if (!this.f45754s) {
                this.f45754s = true;
                org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.T);
            }
            org.telegram.messenger.mp.u1(i7).b3(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f45754s) {
            return;
        }
        this.f45754s = false;
        int i7 = this.f45747a;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.T);
        if (this.f45752n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f45752n, true);
            this.f45752n = -1;
        }
        this.f45751f = false;
    }

    public final void b() {
        int size;
        if (!this.f45751f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f45749c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f28430q)) {
                this.f45751f = true;
                TLRPC.Chat chat = this.f45748b;
                if (org.telegram.messenger.v3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.mp.k1(chat);
                    tL_channels_getParticipants.filter = this.f45749c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f45753r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f45747a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f28432id;
            TLRPC.Chat chat = this.f45748b;
            if (j3 == chat.f28431id && !org.telegram.messenger.v3.T(chat) && this.f45751f) {
                this.f45751f = false;
                b();
            }
        }
    }
}
