package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p11 implements org.telegram.messenger.cs {
    public final int f48403a;
    public final TLRPC.Chat f48404b;
    public TLRPC.ChannelParticipantsFilter f48405c;
    public boolean f48407f;
    public boolean h;
    public boolean f48409r;
    public boolean f48410s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f48406e = new ArrayList();
    public int f48408n = -1;

    public p11(int i3, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f48403a = i3;
        this.f48404b = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j10));
        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i3).N0(j10);
        this.f48405c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.f48410s) {
                this.f48410s = true;
                org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.T);
            }
            org.telegram.messenger.hp.s1(i3).V2(0, j10, false);
        }
    }

    public final void a() {
        if (!this.f48410s) {
            return;
        }
        this.f48410s = false;
        int i3 = this.f48403a;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.T);
        if (this.f48408n >= 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.f48408n, true);
            this.f48408n = -1;
        }
        this.f48407f = false;
    }

    public final void b() {
        int size;
        if (!this.f48407f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f48405c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f27000q)) {
                this.f48407f = true;
                TLRPC.Chat chat = this.f48404b;
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.hp.i1(chat);
                    tL_channels_getParticipants.filter = this.f48405c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f48409r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f48403a).sendRequestTyped(tL_channels_getParticipants, new c3.b(1), new c5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f27002id;
            TLRPC.Chat chat = this.f48404b;
            if (j10 == chat.f27001id && !org.telegram.messenger.t3.T(chat) && this.f48407f) {
                this.f48407f = false;
                b();
            }
        }
    }
}
