package org.telegram.tgnet;

import org.telegram.messenger.s20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
public final class r implements s20 {
    public final int f19997a;

    @Override
    public final Object a(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.f19997a) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
