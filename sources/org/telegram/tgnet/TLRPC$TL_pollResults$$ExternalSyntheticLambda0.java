package org.telegram.tgnet;

public final class TLRPC$TL_pollResults$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.PollAnswerVoters.TLdeserialize(inputSerializedData, i, z);
    }
}
