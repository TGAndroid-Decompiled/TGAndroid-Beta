package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ph0 {
    public int f28001a;
    public ArrayList f28002b;
    public String f28003c;
    public final byte[] d;
    public boolean e;
    public int f28004f = 10;

    public ph0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f28001a = tL_messages_votesList.count;
        this.f28002b = tL_messages_votesList.votes;
        this.f28003c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f28002b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f28004f, this.f28002b.size());
        }
        return this.f28002b.size();
    }
}
