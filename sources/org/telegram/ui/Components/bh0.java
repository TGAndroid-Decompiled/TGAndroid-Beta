package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f23002a;
    public ArrayList f23003b;
    public String f23004c;
    public final byte[] d;
    public boolean e;
    public int f23005f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f23002a = tL_messages_votesList.count;
        this.f23003b = tL_messages_votesList.votes;
        this.f23004c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f23003b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f23005f, this.f23003b.size());
        }
        return this.f23003b.size();
    }
}
