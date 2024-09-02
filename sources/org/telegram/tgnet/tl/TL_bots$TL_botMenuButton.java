package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;

public class TL_bots$TL_botMenuButton extends TL_bots$BotMenuButton {
    public String text;
    public String url;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
        this.url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-944407322);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeString(this.url);
    }
}
