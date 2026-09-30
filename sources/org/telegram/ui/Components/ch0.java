package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ch0 {
    public int f23315a;
    public ArrayList f23316b;
    public String f23317c;
    public final byte[] d;
    public boolean e;
    public int f23318f = 10;

    public ch0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f23315a = tL_messages_votesList.count;
        this.f23316b = tL_messages_votesList.votes;
        this.f23317c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f23316b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f23318f, this.f23316b.size());
        }
        return this.f23316b.size();
    }
}
