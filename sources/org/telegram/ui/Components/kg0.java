package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kg0 {
    public int f30037a;
    public ArrayList f30038b;
    public String f30039c;
    public final byte[] d;
    public boolean f30040e;
    public int f30041f = 10;

    public kg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30037a = tL_messages_votesList.count;
        this.f30038b = tL_messages_votesList.votes;
        this.f30039c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30038b.size() <= 15) {
            return 0;
        }
        if (this.f30040e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f30040e) {
            return Math.min(this.f30041f, this.f30038b.size());
        }
        return this.f30038b.size();
    }
}
