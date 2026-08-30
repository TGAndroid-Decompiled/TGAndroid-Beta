package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ug0 {
    public int f29215a;
    public ArrayList f29216b;
    public String f29217c;
    public final byte[] d;
    public boolean e;
    public int f29218f = 10;

    public ug0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f29215a = tL_messages_votesList.count;
        this.f29216b = tL_messages_votesList.votes;
        this.f29217c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f29216b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f29218f, this.f29216b.size());
        }
        return this.f29216b.size();
    }
}
