package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
public final class p implements Utilities.CallbackReturn {
    public final int f19380a;

    public p(int i10) {
        this.f19380a = i10;
    }

    @Override
    public final Object run(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.f19380a) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
