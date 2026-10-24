package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mh0 {
    public int f28599a;
    public ArrayList f28600b;
    public String f28601c;
    public final byte[] d;
    public boolean e;
    public int f28602f = 10;

    public mh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f28599a = tL_messages_votesList.count;
        this.f28600b = tL_messages_votesList.votes;
        this.f28601c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f28600b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f28602f, this.f28600b.size());
        }
        return this.f28600b.size();
    }
}
