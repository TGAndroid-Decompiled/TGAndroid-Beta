package org.telegram.tgnet;
public class TLRPC$TL_help_dismissSuggestion extends TLObject {
    public static int constructor = -183649631;
    public TLRPC$InputPeer peer;
    public String suggestion;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.suggestion);
    }
}
