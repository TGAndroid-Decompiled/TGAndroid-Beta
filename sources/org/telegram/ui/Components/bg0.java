package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class bg0 {

    public int f27092a;

    public ArrayList f27093b;

    public String f27094c;
    public final byte[] d;

    public boolean f27095e;

    public int f27096f = 10;

    public bg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f27092a = tL_messages_votesList.count;
        this.f27093b = tL_messages_votesList.votes;
        this.f27094c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f27093b.size() <= 15) {
            return 0;
        }
        return this.f27095e ? 1 : 2;
    }

    public final int b() {
        return this.f27095e ? Math.min(this.f27096f, this.f27093b.size()) : this.f27093b.size();
    }
}
