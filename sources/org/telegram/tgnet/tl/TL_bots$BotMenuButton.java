package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_bots$BotMenuButton extends TLObject {
    public static TL_bots$BotMenuButton TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_bots$BotMenuButton tL_bots$TL_botMenuButton;
        if (i == -944407322) {
            tL_bots$TL_botMenuButton = new TL_bots$TL_botMenuButton();
        } else if (i != 1113113093) {
            tL_bots$TL_botMenuButton = i != 1966318984 ? null : new TL_bots$BotMenuButton() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1966318984);
                }
            };
        } else {
            tL_bots$TL_botMenuButton = new TL_bots$BotMenuButton() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1113113093);
                }
            };
        }
        if (tL_bots$TL_botMenuButton == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BotMenuButton", Integer.valueOf(i)));
        }
        if (tL_bots$TL_botMenuButton != null) {
            tL_bots$TL_botMenuButton.readParams(abstractSerializedData, z);
        }
        return tL_bots$TL_botMenuButton;
    }
}
