package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f24955a;
    public ArrayList f24956b;
    public String f24957c;
    public final byte[] d;
    public boolean f24958e;
    public int f24959f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f24955a = tL_messages_votesList.count;
        this.f24956b = tL_messages_votesList.votes;
        this.f24957c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f24956b.size() <= 15) {
            return 0;
        }
        if (this.f24958e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f24958e) {
            return Math.min(this.f24959f, this.f24956b.size());
        }
        return this.f24956b.size();
    }
}
