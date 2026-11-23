package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ef0 {
    public int f34771a;
    public ArrayList f34772b;
    public String f34773c;
    public final byte[] d;
    public boolean f34774e;
    public int f34775f = 10;

    public ef0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f34771a = tL_messages_votesList.count;
        this.f34772b = tL_messages_votesList.votes;
        this.f34773c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f34772b.size() <= 15) {
            return 0;
        }
        if (this.f34774e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f34774e) {
            return Math.min(this.f34775f, this.f34772b.size());
        }
        return this.f34772b.size();
    }
}
