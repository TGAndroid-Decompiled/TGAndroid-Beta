package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yk implements RequestDelegate {
    public final int f27766a;
    public final np f27767b;
    public final int f27768c;
    public final int d;
    public final int f27769e;
    public final int f27770f;
    public final int f27771g;
    public final long h;
    public final long f27772i;
    public final int f27773j;
    public final int f27774k;
    public final int f27775l;
    public final int f27776m;
    public final int f27777n;
    public final long f27778o;
    public final int f27779p;
    public final boolean f27780q;
    public final int f27781r;
    public final boolean f27782s;
    public final boolean f27783t;
    public final TLObject f27784u;

    public yk(np npVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f27766a = 1;
        this.f27767b = npVar;
        this.f27768c = i7;
        this.d = i10;
        this.f27769e = i11;
        this.f27770f = i12;
        this.f27771g = i13;
        this.h = j3;
        this.f27772i = j10;
        this.f27773j = i14;
        this.f27774k = i15;
        this.f27775l = i16;
        this.f27776m = i17;
        this.f27777n = i18;
        this.f27778o = j11;
        this.f27779p = i19;
        this.f27780q = z10;
        this.f27781r = i20;
        this.f27782s = z11;
        this.f27783t = z12;
        this.f27784u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f27766a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f27784u;
                np npVar = this.f27767b;
                int i13 = this.f27770f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    npVar.e4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f27768c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f27769e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) i5.c.h(1, messages_messages.messages)).f28072id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f28072id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    npVar.K3(messages_messages, messages_messages.messages.size(), j3, this.f27772i, i14, i7, i15, false, i13, this.f27771g, this.f27773j, this.f27774k, this.f27775l, this.f27776m, false, this.f27777n, this.f27778o, this.f27779p, this.f27780q, this.f27781r, this.f27782s, this.f27783t, null);
                    return;
                }
                g0.h3(new cg(npVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 13));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f27784u;
                np npVar2 = this.f27767b;
                int i16 = this.f27773j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f27768c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f27769e;
                    int i20 = this.f27771g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28072id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f28072id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f27770f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f28072id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        npVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27772i, i17, i11, i19, false, i16, i10, this.f27774k, this.f27775l, this.f27776m, i20, false, this.f27777n, this.f27778o, this.f27779p, this.f27780q, this.f27781r, this.f27782s, this.f27783t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    npVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27772i, i17, i11, i19, false, i16, i10, this.f27774k, this.f27775l, this.f27776m, i20, false, this.f27777n, this.f27778o, this.f27779p, this.f27780q, this.f27781r, this.f27782s, this.f27783t, null);
                    return;
                }
                g0.h3(new cg(npVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 9));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f27784u;
                np npVar3 = this.f27767b;
                int i23 = this.f27770f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    npVar3.e4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f27768c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f27769e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) i5.c.h(1, messages_messages3.messages)).f28072id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f28072id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    npVar3.K3(messages_messages3, messages_messages3.messages.size(), j10, this.f27772i, i24, i12, i25, false, i23, this.f27771g, this.f27773j, this.f27774k, this.f27775l, this.f27776m, false, this.f27777n, this.f27778o, this.f27779p, this.f27780q, this.f27781r, this.f27782s, this.f27783t, null);
                    return;
                }
                g0.h3(new cg(npVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 11));
                return;
        }
    }

    public yk(np npVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.f27766a = i21;
        this.f27767b = npVar;
        this.h = j3;
        this.f27768c = i7;
        this.d = i10;
        this.f27769e = i11;
        this.f27772i = j10;
        this.f27770f = i12;
        this.f27771g = i13;
        this.f27773j = i14;
        this.f27774k = i15;
        this.f27775l = i16;
        this.f27776m = i17;
        this.f27777n = i18;
        this.f27778o = j11;
        this.f27779p = i19;
        this.f27780q = z10;
        this.f27781r = i20;
        this.f27782s = z11;
        this.f27783t = z12;
        this.f27784u = tLObject;
    }
}
