package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pe0 {
    public int f36898a;
    public ArrayList f36899b;
    public String f36900c;
    public final byte[] d;
    public boolean f36901e;
    public int f36902f = 10;

    public pe0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f36898a = tL_messages_votesList.count;
        this.f36899b = tL_messages_votesList.votes;
        this.f36900c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f36899b.size() <= 15) {
            return 0;
        }
        if (this.f36901e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f36901e) {
            return Math.min(this.f36902f, this.f36899b.size());
        }
        return this.f36899b.size();
    }
}
