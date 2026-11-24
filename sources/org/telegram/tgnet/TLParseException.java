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
        fa4.g(tLParseException, z2);
        if (i != -847714938 && i != -779361553 && i != -212046591) {
            gl.d3(new kya(tLParseException, (byte) 24));
        }
        if (!z) {
            return;
        }
        throw tLParseException;
    }

    public static void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        kk7.e().k(kk7.O5, tLParseException);
    }
}
