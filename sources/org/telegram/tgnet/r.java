package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
public final class r implements Utilities.CallbackReturn {
    public final int f19416a;

    public r(int i10) {
        this.f19416a = i10;
    }

    @Override
    public final Object run(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.f19416a) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
