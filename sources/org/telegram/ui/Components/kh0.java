package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kh0 {
    public int f27877a;
    public ArrayList f27878b;
    public String f27879c;
    public final byte[] d;
    public boolean e;
    public int f27880f = 10;

    public kh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f27877a = tL_messages_votesList.count;
        this.f27878b = tL_messages_votesList.votes;
        this.f27879c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f27878b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f27880f, this.f27878b.size());
        }
        return this.f27878b.size();
    }
}
