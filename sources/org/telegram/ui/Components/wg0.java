package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wg0 {
    public int f32749a;
    public ArrayList f32750b;
    public String f32751c;
    public final byte[] d;
    public boolean f32752e;
    public int f32753f = 10;

    public wg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f32749a = tL_messages_votesList.count;
        this.f32750b = tL_messages_votesList.votes;
        this.f32751c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f32750b.size() <= 15) {
            return 0;
        }
        if (this.f32752e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f32752e) {
            return Math.min(this.f32753f, this.f32750b.size());
        }
        return this.f32750b.size();
    }
}
