package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return deserializeResponseT(inputSerializedData, i10, z4);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4);
}
