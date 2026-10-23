package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kh0 {
    public int f27881a;
    public ArrayList f27882b;
    public String f27883c;
    public final byte[] d;
    public boolean e;
    public int f27884f = 10;

    public kh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f27881a = tL_messages_votesList.count;
        this.f27882b = tL_messages_votesList.votes;
        this.f27883c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f27882b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f27884f, this.f27882b.size());
        }
        return this.f27882b.size();
    }
}
