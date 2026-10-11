package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class th0 {
    public int f31098a;
    public ArrayList f31099b;
    public String f31100c;
    public final byte[] d;
    public boolean f31101e;
    public int f31102f = 10;

    public th0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f31098a = tL_messages_votesList.count;
        this.f31099b = tL_messages_votesList.votes;
        this.f31100c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f31099b.size() <= 15) {
            return 0;
        }
        if (this.f31101e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f31101e) {
            return Math.min(this.f31102f, this.f31099b.size());
        }
        return this.f31099b.size();
    }
}
