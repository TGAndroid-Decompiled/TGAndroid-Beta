package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pe0 {
    public int f36911a;
    public ArrayList f36912b;
    public String f36913c;
    public final byte[] d;
    public boolean f36914e;
    public int f36915f = 10;

    public pe0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f36911a = tL_messages_votesList.count;
        this.f36912b = tL_messages_votesList.votes;
        this.f36913c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f36912b.size() <= 15) {
            return 0;
        }
        if (this.f36914e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f36914e) {
            return Math.min(this.f36915f, this.f36912b.size());
        }
        return this.f36912b.size();
    }
}
