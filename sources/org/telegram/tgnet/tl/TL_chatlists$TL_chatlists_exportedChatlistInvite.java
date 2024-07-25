package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$DialogFilter;
public class TL_chatlists$TL_chatlists_exportedChatlistInvite extends TLObject {
    public TLRPC$DialogFilter filter;
    public TL_chatlists$TL_exportedChatlistInvite invite;

    public static TL_chatlists$TL_chatlists_exportedChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (283567014 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_chatlists_exportedChatlistInvite", Integer.valueOf(i)));
            }
            return null;
        }
        TL_chatlists$TL_chatlists_exportedChatlistInvite tL_chatlists$TL_chatlists_exportedChatlistInvite = new TL_chatlists$TL_chatlists_exportedChatlistInvite();
        tL_chatlists$TL_chatlists_exportedChatlistInvite.readParams(abstractSerializedData, z);
        return tL_chatlists$TL_chatlists_exportedChatlistInvite;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.filter = TLRPC$DialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.invite = TL_chatlists$TL_exportedChatlistInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(283567014);
        this.filter.serializeToStream(abstractSerializedData);
        this.invite.serializeToStream(abstractSerializedData);
    }
}
