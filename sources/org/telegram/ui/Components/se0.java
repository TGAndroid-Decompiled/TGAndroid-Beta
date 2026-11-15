package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class se0 {
    public int f39293a;
    public ArrayList f39294b;
    public String f39295c;
    public final byte[] d;
    public boolean f39296e;
    public int f39297f = 10;

    public se0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f39293a = tL_messages_votesList.count;
        this.f39294b = tL_messages_votesList.votes;
        this.f39295c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f39294b.size() <= 15) {
            return 0;
        }
        if (this.f39296e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f39296e) {
            return Math.min(this.f39297f, this.f39294b.size());
        }
        return this.f39294b.size();
    }
}
