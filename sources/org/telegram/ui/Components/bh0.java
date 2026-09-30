package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f22971a;
    public ArrayList f22972b;
    public String f22973c;
    public final byte[] d;
    public boolean e;
    public int f22974f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f22971a = tL_messages_votesList.count;
        this.f22972b = tL_messages_votesList.votes;
        this.f22973c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f22972b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f22974f, this.f22972b.size());
        }
        return this.f22972b.size();
    }
}
