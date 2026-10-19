package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jh0 {
    public int f27529a;
    public ArrayList f27530b;
    public String f27531c;
    public final byte[] d;
    public boolean e;
    public int f27532f = 10;

    public jh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f27529a = tL_messages_votesList.count;
        this.f27530b = tL_messages_votesList.votes;
        this.f27531c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f27530b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f27532f, this.f27530b.size());
        }
        return this.f27530b.size();
    }
}
