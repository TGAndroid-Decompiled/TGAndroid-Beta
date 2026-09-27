package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f23023a;
    public ArrayList f23024b;
    public String f23025c;
    public final byte[] d;
    public boolean e;
    public int f23026f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f23023a = tL_messages_votesList.count;
        this.f23024b = tL_messages_votesList.votes;
        this.f23025c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f23024b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f23026f, this.f23024b.size());
        }
        return this.f23024b.size();
    }
}
