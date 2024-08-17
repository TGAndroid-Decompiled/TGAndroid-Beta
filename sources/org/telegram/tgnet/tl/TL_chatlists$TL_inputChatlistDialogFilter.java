package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_chatlists$TL_inputChatlistDialogFilter extends TLObject {
    public int filter_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.filter_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-203367885);
        abstractSerializedData.writeInt32(this.filter_id);
    }
}
