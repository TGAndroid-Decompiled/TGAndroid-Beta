package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yg0 {
    public int f29322a;
    public ArrayList f29323b;
    public String f29324c;
    public final byte[] d;
    public boolean e;
    public int f29325f = 10;

    public yg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f29322a = tL_messages_votesList.count;
        this.f29323b = tL_messages_votesList.votes;
        this.f29324c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f29323b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f29325f, this.f29323b.size());
        }
        return this.f29323b.size();
    }
}
