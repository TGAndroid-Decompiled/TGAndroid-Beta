package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class y implements Utilities.Callback {
    public final int f17464a;
    public final OutputSerializedData f17465b;

    public y(OutputSerializedData outputSerializedData, int i10) {
        this.f17464a = i10;
        this.f17465b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17464a) {
            case 0:
                this.f17465b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f17465b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f17465b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f17465b.writeString((String) obj);
                return;
        }
    }
}
