package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bh0 {
    public int f24954a;
    public ArrayList f24955b;
    public String f24956c;
    public final byte[] d;
    public boolean f24957e;
    public int f24958f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f24954a = tL_messages_votesList.count;
        this.f24955b = tL_messages_votesList.votes;
        this.f24956c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f24955b.size() <= 15) {
            return 0;
        }
        if (this.f24957e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f24957e) {
            return Math.min(this.f24958f, this.f24955b.size());
        }
        return this.f24955b.size();
    }
}
