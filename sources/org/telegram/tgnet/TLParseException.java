package org.telegram.tgnet;
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i, boolean z) {
        TLDataSourceType tLDataSourceType;
        if (inputSerializedData != null) {
            tLDataSourceType = inputSerializedData.getDataSourceType();
        } else {
            tLDataSourceType = null;
        }
        boolean z2 = false;
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i), str, tLDataSourceType));
        if (i != -847714938) {
            z2 = true;
        }
        fc4.g(tLParseException, z2);
        if (i != -847714938 && i != -779361553 && i != -212046591) {
            gm.c3(new zcb(tLParseException, (byte) 2));
        }
        if (!z) {
            return;
        }
        throw tLParseException;
    }

    public static void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        nm7.e().k(nm7.Q5, tLParseException);
    }
}
