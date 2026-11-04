package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class re0 {
    public int f37712a;
    public ArrayList f37713b;
    public String f37714c;
    public final byte[] d;
    public boolean f37715e;
    public int f37716f = 10;

    public re0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f37712a = tL_messages_votesList.count;
        this.f37713b = tL_messages_votesList.votes;
        this.f37714c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f37713b.size() <= 15) {
            return 0;
        }
        if (this.f37715e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f37715e) {
            return Math.min(this.f37716f, this.f37713b.size());
        }
        return this.f37713b.size();
    }
}
