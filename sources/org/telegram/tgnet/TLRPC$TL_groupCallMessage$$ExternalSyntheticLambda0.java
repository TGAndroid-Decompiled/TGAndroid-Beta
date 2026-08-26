package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.json.TLJsonParser;

public final class TLRPC$TL_groupCallMessage$$ExternalSyntheticLambda0 implements Utilities.CallbackReturn {
    public final int $r8$classId;

    public TLRPC$TL_groupCallMessage$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final Object run(Object obj) {
        TLJsonParser tLJsonParser = (TLJsonParser) obj;
        switch (this.$r8$classId) {
            case 0:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize(tLJsonParser);
            default:
                return TLRPC.MessageEntity.TLJsonDeserialize(tLJsonParser);
        }
    }
}
