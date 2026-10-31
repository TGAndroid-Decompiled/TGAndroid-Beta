package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sf0 {
    public int f30233a;
    public ArrayList f30234b;
    public String f30235c;
    public final byte[] d;
    public boolean e;
    public int f30236f = 10;

    public sf0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30233a = tL_messages_votesList.count;
        this.f30234b = tL_messages_votesList.votes;
        this.f30235c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30234b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30236f, this.f30234b.size());
        }
        return this.f30234b.size();
    }
}
