package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class z10 extends TLObject {
    public final boolean f19470a;
    public final long f19471b;
    public final long f19472c;
    public final int d;
    public final String e;
    public final String f19473f;
    public final a20 f19474i;

    public z10(a20 a20Var, NativeByteBuffer nativeByteBuffer) {
        this.f19474i = a20Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f19471b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.e = nativeByteBuffer.readString(true);
            this.f19473f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f19472c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.e = nativeByteBuffer.readString(true);
            this.f19473f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f19470a;
        String str = this.f19473f;
        String str2 = this.e;
        int i10 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f19472c);
            outputSerializedData.writeInt32(i10);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f19471b);
        outputSerializedData.writeInt32(i10);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public z10(a20 a20Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f19474i = a20Var;
        this.f19471b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.e = tL_updateNewAuthorization.device;
        this.f19473f = tL_updateNewAuthorization.location;
    }

    public z10(a20 a20Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f19474i = a20Var;
        this.f19470a = true;
        long j10 = tL_updateNewBotConnection.bot_id;
        this.f19472c = j10;
        this.f19471b = j10;
        this.d = tL_updateNewBotConnection.date;
        this.e = tL_updateNewBotConnection.device;
        this.f19473f = tL_updateNewBotConnection.location;
    }
}
