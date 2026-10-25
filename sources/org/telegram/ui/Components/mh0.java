package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mh0 {
    public int f30584a;
    public ArrayList f30585b;
    public String f30586c;
    public final byte[] d;
    public boolean e;
    public int f30587f = 10;

    public mh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30584a = tL_messages_votesList.count;
        this.f30585b = tL_messages_votesList.votes;
        this.f30586c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30585b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30587f, this.f30585b.size());
        }
        return this.f30585b.size();
    }
}
