package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yg0 {
    public int f30527a;
    public ArrayList f30528b;
    public String f30529c;
    public final byte[] d;
    public boolean e;
    public int f30530f = 10;

    public yg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30527a = tL_messages_votesList.count;
        this.f30528b = tL_messages_votesList.votes;
        this.f30529c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30528b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30530f, this.f30528b.size());
        }
        return this.f30528b.size();
    }
}
