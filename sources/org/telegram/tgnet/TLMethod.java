package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z10) {
        return deserializeResponseT(inputSerializedData, i7, z10);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10);
}
