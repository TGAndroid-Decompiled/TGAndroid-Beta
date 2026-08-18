package org.telegram.tgnet;

public final class TLRPC$TL_messageActionTodoAppendTasks$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.TodoItem.TLdeserialize(inputSerializedData, i, z);
    }
}
