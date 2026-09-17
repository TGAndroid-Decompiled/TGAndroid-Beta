package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pg0 {
    public int f27022a;
    public ArrayList f27023b;
    public String f27024c;
    public final byte[] d;
    public boolean e;
    public int f27025f = 10;

    public pg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f27022a = tL_messages_votesList.count;
        this.f27023b = tL_messages_votesList.votes;
        this.f27024c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f27023b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f27025f, this.f27023b.size());
        }
        return this.f27023b.size();
    }
}
