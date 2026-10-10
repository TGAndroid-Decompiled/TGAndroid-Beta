package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sh0 {
    public int f30786a;
    public ArrayList f30787b;
    public String f30788c;
    public final byte[] d;
    public boolean f30789e;
    public int f30790f = 10;

    public sh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30786a = tL_messages_votesList.count;
        this.f30787b = tL_messages_votesList.votes;
        this.f30788c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30787b.size() <= 15) {
            return 0;
        }
        if (this.f30789e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f30789e) {
            return Math.min(this.f30790f, this.f30787b.size());
        }
        return this.f30787b.size();
    }
}
