package org.telegram.tgnet;

import org.telegram.messenger.Utilities;

public final class Vector$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final OutputSerializedData f$0;

    public Vector$$ExternalSyntheticLambda7(OutputSerializedData outputSerializedData) {
        this.f$0 = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.writeByteArray((byte[]) obj);
    }
}
