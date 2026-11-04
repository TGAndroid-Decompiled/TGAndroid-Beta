package org.telegram.tgnet;

import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i3, boolean z10) {
        TLDataSourceType tLDataSourceType;
        if (inputSerializedData != null) {
            tLDataSourceType = inputSerializedData.getDataSourceType();
        } else {
            tLDataSourceType = null;
        }
        boolean z11 = false;
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i3), str, tLDataSourceType));
        if (i3 != -847714938) {
            z11 = true;
        }
        a8.g(tLParseException, z11);
        if (i3 != -847714938 && i3 != -779361553 && i3 != -212046591) {
            g0.h3(new lg.n(tLParseException, 18));
        }
        if (!z10) {
            return;
        }
        throw tLParseException;
    }

    public static void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        hs.e().k(hs.M5, tLParseException);
    }
}
