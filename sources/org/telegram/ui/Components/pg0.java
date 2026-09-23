package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pg0 {
    public int f27024a;
    public ArrayList f27025b;
    public String f27026c;
    public final byte[] d;
    public boolean e;
    public int f27027f = 10;

    public pg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f27024a = tL_messages_votesList.count;
        this.f27025b = tL_messages_votesList.votes;
        this.f27026c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f27025b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f27027f, this.f27025b.size());
        }
        return this.f27025b.size();
    }
}
