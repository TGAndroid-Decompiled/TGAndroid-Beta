package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zg0 {
    public int f30797a;
    public ArrayList f30798b;
    public String f30799c;
    public final byte[] d;
    public boolean e;
    public int f30800f = 10;

    public zg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30797a = tL_messages_votesList.count;
        this.f30798b = tL_messages_votesList.votes;
        this.f30799c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30798b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30800f, this.f30798b.size());
        }
        return this.f30798b.size();
    }
}
