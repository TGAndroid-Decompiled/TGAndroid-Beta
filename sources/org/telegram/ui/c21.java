package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c21 implements org.telegram.messenger.ls {
    public final int f44202a;
    public final TLRPC.Chat f44203b;
    public TLRPC.ChannelParticipantsFilter f44204c;
    public boolean f44206f;
    public boolean h;
    public boolean f44208r;
    public boolean f44209s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f44205e = new ArrayList();
    public int f44207n = -1;

    public c21(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f44202a = i7;
        this.f44203b = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j3);
        this.f44204c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.f44209s) {
                this.f44209s = true;
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T);
            }
            org.telegram.messenger.qp.s1(i7).V2(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f44209s) {
            return;
        }
        this.f44209s = false;
        int i7 = this.f44202a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T);
        if (this.f44207n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f44207n, true);
            this.f44207n = -1;
        }
        this.f44206f = false;
    }

    public final void b() {
        int size;
        if (!this.f44206f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f44204c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f26959q)) {
                this.f44206f = true;
                TLRPC.Chat chat = this.f44203b;
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
                    tL_channels_getParticipants.filter = this.f44204c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f44208r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f44202a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f26961id;
            TLRPC.Chat chat = this.f44203b;
            if (j3 == chat.f26960id && !org.telegram.messenger.t3.T(chat) && this.f44206f) {
                this.f44206f = false;
                b();
            }
        }
    }
}
