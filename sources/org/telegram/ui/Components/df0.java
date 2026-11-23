package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class df0 {
    public int f34317a;
    public ArrayList f34318b;
    public String f34319c;
    public final byte[] d;
    public boolean f34320e;
    public int f34321f = 10;

    public df0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f34317a = tL_messages_votesList.count;
        this.f34318b = tL_messages_votesList.votes;
        this.f34319c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f34318b.size() <= 15) {
            return 0;
        }
        if (this.f34320e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f34320e) {
            return Math.min(this.f34321f, this.f34318b.size());
        }
        return this.f34318b.size();
    }
}
