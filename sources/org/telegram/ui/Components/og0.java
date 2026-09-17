package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class og0 {
    public int f29046a;
    public ArrayList f29047b;
    public String f29048c;
    public final byte[] d;
    public boolean f29049e;
    public int f29050f = 10;

    public og0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f29046a = tL_messages_votesList.count;
        this.f29047b = tL_messages_votesList.votes;
        this.f29048c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f29047b.size() <= 15) {
            return 0;
        }
        if (this.f29049e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f29049e) {
            return Math.min(this.f29050f, this.f29047b.size());
        }
        return this.f29047b.size();
    }
}
