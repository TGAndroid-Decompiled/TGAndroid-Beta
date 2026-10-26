package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mh0 {
    public int f30586a;
    public ArrayList f30587b;
    public String f30588c;
    public final byte[] d;
    public boolean e;
    public int f30589f = 10;

    public mh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f30586a = tL_messages_votesList.count;
        this.f30587b = tL_messages_votesList.votes;
        this.f30588c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f30587b.size() <= 15) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.e) {
            return Math.min(this.f30589f, this.f30587b.size());
        }
        return this.f30587b.size();
    }
}
