package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public int f31520a;
    public ArrayList f31521b;
    public String f31522c;
    public final byte[] d;
    public boolean f31523e;
    public int f31524f = 10;

    public vh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f31520a = tL_messages_votesList.count;
        this.f31521b = tL_messages_votesList.votes;
        this.f31522c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f31521b.size() <= 15) {
            return 0;
        }
        if (this.f31523e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f31523e) {
            return Math.min(this.f31524f, this.f31521b.size());
        }
        return this.f31521b.size();
    }
}
