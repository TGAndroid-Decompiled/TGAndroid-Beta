package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f23001a;
    public ArrayList f23002b;
    public String f23003c;
    public final byte[] d;
    public boolean e;
    public int f23004f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f23001a = tL_messages_votesList.count;
        this.f23002b = tL_messages_votesList.votes;
        this.f23003c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f23002b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f23004f, this.f23002b.size());
        }
        return this.f23002b.size();
    }
}
