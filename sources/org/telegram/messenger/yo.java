package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class yo {
    public final int f19414a;
    public final long f19415b;
    public boolean f19416c;
    public boolean d;
    public final ArrayList e;
    public int f19417f;
    public int f19418g;

    public yo(int i10, long j10) {
        long j11;
        int i11;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f19417f = -1;
        this.f19414a = i10;
        this.f19415b = j10;
        if (!this.f19416c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f19416c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = vp.r1(i10).n1(j10);
            if (arrayList.isEmpty()) {
                j11 = 0;
            } else {
                j11 = ((TLRPC.Chat) i0.a.g(1, arrayList)).f19793id;
            }
            tL_messages_getCommonChats.max_id = j11;
            if (isEmpty) {
                i11 = 15;
            } else {
                i11 = 30;
            }
            tL_messages_getCommonChats.limit = i11;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCommonChats, new q3(this, r7, isEmpty, 4));
            this.f19417f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
