package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public int f31519a;
    public ArrayList f31520b;
    public String f31521c;
    public final byte[] d;
    public boolean f31522e;
    public int f31523f = 10;

    public vh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f31519a = tL_messages_votesList.count;
        this.f31520b = tL_messages_votesList.votes;
        this.f31521c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f31520b.size() <= 15) {
            return 0;
        }
        if (this.f31522e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f31522e) {
            return Math.min(this.f31523f, this.f31520b.size());
        }
        return this.f31520b.size();
    }
}
