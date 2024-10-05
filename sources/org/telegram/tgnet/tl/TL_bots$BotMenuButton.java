package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_bots$BotMenuButton extends TLObject {
    public static TL_bots$BotMenuButton TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_bots$BotMenuButton tL_bots$TL_botMenuButton = i != -944407322 ? i != 1113113093 ? i != 1966318984 ? null : new TL_bots$BotMenuButton() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1966318984);
            }
        } : new TL_bots$BotMenuButton() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1113113093);
            }
        } : new TL_bots$TL_botMenuButton();
        if (tL_bots$TL_botMenuButton == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BotMenuButton", Integer.valueOf(i)));
        }
        if (tL_bots$TL_botMenuButton != null) {
            tL_bots$TL_botMenuButton.readParams(abstractSerializedData, z);
        }
        return tL_bots$TL_botMenuButton;
    }
}
