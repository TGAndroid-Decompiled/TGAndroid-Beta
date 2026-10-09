package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rh0 {
    public int f30444a;
    public ArrayList f30445b;
    public String f30446c;
    public final byte[] d;
    public boolean f30447e;
    public int f30448f = 10;

    public rh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30444a = tL_messages_votesList.count;
        this.f30445b = tL_messages_votesList.votes;
        this.f30446c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30445b.size() <= 15) {
            return 0;
        }
        if (this.f30447e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f30447e) {
            return Math.min(this.f30448f, this.f30445b.size());
        }
        return this.f30445b.size();
    }
}
