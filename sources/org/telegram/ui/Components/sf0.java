package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sf0 {
    public int f30279a;
    public ArrayList f30280b;
    public String f30281c;
    public final byte[] d;
    public boolean e;
    public int f30282f = 10;

    public sf0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30279a = tL_messages_votesList.count;
        this.f30280b = tL_messages_votesList.votes;
        this.f30281c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30280b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30282f, this.f30280b.size());
        }
        return this.f30280b.size();
    }
}
