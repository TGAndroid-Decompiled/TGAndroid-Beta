package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class og0 {
    public int f26777a;
    public ArrayList f26778b;
    public String f26779c;
    public final byte[] d;
    public boolean e;
    public int f26780f = 10;

    public og0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f26777a = tL_messages_votesList.count;
        this.f26778b = tL_messages_votesList.votes;
        this.f26779c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f26778b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f26780f, this.f26778b.size());
        }
        return this.f26778b.size();
    }
}
