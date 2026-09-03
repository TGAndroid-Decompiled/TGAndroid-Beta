package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vg0 {
    public int f29473a;
    public ArrayList f29474b;
    public String f29475c;
    public final byte[] d;
    public boolean e;
    public int f29476f = 10;

    public vg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f29473a = tL_messages_votesList.count;
        this.f29474b = tL_messages_votesList.votes;
        this.f29475c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f29474b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f29476f, this.f29474b.size());
        }
        return this.f29474b.size();
    }
}
