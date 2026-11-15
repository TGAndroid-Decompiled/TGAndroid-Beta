package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class se0 {
    public int f39291a;
    public ArrayList f39292b;
    public String f39293c;
    public final byte[] d;
    public boolean f39294e;
    public int f39295f = 10;

    public se0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f39291a = tL_messages_votesList.count;
        this.f39292b = tL_messages_votesList.votes;
        this.f39293c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f39292b.size() <= 15) {
            return 0;
        }
        if (this.f39294e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f39294e) {
            return Math.min(this.f39295f, this.f39292b.size());
        }
        return this.f39292b.size();
    }
}
