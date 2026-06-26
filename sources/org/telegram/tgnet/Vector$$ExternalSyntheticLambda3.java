package org.telegram.tgnet;

import org.telegram.messenger.Utilities;

public final class Vector$$ExternalSyntheticLambda3 implements Utilities.Callback {
    public final OutputSerializedData f$0;

    public Vector$$ExternalSyntheticLambda3(OutputSerializedData outputSerializedData) {
        this.f$0 = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.writeInt32(((Integer) obj).intValue());
    }
}
