package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pg0 {
    public int f27025a;
    public ArrayList f27026b;
    public String f27027c;
    public final byte[] d;
    public boolean e;
    public int f27028f = 10;

    public pg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f27025a = tL_messages_votesList.count;
        this.f27026b = tL_messages_votesList.votes;
        this.f27027c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f27026b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f27028f, this.f27026b.size());
        }
        return this.f27026b.size();
    }
}
