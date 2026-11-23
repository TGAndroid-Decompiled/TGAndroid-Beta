package org.telegram.tgnet;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
public final class q implements z10 {
    public final int f28636a;

    public q(int i7) {
        this.f28636a = i7;
    }

    @Override
    public final Object a(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.f28636a) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
