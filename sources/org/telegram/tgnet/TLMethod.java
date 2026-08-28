package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i9, boolean z10) {
        return deserializeResponseT(inputSerializedData, i9, z10);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i9, boolean z10);
}
