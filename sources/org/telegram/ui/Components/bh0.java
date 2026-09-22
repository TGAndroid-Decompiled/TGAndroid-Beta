package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f22993a;
    public ArrayList f22994b;
    public String f22995c;
    public final byte[] d;
    public boolean e;
    public int f22996f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f22993a = tL_messages_votesList.count;
        this.f22994b = tL_messages_votesList.votes;
        this.f22995c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f22994b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f22996f, this.f22994b.size());
        }
        return this.f22994b.size();
    }
}
