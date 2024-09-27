package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public class TL_account {

    public static class contentSettings extends TLObject {
        public static final int constructor = 1474462241;
        public int flags;
        public boolean sensitive_can_change;
        public boolean sensitive_enabled;

        public static contentSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (1474462241 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account.contentSettings", Integer.valueOf(i)));
                }
                return null;
            }
            contentSettings contentsettings = new contentSettings();
            contentsettings.readParams(abstractSerializedData, z);
            return contentsettings;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            this.flags = readInt32;
            this.sensitive_enabled = (readInt32 & 1) != 0;
            this.sensitive_can_change = (readInt32 & 2) != 0;
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1474462241);
            int i = this.sensitive_enabled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sensitive_can_change ? i | 2 : i & (-3);
            this.flags = i2;
            abstractSerializedData.writeInt32(i2);
        }
    }

    public static class getContentSettings extends TLObject {
        public static final int constructor = -1952756306;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return contentSettings.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1952756306);
        }
    }

    public static class setContentSettings extends TLObject {
        public static final int constructor = -1250643605;
        public int flags;
        public boolean sensitive_enabled;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1250643605);
            int i = this.sensitive_enabled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            abstractSerializedData.writeInt32(i);
        }
    }
}
