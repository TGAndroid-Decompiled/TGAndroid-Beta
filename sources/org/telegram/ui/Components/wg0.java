package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wg0 {
    public int f32744a;
    public ArrayList f32745b;
    public String f32746c;
    public final byte[] d;
    public boolean f32747e;
    public int f32748f = 10;

    public wg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.f32744a = tL_messages_votesList.count;
        this.f32745b = tL_messages_votesList.votes;
        this.f32746c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.f32745b.size() <= 15) {
            return 0;
        }
        if (this.f32747e) {
            return 1;
        }
        return 2;
    }

    public final int b() {
        if (this.f32747e) {
            return Math.min(this.f32748f, this.f32745b.size());
        }
        return this.f32745b.size();
    }
}
