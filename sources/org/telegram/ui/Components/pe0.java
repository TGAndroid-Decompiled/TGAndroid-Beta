package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pe0 {
    public int f36990a;
    public ArrayList f36991b;
    public String f36992c;
    public final byte[] d;
    public boolean f36993e;
    public int f36994f = 10;

    public pe0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f36990a = tL_messages_votesList.count;
        this.f36991b = tL_messages_votesList.votes;
        this.f36992c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f36991b.size() <= 15) {
            return 0;
        }
        if (this.f36993e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f36993e) {
            return Math.min(this.f36994f, this.f36991b.size());
        }
        return this.f36991b.size();
    }
}
