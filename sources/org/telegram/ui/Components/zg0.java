package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zg0 {
    public int f30871a;
    public ArrayList f30872b;
    public String f30873c;
    public final byte[] d;
    public boolean e;
    public int f30874f = 10;

    public zg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30871a = tL_messages_votesList.count;
        this.f30872b = tL_messages_votesList.votes;
        this.f30873c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30872b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30874f, this.f30872b.size());
        }
        return this.f30872b.size();
    }
}
