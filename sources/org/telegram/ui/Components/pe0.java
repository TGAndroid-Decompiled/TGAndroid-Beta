package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pe0 {
    public int f36869a;
    public ArrayList f36870b;
    public String f36871c;
    public final byte[] d;
    public boolean f36872e;
    public int f36873f = 10;

    public pe0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f36869a = tL_messages_votesList.count;
        this.f36870b = tL_messages_votesList.votes;
        this.f36871c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f36870b.size() <= 15) {
            return 0;
        }
        if (this.f36872e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f36872e) {
            return Math.min(this.f36873f, this.f36870b.size());
        }
        return this.f36870b.size();
    }
}
