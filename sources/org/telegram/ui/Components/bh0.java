package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f24959a;
    public ArrayList f24960b;
    public String f24961c;
    public final byte[] d;
    public boolean f24962e;
    public int f24963f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f24959a = tL_messages_votesList.count;
        this.f24960b = tL_messages_votesList.votes;
        this.f24961c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f24960b.size() <= 15) {
            return 0;
        }
        if (this.f24962e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f24962e) {
            return Math.min(this.f24963f, this.f24960b.size());
        }
        return this.f24960b.size();
    }
}
