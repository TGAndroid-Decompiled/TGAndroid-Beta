package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class og0 {
    public int f29073a;
    public ArrayList f29074b;
    public String f29075c;
    public final byte[] d;
    public boolean f29076e;
    public int f29077f = 10;

    public og0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f29073a = tL_messages_votesList.count;
        this.f29074b = tL_messages_votesList.votes;
        this.f29075c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f29074b.size() <= 15) {
            return 0;
        }
        if (this.f29076e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f29076e) {
            return Math.min(this.f29077f, this.f29074b.size());
        }
        return this.f29074b.size();
    }
}
