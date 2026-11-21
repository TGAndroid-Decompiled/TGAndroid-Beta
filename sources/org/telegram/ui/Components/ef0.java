package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ef0 {
    public int f34783a;
    public ArrayList f34784b;
    public String f34785c;
    public final byte[] d;
    public boolean f34786e;
    public int f34787f = 10;

    public ef0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f34783a = tL_messages_votesList.count;
        this.f34784b = tL_messages_votesList.votes;
        this.f34785c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f34784b.size() <= 15) {
            return 0;
        }
        if (this.f34786e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f34786e) {
            return Math.min(this.f34787f, this.f34784b.size());
        }
        return this.f34784b.size();
    }
}
