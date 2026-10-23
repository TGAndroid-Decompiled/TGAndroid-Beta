package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nh0 {
    public int f28949a;
    public ArrayList f28950b;
    public String f28951c;
    public final byte[] d;
    public boolean e;
    public int f28952f = 10;

    public nh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f28949a = tL_messages_votesList.count;
        this.f28950b = tL_messages_votesList.votes;
        this.f28951c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f28950b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f28952f, this.f28950b.size());
        }
        return this.f28950b.size();
    }
}
