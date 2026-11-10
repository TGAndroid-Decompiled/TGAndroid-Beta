package org.telegram.tgnet;

import org.telegram.messenger.d20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
public final class q implements d20 {
    public final int f27162a;

    public q(int i7) {
        this.f27162a = i7;
    }

    @Override
    public final Object a(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.f27162a) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
