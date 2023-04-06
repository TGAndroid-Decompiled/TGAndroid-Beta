package org.telegram.tgnet;
public class TLRPC$TL_inlineBotSwitchPM extends TLObject {
    public static int constructor = 1008755359;
    public String start_param;
    public String text;

    public static TLRPC$TL_inlineBotSwitchPM TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_inlineBotSwitchPM", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_inlineBotSwitchPM tLRPC$TL_inlineBotSwitchPM = new TLRPC$TL_inlineBotSwitchPM();
        tLRPC$TL_inlineBotSwitchPM.readParams(abstractSerializedData, z);
        return tLRPC$TL_inlineBotSwitchPM;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
        this.start_param = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeString(this.start_param);
    }
}
