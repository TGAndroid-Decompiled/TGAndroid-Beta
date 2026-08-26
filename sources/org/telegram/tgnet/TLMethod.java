package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
        return deserializeResponseT(inputSerializedData, i, z);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z);
}
