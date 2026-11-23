package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ef0 {
    public int f34781a;
    public ArrayList f34782b;
    public String f34783c;
    public final byte[] d;
    public boolean f34784e;
    public int f34785f = 10;

    public ef0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f34781a = tL_messages_votesList.count;
        this.f34782b = tL_messages_votesList.votes;
        this.f34783c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f34782b.size() <= 15) {
            return 0;
        }
        if (this.f34784e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f34784e) {
            return Math.min(this.f34785f, this.f34782b.size());
        }
        return this.f34782b.size();
    }
}
