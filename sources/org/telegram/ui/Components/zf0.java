package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zf0 {
    public int f35298a;
    public ArrayList f35299b;
    public String f35300c;
    public final byte[] d;
    public boolean f35301e;
    public int f35302f = 10;

    public zf0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f35298a = tL_messages_votesList.count;
        this.f35299b = tL_messages_votesList.votes;
        this.f35300c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f35299b.size() <= 15) {
            return 0;
        }
        if (this.f35301e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f35301e) {
            return Math.min(this.f35302f, this.f35299b.size());
        }
        return this.f35299b.size();
    }
}
