package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cf0 {
    public int f33986a;
    public ArrayList f33987b;
    public String f33988c;
    public final byte[] d;
    public boolean f33989e;
    public int f33990f = 10;

    public cf0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f33986a = tL_messages_votesList.count;
        this.f33987b = tL_messages_votesList.votes;
        this.f33988c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f33987b.size() <= 15) {
            return 0;
        }
        if (this.f33989e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f33989e) {
            return Math.min(this.f33990f, this.f33987b.size());
        }
        return this.f33987b.size();
    }
}
