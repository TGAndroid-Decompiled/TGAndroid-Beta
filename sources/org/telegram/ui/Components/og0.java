package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class og0 {
    public int f29072a;
    public ArrayList f29073b;
    public String f29074c;
    public final byte[] d;
    public boolean f29075e;
    public int f29076f = 10;

    public og0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f29072a = tL_messages_votesList.count;
        this.f29073b = tL_messages_votesList.votes;
        this.f29074c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f29073b.size() <= 15) {
            return 0;
        }
        if (this.f29075e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f29075e) {
            return Math.min(this.f29076f, this.f29073b.size());
        }
        return this.f29073b.size();
    }
}
