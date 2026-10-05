package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f24975a;
    public ArrayList f24976b;
    public String f24977c;
    public final byte[] d;
    public boolean f24978e;
    public int f24979f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f24975a = tL_messages_votesList.count;
        this.f24976b = tL_messages_votesList.votes;
        this.f24977c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f24976b.size() <= 15) {
            return 0;
        }
        if (this.f24978e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f24978e) {
            return Math.min(this.f24979f, this.f24976b.size());
        }
        return this.f24976b.size();
    }
}
