package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;

public final class TL_stars$TL_payments_starsStatus$$ExternalSyntheticLambda1 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_stars.StarsTransaction.TLdeserialize(inputSerializedData, i, z);
    }
}
