package org.telegram.tgnet;

import l2.a0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i7, boolean z9) {
        TLDataSourceType tLDataSourceType;
        if (inputSerializedData != null) {
            tLDataSourceType = inputSerializedData.getDataSourceType();
        } else {
            tLDataSourceType = null;
        }
        boolean z10 = false;
        TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i7), str, tLDataSourceType));
        if (i7 != -847714938) {
            z10 = true;
        }
        a8.g(tLParseException, z10);
        if (i7 != -847714938 && i7 != -779361553 && i7 != -212046591) {
            g0.h3(new a0(tLParseException, 14));
        }
        if (!z9) {
            return;
        }
        throw tLParseException;
    }

    public static void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        qs.e().k(qs.M5, tLParseException);
    }
}
