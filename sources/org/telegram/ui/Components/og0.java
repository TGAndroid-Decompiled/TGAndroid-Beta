package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class og0 {
    public int f29045a;
    public ArrayList f29046b;
    public String f29047c;
    public final byte[] d;
    public boolean f29048e;
    public int f29049f = 10;

    public og0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f29045a = tL_messages_votesList.count;
        this.f29046b = tL_messages_votesList.votes;
        this.f29047c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f29046b.size() <= 15) {
            return 0;
        }
        if (this.f29048e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f29048e) {
            return Math.min(this.f29049f, this.f29046b.size());
        }
        return this.f29046b.size();
    }
}
