package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pe0 {
    public int f36885a;
    public ArrayList f36886b;
    public String f36887c;
    public final byte[] d;
    public boolean f36888e;
    public int f36889f = 10;

    public pe0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f36885a = tL_messages_votesList.count;
        this.f36886b = tL_messages_votesList.votes;
        this.f36887c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f36886b.size() <= 15) {
            return 0;
        }
        if (this.f36888e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f36888e) {
            return Math.min(this.f36889f, this.f36886b.size());
        }
        return this.f36886b.size();
    }
}
