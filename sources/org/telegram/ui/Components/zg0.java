package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zg0 {
    public int f30866a;
    public ArrayList f30867b;
    public String f30868c;
    public final byte[] d;
    public boolean e;
    public int f30869f = 10;

    public zg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30866a = tL_messages_votesList.count;
        this.f30867b = tL_messages_votesList.votes;
        this.f30868c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30867b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30869f, this.f30867b.size());
        }
        return this.f30867b.size();
    }
}
