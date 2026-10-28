package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nh0 {
    public int f30919a;
    public ArrayList f30920b;
    public String f30921c;
    public final byte[] d;
    public boolean e;
    public int f30922f = 10;

    public nh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30919a = tL_messages_votesList.count;
        this.f30920b = tL_messages_votesList.votes;
        this.f30921c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30920b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30922f, this.f30920b.size());
        }
        return this.f30920b.size();
    }
}
