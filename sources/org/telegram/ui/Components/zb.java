package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zb implements org.telegram.messenger.r20 {
    public final int f33093a = 2;
    public final long f33094b;
    public final int f33095c;
    public final Object d;

    public zb(int i10, long j10, TLRPC.Document document) {
        this.f33095c = i10;
        this.f33094b = j10;
        this.d = document;
    }

    @Override
    public final void a(Object obj) {
        Object L0;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f33093a;
        Object obj2 = this.d;
        long j10 = this.f33094b;
        int i11 = this.f33095c;
        switch (i10) {
            case 0:
                wb wbVar = (wb) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i11 == 1) {
                        L0 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("TopicContainsEmojiPackSingle", null, 2131744047, stickerSet.title));
                    } else if (i11 == 2) {
                        L0 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("StoryContainsEmojiPackSingle", null, 2131744717, stickerSet.title));
                    } else {
                        L0 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("MessageContainsEmojiPackSingle", null, 2131748611, stickerSet.title));
                    }
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131754435, null);
                }
                org.telegram.messenger.i0.h3(new org.telegram.ui.ch(27, wbVar, L0), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            case 1:
                ((au0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
            default:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    rh.e6.y(i11, false).P(j10);
                    org.telegram.messenger.i0.g3(new v41(new org.telegram.ui.tl0(j10, 2), document, org.telegram.messenger.dd.L0(2131750111, null), 25));
                    return;
                }
                return;
        }
    }

    public zb(int i10, wb wbVar, long j10) {
        this.f33095c = i10;
        this.d = wbVar;
        this.f33094b = j10;
    }

    public zb(au0 au0Var, long j10, int i10) {
        this.d = au0Var;
        this.f33094b = j10;
        this.f33095c = i10;
    }
}
