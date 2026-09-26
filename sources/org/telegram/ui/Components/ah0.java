package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ah0 {
    public int f22645a;
    public ArrayList f22646b;
    public String f22647c;
    public final byte[] d;
    public boolean e;
    public int f22648f = 10;

    public ah0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f22645a = tL_messages_votesList.count;
        this.f22646b = tL_messages_votesList.votes;
        this.f22647c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f22646b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f22648f, this.f22646b.size());
        }
        return this.f22646b.size();
    }
}
