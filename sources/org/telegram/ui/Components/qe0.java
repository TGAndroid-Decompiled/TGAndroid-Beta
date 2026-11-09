package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qe0 {
    public int f37299a;
    public ArrayList f37300b;
    public String f37301c;
    public final byte[] d;
    public boolean f37302e;
    public int f37303f = 10;

    public qe0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f37299a = tL_messages_votesList.count;
        this.f37300b = tL_messages_votesList.votes;
        this.f37301c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f37300b.size() <= 15) {
            return 0;
        }
        if (this.f37302e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f37302e) {
            return Math.min(this.f37303f, this.f37300b.size());
        }
        return this.f37300b.size();
    }
}
